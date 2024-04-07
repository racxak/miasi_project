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
		T__17=18, STRING=19, WS=20;
	public static final int
		RULE_page = 0, RULE_pageContent = 1, RULE_theme = 2, RULE_font = 3, RULE_backgroundColor = 4, 
		RULE_section = 5, RULE_header = 6, RULE_sectionContent = 7, RULE_alignment = 8, 
		RULE_text = 9, RULE_image = 10, RULE_list = 11, RULE_listItem = 12, RULE_textAttributes = 13, 
		RULE_imageAttributes = 14, RULE_fontSize = 15, RULE_width = 16, RULE_level = 17, 
		RULE_color = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "pageContent", "theme", "font", "backgroundColor", "section", 
			"header", "sectionContent", "alignment", "text", "image", "list", "listItem", 
			"textAttributes", "imageAttributes", "fontSize", "width", "level", "color"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Strona'", "'{'", "'}'", "'Motyw'", "'Czcionka'", "'KolorTla'", 
			"'Sekcja'", "'Naglowek'", "'Rozmieszczenie'", "'Tekst'", "'Obraz'", "'Lista'", 
			"'Typ'", "'Element'", "'Rozmiar'", "'Szerokosc'", "'Poziom'", "'KolorCzcionki'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "WS"
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
			setState(38);
			match(T__0);
			setState(39);
			match(STRING);
			setState(40);
			match(T__1);
			setState(41);
			pageContent();
			setState(42);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432L) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(44);
					theme();
					}
					break;
				case T__4:
					{
					setState(45);
					font();
					}
					break;
				case T__6:
					{
					setState(46);
					section();
					}
					break;
				case T__7:
					{
					setState(47);
					header();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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
			setState(53);
			match(T__3);
			setState(54);
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
			setState(56);
			match(T__4);
			setState(57);
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
			setState(59);
			match(T__5);
			setState(60);
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
			setState(62);
			match(T__6);
			setState(63);
			match(STRING);
			setState(64);
			match(T__1);
			setState(65);
			sectionContent();
			setState(66);
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
			setState(68);
			match(T__7);
			setState(69);
			match(STRING);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(70);
				match(T__1);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16 || _la==T__17) {
					{
					setState(73);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
						{
						setState(71);
						level();
						}
						break;
					case T__17:
						{
						setState(72);
						color();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(81);
					alignment();
					}
					break;
				case T__5:
					{
					setState(82);
					backgroundColor();
					}
					break;
				case T__9:
					{
					setState(83);
					text();
					}
					break;
				case T__10:
					{
					setState(84);
					image();
					}
					break;
				case T__7:
					{
					setState(85);
					header();
					}
					break;
				case T__6:
					{
					setState(86);
					section();
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
			setState(92);
			match(T__8);
			setState(93);
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
		enterRule(_localctx, 18, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__9);
			setState(96);
			match(STRING);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(97);
				match(T__1);
				setState(98);
				textAttributes();
				setState(99);
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
		enterRule(_localctx, 20, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__10);
			setState(104);
			match(STRING);
			setState(105);
			match(T__1);
			setState(106);
			imageAttributes();
			setState(107);
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
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__11);
			setState(110);
			match(T__1);
			setState(111);
			match(T__12);
			setState(112);
			match(STRING);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(113);
				listItem();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		enterRule(_localctx, 24, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__13);
			setState(122);
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
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<FontSizeContext> fontSize() {
			return getRuleContexts(FontSizeContext.class);
		}
		public FontSizeContext fontSize(int i) {
			return getRuleContext(FontSizeContext.class,i);
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
		enterRule(_localctx, 26, RULE_textAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 295488L) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(124);
					color();
					}
					break;
				case T__14:
					{
					setState(125);
					fontSize();
					}
					break;
				case T__8:
					{
					setState(126);
					alignment();
					}
					break;
				case T__5:
					{
					setState(127);
					backgroundColor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
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
		public List<AlignmentContext> alignment() {
			return getRuleContexts(AlignmentContext.class);
		}
		public AlignmentContext alignment(int i) {
			return getRuleContext(AlignmentContext.class,i);
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
		enterRule(_localctx, 28, RULE_imageAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__15) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(133);
					width();
					}
					break;
				case T__8:
					{
					setState(134);
					alignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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
		enterRule(_localctx, 30, RULE_fontSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__14);
			setState(141);
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
		enterRule(_localctx, 32, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__15);
			setState(144);
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
		enterRule(_localctx, 34, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
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
		enterRule(_localctx, 36, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__17);
			setState(150);
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
		"\u0004\u0001\u0014\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b"+
		"\u0001\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006J\b"+
		"\u0006\n\u0006\f\u0006M\t\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007X\b\u0007\n\u0007\f\u0007[\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tf\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bs\b\u000b\n\u000b\f\u000bv\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0081\b\r\n\r\f\r\u0084\t\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0088\b\u000e\n\u000e\f\u000e\u008b\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0000\u009a\u0000&\u0001\u0000\u0000"+
		"\u0000\u00022\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006"+
		"8\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000"+
		"\u0000\fD\u0001\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010"+
		"\\\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014g\u0001"+
		"\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018y\u0001\u0000\u0000"+
		"\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000"+
		"\u0000\u001e\u008c\u0001\u0000\u0000\u0000 \u008f\u0001\u0000\u0000\u0000"+
		"\"\u0092\u0001\u0000\u0000\u0000$\u0095\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\'(\u0005\u0013\u0000\u0000()\u0005\u0002\u0000\u0000"+
		")*\u0003\u0002\u0001\u0000*+\u0005\u0003\u0000\u0000+\u0001\u0001\u0000"+
		"\u0000\u0000,1\u0003\u0004\u0002\u0000-1\u0003\u0006\u0003\u0000.1\u0003"+
		"\n\u0005\u0000/1\u0003\f\u0006\u00000,\u0001\u0000\u0000\u00000-\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"14\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005"+
		"\u0004\u0000\u000067\u0005\u0013\u0000\u00007\u0005\u0001\u0000\u0000"+
		"\u000089\u0005\u0005\u0000\u00009:\u0005\u0013\u0000\u0000:\u0007\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u0005\u0013\u0000\u0000"+
		"=\t\u0001\u0000\u0000\u0000>?\u0005\u0007\u0000\u0000?@\u0005\u0013\u0000"+
		"\u0000@A\u0005\u0002\u0000\u0000AB\u0003\u000e\u0007\u0000BC\u0005\u0003"+
		"\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000EO\u0005"+
		"\u0013\u0000\u0000FK\u0005\u0002\u0000\u0000GJ\u0003\"\u0011\u0000HJ\u0003"+
		"$\u0012\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0005\u0003\u0000"+
		"\u0000OF\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\r\u0001\u0000"+
		"\u0000\u0000QX\u0003\u0010\b\u0000RX\u0003\b\u0004\u0000SX\u0003\u0012"+
		"\t\u0000TX\u0003\u0014\n\u0000UX\u0003\f\u0006\u0000VX\u0003\n\u0005\u0000"+
		"WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000"+
		"\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0005\t\u0000\u0000]^\u0005\u0013\u0000\u0000^\u0011\u0001\u0000"+
		"\u0000\u0000_`\u0005\n\u0000\u0000`e\u0005\u0013\u0000\u0000ab\u0005\u0002"+
		"\u0000\u0000bc\u0003\u001a\r\u0000cd\u0005\u0003\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0013"+
		"\u0001\u0000\u0000\u0000gh\u0005\u000b\u0000\u0000hi\u0005\u0013\u0000"+
		"\u0000ij\u0005\u0002\u0000\u0000jk\u0003\u001c\u000e\u0000kl\u0005\u0003"+
		"\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mn\u0005\f\u0000\u0000no\u0005"+
		"\u0002\u0000\u0000op\u0005\r\u0000\u0000pt\u0005\u0013\u0000\u0000qs\u0003"+
		"\u0018\f\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0005\u0003\u0000\u0000x\u0017\u0001\u0000"+
		"\u0000\u0000yz\u0005\u000e\u0000\u0000z{\u0005\u0013\u0000\u0000{\u0019"+
		"\u0001\u0000\u0000\u0000|\u0081\u0003$\u0012\u0000}\u0081\u0003\u001e"+
		"\u000f\u0000~\u0081\u0003\u0010\b\u0000\u007f\u0081\u0003\b\u0004\u0000"+
		"\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0003 \u0010\u0000\u0086\u0088\u0003"+
		"\u0010\b\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u001d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000f"+
		"\u0000\u0000\u008d\u008e\u0005\u0013\u0000\u0000\u008e\u001f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0091\u0005\u0013"+
		"\u0000\u0000\u0091!\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0011\u0000"+
		"\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094#\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0012\u0000\u0000\u0096\u0097\u0005\u0013\u0000\u0000"+
		"\u0097%\u0001\u0000\u0000\u0000\r02IKOWYet\u0080\u0082\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}