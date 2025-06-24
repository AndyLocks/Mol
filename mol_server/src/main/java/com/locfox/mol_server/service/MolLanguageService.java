package com.locfox.mol_server.service;

import com.locfox.mol_server.antlr.MolBaseListener;
import com.locfox.mol_server.antlr.MolLexer;
import com.locfox.mol_server.antlr.MolParser;
import com.locfox.mol_server.entity.Atoms;
import com.locfox.mol_server.entity.Molecule;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MolLanguageService {

    public static MolLanguageService instance() {
        return new MolLanguageService();
    }

    static class MolGraphListener extends MolBaseListener {

        private final Graph<Set<Molecule>, ReactionEdge> graph = new DefaultDirectedGraph<Set<Molecule>, ReactionEdge>(ReactionEdge.class);

        @Override
        public void enterReaction(MolParser.ReactionContext ctx) {
            var reagents = ctx.reagents().intMolecule().stream()
                    .map(m -> Molecule.of(m.molecule().getText()))
                    .collect(Collectors.toSet());

            var products = ctx.products().intMolecule().stream()
                    .map(m -> Molecule.of(m.molecule().getText()).toSet())
                    .toList();

            graph.addVertex(reagents);
            products.forEach(graph::addVertex);
            products.forEach(p -> graph.addEdge(reagents, p));
        }

        public Graph<Set<Molecule>, ReactionEdge> toGraph() {
            return this.graph;
        }

    }

    static class MolMoleculeListener extends MolBaseListener {

        private final List<Atoms> atoms = new ArrayList<>();
        private Atoms lastAtom = null;

        @Override
        public void enterMolecule(MolParser.MoleculeContext ctx) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                var child = ctx.getChild(i);

                switch (child) {
                    case MolParser.AtomContext atomContext -> {
                        var atom = Atoms.valueOf(atomContext.getText());
                        lastAtom = atom;
                        atoms.add(atom);
                    }
                    case TerminalNode tn -> {
                        if (tn.getText().equals("_")) continue;

                        var count = Integer.parseInt(tn.getText());
                        for (int j = 1; j < count; j++) {
                            atoms.add(lastAtom);
                        }
                    }
                    case null, default -> throw new RuntimeException("Child cannot be null");
                }
            }
        }

        public List<Atoms> toList() {
            return this.atoms;
        }

        public Map<Atoms, Integer> toMap() {
            return this.atoms.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));
        }

    }

    public Graph<Set<Molecule>, ReactionEdge> convertToGraph(CharStream charStream) {
        var listener = new MolGraphListener();
        ParseTreeWalker.DEFAULT
                .walk(listener, new MolParser(new CommonTokenStream(new MolLexer(charStream))).reactoins());

        return listener.toGraph();
    }

    public Graph<Set<Molecule>, ReactionEdge> convertToGraph(String s) {
        return convertToGraph(CharStreams.fromString(s));
    }

    public Graph<Set<Molecule>, ReactionEdge> convertToGraph(InputStream inputStream) throws IOException {
        return convertToGraph(CharStreams.fromStream(inputStream));
    }

    public List<Atoms> moleculeToAtoms(String string) {
        return moleculeToAtoms(CharStreams.fromString(string));
    }

    public Map<Atoms, Integer> moleculeToAtomsMap(String string) {
        return moleculeToAtomsMap(CharStreams.fromString(string));
    }

    public Map<Atoms, Integer> moleculeToAtomsMap(CharStream charStream) {
        var listener = new MolMoleculeListener();
        ParseTreeWalker.DEFAULT
                .walk(listener, new MolParser(new CommonTokenStream(new MolLexer(charStream))).molecule());

        return listener.toMap();
    }

    public List<Atoms> moleculeToAtoms(CharStream charStream) {
        var listener = new MolMoleculeListener();
        ParseTreeWalker.DEFAULT
                .walk(listener, new MolParser(new CommonTokenStream(new MolLexer(charStream))).molecule());

        return listener.toList();
    }

}

