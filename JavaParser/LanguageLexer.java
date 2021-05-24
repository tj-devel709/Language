// Generated from Language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WORD=25, EMPTY=26, NEGATIVE=27, NOT=28, INT=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "WORD", 
			"EMPTY", "NEGATIVE", "NOT", "INT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'('", "')'", "','", "'begin'", "'end'", "'if'", "'then begin'", 
			"'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'else begin'", "'return'", 
			"'var'", "'<-'", "'*'", "'/'", "'+'", "'and'", "'or'", "'^'", null, "';'", 
			"'-'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WORD", "EMPTY", "NEGATIVE", "NOT", "INT", "WHITESPACE"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00b0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u009c"+
		"\n\32\r\32\16\32\u009d\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\6"+
		"\36\u00a9\n\36\r\36\16\36\u00aa\3\37\3\37\3\37\3\37\2\2 \3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\4\5\2"+
		"\62;C\\c|\3\2\62;\2\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5D\3\2\2\2\7F\3\2"+
		"\2\2\tH\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17T\3\2\2\2\21W\3\2\2\2\23b\3\2"+
		"\2\2\25e\3\2\2\2\27g\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37r\3"+
		"\2\2\2!}\3\2\2\2#\u0084\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u008d"+
		"\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0095\3\2\2\2\61\u0098\3\2\2\2"+
		"\63\u009b\3\2\2\2\65\u009f\3\2\2\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a8"+
		"\3\2\2\2=\u00ac\3\2\2\2?@\7h\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2C\4\3\2\2\2"+
		"DE\7*\2\2E\6\3\2\2\2FG\7+\2\2G\b\3\2\2\2HI\7.\2\2I\n\3\2\2\2JK\7d\2\2"+
		"KL\7g\2\2LM\7i\2\2MN\7k\2\2NO\7p\2\2O\f\3\2\2\2PQ\7g\2\2QR\7p\2\2RS\7"+
		"f\2\2S\16\3\2\2\2TU\7k\2\2UV\7h\2\2V\20\3\2\2\2WX\7v\2\2XY\7j\2\2YZ\7"+
		"g\2\2Z[\7p\2\2[\\\7\"\2\2\\]\7d\2\2]^\7g\2\2^_\7i\2\2_`\7k\2\2`a\7p\2"+
		"\2a\22\3\2\2\2bc\7>\2\2cd\7?\2\2d\24\3\2\2\2ef\7>\2\2f\26\3\2\2\2gh\7"+
		"@\2\2hi\7?\2\2i\30\3\2\2\2jk\7@\2\2k\32\3\2\2\2lm\7?\2\2mn\7?\2\2n\34"+
		"\3\2\2\2op\7#\2\2pq\7?\2\2q\36\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7"+
		"g\2\2vw\7\"\2\2wx\7d\2\2xy\7g\2\2yz\7i\2\2z{\7k\2\2{|\7p\2\2| \3\2\2\2"+
		"}~\7t\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081\7w\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7p\2\2\u0083\"\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7t\2\2\u0087$\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a"+
		"\7/\2\2\u008a&\3\2\2\2\u008b\u008c\7,\2\2\u008c(\3\2\2\2\u008d\u008e\7"+
		"\61\2\2\u008e*\3\2\2\2\u008f\u0090\7-\2\2\u0090,\3\2\2\2\u0091\u0092\7"+
		"c\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094.\3\2\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7t\2\2\u0097\60\3\2\2\2\u0098\u0099\7`\2\2\u0099\62"+
		"\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\64\3\2\2\2\u009f\u00a0\7=\2\2"+
		"\u00a0\66\3\2\2\2\u00a1\u00a2\7/\2\2\u00a28\3\2\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7v\2\2\u00a6:\3\2\2\2\u00a7\u00a9\t\3"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\b\37\2\2\u00af>\3\2\2\2\5\2\u009d\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}