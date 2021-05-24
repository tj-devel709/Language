// Generated from /Users/tjlambert/Documents/LanguageProject/Language/Language.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, WORD=26, NEGATIVE=27, NOT=28, INT=29, WHITESPACE=30;
	public static final int
		RULE_file = 0, RULE_functionDeclaration = 1, RULE_funcHead = 2, RULE_parameters = 3, 
		RULE_parameterList = 4, RULE_parameter = 5, RULE_body = 6, RULE_statements = 7, 
		RULE_statement = 8, RULE_conditional = 9, RULE_ifStatement = 10, RULE_elseStatement = 11, 
		RULE_returnStatement = 12, RULE_end = 13, RULE_funcCall = 14, RULE_arguments = 15, 
		RULE_argumentList = 16, RULE_variableDeclaration = 17, RULE_variableAssignment = 18, 
		RULE_assignment = 19, RULE_expr = 20, RULE_name = 21, RULE_intvalue = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "functionDeclaration", "funcHead", "parameters", "parameterList", 
			"parameter", "body", "statements", "statement", "conditional", "ifStatement", 
			"elseStatement", "returnStatement", "end", "funcCall", "arguments", "argumentList", 
			"variableDeclaration", "variableAssignment", "assignment", "expr", "name", 
			"intvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'('", "')'", "','", "'begin'", "'end'", "';'", "'if'", 
			"'then begin'", "'else begin'", "'return'", "'var'", "'<-'", "'*'", "'/'", 
			"'+'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'and'", "'or'", 
			"'^'", null, "'-'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WORD", "NEGATIVE", "NOT", "INT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(46);
				functionDeclaration();
				}
				}
				setState(51);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FuncHeadContext funcHead() {
			return getRuleContext(FuncHeadContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			funcHead();
			setState(53);
			parameters();
			setState(54);
			body();
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

	public static class FuncHeadContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FuncHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcHead; }
	}

	public final FuncHeadContext funcHead() throws RecognitionException {
		FuncHeadContext _localctx = new FuncHeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			name();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(60);
				parameterList();
				}
			}

			setState(63);
			match(T__2);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			parameter();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(66);
				match(T__3);
				setState(67);
				parameter();
				}
				}
				setState(72);
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

	public static class ParameterContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			name();
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

	public static class BodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
			statements();
			setState(77);
			match(T__5);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << WORD) | (1L << NEGATIVE) | (1L << NOT) | (1L << INT))) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalStatementContext extends StatementContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class VarDeclStatementContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VarDeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class VarAssignStatementContext extends StatementContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VarAssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RetStatementContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RetStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				conditional();
				}
				break;
			case 2:
				_localctx = new VarAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				variableAssignment();
				setState(87);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				variableDeclaration();
				setState(90);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				expr(0);
				setState(93);
				match(T__6);
				}
				break;
			case 5:
				_localctx = new RetStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				returnStatement();
				setState(96);
				match(T__6);
				}
				break;
			case 6:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(T__6);
				}
				break;
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

	public static class ConditionalContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			ifStatement();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(102);
				elseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__7);
			setState(106);
			expr(0);
			setState(107);
			match(T__8);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << WORD) | (1L << NEGATIVE) | (1L << NOT) | (1L << INT))) != 0)) {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			end();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__9);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << WORD) | (1L << NEGATIVE) | (1L << NOT) | (1L << INT))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			end();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__10);
			setState(126);
			expr(0);
			setState(127);
			match(T__6);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__5);
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

	public static class FuncCallContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			name();
			setState(132);
			arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__1);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(135);
				parameterList();
				}
			}

			setState(138);
			match(T__2);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(141);
				match(T__3);
				setState(142);
				expr(0);
				}
				}
				setState(147);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__11);
				setState(149);
				name();
				setState(150);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__11);
				setState(153);
				name();
				setState(154);
				assignment();
				setState(155);
				match(T__6);
				}
				break;
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			name();
			setState(160);
			assignment();
			setState(161);
			match(T__6);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__12);
			setState(164);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanOrEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanOrEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanOrEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanOrEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallExprContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntValueExperContext extends ExprContext {
		public IntvalueContext intvalue() {
			return getRuleContext(IntvalueContext.class,0);
		}
		public IntValueExperContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NameExprContext extends ExprContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEGATIVE() { return getToken(LanguageParser.NEGATIVE, 0); }
		public SubtractionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				match(T__1);
				setState(168);
				expr(0);
				setState(169);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				funcCall();
				}
				break;
			case 3:
				{
				_localctx = new IntValueExperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				intvalue();
				}
				break;
			case 4:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(177);
						match(T__13);
						setState(178);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new DivisionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(180);
						match(T__14);
						setState(181);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(183);
						match(T__15);
						setState(184);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(186);
						match(NEGATIVE);
						setState(187);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new LessThanOrEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(189);
						match(T__16);
						setState(190);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(192);
						match(T__17);
						setState(193);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanOrEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(195);
						match(T__18);
						setState(196);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(198);
						match(T__19);
						setState(199);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(201);
						match(T__20);
						setState(202);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new NotEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(204);
						match(T__21);
						setState(205);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(207);
						match(T__22);
						setState(208);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(210);
						match(T__23);
						setState(211);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new NotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(213);
						match(T__24);
						setState(214);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LanguageParser.WORD, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(WORD);
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

	public static class IntvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public TerminalNode NEGATIVE() { return getToken(LanguageParser.NEGATIVE, 0); }
		public IntvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvalue; }
	}

	public final IntvalueContext intvalue() throws RecognitionException {
		IntvalueContext _localctx = new IntvalueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intvalue);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(222);
					match(NOT);
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(225);
					match(NEGATIVE);
					}
				}

				setState(228);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(229);
					match(NEGATIVE);
					}
				}

				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(232);
					match(NOT);
					}
				}

				setState(235);
				match(INT);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5@\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7"+
		"\tS\n\t\f\t\16\tV\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nf\n\n\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\7\fp\n\f\f\f\16"+
		"\fs\13\f\3\f\3\f\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u008b\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u0092\n\22\f\22\16\22\u0095\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00a0\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b1\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00da\n\26\f\26\16"+
		"\26\u00dd\13\26\3\27\3\27\3\30\5\30\u00e2\n\30\3\30\5\30\u00e5\n\30\3"+
		"\30\3\30\5\30\u00e9\n\30\3\30\5\30\u00ec\n\30\3\30\5\30\u00ef\n\30\3\30"+
		"\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00fd\2"+
		"\63\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\b=\3\2\2\2\nC\3\2\2\2\fK\3\2\2\2\16"+
		"M\3\2\2\2\20T\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26k\3\2\2\2\30v\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0083\3\2\2\2\36\u0085\3\2\2\2 \u0088\3\2\2\2\"\u008e"+
		"\3\2\2\2$\u009f\3\2\2\2&\u00a1\3\2\2\2(\u00a5\3\2\2\2*\u00b0\3\2\2\2,"+
		"\u00de\3\2\2\2.\u00ee\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2"+
		"\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\6\4"+
		"\2\678\5\b\5\289\5\16\b\29\5\3\2\2\2:;\7\3\2\2;<\5,\27\2<\7\3\2\2\2=?"+
		"\7\4\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\5\2\2B\t\3\2\2\2"+
		"CH\5\f\7\2DE\7\6\2\2EG\5\f\7\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"I\13\3\2\2\2JH\3\2\2\2KL\5,\27\2L\r\3\2\2\2MN\7\7\2\2NO\5\20\t\2OP\7\b"+
		"\2\2P\17\3\2\2\2QS\5\22\n\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\21"+
		"\3\2\2\2VT\3\2\2\2Wf\5\24\13\2XY\5&\24\2YZ\7\t\2\2Zf\3\2\2\2[\\\5$\23"+
		"\2\\]\7\t\2\2]f\3\2\2\2^_\5*\26\2_`\7\t\2\2`f\3\2\2\2ab\5\32\16\2bc\7"+
		"\t\2\2cf\3\2\2\2df\7\t\2\2eW\3\2\2\2eX\3\2\2\2e[\3\2\2\2e^\3\2\2\2ea\3"+
		"\2\2\2ed\3\2\2\2f\23\3\2\2\2gi\5\26\f\2hj\5\30\r\2ih\3\2\2\2ij\3\2\2\2"+
		"j\25\3\2\2\2kl\7\n\2\2lm\5*\26\2mq\7\13\2\2np\5\22\n\2on\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\34\17\2u\27\3\2\2\2v"+
		"z\7\f\2\2wy\5\22\n\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2"+
		"|z\3\2\2\2}~\5\34\17\2~\31\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5*\26"+
		"\2\u0081\u0082\7\t\2\2\u0082\33\3\2\2\2\u0083\u0084\7\b\2\2\u0084\35\3"+
		"\2\2\2\u0085\u0086\5,\27\2\u0086\u0087\5 \21\2\u0087\37\3\2\2\2\u0088"+
		"\u008a\7\4\2\2\u0089\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\5\2\2\u008d!\3\2\2\2\u008e\u0093"+
		"\5*\26\2\u008f\u0090\7\6\2\2\u0090\u0092\5*\26\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094#\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5,\27\2\u0098\u0099"+
		"\7\t\2\2\u0099\u00a0\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u009c\5,\27\2"+
		"\u009c\u009d\5(\25\2\u009d\u009e\7\t\2\2\u009e\u00a0\3\2\2\2\u009f\u0096"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a2\5,\27\2\u00a2"+
		"\u00a3\5(\25\2\u00a3\u00a4\7\t\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\17\2"+
		"\2\u00a6\u00a7\5*\26\2\u00a7)\3\2\2\2\u00a8\u00a9\b\26\1\2\u00a9\u00aa"+
		"\7\4\2\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\7\5\2\2\u00ac\u00b1\3\2\2\2\u00ad"+
		"\u00b1\5\36\20\2\u00ae\u00b1\5.\30\2\u00af\u00b1\5,\27\2\u00b0\u00a8\3"+
		"\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00db\3\2\2\2\u00b2\u00b3\f\23\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00da\5"+
		"*\26\24\u00b5\u00b6\f\22\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00da\5*\26\23"+
		"\u00b8\u00b9\f\21\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00da\5*\26\22\u00bb"+
		"\u00bc\f\20\2\2\u00bc\u00bd\7\35\2\2\u00bd\u00da\5*\26\21\u00be\u00bf"+
		"\f\17\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00da\5*\26\20\u00c1\u00c2\f\16\2"+
		"\2\u00c2\u00c3\7\24\2\2\u00c3\u00da\5*\26\17\u00c4\u00c5\f\r\2\2\u00c5"+
		"\u00c6\7\25\2\2\u00c6\u00da\5*\26\16\u00c7\u00c8\f\f\2\2\u00c8\u00c9\7"+
		"\26\2\2\u00c9\u00da\5*\26\r\u00ca\u00cb\f\13\2\2\u00cb\u00cc\7\27\2\2"+
		"\u00cc\u00da\5*\26\f\u00cd\u00ce\f\n\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00da"+
		"\5*\26\13\u00d0\u00d1\f\t\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00da\5*\26\n"+
		"\u00d3\u00d4\f\b\2\2\u00d4\u00d5\7\32\2\2\u00d5\u00da\5*\26\t\u00d6\u00d7"+
		"\f\7\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00da\5*\26\b\u00d9\u00b2\3\2\2\2"+
		"\u00d9\u00b5\3\2\2\2\u00d9\u00b8\3\2\2\2\u00d9\u00bb\3\2\2\2\u00d9\u00be"+
		"\3\2\2\2\u00d9\u00c1\3\2\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9"+
		"\u00ca\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2"+
		"\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\34\2\2"+
		"\u00df-\3\2\2\2\u00e0\u00e2\7\36\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\7\35\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ef\7\37\2\2\u00e7\u00e9\7"+
		"\35\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00ec\7\36\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00ef\7\37\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ef"+
		"/\3\2\2\2\25\63?HTeiqz\u008a\u0093\u009f\u00b0\u00d9\u00db\u00e1\u00e4"+
		"\u00e8\u00eb\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}