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
	| variableDeclarationList ';' #varDeclarationListStatement
	| variableAssignment ';' #varAssignmentStatement
	| expr ';' #exprStatement
	| returnStatement ';' #retStatement
	| ';' #emptyStatement
	;

conditional: ifStatement elseStatement? ;

ifStatement: 'if' expr 'then begin' statement* end;
elseStatement: 'else begin' statement* end ;
returnStatement: 'return' expr;
end: 'end' ;

funcCall: name arguments ;
arguments: '(' argumentList? ')' ;
argumentList: expr (',' expr)* ;

variableDeclarationList: 'var' variable (',' variable)* ;
variableAssignment: name assignment ;
variable: name assignment? ;
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

// TODO Comments
// single line and block -check Antlr examples


// lexer
WORD 				: [a-zA-Z0-9]+			;
NEGATIVE			: '-'					;
NOT					: 'not'					;
INT					: [0-9]+ 				;
WHITESPACE			: (' ' | '\n' | '\t') -> skip 		; //       incoud  include newlines and tabs