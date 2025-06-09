package com.locfox.mol_server.entity.neo4j;

import com.locfox.mol_server.entity.Atoms;
import com.locfox.mol_server.entity.Molecule;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;
import java.util.UUID;

@Node("Molecule")
public class MoleculeNode {

    @Id
    private String id;
    private String name;
    private List<Atoms> atoms;

    public static MoleculeNode from(Molecule molecule) {
        return new MoleculeNode(UUID.randomUUID().toString(), molecule.name(), molecule.atoms());
    }

    public MoleculeNode(String id, String name, List<Atoms> atoms) {
        this.id = id;
        this.name = name;
        this.atoms = atoms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Atoms> getAtoms() {
        return atoms;
    }

    public void setAtoms(List<Atoms> atoms) {
        this.atoms = atoms;
    }

    @Override
    public String toString() {
        return name;
    }

}
