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
текст
    {
        return makeSym(sym.ТЕКСТ);
    }
логизнач
    {
        return makeSym(sym.ЛОГИЗНАЧ);
    }
void
    {
        return makeSym(sym.VOIDTYPE);
    }
список
    {
        return makeSym(sym.СПИСОК);
    }
true
    {
        return makeSym(sym.ПРАВДА);
    }
false
    {
        return makeSym(sym.ЛОЖЬ);
    }
выход
    {
        return makeSym(sym.ВЫХОД);
    }
input
    {
        return makeSym(sym.INPUT);
    }
назад
    {
        return makeSym(sym.НАЗАД);
    }
until
    {
        return makeSym(sym.UNTIL);
    }
ошибка
    {
        return makeSym(sym.ОШИБКА);
    }
фанк
    {
        return makeSym(sym.ФАНК);
    }
if
    {
        return makeSym(sym.ЕСЛИ);
    }
else
    {
        return makeSym(sym.ЕЩЕ);
    }
for
    {
        return makeSym(sym.FOR);
    }
while
    {
        return makeSym(sym.ДО);
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
        return makeSym(sym.ПЛЮС);
    }
(\-)
    {
        return makeSym(sym.МИНУС);
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
        return makeSym(sym.РОВНЯ);
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
(\.)
    {
        return makeSym(sym.ЕНДЛ);
    }


/* values */
{DIGIT}+(,{DIGIT}+)?
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
