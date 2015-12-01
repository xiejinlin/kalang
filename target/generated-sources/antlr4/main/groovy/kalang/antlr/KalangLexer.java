// Generated from Kalang.g4 by ANTLR 4.4
package main.groovy.kalang.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KalangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, ABSTRACT=7, ASSERT=8, 
		BOOLEAN=9, BREAK=10, BYTE=11, CASE=12, CATCH=13, CHAR=14, CLASS=15, CONST=16, 
		CONTINUE=17, DEFAULT=18, DO=19, DOUBLE=20, ELSE=21, ENUM=22, EXTENDS=23, 
		FINAL=24, FINALLY=25, FLOAT=26, FOR=27, IF=28, GOTO=29, IMPLEMENTS=30, 
		IMPORT=31, INSTANCEOF=32, INT=33, INTERFACE=34, LONG=35, NATIVE=36, NEW=37, 
		PACKAGE=38, PRIVATE=39, PROTECTED=40, PUBLIC=41, RETURN=42, SHORT=43, 
		STATIC=44, STRICTFP=45, SUPER=46, SWITCH=47, SYNCHRONIZED=48, THIS=49, 
		THROW=50, THROWS=51, TRANSIENT=52, TRY=53, VOID=54, VOLATILE=55, WHILE=56, 
		IntegerLiteral=57, FloatingPointLiteral=58, BooleanLiteral=59, CharacterLiteral=60, 
		StringLiteral=61, NullLiteral=62, LPAREN=63, RPAREN=64, LBRACE=65, RBRACE=66, 
		LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, ASSIGN=72, GT=73, LT=74, 
		BANG=75, TILDE=76, QUESTION=77, COLON=78, EQUAL=79, LE=80, GE=81, NOTEQUAL=82, 
		AND=83, OR=84, INC=85, DEC=86, ADD=87, SUB=88, MUL=89, DIV=90, BITAND=91, 
		BITOR=92, CARET=93, MOD=94, ADD_ASSIGN=95, SUB_ASSIGN=96, MUL_ASSIGN=97, 
		DIV_ASSIGN=98, AND_ASSIGN=99, OR_ASSIGN=100, XOR_ASSIGN=101, MOD_ASSIGN=102, 
		LSHIFT_ASSIGN=103, RSHIFT_ASSIGN=104, URSHIFT_ASSIGN=105, Identifier=106, 
		AT=107, ELLIPSIS=108, WS=109, COMMENT=110, LINE_COMMENT=111;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'['", "'\\'", "']'", "'^'", "'_'", "'`'", "'a'", "'b'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", 
		"'n'", "'o'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ABSTRACT", "ASSERT", 
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", 
		"HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", 
		"OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};


	public KalangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kalang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 146: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 147: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2q\u0450\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38"+
		"\38\39\39\39\39\39\39\3:\3:\3:\3:\5:\u02a3\n:\3;\3;\5;\u02a7\n;\3<\3<"+
		"\5<\u02ab\n<\3=\3=\5=\u02af\n=\3>\3>\5>\u02b3\n>\3?\3?\3@\3@\3@\5@\u02ba"+
		"\n@\3@\3@\3@\5@\u02bf\n@\5@\u02c1\n@\3A\3A\7A\u02c5\nA\fA\16A\u02c8\13"+
		"A\3A\5A\u02cb\nA\3B\3B\5B\u02cf\nB\3C\3C\3D\3D\5D\u02d5\nD\3E\6E\u02d8"+
		"\nE\rE\16E\u02d9\3F\3F\3F\3F\3G\3G\7G\u02e2\nG\fG\16G\u02e5\13G\3G\5G"+
		"\u02e8\nG\3H\3H\3I\3I\5I\u02ee\nI\3J\3J\5J\u02f2\nJ\3J\3J\3K\3K\7K\u02f8"+
		"\nK\fK\16K\u02fb\13K\3K\5K\u02fe\nK\3L\3L\3M\3M\5M\u0304\nM\3N\3N\3N\3"+
		"N\3O\3O\7O\u030c\nO\fO\16O\u030f\13O\3O\5O\u0312\nO\3P\3P\3Q\3Q\5Q\u0318"+
		"\nQ\3R\3R\5R\u031c\nR\3S\3S\3S\5S\u0321\nS\3S\5S\u0324\nS\3S\5S\u0327"+
		"\nS\3S\3S\3S\5S\u032c\nS\3S\5S\u032f\nS\3S\3S\3S\5S\u0334\nS\3S\3S\3S"+
		"\5S\u0339\nS\3T\3T\3T\3U\3U\3V\5V\u0341\nV\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y"+
		"\5Y\u034c\nY\3Z\3Z\5Z\u0350\nZ\3Z\3Z\3Z\5Z\u0355\nZ\3Z\3Z\5Z\u0359\nZ"+
		"\3[\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0369\n]\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\5^\u0373\n^\3_\3_\3`\3`\5`\u0379\n`\3`\3`\3a\6a\u037e\na\r"+
		"a\16a\u037f\3b\3b\5b\u0384\nb\3c\3c\3c\3c\5c\u038a\nc\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\5d\u0397\nd\3e\3e\3e\3e\3e\3e\3e\3f\3f\3g\3g\3g\3g\3"+
		"g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3"+
		"s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3"+
		"|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\7\u0093\u0416\n\u0093"+
		"\f\u0093\16\u0093\u0419\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0421\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u0429\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\6\u0098\u0432\n\u0098\r\u0098\16\u0098\u0433\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u043c\n\u0099\f\u0099"+
		"\16\u0099\u043f\13\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\7\u009a\u044a\n\u009a\f\u009a\16\u009a\u044d"+
		"\13\u009a\3\u009a\3\u009a\3\u043d\2\u009b\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\177\2"+
		"\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3"+
		"<\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b7\2\u00b9=\u00bb>\u00bd\2\u00bf?\u00c1\2\u00c3\2\u00c5\2\u00c7"+
		"\2\u00c9\2\u00cb\2\u00cd@\u00cfA\u00d1B\u00d3C\u00d5D\u00d7E\u00d9F\u00db"+
		"G\u00ddH\u00dfI\u00e1J\u00e3K\u00e5L\u00e7M\u00e9N\u00ebO\u00edP\u00ef"+
		"Q\u00f1R\u00f3S\u00f5T\u00f7U\u00f9V\u00fbW\u00fdX\u00ffY\u0101Z\u0103"+
		"[\u0105\\\u0107]\u0109^\u010b_\u010d`\u010fa\u0111b\u0113c\u0115d\u0117"+
		"e\u0119f\u011bg\u011dh\u011fi\u0121j\u0123k\u0125l\u0127\2\u0129\2\u012b"+
		"m\u012dn\u012fo\u0131p\u0133q\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;C"+
		"Hch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2"+
		"))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\u045e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u00a3\3\2"+
		"\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bf\3\2\2\2\2\u00cd\3\2\2\2\2"+
		"\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb"+
		"\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2"+
		"\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d"+
		"\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2"+
		"\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f"+
		"\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u012b\3\2\2"+
		"\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\3\u0135"+
		"\3\2\2\2\5\u0139\3\2\2\2\7\u013c\3\2\2\2\t\u0140\3\2\2\2\13\u0144\3\2"+
		"\2\2\r\u0147\3\2\2\2\17\u014b\3\2\2\2\21\u0154\3\2\2\2\23\u015b\3\2\2"+
		"\2\25\u0163\3\2\2\2\27\u0169\3\2\2\2\31\u016e\3\2\2\2\33\u0173\3\2\2\2"+
		"\35\u0179\3\2\2\2\37\u017e\3\2\2\2!\u0184\3\2\2\2#\u018a\3\2\2\2%\u0193"+
		"\3\2\2\2\'\u019b\3\2\2\2)\u019e\3\2\2\2+\u01a5\3\2\2\2-\u01aa\3\2\2\2"+
		"/\u01af\3\2\2\2\61\u01b7\3\2\2\2\63\u01bd\3\2\2\2\65\u01c5\3\2\2\2\67"+
		"\u01cb\3\2\2\29\u01cf\3\2\2\2;\u01d2\3\2\2\2=\u01d7\3\2\2\2?\u01e2\3\2"+
		"\2\2A\u01e9\3\2\2\2C\u01f4\3\2\2\2E\u01f8\3\2\2\2G\u0202\3\2\2\2I\u0207"+
		"\3\2\2\2K\u020e\3\2\2\2M\u0212\3\2\2\2O\u021a\3\2\2\2Q\u0222\3\2\2\2S"+
		"\u022c\3\2\2\2U\u0233\3\2\2\2W\u023a\3\2\2\2Y\u0240\3\2\2\2[\u0247\3\2"+
		"\2\2]\u0250\3\2\2\2_\u0256\3\2\2\2a\u025d\3\2\2\2c\u026a\3\2\2\2e\u026f"+
		"\3\2\2\2g\u0275\3\2\2\2i\u027c\3\2\2\2k\u0286\3\2\2\2m\u028a\3\2\2\2o"+
		"\u028f\3\2\2\2q\u0298\3\2\2\2s\u02a2\3\2\2\2u\u02a4\3\2\2\2w\u02a8\3\2"+
		"\2\2y\u02ac\3\2\2\2{\u02b0\3\2\2\2}\u02b4\3\2\2\2\177\u02c0\3\2\2\2\u0081"+
		"\u02c2\3\2\2\2\u0083\u02ce\3\2\2\2\u0085\u02d0\3\2\2\2\u0087\u02d4\3\2"+
		"\2\2\u0089\u02d7\3\2\2\2\u008b\u02db\3\2\2\2\u008d\u02df\3\2\2\2\u008f"+
		"\u02e9\3\2\2\2\u0091\u02ed\3\2\2\2\u0093\u02ef\3\2\2\2\u0095\u02f5\3\2"+
		"\2\2\u0097\u02ff\3\2\2\2\u0099\u0303\3\2\2\2\u009b\u0305\3\2\2\2\u009d"+
		"\u0309\3\2\2\2\u009f\u0313\3\2\2\2\u00a1\u0317\3\2\2\2\u00a3\u031b\3\2"+
		"\2\2\u00a5\u0338\3\2\2\2\u00a7\u033a\3\2\2\2\u00a9\u033d\3\2\2\2\u00ab"+
		"\u0340\3\2\2\2\u00ad\u0344\3\2\2\2\u00af\u0346\3\2\2\2\u00b1\u0348\3\2"+
		"\2\2\u00b3\u0358\3\2\2\2\u00b5\u035a\3\2\2\2\u00b7\u035d\3\2\2\2\u00b9"+
		"\u0368\3\2\2\2\u00bb\u0372\3\2\2\2\u00bd\u0374\3\2\2\2\u00bf\u0376\3\2"+
		"\2\2\u00c1\u037d\3\2\2\2\u00c3\u0383\3\2\2\2\u00c5\u0389\3\2\2\2\u00c7"+
		"\u0396\3\2\2\2\u00c9\u0398\3\2\2\2\u00cb\u039f\3\2\2\2\u00cd\u03a1\3\2"+
		"\2\2\u00cf\u03a6\3\2\2\2\u00d1\u03a8\3\2\2\2\u00d3\u03aa\3\2\2\2\u00d5"+
		"\u03ac\3\2\2\2\u00d7\u03ae\3\2\2\2\u00d9\u03b0\3\2\2\2\u00db\u03b2\3\2"+
		"\2\2\u00dd\u03b4\3\2\2\2\u00df\u03b6\3\2\2\2\u00e1\u03b8\3\2\2\2\u00e3"+
		"\u03ba\3\2\2\2\u00e5\u03bc\3\2\2\2\u00e7\u03be\3\2\2\2\u00e9\u03c0\3\2"+
		"\2\2\u00eb\u03c2\3\2\2\2\u00ed\u03c4\3\2\2\2\u00ef\u03c6\3\2\2\2\u00f1"+
		"\u03c9\3\2\2\2\u00f3\u03cc\3\2\2\2\u00f5\u03cf\3\2\2\2\u00f7\u03d2\3\2"+
		"\2\2\u00f9\u03d5\3\2\2\2\u00fb\u03d8\3\2\2\2\u00fd\u03db\3\2\2\2\u00ff"+
		"\u03de\3\2\2\2\u0101\u03e0\3\2\2\2\u0103\u03e2\3\2\2\2\u0105\u03e4\3\2"+
		"\2\2\u0107\u03e6\3\2\2\2\u0109\u03e8\3\2\2\2\u010b\u03ea\3\2\2\2\u010d"+
		"\u03ec\3\2\2\2\u010f\u03ee\3\2\2\2\u0111\u03f1\3\2\2\2\u0113\u03f4\3\2"+
		"\2\2\u0115\u03f7\3\2\2\2\u0117\u03fa\3\2\2\2\u0119\u03fd\3\2\2\2\u011b"+
		"\u0400\3\2\2\2\u011d\u0403\3\2\2\2\u011f\u0406\3\2\2\2\u0121\u040a\3\2"+
		"\2\2\u0123\u040e\3\2\2\2\u0125\u0413\3\2\2\2\u0127\u0420\3\2\2\2\u0129"+
		"\u0428\3\2\2\2\u012b\u042a\3\2\2\2\u012d\u042c\3\2\2\2\u012f\u0431\3\2"+
		"\2\2\u0131\u0437\3\2\2\2\u0133\u0445\3\2\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7g\2\2\u0137\u0138\7v\2\2\u0138\4\3\2\2\2\u0139\u013a\7]\2\2\u013a"+
		"\u013b\7_\2\2\u013b\6\3\2\2\2\u013c\u013d\7i\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7v\2\2\u013f\b\3\2\2\2\u0140\u0141\7x\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7t\2\2\u0143\n\3\2\2\2\u0144\u0145\7c\2\2\u0145\u0146\7u\2\2\u0146"+
		"\f\3\2\2\2\u0147\u0148\7x\2\2\u0148\u0149\7c\2\2\u0149\u014a\7n\2\2\u014a"+
		"\16\3\2\2\2\u014b\u014c\7c\2\2\u014c\u014d\7d\2\2\u014d\u014e\7u\2\2\u014e"+
		"\u014f\7v\2\2\u014f\u0150\7t\2\2\u0150\u0151\7c\2\2\u0151\u0152\7e\2\2"+
		"\u0152\u0153\7v\2\2\u0153\20\3\2\2\2\u0154\u0155\7c\2\2\u0155\u0156\7"+
		"u\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158\u0159\7t\2\2\u0159\u015a"+
		"\7v\2\2\u015a\22\3\2\2\2\u015b\u015c\7d\2\2\u015c\u015d\7q\2\2\u015d\u015e"+
		"\7q\2\2\u015e\u015f\7n\2\2\u015f\u0160\7g\2\2\u0160\u0161\7c\2\2\u0161"+
		"\u0162\7p\2\2\u0162\24\3\2\2\2\u0163\u0164\7d\2\2\u0164\u0165\7t\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7c\2\2\u0167\u0168\7m\2\2\u0168\26\3\2\2\2\u0169"+
		"\u016a\7d\2\2\u016a\u016b\7{\2\2\u016b\u016c\7v\2\2\u016c\u016d\7g\2\2"+
		"\u016d\30\3\2\2\2\u016e\u016f\7e\2\2\u016f\u0170\7c\2\2\u0170\u0171\7"+
		"u\2\2\u0171\u0172\7g\2\2\u0172\32\3\2\2\2\u0173\u0174\7e\2\2\u0174\u0175"+
		"\7c\2\2\u0175\u0176\7v\2\2\u0176\u0177\7e\2\2\u0177\u0178\7j\2\2\u0178"+
		"\34\3\2\2\2\u0179\u017a\7e\2\2\u017a\u017b\7j\2\2\u017b\u017c\7c\2\2\u017c"+
		"\u017d\7t\2\2\u017d\36\3\2\2\2\u017e\u017f\7e\2\2\u017f\u0180\7n\2\2\u0180"+
		"\u0181\7c\2\2\u0181\u0182\7u\2\2\u0182\u0183\7u\2\2\u0183 \3\2\2\2\u0184"+
		"\u0185\7e\2\2\u0185\u0186\7q\2\2\u0186\u0187\7p\2\2\u0187\u0188\7u\2\2"+
		"\u0188\u0189\7v\2\2\u0189\"\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7q"+
		"\2\2\u018c\u018d\7p\2\2\u018d\u018e\7v\2\2\u018e\u018f\7k\2\2\u018f\u0190"+
		"\7p\2\2\u0190\u0191\7w\2\2\u0191\u0192\7g\2\2\u0192$\3\2\2\2\u0193\u0194"+
		"\7f\2\2\u0194\u0195\7g\2\2\u0195\u0196\7h\2\2\u0196\u0197\7c\2\2\u0197"+
		"\u0198\7w\2\2\u0198\u0199\7n\2\2\u0199\u019a\7v\2\2\u019a&\3\2\2\2\u019b"+
		"\u019c\7f\2\2\u019c\u019d\7q\2\2\u019d(\3\2\2\2\u019e\u019f\7f\2\2\u019f"+
		"\u01a0\7q\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7d\2\2\u01a2\u01a3\7n\2\2"+
		"\u01a3\u01a4\7g\2\2\u01a4*\3\2\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7n\2"+
		"\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7g\2\2\u01a9,\3\2\2\2\u01aa\u01ab\7"+
		"g\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7w\2\2\u01ad\u01ae\7o\2\2\u01ae."+
		"\3\2\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7z\2\2\u01b1\u01b2\7v\2\2\u01b2"+
		"\u01b3\7g\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\7u\2\2"+
		"\u01b6\60\3\2\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba\7"+
		"p\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7n\2\2\u01bc\62\3\2\2\2\u01bd\u01be"+
		"\7h\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7c\2\2\u01c1"+
		"\u01c2\7n\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7{\2\2\u01c4\64\3\2\2\2\u01c5"+
		"\u01c6\7h\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9\7c\2\2"+
		"\u01c9\u01ca\7v\2\2\u01ca\66\3\2\2\2\u01cb\u01cc\7h\2\2\u01cc\u01cd\7"+
		"q\2\2\u01cd\u01ce\7t\2\2\u01ce8\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1"+
		"\7h\2\2\u01d1:\3\2\2\2\u01d2\u01d3\7i\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7q\2\2\u01d6<\3\2\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9"+
		"\7o\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7g\2\2\u01dc"+
		"\u01dd\7o\2\2\u01dd\u01de\7g\2\2\u01de\u01df\7p\2\2\u01df\u01e0\7v\2\2"+
		"\u01e0\u01e1\7u\2\2\u01e1>\3\2\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7o\2"+
		"\2\u01e4\u01e5\7r\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8"+
		"\7v\2\2\u01e8@\3\2\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7p\2\2\u01eb\u01ec"+
		"\7u\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7p\2\2\u01ef"+
		"\u01f0\7e\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7h\2\2"+
		"\u01f3B\3\2\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7v\2"+
		"\2\u01f7D\3\2\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7"+
		"v\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7h\2\2\u01fe\u01ff"+
		"\7c\2\2\u01ff\u0200\7e\2\2\u0200\u0201\7g\2\2\u0201F\3\2\2\2\u0202\u0203"+
		"\7n\2\2\u0203\u0204\7q\2\2\u0204\u0205\7p\2\2\u0205\u0206\7i\2\2\u0206"+
		"H\3\2\2\2\u0207\u0208\7p\2\2\u0208\u0209\7c\2\2\u0209\u020a\7v\2\2\u020a"+
		"\u020b\7k\2\2\u020b\u020c\7x\2\2\u020c\u020d\7g\2\2\u020dJ\3\2\2\2\u020e"+
		"\u020f\7p\2\2\u020f\u0210\7g\2\2\u0210\u0211\7y\2\2\u0211L\3\2\2\2\u0212"+
		"\u0213\7r\2\2\u0213\u0214\7c\2\2\u0214\u0215\7e\2\2\u0215\u0216\7m\2\2"+
		"\u0216\u0217\7c\2\2\u0217\u0218\7i\2\2\u0218\u0219\7g\2\2\u0219N\3\2\2"+
		"\2\u021a\u021b\7r\2\2\u021b\u021c\7t\2\2\u021c\u021d\7k\2\2\u021d\u021e"+
		"\7x\2\2\u021e\u021f\7c\2\2\u021f\u0220\7v\2\2\u0220\u0221\7g\2\2\u0221"+
		"P\3\2\2\2\u0222\u0223\7r\2\2\u0223\u0224\7t\2\2\u0224\u0225\7q\2\2\u0225"+
		"\u0226\7v\2\2\u0226\u0227\7g\2\2\u0227\u0228\7e\2\2\u0228\u0229\7v\2\2"+
		"\u0229\u022a\7g\2\2\u022a\u022b\7f\2\2\u022bR\3\2\2\2\u022c\u022d\7r\2"+
		"\2\u022d\u022e\7w\2\2\u022e\u022f\7d\2\2\u022f\u0230\7n\2\2\u0230\u0231"+
		"\7k\2\2\u0231\u0232\7e\2\2\u0232T\3\2\2\2\u0233\u0234\7t\2\2\u0234\u0235"+
		"\7g\2\2\u0235\u0236\7v\2\2\u0236\u0237\7w\2\2\u0237\u0238\7t\2\2\u0238"+
		"\u0239\7p\2\2\u0239V\3\2\2\2\u023a\u023b\7u\2\2\u023b\u023c\7j\2\2\u023c"+
		"\u023d\7q\2\2\u023d\u023e\7t\2\2\u023e\u023f\7v\2\2\u023fX\3\2\2\2\u0240"+
		"\u0241\7u\2\2\u0241\u0242\7v\2\2\u0242\u0243\7c\2\2\u0243\u0244\7v\2\2"+
		"\u0244\u0245\7k\2\2\u0245\u0246\7e\2\2\u0246Z\3\2\2\2\u0247\u0248\7u\2"+
		"\2\u0248\u0249\7v\2\2\u0249\u024a\7t\2\2\u024a\u024b\7k\2\2\u024b\u024c"+
		"\7e\2\2\u024c\u024d\7v\2\2\u024d\u024e\7h\2\2\u024e\u024f\7r\2\2\u024f"+
		"\\\3\2\2\2\u0250\u0251\7u\2\2\u0251\u0252\7w\2\2\u0252\u0253\7r\2\2\u0253"+
		"\u0254\7g\2\2\u0254\u0255\7t\2\2\u0255^\3\2\2\2\u0256\u0257\7u\2\2\u0257"+
		"\u0258\7y\2\2\u0258\u0259\7k\2\2\u0259\u025a\7v\2\2\u025a\u025b\7e\2\2"+
		"\u025b\u025c\7j\2\2\u025c`\3\2\2\2\u025d\u025e\7u\2\2\u025e\u025f\7{\2"+
		"\2\u025f\u0260\7p\2\2\u0260\u0261\7e\2\2\u0261\u0262\7j\2\2\u0262\u0263"+
		"\7t\2\2\u0263\u0264\7q\2\2\u0264\u0265\7p\2\2\u0265\u0266\7k\2\2\u0266"+
		"\u0267\7|\2\2\u0267\u0268\7g\2\2\u0268\u0269\7f\2\2\u0269b\3\2\2\2\u026a"+
		"\u026b\7v\2\2\u026b\u026c\7j\2\2\u026c\u026d\7k\2\2\u026d\u026e\7u\2\2"+
		"\u026ed\3\2\2\2\u026f\u0270\7v\2\2\u0270\u0271\7j\2\2\u0271\u0272\7t\2"+
		"\2\u0272\u0273\7q\2\2\u0273\u0274\7y\2\2\u0274f\3\2\2\2\u0275\u0276\7"+
		"v\2\2\u0276\u0277\7j\2\2\u0277\u0278\7t\2\2\u0278\u0279\7q\2\2\u0279\u027a"+
		"\7y\2\2\u027a\u027b\7u\2\2\u027bh\3\2\2\2\u027c\u027d\7v\2\2\u027d\u027e"+
		"\7t\2\2\u027e\u027f\7c\2\2\u027f\u0280\7p\2\2\u0280\u0281\7u\2\2\u0281"+
		"\u0282\7k\2\2\u0282\u0283\7g\2\2\u0283\u0284\7p\2\2\u0284\u0285\7v\2\2"+
		"\u0285j\3\2\2\2\u0286\u0287\7v\2\2\u0287\u0288\7t\2\2\u0288\u0289\7{\2"+
		"\2\u0289l\3\2\2\2\u028a\u028b\7x\2\2\u028b\u028c\7q\2\2\u028c\u028d\7"+
		"k\2\2\u028d\u028e\7f\2\2\u028en\3\2\2\2\u028f\u0290\7x\2\2\u0290\u0291"+
		"\7q\2\2\u0291\u0292\7n\2\2\u0292\u0293\7c\2\2\u0293\u0294\7v\2\2\u0294"+
		"\u0295\7k\2\2\u0295\u0296\7n\2\2\u0296\u0297\7g\2\2\u0297p\3\2\2\2\u0298"+
		"\u0299\7y\2\2\u0299\u029a\7j\2\2\u029a\u029b\7k\2\2\u029b\u029c\7n\2\2"+
		"\u029c\u029d\7g\2\2\u029dr\3\2\2\2\u029e\u02a3\5u;\2\u029f\u02a3\5w<\2"+
		"\u02a0\u02a3\5y=\2\u02a1\u02a3\5{>\2\u02a2\u029e\3\2\2\2\u02a2\u029f\3"+
		"\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3t\3\2\2\2\u02a4\u02a6"+
		"\5\177@\2\u02a5\u02a7\5}?\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"v\3\2\2\2\u02a8\u02aa\5\u008bF\2\u02a9\u02ab\5}?\2\u02aa\u02a9\3\2\2\2"+
		"\u02aa\u02ab\3\2\2\2\u02abx\3\2\2\2\u02ac\u02ae\5\u0093J\2\u02ad\u02af"+
		"\5}?\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02afz\3\2\2\2\u02b0\u02b2"+
		"\5\u009bN\2\u02b1\u02b3\5}?\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2"+
		"\u02b3|\3\2\2\2\u02b4\u02b5\t\2\2\2\u02b5~\3\2\2\2\u02b6\u02c1\7\62\2"+
		"\2\u02b7\u02be\5\u0085C\2\u02b8\u02ba\5\u0081A\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bf\3\2\2\2\u02bb\u02bc\5\u0089E\2\u02bc\u02bd"+
		"\5\u0081A\2\u02bd\u02bf\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02bb\3\2\2"+
		"\2\u02bf\u02c1\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0\u02b7\3\2\2\2\u02c1\u0080"+
		"\3\2\2\2\u02c2\u02ca\5\u0083B\2\u02c3\u02c5\5\u0087D\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\5\u0083B\2\u02ca\u02c6"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u0082\3\2\2\2\u02cc\u02cf\7\62\2\2"+
		"\u02cd\u02cf\5\u0085C\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf"+
		"\u0084\3\2\2\2\u02d0\u02d1\t\3\2\2\u02d1\u0086\3\2\2\2\u02d2\u02d5\5\u0083"+
		"B\2\u02d3\u02d5\7a\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5\u0088"+
		"\3\2\2\2\u02d6\u02d8\7a\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u008a\3\2\2\2\u02db\u02dc\7\62"+
		"\2\2\u02dc\u02dd\t\4\2\2\u02dd\u02de\5\u008dG\2\u02de\u008c\3\2\2\2\u02df"+
		"\u02e7\5\u008fH\2\u02e0\u02e2\5\u0091I\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5"+
		"\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e6\u02e8\5\u008fH\2\u02e7\u02e3\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u008e\3\2\2\2\u02e9\u02ea\t\5\2\2\u02ea\u0090\3\2\2\2\u02eb"+
		"\u02ee\5\u008fH\2\u02ec\u02ee\7a\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3"+
		"\2\2\2\u02ee\u0092\3\2\2\2\u02ef\u02f1\7\62\2\2\u02f0\u02f2\5\u0089E\2"+
		"\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4"+
		"\5\u0095K\2\u02f4\u0094\3\2\2\2\u02f5\u02fd\5\u0097L\2\u02f6\u02f8\5\u0099"+
		"M\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fe\5\u0097"+
		"L\2\u02fd\u02f9\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0096\3\2\2\2\u02ff"+
		"\u0300\t\6\2\2\u0300\u0098\3\2\2\2\u0301\u0304\5\u0097L\2\u0302\u0304"+
		"\7a\2\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u009a\3\2\2\2\u0305"+
		"\u0306\7\62\2\2\u0306\u0307\t\7\2\2\u0307\u0308\5\u009dO\2\u0308\u009c"+
		"\3\2\2\2\u0309\u0311\5\u009fP\2\u030a\u030c\5\u00a1Q\2\u030b\u030a\3\2"+
		"\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312\5\u009fP\2\u0311\u030d"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u009e\3\2\2\2\u0313\u0314\t\b\2\2\u0314"+
		"\u00a0\3\2\2\2\u0315\u0318\5\u009fP\2\u0316\u0318\7a\2\2\u0317\u0315\3"+
		"\2\2\2\u0317\u0316\3\2\2\2\u0318\u00a2\3\2\2\2\u0319\u031c\5\u00a5S\2"+
		"\u031a\u031c\5\u00b1Y\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c"+
		"\u00a4\3\2\2\2\u031d\u031e\5\u0081A\2\u031e\u0320\7\60\2\2\u031f\u0321"+
		"\5\u0081A\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\3\2\2"+
		"\2\u0322\u0324\5\u00a7T\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0327\5\u00afX\2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0339\3\2\2\2\u0328\u0329\7\60\2\2\u0329\u032b\5\u0081"+
		"A\2\u032a\u032c\5\u00a7T\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032e\3\2\2\2\u032d\u032f\5\u00afX\2\u032e\u032d\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0339\3\2\2\2\u0330\u0331\5\u0081A\2\u0331\u0333\5\u00a7"+
		"T\2\u0332\u0334\5\u00afX\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0339\3\2\2\2\u0335\u0336\5\u0081A\2\u0336\u0337\5\u00afX\2\u0337\u0339"+
		"\3\2\2\2\u0338\u031d\3\2\2\2\u0338\u0328\3\2\2\2\u0338\u0330\3\2\2\2\u0338"+
		"\u0335\3\2\2\2\u0339\u00a6\3\2\2\2\u033a\u033b\5\u00a9U\2\u033b\u033c"+
		"\5\u00abV\2\u033c\u00a8\3\2\2\2\u033d\u033e\t\t\2\2\u033e\u00aa\3\2\2"+
		"\2\u033f\u0341\5\u00adW\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\5\u0081A\2\u0343\u00ac\3\2\2\2\u0344\u0345"+
		"\t\n\2\2\u0345\u00ae\3\2\2\2\u0346\u0347\t\13\2\2\u0347\u00b0\3\2\2\2"+
		"\u0348\u0349\5\u00b3Z\2\u0349\u034b\5\u00b5[\2\u034a\u034c\5\u00afX\2"+
		"\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u00b2\3\2\2\2\u034d\u034f"+
		"\5\u008bF\2\u034e\u0350\7\60\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2"+
		"\2\u0350\u0359\3\2\2\2\u0351\u0352\7\62\2\2\u0352\u0354\t\4\2\2\u0353"+
		"\u0355\5\u008dG\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356"+
		"\3\2\2\2\u0356\u0357\7\60\2\2\u0357\u0359\5\u008dG\2\u0358\u034d\3\2\2"+
		"\2\u0358\u0351\3\2\2\2\u0359\u00b4\3\2\2\2\u035a\u035b\5\u00b7\\\2\u035b"+
		"\u035c\5\u00abV\2\u035c\u00b6\3\2\2\2\u035d\u035e\t\f\2\2\u035e\u00b8"+
		"\3\2\2\2\u035f\u0360\7v\2\2\u0360\u0361\7t\2\2\u0361\u0362\7w\2\2\u0362"+
		"\u0369\7g\2\2\u0363\u0364\7h\2\2\u0364\u0365\7c\2\2\u0365\u0366\7n\2\2"+
		"\u0366\u0367\7u\2\2\u0367\u0369\7g\2\2\u0368\u035f\3\2\2\2\u0368\u0363"+
		"\3\2\2\2\u0369\u00ba\3\2\2\2\u036a\u036b\7)\2\2\u036b\u036c\5\u00bd_\2"+
		"\u036c\u036d\7)\2\2\u036d\u0373\3\2\2\2\u036e\u036f\7)\2\2\u036f\u0370"+
		"\5\u00c5c\2\u0370\u0371\7)\2\2\u0371\u0373\3\2\2\2\u0372\u036a\3\2\2\2"+
		"\u0372\u036e\3\2\2\2\u0373\u00bc\3\2\2\2\u0374\u0375\n\r\2\2\u0375\u00be"+
		"\3\2\2\2\u0376\u0378\7$\2\2\u0377\u0379\5\u00c1a\2\u0378\u0377\3\2\2\2"+
		"\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7$\2\2\u037b\u00c0"+
		"\3\2\2\2\u037c\u037e\5\u00c3b\2\u037d\u037c\3\2\2\2\u037e\u037f\3\2\2"+
		"\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u00c2\3\2\2\2\u0381\u0384"+
		"\n\16\2\2\u0382\u0384\5\u00c5c\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2"+
		"\2\u0384\u00c4\3\2\2\2\u0385\u0386\7^\2\2\u0386\u038a\t\17\2\2\u0387\u038a"+
		"\5\u00c7d\2\u0388\u038a\5\u00c9e\2\u0389\u0385\3\2\2\2\u0389\u0387\3\2"+
		"\2\2\u0389\u0388\3\2\2\2\u038a\u00c6\3\2\2\2\u038b\u038c\7^\2\2\u038c"+
		"\u0397\5\u0097L\2\u038d\u038e\7^\2\2\u038e\u038f\5\u0097L\2\u038f\u0390"+
		"\5\u0097L\2\u0390\u0397\3\2\2\2\u0391\u0392\7^\2\2\u0392\u0393\5\u00cb"+
		"f\2\u0393\u0394\5\u0097L\2\u0394\u0395\5\u0097L\2\u0395\u0397\3\2\2\2"+
		"\u0396\u038b\3\2\2\2\u0396\u038d\3\2\2\2\u0396\u0391\3\2\2\2\u0397\u00c8"+
		"\3\2\2\2\u0398\u0399\7^\2\2\u0399\u039a\7w\2\2\u039a\u039b\5\u008fH\2"+
		"\u039b\u039c\5\u008fH\2\u039c\u039d\5\u008fH\2\u039d\u039e\5\u008fH\2"+
		"\u039e\u00ca\3\2\2\2\u039f\u03a0\t\20\2\2\u03a0\u00cc\3\2\2\2\u03a1\u03a2"+
		"\7p\2\2\u03a2\u03a3\7w\2\2\u03a3\u03a4\7n\2\2\u03a4\u03a5\7n\2\2\u03a5"+
		"\u00ce\3\2\2\2\u03a6\u03a7\7*\2\2\u03a7\u00d0\3\2\2\2\u03a8\u03a9\7+\2"+
		"\2\u03a9\u00d2\3\2\2\2\u03aa\u03ab\7}\2\2\u03ab\u00d4\3\2\2\2\u03ac\u03ad"+
		"\7\177\2\2\u03ad\u00d6\3\2\2\2\u03ae\u03af\7]\2\2\u03af\u00d8\3\2\2\2"+
		"\u03b0\u03b1\7_\2\2\u03b1\u00da\3\2\2\2\u03b2\u03b3\7=\2\2\u03b3\u00dc"+
		"\3\2\2\2\u03b4\u03b5\7.\2\2\u03b5\u00de\3\2\2\2\u03b6\u03b7\7\60\2\2\u03b7"+
		"\u00e0\3\2\2\2\u03b8\u03b9\7?\2\2\u03b9\u00e2\3\2\2\2\u03ba\u03bb\7@\2"+
		"\2\u03bb\u00e4\3\2\2\2\u03bc\u03bd\7>\2\2\u03bd\u00e6\3\2\2\2\u03be\u03bf"+
		"\7#\2\2\u03bf\u00e8\3\2\2\2\u03c0\u03c1\7\u0080\2\2\u03c1\u00ea\3\2\2"+
		"\2\u03c2\u03c3\7A\2\2\u03c3\u00ec\3\2\2\2\u03c4\u03c5\7<\2\2\u03c5\u00ee"+
		"\3\2\2\2\u03c6\u03c7\7?\2\2\u03c7\u03c8\7?\2\2\u03c8\u00f0\3\2\2\2\u03c9"+
		"\u03ca\7>\2\2\u03ca\u03cb\7?\2\2\u03cb\u00f2\3\2\2\2\u03cc\u03cd\7@\2"+
		"\2\u03cd\u03ce\7?\2\2\u03ce\u00f4\3\2\2\2\u03cf\u03d0\7#\2\2\u03d0\u03d1"+
		"\7?\2\2\u03d1\u00f6\3\2\2\2\u03d2\u03d3\7(\2\2\u03d3\u03d4\7(\2\2\u03d4"+
		"\u00f8\3\2\2\2\u03d5\u03d6\7~\2\2\u03d6\u03d7\7~\2\2\u03d7\u00fa\3\2\2"+
		"\2\u03d8\u03d9\7-\2\2\u03d9\u03da\7-\2\2\u03da\u00fc\3\2\2\2\u03db\u03dc"+
		"\7/\2\2\u03dc\u03dd\7/\2\2\u03dd\u00fe\3\2\2\2\u03de\u03df\7-\2\2\u03df"+
		"\u0100\3\2\2\2\u03e0\u03e1\7/\2\2\u03e1\u0102\3\2\2\2\u03e2\u03e3\7,\2"+
		"\2\u03e3\u0104\3\2\2\2\u03e4\u03e5\7\61\2\2\u03e5\u0106\3\2\2\2\u03e6"+
		"\u03e7\7(\2\2\u03e7\u0108\3\2\2\2\u03e8\u03e9\7~\2\2\u03e9\u010a\3\2\2"+
		"\2\u03ea\u03eb\7`\2\2\u03eb\u010c\3\2\2\2\u03ec\u03ed\7\'\2\2\u03ed\u010e"+
		"\3\2\2\2\u03ee\u03ef\7-\2\2\u03ef\u03f0\7?\2\2\u03f0\u0110\3\2\2\2\u03f1"+
		"\u03f2\7/\2\2\u03f2\u03f3\7?\2\2\u03f3\u0112\3\2\2\2\u03f4\u03f5\7,\2"+
		"\2\u03f5\u03f6\7?\2\2\u03f6\u0114\3\2\2\2\u03f7\u03f8\7\61\2\2\u03f8\u03f9"+
		"\7?\2\2\u03f9\u0116\3\2\2\2\u03fa\u03fb\7(\2\2\u03fb\u03fc\7?\2\2\u03fc"+
		"\u0118\3\2\2\2\u03fd\u03fe\7~\2\2\u03fe\u03ff\7?\2\2\u03ff\u011a\3\2\2"+
		"\2\u0400\u0401\7`\2\2\u0401\u0402\7?\2\2\u0402\u011c\3\2\2\2\u0403\u0404"+
		"\7\'\2\2\u0404\u0405\7?\2\2\u0405\u011e\3\2\2\2\u0406\u0407\7>\2\2\u0407"+
		"\u0408\7>\2\2\u0408\u0409\7?\2\2\u0409\u0120\3\2\2\2\u040a\u040b\7@\2"+
		"\2\u040b\u040c\7@\2\2\u040c\u040d\7?\2\2\u040d\u0122\3\2\2\2\u040e\u040f"+
		"\7@\2\2\u040f\u0410\7@\2\2\u0410\u0411\7@\2\2\u0411\u0412\7?\2\2\u0412"+
		"\u0124\3\2\2\2\u0413\u0417\5\u0127\u0094\2\u0414\u0416\5\u0129\u0095\2"+
		"\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u0126\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u0421\t\21\2\2"+
		"\u041b\u041c\n\22\2\2\u041c\u0421\6\u0094\2\2\u041d\u041e\t\23\2\2\u041e"+
		"\u041f\t\24\2\2\u041f\u0421\6\u0094\3\2\u0420\u041a\3\2\2\2\u0420\u041b"+
		"\3\2\2\2\u0420\u041d\3\2\2\2\u0421\u0128\3\2\2\2\u0422\u0429\t\25\2\2"+
		"\u0423\u0424\n\22\2\2\u0424\u0429\6\u0095\4\2\u0425\u0426\t\23\2\2\u0426"+
		"\u0427\t\24\2\2\u0427\u0429\6\u0095\5\2\u0428\u0422\3\2\2\2\u0428\u0423"+
		"\3\2\2\2\u0428\u0425\3\2\2\2\u0429\u012a\3\2\2\2\u042a\u042b\7B\2\2\u042b"+
		"\u012c\3\2\2\2\u042c\u042d\7\60\2\2\u042d\u042e\7\60\2\2\u042e\u042f\7"+
		"\60\2\2\u042f\u012e\3\2\2\2\u0430\u0432\t\26\2\2\u0431\u0430\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2"+
		"\2\2\u0435\u0436\b\u0098\2\2\u0436\u0130\3\2\2\2\u0437\u0438\7\61\2\2"+
		"\u0438\u0439\7,\2\2\u0439\u043d\3\2\2\2\u043a\u043c\13\2\2\2\u043b\u043a"+
		"\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043e\3\2\2\2\u043d\u043b\3\2\2\2\u043e"+
		"\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\7,\2\2\u0441\u0442\7\61"+
		"\2\2\u0442\u0443\3\2\2\2\u0443\u0444\b\u0099\2\2\u0444\u0132\3\2\2\2\u0445"+
		"\u0446\7\61\2\2\u0446\u0447\7\61\2\2\u0447\u044b\3\2\2\2\u0448\u044a\n"+
		"\27\2\2\u0449\u0448\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044e\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u044f\b\u009a"+
		"\2\2\u044f\u0134\3\2\2\2\64\2\u02a2\u02a6\u02aa\u02ae\u02b2\u02b9\u02be"+
		"\u02c0\u02c6\u02ca\u02ce\u02d4\u02d9\u02e3\u02e7\u02ed\u02f1\u02f9\u02fd"+
		"\u0303\u030d\u0311\u0317\u031b\u0320\u0323\u0326\u032b\u032e\u0333\u0338"+
		"\u0340\u034b\u034f\u0354\u0358\u0368\u0372\u0378\u037f\u0383\u0389\u0396"+
		"\u0417\u0420\u0428\u0433\u043d\u044b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}