grammar Language;		
file: NEWLINE* (func NEWLINE)* ;

// func
func: funcDeclaration funcBody end ;
funcDeclaration: 'func' funcName funcArguments 'begin' ;
funcName: WORD ;
funcArguments: '(' (WORD (',' WORD)*)? ')' ;

funcBody: NEWLINE funcBody NEWLINE* funcBody?
		| conditional
		| variableDeclaration
		| variableAssignment
		| pseudoFunctions
		;

// conditional
conditional: ifStatement
		   | ifStatement elseStatement
		   ;
ifStatement: 'if' condition 'then begin' returnStatement end;
condition: WORD conditionalOperator WORD ;
conditionalOperator: ('<=' | '<' | '>=' | '>' | '==' | '!=') ;
returnStatement: NEWLINE 'return' WORD ';' ;
elseStatement: 'else begin' returnStatement end;
end: NEWLINE 'end' ;

//pseudo functions
pseudoFunctions: println
			   | print
			   ;
print: 'print' funcCall ;
println: 'println' funcCall ;
funcCall: '(' WORD funcArguments ')'
		| funcArguments
		;

// variable
variableDeclaration: 'var' WORD ';' ;
variableAssignment: WORD '<-' expr ';' ;

// operators
expr:	expr ('*') expr # multiplicationExpr
    |	expr ('/') expr # divisionExpr
    |	expr ('+') expr # additionExpr
    |	expr ('-') expr # subtractionExpr
	|	expr ('and') expr # andExpr
	|	expr ('or') expr # orExpr
	|	expr ('^') expr # notExpr
    |	intvalue # intValue
	|	WORD # word
    |	'(' expr ')' # parenthesisExpr
    ;
intvalue: NOT? NEGATIVE? INT
		| NEGATIVE? NOT? INT
		;


// lexer
WORD 				: [a-zA-Z0-9]+			;
NEGATIVE			: '-'					;
NOT					: 'not'					;
NEWLINE 			: [\r\n]+ 				;
INT					: [0-9]+ 				;
WHITESPACE			: (' ') -> skip 		;