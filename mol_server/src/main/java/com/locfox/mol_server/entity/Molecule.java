package com.locfox.mol_server.entity;

import com.locfox.mol_server.service.MolLanguageService;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public record Molecule(String name, List<Atoms> atoms) {

    public static Molecule of(final String name) {
        return new Molecule(name, MolLanguageService.instance().moleculeToAtoms(name));
    }

    public static List<Molecule> of(final List<String> names) {
        return names.stream().map(Molecule::of).toList();
    }

    public static Map<Atoms, Integer> listToMap(List<Atoms> atoms) {
        return atoms.stream()
                .collect(Collectors.groupingBy(Function.identity(), () -> new EnumMap<>(Atoms.class), Collectors.reducing(0, e -> 1, Integer::sum)));
    }

    public static Molecule of(final String name, List<Atoms> atoms) {
        return new Molecule(name, atoms);
    }

    public Molecule(final String name, List<Atoms> atoms) {
        this.name = name.replace("_", "");
        this.atoms = atoms;
    }

    public Set<Molecule> toSet() {
        return new HashSet<>(List.of(this));
    }

    public Map<Atoms, Integer> atomsMap() {
        return listToMap(this.atoms());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Molecule molecule = (Molecule) o;

        return Objects.equals(name, molecule.name) && Objects.equals(atoms, molecule.atoms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, atoms);
    }

    @Override
    public String toString() {
        return name;
    }

}
