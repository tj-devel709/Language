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


using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ILanguageListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class LanguageBaseListener : ILanguageListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFile([NotNull] LanguageParser.FileContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFile([NotNull] LanguageParser.FileContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.functionDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunctionDeclaration([NotNull] LanguageParser.FunctionDeclarationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.functionDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunctionDeclaration([NotNull] LanguageParser.FunctionDeclarationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.funcHead"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncHead([NotNull] LanguageParser.FuncHeadContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.funcHead"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncHead([NotNull] LanguageParser.FuncHeadContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.parameters"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParameters([NotNull] LanguageParser.ParametersContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.parameters"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParameters([NotNull] LanguageParser.ParametersContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.parameterList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParameterList([NotNull] LanguageParser.ParameterListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.parameterList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParameterList([NotNull] LanguageParser.ParameterListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.parameter"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParameter([NotNull] LanguageParser.ParameterContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.parameter"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParameter([NotNull] LanguageParser.ParameterContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.body"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBody([NotNull] LanguageParser.BodyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.body"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBody([NotNull] LanguageParser.BodyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.statements"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStatements([NotNull] LanguageParser.StatementsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.statements"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStatements([NotNull] LanguageParser.StatementsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>conditionalStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterConditionalStatement([NotNull] LanguageParser.ConditionalStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>conditionalStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitConditionalStatement([NotNull] LanguageParser.ConditionalStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>varDeclarationListStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVarDeclarationListStatement([NotNull] LanguageParser.VarDeclarationListStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>varDeclarationListStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVarDeclarationListStatement([NotNull] LanguageParser.VarDeclarationListStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>varAssignmentStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVarAssignmentStatement([NotNull] LanguageParser.VarAssignmentStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>varAssignmentStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVarAssignmentStatement([NotNull] LanguageParser.VarAssignmentStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>exprStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExprStatement([NotNull] LanguageParser.ExprStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>exprStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExprStatement([NotNull] LanguageParser.ExprStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>retStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterRetStatement([NotNull] LanguageParser.RetStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>retStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitRetStatement([NotNull] LanguageParser.RetStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>emptyStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEmptyStatement([NotNull] LanguageParser.EmptyStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>emptyStatement</c>
	/// labeled alternative in <see cref="LanguageParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEmptyStatement([NotNull] LanguageParser.EmptyStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.conditional"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterConditional([NotNull] LanguageParser.ConditionalContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.conditional"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitConditional([NotNull] LanguageParser.ConditionalContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.ifStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIfStatement([NotNull] LanguageParser.IfStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.ifStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIfStatement([NotNull] LanguageParser.IfStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.elseStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterElseStatement([NotNull] LanguageParser.ElseStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.elseStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitElseStatement([NotNull] LanguageParser.ElseStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReturnStatement([NotNull] LanguageParser.ReturnStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReturnStatement([NotNull] LanguageParser.ReturnStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.end"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEnd([NotNull] LanguageParser.EndContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.end"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEnd([NotNull] LanguageParser.EndContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.funcCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncCall([NotNull] LanguageParser.FuncCallContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.funcCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncCall([NotNull] LanguageParser.FuncCallContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.arguments"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArguments([NotNull] LanguageParser.ArgumentsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.arguments"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArguments([NotNull] LanguageParser.ArgumentsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.argumentList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArgumentList([NotNull] LanguageParser.ArgumentListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.argumentList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArgumentList([NotNull] LanguageParser.ArgumentListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.variableDeclarationList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariableDeclarationList([NotNull] LanguageParser.VariableDeclarationListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.variableDeclarationList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariableDeclarationList([NotNull] LanguageParser.VariableDeclarationListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.variableAssignment"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariableAssignment([NotNull] LanguageParser.VariableAssignmentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.variableAssignment"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariableAssignment([NotNull] LanguageParser.VariableAssignmentContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.variable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVariable([NotNull] LanguageParser.VariableContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.variable"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVariable([NotNull] LanguageParser.VariableContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.assignment"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssignment([NotNull] LanguageParser.AssignmentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.assignment"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssignment([NotNull] LanguageParser.AssignmentContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>greaterThanOrEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterGreaterThanOrEqualExpr([NotNull] LanguageParser.GreaterThanOrEqualExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>greaterThanOrEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitGreaterThanOrEqualExpr([NotNull] LanguageParser.GreaterThanOrEqualExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>lessThanOrEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLessThanOrEqualExpr([NotNull] LanguageParser.LessThanOrEqualExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>lessThanOrEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLessThanOrEqualExpr([NotNull] LanguageParser.LessThanOrEqualExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>logicalAndExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLogicalAndExpr([NotNull] LanguageParser.LogicalAndExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>logicalAndExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLogicalAndExpr([NotNull] LanguageParser.LogicalAndExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>additionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAdditionExpr([NotNull] LanguageParser.AdditionExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>additionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAdditionExpr([NotNull] LanguageParser.AdditionExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>lessThanExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLessThanExpr([NotNull] LanguageParser.LessThanExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>lessThanExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLessThanExpr([NotNull] LanguageParser.LessThanExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>orExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOrExpr([NotNull] LanguageParser.OrExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>orExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOrExpr([NotNull] LanguageParser.OrExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>funcCallExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncCallExpr([NotNull] LanguageParser.FuncCallExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>funcCallExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncCallExpr([NotNull] LanguageParser.FuncCallExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>intValueExper</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIntValueExper([NotNull] LanguageParser.IntValueExperContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>intValueExper</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIntValueExper([NotNull] LanguageParser.IntValueExperContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>nameExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNameExpr([NotNull] LanguageParser.NameExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>nameExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNameExpr([NotNull] LanguageParser.NameExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>divisionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDivisionExpr([NotNull] LanguageParser.DivisionExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>divisionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDivisionExpr([NotNull] LanguageParser.DivisionExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>subtractionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSubtractionExpr([NotNull] LanguageParser.SubtractionExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>subtractionExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSubtractionExpr([NotNull] LanguageParser.SubtractionExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>greaterThanExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterGreaterThanExpr([NotNull] LanguageParser.GreaterThanExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>greaterThanExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitGreaterThanExpr([NotNull] LanguageParser.GreaterThanExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>logicalOrExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLogicalOrExpr([NotNull] LanguageParser.LogicalOrExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>logicalOrExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLogicalOrExpr([NotNull] LanguageParser.LogicalOrExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>notExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNotExpr([NotNull] LanguageParser.NotExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>notExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNotExpr([NotNull] LanguageParser.NotExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>multiplicationExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMultiplicationExpr([NotNull] LanguageParser.MultiplicationExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>multiplicationExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMultiplicationExpr([NotNull] LanguageParser.MultiplicationExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>notEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNotEqualExpr([NotNull] LanguageParser.NotEqualExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>notEqualExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNotEqualExpr([NotNull] LanguageParser.NotEqualExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>parenthesisExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParenthesisExpr([NotNull] LanguageParser.ParenthesisExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>parenthesisExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParenthesisExpr([NotNull] LanguageParser.ParenthesisExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>equalExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEqualExpr([NotNull] LanguageParser.EqualExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>equalExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEqualExpr([NotNull] LanguageParser.EqualExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>andExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAndExpr([NotNull] LanguageParser.AndExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>andExpr</c>
	/// labeled alternative in <see cref="LanguageParser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAndExpr([NotNull] LanguageParser.AndExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.name"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterName([NotNull] LanguageParser.NameContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.name"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitName([NotNull] LanguageParser.NameContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LanguageParser.intvalue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIntvalue([NotNull] LanguageParser.IntvalueContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LanguageParser.intvalue"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIntvalue([NotNull] LanguageParser.IntvalueContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
