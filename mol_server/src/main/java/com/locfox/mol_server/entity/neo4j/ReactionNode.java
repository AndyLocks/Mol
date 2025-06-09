package com.locfox.mol_server.entity.neo4j;

import com.locfox.mol_server.entity.Molecule;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.*;
import java.util.stream.Stream;

@Node("Reaction")
public class ReactionNode {

    @Id
    private String id;

    @Relationship(type = "REAGENT", direction = Relationship.Direction.INCOMING)
    private Set<MoleculeNode> reagents = new HashSet<>();

    @Relationship(type = "PRODUCT", direction = Relationship.Direction.OUTGOING)
    private MoleculeNode product;

    public ReactionNode(String id, Set<MoleculeNode> reagents, MoleculeNode product) {
        this.id = id;
        this.reagents = reagents;
        this.product = product;
    }

    public static ReactionNode from(Molecule product, Molecule... reagents) {
        return from(MoleculeNode.from(product), Stream.of(reagents)
                .map(MoleculeNode::from)
                .toList());
    }

    public static ReactionNode from(MoleculeNode product, MoleculeNode... reagents) {
        return from(product, List.of(reagents));
    }

    public static ReactionNode from(MoleculeNode product, Collection<MoleculeNode> reagents) {
        return new ReactionNode(UUID.randomUUID().toString(), new HashSet<>(reagents), product);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<MoleculeNode> getReagents() {
        return reagents;
    }

    public void setReagents(Set<MoleculeNode> reagents) {
        this.reagents = reagents;
    }

    public MoleculeNode getProduct() {
        return product;
    }

    public void setProduct(MoleculeNode product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReactionNode that = (ReactionNode) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return reagents + " -> " + product;
    }

}
