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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, STRING=26, WS=27;
	public static final int
		RULE_page = 0, RULE_pageContent = 1, RULE_theme = 2, RULE_font = 3, RULE_backgroundColor = 4, 
		RULE_section = 5, RULE_header = 6, RULE_sectionContent = 7, RULE_alignment = 8, 
		RULE_textAlignment = 9, RULE_textDecoration = 10, RULE_text = 11, RULE_image = 12, 
		RULE_list = 13, RULE_listItem = 14, RULE_textAttributes = 15, RULE_imageAttributes = 16, 
		RULE_fontSize = 17, RULE_width = 18, RULE_height = 19, RULE_level = 20, 
		RULE_color = 21, RULE_source = 22, RULE_margin = 23, RULE_padding = 24, 
		RULE_borderRadius = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "pageContent", "theme", "font", "backgroundColor", "section", 
			"header", "sectionContent", "alignment", "textAlignment", "textDecoration", 
			"text", "image", "list", "listItem", "textAttributes", "imageAttributes", 
			"fontSize", "width", "height", "level", "color", "source", "margin", 
			"padding", "borderRadius"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Strona'", "'{'", "'}'", "'Motyw'", "'Czcionka'", "'KolorTla'", 
			"'Sekcja'", "'Naglowek'", "'Rozmieszczenie'", "'Wyrownanie tekstu'", 
			"'Ozdoby tekstu'", "'Tekst'", "'Obraz'", "'Lista'", "'Typ'", "'Element'", 
			"'Rozmiar'", "'Szerokosc'", "'Wysokosc'", "'Poziom'", "'KolorCzcionki'", 
			"'Zrodlo'", "'Margines'", "'Padding'", "'Zaokraglenie'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "WS"
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
			setState(52);
			match(T__0);
			setState(53);
			match(STRING);
			setState(54);
			match(T__1);
			setState(55);
			pageContent();
			setState(56);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432L) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(58);
					theme();
					}
					break;
				case T__4:
					{
					setState(59);
					font();
					}
					break;
				case T__6:
					{
					setState(60);
					section();
					}
					break;
				case T__7:
					{
					setState(61);
					header();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
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
			setState(67);
			match(T__3);
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
			setState(70);
			match(T__4);
			setState(71);
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
			setState(73);
			match(T__5);
			setState(74);
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
			setState(76);
			match(T__6);
			setState(77);
			match(STRING);
			setState(78);
			match(T__1);
			setState(79);
			sectionContent();
			setState(80);
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
			setState(82);
			match(T__7);
			setState(83);
			match(STRING);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(84);
				match(T__1);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19 || _la==T__20) {
					{
					setState(87);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__19:
						{
						setState(85);
						level();
						}
						break;
					case T__20:
						{
						setState(86);
						color();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
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
		public List<BorderRadiusContext> borderRadius() {
			return getRuleContexts(BorderRadiusContext.class);
		}
		public BorderRadiusContext borderRadius(int i) {
			return getRuleContext(BorderRadiusContext.class,i);
		}
		public List<MarginContext> margin() {
			return getRuleContexts(MarginContext.class);
		}
		public MarginContext margin(int i) {
			return getRuleContext(MarginContext.class,i);
		}
		public List<PaddingContext> padding() {
			return getRuleContexts(PaddingContext.class);
		}
		public PaddingContext padding(int i) {
			return getRuleContext(PaddingContext.class,i);
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 59536320L) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(95);
					borderRadius();
					}
					break;
				case T__22:
					{
					setState(96);
					margin();
					}
					break;
				case T__23:
					{
					setState(97);
					padding();
					}
					break;
				case T__8:
					{
					setState(98);
					alignment();
					}
					break;
				case T__5:
					{
					setState(99);
					backgroundColor();
					}
					break;
				case T__17:
					{
					setState(100);
					width();
					}
					break;
				case T__18:
					{
					setState(101);
					height();
					}
					break;
				case T__11:
					{
					setState(102);
					text();
					}
					break;
				case T__12:
					{
					setState(103);
					image();
					}
					break;
				case T__13:
					{
					setState(104);
					list();
					}
					break;
				case T__7:
					{
					setState(105);
					header();
					}
					break;
				case T__6:
					{
					setState(106);
					section();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
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
		public List<TerminalNode> STRING() { return getTokens(TextToWebParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TextToWebParser.STRING, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__8);
			setState(113);
			match(STRING);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(114);
				match(STRING);
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
			setState(117);
			match(T__9);
			setState(118);
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
			setState(120);
			match(T__10);
			setState(121);
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
			setState(123);
			match(T__11);
			setState(124);
			match(STRING);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(125);
				match(T__1);
				setState(126);
				textAttributes();
				setState(127);
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
			setState(131);
			match(T__12);
			setState(132);
			match(STRING);
			setState(133);
			match(T__1);
			setState(134);
			imageAttributes();
			setState(135);
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
			setState(137);
			match(T__13);
			setState(138);
			match(T__1);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(139);
				match(T__14);
				setState(140);
				match(STRING);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(143);
				listItem();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
			setState(151);
			match(T__15);
			setState(152);
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
		public List<BorderRadiusContext> borderRadius() {
			return getRuleContexts(BorderRadiusContext.class);
		}
		public BorderRadiusContext borderRadius(int i) {
			return getRuleContext(BorderRadiusContext.class,i);
		}
		public List<MarginContext> margin() {
			return getRuleContexts(MarginContext.class);
		}
		public MarginContext margin(int i) {
			return getRuleContext(MarginContext.class,i);
		}
		public List<PaddingContext> padding() {
			return getRuleContexts(PaddingContext.class);
		}
		public PaddingContext padding(int i) {
			return getRuleContext(PaddingContext.class,i);
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61738560L) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(154);
					borderRadius();
					}
					break;
				case T__22:
					{
					setState(155);
					margin();
					}
					break;
				case T__23:
					{
					setState(156);
					padding();
					}
					break;
				case T__17:
					{
					setState(157);
					width();
					}
					break;
				case T__18:
					{
					setState(158);
					height();
					}
					break;
				case T__20:
					{
					setState(159);
					color();
					}
					break;
				case T__10:
					{
					setState(160);
					textDecoration();
					}
					break;
				case T__16:
					{
					setState(161);
					fontSize();
					}
					break;
				case T__9:
					{
					setState(162);
					textAlignment();
					}
					break;
				case T__8:
					{
					setState(163);
					alignment();
					}
					break;
				case T__5:
					{
					setState(164);
					backgroundColor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
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
		public List<BorderRadiusContext> borderRadius() {
			return getRuleContexts(BorderRadiusContext.class);
		}
		public BorderRadiusContext borderRadius(int i) {
			return getRuleContext(BorderRadiusContext.class,i);
		}
		public List<MarginContext> margin() {
			return getRuleContexts(MarginContext.class);
		}
		public MarginContext margin(int i) {
			return getRuleContext(MarginContext.class,i);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46924288L) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(170);
					borderRadius();
					}
					break;
				case T__22:
					{
					setState(171);
					margin();
					}
					break;
				case T__17:
					{
					setState(172);
					width();
					}
					break;
				case T__18:
					{
					setState(173);
					height();
					}
					break;
				case T__8:
					{
					setState(174);
					alignment();
					}
					break;
				case T__21:
					{
					setState(175);
					source();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
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
			setState(181);
			match(T__16);
			setState(182);
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
			setState(184);
			match(T__17);
			setState(185);
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
			setState(187);
			match(T__18);
			setState(188);
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
			setState(190);
			match(T__19);
			setState(191);
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
			setState(193);
			match(T__20);
			setState(194);
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
			setState(196);
			match(T__21);
			setState(197);
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
	public static class MarginContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public MarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitMargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginContext margin() throws RecognitionException {
		MarginContext _localctx = new MarginContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_margin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__22);
			setState(200);
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
	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_padding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__23);
			setState(203);
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
	public static class BorderRadiusContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public BorderRadiusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadius; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusContext borderRadius() throws RecognitionException {
		BorderRadiusContext _localctx = new BorderRadiusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_borderRadius);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__24);
			setState(206);
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
		"\u0004\u0001\u001b\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006X\b\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0006\u0003"+
		"\u0006^\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007l\b\u0007\n\u0007\f\u0007o\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0082\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u008e\b\r\u0001"+
		"\r\u0005\r\u0091\b\r\n\r\f\r\u0094\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00a6\b\u000f\n\u000f\f\u000f\u00a9\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00b1\b\u0010\n\u0010\f\u0010\u00b4\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0000"+
		"\u00de\u00004\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004"+
		"C\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\nL\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000e"+
		"m\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012u\u0001"+
		"\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000"+
		"\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000"+
		"\u0000\u001c\u0097\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000"+
		"\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000"+
		"$\u00b8\u0001\u0000\u0000\u0000&\u00bb\u0001\u0000\u0000\u0000(\u00be"+
		"\u0001\u0000\u0000\u0000*\u00c1\u0001\u0000\u0000\u0000,\u00c4\u0001\u0000"+
		"\u0000\u0000.\u00c7\u0001\u0000\u0000\u00000\u00ca\u0001\u0000\u0000\u0000"+
		"2\u00cd\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u000056\u0005\u001a"+
		"\u0000\u000067\u0005\u0002\u0000\u000078\u0003\u0002\u0001\u000089\u0005"+
		"\u0003\u0000\u00009\u0001\u0001\u0000\u0000\u0000:?\u0003\u0004\u0002"+
		"\u0000;?\u0003\u0006\u0003\u0000<?\u0003\n\u0005\u0000=?\u0003\f\u0006"+
		"\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0004\u0000\u0000DE\u0005\u001a"+
		"\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000"+
		"GH\u0005\u001a\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0006"+
		"\u0000\u0000JK\u0005\u001a\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0007\u0000\u0000MN\u0005\u001a\u0000\u0000NO\u0005\u0002\u0000\u0000"+
		"OP\u0003\u000e\u0007\u0000PQ\u0005\u0003\u0000\u0000Q\u000b\u0001\u0000"+
		"\u0000\u0000RS\u0005\b\u0000\u0000S]\u0005\u001a\u0000\u0000TY\u0005\u0002"+
		"\u0000\u0000UX\u0003(\u0014\u0000VX\u0003*\u0015\u0000WU\u0001\u0000\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\^\u0005\u0003\u0000\u0000]T\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_l\u00032\u0019\u0000"+
		"`l\u0003.\u0017\u0000al\u00030\u0018\u0000bl\u0003\u0010\b\u0000cl\u0003"+
		"\b\u0004\u0000dl\u0003$\u0012\u0000el\u0003&\u0013\u0000fl\u0003\u0016"+
		"\u000b\u0000gl\u0003\u0018\f\u0000hl\u0003\u001a\r\u0000il\u0003\f\u0006"+
		"\u0000jl\u0003\n\u0005\u0000k_\u0001\u0000\u0000\u0000k`\u0001\u0000\u0000"+
		"\u0000ka\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000kc\u0001\u0000"+
		"\u0000\u0000kd\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001"+
		"\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000f\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\t\u0000\u0000qs\u0005"+
		"\u001a\u0000\u0000rt\u0005\u001a\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\u0011\u0001\u0000\u0000\u0000uv\u0005\n\u0000"+
		"\u0000vw\u0005\u001a\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005"+
		"\u000b\u0000\u0000yz\u0005\u001a\u0000\u0000z\u0015\u0001\u0000\u0000"+
		"\u0000{|\u0005\f\u0000\u0000|\u0081\u0005\u001a\u0000\u0000}~\u0005\u0002"+
		"\u0000\u0000~\u007f\u0003\u001e\u000f\u0000\u007f\u0080\u0005\u0003\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085"+
		"\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0003 \u0010\u0000\u0087\u0088"+
		"\u0005\u0003\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u000e\u0000\u0000\u008a\u008d\u0005\u0002\u0000\u0000\u008b\u008c"+
		"\u0005\u000f\u0000\u0000\u008c\u008e\u0005\u001a\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u001c\u000e\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0003\u0000\u0000\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0010\u0000\u0000\u0098\u0099\u0005\u001a\u0000\u0000\u0099\u001d"+
		"\u0001\u0000\u0000\u0000\u009a\u00a6\u00032\u0019\u0000\u009b\u00a6\u0003"+
		".\u0017\u0000\u009c\u00a6\u00030\u0018\u0000\u009d\u00a6\u0003$\u0012"+
		"\u0000\u009e\u00a6\u0003&\u0013\u0000\u009f\u00a6\u0003*\u0015\u0000\u00a0"+
		"\u00a6\u0003\u0014\n\u0000\u00a1\u00a6\u0003\"\u0011\u0000\u00a2\u00a6"+
		"\u0003\u0012\t\u0000\u00a3\u00a6\u0003\u0010\b\u0000\u00a4\u00a6\u0003"+
		"\b\u0004\u0000\u00a5\u009a\u0001\u0000\u0000\u0000\u00a5\u009b\u0001\u0000"+
		"\u0000\u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000"+
		"\u0000\u0000\u00a5\u009e\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u001f\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b1\u00032\u0019\u0000\u00ab\u00b1\u0003.\u0017\u0000"+
		"\u00ac\u00b1\u0003$\u0012\u0000\u00ad\u00b1\u0003&\u0013\u0000\u00ae\u00b1"+
		"\u0003\u0010\b\u0000\u00af\u00b1\u0003,\u0016\u0000\u00b0\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00b7\u0005\u001a"+
		"\u0000\u0000\u00b7#\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0012\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001a\u0000\u0000\u00ba%\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0013\u0000\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000"+
		"\u00bd\'\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0014\u0000\u0000\u00bf"+
		"\u00c0\u0005\u001a\u0000\u0000\u00c0)\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0015\u0000\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3+\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005\u0016\u0000\u0000\u00c5\u00c6\u0005"+
		"\u001a\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0017"+
		"\u0000\u0000\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9/\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0018\u0000\u0000\u00cb\u00cc\u0005\u001a\u0000"+
		"\u0000\u00cc1\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0019\u0000\u0000"+
		"\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf3\u0001\u0000\u0000\u0000\u000f"+
		">@WY]kms\u0081\u008d\u0092\u00a5\u00a7\u00b0\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}