grammar Language;
file: functionDeclaration* ;

functionDeclaration: funcHead parameters body;
funcHead: 'func' name ;
parameters: '(' parameterList? ')' ;
parameterList: parameter (',' parameter)* ;
parameter: name ;

body: 'begin' statements 'end';
statements: statement* ;

statement: conditional #conditionalStatement
	| variableAssignment ';' #varAssignStatement
	| variableDeclaration ';' #varDeclStatement
	| expr ';' #exprStatement
	| returnStatement ';' #retStatement
	| ';' #emptyStatement
	;

conditional: ifStatement elseStatement? ;

ifStatement: 'if' expr 'then begin' statement* end;
elseStatement: 'else begin' statement* end ;
returnStatement: 'return' expr ';' ;
end: 'end' ;

funcCall: name arguments ;
arguments: '(' parameterList? ')' ;
argumentList: expr (',' expr)* ;

variableDeclaration: 'var' name ';' 
	| 'var' name assignment ';'
	;
variableAssignment: name assignment ';' ;
assignment: '<-' expr ;

expr:	expr '*' expr # multiplicationExpr
    |	expr '/' expr # divisionExpr
    |	expr '+' expr # additionExpr
    |	expr '-' expr # subtractionExpr
	| 	expr '<=' expr #lessThanOrEqualExpr
	| 	expr '<' expr #lessThanExpr
	| 	expr '>=' expr #greaterThanOrEqualExpr
	| 	expr '>' expr #greaterThanExpr
	| 	expr '==' expr #equalExpr
	| 	expr '!=' expr #notEqualExpr
	|	expr 'and' expr # andExpr
	|	expr 'or' expr # orExpr
	|	expr '^' expr # notExpr
	|	'(' expr ')' # parenthesisExpr
	|	funcCall # funcCallExpr
    |	intvalue # intValueExper
	|	name # nameExpr
    ;

name: WORD ;
intvalue: NOT? NEGATIVE? INT
	| NEGATIVE? NOT? INT
	;

// lexer
WORD 				: [a-zA-Z0-9]+			;
NEGATIVE			: '-'					;
NOT					: 'not'					;
INT					: [0-9]+ 				;
WHITESPACE			: (' ') -> skip 		;