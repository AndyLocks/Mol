package com.locfox.mol_server.repository;

import com.locfox.mol_server.entity.Molecule;
import com.locfox.mol_server.entity.neo4j.MoleculeNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface MoleculeRepository extends Neo4jRepository<MoleculeNode, String> {

    Optional<MoleculeNode> findOneByName(String name);

    default MoleculeNode getOrCreateByName(String name) {
        var m = findOneByName(name);
        if (m.isEmpty()) {
            var node = MoleculeNode.from(Molecule.of(name));
            save(node);
            return node;
        }

        return m.get();
    }

}
