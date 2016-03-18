/* The following code was generated by JFlex 1.6.1 */

package plic.analyse ;

import java_cup.runtime.*;
import plic.exceptions.AnalyseLexicaleException;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/plic/analyse/AnalyseurLexical.jflex</tt>
 */
public class AnalyseurLexical implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\16\1\2\1\3\1\2\1\2\22\0\1\16\1\25\1\14"+
    "\5\0\1\34\1\35\1\21\1\17\1\24\1\20\1\0\1\1\12\4"+
    "\1\0\1\23\1\26\1\22\1\27\2\0\32\15\1\36\1\0\1\37"+
    "\3\0\1\7\1\44\1\40\1\43\1\30\1\11\2\15\1\10\2\15"+
    "\1\41\1\15\1\33\1\32\1\45\1\46\1\6\1\42\1\31\1\12"+
    "\1\5\1\15\1\13\2\15\12\0\1\3\u1fa2\0\1\3\1\3\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\5\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15"+
    "\4\5\1\16\1\17\1\20\1\21\5\5\1\3\6\5"+
    "\1\0\1\22\1\23\1\24\1\25\3\5\1\26\3\5"+
    "\1\27\10\5\1\30\1\31\4\5\1\32\7\5\1\33"+
    "\10\5\1\34\4\5\1\35\1\5\1\36\6\5\1\37"+
    "\1\40\4\5\1\41\1\42\2\5\1\43\1\44\1\5"+
    "\1\45\1\5\1\46\1\47\2\5\1\50\1\5\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
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
    "\0\0\0\47\0\116\0\47\0\165\0\234\0\303\0\352"+
    "\0\u0111\0\u0138\0\u015f\0\47\0\47\0\47\0\u0186\0\47"+
    "\0\47\0\u01ad\0\47\0\47\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\47\0\47\0\47\0\47\0\u0270\0\u0297\0\u02be\0\u02e5"+
    "\0\u030c\0\u0333\0\u035a\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d"+
    "\0\u015f\0\47\0\47\0\47\0\u0111\0\u0444\0\u046b\0\u0492"+
    "\0\u0111\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3"+
    "\0\u05ca\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u0111\0\u06b4"+
    "\0\u06db\0\u0702\0\u0729\0\u0111\0\u0750\0\u0777\0\u079e\0\u07c5"+
    "\0\u07ec\0\u0813\0\u083a\0\u0111\0\u0861\0\u0888\0\u08af\0\u08d6"+
    "\0\u08fd\0\u0924\0\u094b\0\u0972\0\u0111\0\u0999\0\u09c0\0\u09e7"+
    "\0\u0a0e\0\u0111\0\u0a35\0\u0111\0\u0a5c\0\u0a83\0\u0aaa\0\u0ad1"+
    "\0\u0af8\0\u0b1f\0\u0111\0\u0111\0\u0b46\0\u0b6d\0\u0b94\0\u0bbb"+
    "\0\u0111\0\u0111\0\u0be2\0\u0c09\0\u0111\0\u0111\0\u0c30\0\u0111"+
    "\0\u0c57\0\u0111\0\u0111\0\u0c7e\0\u0ca5\0\u0111\0\u0ccc\0\u0111";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
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
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\2\11\1\13\1\11\1\4\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\11\1\41\1\11\50\0\1\42"+
    "\51\0\1\5\46\0\2\11\1\43\5\11\1\0\1\11"+
    "\12\0\4\11\4\0\7\11\4\0\10\11\1\0\1\11"+
    "\12\0\1\44\3\11\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\4\11\4\0\1\11\1\45\5\11\4\0"+
    "\10\11\1\0\1\11\12\0\4\11\4\0\7\11\4\0"+
    "\3\11\1\46\1\47\3\11\1\0\1\11\12\0\4\11"+
    "\4\0\2\11\1\50\4\11\4\0\10\51\1\52\1\51"+
    "\12\0\4\51\4\0\7\51\22\0\1\53\46\0\1\54"+
    "\30\0\10\11\1\0\1\11\12\0\1\11\1\55\1\11"+
    "\1\56\4\0\1\57\6\11\4\0\3\11\1\60\4\11"+
    "\1\0\1\11\12\0\4\11\4\0\7\11\4\0\6\11"+
    "\1\61\1\11\1\0\1\11\12\0\4\11\4\0\7\11"+
    "\4\0\10\11\1\0\1\11\12\0\2\11\1\62\1\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\4\11"+
    "\4\0\1\11\1\63\5\11\4\0\4\11\1\64\3\11"+
    "\1\0\1\11\12\0\4\11\4\0\7\11\4\0\4\11"+
    "\1\65\3\11\1\0\1\11\12\0\4\11\4\0\7\11"+
    "\4\0\10\11\1\0\1\11\12\0\1\66\3\11\4\0"+
    "\7\11\4\0\2\11\1\67\3\11\1\70\1\11\1\0"+
    "\1\11\12\0\2\11\1\71\1\11\4\0\7\11\2\42"+
    "\2\0\43\42\4\0\3\11\1\72\4\11\1\0\1\11"+
    "\12\0\4\11\4\0\7\11\4\0\10\11\1\0\1\11"+
    "\12\0\4\11\4\0\5\11\1\73\1\11\4\0\10\11"+
    "\1\0\1\11\12\0\2\11\1\74\1\11\4\0\7\11"+
    "\4\0\6\11\1\75\1\11\1\0\1\11\12\0\4\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\3\11"+
    "\1\76\4\0\7\11\4\0\4\11\1\77\3\11\1\0"+
    "\1\11\12\0\4\11\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\1\11\1\100\2\11\4\0\7\11\4\0"+
    "\2\11\1\101\5\11\1\0\1\11\12\0\4\11\4\0"+
    "\7\11\4\0\10\11\1\0\1\11\12\0\3\11\1\102"+
    "\4\0\7\11\4\0\6\11\1\103\1\11\1\0\1\11"+
    "\12\0\3\11\1\104\4\0\7\11\4\0\3\11\1\105"+
    "\4\11\1\0\1\11\12\0\4\11\4\0\7\11\4\0"+
    "\2\11\1\106\5\11\1\0\1\11\12\0\4\11\4\0"+
    "\7\11\4\0\10\11\1\0\1\11\12\0\3\11\1\107"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\4\11"+
    "\4\0\4\11\1\110\2\11\4\0\4\11\1\111\3\11"+
    "\1\0\1\11\12\0\4\11\4\0\7\11\4\0\10\11"+
    "\1\0\1\11\12\0\4\11\4\0\4\11\1\112\2\11"+
    "\4\0\6\11\1\113\1\11\1\0\1\11\12\0\4\11"+
    "\4\0\7\11\4\0\4\11\1\114\3\11\1\0\1\11"+
    "\12\0\4\11\4\0\7\11\4\0\10\11\1\0\1\11"+
    "\12\0\1\115\3\11\4\0\7\11\4\0\2\11\1\116"+
    "\5\11\1\0\1\11\12\0\4\11\4\0\7\11\4\0"+
    "\7\11\1\114\1\0\1\11\12\0\4\11\4\0\7\11"+
    "\4\0\10\11\1\0\1\11\12\0\1\11\1\117\2\11"+
    "\4\0\7\11\4\0\4\11\1\120\3\11\1\0\1\11"+
    "\12\0\4\11\4\0\7\11\4\0\4\11\1\121\3\11"+
    "\1\0\1\11\12\0\4\11\4\0\7\11\4\0\10\11"+
    "\1\0\1\11\12\0\1\11\1\122\2\11\4\0\7\11"+
    "\4\0\1\11\1\123\6\11\1\0\1\11\12\0\4\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\4\11"+
    "\4\0\2\11\1\124\4\11\4\0\10\11\1\0\1\11"+
    "\12\0\1\125\3\11\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\2\11\1\126\1\11\4\0\7\11\4\0"+
    "\6\11\1\127\1\11\1\0\1\11\12\0\4\11\4\0"+
    "\7\11\4\0\1\11\1\130\6\11\1\0\1\11\12\0"+
    "\4\11\4\0\7\11\4\0\10\11\1\0\1\11\12\0"+
    "\4\11\4\0\1\11\1\131\5\11\4\0\2\11\1\132"+
    "\5\11\1\0\1\11\12\0\4\11\4\0\7\11\4\0"+
    "\10\11\1\0\1\11\12\0\1\11\1\133\2\11\4\0"+
    "\7\11\4\0\10\11\1\0\1\11\12\0\4\11\4\0"+
    "\2\11\1\134\4\11\4\0\3\11\1\135\4\11\1\0"+
    "\1\11\12\0\4\11\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\1\136\3\11\4\0\7\11\4\0\2\11"+
    "\1\137\5\11\1\0\1\11\12\0\4\11\4\0\7\11"+
    "\4\0\10\11\1\0\1\11\12\0\4\11\4\0\6\11"+
    "\1\140\4\0\10\11\1\0\1\11\12\0\1\141\3\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\4\11"+
    "\4\0\2\11\1\142\4\11\4\0\10\11\1\0\1\11"+
    "\12\0\3\11\1\143\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\1\11\1\144\2\11\4\0\7\11\4\0"+
    "\10\11\1\0\1\11\12\0\1\145\3\11\4\0\7\11"+
    "\4\0\4\11\1\146\3\11\1\0\1\11\12\0\4\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\1\147"+
    "\3\11\4\0\7\11\4\0\10\11\1\0\1\11\12\0"+
    "\3\11\1\150\4\0\7\11\4\0\2\11\1\151\5\11"+
    "\1\0\1\11\12\0\4\11\4\0\7\11\4\0\10\11"+
    "\1\0\1\11\12\0\1\152\3\11\4\0\7\11\4\0"+
    "\6\11\1\153\1\11\1\0\1\11\12\0\4\11\4\0"+
    "\7\11\4\0\3\11\1\154\4\11\1\0\1\11\12\0"+
    "\4\11\4\0\7\11\4\0\10\11\1\0\1\11\12\0"+
    "\1\155\3\11\4\0\7\11\4\0\10\11\1\0\1\11"+
    "\12\0\1\156\3\11\4\0\7\11\4\0\10\11\1\0"+
    "\1\11\12\0\4\11\4\0\6\11\1\157\4\0\2\11"+
    "\1\160\5\11\1\0\1\11\12\0\4\11\4\0\7\11"+
    "\4\0\10\11\1\0\1\11\12\0\1\11\1\161\2\11"+
    "\4\0\7\11\4\0\10\11\1\0\1\11\12\0\1\162"+
    "\3\11\4\0\7\11\4\0\6\11\1\163\1\11\1\0"+
    "\1\11\12\0\4\11\4\0\7\11\4\0\6\11\1\164"+
    "\1\11\1\0\1\11\12\0\4\11\4\0\7\11\4\0"+
    "\10\11\1\0\1\11\12\0\4\11\4\0\6\11\1\165"+
    "\4\0\10\11\1\0\1\11\12\0\1\166\3\11\4\0"+
    "\7\11\4\0\6\11\1\167\1\11\1\0\1\11\12\0"+
    "\4\11\4\0\7\11\4\0\10\11\1\0\1\11\12\0"+
    "\1\170\3\11\4\0\7\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3315];
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
    "\1\0\1\11\1\1\1\11\7\1\3\11\1\1\2\11"+
    "\1\1\2\11\4\1\4\11\14\1\1\0\3\11\114\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
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
  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalyseurLexical(java.io.Reader in) {
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
    while (i < 152) {
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
  public Symbol next_token() throws java.io.IOException {
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
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          {         return symbol(CodesLexicaux.EOF) ;
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new AnalyseLexicaleException(yyline, yycolumn, yytext()) ;
            }
          case 42: break;
          case 2: 
            { return symbol(CodesLexicaux.DIV);
            }
          case 43: break;
          case 3: 
            { 
            }
          case 44: break;
          case 4: 
            { return symbol(CodesLexicaux.CSTEINT, yytext());
            }
          case 45: break;
          case 5: 
            { return symbol(CodesLexicaux.IDF,yytext());
            }
          case 46: break;
          case 6: 
            { return symbol(CodesLexicaux.PLUS);
            }
          case 47: break;
          case 7: 
            { return symbol(CodesLexicaux.MOINS);
            }
          case 48: break;
          case 8: 
            { return symbol(CodesLexicaux.MULT);
            }
          case 49: break;
          case 9: 
            { return symbol(CodesLexicaux.EGAL);
            }
          case 50: break;
          case 10: 
            { return symbol(CodesLexicaux.POINTVIRGULE);
            }
          case 51: break;
          case 11: 
            { return symbol(CodesLexicaux.VIRGULE);
            }
          case 52: break;
          case 12: 
            { return symbol(CodesLexicaux.INF);
            }
          case 53: break;
          case 13: 
            { return symbol(CodesLexicaux.SUP);
            }
          case 54: break;
          case 14: 
            { return symbol(CodesLexicaux.PAROUV);
            }
          case 55: break;
          case 15: 
            { return symbol(CodesLexicaux.PARFER);
            }
          case 56: break;
          case 16: 
            { return symbol(CodesLexicaux.CROOUV);
            }
          case 57: break;
          case 17: 
            { return symbol(CodesLexicaux.CROFER);
            }
          case 58: break;
          case 18: 
            { return symbol(CodesLexicaux.CSTECHAINE, yytext() );
            }
          case 59: break;
          case 19: 
            { return symbol(CodesLexicaux.EGALEGAL);
            }
          case 60: break;
          case 20: 
            { return symbol(CodesLexicaux.DIFF);
            }
          case 61: break;
          case 21: 
            { return symbol(CodesLexicaux.ET);
            }
          case 62: break;
          case 22: 
            { return symbol(CodesLexicaux.OU);
            }
          case 63: break;
          case 23: 
            { return symbol(CodesLexicaux.SI);
            }
          case 64: break;
          case 24: 
            { return symbol(CodesLexicaux.FIN);
            }
          case 65: break;
          case 25: 
            { return symbol(CodesLexicaux.FSI);
            }
          case 66: break;
          case 26: 
            { return symbol(CodesLexicaux.NON);
            }
          case 67: break;
          case 27: 
            { return symbol(CodesLexicaux.CSTEBOOL, yytext());
            }
          case 68: break;
          case 28: 
            { return symbol(CodesLexicaux.LIR);
            }
          case 69: break;
          case 29: 
            { return symbol(CodesLexicaux.POUR);
            }
          case 70: break;
          case 30: 
            { return symbol(CodesLexicaux.ALORS);
            }
          case 71: break;
          case 31: 
            { return symbol(CodesLexicaux.SINON);
            }
          case 72: break;
          case 32: 
            { return symbol(CodesLexicaux.DEBUT);
            }
          case 73: break;
          case 33: 
            { return symbol(CodesLexicaux.ENTIER);
            }
          case 74: break;
          case 34: 
            { return symbol(CodesLexicaux.ECRIR);
            }
          case 75: break;
          case 35: 
            { return symbol(CodesLexicaux.CLASS);
            }
          case 76: break;
          case 36: 
            { return symbol(CodesLexicaux.PRIVEE);
            }
          case 77: break;
          case 37: 
            { return symbol(CodesLexicaux.REPETER);
            }
          case 78: break;
          case 38: 
            { return symbol(CodesLexicaux.TANTQUE);
            }
          case 79: break;
          case 39: 
            { return symbol(CodesLexicaux.NOUVEAU);
            }
          case 80: break;
          case 40: 
            { return symbol(CodesLexicaux.PUBLIQUE);
            }
          case 81: break;
          case 41: 
            { return symbol(CodesLexicaux.FINTANTQUE);
            }
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
