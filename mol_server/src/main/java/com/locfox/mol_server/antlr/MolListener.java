// Generated from /home/illia/javaprt/mol_server/src/main/grammar/Mol.g4 by ANTLR 4.13.2
package com.locfox.mol_server.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MolParser}.
 */
public interface MolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MolParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void enterEmptyLine(MolParser.EmptyLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void exitEmptyLine(MolParser.EmptyLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MolParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MolParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#molecule}.
	 * @param ctx the parse tree
	 */
	void enterMolecule(MolParser.MoleculeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#molecule}.
	 * @param ctx the parse tree
	 */
	void exitMolecule(MolParser.MoleculeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#intMolecule}.
	 * @param ctx the parse tree
	 */
	void enterIntMolecule(MolParser.IntMoleculeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#intMolecule}.
	 * @param ctx the parse tree
	 */
	void exitIntMolecule(MolParser.IntMoleculeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#reagents}.
	 * @param ctx the parse tree
	 */
	void enterReagents(MolParser.ReagentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#reagents}.
	 * @param ctx the parse tree
	 */
	void exitReagents(MolParser.ReagentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(MolParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(MolParser.ProductsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#reaction}.
	 * @param ctx the parse tree
	 */
	void enterReaction(MolParser.ReactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#reaction}.
	 * @param ctx the parse tree
	 */
	void exitReaction(MolParser.ReactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MolParser#reactoins}.
	 * @param ctx the parse tree
	 */
	void enterReactoins(MolParser.ReactoinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MolParser#reactoins}.
	 * @param ctx the parse tree
	 */
	void exitReactoins(MolParser.ReactoinsContext ctx);
}