package ac.soton.xeventb.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xeventb.services.ProofAssistantGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProofAssistantParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProofAssistant'", "'supports'", "'hints'", "'end'", "'for'", "'selects'"
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

        public InternalProofAssistantParser(TokenStream input, ProofAssistantGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProofAssistant";
       	}

       	@Override
       	protected ProofAssistantGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProofAssistant"
    // InternalProofAssistant.g:64:1: entryRuleProofAssistant returns [EObject current=null] : iv_ruleProofAssistant= ruleProofAssistant EOF ;
    public final EObject entryRuleProofAssistant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProofAssistant = null;


        try {
            // InternalProofAssistant.g:64:55: (iv_ruleProofAssistant= ruleProofAssistant EOF )
            // InternalProofAssistant.g:65:2: iv_ruleProofAssistant= ruleProofAssistant EOF
            {
             newCompositeNode(grammarAccess.getProofAssistantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProofAssistant=ruleProofAssistant();

            state._fsp--;

             current =iv_ruleProofAssistant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProofAssistant"


    // $ANTLR start "ruleProofAssistant"
    // InternalProofAssistant.g:71:1: ruleProofAssistant returns [EObject current=null] : (otherlv_0= 'ProofAssistant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'supports' ( ( ruleEString ) ) (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )* otherlv_6= 'end' ) ;
    public final EObject ruleProofAssistant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_hints_5_0 = null;



        	enterRule();

        try {
            // InternalProofAssistant.g:77:2: ( (otherlv_0= 'ProofAssistant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'supports' ( ( ruleEString ) ) (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )* otherlv_6= 'end' ) )
            // InternalProofAssistant.g:78:2: (otherlv_0= 'ProofAssistant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'supports' ( ( ruleEString ) ) (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )* otherlv_6= 'end' )
            {
            // InternalProofAssistant.g:78:2: (otherlv_0= 'ProofAssistant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'supports' ( ( ruleEString ) ) (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )* otherlv_6= 'end' )
            // InternalProofAssistant.g:79:3: otherlv_0= 'ProofAssistant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'supports' ( ( ruleEString ) ) (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProofAssistantAccess().getProofAssistantKeyword_0());
            		
            // InternalProofAssistant.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProofAssistant.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalProofAssistant.g:84:4: (lv_name_1_0= ruleEString )
            // InternalProofAssistant.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProofAssistantAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProofAssistantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.xeventb.ProofAssistant.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProofAssistantAccess().getSupportsKeyword_2());
            		
            // InternalProofAssistant.g:106:3: ( ( ruleEString ) )
            // InternalProofAssistant.g:107:4: ( ruleEString )
            {
            // InternalProofAssistant.g:107:4: ( ruleEString )
            // InternalProofAssistant.g:108:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProofAssistantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProofAssistantAccess().getComponentEventBNamedCommentedComponentElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProofAssistant.g:122:3: (otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+ )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProofAssistant.g:123:4: otherlv_4= 'hints' ( (lv_hints_5_0= ruleHint ) )+
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getProofAssistantAccess().getHintsKeyword_4_0());
            	    			
            	    // InternalProofAssistant.g:127:4: ( (lv_hints_5_0= ruleHint ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalProofAssistant.g:128:5: (lv_hints_5_0= ruleHint )
            	    	    {
            	    	    // InternalProofAssistant.g:128:5: (lv_hints_5_0= ruleHint )
            	    	    // InternalProofAssistant.g:129:6: lv_hints_5_0= ruleHint
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getProofAssistantAccess().getHintsHintParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_hints_5_0=ruleHint();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getProofAssistantRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"hints",
            	    	    							lv_hints_5_0,
            	    	    							"ac.soton.xeventb.ProofAssistant.Hint");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProofAssistantAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProofAssistant"


    // $ANTLR start "entryRuleHint"
    // InternalProofAssistant.g:155:1: entryRuleHint returns [EObject current=null] : iv_ruleHint= ruleHint EOF ;
    public final EObject entryRuleHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHint = null;


        try {
            // InternalProofAssistant.g:155:45: (iv_ruleHint= ruleHint EOF )
            // InternalProofAssistant.g:156:2: iv_ruleHint= ruleHint EOF
            {
             newCompositeNode(grammarAccess.getHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHint=ruleHint();

            state._fsp--;

             current =iv_ruleHint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHint"


    // $ANTLR start "ruleHint"
    // InternalProofAssistant.g:162:1: ruleHint returns [EObject current=null] : this_SelectionHint_0= ruleSelectionHint ;
    public final EObject ruleHint() throws RecognitionException {
        EObject current = null;

        EObject this_SelectionHint_0 = null;



        	enterRule();

        try {
            // InternalProofAssistant.g:168:2: (this_SelectionHint_0= ruleSelectionHint )
            // InternalProofAssistant.g:169:2: this_SelectionHint_0= ruleSelectionHint
            {

            		newCompositeNode(grammarAccess.getHintAccess().getSelectionHintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SelectionHint_0=ruleSelectionHint();

            state._fsp--;


            		current = this_SelectionHint_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHint"


    // $ANTLR start "entryRuleEString"
    // InternalProofAssistant.g:180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProofAssistant.g:180:47: (iv_ruleEString= ruleEString EOF )
            // InternalProofAssistant.g:181:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalProofAssistant.g:187:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalProofAssistant.g:193:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalProofAssistant.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalProofAssistant.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalProofAssistant.g:195:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProofAssistant.g:203:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSelectionHint"
    // InternalProofAssistant.g:214:1: entryRuleSelectionHint returns [EObject current=null] : iv_ruleSelectionHint= ruleSelectionHint EOF ;
    public final EObject entryRuleSelectionHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionHint = null;


        try {
            // InternalProofAssistant.g:214:54: (iv_ruleSelectionHint= ruleSelectionHint EOF )
            // InternalProofAssistant.g:215:2: iv_ruleSelectionHint= ruleSelectionHint EOF
            {
             newCompositeNode(grammarAccess.getSelectionHintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectionHint=ruleSelectionHint();

            state._fsp--;

             current =iv_ruleSelectionHint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionHint"


    // $ANTLR start "ruleSelectionHint"
    // InternalProofAssistant.g:221:1: ruleSelectionHint returns [EObject current=null] : (otherlv_0= 'for' ( ( ruleEString ) ) otherlv_2= 'selects' ( ( ruleEString ) ) ) ;
    public final EObject ruleSelectionHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalProofAssistant.g:227:2: ( (otherlv_0= 'for' ( ( ruleEString ) ) otherlv_2= 'selects' ( ( ruleEString ) ) ) )
            // InternalProofAssistant.g:228:2: (otherlv_0= 'for' ( ( ruleEString ) ) otherlv_2= 'selects' ( ( ruleEString ) ) )
            {
            // InternalProofAssistant.g:228:2: (otherlv_0= 'for' ( ( ruleEString ) ) otherlv_2= 'selects' ( ( ruleEString ) ) )
            // InternalProofAssistant.g:229:3: otherlv_0= 'for' ( ( ruleEString ) ) otherlv_2= 'selects' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectionHintAccess().getForKeyword_0());
            		
            // InternalProofAssistant.g:233:3: ( ( ruleEString ) )
            // InternalProofAssistant.g:234:4: ( ruleEString )
            {
            // InternalProofAssistant.g:234:4: ( ruleEString )
            // InternalProofAssistant.g:235:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectionHintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSelectionHintAccess().getElementEventBElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectionHintAccess().getSelectsKeyword_2());
            		
            // InternalProofAssistant.g:253:3: ( ( ruleEString ) )
            // InternalProofAssistant.g:254:4: ( ruleEString )
            {
            // InternalProofAssistant.g:254:4: ( ruleEString )
            // InternalProofAssistant.g:255:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectionHintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSelectionHintAccess().getSelectionsEventBElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionHint"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}