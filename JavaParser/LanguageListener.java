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
	 * Enter a parse tree produced by {@link LanguageParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LanguageParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LanguageParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(LanguageParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(LanguageParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(LanguageParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(LanguageParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcArguments}.
	 * @param ctx the parse tree
	 */
	void enterFuncArguments(LanguageParser.FuncArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcArguments}.
	 * @param ctx the parse tree
	 */
	void exitFuncArguments(LanguageParser.FuncArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(LanguageParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(LanguageParser.FuncBodyContext ctx);
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
	 * Enter a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(LanguageParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(LanguageParser.ConditionalOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link LanguageParser#pseudoFunctions}.
	 * @param ctx the parse tree
	 */
	void enterPseudoFunctions(LanguageParser.PseudoFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#pseudoFunctions}.
	 * @param ctx the parse tree
	 */
	void exitPseudoFunctions(LanguageParser.PseudoFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LanguageParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LanguageParser.PrintlnContext ctx);
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
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(LanguageParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(LanguageParser.IntValueContext ctx);
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
	 * Enter a parse tree produced by the {@code word}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWord(LanguageParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code word}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWord(LanguageParser.WordContext ctx);
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