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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProofAssistant'", "'supports'", "'end'", "'hints'", "'for'", "'selects'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalProofAssistant.g:87:1: ruleHint : ( ruleSelectionHint ) ;
    public final void ruleHint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:91:2: ( ( ruleSelectionHint ) )
            // InternalProofAssistant.g:92:2: ( ruleSelectionHint )
            {
            // InternalProofAssistant.g:92:2: ( ruleSelectionHint )
            // InternalProofAssistant.g:93:3: ruleSelectionHint
            {
             before(grammarAccess.getHintAccess().getSelectionHintParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSelectionHint();

            state._fsp--;

             after(grammarAccess.getHintAccess().getSelectionHintParserRuleCall()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalProofAssistant.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProofAssistant.g:157:2: ( RULE_STRING )
                    {
                    // InternalProofAssistant.g:157:2: ( RULE_STRING )
                    // InternalProofAssistant.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:163:2: ( RULE_ID )
                    {
                    // InternalProofAssistant.g:163:2: ( RULE_ID )
                    // InternalProofAssistant.g:164:3: RULE_ID
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


    // $ANTLR start "rule__ProofAssistant__Group__0"
    // InternalProofAssistant.g:173:1: rule__ProofAssistant__Group__0 : rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1 ;
    public final void rule__ProofAssistant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:177:1: ( rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1 )
            // InternalProofAssistant.g:178:2: rule__ProofAssistant__Group__0__Impl rule__ProofAssistant__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProofAssistant.g:185:1: rule__ProofAssistant__Group__0__Impl : ( 'ProofAssistant' ) ;
    public final void rule__ProofAssistant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:189:1: ( ( 'ProofAssistant' ) )
            // InternalProofAssistant.g:190:1: ( 'ProofAssistant' )
            {
            // InternalProofAssistant.g:190:1: ( 'ProofAssistant' )
            // InternalProofAssistant.g:191:2: 'ProofAssistant'
            {
             before(grammarAccess.getProofAssistantAccess().getProofAssistantKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalProofAssistant.g:200:1: rule__ProofAssistant__Group__1 : rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2 ;
    public final void rule__ProofAssistant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:204:1: ( rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2 )
            // InternalProofAssistant.g:205:2: rule__ProofAssistant__Group__1__Impl rule__ProofAssistant__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalProofAssistant.g:212:1: rule__ProofAssistant__Group__1__Impl : ( ( rule__ProofAssistant__NameAssignment_1 ) ) ;
    public final void rule__ProofAssistant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:216:1: ( ( ( rule__ProofAssistant__NameAssignment_1 ) ) )
            // InternalProofAssistant.g:217:1: ( ( rule__ProofAssistant__NameAssignment_1 ) )
            {
            // InternalProofAssistant.g:217:1: ( ( rule__ProofAssistant__NameAssignment_1 ) )
            // InternalProofAssistant.g:218:2: ( rule__ProofAssistant__NameAssignment_1 )
            {
             before(grammarAccess.getProofAssistantAccess().getNameAssignment_1()); 
            // InternalProofAssistant.g:219:2: ( rule__ProofAssistant__NameAssignment_1 )
            // InternalProofAssistant.g:219:3: rule__ProofAssistant__NameAssignment_1
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
    // InternalProofAssistant.g:227:1: rule__ProofAssistant__Group__2 : rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3 ;
    public final void rule__ProofAssistant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:231:1: ( rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3 )
            // InternalProofAssistant.g:232:2: rule__ProofAssistant__Group__2__Impl rule__ProofAssistant__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalProofAssistant.g:239:1: rule__ProofAssistant__Group__2__Impl : ( 'supports' ) ;
    public final void rule__ProofAssistant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:243:1: ( ( 'supports' ) )
            // InternalProofAssistant.g:244:1: ( 'supports' )
            {
            // InternalProofAssistant.g:244:1: ( 'supports' )
            // InternalProofAssistant.g:245:2: 'supports'
            {
             before(grammarAccess.getProofAssistantAccess().getSupportsKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalProofAssistant.g:254:1: rule__ProofAssistant__Group__3 : rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4 ;
    public final void rule__ProofAssistant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:258:1: ( rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4 )
            // InternalProofAssistant.g:259:2: rule__ProofAssistant__Group__3__Impl rule__ProofAssistant__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalProofAssistant.g:266:1: rule__ProofAssistant__Group__3__Impl : ( ( rule__ProofAssistant__ComponentAssignment_3 ) ) ;
    public final void rule__ProofAssistant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:270:1: ( ( ( rule__ProofAssistant__ComponentAssignment_3 ) ) )
            // InternalProofAssistant.g:271:1: ( ( rule__ProofAssistant__ComponentAssignment_3 ) )
            {
            // InternalProofAssistant.g:271:1: ( ( rule__ProofAssistant__ComponentAssignment_3 ) )
            // InternalProofAssistant.g:272:2: ( rule__ProofAssistant__ComponentAssignment_3 )
            {
             before(grammarAccess.getProofAssistantAccess().getComponentAssignment_3()); 
            // InternalProofAssistant.g:273:2: ( rule__ProofAssistant__ComponentAssignment_3 )
            // InternalProofAssistant.g:273:3: rule__ProofAssistant__ComponentAssignment_3
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
    // InternalProofAssistant.g:281:1: rule__ProofAssistant__Group__4 : rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5 ;
    public final void rule__ProofAssistant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:285:1: ( rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5 )
            // InternalProofAssistant.g:286:2: rule__ProofAssistant__Group__4__Impl rule__ProofAssistant__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalProofAssistant.g:293:1: rule__ProofAssistant__Group__4__Impl : ( ( rule__ProofAssistant__Group_4__0 )* ) ;
    public final void rule__ProofAssistant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:297:1: ( ( ( rule__ProofAssistant__Group_4__0 )* ) )
            // InternalProofAssistant.g:298:1: ( ( rule__ProofAssistant__Group_4__0 )* )
            {
            // InternalProofAssistant.g:298:1: ( ( rule__ProofAssistant__Group_4__0 )* )
            // InternalProofAssistant.g:299:2: ( rule__ProofAssistant__Group_4__0 )*
            {
             before(grammarAccess.getProofAssistantAccess().getGroup_4()); 
            // InternalProofAssistant.g:300:2: ( rule__ProofAssistant__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProofAssistant.g:300:3: rule__ProofAssistant__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ProofAssistant__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalProofAssistant.g:308:1: rule__ProofAssistant__Group__5 : rule__ProofAssistant__Group__5__Impl ;
    public final void rule__ProofAssistant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:312:1: ( rule__ProofAssistant__Group__5__Impl )
            // InternalProofAssistant.g:313:2: rule__ProofAssistant__Group__5__Impl
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
    // InternalProofAssistant.g:319:1: rule__ProofAssistant__Group__5__Impl : ( 'end' ) ;
    public final void rule__ProofAssistant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:323:1: ( ( 'end' ) )
            // InternalProofAssistant.g:324:1: ( 'end' )
            {
            // InternalProofAssistant.g:324:1: ( 'end' )
            // InternalProofAssistant.g:325:2: 'end'
            {
             before(grammarAccess.getProofAssistantAccess().getEndKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProofAssistant.g:335:1: rule__ProofAssistant__Group_4__0 : rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1 ;
    public final void rule__ProofAssistant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:339:1: ( rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1 )
            // InternalProofAssistant.g:340:2: rule__ProofAssistant__Group_4__0__Impl rule__ProofAssistant__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalProofAssistant.g:347:1: rule__ProofAssistant__Group_4__0__Impl : ( 'hints' ) ;
    public final void rule__ProofAssistant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:351:1: ( ( 'hints' ) )
            // InternalProofAssistant.g:352:1: ( 'hints' )
            {
            // InternalProofAssistant.g:352:1: ( 'hints' )
            // InternalProofAssistant.g:353:2: 'hints'
            {
             before(grammarAccess.getProofAssistantAccess().getHintsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProofAssistant.g:362:1: rule__ProofAssistant__Group_4__1 : rule__ProofAssistant__Group_4__1__Impl ;
    public final void rule__ProofAssistant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:366:1: ( rule__ProofAssistant__Group_4__1__Impl )
            // InternalProofAssistant.g:367:2: rule__ProofAssistant__Group_4__1__Impl
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
    // InternalProofAssistant.g:373:1: rule__ProofAssistant__Group_4__1__Impl : ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) ) ;
    public final void rule__ProofAssistant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:377:1: ( ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) ) )
            // InternalProofAssistant.g:378:1: ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) )
            {
            // InternalProofAssistant.g:378:1: ( ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* ) )
            // InternalProofAssistant.g:379:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 ) ) ( ( rule__ProofAssistant__HintsAssignment_4_1 )* )
            {
            // InternalProofAssistant.g:379:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 ) )
            // InternalProofAssistant.g:380:3: ( rule__ProofAssistant__HintsAssignment_4_1 )
            {
             before(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 
            // InternalProofAssistant.g:381:3: ( rule__ProofAssistant__HintsAssignment_4_1 )
            // InternalProofAssistant.g:381:4: rule__ProofAssistant__HintsAssignment_4_1
            {
            pushFollow(FOLLOW_8);
            rule__ProofAssistant__HintsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 

            }

            // InternalProofAssistant.g:384:2: ( ( rule__ProofAssistant__HintsAssignment_4_1 )* )
            // InternalProofAssistant.g:385:3: ( rule__ProofAssistant__HintsAssignment_4_1 )*
            {
             before(grammarAccess.getProofAssistantAccess().getHintsAssignment_4_1()); 
            // InternalProofAssistant.g:386:3: ( rule__ProofAssistant__HintsAssignment_4_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProofAssistant.g:386:4: rule__ProofAssistant__HintsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ProofAssistant__HintsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalProofAssistant.g:396:1: rule__SelectionHint__Group__0 : rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1 ;
    public final void rule__SelectionHint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:400:1: ( rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1 )
            // InternalProofAssistant.g:401:2: rule__SelectionHint__Group__0__Impl rule__SelectionHint__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProofAssistant.g:408:1: rule__SelectionHint__Group__0__Impl : ( 'for' ) ;
    public final void rule__SelectionHint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:412:1: ( ( 'for' ) )
            // InternalProofAssistant.g:413:1: ( 'for' )
            {
            // InternalProofAssistant.g:413:1: ( 'for' )
            // InternalProofAssistant.g:414:2: 'for'
            {
             before(grammarAccess.getSelectionHintAccess().getForKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalProofAssistant.g:423:1: rule__SelectionHint__Group__1 : rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2 ;
    public final void rule__SelectionHint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:427:1: ( rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2 )
            // InternalProofAssistant.g:428:2: rule__SelectionHint__Group__1__Impl rule__SelectionHint__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalProofAssistant.g:435:1: rule__SelectionHint__Group__1__Impl : ( ( rule__SelectionHint__ElementAssignment_1 ) ) ;
    public final void rule__SelectionHint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:439:1: ( ( ( rule__SelectionHint__ElementAssignment_1 ) ) )
            // InternalProofAssistant.g:440:1: ( ( rule__SelectionHint__ElementAssignment_1 ) )
            {
            // InternalProofAssistant.g:440:1: ( ( rule__SelectionHint__ElementAssignment_1 ) )
            // InternalProofAssistant.g:441:2: ( rule__SelectionHint__ElementAssignment_1 )
            {
             before(grammarAccess.getSelectionHintAccess().getElementAssignment_1()); 
            // InternalProofAssistant.g:442:2: ( rule__SelectionHint__ElementAssignment_1 )
            // InternalProofAssistant.g:442:3: rule__SelectionHint__ElementAssignment_1
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
    // InternalProofAssistant.g:450:1: rule__SelectionHint__Group__2 : rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3 ;
    public final void rule__SelectionHint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:454:1: ( rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3 )
            // InternalProofAssistant.g:455:2: rule__SelectionHint__Group__2__Impl rule__SelectionHint__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalProofAssistant.g:462:1: rule__SelectionHint__Group__2__Impl : ( 'selects' ) ;
    public final void rule__SelectionHint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:466:1: ( ( 'selects' ) )
            // InternalProofAssistant.g:467:1: ( 'selects' )
            {
            // InternalProofAssistant.g:467:1: ( 'selects' )
            // InternalProofAssistant.g:468:2: 'selects'
            {
             before(grammarAccess.getSelectionHintAccess().getSelectsKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalProofAssistant.g:477:1: rule__SelectionHint__Group__3 : rule__SelectionHint__Group__3__Impl ;
    public final void rule__SelectionHint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:481:1: ( rule__SelectionHint__Group__3__Impl )
            // InternalProofAssistant.g:482:2: rule__SelectionHint__Group__3__Impl
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
    // InternalProofAssistant.g:488:1: rule__SelectionHint__Group__3__Impl : ( ( rule__SelectionHint__SelectionsAssignment_3 ) ) ;
    public final void rule__SelectionHint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:492:1: ( ( ( rule__SelectionHint__SelectionsAssignment_3 ) ) )
            // InternalProofAssistant.g:493:1: ( ( rule__SelectionHint__SelectionsAssignment_3 ) )
            {
            // InternalProofAssistant.g:493:1: ( ( rule__SelectionHint__SelectionsAssignment_3 ) )
            // InternalProofAssistant.g:494:2: ( rule__SelectionHint__SelectionsAssignment_3 )
            {
             before(grammarAccess.getSelectionHintAccess().getSelectionsAssignment_3()); 
            // InternalProofAssistant.g:495:2: ( rule__SelectionHint__SelectionsAssignment_3 )
            // InternalProofAssistant.g:495:3: rule__SelectionHint__SelectionsAssignment_3
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


    // $ANTLR start "rule__ProofAssistant__NameAssignment_1"
    // InternalProofAssistant.g:504:1: rule__ProofAssistant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ProofAssistant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:508:1: ( ( ruleEString ) )
            // InternalProofAssistant.g:509:2: ( ruleEString )
            {
            // InternalProofAssistant.g:509:2: ( ruleEString )
            // InternalProofAssistant.g:510:3: ruleEString
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
    // InternalProofAssistant.g:519:1: rule__ProofAssistant__ComponentAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ProofAssistant__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:523:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:524:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:524:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:525:3: ( ruleEString )
            {
             before(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementCrossReference_3_0()); 
            // InternalProofAssistant.g:526:3: ( ruleEString )
            // InternalProofAssistant.g:527:4: ruleEString
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
    // InternalProofAssistant.g:538:1: rule__ProofAssistant__HintsAssignment_4_1 : ( ruleHint ) ;
    public final void rule__ProofAssistant__HintsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:542:1: ( ( ruleHint ) )
            // InternalProofAssistant.g:543:2: ( ruleHint )
            {
            // InternalProofAssistant.g:543:2: ( ruleHint )
            // InternalProofAssistant.g:544:3: ruleHint
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
    // InternalProofAssistant.g:553:1: rule__SelectionHint__ElementAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__SelectionHint__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:557:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:558:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:558:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:559:3: ( ruleEString )
            {
             before(grammarAccess.getSelectionHintAccess().getElementEventBElementCrossReference_1_0()); 
            // InternalProofAssistant.g:560:3: ( ruleEString )
            // InternalProofAssistant.g:561:4: ruleEString
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
    // InternalProofAssistant.g:572:1: rule__SelectionHint__SelectionsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__SelectionHint__SelectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProofAssistant.g:576:1: ( ( ( ruleEString ) ) )
            // InternalProofAssistant.g:577:2: ( ( ruleEString ) )
            {
            // InternalProofAssistant.g:577:2: ( ( ruleEString ) )
            // InternalProofAssistant.g:578:3: ( ruleEString )
            {
             before(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementCrossReference_3_0()); 
            // InternalProofAssistant.g:579:3: ( ruleEString )
            // InternalProofAssistant.g:580:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}