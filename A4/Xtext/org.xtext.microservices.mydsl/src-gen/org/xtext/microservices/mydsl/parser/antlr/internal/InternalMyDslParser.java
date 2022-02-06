package org.xtext.microservices.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.microservices.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'environment'", "'{'", "'id'", "'='", "';'", "'name'", "'type'", "'location'", "'serverNodes'", "','", "'}'", "'node'", "'RAM'", "'Processor'", "'Disk'", "'virtualMachines'", "'vm'", "'containers'", "'docker'", "'IP'", "'Port'", "'Microservice'", "'service'", "'Development'", "'Test'", "'UAT'", "'Demo'", "'Production'", "'Linux'", "'RedHat'", "'Windows'", "'CentOS'", "'Internal'", "'External'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvironmentModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvironmentModel"
    // InternalMyDsl.g:65:1: entryRuleEnvironmentModel returns [EObject current=null] : iv_ruleEnvironmentModel= ruleEnvironmentModel EOF ;
    public final EObject entryRuleEnvironmentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentModel = null;


        try {
            // InternalMyDsl.g:65:57: (iv_ruleEnvironmentModel= ruleEnvironmentModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleEnvironmentModel= ruleEnvironmentModel EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentModel=ruleEnvironmentModel();

            state._fsp--;

             current =iv_ruleEnvironmentModel; 
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
    // $ANTLR end "entryRuleEnvironmentModel"


    // $ANTLR start "ruleEnvironmentModel"
    // InternalMyDsl.g:72:1: ruleEnvironmentModel returns [EObject current=null] : ( (lv_environment_0_0= ruleEnvironment ) ) ;
    public final EObject ruleEnvironmentModel() throws RecognitionException {
        EObject current = null;

        EObject lv_environment_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_environment_0_0= ruleEnvironment ) ) )
            // InternalMyDsl.g:79:2: ( (lv_environment_0_0= ruleEnvironment ) )
            {
            // InternalMyDsl.g:79:2: ( (lv_environment_0_0= ruleEnvironment ) )
            // InternalMyDsl.g:80:3: (lv_environment_0_0= ruleEnvironment )
            {
            // InternalMyDsl.g:80:3: (lv_environment_0_0= ruleEnvironment )
            // InternalMyDsl.g:81:4: lv_environment_0_0= ruleEnvironment
            {

            				newCompositeNode(grammarAccess.getEnvironmentModelAccess().getEnvironmentEnvironmentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_environment_0_0=ruleEnvironment();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnvironmentModelRule());
            				}
            				set(
            					current,
            					"environment",
            					lv_environment_0_0,
            					"org.xtext.microservices.mydsl.MyDsl.Environment");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleEnvironmentModel"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDsl.g:101:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:101:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:102:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDsl.g:108:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )? (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )? otherlv_27= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Enumerator lv_Type_13_0 = null;

        EObject lv_nodes_22_0 = null;

        EObject lv_nodes_24_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )? (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )? otherlv_27= '}' ) )
            // InternalMyDsl.g:115:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )? (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )? otherlv_27= '}' )
            {
            // InternalMyDsl.g:115:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )? (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )? otherlv_27= '}' )
            // InternalMyDsl.g:116:3: otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )? (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalMyDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:142:3: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:143:4: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getIdKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:151:4: ( (lv_id_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:152:5: (lv_id_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:152:5: (lv_id_5_0= RULE_STRING )
                    // InternalMyDsl.g:153:6: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getEnvironmentAccess().getIdSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:174:3: (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:175:4: otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getNameKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:183:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:184:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:184:5: (lv_name_9_0= RULE_STRING )
                    // InternalMyDsl.g:185:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:206:3: (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:207:4: otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleEnvironmentType ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnvironmentAccess().getTypeKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:215:4: ( (lv_Type_13_0= ruleEnvironmentType ) )
                    // InternalMyDsl.g:216:5: (lv_Type_13_0= ruleEnvironmentType )
                    {
                    // InternalMyDsl.g:216:5: (lv_Type_13_0= ruleEnvironmentType )
                    // InternalMyDsl.g:217:6: lv_Type_13_0= ruleEnvironmentType
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getTypeEnvironmentTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Type_13_0=ruleEnvironmentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_13_0,
                    							"org.xtext.microservices.mydsl.MyDsl.EnvironmentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getSemicolonKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:239:3: (otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:240:4: otherlv_15= 'location' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getLocationKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalMyDsl.g:248:4: ( (lv_name_17_0= RULE_STRING ) )
                    // InternalMyDsl.g:249:5: (lv_name_17_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:249:5: (lv_name_17_0= RULE_STRING )
                    // InternalMyDsl.g:250:6: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_17_0, grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getEnvironmentAccess().getSemicolonKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:271:3: (otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:272:4: otherlv_19= 'serverNodes' otherlv_20= '=' otherlv_21= '{' ( (lv_nodes_22_0= ruleServerNode ) ) (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )* otherlv_25= '}' otherlv_26= ';'
                    {
                    otherlv_19=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getEnvironmentAccess().getServerNodesKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_7_1());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_7_2());
                    			
                    // InternalMyDsl.g:284:4: ( (lv_nodes_22_0= ruleServerNode ) )
                    // InternalMyDsl.g:285:5: (lv_nodes_22_0= ruleServerNode )
                    {
                    // InternalMyDsl.g:285:5: (lv_nodes_22_0= ruleServerNode )
                    // InternalMyDsl.g:286:6: lv_nodes_22_0= ruleServerNode
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_nodes_22_0=ruleServerNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_22_0,
                    							"org.xtext.microservices.mydsl.MyDsl.ServerNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:303:4: (otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:304:5: otherlv_23= ',' ( (lv_nodes_24_0= ruleServerNode ) )
                    	    {
                    	    otherlv_23=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEnvironmentAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalMyDsl.g:308:5: ( (lv_nodes_24_0= ruleServerNode ) )
                    	    // InternalMyDsl.g:309:6: (lv_nodes_24_0= ruleServerNode )
                    	    {
                    	    // InternalMyDsl.g:309:6: (lv_nodes_24_0= ruleServerNode )
                    	    // InternalMyDsl.g:310:7: lv_nodes_24_0= ruleServerNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_nodes_24_0=ruleServerNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_24_0,
                    	    								"org.xtext.microservices.mydsl.MyDsl.ServerNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_25, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_7_5());
                    			
                    otherlv_26=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_26, grammarAccess.getEnvironmentAccess().getSemicolonKeyword_7_6());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleServerNode"
    // InternalMyDsl.g:345:1: entryRuleServerNode returns [EObject current=null] : iv_ruleServerNode= ruleServerNode EOF ;
    public final EObject entryRuleServerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerNode = null;


        try {
            // InternalMyDsl.g:345:51: (iv_ruleServerNode= ruleServerNode EOF )
            // InternalMyDsl.g:346:2: iv_ruleServerNode= ruleServerNode EOF
            {
             newCompositeNode(grammarAccess.getServerNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerNode=ruleServerNode();

            state._fsp--;

             current =iv_ruleServerNode; 
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
    // $ANTLR end "entryRuleServerNode"


    // $ANTLR start "ruleServerNode"
    // InternalMyDsl.g:352:1: ruleServerNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )? otherlv_31= '}' ) ;
    public final EObject ruleServerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_name_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_vms_26_0 = null;

        EObject lv_vms_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:358:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )? otherlv_31= '}' ) )
            // InternalMyDsl.g:359:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )? otherlv_31= '}' )
            {
            // InternalMyDsl.g:359:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )? otherlv_31= '}' )
            // InternalMyDsl.g:360:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServerNodeAccess().getNodeKeyword_0());
            		
            // InternalMyDsl.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:386:3: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:387:4: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getServerNodeAccess().getIdKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:395:4: ( (lv_id_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:396:5: (lv_id_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:396:5: (lv_id_5_0= RULE_STRING )
                    // InternalMyDsl.g:397:6: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getServerNodeAccess().getIdSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getServerNodeAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:418:3: (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:419:4: otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getServerNodeAccess().getNameKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:427:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:428:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:428:5: (lv_name_9_0= RULE_STRING )
                    // InternalMyDsl.g:429:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getServerNodeAccess().getSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:450:3: (otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:451:4: otherlv_11= 'RAM' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getServerNodeAccess().getRAMKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:459:4: ( (lv_name_13_0= RULE_STRING ) )
                    // InternalMyDsl.g:460:5: (lv_name_13_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:460:5: (lv_name_13_0= RULE_STRING )
                    // InternalMyDsl.g:461:6: lv_name_13_0= RULE_STRING
                    {
                    lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_13_0, grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getServerNodeAccess().getSemicolonKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:482:3: (otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:483:4: otherlv_15= 'Processor' otherlv_16= '=' ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getServerNodeAccess().getProcessorKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalMyDsl.g:491:4: ( (lv_name_17_0= RULE_STRING ) )
                    // InternalMyDsl.g:492:5: (lv_name_17_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:492:5: (lv_name_17_0= RULE_STRING )
                    // InternalMyDsl.g:493:6: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_17_0, grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getServerNodeAccess().getSemicolonKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:514:3: (otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:515:4: otherlv_19= 'Disk' otherlv_20= '=' ( (lv_name_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getServerNodeAccess().getDiskKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_20, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalMyDsl.g:523:4: ( (lv_name_21_0= RULE_STRING ) )
                    // InternalMyDsl.g:524:5: (lv_name_21_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:524:5: (lv_name_21_0= RULE_STRING )
                    // InternalMyDsl.g:525:6: lv_name_21_0= RULE_STRING
                    {
                    lv_name_21_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_21_0, grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_21_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getServerNodeAccess().getSemicolonKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:546:3: (otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:547:4: otherlv_23= 'virtualMachines' otherlv_24= '=' otherlv_25= '{' ( (lv_vms_26_0= ruleVirtualMachine ) ) (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )* otherlv_29= '}' otherlv_30= ';'
                    {
                    otherlv_23=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getServerNodeAccess().getVirtualMachinesKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getServerNodeAccess().getEqualsSignKeyword_8_1());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_25, grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMyDsl.g:559:4: ( (lv_vms_26_0= ruleVirtualMachine ) )
                    // InternalMyDsl.g:560:5: (lv_vms_26_0= ruleVirtualMachine )
                    {
                    // InternalMyDsl.g:560:5: (lv_vms_26_0= ruleVirtualMachine )
                    // InternalMyDsl.g:561:6: lv_vms_26_0= ruleVirtualMachine
                    {

                    						newCompositeNode(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_vms_26_0=ruleVirtualMachine();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServerNodeRule());
                    						}
                    						add(
                    							current,
                    							"vms",
                    							lv_vms_26_0,
                    							"org.xtext.microservices.mydsl.MyDsl.VirtualMachine");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:578:4: (otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:579:5: otherlv_27= ',' ( (lv_vms_28_0= ruleVirtualMachine ) )
                    	    {
                    	    otherlv_27=(Token)match(input,20,FOLLOW_23); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getServerNodeAccess().getCommaKeyword_8_4_0());
                    	    				
                    	    // InternalMyDsl.g:583:5: ( (lv_vms_28_0= ruleVirtualMachine ) )
                    	    // InternalMyDsl.g:584:6: (lv_vms_28_0= ruleVirtualMachine )
                    	    {
                    	    // InternalMyDsl.g:584:6: (lv_vms_28_0= ruleVirtualMachine )
                    	    // InternalMyDsl.g:585:7: lv_vms_28_0= ruleVirtualMachine
                    	    {

                    	    							newCompositeNode(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_vms_28_0=ruleVirtualMachine();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServerNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vms",
                    	    								lv_vms_28_0,
                    	    								"org.xtext.microservices.mydsl.MyDsl.VirtualMachine");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_29, grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_8_5());
                    			
                    otherlv_30=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_30, grammarAccess.getServerNodeAccess().getSemicolonKeyword_8_6());
                    			

                    }
                    break;

            }

            otherlv_31=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleServerNode"


    // $ANTLR start "entryRuleVirtualMachine"
    // InternalMyDsl.g:620:1: entryRuleVirtualMachine returns [EObject current=null] : iv_ruleVirtualMachine= ruleVirtualMachine EOF ;
    public final EObject entryRuleVirtualMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualMachine = null;


        try {
            // InternalMyDsl.g:620:55: (iv_ruleVirtualMachine= ruleVirtualMachine EOF )
            // InternalMyDsl.g:621:2: iv_ruleVirtualMachine= ruleVirtualMachine EOF
            {
             newCompositeNode(grammarAccess.getVirtualMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVirtualMachine=ruleVirtualMachine();

            state._fsp--;

             current =iv_ruleVirtualMachine; 
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
    // $ANTLR end "entryRuleVirtualMachine"


    // $ANTLR start "ruleVirtualMachine"
    // InternalMyDsl.g:627:1: ruleVirtualMachine returns [EObject current=null] : (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )? (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )? otherlv_23= '}' ) ;
    public final EObject ruleVirtualMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Enumerator lv_Type_13_0 = null;

        EObject lv_dockers_18_0 = null;

        EObject lv_dockers_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:633:2: ( (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )? (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )? otherlv_23= '}' ) )
            // InternalMyDsl.g:634:2: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )? (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )? otherlv_23= '}' )
            {
            // InternalMyDsl.g:634:2: (otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )? (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )? otherlv_23= '}' )
            // InternalMyDsl.g:635:3: otherlv_0= 'vm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )? (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVirtualMachineAccess().getVmKeyword_0());
            		
            // InternalMyDsl.g:639:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:640:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:640:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:641:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVirtualMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVirtualMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:661:3: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:662:4: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getVirtualMachineAccess().getIdKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:670:4: ( (lv_id_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:671:5: (lv_id_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:671:5: (lv_id_5_0= RULE_STRING )
                    // InternalMyDsl.g:672:6: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getVirtualMachineAccess().getIdSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVirtualMachineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:693:3: (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:694:4: otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getVirtualMachineAccess().getNameKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:702:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:703:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:703:5: (lv_name_9_0= RULE_STRING )
                    // InternalMyDsl.g:704:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getVirtualMachineAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVirtualMachineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:725:3: (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:726:4: otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleVMType ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getVirtualMachineAccess().getTypeKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:734:4: ( (lv_Type_13_0= ruleVMType ) )
                    // InternalMyDsl.g:735:5: (lv_Type_13_0= ruleVMType )
                    {
                    // InternalMyDsl.g:735:5: (lv_Type_13_0= ruleVMType )
                    // InternalMyDsl.g:736:6: lv_Type_13_0= ruleVMType
                    {

                    						newCompositeNode(grammarAccess.getVirtualMachineAccess().getTypeVMTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Type_13_0=ruleVMType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_13_0,
                    							"org.xtext.microservices.mydsl.MyDsl.VMType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_14, grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:758:3: (otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:759:4: otherlv_15= 'containers' otherlv_16= '=' otherlv_17= '{' ( (lv_dockers_18_0= ruleContainer ) ) (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )* otherlv_21= '}' otherlv_22= ';'
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getVirtualMachineAccess().getContainersKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_6_1());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_6_2());
                    			
                    // InternalMyDsl.g:771:4: ( (lv_dockers_18_0= ruleContainer ) )
                    // InternalMyDsl.g:772:5: (lv_dockers_18_0= ruleContainer )
                    {
                    // InternalMyDsl.g:772:5: (lv_dockers_18_0= ruleContainer )
                    // InternalMyDsl.g:773:6: lv_dockers_18_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_dockers_18_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
                    						}
                    						add(
                    							current,
                    							"dockers",
                    							lv_dockers_18_0,
                    							"org.xtext.microservices.mydsl.MyDsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:790:4: (otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:791:5: otherlv_19= ',' ( (lv_dockers_20_0= ruleContainer ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_29); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getVirtualMachineAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalMyDsl.g:795:5: ( (lv_dockers_20_0= ruleContainer ) )
                    	    // InternalMyDsl.g:796:6: (lv_dockers_20_0= ruleContainer )
                    	    {
                    	    // InternalMyDsl.g:796:6: (lv_dockers_20_0= ruleContainer )
                    	    // InternalMyDsl.g:797:7: lv_dockers_20_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_dockers_20_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dockers",
                    	    								lv_dockers_20_0,
                    	    								"org.xtext.microservices.mydsl.MyDsl.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_6_5());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_6_6());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVirtualMachine"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:832:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:832:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:833:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:839:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'docker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )? otherlv_23= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_Port_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_Microservice_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:845:2: ( (otherlv_0= 'docker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )? otherlv_23= '}' ) )
            // InternalMyDsl.g:846:2: (otherlv_0= 'docker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )? otherlv_23= '}' )
            {
            // InternalMyDsl.g:846:2: (otherlv_0= 'docker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )? otherlv_23= '}' )
            // InternalMyDsl.g:847:3: otherlv_0= 'docker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getDockerKeyword_0());
            		
            // InternalMyDsl.g:851:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:852:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:852:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:853:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:873:3: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:874:4: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getIdKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:882:4: ( (lv_id_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:883:5: (lv_id_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:883:5: (lv_id_5_0= RULE_STRING )
                    // InternalMyDsl.g:884:6: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getContainerAccess().getIdSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:905:3: (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:906:4: otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getNameKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:914:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:915:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:915:5: (lv_name_9_0= RULE_STRING )
                    // InternalMyDsl.g:916:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:937:3: (otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:938:4: otherlv_11= 'IP' otherlv_12= '=' ( (lv_name_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getIPKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:946:4: ( (lv_name_13_0= RULE_STRING ) )
                    // InternalMyDsl.g:947:5: (lv_name_13_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:947:5: (lv_name_13_0= RULE_STRING )
                    // InternalMyDsl.g:948:6: lv_name_13_0= RULE_STRING
                    {
                    lv_name_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_13_0, grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getSemicolonKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:969:3: (otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:970:4: otherlv_15= 'Port' otherlv_16= '=' ( (lv_Port_17_0= RULE_INT ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getContainerAccess().getPortKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getContainerAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalMyDsl.g:978:4: ( (lv_Port_17_0= RULE_INT ) )
                    // InternalMyDsl.g:979:5: (lv_Port_17_0= RULE_INT )
                    {
                    // InternalMyDsl.g:979:5: (lv_Port_17_0= RULE_INT )
                    // InternalMyDsl.g:980:6: lv_Port_17_0= RULE_INT
                    {
                    lv_Port_17_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_Port_17_0, grammarAccess.getContainerAccess().getPortINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Port",
                    							lv_Port_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_18, grammarAccess.getContainerAccess().getSemicolonKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1001:3: (otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1002:4: otherlv_19= 'Microservice' otherlv_20= '=' ( (lv_Microservice_21_0= ruleMicroservice ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getContainerAccess().getMicroserviceKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,14,FOLLOW_36); 

                    				newLeafNode(otherlv_20, grammarAccess.getContainerAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalMyDsl.g:1010:4: ( (lv_Microservice_21_0= ruleMicroservice ) )
                    // InternalMyDsl.g:1011:5: (lv_Microservice_21_0= ruleMicroservice )
                    {
                    // InternalMyDsl.g:1011:5: (lv_Microservice_21_0= ruleMicroservice )
                    // InternalMyDsl.g:1012:6: lv_Microservice_21_0= ruleMicroservice
                    {

                    						newCompositeNode(grammarAccess.getContainerAccess().getMicroserviceMicroserviceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Microservice_21_0=ruleMicroservice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainerRule());
                    						}
                    						set(
                    							current,
                    							"Microservice",
                    							lv_Microservice_21_0,
                    							"org.xtext.microservices.mydsl.MyDsl.Microservice");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getContainerAccess().getSemicolonKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleMicroservice"
    // InternalMyDsl.g:1042:1: entryRuleMicroservice returns [EObject current=null] : iv_ruleMicroservice= ruleMicroservice EOF ;
    public final EObject entryRuleMicroservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMicroservice = null;


        try {
            // InternalMyDsl.g:1042:53: (iv_ruleMicroservice= ruleMicroservice EOF )
            // InternalMyDsl.g:1043:2: iv_ruleMicroservice= ruleMicroservice EOF
            {
             newCompositeNode(grammarAccess.getMicroserviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMicroservice=ruleMicroservice();

            state._fsp--;

             current =iv_ruleMicroservice; 
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
    // $ANTLR end "entryRuleMicroservice"


    // $ANTLR start "ruleMicroservice"
    // InternalMyDsl.g:1049:1: ruleMicroservice returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )? otherlv_15= '}' ) ;
    public final EObject ruleMicroservice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_Type_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1055:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )? otherlv_15= '}' ) )
            // InternalMyDsl.g:1056:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:1056:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )? otherlv_15= '}' )
            // InternalMyDsl.g:1057:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )? (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )? (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMicroserviceAccess().getServiceKeyword_0());
            		
            // InternalMyDsl.g:1061:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1062:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1062:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1063:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMicroserviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMicroserviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getMicroserviceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1083:3: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1084:4: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMicroserviceAccess().getIdKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:1092:4: ( (lv_id_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:1093:5: (lv_id_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1093:5: (lv_id_5_0= RULE_STRING )
                    // InternalMyDsl.g:1094:6: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_id_5_0, grammarAccess.getMicroserviceAccess().getIdSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMicroserviceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getMicroserviceAccess().getSemicolonKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1115:3: (otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1116:4: otherlv_7= 'name' otherlv_8= '=' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getMicroserviceAccess().getNameKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:1124:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalMyDsl.g:1125:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1125:5: (lv_name_9_0= RULE_STRING )
                    // InternalMyDsl.g:1126:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getMicroserviceAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMicroserviceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getMicroserviceAccess().getSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1147:3: (otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1148:4: otherlv_11= 'type' otherlv_12= '=' ( (lv_Type_13_0= ruleMicroserviceType ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getMicroserviceAccess().getTypeKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_40); 

                    				newLeafNode(otherlv_12, grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalMyDsl.g:1156:4: ( (lv_Type_13_0= ruleMicroserviceType ) )
                    // InternalMyDsl.g:1157:5: (lv_Type_13_0= ruleMicroserviceType )
                    {
                    // InternalMyDsl.g:1157:5: (lv_Type_13_0= ruleMicroserviceType )
                    // InternalMyDsl.g:1158:6: lv_Type_13_0= ruleMicroserviceType
                    {

                    						newCompositeNode(grammarAccess.getMicroserviceAccess().getTypeMicroserviceTypeEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Type_13_0=ruleMicroserviceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMicroserviceRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_13_0,
                    							"org.xtext.microservices.mydsl.MyDsl.MicroserviceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getMicroserviceAccess().getSemicolonKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMicroserviceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMicroservice"


    // $ANTLR start "ruleEnvironmentType"
    // InternalMyDsl.g:1188:1: ruleEnvironmentType returns [Enumerator current=null] : ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Test' ) | (enumLiteral_2= 'UAT' ) | (enumLiteral_3= 'Demo' ) | (enumLiteral_4= 'Production' ) ) ;
    public final Enumerator ruleEnvironmentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1194:2: ( ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Test' ) | (enumLiteral_2= 'UAT' ) | (enumLiteral_3= 'Demo' ) | (enumLiteral_4= 'Production' ) ) )
            // InternalMyDsl.g:1195:2: ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Test' ) | (enumLiteral_2= 'UAT' ) | (enumLiteral_3= 'Demo' ) | (enumLiteral_4= 'Production' ) )
            {
            // InternalMyDsl.g:1195:2: ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Test' ) | (enumLiteral_2= 'UAT' ) | (enumLiteral_3= 'Demo' ) | (enumLiteral_4= 'Production' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 35:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1196:3: (enumLiteral_0= 'Development' )
                    {
                    // InternalMyDsl.g:1196:3: (enumLiteral_0= 'Development' )
                    // InternalMyDsl.g:1197:4: enumLiteral_0= 'Development'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEnvironmentTypeAccess().getDevelopmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnvironmentTypeAccess().getDevelopmentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1204:3: (enumLiteral_1= 'Test' )
                    {
                    // InternalMyDsl.g:1204:3: (enumLiteral_1= 'Test' )
                    // InternalMyDsl.g:1205:4: enumLiteral_1= 'Test'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEnvironmentTypeAccess().getTestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnvironmentTypeAccess().getTestEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1212:3: (enumLiteral_2= 'UAT' )
                    {
                    // InternalMyDsl.g:1212:3: (enumLiteral_2= 'UAT' )
                    // InternalMyDsl.g:1213:4: enumLiteral_2= 'UAT'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getEnvironmentTypeAccess().getUATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnvironmentTypeAccess().getUATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1220:3: (enumLiteral_3= 'Demo' )
                    {
                    // InternalMyDsl.g:1220:3: (enumLiteral_3= 'Demo' )
                    // InternalMyDsl.g:1221:4: enumLiteral_3= 'Demo'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getEnvironmentTypeAccess().getDemoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnvironmentTypeAccess().getDemoEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1228:3: (enumLiteral_4= 'Production' )
                    {
                    // InternalMyDsl.g:1228:3: (enumLiteral_4= 'Production' )
                    // InternalMyDsl.g:1229:4: enumLiteral_4= 'Production'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEnvironmentTypeAccess().getProductionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnvironmentTypeAccess().getProductionEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleEnvironmentType"


    // $ANTLR start "ruleVMType"
    // InternalMyDsl.g:1239:1: ruleVMType returns [Enumerator current=null] : ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'RedHat' ) | (enumLiteral_2= 'Windows' ) | (enumLiteral_3= 'CentOS' ) ) ;
    public final Enumerator ruleVMType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1245:2: ( ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'RedHat' ) | (enumLiteral_2= 'Windows' ) | (enumLiteral_3= 'CentOS' ) ) )
            // InternalMyDsl.g:1246:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'RedHat' ) | (enumLiteral_2= 'Windows' ) | (enumLiteral_3= 'CentOS' ) )
            {
            // InternalMyDsl.g:1246:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'RedHat' ) | (enumLiteral_2= 'Windows' ) | (enumLiteral_3= 'CentOS' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 40:
                {
                alt28=2;
                }
                break;
            case 41:
                {
                alt28=3;
                }
                break;
            case 42:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1247:3: (enumLiteral_0= 'Linux' )
                    {
                    // InternalMyDsl.g:1247:3: (enumLiteral_0= 'Linux' )
                    // InternalMyDsl.g:1248:4: enumLiteral_0= 'Linux'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVMTypeAccess().getLinuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVMTypeAccess().getLinuxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1255:3: (enumLiteral_1= 'RedHat' )
                    {
                    // InternalMyDsl.g:1255:3: (enumLiteral_1= 'RedHat' )
                    // InternalMyDsl.g:1256:4: enumLiteral_1= 'RedHat'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVMTypeAccess().getRedHatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVMTypeAccess().getRedHatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1263:3: (enumLiteral_2= 'Windows' )
                    {
                    // InternalMyDsl.g:1263:3: (enumLiteral_2= 'Windows' )
                    // InternalMyDsl.g:1264:4: enumLiteral_2= 'Windows'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVMTypeAccess().getWindowsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVMTypeAccess().getWindowsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1271:3: (enumLiteral_3= 'CentOS' )
                    {
                    // InternalMyDsl.g:1271:3: (enumLiteral_3= 'CentOS' )
                    // InternalMyDsl.g:1272:4: enumLiteral_3= 'CentOS'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVMTypeAccess().getCentOSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVMTypeAccess().getCentOSEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleVMType"


    // $ANTLR start "ruleMicroserviceType"
    // InternalMyDsl.g:1282:1: ruleMicroserviceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Internal' ) | (enumLiteral_1= 'External' ) ) ;
    public final Enumerator ruleMicroserviceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1288:2: ( ( (enumLiteral_0= 'Internal' ) | (enumLiteral_1= 'External' ) ) )
            // InternalMyDsl.g:1289:2: ( (enumLiteral_0= 'Internal' ) | (enumLiteral_1= 'External' ) )
            {
            // InternalMyDsl.g:1289:2: ( (enumLiteral_0= 'Internal' ) | (enumLiteral_1= 'External' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            else if ( (LA29_0==44) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1290:3: (enumLiteral_0= 'Internal' )
                    {
                    // InternalMyDsl.g:1290:3: (enumLiteral_0= 'Internal' )
                    // InternalMyDsl.g:1291:4: enumLiteral_0= 'Internal'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMicroserviceTypeAccess().getInternalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMicroserviceTypeAccess().getInternalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1298:3: (enumLiteral_1= 'External' )
                    {
                    // InternalMyDsl.g:1298:3: (enumLiteral_1= 'External' )
                    // InternalMyDsl.g:1299:4: enumLiteral_1= 'External'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMicroserviceTypeAccess().getExternalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMicroserviceTypeAccess().getExternalEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMicroserviceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000002F2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000002F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007A12000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007A10000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007A00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010232000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010230000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010220000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001C0212000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000001C0210000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000001C0200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000232000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000000L});

}