// Define a grammar called Hello
grammar Hello;
/* Definim regulile gramaticii (cu litere mici) */
mainNode  : varList start;// Inceputul gramaticii, S -> list
varList : 'int'var | varList','var | varList';' ;
start : sequenceNode | stmt ;
sequenceNode : stmt stmt | stmt sequenceNode ;
stmt : assignmentNode | ifNode | whileNode ;
assignmentNode : var'='aExpr';' ;
ifNode : 'if' bExpr blockNode 'else' blockNode ;
whileNode : 'while' bExpr blockNode ;
blockNode : '{''}' | '{'start'}' ;
bracketNode : '('aExpr')' | '('bExpr')' ;
bExpr : bracketNode | '!'bExpr | aExpr'>'aExpr | bExpr'&&'bExpr | bVal ;
aExpr : bracketNode | aExpr '/' aExpr | aExpr'+'aExpr | aVal | var ;
bVal : 'true' | 'false' ;
aVal : number ;
number :  DIGIT ('0'|DIGIT)* | '0' ;
var : STRING;

/* Definim Tokenii ce pot aparea in timpul parsarii */
DIGIT : [1-9] ;
STRING : [a-z]+ ; 
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines



