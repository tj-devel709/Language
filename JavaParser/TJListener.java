// Generated from TJ.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TJParser}.
 */
public interface TJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TJParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TJParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TJParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TJParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TJParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void enterFuncHead(TJParser.FuncHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void exitFuncHead(TJParser.FuncHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TJParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TJParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TJParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TJParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TJParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TJParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TJParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TJParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(TJParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(TJParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(TJParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(TJParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationListStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationListStatement(TJParser.VarDeclarationListStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationListStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationListStatement(TJParser.VarDeclarationListStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignmentStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignmentStatement(TJParser.VarAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignmentStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignmentStatement(TJParser.VarAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(TJParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(TJParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRetStatement(TJParser.RetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRetStatement(TJParser.RetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(TJParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link TJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(TJParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(TJParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(TJParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TJParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TJParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TJParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TJParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TJParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TJParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(TJParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(TJParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(TJParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(TJParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TJParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TJParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TJParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TJParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(TJParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(TJParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(TJParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(TJParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TJParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TJParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TJParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TJParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpr(TJParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpr(TJParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpr(TJParser.LessThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpr(TJParser.LessThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(TJParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(TJParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(TJParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(TJParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpr(TJParser.LessThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpr(TJParser.LessThanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(TJParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(TJParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(TJParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(TJParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValueExper}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntValueExper(TJParser.IntValueExperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValueExper}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntValueExper(TJParser.IntValueExperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNameExpr(TJParser.NameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNameExpr(TJParser.NameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpr(TJParser.DivisionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpr(TJParser.DivisionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpr(TJParser.SubtractionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpr(TJParser.SubtractionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpr(TJParser.GreaterThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpr(TJParser.GreaterThanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(TJParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(TJParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(TJParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(TJParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(TJParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(TJParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(TJParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(TJParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(TJParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(TJParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(TJParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(TJParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(TJParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(TJParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TJParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TJParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TJParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void enterIntvalue(TJParser.IntvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TJParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void exitIntvalue(TJParser.IntvalueContext ctx);
}