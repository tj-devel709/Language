grammar Language;		
file: functionDeclaration* ;

functionDeclaration: funcHead arguments body;
funcHead: 'func' name ;
arguments: '(' argumentlist? ')' ;
argumentlist: argument (',' argument)* ;
argument: name ;

body: 'begin' statements 'end';
statements: statement* ;

statement: conditional #conditionalStatement
	| variableAssignment #varAssignStatement
	| variableDeclaration #varDeclStatement
	| funcCall #funcCallStatement
	| expr #exprStatement
	| returnStatement #retStatement
	| empty #emptyStatement
	;

conditional: ifStatement elseStatement? ;

ifStatement: 'if' conditionStatement 'then begin' statement* end;
conditionStatement: value conditionalOperator value 
	| value
	;
value: name #nameConditionVal
	| funcCall #funcCallConditionVal
	| intvalue #intValConditionVal
	;
conditionalOperator: '<=' #lessThanOrEqual
	| '<' #lessThan
	| '>=' #greaterThanOrEqual
	| '>' #greaterThan
	| '==' #equal
	| '!=' #notEqual
	;
elseStatement: 'else begin' returnStatement end;
returnStatement: 'return' value ';' ;
end: 'end' ;

funcCall: name funcArguments ;

funcArguments: ('(' funcCall ')')
	| arguments
	;

variableDeclaration: 'var' name ';' ;
variableAssignment: name '<-' expr ';' ;

expr:	expr ('*') expr # multiplicationExpr
    |	expr ('/') expr # divisionExpr
    |	expr ('+') expr # additionExpr
    |	expr ('-') expr # subtractionExpr
	|	expr ('and') expr # andExpr
	|	expr ('or') expr # orExpr
	|	expr ('^') expr # notExpr
    |	intvalue # intValueExper
	|	name # nameExpr
    |	'(' expr ')' # parenthesisExpr
    ;

empty: EMPTY ;
name: WORD ;
intvalue: NOT? NEGATIVE? INT
	| NEGATIVE? NOT? INT
	;

// lexer
WORD 				: [a-zA-Z0-9]+			;
EMPTY				: ';'					;
NEGATIVE			: '-'					;
NOT					: 'not'					;
INT					: [0-9]+ 				;
WHITESPACE			: (' ') -> skip 		;