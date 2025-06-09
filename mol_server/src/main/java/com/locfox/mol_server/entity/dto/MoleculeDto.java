package com.locfox.mol_server.entity.dto;

import com.locfox.mol_server.entity.Molecule;
import com.locfox.mol_server.entity.neo4j.MoleculeNode;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public record MoleculeDto(String name) {

    public static MoleculeDto from(Molecule molecule) {
        return new MoleculeDto(molecule.name());
    }

    public static MoleculeDto from(MoleculeNode molecule) {
        return new MoleculeDto(molecule.getName());
    }

    public static <U> MoleculeDto from(U object, Function<U, MoleculeDto> function) {
        return function.apply(object);
    }

    public static <U> List<MoleculeDto> from(Collection<U> molecules, Function<U, MoleculeDto> function) {
        return molecules.stream()
                .map(function)
                .toList();
    }

    public Molecule toMolecule() {
        return Molecule.of(name);
    }

    public MoleculeNode toMoleculeNode() {
        return MoleculeNode.from(toMolecule());
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }

}
