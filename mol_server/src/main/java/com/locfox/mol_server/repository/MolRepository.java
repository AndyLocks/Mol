package com.locfox.mol_server.repository;

import com.locfox.mol_server.entity.Atoms;
import com.locfox.mol_server.entity.Molecule;
import com.locfox.mol_server.entity.neo4j.MoleculeNode;
import com.locfox.mol_server.entity.neo4j.ReactionNode;
import com.locfox.mol_server.service.MolLanguageService;
import com.locfox.mol_server.service.ReactionEdge;
import org.jgrapht.Graph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.neo4j.driver.Value;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Supplier;

@Repository
public class MolRepository {

    private MoleculeRepository moleculeRepository;
    private ReactionRepository reactionRepository;
    private MolLanguageService molLanguageService;
    private Neo4jClient neo4jClient;

    @Autowired
    public MolRepository(MoleculeRepository moleculeRepository, ReactionRepository reactionRepository, MolLanguageService molLanguageService, Neo4jClient neo4jClient) {
        this.moleculeRepository = moleculeRepository;
        this.reactionRepository = reactionRepository;
        this.molLanguageService = molLanguageService;
        this.neo4jClient = neo4jClient;
    }

    public Optional<ReactionNode> findOneReactionById(String id) {
        return reactionRepository.findOneById(id);
    }

    public Optional<MoleculeNode> findOneMoleculeByName(String name) {
        return moleculeRepository.findOneByName(name);
    }

    public MoleculeNode getOrCreateMoleculeByName(String name) {
        return moleculeRepository.getOrCreateByName(name);
    }

    public ReactionNode saveReaction(ReactionNode reactionNode) {
        return reactionRepository.save(reactionNode);
    }

    public void save(Graph<Set<Molecule>, ReactionEdge> graph) {
        graph.edgeSet().forEach(e -> {
            var reagents = e.reagents().stream()
                    .map(m -> getOrCreateMoleculeByName(m.name()))
                    .toArray(MoleculeNode[]::new);

            var product = getOrCreateMoleculeByName(e.product().name());

            var reaction = ReactionNode.from(product, reagents);

            saveReaction(reaction);
        });
    }

    public void save(String molLanguage) {
        save(molLanguageService.convertToGraph(molLanguage));
    }

    public Collection<ReactionNode> findAllProducts(List<Molecule> molecules) {
        var query = """
                WITH $molecules AS inputMoleculeNames
                MATCH (m:Molecule)-[:REAGENT]->(r:Reaction)
                WHERE m.name IN inputMoleculeNames
                WITH r, collect(DISTINCT m.name) AS foundNames, inputMoleculeNames
                WHERE all(name IN inputMoleculeNames WHERE name IN foundNames)
                OPTIONAL MATCH (reagent:Molecule)-[:REAGENT]->(r)
                OPTIONAL MATCH (r)-[:PRODUCT]->(product:Molecule)
                RETURN DISTINCT r.id AS id, collect(DISTINCT reagent) AS reagents, collect(DISTINCT product) AS product
                """;

        return neo4jClient.query(query)
                .bind(molecules.stream().map(Molecule::name).toList()).to("molecules")
                .fetchAs(ReactionNode.class)
                .mappedBy((typeSystem, record) -> {
                    return new ReactionNode(
                            record.get("id").asString(),
                            mapToCollection(record.get("reagents"), HashSet::new),
                            mapToCollection(record.get("product"), ArrayList::new).get(0)
                    );
                }).all();
    }

    public Collection<ReactionNode> findAllReagents(Molecule molecule) {
        var query = """
                    MATCH (m:Molecule)<-[:PRODUCT]-(r:Reaction)<-[:REAGENT]-(reagent:Molecule)
                    WHERE m.name = $name
                    OPTIONAL MATCH (r)-[:PRODUCT]->(product:Molecule)
                    RETURN DISTINCT r.id as id, collect(DISTINCT reagent) AS reagents, collect(DISTINCT product) AS product
                """;

        return neo4jClient.query(query)
                .bind(molecule.name()).to("name")
                .fetchAs(ReactionNode.class)
                .mappedBy((typeSystem, record) -> {
                    return new ReactionNode(
                            record.get("id").asString(),
                            mapToCollection(record.get("reagents"), HashSet::new),
                            mapToCollection(record.get("product"), ArrayList::new).get(0)
                    );
                }).all();
    }

    private <U extends Collection<MoleculeNode>> U mapToCollection(Value value, Supplier<U> supplier) {
        var result = supplier.get();

        for (var v : value.values()) {
            result.add(mapMolecule(v));
        }

        return result;
    }

    private MoleculeNode mapMolecule(Value value) {
        var node = value.asNode();

        var id = node.get("id").asString(null);
        var name = node.get("name").asString(null);
        var atoms = node.get("atoms").asList(Value::asString).stream()
                .map(Atoms::valueOf).toList();

        return new MoleculeNode(id, name, atoms);
    }

}
