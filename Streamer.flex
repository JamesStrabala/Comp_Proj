// Symbol
import java_cup.runtime.*;

/**
 * This class is the lexer (i.e., scanner) for the Streamer
 * language (that students complete in CSCI 340).
 */
%%

%class Yylex
%unicode
%cup
%line
%column

%{
/**
 * Make symbol of the given type, with a String value.
 */
private Symbol makeSym(int type, String value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
}

/**
 * Make a symbol of the given type, with no value.
 */
private Symbol makeSym(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
}
%}

DIGIT  = [0-9]
LETTER = [A-Za-z] | [А-Яа-я]
WS     = (\r|\n|\r\n) | [ \t\f]

%state STRING

%%

/* keywords */
num
    {
        return makeSym(sym.NUMTYPE);
    }
text
    {
        return makeSym(sym.TEXTTYPE);
    }
bool
    {
        return makeSym(sym.BOOLTYPE);
    }
void
    {
        return makeSym(sym.VOIDTYPE);
    }
list
    {
        return makeSym(sym.LISTTYPE);
    }
true
    {
        return makeSym(sym.ПРАВДА);
    }
false
    {
        return makeSym(sym.ЛОЖЬ);
    }
print
    {
        return makeSym(sym.ВЫХОД);
    }
input
    {
        return makeSym(sym.INPUT);
    }
exit
    {
        return makeSym(sym.EXIT);
    }
until
    {
        return makeSym(sym.UNTIL);
    }
error
    {
        return makeSym(sym.ERROR);
    }
funk
    {
        return makeSym(sym.FUNC);
    }
if
    {
        return makeSym(sym.IF);
    }
else
    {
        return makeSym(sym.ELSE);
    }
for
    {
        return makeSym(sym.FOR);
    }
while
    {
        return makeSym(sym.WHILE);
    }
break
    {
        return makeSym(sym.BREAK);
    }
return
    {
        return makeSym(sym.RETURN);
    }
switch
    {
        return makeSym(sym.SWITCH);
    }
case
    {
        return makeSym(sym.CASE);
    }
default
    {
        return makeSym(sym.DEFAULT);
    }



/* operators and other important chars */
(=)
    {
        return makeSym(sym.РАВНО);
    }
(\+)
    {
        return makeSym(sym.PLUS);
    }
(\-)
    {
        return makeSym(sym.MINUS);
    }
(\*)
    {
        return makeSym(sym.TIMES);
    }
(\/)
    {
        return makeSym(sym.DIVIDE);
    }
(\%)
    {
        return makeSym(sym.MOD);
    }
(\&\&)
    {
        return makeSym(sym.И);
    }
(\|\|)
    {
        return makeSym(sym.ИЛИ);
    }
(\!)
    {
        return makeSym(sym.НЕТ);
    }
(\=\=)
    {
        return makeSym(sym.EQUALS);
    }
(\<)
    {
        return makeSym(sym.LT);
    }
(\>)
    {
        return makeSym(sym.GT);
    }
(\<\=)
    {
        return makeSym(sym.LEQ);
    }
(\>\=)
    {
        return makeSym(sym.GEQ);
    }
(\{)
    {
        return makeSym(sym.ОТКУДРЯВЫЙ);
    }
(\})
    {
        return makeSym(sym.ЗАПКУДРЯВЫЙ);
    }
(\()
    {
        return makeSym(sym.ОТСКОБКА);
    }
(\))
    {
        return makeSym(sym.ЗАПСКОБКА);
    }
(\[)
    {
        return makeSym(sym.OPENSQBRACE);
    }
(\])
    {
        return makeSym(sym.CLOSESQBRACE);
    }
/* use a semicolon to separate items in a list instead of a comma */

(;)
    {
        return makeSym(sym.ПОЛОСРАСКОЛ);
    }
(:)
    {
        return makeSym(sym.COLON);
    }
(\<\<)
    {
        return makeSym(sym.READFILE);
    }
(\>\>)
    {
        return makeSym(sym.WRITEFILE);
    }
(\[\?)
    {
        return makeSym(sym.OPENFILTER);
    }
(\?\])
    {
        return makeSym(sym.CLOSEFILTER);
    }
/* use periods instead of semicolons */
(.)
    {
        return makeSym(sym.ЕНДЛ);
    }


/* values */
{DIGIT}+(\.{DIGIT}+)?
    {
        return makeSym(sym.ЦЕЛ, yytext());
    }
\"(\\.|[^\\\"])*\"
    {
        return makeSym(sym.QSTRING, yytext());
    }
{LETTER}({LETTER}|{DIGIT})*
    {
        return makeSym(sym.ИД, yytext());
    }

/* whitespace */
{WS}
    {
        ;
    }

/* error fallback */
.
    {
        throw new Error("Illegal character <" + yytext() + "> at line " +
                        (yyline+1) + " column " + (yycolumn+1));
    }
