package ac.soton.xeventb.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.xeventb.services.ProofAssistantGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProofAssistantParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'ProofAssistant'", "'supports'", "'end'", "'hints'", "'for'", "'selects'", "'cases'", "'%'", "'\\u22C2'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_XLABEL=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalProofAssistantParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProofAssistantParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProofAssistantParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProofAssistant.g"; }


    	private ProofAssistantGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProofAssistantGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProofAssistant"
    // InternalProofAssistant.g:53:1: entryRuleProofAssistant : ruleProofAssistant EOF ;
    public final void entryRuleProofAssistant() throws RecognitionException {
        try {
            // InternalProofAssistant.g:54:1: ( ruleProofAssistant EOF )
            // InternalProofAssistant.g:55:1: ruleProofAssistant EOF
            {
             before(grammarAccess.getProofAssistantRule()); 
            pushFollow(FOLLOW_1);
            ruleProofAssistant();

            state._fsp--;

             after(grammarAccess.getProofAssistantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProofAssistant"


    // $ANTLR start "ruleProofAssistant"
    // InternalProofAssistant.g:62:1: ruleProofAssistant : ( ( rule__ProofAssistant__Group__0 ) ) ;
    public final void ruleProofAssistant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:66:2: ( ( ( rule__ProofAssistant__Group__0 ) ) )
            // InternalProofAssistant.g:67:2: ( ( rule__ProofAssistant__Group__0 ) )
            {
            // InternalProofAssistant.g:67:2: ( ( rule__ProofAssistant__Group__0 ) )
            // InternalProofAssistant.g:68:3: ( rule__ProofAssistant__Group__0 )
            {
             before(grammarAccess.getProofAssistantAccess().getGroup()); 
            // InternalProofAssistant.g:69:3: ( rule__ProofAssistant__Group__0 )
            // InternalProofAssistant.g:69:4: rule__ProofAssistant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProofAssistantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProofAssistant"


    // $ANTLR start "entryRuleHint"
    // InternalProofAssistant.g:78:1: entryRuleHint : ruleHint EOF ;
    public final void entryRuleHint() throws RecognitionException {
        try {
            // InternalProofAssistant.g:79:1: ( ruleHint EOF )
            // InternalProofAssistant.g:80:1: ruleHint EOF
            {
             before(grammarAccess.getHintRule()); 
            pushFollow(FOLLOW_1);
            ruleHint();

            state._fsp--;

             after(grammarAccess.getHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHint"


    // $ANTLR start "ruleHint"
    // InternalProofAssistant.g:87:1: ruleHint : ( ( rule__Hint__Alternatives ) ) ;
    public final void ruleHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:91:2: ( ( ( rule__Hint__Alternatives ) ) )
            // InternalProofAssistant.g:92:2: ( ( rule__Hint__Alternatives ) )
            {
            // InternalProofAssistant.g:92:2: ( ( rule__Hint__Alternatives ) )
            // InternalProofAssistant.g:93:3: ( rule__Hint__Alternatives )
            {
             before(grammarAccess.getHintAccess().getAlternatives()); 
            // InternalProofAssistant.g:94:3: ( rule__Hint__Alternatives )
            // InternalProofAssistant.g:94:4: rule__Hint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Hint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHint"


    // $ANTLR start "entryRuleEString"
    // InternalProofAssistant.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalProofAssistant.g:104:1: ( ruleEString EOF )
            // InternalProofAssistant.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalProofAssistant.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalProofAssistant.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalProofAssistant.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalProofAssistant.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalProofAssistant.g:119:3: ( rule__EString__Alternatives )
            // InternalProofAssistant.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSelectionHint"
    // InternalProofAssistant.g:128:1: entryRuleSelectionHint : ruleSelectionHint EOF ;
    public final void entryRuleSelectionHint() throws RecognitionException {
        try {
            // InternalProofAssistant.g:129:1: ( ruleSelectionHint EOF )
            // InternalProofAssistant.g:130:1: ruleSelectionHint EOF
            {
             before(grammarAccess.getSelectionHintRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectionHint();

            state._fsp--;

             after(grammarAccess.getSelectionHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionHint"


    // $ANTLR start "ruleSelectionHint"
    // InternalProofAssistant.g:137:1: ruleSelectionHint : ( ( rule__SelectionHint__Group__0 ) ) ;
    public final void ruleSelectionHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:141:2: ( ( ( rule__SelectionHint__Group__0 ) ) )
            // InternalProofAssistant.g:142:2: ( ( rule__SelectionHint__Group__0 ) )
            {
            // InternalProofAssistant.g:142:2: ( ( rule__SelectionHint__Group__0 ) )
            // InternalProofAssistant.g:143:3: ( rule__SelectionHint__Group__0 )
            {
             before(grammarAccess.getSelectionHintAccess().getGroup()); 
            // InternalProofAssistant.g:144:3: ( rule__SelectionHint__Group__0 )
            // InternalProofAssistant.g:144:4: rule__SelectionHint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionHint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionHintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionHint"


    // $ANTLR start "entryRuleCasesHint"
    // InternalProofAssistant.g:153:1: entryRuleCasesHint : ruleCasesHint EOF ;
    public final void entryRuleCasesHint() throws RecognitionException {
        try {
            // InternalProofAssistant.g:154:1: ( ruleCasesHint EOF )
            // InternalProofAssistant.g:155:1: ruleCasesHint EOF
            {
             before(grammarAccess.getCasesHintRule()); 
            pushFollow(FOLLOW_1);
            ruleCasesHint();

            state._fsp--;

             after(grammarAccess.getCasesHintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCasesHint"


    // $ANTLR start "ruleCasesHint"
    // InternalProofAssistant.g:162:1: ruleCasesHint : ( ( rule__CasesHint__Group__0 ) ) ;
    public final void ruleCasesHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:166:2: ( ( ( rule__CasesHint__Group__0 ) ) )
            // InternalProofAssistant.g:167:2: ( ( rule__CasesHint__Group__0 ) )
            {
            // InternalProofAssistant.g:167:2: ( ( rule__CasesHint__Group__0 ) )
            // InternalProofAssistant.g:168:3: ( rule__CasesHint__Group__0 )
            {
             before(grammarAccess.getCasesHintAccess().getGroup()); 
            // InternalProofAssistant.g:169:3: ( rule__CasesHint__Group__0 )
            // InternalProofAssistant.g:169:4: rule__CasesHint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CasesHint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCasesHintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCasesHint"


    // $ANTLR start "entryRuleCase"
    // InternalProofAssistant.g:178:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalProofAssistant.g:179:1: ( ruleCase EOF )
            // InternalProofAssistant.g:180:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalProofAssistant.g:187:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:191:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalProofAssistant.g:192:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalProofAssistant.g:192:2: ( ( rule__Case__Group__0 ) )
            // InternalProofAssistant.g:193:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalProofAssistant.g:194:3: ( rule__Case__Group__0 )
            // InternalProofAssistant.g:194:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleXFormula"
    // InternalProofAssistant.g:203:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalProofAssistant.g:204:1: ( ruleXFormula EOF )
            // InternalProofAssistant.g:205:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalProofAssistant.g:212:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:216:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalProofAssistant.g:217:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalProofAssistant.g:217:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalProofAssistant.g:218:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalProofAssistant.g:218:3: ( ( rule__XFormula__Alternatives ) )
            // InternalProofAssistant.g:219:4: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalProofAssistant.g:220:4: ( rule__XFormula__Alternatives )
            // InternalProofAssistant.g:220:5: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }

            // InternalProofAssistant.g:223:3: ( ( rule__XFormula__Alternatives )* )
            // InternalProofAssistant.g:224:4: ( rule__XFormula__Alternatives )*
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalProofAssistant.g:225:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=12 && LA1_0<=109)||LA1_0==117) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProofAssistant.g:225:5: rule__XFormula__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XFormula__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalProofAssistant.g:235:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalProofAssistant.g:236:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalProofAssistant.g:237:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "ruleEVENTB_IDENTIFIER_KEYWORD"
    // InternalProofAssistant.g:244:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:248:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalProofAssistant.g:249:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalProofAssistant.g:249:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalProofAssistant.g:250:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalProofAssistant.g:251:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalProofAssistant.g:251:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_IDENTIFIER_KEYWORD"


    // $ANTLR start "entryRuleEVENTB_PREDICATE_SYMBOLS"
    // InternalProofAssistant.g:260:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalProofAssistant.g:261:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalProofAssistant.g:262:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "ruleEVENTB_PREDICATE_SYMBOLS"
    // InternalProofAssistant.g:269:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:273:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalProofAssistant.g:274:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalProofAssistant.g:274:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalProofAssistant.g:275:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalProofAssistant.g:276:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalProofAssistant.g:276:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_PREDICATE_SYMBOLS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_PREDICATE_SYMBOLS"


    // $ANTLR start "entryRuleEVENTB_EXPRESSION_SYMBOLS"
    // InternalProofAssistant.g:285:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalProofAssistant.g:286:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalProofAssistant.g:287:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FOLLOW_1);
            ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "ruleEVENTB_EXPRESSION_SYMBOLS"
    // InternalProofAssistant.g:294:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:298:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalProofAssistant.g:299:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalProofAssistant.g:299:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalProofAssistant.g:300:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalProofAssistant.g:301:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalProofAssistant.g:301:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENTB_EXPRESSION_SYMBOLS"


    // $ANTLR start "rule__Hint__Alternatives"
    // InternalProofAssistant.g:309:1: rule__Hint__Alternatives : ( ( ruleSelectionHint ) | ( ruleCasesHint ) );
    public final void rule__Hint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:313:1: ( ( ruleSelectionHint ) | ( ruleCasesHint ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==114) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==115) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==116) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==115) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==116) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProofAssistant.g:314:2: ( ruleSelectionHint )
                    {
                    // InternalProofAssistant.g:314:2: ( ruleSelectionHint )
                    // InternalProofAssistant.g:315:3: ruleSelectionHint
                    {
                     before(grammarAccess.getHintAccess().getSelectionHintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectionHint();

                    state._fsp--;

                     after(grammarAccess.getHintAccess().getSelectionHintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:320:2: ( ruleCasesHint )
                    {
                    // InternalProofAssistant.g:320:2: ( ruleCasesHint )
                    // InternalProofAssistant.g:321:3: ruleCasesHint
                    {
                     before(grammarAccess.getHintAccess().getCasesHintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCasesHint();

                    state._fsp--;

                     after(grammarAccess.getHintAccess().getCasesHintParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hint__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalProofAssistant.g:330:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:334:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProofAssistant.g:335:2: ( RULE_STRING )
                    {
                    // InternalProofAssistant.g:335:2: ( RULE_STRING )
                    // InternalProofAssistant.g:336:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:341:2: ( RULE_ID )
                    {
                    // InternalProofAssistant.g:341:2: ( RULE_ID )
                    // InternalProofAssistant.g:342:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalProofAssistant.g:351:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:355:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt4=2;
                }
                break;
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 117:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalProofAssistant.g:356:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalProofAssistant.g:356:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalProofAssistant.g:357:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:362:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalProofAssistant.g:362:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalProofAssistant.g:363:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProofAssistant.g:368:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalProofAssistant.g:368:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalProofAssistant.g:369:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProofAssistant.g:374:2: ( RULE_ID )
                    {
                    // InternalProofAssistant.g:374:2: ( RULE_ID )
                    // InternalProofAssistant.g:375:3: RULE_ID
                    {
                     before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProofAssistant.g:380:2: ( RULE_INT )
                    {
                    // InternalProofAssistant.g:380:2: ( RULE_INT )
                    // InternalProofAssistant.g:381:3: RULE_INT
                    {
                     before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"
    // InternalProofAssistant.g:390:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:394:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt5=23;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            case 20:
                {
                alt5=9;
                }
                break;
            case 21:
                {
                alt5=10;
                }
                break;
            case 22:
                {
                alt5=11;
                }
                break;
            case 23:
                {
                alt5=12;
                }
                break;
            case 24:
                {
                alt5=13;
                }
                break;
            case 25:
                {
                alt5=14;
                }
                break;
            case 26:
                {
                alt5=15;
                }
                break;
            case 27:
                {
                alt5=16;
                }
                break;
            case 28:
                {
                alt5=17;
                }
                break;
            case 29:
                {
                alt5=18;
                }
                break;
            case 30:
                {
                alt5=19;
                }
                break;
            case 31:
                {
                alt5=20;
                }
                break;
            case 32:
                {
                alt5=21;
                }
                break;
            case 33:
                {
                alt5=22;
                }
                break;
            case 34:
                {
                alt5=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalProofAssistant.g:395:2: ( 'BOOL' )
                    {
                    // InternalProofAssistant.g:395:2: ( 'BOOL' )
                    // InternalProofAssistant.g:396:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:401:2: ( 'FALSE' )
                    {
                    // InternalProofAssistant.g:401:2: ( 'FALSE' )
                    // InternalProofAssistant.g:402:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProofAssistant.g:407:2: ( 'TRUE' )
                    {
                    // InternalProofAssistant.g:407:2: ( 'TRUE' )
                    // InternalProofAssistant.g:408:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProofAssistant.g:413:2: ( 'bool' )
                    {
                    // InternalProofAssistant.g:413:2: ( 'bool' )
                    // InternalProofAssistant.g:414:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProofAssistant.g:419:2: ( 'card' )
                    {
                    // InternalProofAssistant.g:419:2: ( 'card' )
                    // InternalProofAssistant.g:420:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProofAssistant.g:425:2: ( 'dom' )
                    {
                    // InternalProofAssistant.g:425:2: ( 'dom' )
                    // InternalProofAssistant.g:426:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProofAssistant.g:431:2: ( 'finite' )
                    {
                    // InternalProofAssistant.g:431:2: ( 'finite' )
                    // InternalProofAssistant.g:432:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProofAssistant.g:437:2: ( 'id' )
                    {
                    // InternalProofAssistant.g:437:2: ( 'id' )
                    // InternalProofAssistant.g:438:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProofAssistant.g:443:2: ( 'inter' )
                    {
                    // InternalProofAssistant.g:443:2: ( 'inter' )
                    // InternalProofAssistant.g:444:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalProofAssistant.g:449:2: ( 'max' )
                    {
                    // InternalProofAssistant.g:449:2: ( 'max' )
                    // InternalProofAssistant.g:450:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalProofAssistant.g:455:2: ( 'min' )
                    {
                    // InternalProofAssistant.g:455:2: ( 'min' )
                    // InternalProofAssistant.g:456:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalProofAssistant.g:461:2: ( 'mod' )
                    {
                    // InternalProofAssistant.g:461:2: ( 'mod' )
                    // InternalProofAssistant.g:462:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalProofAssistant.g:467:2: ( 'pred' )
                    {
                    // InternalProofAssistant.g:467:2: ( 'pred' )
                    // InternalProofAssistant.g:468:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalProofAssistant.g:473:2: ( 'prj1' )
                    {
                    // InternalProofAssistant.g:473:2: ( 'prj1' )
                    // InternalProofAssistant.g:474:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalProofAssistant.g:479:2: ( 'prj2' )
                    {
                    // InternalProofAssistant.g:479:2: ( 'prj2' )
                    // InternalProofAssistant.g:480:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalProofAssistant.g:485:2: ( 'ran' )
                    {
                    // InternalProofAssistant.g:485:2: ( 'ran' )
                    // InternalProofAssistant.g:486:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalProofAssistant.g:491:2: ( 'succ' )
                    {
                    // InternalProofAssistant.g:491:2: ( 'succ' )
                    // InternalProofAssistant.g:492:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalProofAssistant.g:497:2: ( 'union' )
                    {
                    // InternalProofAssistant.g:497:2: ( 'union' )
                    // InternalProofAssistant.g:498:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalProofAssistant.g:503:2: ( '\\u21151' )
                    {
                    // InternalProofAssistant.g:503:2: ( '\\u21151' )
                    // InternalProofAssistant.g:504:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalProofAssistant.g:509:2: ( '\\u2115' )
                    {
                    // InternalProofAssistant.g:509:2: ( '\\u2115' )
                    // InternalProofAssistant.g:510:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalProofAssistant.g:515:2: ( '\\u21191' )
                    {
                    // InternalProofAssistant.g:515:2: ( '\\u21191' )
                    // InternalProofAssistant.g:516:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalProofAssistant.g:521:2: ( '\\u2119' )
                    {
                    // InternalProofAssistant.g:521:2: ( '\\u2119' )
                    // InternalProofAssistant.g:522:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalProofAssistant.g:527:2: ( '\\u2124' )
                    {
                    // InternalProofAssistant.g:527:2: ( '\\u2124' )
                    // InternalProofAssistant.g:528:3: '\\u2124'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"


    // $ANTLR start "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"
    // InternalProofAssistant.g:537:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:541:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt6=31;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
                {
                alt6=4;
                }
                break;
            case 39:
                {
                alt6=5;
                }
                break;
            case 40:
                {
                alt6=6;
                }
                break;
            case 41:
                {
                alt6=7;
                }
                break;
            case 42:
                {
                alt6=8;
                }
                break;
            case 43:
                {
                alt6=9;
                }
                break;
            case 44:
                {
                alt6=10;
                }
                break;
            case 45:
                {
                alt6=11;
                }
                break;
            case 46:
                {
                alt6=12;
                }
                break;
            case 47:
                {
                alt6=13;
                }
                break;
            case 48:
                {
                alt6=14;
                }
                break;
            case 49:
                {
                alt6=15;
                }
                break;
            case 50:
                {
                alt6=16;
                }
                break;
            case 51:
                {
                alt6=17;
                }
                break;
            case 52:
                {
                alt6=18;
                }
                break;
            case 53:
                {
                alt6=19;
                }
                break;
            case 54:
                {
                alt6=20;
                }
                break;
            case 55:
                {
                alt6=21;
                }
                break;
            case 56:
                {
                alt6=22;
                }
                break;
            case 57:
                {
                alt6=23;
                }
                break;
            case 58:
                {
                alt6=24;
                }
                break;
            case 59:
                {
                alt6=25;
                }
                break;
            case 60:
                {
                alt6=26;
                }
                break;
            case 61:
                {
                alt6=27;
                }
                break;
            case 62:
                {
                alt6=28;
                }
                break;
            case 63:
                {
                alt6=29;
                }
                break;
            case 64:
                {
                alt6=30;
                }
                break;
            case 65:
                {
                alt6=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalProofAssistant.g:542:2: ( '(' )
                    {
                    // InternalProofAssistant.g:542:2: ( '(' )
                    // InternalProofAssistant.g:543:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:548:2: ( ')' )
                    {
                    // InternalProofAssistant.g:548:2: ( ')' )
                    // InternalProofAssistant.g:549:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProofAssistant.g:554:2: ( '\\u21D4' )
                    {
                    // InternalProofAssistant.g:554:2: ( '\\u21D4' )
                    // InternalProofAssistant.g:555:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProofAssistant.g:560:2: ( '\\u21D2' )
                    {
                    // InternalProofAssistant.g:560:2: ( '\\u21D2' )
                    // InternalProofAssistant.g:561:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProofAssistant.g:566:2: ( '\\u2227' )
                    {
                    // InternalProofAssistant.g:566:2: ( '\\u2227' )
                    // InternalProofAssistant.g:567:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProofAssistant.g:572:2: ( '&' )
                    {
                    // InternalProofAssistant.g:572:2: ( '&' )
                    // InternalProofAssistant.g:573:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProofAssistant.g:578:2: ( '\\u2228' )
                    {
                    // InternalProofAssistant.g:578:2: ( '\\u2228' )
                    // InternalProofAssistant.g:579:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProofAssistant.g:584:2: ( '\\u00AC' )
                    {
                    // InternalProofAssistant.g:584:2: ( '\\u00AC' )
                    // InternalProofAssistant.g:585:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProofAssistant.g:590:2: ( '\\u22A4' )
                    {
                    // InternalProofAssistant.g:590:2: ( '\\u22A4' )
                    // InternalProofAssistant.g:591:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalProofAssistant.g:596:2: ( '\\u22A5' )
                    {
                    // InternalProofAssistant.g:596:2: ( '\\u22A5' )
                    // InternalProofAssistant.g:597:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalProofAssistant.g:602:2: ( '\\u2200' )
                    {
                    // InternalProofAssistant.g:602:2: ( '\\u2200' )
                    // InternalProofAssistant.g:603:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalProofAssistant.g:608:2: ( '!' )
                    {
                    // InternalProofAssistant.g:608:2: ( '!' )
                    // InternalProofAssistant.g:609:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalProofAssistant.g:614:2: ( '\\u2203' )
                    {
                    // InternalProofAssistant.g:614:2: ( '\\u2203' )
                    // InternalProofAssistant.g:615:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalProofAssistant.g:620:2: ( '#' )
                    {
                    // InternalProofAssistant.g:620:2: ( '#' )
                    // InternalProofAssistant.g:621:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalProofAssistant.g:626:2: ( ',' )
                    {
                    // InternalProofAssistant.g:626:2: ( ',' )
                    // InternalProofAssistant.g:627:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalProofAssistant.g:632:2: ( '\\u00B7' )
                    {
                    // InternalProofAssistant.g:632:2: ( '\\u00B7' )
                    // InternalProofAssistant.g:633:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalProofAssistant.g:638:2: ( '.' )
                    {
                    // InternalProofAssistant.g:638:2: ( '.' )
                    // InternalProofAssistant.g:639:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalProofAssistant.g:644:2: ( '=' )
                    {
                    // InternalProofAssistant.g:644:2: ( '=' )
                    // InternalProofAssistant.g:645:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalProofAssistant.g:650:2: ( '\\u2260' )
                    {
                    // InternalProofAssistant.g:650:2: ( '\\u2260' )
                    // InternalProofAssistant.g:651:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalProofAssistant.g:656:2: ( '\\u2264' )
                    {
                    // InternalProofAssistant.g:656:2: ( '\\u2264' )
                    // InternalProofAssistant.g:657:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalProofAssistant.g:662:2: ( '<' )
                    {
                    // InternalProofAssistant.g:662:2: ( '<' )
                    // InternalProofAssistant.g:663:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalProofAssistant.g:668:2: ( '\\u2265' )
                    {
                    // InternalProofAssistant.g:668:2: ( '\\u2265' )
                    // InternalProofAssistant.g:669:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalProofAssistant.g:674:2: ( '>' )
                    {
                    // InternalProofAssistant.g:674:2: ( '>' )
                    // InternalProofAssistant.g:675:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalProofAssistant.g:680:2: ( '\\u2208' )
                    {
                    // InternalProofAssistant.g:680:2: ( '\\u2208' )
                    // InternalProofAssistant.g:681:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalProofAssistant.g:686:2: ( ':' )
                    {
                    // InternalProofAssistant.g:686:2: ( ':' )
                    // InternalProofAssistant.g:687:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalProofAssistant.g:692:2: ( '\\u2209' )
                    {
                    // InternalProofAssistant.g:692:2: ( '\\u2209' )
                    // InternalProofAssistant.g:693:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalProofAssistant.g:698:2: ( '\\u2282' )
                    {
                    // InternalProofAssistant.g:698:2: ( '\\u2282' )
                    // InternalProofAssistant.g:699:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalProofAssistant.g:704:2: ( '\\u2284' )
                    {
                    // InternalProofAssistant.g:704:2: ( '\\u2284' )
                    // InternalProofAssistant.g:705:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalProofAssistant.g:710:2: ( '\\u2286' )
                    {
                    // InternalProofAssistant.g:710:2: ( '\\u2286' )
                    // InternalProofAssistant.g:711:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalProofAssistant.g:716:2: ( '\\u2288' )
                    {
                    // InternalProofAssistant.g:716:2: ( '\\u2288' )
                    // InternalProofAssistant.g:717:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalProofAssistant.g:722:2: ( 'partition' )
                    {
                    // InternalProofAssistant.g:722:2: ( 'partition' )
                    // InternalProofAssistant.g:723:3: 'partition'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_PREDICATE_SYMBOLS__Alternatives"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"
    // InternalProofAssistant.g:732:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:736:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt7=45;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt7=1;
                }
                break;
            case 67:
                {
                alt7=2;
                }
                break;
            case 68:
                {
                alt7=3;
                }
                break;
            case 69:
                {
                alt7=4;
                }
                break;
            case 70:
                {
                alt7=5;
                }
                break;
            case 71:
                {
                alt7=6;
                }
                break;
            case 72:
                {
                alt7=7;
                }
                break;
            case 73:
                {
                alt7=8;
                }
                break;
            case 74:
                {
                alt7=9;
                }
                break;
            case 75:
                {
                alt7=10;
                }
                break;
            case 76:
                {
                alt7=11;
                }
                break;
            case 77:
                {
                alt7=12;
                }
                break;
            case 78:
                {
                alt7=13;
                }
                break;
            case 79:
                {
                alt7=14;
                }
                break;
            case 80:
                {
                alt7=15;
                }
                break;
            case 81:
                {
                alt7=16;
                }
                break;
            case 82:
                {
                alt7=17;
                }
                break;
            case 83:
                {
                alt7=18;
                }
                break;
            case 84:
                {
                alt7=19;
                }
                break;
            case 85:
                {
                alt7=20;
                }
                break;
            case 86:
                {
                alt7=21;
                }
                break;
            case 87:
                {
                alt7=22;
                }
                break;
            case 88:
                {
                alt7=23;
                }
                break;
            case 89:
                {
                alt7=24;
                }
                break;
            case 90:
                {
                alt7=25;
                }
                break;
            case 91:
                {
                alt7=26;
                }
                break;
            case 92:
                {
                alt7=27;
                }
                break;
            case 93:
                {
                alt7=28;
                }
                break;
            case 94:
                {
                alt7=29;
                }
                break;
            case 95:
                {
                alt7=30;
                }
                break;
            case 96:
                {
                alt7=31;
                }
                break;
            case 97:
                {
                alt7=32;
                }
                break;
            case 117:
                {
                alt7=33;
                }
                break;
            case 98:
                {
                alt7=34;
                }
                break;
            case 99:
                {
                alt7=35;
                }
                break;
            case 100:
                {
                alt7=36;
                }
                break;
            case 101:
                {
                alt7=37;
                }
                break;
            case 102:
                {
                alt7=38;
                }
                break;
            case 103:
                {
                alt7=39;
                }
                break;
            case 104:
                {
                alt7=40;
                }
                break;
            case 105:
                {
                alt7=41;
                }
                break;
            case 106:
                {
                alt7=42;
                }
                break;
            case 107:
                {
                alt7=43;
                }
                break;
            case 108:
                {
                alt7=44;
                }
                break;
            case 109:
                {
                alt7=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalProofAssistant.g:737:2: ( '\\u2194' )
                    {
                    // InternalProofAssistant.g:737:2: ( '\\u2194' )
                    // InternalProofAssistant.g:738:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:743:2: ( '\\uE100' )
                    {
                    // InternalProofAssistant.g:743:2: ( '\\uE100' )
                    // InternalProofAssistant.g:744:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProofAssistant.g:749:2: ( '\\uE101' )
                    {
                    // InternalProofAssistant.g:749:2: ( '\\uE101' )
                    // InternalProofAssistant.g:750:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProofAssistant.g:755:2: ( '\\uE102' )
                    {
                    // InternalProofAssistant.g:755:2: ( '\\uE102' )
                    // InternalProofAssistant.g:756:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProofAssistant.g:761:2: ( '\\u21F8' )
                    {
                    // InternalProofAssistant.g:761:2: ( '\\u21F8' )
                    // InternalProofAssistant.g:762:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProofAssistant.g:767:2: ( '\\u2192' )
                    {
                    // InternalProofAssistant.g:767:2: ( '\\u2192' )
                    // InternalProofAssistant.g:768:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProofAssistant.g:773:2: ( '\\u2914' )
                    {
                    // InternalProofAssistant.g:773:2: ( '\\u2914' )
                    // InternalProofAssistant.g:774:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProofAssistant.g:779:2: ( '\\u21A3' )
                    {
                    // InternalProofAssistant.g:779:2: ( '\\u21A3' )
                    // InternalProofAssistant.g:780:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProofAssistant.g:785:2: ( '\\u2900' )
                    {
                    // InternalProofAssistant.g:785:2: ( '\\u2900' )
                    // InternalProofAssistant.g:786:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalProofAssistant.g:791:2: ( '\\u21A0' )
                    {
                    // InternalProofAssistant.g:791:2: ( '\\u21A0' )
                    // InternalProofAssistant.g:792:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalProofAssistant.g:797:2: ( '\\u2916' )
                    {
                    // InternalProofAssistant.g:797:2: ( '\\u2916' )
                    // InternalProofAssistant.g:798:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalProofAssistant.g:803:2: ( '{' )
                    {
                    // InternalProofAssistant.g:803:2: ( '{' )
                    // InternalProofAssistant.g:804:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,77,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalProofAssistant.g:809:2: ( '}' )
                    {
                    // InternalProofAssistant.g:809:2: ( '}' )
                    // InternalProofAssistant.g:810:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,78,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalProofAssistant.g:815:2: ( '\\u21A6' )
                    {
                    // InternalProofAssistant.g:815:2: ( '\\u21A6' )
                    // InternalProofAssistant.g:816:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,79,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalProofAssistant.g:821:2: ( '\\u2205' )
                    {
                    // InternalProofAssistant.g:821:2: ( '\\u2205' )
                    // InternalProofAssistant.g:822:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,80,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalProofAssistant.g:827:2: ( '\\u2229' )
                    {
                    // InternalProofAssistant.g:827:2: ( '\\u2229' )
                    // InternalProofAssistant.g:828:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,81,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalProofAssistant.g:833:2: ( '\\u222A' )
                    {
                    // InternalProofAssistant.g:833:2: ( '\\u222A' )
                    // InternalProofAssistant.g:834:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,82,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalProofAssistant.g:839:2: ( '\\u2216' )
                    {
                    // InternalProofAssistant.g:839:2: ( '\\u2216' )
                    // InternalProofAssistant.g:840:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,83,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalProofAssistant.g:845:2: ( '\\u00D7' )
                    {
                    // InternalProofAssistant.g:845:2: ( '\\u00D7' )
                    // InternalProofAssistant.g:846:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,84,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalProofAssistant.g:851:2: ( '[' )
                    {
                    // InternalProofAssistant.g:851:2: ( '[' )
                    // InternalProofAssistant.g:852:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,85,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalProofAssistant.g:857:2: ( ']' )
                    {
                    // InternalProofAssistant.g:857:2: ( ']' )
                    // InternalProofAssistant.g:858:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,86,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalProofAssistant.g:863:2: ( '\\uE103' )
                    {
                    // InternalProofAssistant.g:863:2: ( '\\uE103' )
                    // InternalProofAssistant.g:864:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,87,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalProofAssistant.g:869:2: ( '\\u2218' )
                    {
                    // InternalProofAssistant.g:869:2: ( '\\u2218' )
                    // InternalProofAssistant.g:870:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,88,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalProofAssistant.g:875:2: ( ';' )
                    {
                    // InternalProofAssistant.g:875:2: ( ';' )
                    // InternalProofAssistant.g:876:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,89,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalProofAssistant.g:881:2: ( '\\u2297' )
                    {
                    // InternalProofAssistant.g:881:2: ( '\\u2297' )
                    // InternalProofAssistant.g:882:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,90,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalProofAssistant.g:887:2: ( '\\u2225' )
                    {
                    // InternalProofAssistant.g:887:2: ( '\\u2225' )
                    // InternalProofAssistant.g:888:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,91,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalProofAssistant.g:893:2: ( '\\u223C' )
                    {
                    // InternalProofAssistant.g:893:2: ( '\\u223C' )
                    // InternalProofAssistant.g:894:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,92,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalProofAssistant.g:899:2: ( '\\u25C1' )
                    {
                    // InternalProofAssistant.g:899:2: ( '\\u25C1' )
                    // InternalProofAssistant.g:900:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,93,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalProofAssistant.g:905:2: ( '\\u2A64' )
                    {
                    // InternalProofAssistant.g:905:2: ( '\\u2A64' )
                    // InternalProofAssistant.g:906:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,94,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalProofAssistant.g:911:2: ( '\\u25B7' )
                    {
                    // InternalProofAssistant.g:911:2: ( '\\u25B7' )
                    // InternalProofAssistant.g:912:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,95,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalProofAssistant.g:917:2: ( '\\u2A65' )
                    {
                    // InternalProofAssistant.g:917:2: ( '\\u2A65' )
                    // InternalProofAssistant.g:918:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,96,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalProofAssistant.g:923:2: ( '\\u03BB' )
                    {
                    // InternalProofAssistant.g:923:2: ( '\\u03BB' )
                    // InternalProofAssistant.g:924:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,97,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalProofAssistant.g:929:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalProofAssistant.g:929:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalProofAssistant.g:930:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalProofAssistant.g:931:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalProofAssistant.g:931:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalProofAssistant.g:935:2: ( '\\u22C3' )
                    {
                    // InternalProofAssistant.g:935:2: ( '\\u22C3' )
                    // InternalProofAssistant.g:936:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,98,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalProofAssistant.g:941:2: ( '\\u2223' )
                    {
                    // InternalProofAssistant.g:941:2: ( '\\u2223' )
                    // InternalProofAssistant.g:942:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,99,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalProofAssistant.g:947:2: ( '\\u2025' )
                    {
                    // InternalProofAssistant.g:947:2: ( '\\u2025' )
                    // InternalProofAssistant.g:948:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,100,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalProofAssistant.g:953:2: ( '+' )
                    {
                    // InternalProofAssistant.g:953:2: ( '+' )
                    // InternalProofAssistant.g:954:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,101,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalProofAssistant.g:959:2: ( '\\u2212' )
                    {
                    // InternalProofAssistant.g:959:2: ( '\\u2212' )
                    // InternalProofAssistant.g:960:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,102,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalProofAssistant.g:965:2: ( '-' )
                    {
                    // InternalProofAssistant.g:965:2: ( '-' )
                    // InternalProofAssistant.g:966:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,103,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalProofAssistant.g:971:2: ( '\\u2217' )
                    {
                    // InternalProofAssistant.g:971:2: ( '\\u2217' )
                    // InternalProofAssistant.g:972:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,104,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalProofAssistant.g:977:2: ( '*' )
                    {
                    // InternalProofAssistant.g:977:2: ( '*' )
                    // InternalProofAssistant.g:978:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,105,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalProofAssistant.g:983:2: ( '\\u00F7' )
                    {
                    // InternalProofAssistant.g:983:2: ( '\\u00F7' )
                    // InternalProofAssistant.g:984:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,106,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalProofAssistant.g:989:2: ( '/' )
                    {
                    // InternalProofAssistant.g:989:2: ( '/' )
                    // InternalProofAssistant.g:990:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,107,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalProofAssistant.g:995:2: ( '^' )
                    {
                    // InternalProofAssistant.g:995:2: ( '^' )
                    // InternalProofAssistant.g:996:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,108,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalProofAssistant.g:1001:2: ( '\\\\' )
                    {
                    // InternalProofAssistant.g:1001:2: ( '\\\\' )
                    // InternalProofAssistant.g:1002:3: '\\\\'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    match(input,109,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives"


    // $ANTLR start "rule__ProofAssistant__Group__0"
    // InternalProofAssistant.g:1011:1: rule__ProofAssistant__Group__0 : rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1 ;
    public final void rule__ProofAssistant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1015:1: ( rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1 )
            // InternalProofAssistant.g:1016:2: rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProofAssistant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__0"


    // $ANTLR start "rule__ProofAssistant__Group__0__Impl"
    // InternalProofAssistant.g:1023:1: rule__ProofAssistant__Group__0__Impl : ( 'ProofAssistant' ) ;
    public final void rule__ProofAssistant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1027:1: ( ( 'ProofAssistant' ) )
            // InternalProofAssistant.g:1028:1: ( 'ProofAssistant' )
            {
            // InternalProofAssistant.g:1028:1: ( 'ProofAssistant' )
            // InternalProofAssistant.g:1029:2: 'ProofAssistant'
            {
             before(grammarAccess.getProofAssistantAccess().getProofAssistantKeyword_0()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getProofAssistantAccess().getProofAssistantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__0__Impl"


    // $ANTLR start "rule__ProofAssistant__Group__1"
    // InternalProofAssistant.g:1038:1: rule__ProofAssistant__Group__1 : rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2 ;
    public final void rule__ProofAssistant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1042:1: ( rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2 )
            // InternalProofAssistant.g:1043:2: rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ProofAssistant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__1"


    // $ANTLR start "rule__ProofAssistant__Group__1__Impl"
    // InternalProofAssistant.g:1050:1: rule__ProofAssistant__Group__1__Impl : ( ( rule__ProofAssistant__NameAssignment_1 ) ) ;
    public final void rule__ProofAssistant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1054:1: ( ( ( rule__ProofAssistant__NameAssignment_1 ) ) )
            // InternalProofAssistant.g:1055:1: ( ( rule__ProofAssistant__NameAssignment_1 ) )
            {
            // InternalProofAssistant.g:1055:1: ( ( rule__ProofAssistant__NameAssignment_1 ) )
            // InternalProofAssistant.g:1056:2: ( rule__ProofAssistant__NameAssignment_1 )
            {
             before(grammarAccess.getProofAssistantAccess().getNameAssignment_1()); 
            // InternalProofAssistant.g:1057:2: ( rule__ProofAssistant__NameAssignment_1 )
            // InternalProofAssistant.g:1057:3: rule__ProofAssistant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProofAssistant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProofAssistantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__1__Impl"


    // $ANTLR start "rule__ProofAssistant__Group__2"
    // InternalProofAssistant.g:1065:1: rule__ProofAssistant__Group__2 : rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3 ;
    public final void rule__ProofAssistant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1069:1: ( rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3 )
            // InternalProofAssistant.g:1070:2: rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ProofAssistant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__2"


    // $ANTLR start "rule__ProofAssistant__Group__2__Impl"
    // InternalProofAssistant.g:1077:1: rule__ProofAssistant__Group__2__Impl : ( 'supports' ) ;
    public final void rule__ProofAssistant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1081:1: ( ( 'supports' ) )
            // InternalProofAssistant.g:1082:1: ( 'supports' )
            {
            // InternalProofAssistant.g:1082:1: ( 'supports' )
            // InternalProofAssistant.g:1083:2: 'supports'
            {
             before(grammarAccess.getProofAssistantAccess().getSupportsKeyword_2()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getProofAssistantAccess().getSupportsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__2__Impl"


    // $ANTLR start "rule__ProofAssistant__Group__3"
    // InternalProofAssistant.g:1092:1: rule__ProofAssistant__Group__3 : rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4 ;
    public final void rule__ProofAssistant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1096:1: ( rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4 )
            // InternalProofAssistant.g:1097:2: rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProofAssistant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__3"


    // $ANTLR start "rule__ProofAssistant__Group__3__Impl"
    // InternalProofAssistant.g:1104:1: rule__ProofAssistant__Group__3__Impl : ( ( rule__ProofAssistant__ComponentAssignment_3 ) ) ;
    public final void rule__ProofAssistant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1108:1: ( ( ( rule__ProofAssistant__ComponentAssignment_3 ) ) )
            // InternalProofAssistant.g:1109:1: ( ( rule__ProofAssistant__ComponentAssignment_3 ) )
            {
            // InternalProofAssistant.g:1109:1: ( ( rule__ProofAssistant__ComponentAssignment_3 ) )
            // InternalProofAssistant.g:1110:2: ( rule__ProofAssistant__ComponentAssignment_3 )
            {
             before(grammarAccess.getProofAssistantAccess().getComponentAssignment_3()); 
            // InternalProofAssistant.g:1111:2: ( rule__ProofAssistant__ComponentAssignment_3 )
            // InternalProofAssistant.g:1111:3: rule__ProofAssistant__ComponentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProofAssistant__ComponentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProofAssistantAccess().getComponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__3__Impl"


    // $ANTLR start "rule__ProofAssistant__Group__4"
    // InternalProofAssistant.g:1119:1: rule__ProofAssistant__Group__4 : rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5 ;
    public final void rule__ProofAssistant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1123:1: ( rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5 )
            // InternalProofAssistant.g:1124:2: rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ProofAssistant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__4"


    // $ANTLR start "rule__ProofAssistant__Group__4__Impl"
    // InternalProofAssistant.g:1131:1: rule__ProofAssistant__Group__4__Impl : ( ( rule__ProofAssistant__Group_4__0 )* ) ;
    public final void rule__ProofAssistant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1135:1: ( ( ( rule__ProofAssistant__Group_4__0 )* ) )
            // InternalProofAssistant.g:1136:1: ( ( rule__ProofAssistant__Group_4__0 )* )
            {
            // InternalProofAssistant.g:1136:1: ( ( rule__ProofAssistant__Group_4__0 )* )
            // InternalProofAssistant.g:1137:2: ( rule__ProofAssistant__Group_4__0 )*
            {
             before(grammarAccess.getProofAssistantAccess().getGroup_4()); 
            // InternalProofAssistant.g:1138:2: ( rule__ProofAssistant__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==113) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProofAssistant.g:1138:3: rule__ProofAssistant__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ProofAssistant__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProofAssistantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__4__Impl"


    // $ANTLR start "rule__ProofAssistant__Group__5"
    // InternalProofAssistant.g:1146:1: rule__ProofAssistant__Group__5 : rule__ProofAssistant__Group__5__Impl ;
    public final void rule__ProofAssistant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1150:1: ( rule__ProofAssistant__Group__5__Impl )
            // InternalProofAssistant.g:1151:2: rule__ProofAssistant__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__5"


    // $ANTLR start "rule__ProofAssistant__Group__5__Impl"
    // InternalProofAssistant.g:1157:1: rule__ProofAssistant__Group__5__Impl : ( 'end' ) ;
    public final void rule__ProofAssistant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1161:1: ( ( 'end' ) )
            // InternalProofAssistant.g:1162:1: ( 'end' )
            {
            // InternalProofAssistant.g:1162:1: ( 'end' )
            // InternalProofAssistant.g:1163:2: 'end'
            {
             before(grammarAccess.getProofAssistantAccess().getEndKeyword_5()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getProofAssistantAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group__5__Impl"


    // $ANTLR start "rule__ProofAssistant__Group_4__0"
    // InternalProofAssistant.g:1173:1: rule__ProofAssistant__Group_4__0 : rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1 ;
    public final void rule__ProofAssistant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1177:1: ( rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1 )
            // InternalProofAssistant.g:1178:2: rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__ProofAssistant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group_4__0"


    // $ANTLR start "rule__ProofAssistant__Group_4__0__Impl"
    // InternalProofAssistant.g:1185:1: rule__ProofAssistant__Group_4__0__Impl : ( 'hints' ) ;
    public final void rule__ProofAssistant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1189:1: ( ( 'hints' ) )
            // InternalProofAssistant.g:1190:1: ( 'hints' )
            {
            // InternalProofAssistant.g:1190:1: ( 'hints' )
            // InternalProofAssistant.g:1191:2: 'hints'
            {
             before(grammarAccess.getProofAssistantAccess().getHintsKeyword_4_0()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getProofAssistantAccess().getHintsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group_4__0__Impl"


    // $ANTLR start "rule__ProofAssistant__Group_4__1"
    // InternalProofAssistant.g:1200:1: rule__ProofAssistant__Group_4__1 : rule__ProofAssistant__Group_4__1__Impl ;
    public final void rule__ProofAssistant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1204:1: ( rule__ProofAssistant__Group_4__1__Impl )
            // InternalProofAssistant.g:1205:2: rule__ProofAssistant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProofAssistant__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group_4__1"


    // $ANTLR start "rule__ProofAssistant__Group_4__1__Impl"
    // InternalProofAssistant.g:1211:1: rule__ProofAssistant__Group_4__1__Impl : ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) ) ;
    public final void rule__ProofAssistant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1215:1: ( ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) ) )
            // InternalProofAssistant.g:1216:1: ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) )
            {
            // InternalProofAssistant.g:1216:1: ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) )
            // InternalProofAssistant.g:1217:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* )
            {
            // InternalProofAssistant.g:1217:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 ) )
            // InternalProofAssistant.g:1218:3: ( rule__ProofAssistant__HintsAssignment_4_1 )
            {
             before(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 
            // InternalProofAssistant.g:1219:3: ( rule__ProofAssistant__HintsAssignment_4_1 )
            // InternalProofAssistant.g:1219:4: rule__ProofAssistant__HintsAssignment_4_1
            {
            pushFollow(FOLLOW_9);
            rule__ProofAssistant__HintsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 

            }

            // InternalProofAssistant.g:1222:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 )* )
            // InternalProofAssistant.g:1223:3: ( rule__ProofAssistant__HintsAssignment_4_1 )*
            {
             before(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 
            // InternalProofAssistant.g:1224:3: ( rule__ProofAssistant__HintsAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==114) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProofAssistant.g:1224:4: rule__ProofAssistant__HintsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProofAssistant__HintsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__Group_4__1__Impl"


    // $ANTLR start "rule__SelectionHint__Group__0"
    // InternalProofAssistant.g:1234:1: rule__SelectionHint__Group__0 : rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1 ;
    public final void rule__SelectionHint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1238:1: ( rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1 )
            // InternalProofAssistant.g:1239:2: rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectionHint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionHint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__0"


    // $ANTLR start "rule__SelectionHint__Group__0__Impl"
    // InternalProofAssistant.g:1246:1: rule__SelectionHint__Group__0__Impl : ( 'for' ) ;
    public final void rule__SelectionHint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1250:1: ( ( 'for' ) )
            // InternalProofAssistant.g:1251:1: ( 'for' )
            {
            // InternalProofAssistant.g:1251:1: ( 'for' )
            // InternalProofAssistant.g:1252:2: 'for'
            {
             before(grammarAccess.getSelectionHintAccess().getForKeyword_0()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getSelectionHintAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__0__Impl"


    // $ANTLR start "rule__SelectionHint__Group__1"
    // InternalProofAssistant.g:1261:1: rule__SelectionHint__Group__1 : rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2 ;
    public final void rule__SelectionHint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1265:1: ( rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2 )
            // InternalProofAssistant.g:1266:2: rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SelectionHint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionHint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__1"


    // $ANTLR start "rule__SelectionHint__Group__1__Impl"
    // InternalProofAssistant.g:1273:1: rule__SelectionHint__Group__1__Impl : ( ( rule__SelectionHint__ElementAssignment_1 ) ) ;
    public final void rule__SelectionHint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1277:1: ( ( ( rule__SelectionHint__ElementAssignment_1 ) ) )
            // InternalProofAssistant.g:1278:1: ( ( rule__SelectionHint__ElementAssignment_1 ) )
            {
            // InternalProofAssistant.g:1278:1: ( ( rule__SelectionHint__ElementAssignment_1 ) )
            // InternalProofAssistant.g:1279:2: ( rule__SelectionHint__ElementAssignment_1 )
            {
             before(grammarAccess.getSelectionHintAccess().getElementAssignment_1()); 
            // InternalProofAssistant.g:1280:2: ( rule__SelectionHint__ElementAssignment_1 )
            // InternalProofAssistant.g:1280:3: rule__SelectionHint__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectionHint__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionHintAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__1__Impl"


    // $ANTLR start "rule__SelectionHint__Group__2"
    // InternalProofAssistant.g:1288:1: rule__SelectionHint__Group__2 : rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3 ;
    public final void rule__SelectionHint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1292:1: ( rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3 )
            // InternalProofAssistant.g:1293:2: rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SelectionHint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionHint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__2"


    // $ANTLR start "rule__SelectionHint__Group__2__Impl"
    // InternalProofAssistant.g:1300:1: rule__SelectionHint__Group__2__Impl : ( 'selects' ) ;
    public final void rule__SelectionHint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1304:1: ( ( 'selects' ) )
            // InternalProofAssistant.g:1305:1: ( 'selects' )
            {
            // InternalProofAssistant.g:1305:1: ( 'selects' )
            // InternalProofAssistant.g:1306:2: 'selects'
            {
             before(grammarAccess.getSelectionHintAccess().getSelectsKeyword_2()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getSelectionHintAccess().getSelectsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__2__Impl"


    // $ANTLR start "rule__SelectionHint__Group__3"
    // InternalProofAssistant.g:1315:1: rule__SelectionHint__Group__3 : rule__SelectionHint__Group__3__Impl ;
    public final void rule__SelectionHint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1319:1: ( rule__SelectionHint__Group__3__Impl )
            // InternalProofAssistant.g:1320:2: rule__SelectionHint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionHint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__3"


    // $ANTLR start "rule__SelectionHint__Group__3__Impl"
    // InternalProofAssistant.g:1326:1: rule__SelectionHint__Group__3__Impl : ( ( rule__SelectionHint__SelectionsAssignment_3 ) ) ;
    public final void rule__SelectionHint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1330:1: ( ( ( rule__SelectionHint__SelectionsAssignment_3 ) ) )
            // InternalProofAssistant.g:1331:1: ( ( rule__SelectionHint__SelectionsAssignment_3 ) )
            {
            // InternalProofAssistant.g:1331:1: ( ( rule__SelectionHint__SelectionsAssignment_3 ) )
            // InternalProofAssistant.g:1332:2: ( rule__SelectionHint__SelectionsAssignment_3 )
            {
             before(grammarAccess.getSelectionHintAccess().getSelectionsAssignment_3()); 
            // InternalProofAssistant.g:1333:2: ( rule__SelectionHint__SelectionsAssignment_3 )
            // InternalProofAssistant.g:1333:3: rule__SelectionHint__SelectionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectionHint__SelectionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectionHintAccess().getSelectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__Group__3__Impl"


    // $ANTLR start "rule__CasesHint__Group__0"
    // InternalProofAssistant.g:1342:1: rule__CasesHint__Group__0 : rule__CasesHint__Group__0__Impl rule__CasesHint__Group__1 ;
    public final void rule__CasesHint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1346:1: ( rule__CasesHint__Group__0__Impl rule__CasesHint__Group__1 )
            // InternalProofAssistant.g:1347:2: rule__CasesHint__Group__0__Impl rule__CasesHint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CasesHint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasesHint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__0"


    // $ANTLR start "rule__CasesHint__Group__0__Impl"
    // InternalProofAssistant.g:1354:1: rule__CasesHint__Group__0__Impl : ( 'for' ) ;
    public final void rule__CasesHint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1358:1: ( ( 'for' ) )
            // InternalProofAssistant.g:1359:1: ( 'for' )
            {
            // InternalProofAssistant.g:1359:1: ( 'for' )
            // InternalProofAssistant.g:1360:2: 'for'
            {
             before(grammarAccess.getCasesHintAccess().getForKeyword_0()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getCasesHintAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__0__Impl"


    // $ANTLR start "rule__CasesHint__Group__1"
    // InternalProofAssistant.g:1369:1: rule__CasesHint__Group__1 : rule__CasesHint__Group__1__Impl rule__CasesHint__Group__2 ;
    public final void rule__CasesHint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1373:1: ( rule__CasesHint__Group__1__Impl rule__CasesHint__Group__2 )
            // InternalProofAssistant.g:1374:2: rule__CasesHint__Group__1__Impl rule__CasesHint__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CasesHint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasesHint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__1"


    // $ANTLR start "rule__CasesHint__Group__1__Impl"
    // InternalProofAssistant.g:1381:1: rule__CasesHint__Group__1__Impl : ( ( rule__CasesHint__ElementAssignment_1 ) ) ;
    public final void rule__CasesHint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1385:1: ( ( ( rule__CasesHint__ElementAssignment_1 ) ) )
            // InternalProofAssistant.g:1386:1: ( ( rule__CasesHint__ElementAssignment_1 ) )
            {
            // InternalProofAssistant.g:1386:1: ( ( rule__CasesHint__ElementAssignment_1 ) )
            // InternalProofAssistant.g:1387:2: ( rule__CasesHint__ElementAssignment_1 )
            {
             before(grammarAccess.getCasesHintAccess().getElementAssignment_1()); 
            // InternalProofAssistant.g:1388:2: ( rule__CasesHint__ElementAssignment_1 )
            // InternalProofAssistant.g:1388:3: rule__CasesHint__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CasesHint__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCasesHintAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__1__Impl"


    // $ANTLR start "rule__CasesHint__Group__2"
    // InternalProofAssistant.g:1396:1: rule__CasesHint__Group__2 : rule__CasesHint__Group__2__Impl rule__CasesHint__Group__3 ;
    public final void rule__CasesHint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1400:1: ( rule__CasesHint__Group__2__Impl rule__CasesHint__Group__3 )
            // InternalProofAssistant.g:1401:2: rule__CasesHint__Group__2__Impl rule__CasesHint__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CasesHint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasesHint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__2"


    // $ANTLR start "rule__CasesHint__Group__2__Impl"
    // InternalProofAssistant.g:1408:1: rule__CasesHint__Group__2__Impl : ( 'cases' ) ;
    public final void rule__CasesHint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1412:1: ( ( 'cases' ) )
            // InternalProofAssistant.g:1413:1: ( 'cases' )
            {
            // InternalProofAssistant.g:1413:1: ( 'cases' )
            // InternalProofAssistant.g:1414:2: 'cases'
            {
             before(grammarAccess.getCasesHintAccess().getCasesKeyword_2()); 
            match(input,116,FOLLOW_2); 
             after(grammarAccess.getCasesHintAccess().getCasesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__2__Impl"


    // $ANTLR start "rule__CasesHint__Group__3"
    // InternalProofAssistant.g:1423:1: rule__CasesHint__Group__3 : rule__CasesHint__Group__3__Impl ;
    public final void rule__CasesHint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1427:1: ( rule__CasesHint__Group__3__Impl )
            // InternalProofAssistant.g:1428:2: rule__CasesHint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CasesHint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__3"


    // $ANTLR start "rule__CasesHint__Group__3__Impl"
    // InternalProofAssistant.g:1434:1: rule__CasesHint__Group__3__Impl : ( ( rule__CasesHint__CasesAssignment_3 ) ) ;
    public final void rule__CasesHint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1438:1: ( ( ( rule__CasesHint__CasesAssignment_3 ) ) )
            // InternalProofAssistant.g:1439:1: ( ( rule__CasesHint__CasesAssignment_3 ) )
            {
            // InternalProofAssistant.g:1439:1: ( ( rule__CasesHint__CasesAssignment_3 ) )
            // InternalProofAssistant.g:1440:2: ( rule__CasesHint__CasesAssignment_3 )
            {
             before(grammarAccess.getCasesHintAccess().getCasesAssignment_3()); 
            // InternalProofAssistant.g:1441:2: ( rule__CasesHint__CasesAssignment_3 )
            // InternalProofAssistant.g:1441:3: rule__CasesHint__CasesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CasesHint__CasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCasesHintAccess().getCasesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalProofAssistant.g:1450:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1454:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalProofAssistant.g:1455:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalProofAssistant.g:1462:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1466:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // InternalProofAssistant.g:1467:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // InternalProofAssistant.g:1467:1: ( ( rule__Case__NameAssignment_0 ) )
            // InternalProofAssistant.g:1468:2: ( rule__Case__NameAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            // InternalProofAssistant.g:1469:2: ( rule__Case__NameAssignment_0 )
            // InternalProofAssistant.g:1469:3: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalProofAssistant.g:1477:1: rule__Case__Group__1 : rule__Case__Group__1__Impl ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1481:1: ( rule__Case__Group__1__Impl )
            // InternalProofAssistant.g:1482:2: rule__Case__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalProofAssistant.g:1488:1: rule__Case__Group__1__Impl : ( ( rule__Case__PredicateAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1492:1: ( ( ( rule__Case__PredicateAssignment_1 ) ) )
            // InternalProofAssistant.g:1493:1: ( ( rule__Case__PredicateAssignment_1 ) )
            {
            // InternalProofAssistant.g:1493:1: ( ( rule__Case__PredicateAssignment_1 ) )
            // InternalProofAssistant.g:1494:2: ( rule__Case__PredicateAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getPredicateAssignment_1()); 
            // InternalProofAssistant.g:1495:2: ( rule__Case__PredicateAssignment_1 )
            // InternalProofAssistant.g:1495:3: rule__Case__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getPredicateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalProofAssistant.g:1504:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1508:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalProofAssistant.g:1509:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_14);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"
    // InternalProofAssistant.g:1516:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1520:1: ( ( '%' ) )
            // InternalProofAssistant.g:1521:1: ( '%' )
            {
            // InternalProofAssistant.g:1521:1: ( '%' )
            // InternalProofAssistant.g:1522:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"
    // InternalProofAssistant.g:1531:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1535:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalProofAssistant.g:1536:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1"


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"
    // InternalProofAssistant.g:1542:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1546:1: ( ( '\\u22C2' ) )
            // InternalProofAssistant.g:1547:1: ( '\\u22C2' )
            {
            // InternalProofAssistant.g:1547:1: ( '\\u22C2' )
            // InternalProofAssistant.g:1548:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl"


    // $ANTLR start "rule__ProofAssistant__NameAssignment_1"
    // InternalProofAssistant.g:1558:1: rule__ProofAssistant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProofAssistant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1562:1: ( ( ruleEString ) )
            // InternalProofAssistant.g:1563:2: ( ruleEString )
            {
            // InternalProofAssistant.g:1563:2: ( ruleEString )
            // InternalProofAssistant.g:1564:3: ruleEString
            {
             before(grammarAccess.getProofAssistantAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProofAssistantAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__NameAssignment_1"


    // $ANTLR start "rule__ProofAssistant__ComponentAssignment_3"
    // InternalProofAssistant.g:1573:1: rule__ProofAssistant__ComponentAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ProofAssistant__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1577:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:1578:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:1578:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:1579:3: ( ruleEString )
            {
             before(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementCrossReference_3_0()); 
            // InternalProofAssistant.g:1580:3: ( ruleEString )
            // InternalProofAssistant.g:1581:4: ruleEString
            {
             before(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__ComponentAssignment_3"


    // $ANTLR start "rule__ProofAssistant__HintsAssignment_4_1"
    // InternalProofAssistant.g:1592:1: rule__ProofAssistant__HintsAssignment_4_1 : ( ruleHint ) ;
    public final void rule__ProofAssistant__HintsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1596:1: ( ( ruleHint ) )
            // InternalProofAssistant.g:1597:2: ( ruleHint )
            {
            // InternalProofAssistant.g:1597:2: ( ruleHint )
            // InternalProofAssistant.g:1598:3: ruleHint
            {
             before(grammarAccess.getProofAssistantAccess().getHintsHintParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHint();

            state._fsp--;

             after(grammarAccess.getProofAssistantAccess().getHintsHintParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProofAssistant__HintsAssignment_4_1"


    // $ANTLR start "rule__SelectionHint__ElementAssignment_1"
    // InternalProofAssistant.g:1607:1: rule__SelectionHint__ElementAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__SelectionHint__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1611:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:1612:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:1612:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:1613:3: ( ruleEString )
            {
             before(grammarAccess.getSelectionHintAccess().getElementEventBElementCrossReference_1_0()); 
            // InternalProofAssistant.g:1614:3: ( ruleEString )
            // InternalProofAssistant.g:1615:4: ruleEString
            {
             before(grammarAccess.getSelectionHintAccess().getElementEventBElementEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectionHintAccess().getElementEventBElementEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectionHintAccess().getElementEventBElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__ElementAssignment_1"


    // $ANTLR start "rule__SelectionHint__SelectionsAssignment_3"
    // InternalProofAssistant.g:1626:1: rule__SelectionHint__SelectionsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__SelectionHint__SelectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1630:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:1631:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:1631:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:1632:3: ( ruleEString )
            {
             before(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementCrossReference_3_0()); 
            // InternalProofAssistant.g:1633:3: ( ruleEString )
            // InternalProofAssistant.g:1634:4: ruleEString
            {
             before(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionHint__SelectionsAssignment_3"


    // $ANTLR start "rule__CasesHint__ElementAssignment_1"
    // InternalProofAssistant.g:1645:1: rule__CasesHint__ElementAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CasesHint__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1649:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:1650:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:1650:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:1651:3: ( ruleEString )
            {
             before(grammarAccess.getCasesHintAccess().getElementEventBElementCrossReference_1_0()); 
            // InternalProofAssistant.g:1652:3: ( ruleEString )
            // InternalProofAssistant.g:1653:4: ruleEString
            {
             before(grammarAccess.getCasesHintAccess().getElementEventBElementEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasesHintAccess().getElementEventBElementEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCasesHintAccess().getElementEventBElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__ElementAssignment_1"


    // $ANTLR start "rule__CasesHint__CasesAssignment_3"
    // InternalProofAssistant.g:1664:1: rule__CasesHint__CasesAssignment_3 : ( ruleCase ) ;
    public final void rule__CasesHint__CasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1668:1: ( ( ruleCase ) )
            // InternalProofAssistant.g:1669:2: ( ruleCase )
            {
            // InternalProofAssistant.g:1669:2: ( ruleCase )
            // InternalProofAssistant.g:1670:3: ruleCase
            {
             before(grammarAccess.getCasesHintAccess().getCasesCaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCasesHintAccess().getCasesCaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CasesHint__CasesAssignment_3"


    // $ANTLR start "rule__Case__NameAssignment_0"
    // InternalProofAssistant.g:1679:1: rule__Case__NameAssignment_0 : ( RULE_XLABEL ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1683:1: ( ( RULE_XLABEL ) )
            // InternalProofAssistant.g:1684:2: ( RULE_XLABEL )
            {
            // InternalProofAssistant.g:1684:2: ( RULE_XLABEL )
            // InternalProofAssistant.g:1685:3: RULE_XLABEL
            {
             before(grammarAccess.getCaseAccess().getNameXLABELTerminalRuleCall_0_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getNameXLABELTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NameAssignment_0"


    // $ANTLR start "rule__Case__PredicateAssignment_1"
    // InternalProofAssistant.g:1694:1: rule__Case__PredicateAssignment_1 : ( ruleXFormula ) ;
    public final void rule__Case__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:1698:1: ( ( ruleXFormula ) )
            // InternalProofAssistant.g:1699:2: ( ruleXFormula )
            {
            // InternalProofAssistant.g:1699:2: ( ruleXFormula )
            // InternalProofAssistant.g:1700:3: ruleXFormula
            {
             before(grammarAccess.getCaseAccess().getPredicateXFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getPredicateXFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__PredicateAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFF062L,0x00203FFFFFFFFFFFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x00203FFFFFFFFFFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});

}