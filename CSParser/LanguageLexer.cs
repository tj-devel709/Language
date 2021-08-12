//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Language.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public partial class LanguageLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, WORD=28, NEGATIVE=29, NOT=30, INT=31, WHITESPACE=32, 
		LINE_COMMENT=33, BLOCK_COMMENT=34;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "WORD", "NEGATIVE", "NOT", "INT", "WHITESPACE", "LINE_COMMENT", 
		"BLOCK_COMMENT"
	};


	public LanguageLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public LanguageLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'func'", "'('", "')'", "','", "'begin'", "'end'", "';'", "'if'", 
		"'then begin'", "'else begin'", "'return'", "'var'", "'<-'", "'*'", "'/'", 
		"'+'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'and'", "'or'", 
		"'^'", "'&&'", "'||'", null, "'-'", "'not'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "WORD", "NEGATIVE", "NOT", "INT", "WHITESPACE", 
		"LINE_COMMENT", "BLOCK_COMMENT"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Language.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static LanguageLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '$', '\xD8', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', 
		'\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', 
		'\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', 
		'\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', 
		'\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', 
		'\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', 
		'\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', 
		'\x3', '\v', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', 
		'\f', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\r', 
		'\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', 
		'\xF', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', 
		'\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', 
		'\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', '\x3', '\x17', '\x3', 
		'\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', 
		'\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', 
		'\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', 
		'\x1C', '\x3', '\x1D', '\x3', '\x1D', '\x6', '\x1D', '\xAD', '\n', '\x1D', 
		'\r', '\x1D', '\xE', '\x1D', '\xAE', '\x3', '\x1E', '\x3', '\x1E', '\x3', 
		'\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x6', 
		' ', '\xB8', '\n', ' ', '\r', ' ', '\xE', ' ', '\xB9', '\x3', '!', '\x3', 
		'!', '\x3', '!', '\x3', '!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', 
		'\"', '\a', '\"', '\xC4', '\n', '\"', '\f', '\"', '\xE', '\"', '\xC7', 
		'\v', '\"', '\x3', '\"', '\x3', '\"', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '#', '\a', '#', '\xCF', '\n', '#', '\f', '#', '\xE', '#', '\xD2', 
		'\v', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '\xD0', '\x2', '$', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', 
		'\x6', '\v', '\a', '\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', 
		'\x15', '\f', '\x17', '\r', '\x19', '\xE', '\x1B', '\xF', '\x1D', '\x10', 
		'\x1F', '\x11', '!', '\x12', '#', '\x13', '%', '\x14', '\'', '\x15', ')', 
		'\x16', '+', '\x17', '-', '\x18', '/', '\x19', '\x31', '\x1A', '\x33', 
		'\x1B', '\x35', '\x1C', '\x37', '\x1D', '\x39', '\x1E', ';', '\x1F', '=', 
		' ', '?', '!', '\x41', '\"', '\x43', '#', '\x45', '$', '\x3', '\x2', '\a', 
		'\x4', '\x2', '\x43', '\\', '\x63', '|', '\x5', '\x2', '\x32', ';', '\x43', 
		'\\', '\x63', '|', '\x3', '\x2', '\x32', ';', '\x4', '\x2', '\v', '\f', 
		'\"', '\"', '\x4', '\x2', '\f', '\f', '\xF', '\xF', '\x2', '\xDB', '\x2', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', 
		'\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', 
		'\x3', '\x2', '\x2', '\x2', '\x3', 'G', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'L', '\x3', '\x2', '\x2', '\x2', '\a', 'N', '\x3', '\x2', '\x2', '\x2', 
		'\t', 'P', '\x3', '\x2', '\x2', '\x2', '\v', 'R', '\x3', '\x2', '\x2', 
		'\x2', '\r', 'X', '\x3', '\x2', '\x2', '\x2', '\xF', '\\', '\x3', '\x2', 
		'\x2', '\x2', '\x11', '^', '\x3', '\x2', '\x2', '\x2', '\x13', '\x61', 
		'\x3', '\x2', '\x2', '\x2', '\x15', 'l', '\x3', '\x2', '\x2', '\x2', '\x17', 
		'w', '\x3', '\x2', '\x2', '\x2', '\x19', '~', '\x3', '\x2', '\x2', '\x2', 
		'\x1B', '\x82', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x85', '\x3', '\x2', 
		'\x2', '\x2', '\x1F', '\x87', '\x3', '\x2', '\x2', '\x2', '!', '\x89', 
		'\x3', '\x2', '\x2', '\x2', '#', '\x8B', '\x3', '\x2', '\x2', '\x2', '%', 
		'\x8E', '\x3', '\x2', '\x2', '\x2', '\'', '\x90', '\x3', '\x2', '\x2', 
		'\x2', ')', '\x93', '\x3', '\x2', '\x2', '\x2', '+', '\x95', '\x3', '\x2', 
		'\x2', '\x2', '-', '\x98', '\x3', '\x2', '\x2', '\x2', '/', '\x9B', '\x3', 
		'\x2', '\x2', '\x2', '\x31', '\x9F', '\x3', '\x2', '\x2', '\x2', '\x33', 
		'\xA2', '\x3', '\x2', '\x2', '\x2', '\x35', '\xA4', '\x3', '\x2', '\x2', 
		'\x2', '\x37', '\xA7', '\x3', '\x2', '\x2', '\x2', '\x39', '\xAA', '\x3', 
		'\x2', '\x2', '\x2', ';', '\xB0', '\x3', '\x2', '\x2', '\x2', '=', '\xB2', 
		'\x3', '\x2', '\x2', '\x2', '?', '\xB7', '\x3', '\x2', '\x2', '\x2', '\x41', 
		'\xBB', '\x3', '\x2', '\x2', '\x2', '\x43', '\xBF', '\x3', '\x2', '\x2', 
		'\x2', '\x45', '\xCA', '\x3', '\x2', '\x2', '\x2', 'G', 'H', '\a', 'h', 
		'\x2', '\x2', 'H', 'I', '\a', 'w', '\x2', '\x2', 'I', 'J', '\a', 'p', 
		'\x2', '\x2', 'J', 'K', '\a', '\x65', '\x2', '\x2', 'K', '\x4', '\x3', 
		'\x2', '\x2', '\x2', 'L', 'M', '\a', '*', '\x2', '\x2', 'M', '\x6', '\x3', 
		'\x2', '\x2', '\x2', 'N', 'O', '\a', '+', '\x2', '\x2', 'O', '\b', '\x3', 
		'\x2', '\x2', '\x2', 'P', 'Q', '\a', '.', '\x2', '\x2', 'Q', '\n', '\x3', 
		'\x2', '\x2', '\x2', 'R', 'S', '\a', '\x64', '\x2', '\x2', 'S', 'T', '\a', 
		'g', '\x2', '\x2', 'T', 'U', '\a', 'i', '\x2', '\x2', 'U', 'V', '\a', 
		'k', '\x2', '\x2', 'V', 'W', '\a', 'p', '\x2', '\x2', 'W', '\f', '\x3', 
		'\x2', '\x2', '\x2', 'X', 'Y', '\a', 'g', '\x2', '\x2', 'Y', 'Z', '\a', 
		'p', '\x2', '\x2', 'Z', '[', '\a', '\x66', '\x2', '\x2', '[', '\xE', '\x3', 
		'\x2', '\x2', '\x2', '\\', ']', '\a', '=', '\x2', '\x2', ']', '\x10', 
		'\x3', '\x2', '\x2', '\x2', '^', '_', '\a', 'k', '\x2', '\x2', '_', '`', 
		'\a', 'h', '\x2', '\x2', '`', '\x12', '\x3', '\x2', '\x2', '\x2', '\x61', 
		'\x62', '\a', 'v', '\x2', '\x2', '\x62', '\x63', '\a', 'j', '\x2', '\x2', 
		'\x63', '\x64', '\a', 'g', '\x2', '\x2', '\x64', '\x65', '\a', 'p', '\x2', 
		'\x2', '\x65', '\x66', '\a', '\"', '\x2', '\x2', '\x66', 'g', '\a', '\x64', 
		'\x2', '\x2', 'g', 'h', '\a', 'g', '\x2', '\x2', 'h', 'i', '\a', 'i', 
		'\x2', '\x2', 'i', 'j', '\a', 'k', '\x2', '\x2', 'j', 'k', '\a', 'p', 
		'\x2', '\x2', 'k', '\x14', '\x3', '\x2', '\x2', '\x2', 'l', 'm', '\a', 
		'g', '\x2', '\x2', 'm', 'n', '\a', 'n', '\x2', '\x2', 'n', 'o', '\a', 
		'u', '\x2', '\x2', 'o', 'p', '\a', 'g', '\x2', '\x2', 'p', 'q', '\a', 
		'\"', '\x2', '\x2', 'q', 'r', '\a', '\x64', '\x2', '\x2', 'r', 's', '\a', 
		'g', '\x2', '\x2', 's', 't', '\a', 'i', '\x2', '\x2', 't', 'u', '\a', 
		'k', '\x2', '\x2', 'u', 'v', '\a', 'p', '\x2', '\x2', 'v', '\x16', '\x3', 
		'\x2', '\x2', '\x2', 'w', 'x', '\a', 't', '\x2', '\x2', 'x', 'y', '\a', 
		'g', '\x2', '\x2', 'y', 'z', '\a', 'v', '\x2', '\x2', 'z', '{', '\a', 
		'w', '\x2', '\x2', '{', '|', '\a', 't', '\x2', '\x2', '|', '}', '\a', 
		'p', '\x2', '\x2', '}', '\x18', '\x3', '\x2', '\x2', '\x2', '~', '\x7F', 
		'\a', 'x', '\x2', '\x2', '\x7F', '\x80', '\a', '\x63', '\x2', '\x2', '\x80', 
		'\x81', '\a', 't', '\x2', '\x2', '\x81', '\x1A', '\x3', '\x2', '\x2', 
		'\x2', '\x82', '\x83', '\a', '>', '\x2', '\x2', '\x83', '\x84', '\a', 
		'/', '\x2', '\x2', '\x84', '\x1C', '\x3', '\x2', '\x2', '\x2', '\x85', 
		'\x86', '\a', ',', '\x2', '\x2', '\x86', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '\x87', '\x88', '\a', '\x31', '\x2', '\x2', '\x88', ' ', '\x3', 
		'\x2', '\x2', '\x2', '\x89', '\x8A', '\a', '-', '\x2', '\x2', '\x8A', 
		'\"', '\x3', '\x2', '\x2', '\x2', '\x8B', '\x8C', '\a', '>', '\x2', '\x2', 
		'\x8C', '\x8D', '\a', '?', '\x2', '\x2', '\x8D', '$', '\x3', '\x2', '\x2', 
		'\x2', '\x8E', '\x8F', '\a', '>', '\x2', '\x2', '\x8F', '&', '\x3', '\x2', 
		'\x2', '\x2', '\x90', '\x91', '\a', '@', '\x2', '\x2', '\x91', '\x92', 
		'\a', '?', '\x2', '\x2', '\x92', '(', '\x3', '\x2', '\x2', '\x2', '\x93', 
		'\x94', '\a', '@', '\x2', '\x2', '\x94', '*', '\x3', '\x2', '\x2', '\x2', 
		'\x95', '\x96', '\a', '?', '\x2', '\x2', '\x96', '\x97', '\a', '?', '\x2', 
		'\x2', '\x97', ',', '\x3', '\x2', '\x2', '\x2', '\x98', '\x99', '\a', 
		'#', '\x2', '\x2', '\x99', '\x9A', '\a', '?', '\x2', '\x2', '\x9A', '.', 
		'\x3', '\x2', '\x2', '\x2', '\x9B', '\x9C', '\a', '\x63', '\x2', '\x2', 
		'\x9C', '\x9D', '\a', 'p', '\x2', '\x2', '\x9D', '\x9E', '\a', '\x66', 
		'\x2', '\x2', '\x9E', '\x30', '\x3', '\x2', '\x2', '\x2', '\x9F', '\xA0', 
		'\a', 'q', '\x2', '\x2', '\xA0', '\xA1', '\a', 't', '\x2', '\x2', '\xA1', 
		'\x32', '\x3', '\x2', '\x2', '\x2', '\xA2', '\xA3', '\a', '`', '\x2', 
		'\x2', '\xA3', '\x34', '\x3', '\x2', '\x2', '\x2', '\xA4', '\xA5', '\a', 
		'(', '\x2', '\x2', '\xA5', '\xA6', '\a', '(', '\x2', '\x2', '\xA6', '\x36', 
		'\x3', '\x2', '\x2', '\x2', '\xA7', '\xA8', '\a', '~', '\x2', '\x2', '\xA8', 
		'\xA9', '\a', '~', '\x2', '\x2', '\xA9', '\x38', '\x3', '\x2', '\x2', 
		'\x2', '\xAA', '\xAC', '\t', '\x2', '\x2', '\x2', '\xAB', '\xAD', '\t', 
		'\x3', '\x2', '\x2', '\xAC', '\xAB', '\x3', '\x2', '\x2', '\x2', '\xAD', 
		'\xAE', '\x3', '\x2', '\x2', '\x2', '\xAE', '\xAC', '\x3', '\x2', '\x2', 
		'\x2', '\xAE', '\xAF', '\x3', '\x2', '\x2', '\x2', '\xAF', ':', '\x3', 
		'\x2', '\x2', '\x2', '\xB0', '\xB1', '\a', '/', '\x2', '\x2', '\xB1', 
		'<', '\x3', '\x2', '\x2', '\x2', '\xB2', '\xB3', '\a', 'p', '\x2', '\x2', 
		'\xB3', '\xB4', '\a', 'q', '\x2', '\x2', '\xB4', '\xB5', '\a', 'v', '\x2', 
		'\x2', '\xB5', '>', '\x3', '\x2', '\x2', '\x2', '\xB6', '\xB8', '\t', 
		'\x4', '\x2', '\x2', '\xB7', '\xB6', '\x3', '\x2', '\x2', '\x2', '\xB8', 
		'\xB9', '\x3', '\x2', '\x2', '\x2', '\xB9', '\xB7', '\x3', '\x2', '\x2', 
		'\x2', '\xB9', '\xBA', '\x3', '\x2', '\x2', '\x2', '\xBA', '@', '\x3', 
		'\x2', '\x2', '\x2', '\xBB', '\xBC', '\t', '\x5', '\x2', '\x2', '\xBC', 
		'\xBD', '\x3', '\x2', '\x2', '\x2', '\xBD', '\xBE', '\b', '!', '\x2', 
		'\x2', '\xBE', '\x42', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xC0', '\a', 
		'\x31', '\x2', '\x2', '\xC0', '\xC1', '\a', '\x31', '\x2', '\x2', '\xC1', 
		'\xC5', '\x3', '\x2', '\x2', '\x2', '\xC2', '\xC4', '\n', '\x6', '\x2', 
		'\x2', '\xC3', '\xC2', '\x3', '\x2', '\x2', '\x2', '\xC4', '\xC7', '\x3', 
		'\x2', '\x2', '\x2', '\xC5', '\xC3', '\x3', '\x2', '\x2', '\x2', '\xC5', 
		'\xC6', '\x3', '\x2', '\x2', '\x2', '\xC6', '\xC8', '\x3', '\x2', '\x2', 
		'\x2', '\xC7', '\xC5', '\x3', '\x2', '\x2', '\x2', '\xC8', '\xC9', '\b', 
		'\"', '\x2', '\x2', '\xC9', '\x44', '\x3', '\x2', '\x2', '\x2', '\xCA', 
		'\xCB', '\a', '\x31', '\x2', '\x2', '\xCB', '\xCC', '\a', ',', '\x2', 
		'\x2', '\xCC', '\xD0', '\x3', '\x2', '\x2', '\x2', '\xCD', '\xCF', '\v', 
		'\x2', '\x2', '\x2', '\xCE', '\xCD', '\x3', '\x2', '\x2', '\x2', '\xCF', 
		'\xD2', '\x3', '\x2', '\x2', '\x2', '\xD0', '\xD1', '\x3', '\x2', '\x2', 
		'\x2', '\xD0', '\xCE', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xD3', '\x3', 
		'\x2', '\x2', '\x2', '\xD2', '\xD0', '\x3', '\x2', '\x2', '\x2', '\xD3', 
		'\xD4', '\a', ',', '\x2', '\x2', '\xD4', '\xD5', '\a', '\x31', '\x2', 
		'\x2', '\xD5', '\xD6', '\x3', '\x2', '\x2', '\x2', '\xD6', '\xD7', '\b', 
		'#', '\x2', '\x2', '\xD7', '\x46', '\x3', '\x2', '\x2', '\x2', '\a', '\x2', 
		'\xAE', '\xB9', '\xC5', '\xD0', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
