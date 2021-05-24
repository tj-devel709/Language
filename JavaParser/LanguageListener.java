// Generated from Language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LanguageParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LanguageParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(LanguageParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(LanguageParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void enterFuncHead(LanguageParser.FuncHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void exitFuncHead(LanguageParser.FuncHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(LanguageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(LanguageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(LanguageParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(LanguageParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(LanguageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(LanguageParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LanguageParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LanguageParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(LanguageParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(LanguageParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignStatement(LanguageParser.VarAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignStatement(LanguageParser.VarAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStatement(LanguageParser.VarDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStatement(LanguageParser.VarDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(LanguageParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(LanguageParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRetStatement(LanguageParser.RetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRetStatement(LanguageParser.RetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(LanguageParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(LanguageParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LanguageParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LanguageParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(LanguageParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(LanguageParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LanguageParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LanguageParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(LanguageParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(LanguageParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(LanguageParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(LanguageParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LanguageParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LanguageParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LanguageParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LanguageParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LanguageParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(LanguageParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(LanguageParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualExpr(LanguageParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualExpr(LanguageParser.GreaterThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualExpr(LanguageParser.LessThanOrEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualExpr(LanguageParser.LessThanOrEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(LanguageParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(LanguageParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpr(LanguageParser.LessThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpr(LanguageParser.LessThanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(LanguageParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(LanguageParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValueExper}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntValueExper(LanguageParser.IntValueExperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValueExper}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntValueExper(LanguageParser.IntValueExperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNameExpr(LanguageParser.NameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNameExpr(LanguageParser.NameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpr(LanguageParser.DivisionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpr(LanguageParser.DivisionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpr(LanguageParser.SubtractionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpr(LanguageParser.SubtractionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpr(LanguageParser.GreaterThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpr(LanguageParser.GreaterThanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(LanguageParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(LanguageParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(LanguageParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(LanguageParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(LanguageParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(LanguageParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(LanguageParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(LanguageParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void enterIntvalue(LanguageParser.IntvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void exitIntvalue(LanguageParser.IntvalueContext ctx);
}