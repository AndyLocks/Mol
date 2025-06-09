grammar Mol;

WS
    : [ \t\r\u000C_]+ -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;

COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;

EMPTY_LINE
    : [ \t]* ('\r'? '\n')
    ;

emptyLine
    : EMPTY_LINE
    ;

DOUBLE
    : (DECIMAL_DIGIT+) '.' (DECIMAL_DIGIT+)
    ;

INT
    : DECIMAL_DIGIT+
    ;

LP
    : '('
    ;

RP
    : ')'
    ;

COMMA
    : ','
    ;

ARROW
    : '->'
    ;

SEMI
    : ';'
    ;

NEWLINE
    : ('\r'? '\n')
    ;

PLUS
    : '+'
    ;

BIG_LETTER
    : [A-Z]
    ;

SMALL_LETTER
    : [a-z]
    ;

fragment DECIMAL_DIGIT
    : [0-9]
    ;

atom
    : BIG_LETTER (SMALL_LETTER)*
    ;

molecule
    : atom (atom | '_' | INT)*
    ;

intMolecule
    : INT? molecule
    ;

reagents
    : LP? intMolecule ( (COMMA | PLUS) intMolecule)* RP?
    ;

products
    : LP? intMolecule ( (COMMA | PLUS) intMolecule)* RP?
    ;

reaction
    : reagents ARROW products (SEMI | NEWLINE)
    ;

reactoins
    : reaction*
    ;