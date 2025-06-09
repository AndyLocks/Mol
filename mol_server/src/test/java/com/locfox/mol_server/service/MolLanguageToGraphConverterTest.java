package com.locfox.mol_server.service;

import com.locfox.mol_server.entity.Molecule;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MolLanguageToGraphConverterTest {

    private final static MolLanguageService converter = new MolLanguageService();
    private final static String text = """
            CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl
            NaOH + HCl -> H2O
            
            (2H2O2) -> 2H2O + O2
            
            
            (Zn, HCl) -> ZnCl_2
            """;

    @Test
    public void test() {
        var graph = new DefaultDirectedGraph<Set<Molecule>, ReactionEdge>(ReactionEdge.class);

        graph.addVertex(Set.of(Molecule.of("CH3"), Molecule.of("O2")));
        graph.addVertex(Molecule.of("CO2").toSet());
        graph.addVertex(Molecule.of("H2O").toSet());
        graph.addEdge(Set.of(Molecule.of("CH3"), Molecule.of("O_2")), Molecule.of("CO2").toSet());
        graph.addEdge(Set.of(Molecule.of("CH3"), Molecule.of("O_2")), Molecule.of("H_2O").toSet());

        graph.addVertex(Set.of(Molecule.of("NaOH"), Molecule.of("HCl")));
        graph.addVertex(Molecule.of("NaCl").toSet());
        graph.addEdge(Set.of(Molecule.of("NaOH"), Molecule.of("HCl")), Molecule.of("NaCl").toSet());

        graph.addVertex(Set.of(Molecule.of("NaOH"), Molecule.of("HCl")));
        graph.addVertex(Molecule.of("H2O").toSet());
        graph.addEdge(Set.of(Molecule.of("NaOH"), Molecule.of("HCl")), Molecule.of("H2_O").toSet());

        graph.addVertex(Molecule.of("H__2O_2").toSet());
        graph.addVertex(Molecule.of("H_2O").toSet());
        graph.addVertex(Molecule.of("O2").toSet());
        graph.addEdge(Molecule.of("H__2O_2").toSet(), Molecule.of("H_2o").toSet());
        graph.addEdge(Molecule.of("H__2O_2").toSet(), Molecule.of("O2").toSet());

        graph.addVertex(Set.of(Molecule.of("Zn"), Molecule.of("HCl")));
        graph.addVertex(Molecule.of("ZnCl_2").toSet());
        graph.addEdge(Set.of(Molecule.of("Zn"), Molecule.of("HCl")), Molecule.of("ZnCl_2").toSet());

        System.out.println(converter.convertToGraph(text).vertexSet());
        System.out.println(converter.convertToGraph(text).edgeSet());
        assertEquals(graph, converter.convertToGraph(text));
    }

}