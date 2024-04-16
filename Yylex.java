/* The following code was generated by JFlex 1.7.0 */

// Symbol
import java_cup.runtime.*;

/**
 * This class is the lexer (i.e., scanner) for the Streamer
 * language (that students complete in CSCI 340).
 */

class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\4\1\63\1\64\1\3\22\0\1\5\1\43\1\61"+
    "\2\0\1\40\1\41\1\0\1\50\1\51\1\36\1\34\1\54\1\35"+
    "\1\60\1\37\12\1\1\55\1\57\1\44\1\33\1\45\1\56\1\0"+
    "\32\2\1\52\1\62\1\53\3\0\1\25\1\14\1\32\1\21\1\12"+
    "\1\24\1\2\1\31\1\20\1\2\1\27\1\16\1\10\1\6\1\15"+
    "\1\26\1\2\1\23\1\22\1\11\1\7\1\17\1\30\1\13\2\2"+
    "\1\46\1\42\1\47\7\0\1\63\u1fa2\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\17\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\2\1\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\1\1\26\1\1\1\0\14\3\1\27\11\3\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\0\1\41\1\0\1\2\1\42\17\3\1\43\5\3"+
    "\1\44\1\45\1\46\1\47\1\3\1\50\1\3\1\51"+
    "\1\52\4\3\1\53\3\3\1\54\1\55\1\56\1\57"+
    "\1\60\3\3\1\61\1\62\1\63\1\3\1\64\1\65"+
    "\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\65\0\u0109\0\u013e"+
    "\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\65\0\65"+
    "\0\65\0\65\0\65\0\u0459\0\u048e\0\65\0\u04c3\0\u04f8"+
    "\0\65\0\65\0\65\0\65\0\u052d\0\65\0\65\0\65"+
    "\0\u0562\0\65\0\u0597\0\u05cc\0\u0601\0\u0636\0\u066b\0\u06a0"+
    "\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9\0\u07de\0\u0813\0\u0848"+
    "\0\237\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb"+
    "\0\u09f0\0\u0a25\0\65\0\65\0\65\0\65\0\65\0\65"+
    "\0\65\0\65\0\65\0\u0597\0\65\0\u0a5a\0\u05cc\0\237"+
    "\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u0c02"+
    "\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\237"+
    "\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\237\0\237\0\237"+
    "\0\237\0\u0eb3\0\237\0\u0ee8\0\237\0\237\0\u0f1d\0\u0f52"+
    "\0\u0f87\0\u0fbc\0\237\0\u0ff1\0\u1026\0\u105b\0\237\0\237"+
    "\0\237\0\237\0\237\0\u1090\0\u10c5\0\u10fa\0\237\0\237"+
    "\0\237\0\u112f\0\237\0\237\0\237";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\6\1\7\1\10\1\4"+
    "\1\11\1\12\1\4\1\13\1\4\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\4\1\23\1\4\1\24"+
    "\1\4\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\2"+
    "\1\53\1\2\1\0\1\6\66\0\1\3\56\0\1\54"+
    "\5\0\2\4\3\0\25\4\36\0\1\6\61\0\2\4"+
    "\3\0\1\4\1\55\23\4\33\0\2\4\3\0\1\56"+
    "\24\4\33\0\2\4\3\0\4\4\1\57\10\4\1\60"+
    "\7\4\33\0\2\4\3\0\5\4\1\61\2\4\1\62"+
    "\4\4\1\63\7\4\33\0\2\4\3\0\7\4\1\64"+
    "\5\4\1\65\7\4\33\0\2\4\3\0\12\4\1\66"+
    "\12\4\33\0\2\4\3\0\7\4\1\67\15\4\33\0"+
    "\2\4\3\0\1\70\15\4\1\71\6\4\33\0\2\4"+
    "\3\0\4\4\1\72\20\4\33\0\2\4\3\0\22\4"+
    "\1\73\2\4\33\0\2\4\3\0\4\4\1\74\20\4"+
    "\33\0\2\4\3\0\1\4\1\75\5\4\1\76\7\4"+
    "\1\77\5\4\33\0\2\4\3\0\15\4\1\100\7\4"+
    "\33\0\2\4\3\0\23\4\1\101\1\4\33\0\2\4"+
    "\3\0\17\4\1\102\5\4\65\0\1\103\72\0\1\104"+
    "\65\0\1\105\55\0\1\106\10\0\1\107\53\0\1\110"+
    "\11\0\1\111\75\0\1\112\61\0\1\113\11\0\61\114"+
    "\1\115\1\116\2\114\1\0\1\117\64\0\2\4\3\0"+
    "\2\4\1\120\22\4\33\0\2\4\3\0\3\4\1\121"+
    "\21\4\33\0\2\4\3\0\5\4\1\122\17\4\33\0"+
    "\2\4\3\0\1\4\1\123\23\4\33\0\2\4\3\0"+
    "\12\4\1\124\12\4\33\0\2\4\3\0\14\4\1\125"+
    "\10\4\33\0\2\4\3\0\15\4\1\126\7\4\33\0"+
    "\2\4\3\0\7\4\1\127\15\4\33\0\2\4\3\0"+
    "\4\4\1\130\20\4\33\0\2\4\3\0\14\4\1\131"+
    "\10\4\33\0\2\4\3\0\12\4\1\132\12\4\33\0"+
    "\2\4\3\0\20\4\1\133\4\4\33\0\2\4\3\0"+
    "\16\4\1\134\6\4\33\0\2\4\3\0\12\4\1\135"+
    "\12\4\33\0\2\4\3\0\3\4\1\136\21\4\33\0"+
    "\2\4\3\0\1\137\24\4\33\0\2\4\3\0\15\4"+
    "\1\140\7\4\33\0\2\4\3\0\10\4\1\141\14\4"+
    "\33\0\2\4\3\0\12\4\1\142\12\4\33\0\2\4"+
    "\3\0\12\4\1\143\12\4\33\0\2\4\3\0\14\4"+
    "\1\144\10\4\32\0\3\114\2\0\56\114\3\0\2\4"+
    "\3\0\12\4\1\145\12\4\33\0\2\4\3\0\3\4"+
    "\1\146\21\4\33\0\2\4\3\0\4\4\1\147\20\4"+
    "\33\0\2\4\3\0\3\4\1\150\21\4\33\0\2\4"+
    "\3\0\4\4\1\151\20\4\33\0\2\4\3\0\7\4"+
    "\1\152\15\4\33\0\2\4\3\0\10\4\1\153\14\4"+
    "\33\0\2\4\3\0\17\4\1\154\5\4\33\0\2\4"+
    "\3\0\3\4\1\155\21\4\33\0\2\4\3\0\13\4"+
    "\1\156\11\4\33\0\2\4\3\0\1\4\1\157\23\4"+
    "\33\0\2\4\3\0\17\4\1\160\5\4\33\0\2\4"+
    "\3\0\3\4\1\161\21\4\33\0\2\4\3\0\1\4"+
    "\1\162\23\4\33\0\2\4\3\0\21\4\1\163\3\4"+
    "\33\0\2\4\3\0\14\4\1\164\10\4\33\0\2\4"+
    "\3\0\1\165\24\4\33\0\2\4\3\0\10\4\1\166"+
    "\14\4\33\0\2\4\3\0\4\4\1\167\20\4\33\0"+
    "\2\4\3\0\10\4\1\170\14\4\33\0\2\4\3\0"+
    "\15\4\1\171\7\4\33\0\2\4\3\0\21\4\1\172"+
    "\3\4\33\0\2\4\3\0\3\4\1\173\21\4\33\0"+
    "\2\4\3\0\1\4\1\174\23\4\33\0\2\4\3\0"+
    "\24\4\1\175\33\0\2\4\3\0\15\4\1\176\7\4"+
    "\33\0\2\4\3\0\4\4\1\177\20\4\33\0\2\4"+
    "\3\0\3\4\1\200\21\4\33\0\2\4\3\0\4\4"+
    "\1\201\20\4\33\0\2\4\3\0\10\4\1\202\14\4"+
    "\33\0\2\4\3\0\23\4\1\203\1\4\33\0\2\4"+
    "\3\0\1\204\24\4\33\0\2\4\3\0\3\4\1\205"+
    "\21\4\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4452];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\20\1\5\11\2\1\1\11"+
    "\2\1\4\11\1\1\3\11\1\1\1\11\1\1\1\0"+
    "\26\1\11\11\1\0\1\11\1\0\67\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Error("Illegal character <" + yytext() + "> at line " +
                        (yyline+1) + " column " + (yycolumn+1));
            } 
            // fall through
          case 55: break;
          case 2: 
            { return makeSym(sym.NUM, yytext());
            } 
            // fall through
          case 56: break;
          case 3: 
            { return makeSym(sym.ИД, yytext());
            } 
            // fall through
          case 57: break;
          case 4: 
            { ;
            } 
            // fall through
          case 58: break;
          case 5: 
            { return makeSym(sym.ASSIGN);
            } 
            // fall through
          case 59: break;
          case 6: 
            { return makeSym(sym.PLUS);
            } 
            // fall through
          case 60: break;
          case 7: 
            { return makeSym(sym.MINUS);
            } 
            // fall through
          case 61: break;
          case 8: 
            { return makeSym(sym.TIMES);
            } 
            // fall through
          case 62: break;
          case 9: 
            { return makeSym(sym.DIVIDE);
            } 
            // fall through
          case 63: break;
          case 10: 
            { return makeSym(sym.MOD);
            } 
            // fall through
          case 64: break;
          case 11: 
            { return makeSym(sym.NOT);
            } 
            // fall through
          case 65: break;
          case 12: 
            { return makeSym(sym.LT);
            } 
            // fall through
          case 66: break;
          case 13: 
            { return makeSym(sym.GT);
            } 
            // fall through
          case 67: break;
          case 14: 
            { return makeSym(sym.OPENCURLY);
            } 
            // fall through
          case 68: break;
          case 15: 
            { return makeSym(sym.CLOSECURLY);
            } 
            // fall through
          case 69: break;
          case 16: 
            { return makeSym(sym.OPENPAREN);
            } 
            // fall through
          case 70: break;
          case 17: 
            { return makeSym(sym.CLOSEPAREN);
            } 
            // fall through
          case 71: break;
          case 18: 
            { return makeSym(sym.OPENSQBRACE);
            } 
            // fall through
          case 72: break;
          case 19: 
            { return makeSym(sym.CLOSESQBRACE);
            } 
            // fall through
          case 73: break;
          case 20: 
            { return makeSym(sym.COMMA);
            } 
            // fall through
          case 74: break;
          case 21: 
            { return makeSym(sym.COLON);
            } 
            // fall through
          case 75: break;
          case 22: 
            { return makeSym(sym.SEMICOLON);
            } 
            // fall through
          case 76: break;
          case 23: 
            { return makeSym(sym.IF);
            } 
            // fall through
          case 77: break;
          case 24: 
            { return makeSym(sym.EQUALS);
            } 
            // fall through
          case 78: break;
          case 25: 
            { return makeSym(sym.AND);
            } 
            // fall through
          case 79: break;
          case 26: 
            { return makeSym(sym.ИЛИ);
            } 
            // fall through
          case 80: break;
          case 27: 
            { return makeSym(sym.LEQ);
            } 
            // fall through
          case 81: break;
          case 28: 
            { return makeSym(sym.READFILE);
            } 
            // fall through
          case 82: break;
          case 29: 
            { return makeSym(sym.GEQ);
            } 
            // fall through
          case 83: break;
          case 30: 
            { return makeSym(sym.WRITEFILE);
            } 
            // fall through
          case 84: break;
          case 31: 
            { return makeSym(sym.OPENFILTER);
            } 
            // fall through
          case 85: break;
          case 32: 
            { return makeSym(sym.CLOSEFILTER);
            } 
            // fall through
          case 86: break;
          case 33: 
            { return makeSym(sym.QSTRING, yytext());
            } 
            // fall through
          case 87: break;
          case 34: 
            { return makeSym(sym.NUMTYPE);
            } 
            // fall through
          case 88: break;
          case 35: 
            { return makeSym(sym.FOR);
            } 
            // fall through
          case 89: break;
          case 36: 
            { return makeSym(sym.TEXTTYPE);
            } 
            // fall through
          case 90: break;
          case 37: 
            { return makeSym(sym.TRUE);
            } 
            // fall through
          case 91: break;
          case 38: 
            { return makeSym(sym.EXIT);
            } 
            // fall through
          case 92: break;
          case 39: 
            { return makeSym(sym.ELSE);
            } 
            // fall through
          case 93: break;
          case 40: 
            { return makeSym(sym.BOOLTYPE);
            } 
            // fall through
          case 94: break;
          case 41: 
            { return makeSym(sym.LISTTYPE);
            } 
            // fall through
          case 95: break;
          case 42: 
            { return makeSym(sym.VOIDTYPE);
            } 
            // fall through
          case 96: break;
          case 43: 
            { return makeSym(sym.FUNC);
            } 
            // fall through
          case 97: break;
          case 44: 
            { return makeSym(sym.CASE);
            } 
            // fall through
          case 98: break;
          case 45: 
            { return makeSym(sym.UNTIL);
            } 
            // fall through
          case 99: break;
          case 46: 
            { return makeSym(sym.ERROR);
            } 
            // fall through
          case 100: break;
          case 47: 
            { return makeSym(sym.BREAK);
            } 
            // fall through
          case 101: break;
          case 48: 
            { return makeSym(sym.INPUT);
            } 
            // fall through
          case 102: break;
          case 49: 
            { return makeSym(sym.FALSE);
            } 
            // fall through
          case 103: break;
          case 50: 
            { return makeSym(sym.PRINT);
            } 
            // fall through
          case 104: break;
          case 51: 
            { return makeSym(sym.WHILE);
            } 
            // fall through
          case 105: break;
          case 52: 
            { return makeSym(sym.SWITCH);
            } 
            // fall through
          case 106: break;
          case 53: 
            { return makeSym(sym.RETURN);
            } 
            // fall through
          case 107: break;
          case 54: 
            { return makeSym(sym.DEFAULT);
            } 
            // fall through
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
