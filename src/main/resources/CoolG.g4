// ITS NOT WORKING - JUST USED FOR TESTING
grammar CoolG;
/*
Parser rules
*/
//
program:(class_def)+;
class_def: CLASS TYPEID (INHERITS TYPEID)? LEFTCURLY (insides SEMICOLON)* RIGHTCURLY SEMICOLON;
//type: INT|STRING|BOOL|OBJECT;
//inherit: INHERITS TYPEID;
insides: OBJECTID LEFTPAREN ((parameter)(COMMA parameter)*)? RIGHTPAREN COLON TYPEID
LEFTCURLY expr RIGHTCURLY    #method
| OBJECTID COLON TYPEID (ASSIGN expr)? SEMICOLON                  #attribute
;
// insides may be: function or attribute
parameter: OBJECTID COLON TYPEID;
// parameter of function
expr:
OBJECTID ASSIGN expr #opAssign
|WHILE expr LOOP expr POOL #whileLoop
|LEFTCURLY expr RIGHTCURLY #block
|LEFTCURLY (expr SEMICOLON)+ RIGHTCURLY #block1
|IF expr THEN expr ELSE expr FI #ifThenElse
//|LET let_expr #let
|CASE expr OF branch+ ESAC #switch
|NEW TYPEID #newType
|ISVOID expr #isVoid
|TL expr #opComplement
|expr (MUL|DIV) expr #mulDiv
| expr (ADD|SUB) expr #addSub
|expr LT expr #lessThan
|expr LE expr #lessEqual
|expr EQUAL expr #opEqual
|NOT expr #opNot
|LEFTPAREN expr RIGHTPAREN #group
|OBJECTID #objId
|NUM #integer
|TRUE #boolTrue
|FALSE #boolFalse;
//let_expr: OBJECTID COLON TYPEID COMMA let_expr #nestedLet
//|OBJECTID COLON TYPEID IN expr #letIn
//|OBJECTID COLON TYPEID ASSIGN expr COMMA let_expr #letAssignLet
//|OBJECTID COLON TYPEID ASSIGN expr IN expr #letAssignIn;

branch: OBJECTID COLON TYPEID DARROW expr SEMICOLON;

/*
Lexer
*/
// all possible letters.
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
// all keywords
CLASS: C L A S S;
ELSE: E L S E;
FI: F I;
TRUE: [t]R U E;
FALSE: [f]A L S E;
IF: I F;
IN: I N;
INHERITS: I N H E R I T S;
LET: L E T;
LOOP: L O O P;
POOL: P O O L;
THEN: T H E N;
WHILE: W H I L E;
CASE: C A S E;
ESAC: E S A C;
OF: O F;
NEW: N E W;
ISVOID: I S V O I D;
NOT: N O T;
ADD: '+';
SUB: '-';
DIV: '/';
MUL: '*';
LEFTPAREN: '(';
RIGHTPAREN: ')';
LEFTCURLY: '{';
RIGHTCURLY: '}';
EQUAL: '=';
LT: '<';
LE: '<=';
ASSIGN: '<-';
DARROW: '=>';
COLON: ':';
SEMICOLON: ';';
AT: '@';
COMMA: ',';
DOT: '.';
TL:'~';
//
WHITESPACE: [ \t\r\n]+ ->skip;
LINECOMMENT: '--' ~[\r\n]* -> skip;
//INT: 'Int';
//BOOL: 'Bool';
//STRING: 'String';
//OBJECT:'Object';
NUM: [0-9]+;
OBJECTID: [a-z][a-zA-Z0-9_]*;
TYPEID: [A-Z][a-zA-Z0-9_]*;
ERROR: . ;