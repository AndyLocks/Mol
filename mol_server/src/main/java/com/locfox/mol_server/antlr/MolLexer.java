// Generated from /home/illia/javaprt/mol_server/src/main/grammar/Mol.g4 by ANTLR 4.13.2
package com.locfox.mol_server.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, LINE_COMMENT=3, COMMENT=4, EMPTY_LINE=5, DOUBLE=6, INT=7, 
		LP=8, RP=9, COMMA=10, ARROW=11, SEMI=12, NEWLINE=13, PLUS=14, BIG_LETTER=15, 
		SMALL_LETTER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "LINE_COMMENT", "COMMENT", "EMPTY_LINE", "DOUBLE", "INT", 
			"LP", "RP", "COMMA", "ARROW", "SEMI", "NEWLINE", "PLUS", "BIG_LETTER", 
			"SMALL_LETTER", "DECIMAL_DIGIT"
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


	public MolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010x\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00021\b\u0002"+
		"\n\u0002\f\u00024\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003?\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001\u0004\u0003\u0004"+
		"M\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005R\b\u0005\u000b"+
		"\u0005\f\u0005S\u0001\u0005\u0001\u0005\u0004\u0005X\b\u0005\u000b\u0005"+
		"\f\u0005Y\u0001\u0006\u0004\u0006]\b\u0006\u000b\u0006\f\u0006^\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0003\fm\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001=\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000\u0001\u0000"+
		"\u0006\u0004\u0000\t\t\f\r  __\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001"+
		"\u0000AZ\u0001\u0000az\u0001\u000009\u007f\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003&\u0001"+
		"\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000"+
		"\u0000\tH\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\r\\\u0001"+
		"\u0000\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000"+
		"\u0000\u0013d\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017"+
		"i\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001bp\u0001"+
		"\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001ft\u0001\u0000\u0000"+
		"\u0000!v\u0001\u0000\u0000\u0000#$\u0005_\u0000\u0000$\u0002\u0001\u0000"+
		"\u0000\u0000%\'\u0007\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0006\u0001\u0000\u0000+\u0004\u0001\u0000"+
		"\u0000\u0000,-\u0005/\u0000\u0000-.\u0005/\u0000\u0000.2\u0001\u0000\u0000"+
		"\u0000/1\b\u0001\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0006\u0002\u0001\u00006\u0006"+
		"\u0001\u0000\u0000\u000078\u0005/\u0000\u000089\u0005*\u0000\u00009=\u0001"+
		"\u0000\u0000\u0000:<\t\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005*\u0000\u0000"+
		"AB\u0005/\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0003\u0001\u0000"+
		"D\b\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0005"+
		"\r\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0005\n\u0000\u0000O\n\u0001\u0000\u0000\u0000PR"+
		"\u0003!\u0010\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0005.\u0000\u0000VX\u0003!\u0010\u0000WV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\f\u0001\u0000\u0000\u0000[]\u0003!\u0010\u0000\\[\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005(\u0000\u0000"+
		"a\u0010\u0001\u0000\u0000\u0000bc\u0005)\u0000\u0000c\u0012\u0001\u0000"+
		"\u0000\u0000de\u0005,\u0000\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005"+
		"-\u0000\u0000gh\u0005>\u0000\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005"+
		";\u0000\u0000j\u0018\u0001\u0000\u0000\u0000km\u0005\r\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0005\n\u0000\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005+\u0000\u0000"+
		"q\u001c\u0001\u0000\u0000\u0000rs\u0007\u0003\u0000\u0000s\u001e\u0001"+
		"\u0000\u0000\u0000tu\u0007\u0004\u0000\u0000u \u0001\u0000\u0000\u0000"+
		"vw\u0007\u0005\u0000\u0000w\"\u0001\u0000\u0000\u0000\n\u0000(2=HLSY^"+
		"l\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}