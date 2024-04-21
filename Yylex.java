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
    "\11\0\1\0\1\4\1\56\1\57\1\3\22\0\1\0\1\42\1\61"+
    "\2\0\1\37\1\40\1\0\1\47\1\50\1\35\1\33\1\60\1\34"+
    "\1\0\1\36\12\1\1\54\1\53\1\43\1\32\1\44\1\55\1\0"+
    "\32\2\1\51\1\62\1\52\3\0\1\24\1\13\1\31\1\20\1\11"+
    "\1\23\1\2\1\30\1\17\1\2\1\26\1\15\1\7\1\5\1\14"+
    "\1\25\1\2\1\22\1\21\1\10\1\6\1\16\1\27\1\12\2\2"+
    "\1\45\1\41\1\46\7\0\1\56\u038a\0\100\2\u1bd8\0\1\56\1\56"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\2\2\17\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\2\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\1\1\24"+
    "\1\0\15\25\1\26\11\25\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\0\1\40\1\0"+
    "\1\24\1\41\17\25\1\42\5\25\1\43\1\44\1\45"+
    "\1\46\1\25\1\47\1\25\1\50\1\51\4\25\1\52"+
    "\3\25\1\53\1\54\1\55\1\56\1\57\3\25\1\60"+
    "\1\61\1\62\1\25\1\63\1\64\1\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
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
    "\0\0\0\63\0\146\0\231\0\314\0\63\0\377\0\u0132"+
    "\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca"+
    "\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\63\0\63"+
    "\0\63\0\63\0\63\0\u042f\0\u0462\0\63\0\u0495\0\u04c8"+
    "\0\63\0\63\0\63\0\63\0\u04fb\0\63\0\63\0\63"+
    "\0\u052e\0\u0561\0\146\0\u0594\0\231\0\u05c7\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5"+
    "\0\u07f8\0\231\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a"+
    "\0\u095d\0\u0990\0\u09c3\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\u0561\0\63\0\u09f6\0\u0594"+
    "\0\231\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b"+
    "\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3"+
    "\0\231\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\231\0\231"+
    "\0\231\0\231\0\u0e25\0\231\0\u0e58\0\231\0\231\0\u0e8b"+
    "\0\u0ebe\0\u0ef1\0\u0f24\0\231\0\u0f57\0\u0f8a\0\u0fbd\0\231"+
    "\0\231\0\231\0\231\0\231\0\u0ff0\0\u1023\0\u1056\0\231"+
    "\0\231\0\231\0\u1089\0\231\0\231\0\231";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\4"+
    "\1\11\1\12\1\4\1\13\1\4\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\4\1\23\1\4\1\24"+
    "\1\4\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\0\1\6"+
    "\1\2\1\52\1\2\64\0\1\53\56\0\1\54\3\0"+
    "\2\55\2\0\25\55\35\0\1\6\57\0\2\55\2\0"+
    "\1\55\1\56\23\55\32\0\2\55\2\0\1\57\24\55"+
    "\32\0\2\55\2\0\4\55\1\60\10\55\1\61\7\55"+
    "\32\0\2\55\2\0\5\55\1\62\2\55\1\63\4\55"+
    "\1\64\7\55\32\0\2\55\2\0\7\55\1\65\5\55"+
    "\1\66\7\55\32\0\2\55\2\0\12\55\1\67\12\55"+
    "\32\0\2\55\2\0\7\55\1\70\15\55\32\0\2\55"+
    "\2\0\1\71\15\55\1\72\6\55\32\0\2\55\2\0"+
    "\4\55\1\73\20\55\32\0\2\55\2\0\22\55\1\74"+
    "\2\55\32\0\2\55\2\0\4\55\1\75\20\55\32\0"+
    "\2\55\2\0\1\55\1\76\5\55\1\77\7\55\1\100"+
    "\5\55\32\0\2\55\2\0\15\55\1\101\7\55\32\0"+
    "\2\55\2\0\23\55\1\102\1\55\32\0\2\55\2\0"+
    "\17\55\1\103\5\55\63\0\1\104\70\0\1\105\63\0"+
    "\1\106\53\0\1\107\10\0\1\110\51\0\1\111\11\0"+
    "\1\112\73\0\1\113\57\0\1\114\10\0\61\115\1\116"+
    "\1\117\1\0\1\120\62\0\2\55\2\0\2\55\1\121"+
    "\22\55\32\0\2\55\2\0\3\55\1\122\21\55\32\0"+
    "\2\55\2\0\5\55\1\123\17\55\32\0\2\55\2\0"+
    "\1\55\1\124\23\55\32\0\2\55\2\0\12\55\1\125"+
    "\12\55\32\0\2\55\2\0\14\55\1\126\10\55\32\0"+
    "\2\55\2\0\15\55\1\127\7\55\32\0\2\55\2\0"+
    "\7\55\1\130\15\55\32\0\2\55\2\0\4\55\1\131"+
    "\20\55\32\0\2\55\2\0\14\55\1\132\10\55\32\0"+
    "\2\55\2\0\12\55\1\133\12\55\32\0\2\55\2\0"+
    "\20\55\1\134\4\55\32\0\2\55\2\0\16\55\1\135"+
    "\6\55\32\0\2\55\2\0\12\55\1\136\12\55\32\0"+
    "\2\55\2\0\3\55\1\137\21\55\32\0\2\55\2\0"+
    "\1\140\24\55\32\0\2\55\2\0\15\55\1\141\7\55"+
    "\32\0\2\55\2\0\10\55\1\142\14\55\32\0\2\55"+
    "\2\0\12\55\1\143\12\55\32\0\2\55\2\0\12\55"+
    "\1\144\12\55\32\0\2\55\2\0\14\55\1\145\10\55"+
    "\31\0\3\115\2\0\51\115\2\0\3\115\1\0\2\55"+
    "\2\0\12\55\1\146\12\55\32\0\2\55\2\0\3\55"+
    "\1\147\21\55\32\0\2\55\2\0\4\55\1\150\20\55"+
    "\32\0\2\55\2\0\3\55\1\151\21\55\32\0\2\55"+
    "\2\0\4\55\1\152\20\55\32\0\2\55\2\0\7\55"+
    "\1\153\15\55\32\0\2\55\2\0\10\55\1\154\14\55"+
    "\32\0\2\55\2\0\17\55\1\155\5\55\32\0\2\55"+
    "\2\0\3\55\1\156\21\55\32\0\2\55\2\0\13\55"+
    "\1\157\11\55\32\0\2\55\2\0\1\55\1\160\23\55"+
    "\32\0\2\55\2\0\17\55\1\161\5\55\32\0\2\55"+
    "\2\0\3\55\1\162\21\55\32\0\2\55\2\0\1\55"+
    "\1\163\23\55\32\0\2\55\2\0\21\55\1\164\3\55"+
    "\32\0\2\55\2\0\14\55\1\165\10\55\32\0\2\55"+
    "\2\0\1\166\24\55\32\0\2\55\2\0\10\55\1\167"+
    "\14\55\32\0\2\55\2\0\4\55\1\170\20\55\32\0"+
    "\2\55\2\0\10\55\1\171\14\55\32\0\2\55\2\0"+
    "\15\55\1\172\7\55\32\0\2\55\2\0\21\55\1\173"+
    "\3\55\32\0\2\55\2\0\3\55\1\174\21\55\32\0"+
    "\2\55\2\0\1\55\1\175\23\55\32\0\2\55\2\0"+
    "\24\55\1\176\32\0\2\55\2\0\15\55\1\177\7\55"+
    "\32\0\2\55\2\0\4\55\1\200\20\55\32\0\2\55"+
    "\2\0\3\55\1\201\21\55\32\0\2\55\2\0\4\55"+
    "\1\202\20\55\32\0\2\55\2\0\10\55\1\203\14\55"+
    "\32\0\2\55\2\0\23\55\1\204\1\55\32\0\2\55"+
    "\2\0\1\205\24\55\32\0\2\55\2\0\3\55\1\206"+
    "\21\55\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4284];
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
    "\2\1\4\11\1\1\3\11\3\1\1\0\27\1\11\11"+
    "\1\0\1\11\1\0\67\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
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
    while (i < 174) {
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
            { return makeSym(sym.ЕНДЛ);
            } 
            // fall through
          case 54: break;
          case 2: 
            { ;
            } 
            // fall through
          case 55: break;
          case 3: 
            { return makeSym(sym.РАВНО);
            } 
            // fall through
          case 56: break;
          case 4: 
            { return makeSym(sym.плюс);
            } 
            // fall through
          case 57: break;
          case 5: 
            { return makeSym(sym.MINUS);
            } 
            // fall through
          case 58: break;
          case 6: 
            { return makeSym(sym.TIMES);
            } 
            // fall through
          case 59: break;
          case 7: 
            { return makeSym(sym.DIVIDE);
            } 
            // fall through
          case 60: break;
          case 8: 
            { return makeSym(sym.MOD);
            } 
            // fall through
          case 61: break;
          case 9: 
            { return makeSym(sym.НЕТ);
            } 
            // fall through
          case 62: break;
          case 10: 
            { return makeSym(sym.LT);
            } 
            // fall through
          case 63: break;
          case 11: 
            { return makeSym(sym.GT);
            } 
            // fall through
          case 64: break;
          case 12: 
            { return makeSym(sym.ОТКУДРЯВЫЙ);
            } 
            // fall through
          case 65: break;
          case 13: 
            { return makeSym(sym.ЗАПКУДРЯВЫЙ);
            } 
            // fall through
          case 66: break;
          case 14: 
            { return makeSym(sym.ОТСКОБКА);
            } 
            // fall through
          case 67: break;
          case 15: 
            { return makeSym(sym.ЗАПСКОБКА);
            } 
            // fall through
          case 68: break;
          case 16: 
            { return makeSym(sym.OPENSQBRACE);
            } 
            // fall through
          case 69: break;
          case 17: 
            { return makeSym(sym.CLOSESQBRACE);
            } 
            // fall through
          case 70: break;
          case 18: 
            { return makeSym(sym.ПОЛОСРАСКОЛ);
            } 
            // fall through
          case 71: break;
          case 19: 
            { return makeSym(sym.COLON);
            } 
            // fall through
          case 72: break;
          case 20: 
            { return makeSym(sym.ЦЕЛ, yytext());
            } 
            // fall through
          case 73: break;
          case 21: 
            { return makeSym(sym.ИД, yytext());
            } 
            // fall through
          case 74: break;
          case 22: 
            { return makeSym(sym.IF);
            } 
            // fall through
          case 75: break;
          case 23: 
            { return makeSym(sym.EQUALS);
            } 
            // fall through
          case 76: break;
          case 24: 
            { return makeSym(sym.И);
            } 
            // fall through
          case 77: break;
          case 25: 
            { return makeSym(sym.ИЛИ);
            } 
            // fall through
          case 78: break;
          case 26: 
            { return makeSym(sym.LEQ);
            } 
            // fall through
          case 79: break;
          case 27: 
            { return makeSym(sym.READFILE);
            } 
            // fall through
          case 80: break;
          case 28: 
            { return makeSym(sym.GEQ);
            } 
            // fall through
          case 81: break;
          case 29: 
            { return makeSym(sym.WRITEFILE);
            } 
            // fall through
          case 82: break;
          case 30: 
            { return makeSym(sym.OPENFILTER);
            } 
            // fall through
          case 83: break;
          case 31: 
            { return makeSym(sym.CLOSEFILTER);
            } 
            // fall through
          case 84: break;
          case 32: 
            { return makeSym(sym.QSTRING, yytext());
            } 
            // fall through
          case 85: break;
          case 33: 
            { return makeSym(sym.NUMTYPE);
            } 
            // fall through
          case 86: break;
          case 34: 
            { return makeSym(sym.FOR);
            } 
            // fall through
          case 87: break;
          case 35: 
            { return makeSym(sym.TEXTTYPE);
            } 
            // fall through
          case 88: break;
          case 36: 
            { return makeSym(sym.ПРАВДА);
            } 
            // fall through
          case 89: break;
          case 37: 
            { return makeSym(sym.EXIT);
            } 
            // fall through
          case 90: break;
          case 38: 
            { return makeSym(sym.ELSE);
            } 
            // fall through
          case 91: break;
          case 39: 
            { return makeSym(sym.BOOLTYPE);
            } 
            // fall through
          case 92: break;
          case 40: 
            { return makeSym(sym.LISTTYPE);
            } 
            // fall through
          case 93: break;
          case 41: 
            { return makeSym(sym.VOIDTYPE);
            } 
            // fall through
          case 94: break;
          case 42: 
            { return makeSym(sym.FUNC);
            } 
            // fall through
          case 95: break;
          case 43: 
            { return makeSym(sym.CASE);
            } 
            // fall through
          case 96: break;
          case 44: 
            { return makeSym(sym.UNTIL);
            } 
            // fall through
          case 97: break;
          case 45: 
            { return makeSym(sym.ERROR);
            } 
            // fall through
          case 98: break;
          case 46: 
            { return makeSym(sym.BREAK);
            } 
            // fall through
          case 99: break;
          case 47: 
            { return makeSym(sym.INPUT);
            } 
            // fall through
          case 100: break;
          case 48: 
            { return makeSym(sym.ЛОЖЬ);
            } 
            // fall through
          case 101: break;
          case 49: 
            { return makeSym(sym.ВЫХОД);
            } 
            // fall through
          case 102: break;
          case 50: 
            { return makeSym(sym.WHILE);
            } 
            // fall through
          case 103: break;
          case 51: 
            { return makeSym(sym.SWITCH);
            } 
            // fall through
          case 104: break;
          case 52: 
            { return makeSym(sym.RETURN);
            } 
            // fall through
          case 105: break;
          case 53: 
            { return makeSym(sym.DEFAULT);
            } 
            // fall through
          case 106: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
