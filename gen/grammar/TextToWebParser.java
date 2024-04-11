// Generated from C:/Users/user/IntelliJIDEAProjects/Antlr/Miasi_Project/src/grammar/TextToWeb.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TextToWebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, STRING=23, WS=24;
	public static final int
		RULE_page = 0, RULE_pageContent = 1, RULE_theme = 2, RULE_font = 3, RULE_backgroundColor = 4, 
		RULE_section = 5, RULE_header = 6, RULE_sectionContent = 7, RULE_alignment = 8, 
		RULE_textAlignment = 9, RULE_textDecoration = 10, RULE_text = 11, RULE_image = 12, 
		RULE_list = 13, RULE_listItem = 14, RULE_textAttributes = 15, RULE_imageAttributes = 16, 
		RULE_fontSize = 17, RULE_width = 18, RULE_height = 19, RULE_level = 20, 
		RULE_color = 21, RULE_source = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "pageContent", "theme", "font", "backgroundColor", "section", 
			"header", "sectionContent", "alignment", "textAlignment", "textDecoration", 
			"text", "image", "list", "listItem", "textAttributes", "imageAttributes", 
			"fontSize", "width", "height", "level", "color", "source"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Strona'", "'{'", "'}'", "'Motyw'", "'Czcionka'", "'KolorTla'", 
			"'Sekcja'", "'Naglowek'", "'Rozmieszczenie'", "'Wyrownanie tekstu'", 
			"'Ozdoby tekstu'", "'Tekst'", "'Obraz'", "'Lista'", "'Typ'", "'Element'", 
			"'Rozmiar'", "'Szerokosc'", "'Wysokosc'", "'Poziom'", "'KolorCzcionki'", 
			"'Zrodlo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TextToWeb.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TextToWebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public PageContentContext pageContent() {
			return getRuleContext(PageContentContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(STRING);
			setState(48);
			match(T__1);
			setState(49);
			pageContent();
			setState(50);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContentContext extends ParserRuleContext {
		public List<ThemeContext> theme() {
			return getRuleContexts(ThemeContext.class);
		}
		public ThemeContext theme(int i) {
			return getRuleContext(ThemeContext.class,i);
		}
		public List<FontContext> font() {
			return getRuleContexts(FontContext.class);
		}
		public FontContext font(int i) {
			return getRuleContext(FontContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public PageContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitPageContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContentContext pageContent() throws RecognitionException {
		PageContentContext _localctx = new PageContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pageContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432L) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(52);
					theme();
					}
					break;
				case T__4:
					{
					setState(53);
					font();
					}
					break;
				case T__6:
					{
					setState(54);
					section();
					}
					break;
				case T__7:
					{
					setState(55);
					header();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public FontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitFont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontContext font() throws RecognitionException {
		FontContext _localctx = new FontContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_font);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__4);
			setState(65);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public BackgroundColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitBackgroundColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundColorContext backgroundColor() throws RecognitionException {
		BackgroundColorContext _localctx = new BackgroundColorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_backgroundColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public SectionContentContext sectionContent() {
			return getRuleContext(SectionContentContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__6);
			setState(71);
			match(STRING);
			setState(72);
			match(T__1);
			setState(73);
			sectionContent();
			setState(74);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public List<LevelContext> level() {
			return getRuleContexts(LevelContext.class);
		}
		public LevelContext level(int i) {
			return getRuleContext(LevelContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__7);
			setState(77);
			match(STRING);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(78);
				match(T__1);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19 || _la==T__20) {
					{
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__19:
						{
						setState(79);
						level();
						}
						break;
					case T__20:
						{
						setState(80);
						color();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContentContext extends ParserRuleContext {
		public List<AlignmentContext> alignment() {
			return getRuleContexts(AlignmentContext.class);
		}
		public AlignmentContext alignment(int i) {
			return getRuleContext(AlignmentContext.class,i);
		}
		public List<BackgroundColorContext> backgroundColor() {
			return getRuleContexts(BackgroundColorContext.class);
		}
		public BackgroundColorContext backgroundColor(int i) {
			return getRuleContext(BackgroundColorContext.class,i);
		}
		public List<WidthContext> width() {
			return getRuleContexts(WidthContext.class);
		}
		public WidthContext width(int i) {
			return getRuleContext(WidthContext.class,i);
		}
		public List<HeightContext> height() {
			return getRuleContexts(HeightContext.class);
		}
		public HeightContext height(int i) {
			return getRuleContext(HeightContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public SectionContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitSectionContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContentContext sectionContent() throws RecognitionException {
		SectionContentContext _localctx = new SectionContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sectionContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 816064L) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(89);
					alignment();
					}
					break;
				case T__5:
					{
					setState(90);
					backgroundColor();
					}
					break;
				case T__17:
					{
					setState(91);
					width();
					}
					break;
				case T__18:
					{
					setState(92);
					height();
					}
					break;
				case T__11:
					{
					setState(93);
					text();
					}
					break;
				case T__12:
					{
					setState(94);
					image();
					}
					break;
				case T__13:
					{
					setState(95);
					list();
					}
					break;
				case T__7:
					{
					setState(96);
					header();
					}
					break;
				case T__6:
					{
					setState(97);
					section();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__8);
			setState(104);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextAlignmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public TextAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAlignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitTextAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextAlignmentContext textAlignment() throws RecognitionException {
		TextAlignmentContext _localctx = new TextAlignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_textAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__9);
			setState(107);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextDecorationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public TextDecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDecoration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitTextDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextDecorationContext textDecoration() throws RecognitionException {
		TextDecorationContext _localctx = new TextDecorationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_textDecoration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public TextAttributesContext textAttributes() {
			return getRuleContext(TextAttributesContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__11);
			setState(113);
			match(STRING);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(114);
				match(T__1);
				setState(115);
				textAttributes();
				setState(116);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public ImageAttributesContext imageAttributes() {
			return getRuleContext(ImageAttributesContext.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__12);
			setState(121);
			match(STRING);
			setState(122);
			match(T__1);
			setState(123);
			imageAttributes();
			setState(124);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__13);
			setState(127);
			match(T__1);
			setState(128);
			match(T__14);
			setState(129);
			match(STRING);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(130);
				listItem();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__15);
			setState(139);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextAttributesContext extends ParserRuleContext {
		public List<WidthContext> width() {
			return getRuleContexts(WidthContext.class);
		}
		public WidthContext width(int i) {
			return getRuleContext(WidthContext.class,i);
		}
		public List<HeightContext> height() {
			return getRuleContexts(HeightContext.class);
		}
		public HeightContext height(int i) {
			return getRuleContext(HeightContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<TextDecorationContext> textDecoration() {
			return getRuleContexts(TextDecorationContext.class);
		}
		public TextDecorationContext textDecoration(int i) {
			return getRuleContext(TextDecorationContext.class,i);
		}
		public List<FontSizeContext> fontSize() {
			return getRuleContexts(FontSizeContext.class);
		}
		public FontSizeContext fontSize(int i) {
			return getRuleContext(FontSizeContext.class,i);
		}
		public List<TextAlignmentContext> textAlignment() {
			return getRuleContexts(TextAlignmentContext.class);
		}
		public TextAlignmentContext textAlignment(int i) {
			return getRuleContext(TextAlignmentContext.class,i);
		}
		public List<AlignmentContext> alignment() {
			return getRuleContexts(AlignmentContext.class);
		}
		public AlignmentContext alignment(int i) {
			return getRuleContext(AlignmentContext.class,i);
		}
		public List<BackgroundColorContext> backgroundColor() {
			return getRuleContexts(BackgroundColorContext.class);
		}
		public BackgroundColorContext backgroundColor(int i) {
			return getRuleContext(BackgroundColorContext.class,i);
		}
		public TextAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAttributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitTextAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextAttributesContext textAttributes() throws RecognitionException {
		TextAttributesContext _localctx = new TextAttributesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3018304L) != 0)) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(141);
					width();
					}
					break;
				case T__18:
					{
					setState(142);
					height();
					}
					break;
				case T__20:
					{
					setState(143);
					color();
					}
					break;
				case T__10:
					{
					setState(144);
					textDecoration();
					}
					break;
				case T__16:
					{
					setState(145);
					fontSize();
					}
					break;
				case T__9:
					{
					setState(146);
					textAlignment();
					}
					break;
				case T__8:
					{
					setState(147);
					alignment();
					}
					break;
				case T__5:
					{
					setState(148);
					backgroundColor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageAttributesContext extends ParserRuleContext {
		public List<WidthContext> width() {
			return getRuleContexts(WidthContext.class);
		}
		public WidthContext width(int i) {
			return getRuleContext(WidthContext.class,i);
		}
		public List<HeightContext> height() {
			return getRuleContexts(HeightContext.class);
		}
		public HeightContext height(int i) {
			return getRuleContext(HeightContext.class,i);
		}
		public List<AlignmentContext> alignment() {
			return getRuleContexts(AlignmentContext.class);
		}
		public AlignmentContext alignment(int i) {
			return getRuleContext(AlignmentContext.class,i);
		}
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public ImageAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageAttributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitImageAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageAttributesContext imageAttributes() throws RecognitionException {
		ImageAttributesContext _localctx = new ImageAttributesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_imageAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4981248L) != 0)) {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(154);
					width();
					}
					break;
				case T__18:
					{
					setState(155);
					height();
					}
					break;
				case T__8:
					{
					setState(156);
					alignment();
					}
					break;
				case T__21:
					{
					setState(157);
					source();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontSizeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public FontSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontSize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitFontSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontSizeContext fontSize() throws RecognitionException {
		FontSizeContext _localctx = new FontSizeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fontSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__16);
			setState(164);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__17);
			setState(167);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__18);
			setState(170);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__19);
			setState(173);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__20);
			setState(176);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__21);
			setState(179);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006R\b\u0006\n\u0006\f\u0006U\t\u0006\u0001\u0006\u0003"+
		"\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007c\b"+
		"\u0007\n\u0007\f\u0007f\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bw\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0084\b\r\n\r\f\r\u0087\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0096\b\u000f\n"+
		"\u000f\f\u000f\u0099\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u009f\b\u0010\n\u0010\f\u0010\u00a2\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0000\u00bc\u0000.\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000"+
		"\u0000\u0006@\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nF\u0001"+
		"\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000"+
		"\u0000\u0010g\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014"+
		"m\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018x\u0001"+
		"\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u008a\u0001\u0000"+
		"\u0000\u0000\u001e\u0097\u0001\u0000\u0000\u0000 \u00a0\u0001\u0000\u0000"+
		"\u0000\"\u00a3\u0001\u0000\u0000\u0000$\u00a6\u0001\u0000\u0000\u0000"+
		"&\u00a9\u0001\u0000\u0000\u0000(\u00ac\u0001\u0000\u0000\u0000*\u00af"+
		"\u0001\u0000\u0000\u0000,\u00b2\u0001\u0000\u0000\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0005\u0017\u0000\u000001\u0005\u0002\u0000\u000012\u0003"+
		"\u0002\u0001\u000023\u0005\u0003\u0000\u00003\u0001\u0001\u0000\u0000"+
		"\u000049\u0003\u0004\u0002\u000059\u0003\u0006\u0003\u000069\u0003\n\u0005"+
		"\u000079\u0003\f\u0006\u000084\u0001\u0000\u0000\u000085\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0003"+
		"\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0004\u0000"+
		"\u0000>?\u0005\u0017\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0005\u0000\u0000AB\u0005\u0017\u0000\u0000B\u0007\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0006\u0000\u0000DE\u0005\u0017\u0000\u0000E\t\u0001\u0000"+
		"\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0005\u0017\u0000\u0000HI\u0005"+
		"\u0002\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\u0003\u0000\u0000"+
		"K\u000b\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000MW\u0005\u0017\u0000"+
		"\u0000NS\u0005\u0002\u0000\u0000OR\u0003(\u0014\u0000PR\u0003*\u0015\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0005\u0003\u0000\u0000WN\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000"+
		"Yc\u0003\u0010\b\u0000Zc\u0003\b\u0004\u0000[c\u0003$\u0012\u0000\\c\u0003"+
		"&\u0013\u0000]c\u0003\u0016\u000b\u0000^c\u0003\u0018\f\u0000_c\u0003"+
		"\u001a\r\u0000`c\u0003\f\u0006\u0000ac\u0003\n\u0005\u0000bY\u0001\u0000"+
		"\u0000\u0000bZ\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b\\\u0001"+
		"\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0005\t\u0000\u0000hi\u0005\u0017\u0000\u0000i\u0011\u0001\u0000\u0000"+
		"\u0000jk\u0005\n\u0000\u0000kl\u0005\u0017\u0000\u0000l\u0013\u0001\u0000"+
		"\u0000\u0000mn\u0005\u000b\u0000\u0000no\u0005\u0017\u0000\u0000o\u0015"+
		"\u0001\u0000\u0000\u0000pq\u0005\f\u0000\u0000qv\u0005\u0017\u0000\u0000"+
		"rs\u0005\u0002\u0000\u0000st\u0003\u001e\u000f\u0000tu\u0005\u0003\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0005\r\u0000\u0000yz\u0005"+
		"\u0017\u0000\u0000z{\u0005\u0002\u0000\u0000{|\u0003 \u0010\u0000|}\u0005"+
		"\u0003\u0000\u0000}\u0019\u0001\u0000\u0000\u0000~\u007f\u0005\u000e\u0000"+
		"\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0005\u000f\u0000"+
		"\u0000\u0081\u0085\u0005\u0017\u0000\u0000\u0082\u0084\u0003\u001c\u000e"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u001b\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u008c\u0005\u0017\u0000"+
		"\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u0096\u0003$\u0012\u0000"+
		"\u008e\u0096\u0003&\u0013\u0000\u008f\u0096\u0003*\u0015\u0000\u0090\u0096"+
		"\u0003\u0014\n\u0000\u0091\u0096\u0003\"\u0011\u0000\u0092\u0096\u0003"+
		"\u0012\t\u0000\u0093\u0096\u0003\u0010\b\u0000\u0094\u0096\u0003\b\u0004"+
		"\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000"+
		"\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u001f\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009f\u0003$\u0012\u0000"+
		"\u009b\u009f\u0003&\u0013\u0000\u009c\u009f\u0003\u0010\b\u0000\u009d"+
		"\u009f\u0003,\u0016\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1!\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0011\u0000\u0000\u00a4\u00a5\u0005\u0017\u0000\u0000\u00a5#\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8\u0005\u0017"+
		"\u0000\u0000\u00a8%\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\'\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0005\u0017\u0000\u0000"+
		"\u00ae)\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0015\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0017\u0000\u0000\u00b1+\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0016\u0000\u0000\u00b3\u00b4\u0005\u0017\u0000\u0000\u00b4-\u0001"+
		"\u0000\u0000\u0000\r8:QSWbdv\u0085\u0095\u0097\u009e\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}