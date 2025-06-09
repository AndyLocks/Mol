// Generated from /home/illia/javaprt/mol_server/src/main/grammar/Mol.g4 by ANTLR 4.13.2
package com.locfox.mol_server.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, LINE_COMMENT=3, COMMENT=4, EMPTY_LINE=5, DOUBLE=6, INT=7, 
		LP=8, RP=9, COMMA=10, ARROW=11, SEMI=12, NEWLINE=13, PLUS=14, BIG_LETTER=15, 
		SMALL_LETTER=16;
	public static final int
		RULE_emptyLine = 0, RULE_atom = 1, RULE_molecule = 2, RULE_intMolecule = 3, 
		RULE_reagents = 4, RULE_products = 5, RULE_reaction = 6, RULE_reactoins = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"emptyLine", "atom", "molecule", "intMolecule", "reagents", "products", 
			"reaction", "reactoins"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", null, null, null, null, null, null, "'('", "')'", "','", 
			"'->'", "';'", null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "LINE_COMMENT", "COMMENT", "EMPTY_LINE", "DOUBLE", 
			"INT", "LP", "RP", "COMMA", "ARROW", "SEMI", "NEWLINE", "PLUS", "BIG_LETTER", 
			"SMALL_LETTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyLineContext extends ParserRuleContext {
		public TerminalNode EMPTY_LINE() { return getToken(MolParser.EMPTY_LINE, 0); }
		public EmptyLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterEmptyLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitEmptyLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitEmptyLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyLineContext emptyLine() throws RecognitionException {
		EmptyLineContext _localctx = new EmptyLineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_emptyLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(EMPTY_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode BIG_LETTER() { return getToken(MolParser.BIG_LETTER, 0); }
		public List<TerminalNode> SMALL_LETTER() { return getTokens(MolParser.SMALL_LETTER); }
		public TerminalNode SMALL_LETTER(int i) {
			return getToken(MolParser.SMALL_LETTER, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(BIG_LETTER);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SMALL_LETTER) {
				{
				{
				setState(19);
				match(SMALL_LETTER);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoleculeContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(MolParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MolParser.INT, i);
		}
		public MoleculeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_molecule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterMolecule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitMolecule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitMolecule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoleculeContext molecule() throws RecognitionException {
		MoleculeContext _localctx = new MoleculeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_molecule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			atom();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32898L) != 0)) {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIG_LETTER:
					{
					setState(26);
					atom();
					}
					break;
				case T__0:
					{
					setState(27);
					match(T__0);
					}
					break;
				case INT:
					{
					setState(28);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntMoleculeContext extends ParserRuleContext {
		public MoleculeContext molecule() {
			return getRuleContext(MoleculeContext.class,0);
		}
		public TerminalNode INT() { return getToken(MolParser.INT, 0); }
		public IntMoleculeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intMolecule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterIntMolecule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitIntMolecule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitIntMolecule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntMoleculeContext intMolecule() throws RecognitionException {
		IntMoleculeContext _localctx = new IntMoleculeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intMolecule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(34);
				match(INT);
				}
			}

			setState(37);
			molecule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReagentsContext extends ParserRuleContext {
		public List<IntMoleculeContext> intMolecule() {
			return getRuleContexts(IntMoleculeContext.class);
		}
		public IntMoleculeContext intMolecule(int i) {
			return getRuleContext(IntMoleculeContext.class,i);
		}
		public TerminalNode LP() { return getToken(MolParser.LP, 0); }
		public TerminalNode RP() { return getToken(MolParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MolParser.COMMA, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MolParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MolParser.PLUS, i);
		}
		public ReagentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reagents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterReagents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitReagents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitReagents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReagentsContext reagents() throws RecognitionException {
		ReagentsContext _localctx = new ReagentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reagents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(39);
				match(LP);
				}
			}

			setState(42);
			intMolecule();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==PLUS) {
				{
				{
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				intMolecule();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP) {
				{
				setState(50);
				match(RP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductsContext extends ParserRuleContext {
		public List<IntMoleculeContext> intMolecule() {
			return getRuleContexts(IntMoleculeContext.class);
		}
		public IntMoleculeContext intMolecule(int i) {
			return getRuleContext(IntMoleculeContext.class,i);
		}
		public TerminalNode LP() { return getToken(MolParser.LP, 0); }
		public TerminalNode RP() { return getToken(MolParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MolParser.COMMA, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MolParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MolParser.PLUS, i);
		}
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitProducts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitProducts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_products);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(53);
				match(LP);
				}
			}

			setState(56);
			intMolecule();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==PLUS) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				intMolecule();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP) {
				{
				setState(64);
				match(RP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReactionContext extends ParserRuleContext {
		public ReagentsContext reagents() {
			return getRuleContext(ReagentsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(MolParser.ARROW, 0); }
		public ProductsContext products() {
			return getRuleContext(ProductsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MolParser.SEMI, 0); }
		public TerminalNode NEWLINE() { return getToken(MolParser.NEWLINE, 0); }
		public ReactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterReaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitReaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitReaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactionContext reaction() throws RecognitionException {
		ReactionContext _localctx = new ReactionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			reagents();
			setState(68);
			match(ARROW);
			setState(69);
			products();
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReactoinsContext extends ParserRuleContext {
		public List<ReactionContext> reaction() {
			return getRuleContexts(ReactionContext.class);
		}
		public ReactionContext reaction(int i) {
			return getRuleContext(ReactionContext.class,i);
		}
		public ReactoinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactoins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).enterReactoins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MolListener ) ((MolListener)listener).exitReactoins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MolVisitor ) return ((MolVisitor<? extends T>)visitor).visitReactoins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactoinsContext reactoins() throws RecognitionException {
		ReactoinsContext _localctx = new ReactoinsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reactoins);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33152L) != 0)) {
				{
				{
				setState(72);
				reaction();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010O\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0003"+
		"\u0003\u0003$\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004"+
		")\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004.\b\u0004\n\u0004"+
		"\f\u00041\t\u0004\u0001\u0004\u0003\u00044\b\u0004\u0001\u0005\u0003\u0005"+
		"7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005<\b\u0005\n\u0005"+
		"\f\u0005?\t\u0005\u0001\u0005\u0003\u0005B\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007J\b\u0007"+
		"\n\u0007\f\u0007M\t\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0002\u0002\u0000\n\n\u000e\u000e\u0001\u0000"+
		"\f\rR\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000"+
		"\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000"+
		"\b(\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\fC\u0001\u0000"+
		"\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0005\u0000"+
		"\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0016\u0005\u000f\u0000"+
		"\u0000\u0013\u0015\u0005\u0010\u0000\u0000\u0014\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001f\u0003\u0002\u0001"+
		"\u0000\u001a\u001e\u0003\u0002\u0001\u0000\u001b\u001e\u0005\u0001\u0000"+
		"\u0000\u001c\u001e\u0005\u0007\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000\"$\u0005\u0007\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0003\u0004"+
		"\u0002\u0000&\u0007\u0001\u0000\u0000\u0000\')\u0005\b\u0000\u0000(\'"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*/\u0003\u0006\u0003\u0000+,\u0007\u0000\u0000\u0000,.\u0003\u0006"+
		"\u0003\u0000-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000024\u0005\t\u0000\u000032\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\t\u0001\u0000\u0000\u000057\u0005\b\u0000"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008=\u0003\u0006\u0003\u00009:\u0007\u0000\u0000\u0000:<\u0003"+
		"\u0006\u0003\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@B\u0005\t\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0003"+
		"\b\u0004\u0000DE\u0005\u000b\u0000\u0000EF\u0003\n\u0005\u0000FG\u0007"+
		"\u0001\u0000\u0000G\r\u0001\u0000\u0000\u0000HJ\u0003\f\u0006\u0000IH"+
		"\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u000f\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000\u000b\u0016\u001d\u001f#(/36=AK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}