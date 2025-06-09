// Generated from /home/illia/javaprt/mol_server/src/main/grammar/Mol.g4 by ANTLR 4.13.2
package com.locfox.mol_server.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MolParser#emptyLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyLine(MolParser.EmptyLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MolParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#molecule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMolecule(MolParser.MoleculeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#intMolecule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMolecule(MolParser.IntMoleculeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#reagents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReagents(MolParser.ReagentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#products}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts(MolParser.ProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#reaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReaction(MolParser.ReactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MolParser#reactoins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactoins(MolParser.ReactoinsContext ctx);
}