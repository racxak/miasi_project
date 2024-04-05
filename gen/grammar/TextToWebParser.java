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
		T__17=18, T__18=19, STRING=20, WS=21;
	public static final int
		RULE_page = 0, RULE_pageContent = 1, RULE_theme = 2, RULE_font = 3, RULE_backgroundColor = 4, 
		RULE_section = 5, RULE_header = 6, RULE_sectionContent = 7, RULE_alignment = 8, 
		RULE_text = 9, RULE_image = 10, RULE_list = 11, RULE_listItem = 12, RULE_textAttributes = 13, 
		RULE_imageAttributes = 14, RULE_headerAttributes = 15, RULE_fontColor = 16, 
		RULE_fontSize = 17, RULE_width = 18, RULE_level = 19, RULE_color = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "pageContent", "theme", "font", "backgroundColor", "section", 
			"header", "sectionContent", "alignment", "text", "image", "list", "listItem", 
			"textAttributes", "imageAttributes", "headerAttributes", "fontColor", 
			"fontSize", "width", "level", "color"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Strona'", "'{'", "'}'", "'Motyw'", "'Czcionka'", "'KolorT\\u0139\\u201Aa'", 
			"'Sekcja'", "'Naglowek'", "'Rozmieszczenie'", "'Tekst'", "'Obraz'", "'Lista'", 
			"'Typ'", "'Element'", "'KolorCzcionki'", "'Rozmiar'", "'Szeroko\\u0139\\u203A\\u00C4\\u2021'", 
			"'Poziom'", "'Kolor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "STRING", "WS"
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
			setState(42);
			match(T__0);
			setState(43);
			match(STRING);
			setState(44);
			match(T__1);
			setState(45);
			pageContent();
			setState(46);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432L) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(48);
					theme();
					}
					break;
				case T__4:
					{
					setState(49);
					font();
					}
					break;
				case T__6:
					{
					setState(50);
					section();
					}
					break;
				case T__7:
					{
					setState(51);
					header();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
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
			setState(57);
			match(T__3);
			setState(58);
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
			setState(60);
			match(T__4);
			setState(61);
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
			setState(63);
			match(T__5);
			setState(64);
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
			setState(66);
			match(T__6);
			setState(67);
			match(STRING);
			setState(68);
			match(T__1);
			setState(69);
			sectionContent();
			setState(70);
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
		public List<FontColorContext> fontColor() {
			return getRuleContexts(FontColorContext.class);
		}
		public FontColorContext fontColor(int i) {
			return getRuleContext(FontColorContext.class,i);
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
			setState(72);
			match(T__7);
			setState(73);
			match(STRING);
			setState(74);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__17) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(75);
					level();
					}
					break;
				case T__14:
					{
					setState(76);
					fontColor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(84);
					alignment();
					}
					break;
				case T__5:
					{
					setState(85);
					backgroundColor();
					}
					break;
				case T__9:
					{
					setState(86);
					text();
					}
					break;
				case T__10:
					{
					setState(87);
					image();
					}
					break;
				case T__7:
					{
					setState(88);
					header();
					}
					break;
				case T__6:
					{
					setState(89);
					section();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
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
			setState(95);
			match(T__8);
			setState(96);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__9);
			setState(99);
			match(STRING);
			setState(100);
			match(T__1);
			setState(101);
			textAttributes();
			setState(102);
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
			setState(104);
			match(T__10);
			setState(105);
			match(STRING);
			setState(106);
			match(T__1);
			setState(107);
			imageAttributes();
			setState(108);
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
			setState(110);
			match(T__11);
			setState(111);
			match(T__1);
			setState(112);
			match(T__12);
			setState(113);
			match(STRING);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(114);
				listItem();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
			setState(122);
			match(T__13);
			setState(123);
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
		public List<FontColorContext> fontColor() {
			return getRuleContexts(FontColorContext.class);
		}
		public FontColorContext fontColor(int i) {
			return getRuleContext(FontColorContext.class,i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 98816L) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(125);
					fontColor();
					}
					break;
				case T__15:
					{
					setState(126);
					fontSize();
					}
					break;
				case T__8:
					{
					setState(127);
					alignment();
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
			while (_la==T__8 || _la==T__16) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
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
	public static class HeaderAttributesContext extends ParserRuleContext {
		public List<LevelContext> level() {
			return getRuleContexts(LevelContext.class);
		}
		public LevelContext level(int i) {
			return getRuleContext(LevelContext.class,i);
		}
		public List<FontColorContext> fontColor() {
			return getRuleContexts(FontColorContext.class);
		}
		public FontColorContext fontColor(int i) {
			return getRuleContext(FontColorContext.class,i);
		}
		public HeaderAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAttributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitHeaderAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAttributesContext headerAttributes() throws RecognitionException {
		HeaderAttributesContext _localctx = new HeaderAttributesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_headerAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__17) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(140);
					level();
					}
					break;
				case T__14:
					{
					setState(141);
					fontColor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
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
	public static class FontColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TextToWebParser.STRING, 0); }
		public FontColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToWebVisitor ) return ((TextToWebVisitor<? extends T>)visitor).visitFontColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontColorContext fontColor() throws RecognitionException {
		FontColorContext _localctx = new FontColorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fontColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__14);
			setState(148);
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
			setState(150);
			match(T__15);
			setState(151);
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
			setState(153);
			match(T__16);
			setState(154);
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
		enterRule(_localctx, 38, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__17);
			setState(157);
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
		enterRule(_localctx, 40, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__18);
			setState(160);
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
		"\u0004\u0001\u0015\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007[\b\u0007\n\u0007\f\u0007^\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bt\b\u000b\n\u000b"+
		"\f\u000bw\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0081\b\r\n\r\f\r\u0084\t\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0088\b\u000e\n\u000e\f\u000e\u008b\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u008f\b\u000f\n\u000f\f\u000f\u0092\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0000\u00a1\u0000*\u0001\u0000\u0000\u0000\u00026\u0001\u0000"+
		"\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000"+
		"\b?\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fH\u0001\u0000"+
		"\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000"+
		"\u0000\u0012b\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016"+
		"n\u0001\u0000\u0000\u0000\u0018z\u0001\u0000\u0000\u0000\u001a\u0082\u0001"+
		"\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u0090\u0001"+
		"\u0000\u0000\u0000 \u0093\u0001\u0000\u0000\u0000\"\u0096\u0001\u0000"+
		"\u0000\u0000$\u0099\u0001\u0000\u0000\u0000&\u009c\u0001\u0000\u0000\u0000"+
		"(\u009f\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0005\u0014"+
		"\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0003\u0002\u0001\u0000./\u0005"+
		"\u0003\u0000\u0000/\u0001\u0001\u0000\u0000\u000005\u0003\u0004\u0002"+
		"\u000015\u0003\u0006\u0003\u000025\u0003\n\u0005\u000035\u0003\f\u0006"+
		"\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0005\u0014"+
		"\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\u0005\u0000\u0000"+
		"=>\u0005\u0014\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u0006"+
		"\u0000\u0000@A\u0005\u0014\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0007\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0005\u0002\u0000\u0000"+
		"EF\u0003\u000e\u0007\u0000FG\u0005\u0003\u0000\u0000G\u000b\u0001\u0000"+
		"\u0000\u0000HI\u0005\b\u0000\u0000IJ\u0005\u0014\u0000\u0000JO\u0005\u0002"+
		"\u0000\u0000KN\u0003&\u0013\u0000LN\u0003 \u0010\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0003\u0000\u0000S\r\u0001\u0000\u0000\u0000"+
		"T[\u0003\u0010\b\u0000U[\u0003\b\u0004\u0000V[\u0003\u0012\t\u0000W[\u0003"+
		"\u0014\n\u0000X[\u0003\f\u0006\u0000Y[\u0003\n\u0005\u0000ZT\u0001\u0000"+
		"\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000ZW\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u000f\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005"+
		"\t\u0000\u0000`a\u0005\u0014\u0000\u0000a\u0011\u0001\u0000\u0000\u0000"+
		"bc\u0005\n\u0000\u0000cd\u0005\u0014\u0000\u0000de\u0005\u0002\u0000\u0000"+
		"ef\u0003\u001a\r\u0000fg\u0005\u0003\u0000\u0000g\u0013\u0001\u0000\u0000"+
		"\u0000hi\u0005\u000b\u0000\u0000ij\u0005\u0014\u0000\u0000jk\u0005\u0002"+
		"\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005\u0003\u0000\u0000m\u0015"+
		"\u0001\u0000\u0000\u0000no\u0005\f\u0000\u0000op\u0005\u0002\u0000\u0000"+
		"pq\u0005\r\u0000\u0000qu\u0005\u0014\u0000\u0000rt\u0003\u0018\f\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0003\u0000\u0000y\u0017\u0001\u0000\u0000\u0000"+
		"z{\u0005\u000e\u0000\u0000{|\u0005\u0014\u0000\u0000|\u0019\u0001\u0000"+
		"\u0000\u0000}\u0081\u0003 \u0010\u0000~\u0081\u0003\"\u0011\u0000\u007f"+
		"\u0081\u0003\u0010\b\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0003$\u0012\u0000\u0086\u0088\u0003\u0010"+
		"\b\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u001d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0003&\u0013\u0000"+
		"\u008d\u008f\u0003 \u0010\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u001f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u000f\u0000\u0000\u0094\u0095\u0005\u0014\u0000\u0000\u0095"+
		"!\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u0098"+
		"\u0005\u0014\u0000\u0000\u0098#\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0011\u0000\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b%\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u009e\u0005\u0014"+
		"\u0000\u0000\u009e\'\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0013\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1)\u0001\u0000\u0000\u0000"+
		"\r46MOZ\\u\u0080\u0082\u0087\u0089\u008e\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}