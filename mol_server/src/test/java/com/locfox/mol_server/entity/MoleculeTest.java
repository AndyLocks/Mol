package com.locfox.mol_server.entity;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BiPredicate;

import static org.junit.jupiter.api.Assertions.*;

class MoleculeTest {

    private static List<Molecule> identicalMolecules = List.of(
            Molecule.of("A1bo3ba45"),
            Molecule.of("a1________Bo3ba45"),
            Molecule.of("a1bO3ba45"),
            Molecule.of("a1bo3_Ba45"),
            Molecule.of("a1bo3bA45"),
            Molecule.of("A1Bo___3ba45"),
            Molecule.of("A1bO3ba45"),
            Molecule.of("A1bo3Ba45"),
            Molecule.of("_A1bo3bA45"),
            Molecule.of("A1Bo3ba45"),
            Molecule.of("a__1Bo3ba45"),
            Molecule.of("a1Bo3ba45"),
            Molecule.of("a1Bo3ba45__"),
            Molecule.of("a1Bo3b_a45"),
            Molecule.of("a1Bo3ba45")
    );

    @Test
    public void equalsTest() {
        traverseArray(Molecule::equals);
    }

    @Test
    public void hashCodeTest() {
        traverseArray((m1, m2) -> m1.hashCode() == m2.hashCode());
    }

    private void traverseArray(BiPredicate<Molecule, Molecule> predicate) {
        for (var m1: identicalMolecules) {
            for (var m2: identicalMolecules) {
                assertTrue(predicate.test(m1, m2));
            }
        }
    }

}