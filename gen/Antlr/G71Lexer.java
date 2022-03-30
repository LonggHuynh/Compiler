// Generated from C:/Users/long2/Desktop/Compiler/src/main/java/Antlr\G71.g4 by ANTLR 4.9.1
package Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class G71Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INTEGER=2, ELSE=3, FALSE=4, IF=5, THEN=6, WHILE=7, TRUE=8, 
		ASS=9, MUL=10, ADD=11, SUB=12, EQUAL=13, NEQ=14, GT=15, GTE=16, LT=17, 
		LTE=18, AND=19, OR=20, NOT=21, OUT=22, THREAD=23, GLOBAL=24, LBRACE=25, 
		LPAR=26, LBRACK=27, RBRACE=28, RPAR=29, RBRACK=30, SEMI=31, COLON=32, 
		COMMA=33, LOCK=34, UNLOCK=35, RETURN=36, ID=37, NUM=38, COMMENT=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "INTEGER", "ELSE", "FALSE", "IF", "THEN", "WHILE", "TRUE", 
			"ASS", "MUL", "ADD", "SUB", "EQUAL", "NEQ", "GT", "GTE", "LT", "LTE", 
			"AND", "OR", "NOT", "OUT", "THREAD", "GLOBAL", "LBRACE", "LPAR", "LBRACK", 
			"RBRACE", "RPAR", "RBRACK", "SEMI", "COLON", "COMMA", "LOCK", "UNLOCK", 
			"RETURN", "ID", "NUM", "LETTER", "DIGIT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'int'", "'else'", "'false'", "'if'", "'then'", "'while'", 
			"'true'", "'='", "'*'", "'+'", "'-'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'&'", "'|'", "'!'", "'out'", "'thread'", "'global'", 
			"'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "':'", "','", "'lock'", 
			"'unlock'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "INTEGER", "ELSE", "FALSE", "IF", "THEN", "WHILE", "TRUE", 
			"ASS", "MUL", "ADD", "SUB", "EQUAL", "NEQ", "GT", "GTE", "LT", "LTE", 
			"AND", "OR", "NOT", "OUT", "THREAD", "GLOBAL", "LBRACE", "LPAR", "LBRACK", 
			"RBRACE", "RPAR", "RBRACK", "SEMI", "COLON", "COMMA", "LOCK", "UNLOCK", 
			"RETURN", "ID", "NUM", "COMMENT", "WS"
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


	public G71Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "G71.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\7&\u00da\n&"+
		"\f&\16&\u00dd\13&\3\'\3\'\7\'\u00e1\n\'\f\'\16\'\u00e4\13\'\3(\3(\3)\3"+
		")\3*\3*\3*\3*\7*\u00ee\n*\f*\16*\u00f1\13*\3*\3*\3+\6+\u00f6\n+\r+\16"+
		"+\u00f7\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*\3\2\6\4\2C\\c|\3\2"+
		"\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00fd\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5_\3\2\2\2\7c\3\2\2\2\th"+
		"\3\2\2\2\13n\3\2\2\2\rq\3\2\2\2\17v\3\2\2\2\21|\3\2\2\2\23\u0081\3\2\2"+
		"\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2"+
		"\35\u008c\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2\2\2#\u0094\3\2\2\2%\u0096"+
		"\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009d\3\2\2\2-\u009f\3\2\2\2"+
		"/\u00a3\3\2\2\2\61\u00aa\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67"+
		"\u00b5\3\2\2\29\u00b7\3\2\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2"+
		"\2\2A\u00bf\3\2\2\2C\u00c1\3\2\2\2E\u00c3\3\2\2\2G\u00c8\3\2\2\2I\u00cf"+
		"\3\2\2\2K\u00d6\3\2\2\2M\u00de\3\2\2\2O\u00e5\3\2\2\2Q\u00e7\3\2\2\2S"+
		"\u00e9\3\2\2\2U\u00f5\3\2\2\2WX\7d\2\2XY\7q\2\2YZ\7q\2\2Z[\7n\2\2[\\\7"+
		"g\2\2\\]\7c\2\2]^\7p\2\2^\4\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2b\6\3\2"+
		"\2\2cd\7g\2\2de\7n\2\2ef\7u\2\2fg\7g\2\2g\b\3\2\2\2hi\7h\2\2ij\7c\2\2"+
		"jk\7n\2\2kl\7u\2\2lm\7g\2\2m\n\3\2\2\2no\7k\2\2op\7h\2\2p\f\3\2\2\2qr"+
		"\7v\2\2rs\7j\2\2st\7g\2\2tu\7p\2\2u\16\3\2\2\2vw\7y\2\2wx\7j\2\2xy\7k"+
		"\2\2yz\7n\2\2z{\7g\2\2{\20\3\2\2\2|}\7v\2\2}~\7t\2\2~\177\7w\2\2\177\u0080"+
		"\7g\2\2\u0080\22\3\2\2\2\u0081\u0082\7?\2\2\u0082\24\3\2\2\2\u0083\u0084"+
		"\7,\2\2\u0084\26\3\2\2\2\u0085\u0086\7-\2\2\u0086\30\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\32\3\2\2\2\u0089\u008a\7?\2\2\u008a\u008b\7?\2\2\u008b\34"+
		"\3\2\2\2\u008c\u008d\7#\2\2\u008d\u008e\7?\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7@\2\2\u0090 \3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0095\7>\2\2\u0095$\3\2\2\2\u0096\u0097\7>\2\2\u0097"+
		"\u0098\7?\2\2\u0098&\3\2\2\2\u0099\u009a\7(\2\2\u009a(\3\2\2\2\u009b\u009c"+
		"\7~\2\2\u009c*\3\2\2\2\u009d\u009e\7#\2\2\u009e,\3\2\2\2\u009f\u00a0\7"+
		"q\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2.\3\2\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7i\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7n\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2\64\3\2\2"+
		"\2\u00b3\u00b4\7*\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7]\2\2\u00b68\3\2\2"+
		"\2\u00b7\u00b8\7\177\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba<\3\2"+
		"\2\2\u00bb\u00bc\7_\2\2\u00bc>\3\2\2\2\u00bd\u00be\7=\2\2\u00be@\3\2\2"+
		"\2\u00bf\u00c0\7<\2\2\u00c0B\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2D\3\2\2\2"+
		"\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7m\2\2\u00c7F\3\2\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb"+
		"\7n\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7m\2\2\u00ce"+
		"H\3\2\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7w\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7p\2\2\u00d5J\3\2\2\2\u00d6"+
		"\u00db\5O(\2\u00d7\u00da\5O(\2\u00d8\u00da\5Q)\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dcL\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5Q)\2\u00df\u00e1"+
		"\5Q)\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3N\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\2\2\2"+
		"\u00e6P\3\2\2\2\u00e7\u00e8\t\3\2\2\u00e8R\3\2\2\2\u00e9\u00ea\7\61\2"+
		"\2\u00ea\u00eb\7\61\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\n\4\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b*\2\2\u00f3"+
		"T\3\2\2\2\u00f4\u00f6\t\5\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\b+\2\2\u00faV\3\2\2\2\b\2\u00d9\u00db\u00e2\u00ef\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}