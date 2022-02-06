package org.xtext.microservices.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.microservices.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Development'", "'Test'", "'UAT'", "'Demo'", "'Production'", "'Linux'", "'RedHat'", "'Windows'", "'CentOS'", "'Internal'", "'External'", "'environment'", "'{'", "'}'", "'id'", "'='", "';'", "'name'", "'type'", "'location'", "'serverNodes'", "','", "'node'", "'RAM'", "'Processor'", "'Disk'", "'virtualMachines'", "'vm'", "'containers'", "'docker'", "'IP'", "'Port'", "'Microservice'", "'service'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvironmentModel"
    // InternalMyDsl.g:53:1: entryRuleEnvironmentModel : ruleEnvironmentModel EOF ;
    public final void entryRuleEnvironmentModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleEnvironmentModel EOF )
            // InternalMyDsl.g:55:1: ruleEnvironmentModel EOF
            {
             before(grammarAccess.getEnvironmentModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentModel();

            state._fsp--;

             after(grammarAccess.getEnvironmentModelRule()); 
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
    // $ANTLR end "entryRuleEnvironmentModel"


    // $ANTLR start "ruleEnvironmentModel"
    // InternalMyDsl.g:62:1: ruleEnvironmentModel : ( ( rule__EnvironmentModel__EnvironmentAssignment ) ) ;
    public final void ruleEnvironmentModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__EnvironmentModel__EnvironmentAssignment ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__EnvironmentModel__EnvironmentAssignment ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__EnvironmentModel__EnvironmentAssignment ) )
            // InternalMyDsl.g:68:3: ( rule__EnvironmentModel__EnvironmentAssignment )
            {
             before(grammarAccess.getEnvironmentModelAccess().getEnvironmentAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__EnvironmentModel__EnvironmentAssignment )
            // InternalMyDsl.g:69:4: rule__EnvironmentModel__EnvironmentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentModel__EnvironmentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentModelAccess().getEnvironmentAssignment()); 

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
    // $ANTLR end "ruleEnvironmentModel"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDsl.g:78:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEnvironment EOF )
            // InternalMyDsl.g:80:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDsl.g:87:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Environment__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Environment__Group__0 )
            // InternalMyDsl.g:94:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleServerNode"
    // InternalMyDsl.g:103:1: entryRuleServerNode : ruleServerNode EOF ;
    public final void entryRuleServerNode() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleServerNode EOF )
            // InternalMyDsl.g:105:1: ruleServerNode EOF
            {
             before(grammarAccess.getServerNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleServerNode();

            state._fsp--;

             after(grammarAccess.getServerNodeRule()); 
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
    // $ANTLR end "entryRuleServerNode"


    // $ANTLR start "ruleServerNode"
    // InternalMyDsl.g:112:1: ruleServerNode : ( ( rule__ServerNode__Group__0 ) ) ;
    public final void ruleServerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ServerNode__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ServerNode__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ServerNode__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ServerNode__Group__0 )
            {
             before(grammarAccess.getServerNodeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ServerNode__Group__0 )
            // InternalMyDsl.g:119:4: rule__ServerNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleServerNode"


    // $ANTLR start "entryRuleVirtualMachine"
    // InternalMyDsl.g:128:1: entryRuleVirtualMachine : ruleVirtualMachine EOF ;
    public final void entryRuleVirtualMachine() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVirtualMachine EOF )
            // InternalMyDsl.g:130:1: ruleVirtualMachine EOF
            {
             before(grammarAccess.getVirtualMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleVirtualMachine();

            state._fsp--;

             after(grammarAccess.getVirtualMachineRule()); 
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
    // $ANTLR end "entryRuleVirtualMachine"


    // $ANTLR start "ruleVirtualMachine"
    // InternalMyDsl.g:137:1: ruleVirtualMachine : ( ( rule__VirtualMachine__Group__0 ) ) ;
    public final void ruleVirtualMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__VirtualMachine__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__VirtualMachine__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__VirtualMachine__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__VirtualMachine__Group__0 )
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__VirtualMachine__Group__0 )
            // InternalMyDsl.g:144:4: rule__VirtualMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getGroup()); 

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
    // $ANTLR end "ruleVirtualMachine"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:153:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleContainer EOF )
            // InternalMyDsl.g:155:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:162:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:169:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleMicroservice"
    // InternalMyDsl.g:178:1: entryRuleMicroservice : ruleMicroservice EOF ;
    public final void entryRuleMicroservice() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleMicroservice EOF )
            // InternalMyDsl.g:180:1: ruleMicroservice EOF
            {
             before(grammarAccess.getMicroserviceRule()); 
            pushFollow(FOLLOW_1);
            ruleMicroservice();

            state._fsp--;

             after(grammarAccess.getMicroserviceRule()); 
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
    // $ANTLR end "entryRuleMicroservice"


    // $ANTLR start "ruleMicroservice"
    // InternalMyDsl.g:187:1: ruleMicroservice : ( ( rule__Microservice__Group__0 ) ) ;
    public final void ruleMicroservice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Microservice__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Microservice__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Microservice__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Microservice__Group__0 )
            {
             before(grammarAccess.getMicroserviceAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Microservice__Group__0 )
            // InternalMyDsl.g:194:4: rule__Microservice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceAccess().getGroup()); 

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
    // $ANTLR end "ruleMicroservice"


    // $ANTLR start "ruleEnvironmentType"
    // InternalMyDsl.g:203:1: ruleEnvironmentType : ( ( rule__EnvironmentType__Alternatives ) ) ;
    public final void ruleEnvironmentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:1: ( ( ( rule__EnvironmentType__Alternatives ) ) )
            // InternalMyDsl.g:208:2: ( ( rule__EnvironmentType__Alternatives ) )
            {
            // InternalMyDsl.g:208:2: ( ( rule__EnvironmentType__Alternatives ) )
            // InternalMyDsl.g:209:3: ( rule__EnvironmentType__Alternatives )
            {
             before(grammarAccess.getEnvironmentTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:210:3: ( rule__EnvironmentType__Alternatives )
            // InternalMyDsl.g:210:4: rule__EnvironmentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnvironmentType"


    // $ANTLR start "ruleVMType"
    // InternalMyDsl.g:219:1: ruleVMType : ( ( rule__VMType__Alternatives ) ) ;
    public final void ruleVMType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( ( ( rule__VMType__Alternatives ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__VMType__Alternatives ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__VMType__Alternatives ) )
            // InternalMyDsl.g:225:3: ( rule__VMType__Alternatives )
            {
             before(grammarAccess.getVMTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:226:3: ( rule__VMType__Alternatives )
            // InternalMyDsl.g:226:4: rule__VMType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VMType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVMTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVMType"


    // $ANTLR start "ruleMicroserviceType"
    // InternalMyDsl.g:235:1: ruleMicroserviceType : ( ( rule__MicroserviceType__Alternatives ) ) ;
    public final void ruleMicroserviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( ( ( rule__MicroserviceType__Alternatives ) ) )
            // InternalMyDsl.g:240:2: ( ( rule__MicroserviceType__Alternatives ) )
            {
            // InternalMyDsl.g:240:2: ( ( rule__MicroserviceType__Alternatives ) )
            // InternalMyDsl.g:241:3: ( rule__MicroserviceType__Alternatives )
            {
             before(grammarAccess.getMicroserviceTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:242:3: ( rule__MicroserviceType__Alternatives )
            // InternalMyDsl.g:242:4: rule__MicroserviceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MicroserviceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMicroserviceType"


    // $ANTLR start "rule__EnvironmentType__Alternatives"
    // InternalMyDsl.g:250:1: rule__EnvironmentType__Alternatives : ( ( ( 'Development' ) ) | ( ( 'Test' ) ) | ( ( 'UAT' ) ) | ( ( 'Demo' ) ) | ( ( 'Production' ) ) );
    public final void rule__EnvironmentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:254:1: ( ( ( 'Development' ) ) | ( ( 'Test' ) ) | ( ( 'UAT' ) ) | ( ( 'Demo' ) ) | ( ( 'Production' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:255:2: ( ( 'Development' ) )
                    {
                    // InternalMyDsl.g:255:2: ( ( 'Development' ) )
                    // InternalMyDsl.g:256:3: ( 'Development' )
                    {
                     before(grammarAccess.getEnvironmentTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:257:3: ( 'Development' )
                    // InternalMyDsl.g:257:4: 'Development'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnvironmentTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:2: ( ( 'Test' ) )
                    {
                    // InternalMyDsl.g:261:2: ( ( 'Test' ) )
                    // InternalMyDsl.g:262:3: ( 'Test' )
                    {
                     before(grammarAccess.getEnvironmentTypeAccess().getTestEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:263:3: ( 'Test' )
                    // InternalMyDsl.g:263:4: 'Test'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnvironmentTypeAccess().getTestEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:267:2: ( ( 'UAT' ) )
                    {
                    // InternalMyDsl.g:267:2: ( ( 'UAT' ) )
                    // InternalMyDsl.g:268:3: ( 'UAT' )
                    {
                     before(grammarAccess.getEnvironmentTypeAccess().getUATEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:269:3: ( 'UAT' )
                    // InternalMyDsl.g:269:4: 'UAT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnvironmentTypeAccess().getUATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:273:2: ( ( 'Demo' ) )
                    {
                    // InternalMyDsl.g:273:2: ( ( 'Demo' ) )
                    // InternalMyDsl.g:274:3: ( 'Demo' )
                    {
                     before(grammarAccess.getEnvironmentTypeAccess().getDemoEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:275:3: ( 'Demo' )
                    // InternalMyDsl.g:275:4: 'Demo'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnvironmentTypeAccess().getDemoEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:279:2: ( ( 'Production' ) )
                    {
                    // InternalMyDsl.g:279:2: ( ( 'Production' ) )
                    // InternalMyDsl.g:280:3: ( 'Production' )
                    {
                     before(grammarAccess.getEnvironmentTypeAccess().getProductionEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:281:3: ( 'Production' )
                    // InternalMyDsl.g:281:4: 'Production'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnvironmentTypeAccess().getProductionEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EnvironmentType__Alternatives"


    // $ANTLR start "rule__VMType__Alternatives"
    // InternalMyDsl.g:289:1: rule__VMType__Alternatives : ( ( ( 'Linux' ) ) | ( ( 'RedHat' ) ) | ( ( 'Windows' ) ) | ( ( 'CentOS' ) ) );
    public final void rule__VMType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ( 'Linux' ) ) | ( ( 'RedHat' ) ) | ( ( 'Windows' ) ) | ( ( 'CentOS' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:294:2: ( ( 'Linux' ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( 'Linux' ) )
                    // InternalMyDsl.g:295:3: ( 'Linux' )
                    {
                     before(grammarAccess.getVMTypeAccess().getLinuxEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:296:3: ( 'Linux' )
                    // InternalMyDsl.g:296:4: 'Linux'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVMTypeAccess().getLinuxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:300:2: ( ( 'RedHat' ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( 'RedHat' ) )
                    // InternalMyDsl.g:301:3: ( 'RedHat' )
                    {
                     before(grammarAccess.getVMTypeAccess().getRedHatEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:302:3: ( 'RedHat' )
                    // InternalMyDsl.g:302:4: 'RedHat'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVMTypeAccess().getRedHatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:306:2: ( ( 'Windows' ) )
                    {
                    // InternalMyDsl.g:306:2: ( ( 'Windows' ) )
                    // InternalMyDsl.g:307:3: ( 'Windows' )
                    {
                     before(grammarAccess.getVMTypeAccess().getWindowsEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:308:3: ( 'Windows' )
                    // InternalMyDsl.g:308:4: 'Windows'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVMTypeAccess().getWindowsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:312:2: ( ( 'CentOS' ) )
                    {
                    // InternalMyDsl.g:312:2: ( ( 'CentOS' ) )
                    // InternalMyDsl.g:313:3: ( 'CentOS' )
                    {
                     before(grammarAccess.getVMTypeAccess().getCentOSEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:314:3: ( 'CentOS' )
                    // InternalMyDsl.g:314:4: 'CentOS'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVMTypeAccess().getCentOSEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__VMType__Alternatives"


    // $ANTLR start "rule__MicroserviceType__Alternatives"
    // InternalMyDsl.g:322:1: rule__MicroserviceType__Alternatives : ( ( ( 'Internal' ) ) | ( ( 'External' ) ) );
    public final void rule__MicroserviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( ( 'Internal' ) ) | ( ( 'External' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:327:2: ( ( 'Internal' ) )
                    {
                    // InternalMyDsl.g:327:2: ( ( 'Internal' ) )
                    // InternalMyDsl.g:328:3: ( 'Internal' )
                    {
                     before(grammarAccess.getMicroserviceTypeAccess().getInternalEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:329:3: ( 'Internal' )
                    // InternalMyDsl.g:329:4: 'Internal'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMicroserviceTypeAccess().getInternalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:333:2: ( ( 'External' ) )
                    {
                    // InternalMyDsl.g:333:2: ( ( 'External' ) )
                    // InternalMyDsl.g:334:3: ( 'External' )
                    {
                     before(grammarAccess.getMicroserviceTypeAccess().getExternalEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:335:3: ( 'External' )
                    // InternalMyDsl.g:335:4: 'External'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMicroserviceTypeAccess().getExternalEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MicroserviceType__Alternatives"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalMyDsl.g:343:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalMyDsl.g:348:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalMyDsl.g:355:1: rule__Environment__Group__0__Impl : ( 'environment' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( ( 'environment' ) )
            // InternalMyDsl.g:360:1: ( 'environment' )
            {
            // InternalMyDsl.g:360:1: ( 'environment' )
            // InternalMyDsl.g:361:2: 'environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0()); 

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
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalMyDsl.g:370:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalMyDsl.g:375:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalMyDsl.g:382:1: rule__Environment__Group__1__Impl : ( ( rule__Environment__NameAssignment_1 ) ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( ( rule__Environment__NameAssignment_1 ) ) )
            // InternalMyDsl.g:387:1: ( ( rule__Environment__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:387:1: ( ( rule__Environment__NameAssignment_1 ) )
            // InternalMyDsl.g:388:2: ( rule__Environment__NameAssignment_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:389:2: ( rule__Environment__NameAssignment_1 )
            // InternalMyDsl.g:389:3: rule__Environment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalMyDsl.g:397:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalMyDsl.g:402:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalMyDsl.g:409:1: rule__Environment__Group__2__Impl : ( '{' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( '{' ) )
            // InternalMyDsl.g:414:1: ( '{' )
            {
            // InternalMyDsl.g:414:1: ( '{' )
            // InternalMyDsl.g:415:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalMyDsl.g:424:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalMyDsl.g:429:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalMyDsl.g:436:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__Group_3__0 )? ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:440:1: ( ( ( rule__Environment__Group_3__0 )? ) )
            // InternalMyDsl.g:441:1: ( ( rule__Environment__Group_3__0 )? )
            {
            // InternalMyDsl.g:441:1: ( ( rule__Environment__Group_3__0 )? )
            // InternalMyDsl.g:442:2: ( rule__Environment__Group_3__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_3()); 
            // InternalMyDsl.g:443:2: ( rule__Environment__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:443:3: rule__Environment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalMyDsl.g:451:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalMyDsl.g:456:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__5();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalMyDsl.g:463:1: rule__Environment__Group__4__Impl : ( ( rule__Environment__Group_4__0 )? ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( ( ( rule__Environment__Group_4__0 )? ) )
            // InternalMyDsl.g:468:1: ( ( rule__Environment__Group_4__0 )? )
            {
            // InternalMyDsl.g:468:1: ( ( rule__Environment__Group_4__0 )? )
            // InternalMyDsl.g:469:2: ( rule__Environment__Group_4__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_4()); 
            // InternalMyDsl.g:470:2: ( rule__Environment__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:470:3: rule__Environment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalMyDsl.g:478:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl rule__Environment__Group__6 ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( rule__Environment__Group__5__Impl rule__Environment__Group__6 )
            // InternalMyDsl.g:483:2: rule__Environment__Group__5__Impl rule__Environment__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__6();

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
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalMyDsl.g:490:1: rule__Environment__Group__5__Impl : ( ( rule__Environment__Group_5__0 )? ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( ( ( rule__Environment__Group_5__0 )? ) )
            // InternalMyDsl.g:495:1: ( ( rule__Environment__Group_5__0 )? )
            {
            // InternalMyDsl.g:495:1: ( ( rule__Environment__Group_5__0 )? )
            // InternalMyDsl.g:496:2: ( rule__Environment__Group_5__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_5()); 
            // InternalMyDsl.g:497:2: ( rule__Environment__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:497:3: rule__Environment__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group__6"
    // InternalMyDsl.g:505:1: rule__Environment__Group__6 : rule__Environment__Group__6__Impl rule__Environment__Group__7 ;
    public final void rule__Environment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( rule__Environment__Group__6__Impl rule__Environment__Group__7 )
            // InternalMyDsl.g:510:2: rule__Environment__Group__6__Impl rule__Environment__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__7();

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
    // $ANTLR end "rule__Environment__Group__6"


    // $ANTLR start "rule__Environment__Group__6__Impl"
    // InternalMyDsl.g:517:1: rule__Environment__Group__6__Impl : ( ( rule__Environment__Group_6__0 )? ) ;
    public final void rule__Environment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ( rule__Environment__Group_6__0 )? ) )
            // InternalMyDsl.g:522:1: ( ( rule__Environment__Group_6__0 )? )
            {
            // InternalMyDsl.g:522:1: ( ( rule__Environment__Group_6__0 )? )
            // InternalMyDsl.g:523:2: ( rule__Environment__Group_6__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_6()); 
            // InternalMyDsl.g:524:2: ( rule__Environment__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:524:3: rule__Environment__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Environment__Group__6__Impl"


    // $ANTLR start "rule__Environment__Group__7"
    // InternalMyDsl.g:532:1: rule__Environment__Group__7 : rule__Environment__Group__7__Impl rule__Environment__Group__8 ;
    public final void rule__Environment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( rule__Environment__Group__7__Impl rule__Environment__Group__8 )
            // InternalMyDsl.g:537:2: rule__Environment__Group__7__Impl rule__Environment__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__8();

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
    // $ANTLR end "rule__Environment__Group__7"


    // $ANTLR start "rule__Environment__Group__7__Impl"
    // InternalMyDsl.g:544:1: rule__Environment__Group__7__Impl : ( ( rule__Environment__Group_7__0 )? ) ;
    public final void rule__Environment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( ( ( rule__Environment__Group_7__0 )? ) )
            // InternalMyDsl.g:549:1: ( ( rule__Environment__Group_7__0 )? )
            {
            // InternalMyDsl.g:549:1: ( ( rule__Environment__Group_7__0 )? )
            // InternalMyDsl.g:550:2: ( rule__Environment__Group_7__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_7()); 
            // InternalMyDsl.g:551:2: ( rule__Environment__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:551:3: rule__Environment__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Environment__Group__7__Impl"


    // $ANTLR start "rule__Environment__Group__8"
    // InternalMyDsl.g:559:1: rule__Environment__Group__8 : rule__Environment__Group__8__Impl ;
    public final void rule__Environment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( rule__Environment__Group__8__Impl )
            // InternalMyDsl.g:564:2: rule__Environment__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__8__Impl();

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
    // $ANTLR end "rule__Environment__Group__8"


    // $ANTLR start "rule__Environment__Group__8__Impl"
    // InternalMyDsl.g:570:1: rule__Environment__Group__8__Impl : ( '}' ) ;
    public final void rule__Environment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( ( '}' ) )
            // InternalMyDsl.g:575:1: ( '}' )
            {
            // InternalMyDsl.g:575:1: ( '}' )
            // InternalMyDsl.g:576:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Environment__Group__8__Impl"


    // $ANTLR start "rule__Environment__Group_3__0"
    // InternalMyDsl.g:586:1: rule__Environment__Group_3__0 : rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1 ;
    public final void rule__Environment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1 )
            // InternalMyDsl.g:591:2: rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_3__1();

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
    // $ANTLR end "rule__Environment__Group_3__0"


    // $ANTLR start "rule__Environment__Group_3__0__Impl"
    // InternalMyDsl.g:598:1: rule__Environment__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Environment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( 'id' ) )
            // InternalMyDsl.g:603:1: ( 'id' )
            {
            // InternalMyDsl.g:603:1: ( 'id' )
            // InternalMyDsl.g:604:2: 'id'
            {
             before(grammarAccess.getEnvironmentAccess().getIdKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Environment__Group_3__0__Impl"


    // $ANTLR start "rule__Environment__Group_3__1"
    // InternalMyDsl.g:613:1: rule__Environment__Group_3__1 : rule__Environment__Group_3__1__Impl rule__Environment__Group_3__2 ;
    public final void rule__Environment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( rule__Environment__Group_3__1__Impl rule__Environment__Group_3__2 )
            // InternalMyDsl.g:618:2: rule__Environment__Group_3__1__Impl rule__Environment__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_3__2();

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
    // $ANTLR end "rule__Environment__Group_3__1"


    // $ANTLR start "rule__Environment__Group_3__1__Impl"
    // InternalMyDsl.g:625:1: rule__Environment__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Environment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( '=' ) )
            // InternalMyDsl.g:630:1: ( '=' )
            {
            // InternalMyDsl.g:630:1: ( '=' )
            // InternalMyDsl.g:631:2: '='
            {
             before(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Environment__Group_3__1__Impl"


    // $ANTLR start "rule__Environment__Group_3__2"
    // InternalMyDsl.g:640:1: rule__Environment__Group_3__2 : rule__Environment__Group_3__2__Impl rule__Environment__Group_3__3 ;
    public final void rule__Environment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( rule__Environment__Group_3__2__Impl rule__Environment__Group_3__3 )
            // InternalMyDsl.g:645:2: rule__Environment__Group_3__2__Impl rule__Environment__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_3__3();

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
    // $ANTLR end "rule__Environment__Group_3__2"


    // $ANTLR start "rule__Environment__Group_3__2__Impl"
    // InternalMyDsl.g:652:1: rule__Environment__Group_3__2__Impl : ( ( rule__Environment__IdAssignment_3_2 ) ) ;
    public final void rule__Environment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ( rule__Environment__IdAssignment_3_2 ) ) )
            // InternalMyDsl.g:657:1: ( ( rule__Environment__IdAssignment_3_2 ) )
            {
            // InternalMyDsl.g:657:1: ( ( rule__Environment__IdAssignment_3_2 ) )
            // InternalMyDsl.g:658:2: ( rule__Environment__IdAssignment_3_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getIdAssignment_3_2()); 
            // InternalMyDsl.g:659:2: ( rule__Environment__IdAssignment_3_2 )
            // InternalMyDsl.g:659:3: rule__Environment__IdAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__IdAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getIdAssignment_3_2()); 

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
    // $ANTLR end "rule__Environment__Group_3__2__Impl"


    // $ANTLR start "rule__Environment__Group_3__3"
    // InternalMyDsl.g:667:1: rule__Environment__Group_3__3 : rule__Environment__Group_3__3__Impl ;
    public final void rule__Environment__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( rule__Environment__Group_3__3__Impl )
            // InternalMyDsl.g:672:2: rule__Environment__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_3__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_3__3"


    // $ANTLR start "rule__Environment__Group_3__3__Impl"
    // InternalMyDsl.g:678:1: rule__Environment__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Environment__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( ( ';' ) )
            // InternalMyDsl.g:683:1: ( ';' )
            {
            // InternalMyDsl.g:683:1: ( ';' )
            // InternalMyDsl.g:684:2: ';'
            {
             before(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__Environment__Group_3__3__Impl"


    // $ANTLR start "rule__Environment__Group_4__0"
    // InternalMyDsl.g:694:1: rule__Environment__Group_4__0 : rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 ;
    public final void rule__Environment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 )
            // InternalMyDsl.g:699:2: rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1();

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
    // $ANTLR end "rule__Environment__Group_4__0"


    // $ANTLR start "rule__Environment__Group_4__0__Impl"
    // InternalMyDsl.g:706:1: rule__Environment__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Environment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( 'name' ) )
            // InternalMyDsl.g:711:1: ( 'name' )
            {
            // InternalMyDsl.g:711:1: ( 'name' )
            // InternalMyDsl.g:712:2: 'name'
            {
             before(grammarAccess.getEnvironmentAccess().getNameKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Environment__Group_4__0__Impl"


    // $ANTLR start "rule__Environment__Group_4__1"
    // InternalMyDsl.g:721:1: rule__Environment__Group_4__1 : rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2 ;
    public final void rule__Environment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2 )
            // InternalMyDsl.g:726:2: rule__Environment__Group_4__1__Impl rule__Environment__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__2();

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
    // $ANTLR end "rule__Environment__Group_4__1"


    // $ANTLR start "rule__Environment__Group_4__1__Impl"
    // InternalMyDsl.g:733:1: rule__Environment__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Environment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( ( '=' ) )
            // InternalMyDsl.g:738:1: ( '=' )
            {
            // InternalMyDsl.g:738:1: ( '=' )
            // InternalMyDsl.g:739:2: '='
            {
             before(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Environment__Group_4__1__Impl"


    // $ANTLR start "rule__Environment__Group_4__2"
    // InternalMyDsl.g:748:1: rule__Environment__Group_4__2 : rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3 ;
    public final void rule__Environment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3 )
            // InternalMyDsl.g:753:2: rule__Environment__Group_4__2__Impl rule__Environment__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__3();

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
    // $ANTLR end "rule__Environment__Group_4__2"


    // $ANTLR start "rule__Environment__Group_4__2__Impl"
    // InternalMyDsl.g:760:1: rule__Environment__Group_4__2__Impl : ( ( rule__Environment__NameAssignment_4_2 ) ) ;
    public final void rule__Environment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ( rule__Environment__NameAssignment_4_2 ) ) )
            // InternalMyDsl.g:765:1: ( ( rule__Environment__NameAssignment_4_2 ) )
            {
            // InternalMyDsl.g:765:1: ( ( rule__Environment__NameAssignment_4_2 ) )
            // InternalMyDsl.g:766:2: ( rule__Environment__NameAssignment_4_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_4_2()); 
            // InternalMyDsl.g:767:2: ( rule__Environment__NameAssignment_4_2 )
            // InternalMyDsl.g:767:3: rule__Environment__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_4_2()); 

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
    // $ANTLR end "rule__Environment__Group_4__2__Impl"


    // $ANTLR start "rule__Environment__Group_4__3"
    // InternalMyDsl.g:775:1: rule__Environment__Group_4__3 : rule__Environment__Group_4__3__Impl ;
    public final void rule__Environment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( rule__Environment__Group_4__3__Impl )
            // InternalMyDsl.g:780:2: rule__Environment__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_4__3"


    // $ANTLR start "rule__Environment__Group_4__3__Impl"
    // InternalMyDsl.g:786:1: rule__Environment__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Environment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( ( ';' ) )
            // InternalMyDsl.g:791:1: ( ';' )
            {
            // InternalMyDsl.g:791:1: ( ';' )
            // InternalMyDsl.g:792:2: ';'
            {
             before(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_4_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_4_3()); 

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
    // $ANTLR end "rule__Environment__Group_4__3__Impl"


    // $ANTLR start "rule__Environment__Group_5__0"
    // InternalMyDsl.g:802:1: rule__Environment__Group_5__0 : rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1 ;
    public final void rule__Environment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1 )
            // InternalMyDsl.g:807:2: rule__Environment__Group_5__0__Impl rule__Environment__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__1();

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
    // $ANTLR end "rule__Environment__Group_5__0"


    // $ANTLR start "rule__Environment__Group_5__0__Impl"
    // InternalMyDsl.g:814:1: rule__Environment__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__Environment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( 'type' ) )
            // InternalMyDsl.g:819:1: ( 'type' )
            {
            // InternalMyDsl.g:819:1: ( 'type' )
            // InternalMyDsl.g:820:2: 'type'
            {
             before(grammarAccess.getEnvironmentAccess().getTypeKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Environment__Group_5__0__Impl"


    // $ANTLR start "rule__Environment__Group_5__1"
    // InternalMyDsl.g:829:1: rule__Environment__Group_5__1 : rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2 ;
    public final void rule__Environment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2 )
            // InternalMyDsl.g:834:2: rule__Environment__Group_5__1__Impl rule__Environment__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Environment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__2();

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
    // $ANTLR end "rule__Environment__Group_5__1"


    // $ANTLR start "rule__Environment__Group_5__1__Impl"
    // InternalMyDsl.g:841:1: rule__Environment__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Environment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( '=' ) )
            // InternalMyDsl.g:846:1: ( '=' )
            {
            // InternalMyDsl.g:846:1: ( '=' )
            // InternalMyDsl.g:847:2: '='
            {
             before(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Environment__Group_5__1__Impl"


    // $ANTLR start "rule__Environment__Group_5__2"
    // InternalMyDsl.g:856:1: rule__Environment__Group_5__2 : rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3 ;
    public final void rule__Environment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3 )
            // InternalMyDsl.g:861:2: rule__Environment__Group_5__2__Impl rule__Environment__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__3();

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
    // $ANTLR end "rule__Environment__Group_5__2"


    // $ANTLR start "rule__Environment__Group_5__2__Impl"
    // InternalMyDsl.g:868:1: rule__Environment__Group_5__2__Impl : ( ( rule__Environment__TypeAssignment_5_2 ) ) ;
    public final void rule__Environment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( ( rule__Environment__TypeAssignment_5_2 ) ) )
            // InternalMyDsl.g:873:1: ( ( rule__Environment__TypeAssignment_5_2 ) )
            {
            // InternalMyDsl.g:873:1: ( ( rule__Environment__TypeAssignment_5_2 ) )
            // InternalMyDsl.g:874:2: ( rule__Environment__TypeAssignment_5_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getTypeAssignment_5_2()); 
            // InternalMyDsl.g:875:2: ( rule__Environment__TypeAssignment_5_2 )
            // InternalMyDsl.g:875:3: rule__Environment__TypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__TypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getTypeAssignment_5_2()); 

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
    // $ANTLR end "rule__Environment__Group_5__2__Impl"


    // $ANTLR start "rule__Environment__Group_5__3"
    // InternalMyDsl.g:883:1: rule__Environment__Group_5__3 : rule__Environment__Group_5__3__Impl ;
    public final void rule__Environment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( rule__Environment__Group_5__3__Impl )
            // InternalMyDsl.g:888:2: rule__Environment__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_5__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_5__3"


    // $ANTLR start "rule__Environment__Group_5__3__Impl"
    // InternalMyDsl.g:894:1: rule__Environment__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Environment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ';' ) )
            // InternalMyDsl.g:899:1: ( ';' )
            {
            // InternalMyDsl.g:899:1: ( ';' )
            // InternalMyDsl.g:900:2: ';'
            {
             before(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end "rule__Environment__Group_5__3__Impl"


    // $ANTLR start "rule__Environment__Group_6__0"
    // InternalMyDsl.g:910:1: rule__Environment__Group_6__0 : rule__Environment__Group_6__0__Impl rule__Environment__Group_6__1 ;
    public final void rule__Environment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( rule__Environment__Group_6__0__Impl rule__Environment__Group_6__1 )
            // InternalMyDsl.g:915:2: rule__Environment__Group_6__0__Impl rule__Environment__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_6__1();

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
    // $ANTLR end "rule__Environment__Group_6__0"


    // $ANTLR start "rule__Environment__Group_6__0__Impl"
    // InternalMyDsl.g:922:1: rule__Environment__Group_6__0__Impl : ( 'location' ) ;
    public final void rule__Environment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( ( 'location' ) )
            // InternalMyDsl.g:927:1: ( 'location' )
            {
            // InternalMyDsl.g:927:1: ( 'location' )
            // InternalMyDsl.g:928:2: 'location'
            {
             before(grammarAccess.getEnvironmentAccess().getLocationKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLocationKeyword_6_0()); 

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
    // $ANTLR end "rule__Environment__Group_6__0__Impl"


    // $ANTLR start "rule__Environment__Group_6__1"
    // InternalMyDsl.g:937:1: rule__Environment__Group_6__1 : rule__Environment__Group_6__1__Impl rule__Environment__Group_6__2 ;
    public final void rule__Environment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( rule__Environment__Group_6__1__Impl rule__Environment__Group_6__2 )
            // InternalMyDsl.g:942:2: rule__Environment__Group_6__1__Impl rule__Environment__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_6__2();

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
    // $ANTLR end "rule__Environment__Group_6__1"


    // $ANTLR start "rule__Environment__Group_6__1__Impl"
    // InternalMyDsl.g:949:1: rule__Environment__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Environment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( '=' ) )
            // InternalMyDsl.g:954:1: ( '=' )
            {
            // InternalMyDsl.g:954:1: ( '=' )
            // InternalMyDsl.g:955:2: '='
            {
             before(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Environment__Group_6__1__Impl"


    // $ANTLR start "rule__Environment__Group_6__2"
    // InternalMyDsl.g:964:1: rule__Environment__Group_6__2 : rule__Environment__Group_6__2__Impl rule__Environment__Group_6__3 ;
    public final void rule__Environment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__Environment__Group_6__2__Impl rule__Environment__Group_6__3 )
            // InternalMyDsl.g:969:2: rule__Environment__Group_6__2__Impl rule__Environment__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_6__3();

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
    // $ANTLR end "rule__Environment__Group_6__2"


    // $ANTLR start "rule__Environment__Group_6__2__Impl"
    // InternalMyDsl.g:976:1: rule__Environment__Group_6__2__Impl : ( ( rule__Environment__NameAssignment_6_2 ) ) ;
    public final void rule__Environment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( ( rule__Environment__NameAssignment_6_2 ) ) )
            // InternalMyDsl.g:981:1: ( ( rule__Environment__NameAssignment_6_2 ) )
            {
            // InternalMyDsl.g:981:1: ( ( rule__Environment__NameAssignment_6_2 ) )
            // InternalMyDsl.g:982:2: ( rule__Environment__NameAssignment_6_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_6_2()); 
            // InternalMyDsl.g:983:2: ( rule__Environment__NameAssignment_6_2 )
            // InternalMyDsl.g:983:3: rule__Environment__NameAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_6_2()); 

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
    // $ANTLR end "rule__Environment__Group_6__2__Impl"


    // $ANTLR start "rule__Environment__Group_6__3"
    // InternalMyDsl.g:991:1: rule__Environment__Group_6__3 : rule__Environment__Group_6__3__Impl ;
    public final void rule__Environment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__Environment__Group_6__3__Impl )
            // InternalMyDsl.g:996:2: rule__Environment__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_6__3__Impl();

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
    // $ANTLR end "rule__Environment__Group_6__3"


    // $ANTLR start "rule__Environment__Group_6__3__Impl"
    // InternalMyDsl.g:1002:1: rule__Environment__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Environment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( ( ';' ) )
            // InternalMyDsl.g:1007:1: ( ';' )
            {
            // InternalMyDsl.g:1007:1: ( ';' )
            // InternalMyDsl.g:1008:2: ';'
            {
             before(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_6_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_6_3()); 

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
    // $ANTLR end "rule__Environment__Group_6__3__Impl"


    // $ANTLR start "rule__Environment__Group_7__0"
    // InternalMyDsl.g:1018:1: rule__Environment__Group_7__0 : rule__Environment__Group_7__0__Impl rule__Environment__Group_7__1 ;
    public final void rule__Environment__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__Environment__Group_7__0__Impl rule__Environment__Group_7__1 )
            // InternalMyDsl.g:1023:2: rule__Environment__Group_7__0__Impl rule__Environment__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__1();

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
    // $ANTLR end "rule__Environment__Group_7__0"


    // $ANTLR start "rule__Environment__Group_7__0__Impl"
    // InternalMyDsl.g:1030:1: rule__Environment__Group_7__0__Impl : ( 'serverNodes' ) ;
    public final void rule__Environment__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( 'serverNodes' ) )
            // InternalMyDsl.g:1035:1: ( 'serverNodes' )
            {
            // InternalMyDsl.g:1035:1: ( 'serverNodes' )
            // InternalMyDsl.g:1036:2: 'serverNodes'
            {
             before(grammarAccess.getEnvironmentAccess().getServerNodesKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getServerNodesKeyword_7_0()); 

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
    // $ANTLR end "rule__Environment__Group_7__0__Impl"


    // $ANTLR start "rule__Environment__Group_7__1"
    // InternalMyDsl.g:1045:1: rule__Environment__Group_7__1 : rule__Environment__Group_7__1__Impl rule__Environment__Group_7__2 ;
    public final void rule__Environment__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__Environment__Group_7__1__Impl rule__Environment__Group_7__2 )
            // InternalMyDsl.g:1050:2: rule__Environment__Group_7__1__Impl rule__Environment__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__2();

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
    // $ANTLR end "rule__Environment__Group_7__1"


    // $ANTLR start "rule__Environment__Group_7__1__Impl"
    // InternalMyDsl.g:1057:1: rule__Environment__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Environment__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( '=' ) )
            // InternalMyDsl.g:1062:1: ( '=' )
            {
            // InternalMyDsl.g:1062:1: ( '=' )
            // InternalMyDsl.g:1063:2: '='
            {
             before(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Environment__Group_7__1__Impl"


    // $ANTLR start "rule__Environment__Group_7__2"
    // InternalMyDsl.g:1072:1: rule__Environment__Group_7__2 : rule__Environment__Group_7__2__Impl rule__Environment__Group_7__3 ;
    public final void rule__Environment__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__Environment__Group_7__2__Impl rule__Environment__Group_7__3 )
            // InternalMyDsl.g:1077:2: rule__Environment__Group_7__2__Impl rule__Environment__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__Environment__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__3();

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
    // $ANTLR end "rule__Environment__Group_7__2"


    // $ANTLR start "rule__Environment__Group_7__2__Impl"
    // InternalMyDsl.g:1084:1: rule__Environment__Group_7__2__Impl : ( '{' ) ;
    public final void rule__Environment__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( '{' ) )
            // InternalMyDsl.g:1089:1: ( '{' )
            {
            // InternalMyDsl.g:1089:1: ( '{' )
            // InternalMyDsl.g:1090:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_7_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_7_2()); 

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
    // $ANTLR end "rule__Environment__Group_7__2__Impl"


    // $ANTLR start "rule__Environment__Group_7__3"
    // InternalMyDsl.g:1099:1: rule__Environment__Group_7__3 : rule__Environment__Group_7__3__Impl rule__Environment__Group_7__4 ;
    public final void rule__Environment__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__Environment__Group_7__3__Impl rule__Environment__Group_7__4 )
            // InternalMyDsl.g:1104:2: rule__Environment__Group_7__3__Impl rule__Environment__Group_7__4
            {
            pushFollow(FOLLOW_11);
            rule__Environment__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__4();

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
    // $ANTLR end "rule__Environment__Group_7__3"


    // $ANTLR start "rule__Environment__Group_7__3__Impl"
    // InternalMyDsl.g:1111:1: rule__Environment__Group_7__3__Impl : ( ( rule__Environment__NodesAssignment_7_3 ) ) ;
    public final void rule__Environment__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__Environment__NodesAssignment_7_3 ) ) )
            // InternalMyDsl.g:1116:1: ( ( rule__Environment__NodesAssignment_7_3 ) )
            {
            // InternalMyDsl.g:1116:1: ( ( rule__Environment__NodesAssignment_7_3 ) )
            // InternalMyDsl.g:1117:2: ( rule__Environment__NodesAssignment_7_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getNodesAssignment_7_3()); 
            // InternalMyDsl.g:1118:2: ( rule__Environment__NodesAssignment_7_3 )
            // InternalMyDsl.g:1118:3: rule__Environment__NodesAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NodesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNodesAssignment_7_3()); 

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
    // $ANTLR end "rule__Environment__Group_7__3__Impl"


    // $ANTLR start "rule__Environment__Group_7__4"
    // InternalMyDsl.g:1126:1: rule__Environment__Group_7__4 : rule__Environment__Group_7__4__Impl rule__Environment__Group_7__5 ;
    public final void rule__Environment__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__Environment__Group_7__4__Impl rule__Environment__Group_7__5 )
            // InternalMyDsl.g:1131:2: rule__Environment__Group_7__4__Impl rule__Environment__Group_7__5
            {
            pushFollow(FOLLOW_11);
            rule__Environment__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__5();

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
    // $ANTLR end "rule__Environment__Group_7__4"


    // $ANTLR start "rule__Environment__Group_7__4__Impl"
    // InternalMyDsl.g:1138:1: rule__Environment__Group_7__4__Impl : ( ( rule__Environment__Group_7_4__0 )* ) ;
    public final void rule__Environment__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( ( rule__Environment__Group_7_4__0 )* ) )
            // InternalMyDsl.g:1143:1: ( ( rule__Environment__Group_7_4__0 )* )
            {
            // InternalMyDsl.g:1143:1: ( ( rule__Environment__Group_7_4__0 )* )
            // InternalMyDsl.g:1144:2: ( rule__Environment__Group_7_4__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_7_4()); 
            // InternalMyDsl.g:1145:2: ( rule__Environment__Group_7_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1145:3: rule__Environment__Group_7_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Environment__Group_7_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_7_4()); 

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
    // $ANTLR end "rule__Environment__Group_7__4__Impl"


    // $ANTLR start "rule__Environment__Group_7__5"
    // InternalMyDsl.g:1153:1: rule__Environment__Group_7__5 : rule__Environment__Group_7__5__Impl rule__Environment__Group_7__6 ;
    public final void rule__Environment__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__Environment__Group_7__5__Impl rule__Environment__Group_7__6 )
            // InternalMyDsl.g:1158:2: rule__Environment__Group_7__5__Impl rule__Environment__Group_7__6
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__6();

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
    // $ANTLR end "rule__Environment__Group_7__5"


    // $ANTLR start "rule__Environment__Group_7__5__Impl"
    // InternalMyDsl.g:1165:1: rule__Environment__Group_7__5__Impl : ( '}' ) ;
    public final void rule__Environment__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( '}' ) )
            // InternalMyDsl.g:1170:1: ( '}' )
            {
            // InternalMyDsl.g:1170:1: ( '}' )
            // InternalMyDsl.g:1171:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_7_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_7_5()); 

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
    // $ANTLR end "rule__Environment__Group_7__5__Impl"


    // $ANTLR start "rule__Environment__Group_7__6"
    // InternalMyDsl.g:1180:1: rule__Environment__Group_7__6 : rule__Environment__Group_7__6__Impl ;
    public final void rule__Environment__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Environment__Group_7__6__Impl )
            // InternalMyDsl.g:1185:2: rule__Environment__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_7__6__Impl();

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
    // $ANTLR end "rule__Environment__Group_7__6"


    // $ANTLR start "rule__Environment__Group_7__6__Impl"
    // InternalMyDsl.g:1191:1: rule__Environment__Group_7__6__Impl : ( ';' ) ;
    public final void rule__Environment__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ';' ) )
            // InternalMyDsl.g:1196:1: ( ';' )
            {
            // InternalMyDsl.g:1196:1: ( ';' )
            // InternalMyDsl.g:1197:2: ';'
            {
             before(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_7_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getSemicolonKeyword_7_6()); 

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
    // $ANTLR end "rule__Environment__Group_7__6__Impl"


    // $ANTLR start "rule__Environment__Group_7_4__0"
    // InternalMyDsl.g:1207:1: rule__Environment__Group_7_4__0 : rule__Environment__Group_7_4__0__Impl rule__Environment__Group_7_4__1 ;
    public final void rule__Environment__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Environment__Group_7_4__0__Impl rule__Environment__Group_7_4__1 )
            // InternalMyDsl.g:1212:2: rule__Environment__Group_7_4__0__Impl rule__Environment__Group_7_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Environment__Group_7_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_7_4__1();

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
    // $ANTLR end "rule__Environment__Group_7_4__0"


    // $ANTLR start "rule__Environment__Group_7_4__0__Impl"
    // InternalMyDsl.g:1219:1: rule__Environment__Group_7_4__0__Impl : ( ',' ) ;
    public final void rule__Environment__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ',' ) )
            // InternalMyDsl.g:1224:1: ( ',' )
            {
            // InternalMyDsl.g:1224:1: ( ',' )
            // InternalMyDsl.g:1225:2: ','
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_7_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_7_4_0()); 

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
    // $ANTLR end "rule__Environment__Group_7_4__0__Impl"


    // $ANTLR start "rule__Environment__Group_7_4__1"
    // InternalMyDsl.g:1234:1: rule__Environment__Group_7_4__1 : rule__Environment__Group_7_4__1__Impl ;
    public final void rule__Environment__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Environment__Group_7_4__1__Impl )
            // InternalMyDsl.g:1239:2: rule__Environment__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_7_4__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_7_4__1"


    // $ANTLR start "rule__Environment__Group_7_4__1__Impl"
    // InternalMyDsl.g:1245:1: rule__Environment__Group_7_4__1__Impl : ( ( rule__Environment__NodesAssignment_7_4_1 ) ) ;
    public final void rule__Environment__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( ( ( rule__Environment__NodesAssignment_7_4_1 ) ) )
            // InternalMyDsl.g:1250:1: ( ( rule__Environment__NodesAssignment_7_4_1 ) )
            {
            // InternalMyDsl.g:1250:1: ( ( rule__Environment__NodesAssignment_7_4_1 ) )
            // InternalMyDsl.g:1251:2: ( rule__Environment__NodesAssignment_7_4_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getNodesAssignment_7_4_1()); 
            // InternalMyDsl.g:1252:2: ( rule__Environment__NodesAssignment_7_4_1 )
            // InternalMyDsl.g:1252:3: rule__Environment__NodesAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NodesAssignment_7_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNodesAssignment_7_4_1()); 

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
    // $ANTLR end "rule__Environment__Group_7_4__1__Impl"


    // $ANTLR start "rule__ServerNode__Group__0"
    // InternalMyDsl.g:1261:1: rule__ServerNode__Group__0 : rule__ServerNode__Group__0__Impl rule__ServerNode__Group__1 ;
    public final void rule__ServerNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__ServerNode__Group__0__Impl rule__ServerNode__Group__1 )
            // InternalMyDsl.g:1266:2: rule__ServerNode__Group__0__Impl rule__ServerNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ServerNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__1();

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
    // $ANTLR end "rule__ServerNode__Group__0"


    // $ANTLR start "rule__ServerNode__Group__0__Impl"
    // InternalMyDsl.g:1273:1: rule__ServerNode__Group__0__Impl : ( 'node' ) ;
    public final void rule__ServerNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( 'node' ) )
            // InternalMyDsl.g:1278:1: ( 'node' )
            {
            // InternalMyDsl.g:1278:1: ( 'node' )
            // InternalMyDsl.g:1279:2: 'node'
            {
             before(grammarAccess.getServerNodeAccess().getNodeKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNodeKeyword_0()); 

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
    // $ANTLR end "rule__ServerNode__Group__0__Impl"


    // $ANTLR start "rule__ServerNode__Group__1"
    // InternalMyDsl.g:1288:1: rule__ServerNode__Group__1 : rule__ServerNode__Group__1__Impl rule__ServerNode__Group__2 ;
    public final void rule__ServerNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__ServerNode__Group__1__Impl rule__ServerNode__Group__2 )
            // InternalMyDsl.g:1293:2: rule__ServerNode__Group__1__Impl rule__ServerNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServerNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__2();

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
    // $ANTLR end "rule__ServerNode__Group__1"


    // $ANTLR start "rule__ServerNode__Group__1__Impl"
    // InternalMyDsl.g:1300:1: rule__ServerNode__Group__1__Impl : ( ( rule__ServerNode__NameAssignment_1 ) ) ;
    public final void rule__ServerNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( ( rule__ServerNode__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1305:1: ( ( rule__ServerNode__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1305:1: ( ( rule__ServerNode__NameAssignment_1 ) )
            // InternalMyDsl.g:1306:2: ( rule__ServerNode__NameAssignment_1 )
            {
             before(grammarAccess.getServerNodeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1307:2: ( rule__ServerNode__NameAssignment_1 )
            // InternalMyDsl.g:1307:3: rule__ServerNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServerNode__Group__1__Impl"


    // $ANTLR start "rule__ServerNode__Group__2"
    // InternalMyDsl.g:1315:1: rule__ServerNode__Group__2 : rule__ServerNode__Group__2__Impl rule__ServerNode__Group__3 ;
    public final void rule__ServerNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__ServerNode__Group__2__Impl rule__ServerNode__Group__3 )
            // InternalMyDsl.g:1320:2: rule__ServerNode__Group__2__Impl rule__ServerNode__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__3();

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
    // $ANTLR end "rule__ServerNode__Group__2"


    // $ANTLR start "rule__ServerNode__Group__2__Impl"
    // InternalMyDsl.g:1327:1: rule__ServerNode__Group__2__Impl : ( '{' ) ;
    public final void rule__ServerNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( ( '{' ) )
            // InternalMyDsl.g:1332:1: ( '{' )
            {
            // InternalMyDsl.g:1332:1: ( '{' )
            // InternalMyDsl.g:1333:2: '{'
            {
             before(grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServerNode__Group__2__Impl"


    // $ANTLR start "rule__ServerNode__Group__3"
    // InternalMyDsl.g:1342:1: rule__ServerNode__Group__3 : rule__ServerNode__Group__3__Impl rule__ServerNode__Group__4 ;
    public final void rule__ServerNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__ServerNode__Group__3__Impl rule__ServerNode__Group__4 )
            // InternalMyDsl.g:1347:2: rule__ServerNode__Group__3__Impl rule__ServerNode__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__4();

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
    // $ANTLR end "rule__ServerNode__Group__3"


    // $ANTLR start "rule__ServerNode__Group__3__Impl"
    // InternalMyDsl.g:1354:1: rule__ServerNode__Group__3__Impl : ( ( rule__ServerNode__Group_3__0 )? ) ;
    public final void rule__ServerNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( ( rule__ServerNode__Group_3__0 )? ) )
            // InternalMyDsl.g:1359:1: ( ( rule__ServerNode__Group_3__0 )? )
            {
            // InternalMyDsl.g:1359:1: ( ( rule__ServerNode__Group_3__0 )? )
            // InternalMyDsl.g:1360:2: ( rule__ServerNode__Group_3__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_3()); 
            // InternalMyDsl.g:1361:2: ( rule__ServerNode__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1361:3: rule__ServerNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ServerNode__Group__3__Impl"


    // $ANTLR start "rule__ServerNode__Group__4"
    // InternalMyDsl.g:1369:1: rule__ServerNode__Group__4 : rule__ServerNode__Group__4__Impl rule__ServerNode__Group__5 ;
    public final void rule__ServerNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__ServerNode__Group__4__Impl rule__ServerNode__Group__5 )
            // InternalMyDsl.g:1374:2: rule__ServerNode__Group__4__Impl rule__ServerNode__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__5();

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
    // $ANTLR end "rule__ServerNode__Group__4"


    // $ANTLR start "rule__ServerNode__Group__4__Impl"
    // InternalMyDsl.g:1381:1: rule__ServerNode__Group__4__Impl : ( ( rule__ServerNode__Group_4__0 )? ) ;
    public final void rule__ServerNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__ServerNode__Group_4__0 )? ) )
            // InternalMyDsl.g:1386:1: ( ( rule__ServerNode__Group_4__0 )? )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__ServerNode__Group_4__0 )? )
            // InternalMyDsl.g:1387:2: ( rule__ServerNode__Group_4__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_4()); 
            // InternalMyDsl.g:1388:2: ( rule__ServerNode__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1388:3: rule__ServerNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ServerNode__Group__4__Impl"


    // $ANTLR start "rule__ServerNode__Group__5"
    // InternalMyDsl.g:1396:1: rule__ServerNode__Group__5 : rule__ServerNode__Group__5__Impl rule__ServerNode__Group__6 ;
    public final void rule__ServerNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__ServerNode__Group__5__Impl rule__ServerNode__Group__6 )
            // InternalMyDsl.g:1401:2: rule__ServerNode__Group__5__Impl rule__ServerNode__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__6();

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
    // $ANTLR end "rule__ServerNode__Group__5"


    // $ANTLR start "rule__ServerNode__Group__5__Impl"
    // InternalMyDsl.g:1408:1: rule__ServerNode__Group__5__Impl : ( ( rule__ServerNode__Group_5__0 )? ) ;
    public final void rule__ServerNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ( rule__ServerNode__Group_5__0 )? ) )
            // InternalMyDsl.g:1413:1: ( ( rule__ServerNode__Group_5__0 )? )
            {
            // InternalMyDsl.g:1413:1: ( ( rule__ServerNode__Group_5__0 )? )
            // InternalMyDsl.g:1414:2: ( rule__ServerNode__Group_5__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_5()); 
            // InternalMyDsl.g:1415:2: ( rule__ServerNode__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1415:3: rule__ServerNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ServerNode__Group__5__Impl"


    // $ANTLR start "rule__ServerNode__Group__6"
    // InternalMyDsl.g:1423:1: rule__ServerNode__Group__6 : rule__ServerNode__Group__6__Impl rule__ServerNode__Group__7 ;
    public final void rule__ServerNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__ServerNode__Group__6__Impl rule__ServerNode__Group__7 )
            // InternalMyDsl.g:1428:2: rule__ServerNode__Group__6__Impl rule__ServerNode__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__7();

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
    // $ANTLR end "rule__ServerNode__Group__6"


    // $ANTLR start "rule__ServerNode__Group__6__Impl"
    // InternalMyDsl.g:1435:1: rule__ServerNode__Group__6__Impl : ( ( rule__ServerNode__Group_6__0 )? ) ;
    public final void rule__ServerNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ( rule__ServerNode__Group_6__0 )? ) )
            // InternalMyDsl.g:1440:1: ( ( rule__ServerNode__Group_6__0 )? )
            {
            // InternalMyDsl.g:1440:1: ( ( rule__ServerNode__Group_6__0 )? )
            // InternalMyDsl.g:1441:2: ( rule__ServerNode__Group_6__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_6()); 
            // InternalMyDsl.g:1442:2: ( rule__ServerNode__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1442:3: rule__ServerNode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ServerNode__Group__6__Impl"


    // $ANTLR start "rule__ServerNode__Group__7"
    // InternalMyDsl.g:1450:1: rule__ServerNode__Group__7 : rule__ServerNode__Group__7__Impl rule__ServerNode__Group__8 ;
    public final void rule__ServerNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__ServerNode__Group__7__Impl rule__ServerNode__Group__8 )
            // InternalMyDsl.g:1455:2: rule__ServerNode__Group__7__Impl rule__ServerNode__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__8();

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
    // $ANTLR end "rule__ServerNode__Group__7"


    // $ANTLR start "rule__ServerNode__Group__7__Impl"
    // InternalMyDsl.g:1462:1: rule__ServerNode__Group__7__Impl : ( ( rule__ServerNode__Group_7__0 )? ) ;
    public final void rule__ServerNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( ( ( rule__ServerNode__Group_7__0 )? ) )
            // InternalMyDsl.g:1467:1: ( ( rule__ServerNode__Group_7__0 )? )
            {
            // InternalMyDsl.g:1467:1: ( ( rule__ServerNode__Group_7__0 )? )
            // InternalMyDsl.g:1468:2: ( rule__ServerNode__Group_7__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_7()); 
            // InternalMyDsl.g:1469:2: ( rule__ServerNode__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1469:3: rule__ServerNode__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ServerNode__Group__7__Impl"


    // $ANTLR start "rule__ServerNode__Group__8"
    // InternalMyDsl.g:1477:1: rule__ServerNode__Group__8 : rule__ServerNode__Group__8__Impl rule__ServerNode__Group__9 ;
    public final void rule__ServerNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__ServerNode__Group__8__Impl rule__ServerNode__Group__9 )
            // InternalMyDsl.g:1482:2: rule__ServerNode__Group__8__Impl rule__ServerNode__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__ServerNode__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__9();

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
    // $ANTLR end "rule__ServerNode__Group__8"


    // $ANTLR start "rule__ServerNode__Group__8__Impl"
    // InternalMyDsl.g:1489:1: rule__ServerNode__Group__8__Impl : ( ( rule__ServerNode__Group_8__0 )? ) ;
    public final void rule__ServerNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ( rule__ServerNode__Group_8__0 )? ) )
            // InternalMyDsl.g:1494:1: ( ( rule__ServerNode__Group_8__0 )? )
            {
            // InternalMyDsl.g:1494:1: ( ( rule__ServerNode__Group_8__0 )? )
            // InternalMyDsl.g:1495:2: ( rule__ServerNode__Group_8__0 )?
            {
             before(grammarAccess.getServerNodeAccess().getGroup_8()); 
            // InternalMyDsl.g:1496:2: ( rule__ServerNode__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1496:3: rule__ServerNode__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerNode__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerNodeAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ServerNode__Group__8__Impl"


    // $ANTLR start "rule__ServerNode__Group__9"
    // InternalMyDsl.g:1504:1: rule__ServerNode__Group__9 : rule__ServerNode__Group__9__Impl ;
    public final void rule__ServerNode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__ServerNode__Group__9__Impl )
            // InternalMyDsl.g:1509:2: rule__ServerNode__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group__9__Impl();

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
    // $ANTLR end "rule__ServerNode__Group__9"


    // $ANTLR start "rule__ServerNode__Group__9__Impl"
    // InternalMyDsl.g:1515:1: rule__ServerNode__Group__9__Impl : ( '}' ) ;
    public final void rule__ServerNode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( '}' ) )
            // InternalMyDsl.g:1520:1: ( '}' )
            {
            // InternalMyDsl.g:1520:1: ( '}' )
            // InternalMyDsl.g:1521:2: '}'
            {
             before(grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__ServerNode__Group__9__Impl"


    // $ANTLR start "rule__ServerNode__Group_3__0"
    // InternalMyDsl.g:1531:1: rule__ServerNode__Group_3__0 : rule__ServerNode__Group_3__0__Impl rule__ServerNode__Group_3__1 ;
    public final void rule__ServerNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__ServerNode__Group_3__0__Impl rule__ServerNode__Group_3__1 )
            // InternalMyDsl.g:1536:2: rule__ServerNode__Group_3__0__Impl rule__ServerNode__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_3__1();

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
    // $ANTLR end "rule__ServerNode__Group_3__0"


    // $ANTLR start "rule__ServerNode__Group_3__0__Impl"
    // InternalMyDsl.g:1543:1: rule__ServerNode__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__ServerNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( 'id' ) )
            // InternalMyDsl.g:1548:1: ( 'id' )
            {
            // InternalMyDsl.g:1548:1: ( 'id' )
            // InternalMyDsl.g:1549:2: 'id'
            {
             before(grammarAccess.getServerNodeAccess().getIdKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_3__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_3__1"
    // InternalMyDsl.g:1558:1: rule__ServerNode__Group_3__1 : rule__ServerNode__Group_3__1__Impl rule__ServerNode__Group_3__2 ;
    public final void rule__ServerNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__ServerNode__Group_3__1__Impl rule__ServerNode__Group_3__2 )
            // InternalMyDsl.g:1563:2: rule__ServerNode__Group_3__1__Impl rule__ServerNode__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_3__2();

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
    // $ANTLR end "rule__ServerNode__Group_3__1"


    // $ANTLR start "rule__ServerNode__Group_3__1__Impl"
    // InternalMyDsl.g:1570:1: rule__ServerNode__Group_3__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( '=' ) )
            // InternalMyDsl.g:1575:1: ( '=' )
            {
            // InternalMyDsl.g:1575:1: ( '=' )
            // InternalMyDsl.g:1576:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_3__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_3__2"
    // InternalMyDsl.g:1585:1: rule__ServerNode__Group_3__2 : rule__ServerNode__Group_3__2__Impl rule__ServerNode__Group_3__3 ;
    public final void rule__ServerNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__ServerNode__Group_3__2__Impl rule__ServerNode__Group_3__3 )
            // InternalMyDsl.g:1590:2: rule__ServerNode__Group_3__2__Impl rule__ServerNode__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_3__3();

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
    // $ANTLR end "rule__ServerNode__Group_3__2"


    // $ANTLR start "rule__ServerNode__Group_3__2__Impl"
    // InternalMyDsl.g:1597:1: rule__ServerNode__Group_3__2__Impl : ( ( rule__ServerNode__IdAssignment_3_2 ) ) ;
    public final void rule__ServerNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( ( rule__ServerNode__IdAssignment_3_2 ) ) )
            // InternalMyDsl.g:1602:1: ( ( rule__ServerNode__IdAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1602:1: ( ( rule__ServerNode__IdAssignment_3_2 ) )
            // InternalMyDsl.g:1603:2: ( rule__ServerNode__IdAssignment_3_2 )
            {
             before(grammarAccess.getServerNodeAccess().getIdAssignment_3_2()); 
            // InternalMyDsl.g:1604:2: ( rule__ServerNode__IdAssignment_3_2 )
            // InternalMyDsl.g:1604:3: rule__ServerNode__IdAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__IdAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getIdAssignment_3_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_3__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_3__3"
    // InternalMyDsl.g:1612:1: rule__ServerNode__Group_3__3 : rule__ServerNode__Group_3__3__Impl ;
    public final void rule__ServerNode__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__ServerNode__Group_3__3__Impl )
            // InternalMyDsl.g:1617:2: rule__ServerNode__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_3__3__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_3__3"


    // $ANTLR start "rule__ServerNode__Group_3__3__Impl"
    // InternalMyDsl.g:1623:1: rule__ServerNode__Group_3__3__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( ( ';' ) )
            // InternalMyDsl.g:1628:1: ( ';' )
            {
            // InternalMyDsl.g:1628:1: ( ';' )
            // InternalMyDsl.g:1629:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_3__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_4__0"
    // InternalMyDsl.g:1639:1: rule__ServerNode__Group_4__0 : rule__ServerNode__Group_4__0__Impl rule__ServerNode__Group_4__1 ;
    public final void rule__ServerNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__ServerNode__Group_4__0__Impl rule__ServerNode__Group_4__1 )
            // InternalMyDsl.g:1644:2: rule__ServerNode__Group_4__0__Impl rule__ServerNode__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_4__1();

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
    // $ANTLR end "rule__ServerNode__Group_4__0"


    // $ANTLR start "rule__ServerNode__Group_4__0__Impl"
    // InternalMyDsl.g:1651:1: rule__ServerNode__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__ServerNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( ( 'name' ) )
            // InternalMyDsl.g:1656:1: ( 'name' )
            {
            // InternalMyDsl.g:1656:1: ( 'name' )
            // InternalMyDsl.g:1657:2: 'name'
            {
             before(grammarAccess.getServerNodeAccess().getNameKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_4__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_4__1"
    // InternalMyDsl.g:1666:1: rule__ServerNode__Group_4__1 : rule__ServerNode__Group_4__1__Impl rule__ServerNode__Group_4__2 ;
    public final void rule__ServerNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__ServerNode__Group_4__1__Impl rule__ServerNode__Group_4__2 )
            // InternalMyDsl.g:1671:2: rule__ServerNode__Group_4__1__Impl rule__ServerNode__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_4__2();

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
    // $ANTLR end "rule__ServerNode__Group_4__1"


    // $ANTLR start "rule__ServerNode__Group_4__1__Impl"
    // InternalMyDsl.g:1678:1: rule__ServerNode__Group_4__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( '=' ) )
            // InternalMyDsl.g:1683:1: ( '=' )
            {
            // InternalMyDsl.g:1683:1: ( '=' )
            // InternalMyDsl.g:1684:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_4__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_4__2"
    // InternalMyDsl.g:1693:1: rule__ServerNode__Group_4__2 : rule__ServerNode__Group_4__2__Impl rule__ServerNode__Group_4__3 ;
    public final void rule__ServerNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__ServerNode__Group_4__2__Impl rule__ServerNode__Group_4__3 )
            // InternalMyDsl.g:1698:2: rule__ServerNode__Group_4__2__Impl rule__ServerNode__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_4__3();

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
    // $ANTLR end "rule__ServerNode__Group_4__2"


    // $ANTLR start "rule__ServerNode__Group_4__2__Impl"
    // InternalMyDsl.g:1705:1: rule__ServerNode__Group_4__2__Impl : ( ( rule__ServerNode__NameAssignment_4_2 ) ) ;
    public final void rule__ServerNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( ( ( rule__ServerNode__NameAssignment_4_2 ) ) )
            // InternalMyDsl.g:1710:1: ( ( rule__ServerNode__NameAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1710:1: ( ( rule__ServerNode__NameAssignment_4_2 ) )
            // InternalMyDsl.g:1711:2: ( rule__ServerNode__NameAssignment_4_2 )
            {
             before(grammarAccess.getServerNodeAccess().getNameAssignment_4_2()); 
            // InternalMyDsl.g:1712:2: ( rule__ServerNode__NameAssignment_4_2 )
            // InternalMyDsl.g:1712:3: rule__ServerNode__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getNameAssignment_4_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_4__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_4__3"
    // InternalMyDsl.g:1720:1: rule__ServerNode__Group_4__3 : rule__ServerNode__Group_4__3__Impl ;
    public final void rule__ServerNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__ServerNode__Group_4__3__Impl )
            // InternalMyDsl.g:1725:2: rule__ServerNode__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_4__3__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_4__3"


    // $ANTLR start "rule__ServerNode__Group_4__3__Impl"
    // InternalMyDsl.g:1731:1: rule__ServerNode__Group_4__3__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( ( ';' ) )
            // InternalMyDsl.g:1736:1: ( ';' )
            {
            // InternalMyDsl.g:1736:1: ( ';' )
            // InternalMyDsl.g:1737:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_4_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_4_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_4__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_5__0"
    // InternalMyDsl.g:1747:1: rule__ServerNode__Group_5__0 : rule__ServerNode__Group_5__0__Impl rule__ServerNode__Group_5__1 ;
    public final void rule__ServerNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__ServerNode__Group_5__0__Impl rule__ServerNode__Group_5__1 )
            // InternalMyDsl.g:1752:2: rule__ServerNode__Group_5__0__Impl rule__ServerNode__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_5__1();

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
    // $ANTLR end "rule__ServerNode__Group_5__0"


    // $ANTLR start "rule__ServerNode__Group_5__0__Impl"
    // InternalMyDsl.g:1759:1: rule__ServerNode__Group_5__0__Impl : ( 'RAM' ) ;
    public final void rule__ServerNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( 'RAM' ) )
            // InternalMyDsl.g:1764:1: ( 'RAM' )
            {
            // InternalMyDsl.g:1764:1: ( 'RAM' )
            // InternalMyDsl.g:1765:2: 'RAM'
            {
             before(grammarAccess.getServerNodeAccess().getRAMKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getRAMKeyword_5_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_5__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_5__1"
    // InternalMyDsl.g:1774:1: rule__ServerNode__Group_5__1 : rule__ServerNode__Group_5__1__Impl rule__ServerNode__Group_5__2 ;
    public final void rule__ServerNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__ServerNode__Group_5__1__Impl rule__ServerNode__Group_5__2 )
            // InternalMyDsl.g:1779:2: rule__ServerNode__Group_5__1__Impl rule__ServerNode__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_5__2();

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
    // $ANTLR end "rule__ServerNode__Group_5__1"


    // $ANTLR start "rule__ServerNode__Group_5__1__Impl"
    // InternalMyDsl.g:1786:1: rule__ServerNode__Group_5__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( '=' ) )
            // InternalMyDsl.g:1791:1: ( '=' )
            {
            // InternalMyDsl.g:1791:1: ( '=' )
            // InternalMyDsl.g:1792:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_5__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_5__2"
    // InternalMyDsl.g:1801:1: rule__ServerNode__Group_5__2 : rule__ServerNode__Group_5__2__Impl rule__ServerNode__Group_5__3 ;
    public final void rule__ServerNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__ServerNode__Group_5__2__Impl rule__ServerNode__Group_5__3 )
            // InternalMyDsl.g:1806:2: rule__ServerNode__Group_5__2__Impl rule__ServerNode__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_5__3();

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
    // $ANTLR end "rule__ServerNode__Group_5__2"


    // $ANTLR start "rule__ServerNode__Group_5__2__Impl"
    // InternalMyDsl.g:1813:1: rule__ServerNode__Group_5__2__Impl : ( ( rule__ServerNode__NameAssignment_5_2 ) ) ;
    public final void rule__ServerNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( ( rule__ServerNode__NameAssignment_5_2 ) ) )
            // InternalMyDsl.g:1818:1: ( ( rule__ServerNode__NameAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1818:1: ( ( rule__ServerNode__NameAssignment_5_2 ) )
            // InternalMyDsl.g:1819:2: ( rule__ServerNode__NameAssignment_5_2 )
            {
             before(grammarAccess.getServerNodeAccess().getNameAssignment_5_2()); 
            // InternalMyDsl.g:1820:2: ( rule__ServerNode__NameAssignment_5_2 )
            // InternalMyDsl.g:1820:3: rule__ServerNode__NameAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__NameAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getNameAssignment_5_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_5__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_5__3"
    // InternalMyDsl.g:1828:1: rule__ServerNode__Group_5__3 : rule__ServerNode__Group_5__3__Impl ;
    public final void rule__ServerNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__ServerNode__Group_5__3__Impl )
            // InternalMyDsl.g:1833:2: rule__ServerNode__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_5__3__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_5__3"


    // $ANTLR start "rule__ServerNode__Group_5__3__Impl"
    // InternalMyDsl.g:1839:1: rule__ServerNode__Group_5__3__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( ';' ) )
            // InternalMyDsl.g:1844:1: ( ';' )
            {
            // InternalMyDsl.g:1844:1: ( ';' )
            // InternalMyDsl.g:1845:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_5__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_6__0"
    // InternalMyDsl.g:1855:1: rule__ServerNode__Group_6__0 : rule__ServerNode__Group_6__0__Impl rule__ServerNode__Group_6__1 ;
    public final void rule__ServerNode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__ServerNode__Group_6__0__Impl rule__ServerNode__Group_6__1 )
            // InternalMyDsl.g:1860:2: rule__ServerNode__Group_6__0__Impl rule__ServerNode__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_6__1();

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
    // $ANTLR end "rule__ServerNode__Group_6__0"


    // $ANTLR start "rule__ServerNode__Group_6__0__Impl"
    // InternalMyDsl.g:1867:1: rule__ServerNode__Group_6__0__Impl : ( 'Processor' ) ;
    public final void rule__ServerNode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( 'Processor' ) )
            // InternalMyDsl.g:1872:1: ( 'Processor' )
            {
            // InternalMyDsl.g:1872:1: ( 'Processor' )
            // InternalMyDsl.g:1873:2: 'Processor'
            {
             before(grammarAccess.getServerNodeAccess().getProcessorKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getProcessorKeyword_6_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_6__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_6__1"
    // InternalMyDsl.g:1882:1: rule__ServerNode__Group_6__1 : rule__ServerNode__Group_6__1__Impl rule__ServerNode__Group_6__2 ;
    public final void rule__ServerNode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__ServerNode__Group_6__1__Impl rule__ServerNode__Group_6__2 )
            // InternalMyDsl.g:1887:2: rule__ServerNode__Group_6__1__Impl rule__ServerNode__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerNode__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_6__2();

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
    // $ANTLR end "rule__ServerNode__Group_6__1"


    // $ANTLR start "rule__ServerNode__Group_6__1__Impl"
    // InternalMyDsl.g:1894:1: rule__ServerNode__Group_6__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( '=' ) )
            // InternalMyDsl.g:1899:1: ( '=' )
            {
            // InternalMyDsl.g:1899:1: ( '=' )
            // InternalMyDsl.g:1900:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_6__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_6__2"
    // InternalMyDsl.g:1909:1: rule__ServerNode__Group_6__2 : rule__ServerNode__Group_6__2__Impl rule__ServerNode__Group_6__3 ;
    public final void rule__ServerNode__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__ServerNode__Group_6__2__Impl rule__ServerNode__Group_6__3 )
            // InternalMyDsl.g:1914:2: rule__ServerNode__Group_6__2__Impl rule__ServerNode__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_6__3();

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
    // $ANTLR end "rule__ServerNode__Group_6__2"


    // $ANTLR start "rule__ServerNode__Group_6__2__Impl"
    // InternalMyDsl.g:1921:1: rule__ServerNode__Group_6__2__Impl : ( ( rule__ServerNode__NameAssignment_6_2 ) ) ;
    public final void rule__ServerNode__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( ( rule__ServerNode__NameAssignment_6_2 ) ) )
            // InternalMyDsl.g:1926:1: ( ( rule__ServerNode__NameAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1926:1: ( ( rule__ServerNode__NameAssignment_6_2 ) )
            // InternalMyDsl.g:1927:2: ( rule__ServerNode__NameAssignment_6_2 )
            {
             before(grammarAccess.getServerNodeAccess().getNameAssignment_6_2()); 
            // InternalMyDsl.g:1928:2: ( rule__ServerNode__NameAssignment_6_2 )
            // InternalMyDsl.g:1928:3: rule__ServerNode__NameAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__NameAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getNameAssignment_6_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_6__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_6__3"
    // InternalMyDsl.g:1936:1: rule__ServerNode__Group_6__3 : rule__ServerNode__Group_6__3__Impl ;
    public final void rule__ServerNode__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__ServerNode__Group_6__3__Impl )
            // InternalMyDsl.g:1941:2: rule__ServerNode__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_6__3__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_6__3"


    // $ANTLR start "rule__ServerNode__Group_6__3__Impl"
    // InternalMyDsl.g:1947:1: rule__ServerNode__Group_6__3__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( ';' ) )
            // InternalMyDsl.g:1952:1: ( ';' )
            {
            // InternalMyDsl.g:1952:1: ( ';' )
            // InternalMyDsl.g:1953:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_6_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_6_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_6__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_7__0"
    // InternalMyDsl.g:1963:1: rule__ServerNode__Group_7__0 : rule__ServerNode__Group_7__0__Impl rule__ServerNode__Group_7__1 ;
    public final void rule__ServerNode__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__ServerNode__Group_7__0__Impl rule__ServerNode__Group_7__1 )
            // InternalMyDsl.g:1968:2: rule__ServerNode__Group_7__0__Impl rule__ServerNode__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_7__1();

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
    // $ANTLR end "rule__ServerNode__Group_7__0"


    // $ANTLR start "rule__ServerNode__Group_7__0__Impl"
    // InternalMyDsl.g:1975:1: rule__ServerNode__Group_7__0__Impl : ( 'Disk' ) ;
    public final void rule__ServerNode__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( 'Disk' ) )
            // InternalMyDsl.g:1980:1: ( 'Disk' )
            {
            // InternalMyDsl.g:1980:1: ( 'Disk' )
            // InternalMyDsl.g:1981:2: 'Disk'
            {
             before(grammarAccess.getServerNodeAccess().getDiskKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getDiskKeyword_7_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_7__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_7__1"
    // InternalMyDsl.g:1990:1: rule__ServerNode__Group_7__1 : rule__ServerNode__Group_7__1__Impl rule__ServerNode__Group_7__2 ;
    public final void rule__ServerNode__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__ServerNode__Group_7__1__Impl rule__ServerNode__Group_7__2 )
            // InternalMyDsl.g:1995:2: rule__ServerNode__Group_7__1__Impl rule__ServerNode__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__ServerNode__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_7__2();

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
    // $ANTLR end "rule__ServerNode__Group_7__1"


    // $ANTLR start "rule__ServerNode__Group_7__1__Impl"
    // InternalMyDsl.g:2002:1: rule__ServerNode__Group_7__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( '=' ) )
            // InternalMyDsl.g:2007:1: ( '=' )
            {
            // InternalMyDsl.g:2007:1: ( '=' )
            // InternalMyDsl.g:2008:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_7__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_7__2"
    // InternalMyDsl.g:2017:1: rule__ServerNode__Group_7__2 : rule__ServerNode__Group_7__2__Impl rule__ServerNode__Group_7__3 ;
    public final void rule__ServerNode__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__ServerNode__Group_7__2__Impl rule__ServerNode__Group_7__3 )
            // InternalMyDsl.g:2022:2: rule__ServerNode__Group_7__2__Impl rule__ServerNode__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_7__3();

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
    // $ANTLR end "rule__ServerNode__Group_7__2"


    // $ANTLR start "rule__ServerNode__Group_7__2__Impl"
    // InternalMyDsl.g:2029:1: rule__ServerNode__Group_7__2__Impl : ( ( rule__ServerNode__NameAssignment_7_2 ) ) ;
    public final void rule__ServerNode__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( ( rule__ServerNode__NameAssignment_7_2 ) ) )
            // InternalMyDsl.g:2034:1: ( ( rule__ServerNode__NameAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2034:1: ( ( rule__ServerNode__NameAssignment_7_2 ) )
            // InternalMyDsl.g:2035:2: ( rule__ServerNode__NameAssignment_7_2 )
            {
             before(grammarAccess.getServerNodeAccess().getNameAssignment_7_2()); 
            // InternalMyDsl.g:2036:2: ( rule__ServerNode__NameAssignment_7_2 )
            // InternalMyDsl.g:2036:3: rule__ServerNode__NameAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__NameAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getNameAssignment_7_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_7__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_7__3"
    // InternalMyDsl.g:2044:1: rule__ServerNode__Group_7__3 : rule__ServerNode__Group_7__3__Impl ;
    public final void rule__ServerNode__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__ServerNode__Group_7__3__Impl )
            // InternalMyDsl.g:2049:2: rule__ServerNode__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_7__3__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_7__3"


    // $ANTLR start "rule__ServerNode__Group_7__3__Impl"
    // InternalMyDsl.g:2055:1: rule__ServerNode__Group_7__3__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( ( ';' ) )
            // InternalMyDsl.g:2060:1: ( ';' )
            {
            // InternalMyDsl.g:2060:1: ( ';' )
            // InternalMyDsl.g:2061:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_7_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_7_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_7__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__0"
    // InternalMyDsl.g:2071:1: rule__ServerNode__Group_8__0 : rule__ServerNode__Group_8__0__Impl rule__ServerNode__Group_8__1 ;
    public final void rule__ServerNode__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__ServerNode__Group_8__0__Impl rule__ServerNode__Group_8__1 )
            // InternalMyDsl.g:2076:2: rule__ServerNode__Group_8__0__Impl rule__ServerNode__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerNode__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__1();

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
    // $ANTLR end "rule__ServerNode__Group_8__0"


    // $ANTLR start "rule__ServerNode__Group_8__0__Impl"
    // InternalMyDsl.g:2083:1: rule__ServerNode__Group_8__0__Impl : ( 'virtualMachines' ) ;
    public final void rule__ServerNode__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( 'virtualMachines' ) )
            // InternalMyDsl.g:2088:1: ( 'virtualMachines' )
            {
            // InternalMyDsl.g:2088:1: ( 'virtualMachines' )
            // InternalMyDsl.g:2089:2: 'virtualMachines'
            {
             before(grammarAccess.getServerNodeAccess().getVirtualMachinesKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getVirtualMachinesKeyword_8_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__1"
    // InternalMyDsl.g:2098:1: rule__ServerNode__Group_8__1 : rule__ServerNode__Group_8__1__Impl rule__ServerNode__Group_8__2 ;
    public final void rule__ServerNode__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__ServerNode__Group_8__1__Impl rule__ServerNode__Group_8__2 )
            // InternalMyDsl.g:2103:2: rule__ServerNode__Group_8__1__Impl rule__ServerNode__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__ServerNode__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__2();

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
    // $ANTLR end "rule__ServerNode__Group_8__1"


    // $ANTLR start "rule__ServerNode__Group_8__1__Impl"
    // InternalMyDsl.g:2110:1: rule__ServerNode__Group_8__1__Impl : ( '=' ) ;
    public final void rule__ServerNode__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( '=' ) )
            // InternalMyDsl.g:2115:1: ( '=' )
            {
            // InternalMyDsl.g:2115:1: ( '=' )
            // InternalMyDsl.g:2116:2: '='
            {
             before(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_8_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__1__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__2"
    // InternalMyDsl.g:2125:1: rule__ServerNode__Group_8__2 : rule__ServerNode__Group_8__2__Impl rule__ServerNode__Group_8__3 ;
    public final void rule__ServerNode__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__ServerNode__Group_8__2__Impl rule__ServerNode__Group_8__3 )
            // InternalMyDsl.g:2130:2: rule__ServerNode__Group_8__2__Impl rule__ServerNode__Group_8__3
            {
            pushFollow(FOLLOW_14);
            rule__ServerNode__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__3();

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
    // $ANTLR end "rule__ServerNode__Group_8__2"


    // $ANTLR start "rule__ServerNode__Group_8__2__Impl"
    // InternalMyDsl.g:2137:1: rule__ServerNode__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ServerNode__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( '{' ) )
            // InternalMyDsl.g:2142:1: ( '{' )
            {
            // InternalMyDsl.g:2142:1: ( '{' )
            // InternalMyDsl.g:2143:2: '{'
            {
             before(grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getLeftCurlyBracketKeyword_8_2()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__2__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__3"
    // InternalMyDsl.g:2152:1: rule__ServerNode__Group_8__3 : rule__ServerNode__Group_8__3__Impl rule__ServerNode__Group_8__4 ;
    public final void rule__ServerNode__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__ServerNode__Group_8__3__Impl rule__ServerNode__Group_8__4 )
            // InternalMyDsl.g:2157:2: rule__ServerNode__Group_8__3__Impl rule__ServerNode__Group_8__4
            {
            pushFollow(FOLLOW_11);
            rule__ServerNode__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__4();

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
    // $ANTLR end "rule__ServerNode__Group_8__3"


    // $ANTLR start "rule__ServerNode__Group_8__3__Impl"
    // InternalMyDsl.g:2164:1: rule__ServerNode__Group_8__3__Impl : ( ( rule__ServerNode__VmsAssignment_8_3 ) ) ;
    public final void rule__ServerNode__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ( rule__ServerNode__VmsAssignment_8_3 ) ) )
            // InternalMyDsl.g:2169:1: ( ( rule__ServerNode__VmsAssignment_8_3 ) )
            {
            // InternalMyDsl.g:2169:1: ( ( rule__ServerNode__VmsAssignment_8_3 ) )
            // InternalMyDsl.g:2170:2: ( rule__ServerNode__VmsAssignment_8_3 )
            {
             before(grammarAccess.getServerNodeAccess().getVmsAssignment_8_3()); 
            // InternalMyDsl.g:2171:2: ( rule__ServerNode__VmsAssignment_8_3 )
            // InternalMyDsl.g:2171:3: rule__ServerNode__VmsAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__VmsAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getVmsAssignment_8_3()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__3__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__4"
    // InternalMyDsl.g:2179:1: rule__ServerNode__Group_8__4 : rule__ServerNode__Group_8__4__Impl rule__ServerNode__Group_8__5 ;
    public final void rule__ServerNode__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__ServerNode__Group_8__4__Impl rule__ServerNode__Group_8__5 )
            // InternalMyDsl.g:2184:2: rule__ServerNode__Group_8__4__Impl rule__ServerNode__Group_8__5
            {
            pushFollow(FOLLOW_11);
            rule__ServerNode__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__5();

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
    // $ANTLR end "rule__ServerNode__Group_8__4"


    // $ANTLR start "rule__ServerNode__Group_8__4__Impl"
    // InternalMyDsl.g:2191:1: rule__ServerNode__Group_8__4__Impl : ( ( rule__ServerNode__Group_8_4__0 )* ) ;
    public final void rule__ServerNode__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( ( rule__ServerNode__Group_8_4__0 )* ) )
            // InternalMyDsl.g:2196:1: ( ( rule__ServerNode__Group_8_4__0 )* )
            {
            // InternalMyDsl.g:2196:1: ( ( rule__ServerNode__Group_8_4__0 )* )
            // InternalMyDsl.g:2197:2: ( rule__ServerNode__Group_8_4__0 )*
            {
             before(grammarAccess.getServerNodeAccess().getGroup_8_4()); 
            // InternalMyDsl.g:2198:2: ( rule__ServerNode__Group_8_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2198:3: rule__ServerNode__Group_8_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ServerNode__Group_8_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServerNodeAccess().getGroup_8_4()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__4__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__5"
    // InternalMyDsl.g:2206:1: rule__ServerNode__Group_8__5 : rule__ServerNode__Group_8__5__Impl rule__ServerNode__Group_8__6 ;
    public final void rule__ServerNode__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__ServerNode__Group_8__5__Impl rule__ServerNode__Group_8__6 )
            // InternalMyDsl.g:2211:2: rule__ServerNode__Group_8__5__Impl rule__ServerNode__Group_8__6
            {
            pushFollow(FOLLOW_8);
            rule__ServerNode__Group_8__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__6();

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
    // $ANTLR end "rule__ServerNode__Group_8__5"


    // $ANTLR start "rule__ServerNode__Group_8__5__Impl"
    // InternalMyDsl.g:2218:1: rule__ServerNode__Group_8__5__Impl : ( '}' ) ;
    public final void rule__ServerNode__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( '}' ) )
            // InternalMyDsl.g:2223:1: ( '}' )
            {
            // InternalMyDsl.g:2223:1: ( '}' )
            // InternalMyDsl.g:2224:2: '}'
            {
             before(grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_8_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getRightCurlyBracketKeyword_8_5()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__5__Impl"


    // $ANTLR start "rule__ServerNode__Group_8__6"
    // InternalMyDsl.g:2233:1: rule__ServerNode__Group_8__6 : rule__ServerNode__Group_8__6__Impl ;
    public final void rule__ServerNode__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__ServerNode__Group_8__6__Impl )
            // InternalMyDsl.g:2238:2: rule__ServerNode__Group_8__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8__6__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_8__6"


    // $ANTLR start "rule__ServerNode__Group_8__6__Impl"
    // InternalMyDsl.g:2244:1: rule__ServerNode__Group_8__6__Impl : ( ';' ) ;
    public final void rule__ServerNode__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ';' ) )
            // InternalMyDsl.g:2249:1: ( ';' )
            {
            // InternalMyDsl.g:2249:1: ( ';' )
            // InternalMyDsl.g:2250:2: ';'
            {
             before(grammarAccess.getServerNodeAccess().getSemicolonKeyword_8_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getSemicolonKeyword_8_6()); 

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
    // $ANTLR end "rule__ServerNode__Group_8__6__Impl"


    // $ANTLR start "rule__ServerNode__Group_8_4__0"
    // InternalMyDsl.g:2260:1: rule__ServerNode__Group_8_4__0 : rule__ServerNode__Group_8_4__0__Impl rule__ServerNode__Group_8_4__1 ;
    public final void rule__ServerNode__Group_8_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__ServerNode__Group_8_4__0__Impl rule__ServerNode__Group_8_4__1 )
            // InternalMyDsl.g:2265:2: rule__ServerNode__Group_8_4__0__Impl rule__ServerNode__Group_8_4__1
            {
            pushFollow(FOLLOW_14);
            rule__ServerNode__Group_8_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8_4__1();

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
    // $ANTLR end "rule__ServerNode__Group_8_4__0"


    // $ANTLR start "rule__ServerNode__Group_8_4__0__Impl"
    // InternalMyDsl.g:2272:1: rule__ServerNode__Group_8_4__0__Impl : ( ',' ) ;
    public final void rule__ServerNode__Group_8_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( ',' ) )
            // InternalMyDsl.g:2277:1: ( ',' )
            {
            // InternalMyDsl.g:2277:1: ( ',' )
            // InternalMyDsl.g:2278:2: ','
            {
             before(grammarAccess.getServerNodeAccess().getCommaKeyword_8_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getCommaKeyword_8_4_0()); 

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
    // $ANTLR end "rule__ServerNode__Group_8_4__0__Impl"


    // $ANTLR start "rule__ServerNode__Group_8_4__1"
    // InternalMyDsl.g:2287:1: rule__ServerNode__Group_8_4__1 : rule__ServerNode__Group_8_4__1__Impl ;
    public final void rule__ServerNode__Group_8_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__ServerNode__Group_8_4__1__Impl )
            // InternalMyDsl.g:2292:2: rule__ServerNode__Group_8_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__Group_8_4__1__Impl();

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
    // $ANTLR end "rule__ServerNode__Group_8_4__1"


    // $ANTLR start "rule__ServerNode__Group_8_4__1__Impl"
    // InternalMyDsl.g:2298:1: rule__ServerNode__Group_8_4__1__Impl : ( ( rule__ServerNode__VmsAssignment_8_4_1 ) ) ;
    public final void rule__ServerNode__Group_8_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( ( rule__ServerNode__VmsAssignment_8_4_1 ) ) )
            // InternalMyDsl.g:2303:1: ( ( rule__ServerNode__VmsAssignment_8_4_1 ) )
            {
            // InternalMyDsl.g:2303:1: ( ( rule__ServerNode__VmsAssignment_8_4_1 ) )
            // InternalMyDsl.g:2304:2: ( rule__ServerNode__VmsAssignment_8_4_1 )
            {
             before(grammarAccess.getServerNodeAccess().getVmsAssignment_8_4_1()); 
            // InternalMyDsl.g:2305:2: ( rule__ServerNode__VmsAssignment_8_4_1 )
            // InternalMyDsl.g:2305:3: rule__ServerNode__VmsAssignment_8_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerNode__VmsAssignment_8_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServerNodeAccess().getVmsAssignment_8_4_1()); 

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
    // $ANTLR end "rule__ServerNode__Group_8_4__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__0"
    // InternalMyDsl.g:2314:1: rule__VirtualMachine__Group__0 : rule__VirtualMachine__Group__0__Impl rule__VirtualMachine__Group__1 ;
    public final void rule__VirtualMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__VirtualMachine__Group__0__Impl rule__VirtualMachine__Group__1 )
            // InternalMyDsl.g:2319:2: rule__VirtualMachine__Group__0__Impl rule__VirtualMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VirtualMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__1();

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
    // $ANTLR end "rule__VirtualMachine__Group__0"


    // $ANTLR start "rule__VirtualMachine__Group__0__Impl"
    // InternalMyDsl.g:2326:1: rule__VirtualMachine__Group__0__Impl : ( 'vm' ) ;
    public final void rule__VirtualMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( 'vm' ) )
            // InternalMyDsl.g:2331:1: ( 'vm' )
            {
            // InternalMyDsl.g:2331:1: ( 'vm' )
            // InternalMyDsl.g:2332:2: 'vm'
            {
             before(grammarAccess.getVirtualMachineAccess().getVmKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getVmKeyword_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__1"
    // InternalMyDsl.g:2341:1: rule__VirtualMachine__Group__1 : rule__VirtualMachine__Group__1__Impl rule__VirtualMachine__Group__2 ;
    public final void rule__VirtualMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__VirtualMachine__Group__1__Impl rule__VirtualMachine__Group__2 )
            // InternalMyDsl.g:2346:2: rule__VirtualMachine__Group__1__Impl rule__VirtualMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VirtualMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__2();

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
    // $ANTLR end "rule__VirtualMachine__Group__1"


    // $ANTLR start "rule__VirtualMachine__Group__1__Impl"
    // InternalMyDsl.g:2353:1: rule__VirtualMachine__Group__1__Impl : ( ( rule__VirtualMachine__NameAssignment_1 ) ) ;
    public final void rule__VirtualMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( ( rule__VirtualMachine__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2358:1: ( ( rule__VirtualMachine__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2358:1: ( ( rule__VirtualMachine__NameAssignment_1 ) )
            // InternalMyDsl.g:2359:2: ( rule__VirtualMachine__NameAssignment_1 )
            {
             before(grammarAccess.getVirtualMachineAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2360:2: ( rule__VirtualMachine__NameAssignment_1 )
            // InternalMyDsl.g:2360:3: rule__VirtualMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__2"
    // InternalMyDsl.g:2368:1: rule__VirtualMachine__Group__2 : rule__VirtualMachine__Group__2__Impl rule__VirtualMachine__Group__3 ;
    public final void rule__VirtualMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__VirtualMachine__Group__2__Impl rule__VirtualMachine__Group__3 )
            // InternalMyDsl.g:2373:2: rule__VirtualMachine__Group__2__Impl rule__VirtualMachine__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VirtualMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__3();

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
    // $ANTLR end "rule__VirtualMachine__Group__2"


    // $ANTLR start "rule__VirtualMachine__Group__2__Impl"
    // InternalMyDsl.g:2380:1: rule__VirtualMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__VirtualMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( '{' ) )
            // InternalMyDsl.g:2385:1: ( '{' )
            {
            // InternalMyDsl.g:2385:1: ( '{' )
            // InternalMyDsl.g:2386:2: '{'
            {
             before(grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__2__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__3"
    // InternalMyDsl.g:2395:1: rule__VirtualMachine__Group__3 : rule__VirtualMachine__Group__3__Impl rule__VirtualMachine__Group__4 ;
    public final void rule__VirtualMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__VirtualMachine__Group__3__Impl rule__VirtualMachine__Group__4 )
            // InternalMyDsl.g:2400:2: rule__VirtualMachine__Group__3__Impl rule__VirtualMachine__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__VirtualMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__4();

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
    // $ANTLR end "rule__VirtualMachine__Group__3"


    // $ANTLR start "rule__VirtualMachine__Group__3__Impl"
    // InternalMyDsl.g:2407:1: rule__VirtualMachine__Group__3__Impl : ( ( rule__VirtualMachine__Group_3__0 )? ) ;
    public final void rule__VirtualMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__VirtualMachine__Group_3__0 )? ) )
            // InternalMyDsl.g:2412:1: ( ( rule__VirtualMachine__Group_3__0 )? )
            {
            // InternalMyDsl.g:2412:1: ( ( rule__VirtualMachine__Group_3__0 )? )
            // InternalMyDsl.g:2413:2: ( rule__VirtualMachine__Group_3__0 )?
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup_3()); 
            // InternalMyDsl.g:2414:2: ( rule__VirtualMachine__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2414:3: rule__VirtualMachine__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VirtualMachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVirtualMachineAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__3__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__4"
    // InternalMyDsl.g:2422:1: rule__VirtualMachine__Group__4 : rule__VirtualMachine__Group__4__Impl rule__VirtualMachine__Group__5 ;
    public final void rule__VirtualMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__VirtualMachine__Group__4__Impl rule__VirtualMachine__Group__5 )
            // InternalMyDsl.g:2427:2: rule__VirtualMachine__Group__4__Impl rule__VirtualMachine__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__VirtualMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__5();

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
    // $ANTLR end "rule__VirtualMachine__Group__4"


    // $ANTLR start "rule__VirtualMachine__Group__4__Impl"
    // InternalMyDsl.g:2434:1: rule__VirtualMachine__Group__4__Impl : ( ( rule__VirtualMachine__Group_4__0 )? ) ;
    public final void rule__VirtualMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( ( rule__VirtualMachine__Group_4__0 )? ) )
            // InternalMyDsl.g:2439:1: ( ( rule__VirtualMachine__Group_4__0 )? )
            {
            // InternalMyDsl.g:2439:1: ( ( rule__VirtualMachine__Group_4__0 )? )
            // InternalMyDsl.g:2440:2: ( rule__VirtualMachine__Group_4__0 )?
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup_4()); 
            // InternalMyDsl.g:2441:2: ( rule__VirtualMachine__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2441:3: rule__VirtualMachine__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VirtualMachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVirtualMachineAccess().getGroup_4()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__4__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__5"
    // InternalMyDsl.g:2449:1: rule__VirtualMachine__Group__5 : rule__VirtualMachine__Group__5__Impl rule__VirtualMachine__Group__6 ;
    public final void rule__VirtualMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__VirtualMachine__Group__5__Impl rule__VirtualMachine__Group__6 )
            // InternalMyDsl.g:2454:2: rule__VirtualMachine__Group__5__Impl rule__VirtualMachine__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__VirtualMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__6();

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
    // $ANTLR end "rule__VirtualMachine__Group__5"


    // $ANTLR start "rule__VirtualMachine__Group__5__Impl"
    // InternalMyDsl.g:2461:1: rule__VirtualMachine__Group__5__Impl : ( ( rule__VirtualMachine__Group_5__0 )? ) ;
    public final void rule__VirtualMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( ( rule__VirtualMachine__Group_5__0 )? ) )
            // InternalMyDsl.g:2466:1: ( ( rule__VirtualMachine__Group_5__0 )? )
            {
            // InternalMyDsl.g:2466:1: ( ( rule__VirtualMachine__Group_5__0 )? )
            // InternalMyDsl.g:2467:2: ( rule__VirtualMachine__Group_5__0 )?
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup_5()); 
            // InternalMyDsl.g:2468:2: ( rule__VirtualMachine__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2468:3: rule__VirtualMachine__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VirtualMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVirtualMachineAccess().getGroup_5()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__5__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__6"
    // InternalMyDsl.g:2476:1: rule__VirtualMachine__Group__6 : rule__VirtualMachine__Group__6__Impl rule__VirtualMachine__Group__7 ;
    public final void rule__VirtualMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__VirtualMachine__Group__6__Impl rule__VirtualMachine__Group__7 )
            // InternalMyDsl.g:2481:2: rule__VirtualMachine__Group__6__Impl rule__VirtualMachine__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__VirtualMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__7();

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
    // $ANTLR end "rule__VirtualMachine__Group__6"


    // $ANTLR start "rule__VirtualMachine__Group__6__Impl"
    // InternalMyDsl.g:2488:1: rule__VirtualMachine__Group__6__Impl : ( ( rule__VirtualMachine__Group_6__0 )? ) ;
    public final void rule__VirtualMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( ( rule__VirtualMachine__Group_6__0 )? ) )
            // InternalMyDsl.g:2493:1: ( ( rule__VirtualMachine__Group_6__0 )? )
            {
            // InternalMyDsl.g:2493:1: ( ( rule__VirtualMachine__Group_6__0 )? )
            // InternalMyDsl.g:2494:2: ( rule__VirtualMachine__Group_6__0 )?
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup_6()); 
            // InternalMyDsl.g:2495:2: ( rule__VirtualMachine__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2495:3: rule__VirtualMachine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VirtualMachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVirtualMachineAccess().getGroup_6()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__6__Impl"


    // $ANTLR start "rule__VirtualMachine__Group__7"
    // InternalMyDsl.g:2503:1: rule__VirtualMachine__Group__7 : rule__VirtualMachine__Group__7__Impl ;
    public final void rule__VirtualMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__VirtualMachine__Group__7__Impl )
            // InternalMyDsl.g:2508:2: rule__VirtualMachine__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group__7__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group__7"


    // $ANTLR start "rule__VirtualMachine__Group__7__Impl"
    // InternalMyDsl.g:2514:1: rule__VirtualMachine__Group__7__Impl : ( '}' ) ;
    public final void rule__VirtualMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( ( '}' ) )
            // InternalMyDsl.g:2519:1: ( '}' )
            {
            // InternalMyDsl.g:2519:1: ( '}' )
            // InternalMyDsl.g:2520:2: '}'
            {
             before(grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__VirtualMachine__Group__7__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_3__0"
    // InternalMyDsl.g:2530:1: rule__VirtualMachine__Group_3__0 : rule__VirtualMachine__Group_3__0__Impl rule__VirtualMachine__Group_3__1 ;
    public final void rule__VirtualMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__VirtualMachine__Group_3__0__Impl rule__VirtualMachine__Group_3__1 )
            // InternalMyDsl.g:2535:2: rule__VirtualMachine__Group_3__0__Impl rule__VirtualMachine__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__VirtualMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_3__1();

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
    // $ANTLR end "rule__VirtualMachine__Group_3__0"


    // $ANTLR start "rule__VirtualMachine__Group_3__0__Impl"
    // InternalMyDsl.g:2542:1: rule__VirtualMachine__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__VirtualMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( 'id' ) )
            // InternalMyDsl.g:2547:1: ( 'id' )
            {
            // InternalMyDsl.g:2547:1: ( 'id' )
            // InternalMyDsl.g:2548:2: 'id'
            {
             before(grammarAccess.getVirtualMachineAccess().getIdKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_3__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_3__1"
    // InternalMyDsl.g:2557:1: rule__VirtualMachine__Group_3__1 : rule__VirtualMachine__Group_3__1__Impl rule__VirtualMachine__Group_3__2 ;
    public final void rule__VirtualMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__VirtualMachine__Group_3__1__Impl rule__VirtualMachine__Group_3__2 )
            // InternalMyDsl.g:2562:2: rule__VirtualMachine__Group_3__1__Impl rule__VirtualMachine__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__VirtualMachine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_3__2();

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
    // $ANTLR end "rule__VirtualMachine__Group_3__1"


    // $ANTLR start "rule__VirtualMachine__Group_3__1__Impl"
    // InternalMyDsl.g:2569:1: rule__VirtualMachine__Group_3__1__Impl : ( '=' ) ;
    public final void rule__VirtualMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( '=' ) )
            // InternalMyDsl.g:2574:1: ( '=' )
            {
            // InternalMyDsl.g:2574:1: ( '=' )
            // InternalMyDsl.g:2575:2: '='
            {
             before(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_3__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_3__2"
    // InternalMyDsl.g:2584:1: rule__VirtualMachine__Group_3__2 : rule__VirtualMachine__Group_3__2__Impl rule__VirtualMachine__Group_3__3 ;
    public final void rule__VirtualMachine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__VirtualMachine__Group_3__2__Impl rule__VirtualMachine__Group_3__3 )
            // InternalMyDsl.g:2589:2: rule__VirtualMachine__Group_3__2__Impl rule__VirtualMachine__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__VirtualMachine__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_3__3();

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
    // $ANTLR end "rule__VirtualMachine__Group_3__2"


    // $ANTLR start "rule__VirtualMachine__Group_3__2__Impl"
    // InternalMyDsl.g:2596:1: rule__VirtualMachine__Group_3__2__Impl : ( ( rule__VirtualMachine__IdAssignment_3_2 ) ) ;
    public final void rule__VirtualMachine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( ( rule__VirtualMachine__IdAssignment_3_2 ) ) )
            // InternalMyDsl.g:2601:1: ( ( rule__VirtualMachine__IdAssignment_3_2 ) )
            {
            // InternalMyDsl.g:2601:1: ( ( rule__VirtualMachine__IdAssignment_3_2 ) )
            // InternalMyDsl.g:2602:2: ( rule__VirtualMachine__IdAssignment_3_2 )
            {
             before(grammarAccess.getVirtualMachineAccess().getIdAssignment_3_2()); 
            // InternalMyDsl.g:2603:2: ( rule__VirtualMachine__IdAssignment_3_2 )
            // InternalMyDsl.g:2603:3: rule__VirtualMachine__IdAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__IdAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getIdAssignment_3_2()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_3__2__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_3__3"
    // InternalMyDsl.g:2611:1: rule__VirtualMachine__Group_3__3 : rule__VirtualMachine__Group_3__3__Impl ;
    public final void rule__VirtualMachine__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__VirtualMachine__Group_3__3__Impl )
            // InternalMyDsl.g:2616:2: rule__VirtualMachine__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_3__3__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group_3__3"


    // $ANTLR start "rule__VirtualMachine__Group_3__3__Impl"
    // InternalMyDsl.g:2622:1: rule__VirtualMachine__Group_3__3__Impl : ( ';' ) ;
    public final void rule__VirtualMachine__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( ';' ) )
            // InternalMyDsl.g:2627:1: ( ';' )
            {
            // InternalMyDsl.g:2627:1: ( ';' )
            // InternalMyDsl.g:2628:2: ';'
            {
             before(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_3__3__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_4__0"
    // InternalMyDsl.g:2638:1: rule__VirtualMachine__Group_4__0 : rule__VirtualMachine__Group_4__0__Impl rule__VirtualMachine__Group_4__1 ;
    public final void rule__VirtualMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__VirtualMachine__Group_4__0__Impl rule__VirtualMachine__Group_4__1 )
            // InternalMyDsl.g:2643:2: rule__VirtualMachine__Group_4__0__Impl rule__VirtualMachine__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__VirtualMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_4__1();

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
    // $ANTLR end "rule__VirtualMachine__Group_4__0"


    // $ANTLR start "rule__VirtualMachine__Group_4__0__Impl"
    // InternalMyDsl.g:2650:1: rule__VirtualMachine__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__VirtualMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( 'name' ) )
            // InternalMyDsl.g:2655:1: ( 'name' )
            {
            // InternalMyDsl.g:2655:1: ( 'name' )
            // InternalMyDsl.g:2656:2: 'name'
            {
             before(grammarAccess.getVirtualMachineAccess().getNameKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_4__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_4__1"
    // InternalMyDsl.g:2665:1: rule__VirtualMachine__Group_4__1 : rule__VirtualMachine__Group_4__1__Impl rule__VirtualMachine__Group_4__2 ;
    public final void rule__VirtualMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__VirtualMachine__Group_4__1__Impl rule__VirtualMachine__Group_4__2 )
            // InternalMyDsl.g:2670:2: rule__VirtualMachine__Group_4__1__Impl rule__VirtualMachine__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__VirtualMachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_4__2();

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
    // $ANTLR end "rule__VirtualMachine__Group_4__1"


    // $ANTLR start "rule__VirtualMachine__Group_4__1__Impl"
    // InternalMyDsl.g:2677:1: rule__VirtualMachine__Group_4__1__Impl : ( '=' ) ;
    public final void rule__VirtualMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( '=' ) )
            // InternalMyDsl.g:2682:1: ( '=' )
            {
            // InternalMyDsl.g:2682:1: ( '=' )
            // InternalMyDsl.g:2683:2: '='
            {
             before(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_4__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_4__2"
    // InternalMyDsl.g:2692:1: rule__VirtualMachine__Group_4__2 : rule__VirtualMachine__Group_4__2__Impl rule__VirtualMachine__Group_4__3 ;
    public final void rule__VirtualMachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__VirtualMachine__Group_4__2__Impl rule__VirtualMachine__Group_4__3 )
            // InternalMyDsl.g:2697:2: rule__VirtualMachine__Group_4__2__Impl rule__VirtualMachine__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__VirtualMachine__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_4__3();

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
    // $ANTLR end "rule__VirtualMachine__Group_4__2"


    // $ANTLR start "rule__VirtualMachine__Group_4__2__Impl"
    // InternalMyDsl.g:2704:1: rule__VirtualMachine__Group_4__2__Impl : ( ( rule__VirtualMachine__NameAssignment_4_2 ) ) ;
    public final void rule__VirtualMachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( ( rule__VirtualMachine__NameAssignment_4_2 ) ) )
            // InternalMyDsl.g:2709:1: ( ( rule__VirtualMachine__NameAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2709:1: ( ( rule__VirtualMachine__NameAssignment_4_2 ) )
            // InternalMyDsl.g:2710:2: ( rule__VirtualMachine__NameAssignment_4_2 )
            {
             before(grammarAccess.getVirtualMachineAccess().getNameAssignment_4_2()); 
            // InternalMyDsl.g:2711:2: ( rule__VirtualMachine__NameAssignment_4_2 )
            // InternalMyDsl.g:2711:3: rule__VirtualMachine__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getNameAssignment_4_2()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_4__2__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_4__3"
    // InternalMyDsl.g:2719:1: rule__VirtualMachine__Group_4__3 : rule__VirtualMachine__Group_4__3__Impl ;
    public final void rule__VirtualMachine__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__VirtualMachine__Group_4__3__Impl )
            // InternalMyDsl.g:2724:2: rule__VirtualMachine__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_4__3__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group_4__3"


    // $ANTLR start "rule__VirtualMachine__Group_4__3__Impl"
    // InternalMyDsl.g:2730:1: rule__VirtualMachine__Group_4__3__Impl : ( ';' ) ;
    public final void rule__VirtualMachine__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( ';' ) )
            // InternalMyDsl.g:2735:1: ( ';' )
            {
            // InternalMyDsl.g:2735:1: ( ';' )
            // InternalMyDsl.g:2736:2: ';'
            {
             before(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_4_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_4_3()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_4__3__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_5__0"
    // InternalMyDsl.g:2746:1: rule__VirtualMachine__Group_5__0 : rule__VirtualMachine__Group_5__0__Impl rule__VirtualMachine__Group_5__1 ;
    public final void rule__VirtualMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__VirtualMachine__Group_5__0__Impl rule__VirtualMachine__Group_5__1 )
            // InternalMyDsl.g:2751:2: rule__VirtualMachine__Group_5__0__Impl rule__VirtualMachine__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__VirtualMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_5__1();

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
    // $ANTLR end "rule__VirtualMachine__Group_5__0"


    // $ANTLR start "rule__VirtualMachine__Group_5__0__Impl"
    // InternalMyDsl.g:2758:1: rule__VirtualMachine__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__VirtualMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( 'type' ) )
            // InternalMyDsl.g:2763:1: ( 'type' )
            {
            // InternalMyDsl.g:2763:1: ( 'type' )
            // InternalMyDsl.g:2764:2: 'type'
            {
             before(grammarAccess.getVirtualMachineAccess().getTypeKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_5__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_5__1"
    // InternalMyDsl.g:2773:1: rule__VirtualMachine__Group_5__1 : rule__VirtualMachine__Group_5__1__Impl rule__VirtualMachine__Group_5__2 ;
    public final void rule__VirtualMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__VirtualMachine__Group_5__1__Impl rule__VirtualMachine__Group_5__2 )
            // InternalMyDsl.g:2778:2: rule__VirtualMachine__Group_5__1__Impl rule__VirtualMachine__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__VirtualMachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_5__2();

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
    // $ANTLR end "rule__VirtualMachine__Group_5__1"


    // $ANTLR start "rule__VirtualMachine__Group_5__1__Impl"
    // InternalMyDsl.g:2785:1: rule__VirtualMachine__Group_5__1__Impl : ( '=' ) ;
    public final void rule__VirtualMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( '=' ) )
            // InternalMyDsl.g:2790:1: ( '=' )
            {
            // InternalMyDsl.g:2790:1: ( '=' )
            // InternalMyDsl.g:2791:2: '='
            {
             before(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_5__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_5__2"
    // InternalMyDsl.g:2800:1: rule__VirtualMachine__Group_5__2 : rule__VirtualMachine__Group_5__2__Impl rule__VirtualMachine__Group_5__3 ;
    public final void rule__VirtualMachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__VirtualMachine__Group_5__2__Impl rule__VirtualMachine__Group_5__3 )
            // InternalMyDsl.g:2805:2: rule__VirtualMachine__Group_5__2__Impl rule__VirtualMachine__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__VirtualMachine__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_5__3();

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
    // $ANTLR end "rule__VirtualMachine__Group_5__2"


    // $ANTLR start "rule__VirtualMachine__Group_5__2__Impl"
    // InternalMyDsl.g:2812:1: rule__VirtualMachine__Group_5__2__Impl : ( ( rule__VirtualMachine__TypeAssignment_5_2 ) ) ;
    public final void rule__VirtualMachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ( rule__VirtualMachine__TypeAssignment_5_2 ) ) )
            // InternalMyDsl.g:2817:1: ( ( rule__VirtualMachine__TypeAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2817:1: ( ( rule__VirtualMachine__TypeAssignment_5_2 ) )
            // InternalMyDsl.g:2818:2: ( rule__VirtualMachine__TypeAssignment_5_2 )
            {
             before(grammarAccess.getVirtualMachineAccess().getTypeAssignment_5_2()); 
            // InternalMyDsl.g:2819:2: ( rule__VirtualMachine__TypeAssignment_5_2 )
            // InternalMyDsl.g:2819:3: rule__VirtualMachine__TypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__TypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getTypeAssignment_5_2()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_5__2__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_5__3"
    // InternalMyDsl.g:2827:1: rule__VirtualMachine__Group_5__3 : rule__VirtualMachine__Group_5__3__Impl ;
    public final void rule__VirtualMachine__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__VirtualMachine__Group_5__3__Impl )
            // InternalMyDsl.g:2832:2: rule__VirtualMachine__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_5__3__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group_5__3"


    // $ANTLR start "rule__VirtualMachine__Group_5__3__Impl"
    // InternalMyDsl.g:2838:1: rule__VirtualMachine__Group_5__3__Impl : ( ';' ) ;
    public final void rule__VirtualMachine__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( ( ';' ) )
            // InternalMyDsl.g:2843:1: ( ';' )
            {
            // InternalMyDsl.g:2843:1: ( ';' )
            // InternalMyDsl.g:2844:2: ';'
            {
             before(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_5__3__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__0"
    // InternalMyDsl.g:2854:1: rule__VirtualMachine__Group_6__0 : rule__VirtualMachine__Group_6__0__Impl rule__VirtualMachine__Group_6__1 ;
    public final void rule__VirtualMachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__VirtualMachine__Group_6__0__Impl rule__VirtualMachine__Group_6__1 )
            // InternalMyDsl.g:2859:2: rule__VirtualMachine__Group_6__0__Impl rule__VirtualMachine__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__VirtualMachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__1();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__0"


    // $ANTLR start "rule__VirtualMachine__Group_6__0__Impl"
    // InternalMyDsl.g:2866:1: rule__VirtualMachine__Group_6__0__Impl : ( 'containers' ) ;
    public final void rule__VirtualMachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2870:1: ( ( 'containers' ) )
            // InternalMyDsl.g:2871:1: ( 'containers' )
            {
            // InternalMyDsl.g:2871:1: ( 'containers' )
            // InternalMyDsl.g:2872:2: 'containers'
            {
             before(grammarAccess.getVirtualMachineAccess().getContainersKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getContainersKeyword_6_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__1"
    // InternalMyDsl.g:2881:1: rule__VirtualMachine__Group_6__1 : rule__VirtualMachine__Group_6__1__Impl rule__VirtualMachine__Group_6__2 ;
    public final void rule__VirtualMachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__VirtualMachine__Group_6__1__Impl rule__VirtualMachine__Group_6__2 )
            // InternalMyDsl.g:2886:2: rule__VirtualMachine__Group_6__1__Impl rule__VirtualMachine__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__VirtualMachine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__2();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__1"


    // $ANTLR start "rule__VirtualMachine__Group_6__1__Impl"
    // InternalMyDsl.g:2893:1: rule__VirtualMachine__Group_6__1__Impl : ( '=' ) ;
    public final void rule__VirtualMachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( '=' ) )
            // InternalMyDsl.g:2898:1: ( '=' )
            {
            // InternalMyDsl.g:2898:1: ( '=' )
            // InternalMyDsl.g:2899:2: '='
            {
             before(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__1__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__2"
    // InternalMyDsl.g:2908:1: rule__VirtualMachine__Group_6__2 : rule__VirtualMachine__Group_6__2__Impl rule__VirtualMachine__Group_6__3 ;
    public final void rule__VirtualMachine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__VirtualMachine__Group_6__2__Impl rule__VirtualMachine__Group_6__3 )
            // InternalMyDsl.g:2913:2: rule__VirtualMachine__Group_6__2__Impl rule__VirtualMachine__Group_6__3
            {
            pushFollow(FOLLOW_17);
            rule__VirtualMachine__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__3();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__2"


    // $ANTLR start "rule__VirtualMachine__Group_6__2__Impl"
    // InternalMyDsl.g:2920:1: rule__VirtualMachine__Group_6__2__Impl : ( '{' ) ;
    public final void rule__VirtualMachine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2924:1: ( ( '{' ) )
            // InternalMyDsl.g:2925:1: ( '{' )
            {
            // InternalMyDsl.g:2925:1: ( '{' )
            // InternalMyDsl.g:2926:2: '{'
            {
             before(grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_6_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_6_2()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__2__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__3"
    // InternalMyDsl.g:2935:1: rule__VirtualMachine__Group_6__3 : rule__VirtualMachine__Group_6__3__Impl rule__VirtualMachine__Group_6__4 ;
    public final void rule__VirtualMachine__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__VirtualMachine__Group_6__3__Impl rule__VirtualMachine__Group_6__4 )
            // InternalMyDsl.g:2940:2: rule__VirtualMachine__Group_6__3__Impl rule__VirtualMachine__Group_6__4
            {
            pushFollow(FOLLOW_11);
            rule__VirtualMachine__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__4();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__3"


    // $ANTLR start "rule__VirtualMachine__Group_6__3__Impl"
    // InternalMyDsl.g:2947:1: rule__VirtualMachine__Group_6__3__Impl : ( ( rule__VirtualMachine__DockersAssignment_6_3 ) ) ;
    public final void rule__VirtualMachine__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( ( rule__VirtualMachine__DockersAssignment_6_3 ) ) )
            // InternalMyDsl.g:2952:1: ( ( rule__VirtualMachine__DockersAssignment_6_3 ) )
            {
            // InternalMyDsl.g:2952:1: ( ( rule__VirtualMachine__DockersAssignment_6_3 ) )
            // InternalMyDsl.g:2953:2: ( rule__VirtualMachine__DockersAssignment_6_3 )
            {
             before(grammarAccess.getVirtualMachineAccess().getDockersAssignment_6_3()); 
            // InternalMyDsl.g:2954:2: ( rule__VirtualMachine__DockersAssignment_6_3 )
            // InternalMyDsl.g:2954:3: rule__VirtualMachine__DockersAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__DockersAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getDockersAssignment_6_3()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__3__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__4"
    // InternalMyDsl.g:2962:1: rule__VirtualMachine__Group_6__4 : rule__VirtualMachine__Group_6__4__Impl rule__VirtualMachine__Group_6__5 ;
    public final void rule__VirtualMachine__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__VirtualMachine__Group_6__4__Impl rule__VirtualMachine__Group_6__5 )
            // InternalMyDsl.g:2967:2: rule__VirtualMachine__Group_6__4__Impl rule__VirtualMachine__Group_6__5
            {
            pushFollow(FOLLOW_11);
            rule__VirtualMachine__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__5();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__4"


    // $ANTLR start "rule__VirtualMachine__Group_6__4__Impl"
    // InternalMyDsl.g:2974:1: rule__VirtualMachine__Group_6__4__Impl : ( ( rule__VirtualMachine__Group_6_4__0 )* ) ;
    public final void rule__VirtualMachine__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( ( rule__VirtualMachine__Group_6_4__0 )* ) )
            // InternalMyDsl.g:2979:1: ( ( rule__VirtualMachine__Group_6_4__0 )* )
            {
            // InternalMyDsl.g:2979:1: ( ( rule__VirtualMachine__Group_6_4__0 )* )
            // InternalMyDsl.g:2980:2: ( rule__VirtualMachine__Group_6_4__0 )*
            {
             before(grammarAccess.getVirtualMachineAccess().getGroup_6_4()); 
            // InternalMyDsl.g:2981:2: ( rule__VirtualMachine__Group_6_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2981:3: rule__VirtualMachine__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__VirtualMachine__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getVirtualMachineAccess().getGroup_6_4()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__4__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__5"
    // InternalMyDsl.g:2989:1: rule__VirtualMachine__Group_6__5 : rule__VirtualMachine__Group_6__5__Impl rule__VirtualMachine__Group_6__6 ;
    public final void rule__VirtualMachine__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__VirtualMachine__Group_6__5__Impl rule__VirtualMachine__Group_6__6 )
            // InternalMyDsl.g:2994:2: rule__VirtualMachine__Group_6__5__Impl rule__VirtualMachine__Group_6__6
            {
            pushFollow(FOLLOW_8);
            rule__VirtualMachine__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__6();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__5"


    // $ANTLR start "rule__VirtualMachine__Group_6__5__Impl"
    // InternalMyDsl.g:3001:1: rule__VirtualMachine__Group_6__5__Impl : ( '}' ) ;
    public final void rule__VirtualMachine__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( '}' ) )
            // InternalMyDsl.g:3006:1: ( '}' )
            {
            // InternalMyDsl.g:3006:1: ( '}' )
            // InternalMyDsl.g:3007:2: '}'
            {
             before(grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_6_5()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__5__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6__6"
    // InternalMyDsl.g:3016:1: rule__VirtualMachine__Group_6__6 : rule__VirtualMachine__Group_6__6__Impl ;
    public final void rule__VirtualMachine__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__VirtualMachine__Group_6__6__Impl )
            // InternalMyDsl.g:3021:2: rule__VirtualMachine__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6__6__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group_6__6"


    // $ANTLR start "rule__VirtualMachine__Group_6__6__Impl"
    // InternalMyDsl.g:3027:1: rule__VirtualMachine__Group_6__6__Impl : ( ';' ) ;
    public final void rule__VirtualMachine__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( ';' ) )
            // InternalMyDsl.g:3032:1: ( ';' )
            {
            // InternalMyDsl.g:3032:1: ( ';' )
            // InternalMyDsl.g:3033:2: ';'
            {
             before(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_6_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getSemicolonKeyword_6_6()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6__6__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6_4__0"
    // InternalMyDsl.g:3043:1: rule__VirtualMachine__Group_6_4__0 : rule__VirtualMachine__Group_6_4__0__Impl rule__VirtualMachine__Group_6_4__1 ;
    public final void rule__VirtualMachine__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__VirtualMachine__Group_6_4__0__Impl rule__VirtualMachine__Group_6_4__1 )
            // InternalMyDsl.g:3048:2: rule__VirtualMachine__Group_6_4__0__Impl rule__VirtualMachine__Group_6_4__1
            {
            pushFollow(FOLLOW_17);
            rule__VirtualMachine__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6_4__1();

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
    // $ANTLR end "rule__VirtualMachine__Group_6_4__0"


    // $ANTLR start "rule__VirtualMachine__Group_6_4__0__Impl"
    // InternalMyDsl.g:3055:1: rule__VirtualMachine__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__VirtualMachine__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( ',' ) )
            // InternalMyDsl.g:3060:1: ( ',' )
            {
            // InternalMyDsl.g:3060:1: ( ',' )
            // InternalMyDsl.g:3061:2: ','
            {
             before(grammarAccess.getVirtualMachineAccess().getCommaKeyword_6_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getCommaKeyword_6_4_0()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6_4__0__Impl"


    // $ANTLR start "rule__VirtualMachine__Group_6_4__1"
    // InternalMyDsl.g:3070:1: rule__VirtualMachine__Group_6_4__1 : rule__VirtualMachine__Group_6_4__1__Impl ;
    public final void rule__VirtualMachine__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__VirtualMachine__Group_6_4__1__Impl )
            // InternalMyDsl.g:3075:2: rule__VirtualMachine__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__Group_6_4__1__Impl();

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
    // $ANTLR end "rule__VirtualMachine__Group_6_4__1"


    // $ANTLR start "rule__VirtualMachine__Group_6_4__1__Impl"
    // InternalMyDsl.g:3081:1: rule__VirtualMachine__Group_6_4__1__Impl : ( ( rule__VirtualMachine__DockersAssignment_6_4_1 ) ) ;
    public final void rule__VirtualMachine__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3085:1: ( ( ( rule__VirtualMachine__DockersAssignment_6_4_1 ) ) )
            // InternalMyDsl.g:3086:1: ( ( rule__VirtualMachine__DockersAssignment_6_4_1 ) )
            {
            // InternalMyDsl.g:3086:1: ( ( rule__VirtualMachine__DockersAssignment_6_4_1 ) )
            // InternalMyDsl.g:3087:2: ( rule__VirtualMachine__DockersAssignment_6_4_1 )
            {
             before(grammarAccess.getVirtualMachineAccess().getDockersAssignment_6_4_1()); 
            // InternalMyDsl.g:3088:2: ( rule__VirtualMachine__DockersAssignment_6_4_1 )
            // InternalMyDsl.g:3088:3: rule__VirtualMachine__DockersAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VirtualMachine__DockersAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVirtualMachineAccess().getDockersAssignment_6_4_1()); 

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
    // $ANTLR end "rule__VirtualMachine__Group_6_4__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:3097:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:3102:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalMyDsl.g:3109:1: rule__Container__Group__0__Impl : ( 'docker' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( 'docker' ) )
            // InternalMyDsl.g:3114:1: ( 'docker' )
            {
            // InternalMyDsl.g:3114:1: ( 'docker' )
            // InternalMyDsl.g:3115:2: 'docker'
            {
             before(grammarAccess.getContainerAccess().getDockerKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDockerKeyword_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalMyDsl.g:3124:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:3129:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalMyDsl.g:3136:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3140:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3141:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3141:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalMyDsl.g:3142:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3143:2: ( rule__Container__NameAssignment_1 )
            // InternalMyDsl.g:3143:3: rule__Container__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalMyDsl.g:3151:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalMyDsl.g:3156:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalMyDsl.g:3163:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( '{' ) )
            // InternalMyDsl.g:3168:1: ( '{' )
            {
            // InternalMyDsl.g:3168:1: ( '{' )
            // InternalMyDsl.g:3169:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalMyDsl.g:3178:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalMyDsl.g:3183:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalMyDsl.g:3190:1: rule__Container__Group__3__Impl : ( ( rule__Container__Group_3__0 )? ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( ( rule__Container__Group_3__0 )? ) )
            // InternalMyDsl.g:3195:1: ( ( rule__Container__Group_3__0 )? )
            {
            // InternalMyDsl.g:3195:1: ( ( rule__Container__Group_3__0 )? )
            // InternalMyDsl.g:3196:2: ( rule__Container__Group_3__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_3()); 
            // InternalMyDsl.g:3197:2: ( rule__Container__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3197:3: rule__Container__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalMyDsl.g:3205:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalMyDsl.g:3210:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalMyDsl.g:3217:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )? ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ( rule__Container__Group_4__0 )? ) )
            // InternalMyDsl.g:3222:1: ( ( rule__Container__Group_4__0 )? )
            {
            // InternalMyDsl.g:3222:1: ( ( rule__Container__Group_4__0 )? )
            // InternalMyDsl.g:3223:2: ( rule__Container__Group_4__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalMyDsl.g:3224:2: ( rule__Container__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3224:3: rule__Container__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalMyDsl.g:3232:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalMyDsl.g:3237:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalMyDsl.g:3244:1: rule__Container__Group__5__Impl : ( ( rule__Container__Group_5__0 )? ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3248:1: ( ( ( rule__Container__Group_5__0 )? ) )
            // InternalMyDsl.g:3249:1: ( ( rule__Container__Group_5__0 )? )
            {
            // InternalMyDsl.g:3249:1: ( ( rule__Container__Group_5__0 )? )
            // InternalMyDsl.g:3250:2: ( rule__Container__Group_5__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_5()); 
            // InternalMyDsl.g:3251:2: ( rule__Container__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3251:3: rule__Container__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalMyDsl.g:3259:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalMyDsl.g:3264:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

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
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalMyDsl.g:3271:1: rule__Container__Group__6__Impl : ( ( rule__Container__Group_6__0 )? ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( ( rule__Container__Group_6__0 )? ) )
            // InternalMyDsl.g:3276:1: ( ( rule__Container__Group_6__0 )? )
            {
            // InternalMyDsl.g:3276:1: ( ( rule__Container__Group_6__0 )? )
            // InternalMyDsl.g:3277:2: ( rule__Container__Group_6__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_6()); 
            // InternalMyDsl.g:3278:2: ( rule__Container__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3278:3: rule__Container__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalMyDsl.g:3286:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalMyDsl.g:3291:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

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
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalMyDsl.g:3298:1: rule__Container__Group__7__Impl : ( ( rule__Container__Group_7__0 )? ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( ( rule__Container__Group_7__0 )? ) )
            // InternalMyDsl.g:3303:1: ( ( rule__Container__Group_7__0 )? )
            {
            // InternalMyDsl.g:3303:1: ( ( rule__Container__Group_7__0 )? )
            // InternalMyDsl.g:3304:2: ( rule__Container__Group_7__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_7()); 
            // InternalMyDsl.g:3305:2: ( rule__Container__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3305:3: rule__Container__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalMyDsl.g:3313:1: rule__Container__Group__8 : rule__Container__Group__8__Impl ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__Container__Group__8__Impl )
            // InternalMyDsl.g:3318:2: rule__Container__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__8__Impl();

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
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalMyDsl.g:3324:1: rule__Container__Group__8__Impl : ( '}' ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( ( '}' ) )
            // InternalMyDsl.g:3329:1: ( '}' )
            {
            // InternalMyDsl.g:3329:1: ( '}' )
            // InternalMyDsl.g:3330:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group_3__0"
    // InternalMyDsl.g:3340:1: rule__Container__Group_3__0 : rule__Container__Group_3__0__Impl rule__Container__Group_3__1 ;
    public final void rule__Container__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__Container__Group_3__0__Impl rule__Container__Group_3__1 )
            // InternalMyDsl.g:3345:2: rule__Container__Group_3__0__Impl rule__Container__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_3__1();

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
    // $ANTLR end "rule__Container__Group_3__0"


    // $ANTLR start "rule__Container__Group_3__0__Impl"
    // InternalMyDsl.g:3352:1: rule__Container__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Container__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3356:1: ( ( 'id' ) )
            // InternalMyDsl.g:3357:1: ( 'id' )
            {
            // InternalMyDsl.g:3357:1: ( 'id' )
            // InternalMyDsl.g:3358:2: 'id'
            {
             before(grammarAccess.getContainerAccess().getIdKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Container__Group_3__0__Impl"


    // $ANTLR start "rule__Container__Group_3__1"
    // InternalMyDsl.g:3367:1: rule__Container__Group_3__1 : rule__Container__Group_3__1__Impl rule__Container__Group_3__2 ;
    public final void rule__Container__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__Container__Group_3__1__Impl rule__Container__Group_3__2 )
            // InternalMyDsl.g:3372:2: rule__Container__Group_3__1__Impl rule__Container__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_3__2();

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
    // $ANTLR end "rule__Container__Group_3__1"


    // $ANTLR start "rule__Container__Group_3__1__Impl"
    // InternalMyDsl.g:3379:1: rule__Container__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( '=' ) )
            // InternalMyDsl.g:3384:1: ( '=' )
            {
            // InternalMyDsl.g:3384:1: ( '=' )
            // InternalMyDsl.g:3385:2: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Container__Group_3__1__Impl"


    // $ANTLR start "rule__Container__Group_3__2"
    // InternalMyDsl.g:3394:1: rule__Container__Group_3__2 : rule__Container__Group_3__2__Impl rule__Container__Group_3__3 ;
    public final void rule__Container__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__Container__Group_3__2__Impl rule__Container__Group_3__3 )
            // InternalMyDsl.g:3399:2: rule__Container__Group_3__2__Impl rule__Container__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_3__3();

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
    // $ANTLR end "rule__Container__Group_3__2"


    // $ANTLR start "rule__Container__Group_3__2__Impl"
    // InternalMyDsl.g:3406:1: rule__Container__Group_3__2__Impl : ( ( rule__Container__IdAssignment_3_2 ) ) ;
    public final void rule__Container__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( ( rule__Container__IdAssignment_3_2 ) ) )
            // InternalMyDsl.g:3411:1: ( ( rule__Container__IdAssignment_3_2 ) )
            {
            // InternalMyDsl.g:3411:1: ( ( rule__Container__IdAssignment_3_2 ) )
            // InternalMyDsl.g:3412:2: ( rule__Container__IdAssignment_3_2 )
            {
             before(grammarAccess.getContainerAccess().getIdAssignment_3_2()); 
            // InternalMyDsl.g:3413:2: ( rule__Container__IdAssignment_3_2 )
            // InternalMyDsl.g:3413:3: rule__Container__IdAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__IdAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getIdAssignment_3_2()); 

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
    // $ANTLR end "rule__Container__Group_3__2__Impl"


    // $ANTLR start "rule__Container__Group_3__3"
    // InternalMyDsl.g:3421:1: rule__Container__Group_3__3 : rule__Container__Group_3__3__Impl ;
    public final void rule__Container__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__Container__Group_3__3__Impl )
            // InternalMyDsl.g:3426:2: rule__Container__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_3__3__Impl();

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
    // $ANTLR end "rule__Container__Group_3__3"


    // $ANTLR start "rule__Container__Group_3__3__Impl"
    // InternalMyDsl.g:3432:1: rule__Container__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Container__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( ( ';' ) )
            // InternalMyDsl.g:3437:1: ( ';' )
            {
            // InternalMyDsl.g:3437:1: ( ';' )
            // InternalMyDsl.g:3438:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__Container__Group_3__3__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // InternalMyDsl.g:3448:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalMyDsl.g:3453:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // InternalMyDsl.g:3460:1: rule__Container__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( 'name' ) )
            // InternalMyDsl.g:3465:1: ( 'name' )
            {
            // InternalMyDsl.g:3465:1: ( 'name' )
            // InternalMyDsl.g:3466:2: 'name'
            {
             before(grammarAccess.getContainerAccess().getNameKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // InternalMyDsl.g:3475:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl rule__Container__Group_4__2 ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__Container__Group_4__1__Impl rule__Container__Group_4__2 )
            // InternalMyDsl.g:3480:2: rule__Container__Group_4__1__Impl rule__Container__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__2();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // InternalMyDsl.g:3487:1: rule__Container__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3491:1: ( ( '=' ) )
            // InternalMyDsl.g:3492:1: ( '=' )
            {
            // InternalMyDsl.g:3492:1: ( '=' )
            // InternalMyDsl.g:3493:2: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group_4__2"
    // InternalMyDsl.g:3502:1: rule__Container__Group_4__2 : rule__Container__Group_4__2__Impl rule__Container__Group_4__3 ;
    public final void rule__Container__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__Container__Group_4__2__Impl rule__Container__Group_4__3 )
            // InternalMyDsl.g:3507:2: rule__Container__Group_4__2__Impl rule__Container__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__3();

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
    // $ANTLR end "rule__Container__Group_4__2"


    // $ANTLR start "rule__Container__Group_4__2__Impl"
    // InternalMyDsl.g:3514:1: rule__Container__Group_4__2__Impl : ( ( rule__Container__NameAssignment_4_2 ) ) ;
    public final void rule__Container__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( ( rule__Container__NameAssignment_4_2 ) ) )
            // InternalMyDsl.g:3519:1: ( ( rule__Container__NameAssignment_4_2 ) )
            {
            // InternalMyDsl.g:3519:1: ( ( rule__Container__NameAssignment_4_2 ) )
            // InternalMyDsl.g:3520:2: ( rule__Container__NameAssignment_4_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_4_2()); 
            // InternalMyDsl.g:3521:2: ( rule__Container__NameAssignment_4_2 )
            // InternalMyDsl.g:3521:3: rule__Container__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_4_2()); 

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
    // $ANTLR end "rule__Container__Group_4__2__Impl"


    // $ANTLR start "rule__Container__Group_4__3"
    // InternalMyDsl.g:3529:1: rule__Container__Group_4__3 : rule__Container__Group_4__3__Impl ;
    public final void rule__Container__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__Container__Group_4__3__Impl )
            // InternalMyDsl.g:3534:2: rule__Container__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_4__3__Impl();

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
    // $ANTLR end "rule__Container__Group_4__3"


    // $ANTLR start "rule__Container__Group_4__3__Impl"
    // InternalMyDsl.g:3540:1: rule__Container__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Container__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( ';' ) )
            // InternalMyDsl.g:3545:1: ( ';' )
            {
            // InternalMyDsl.g:3545:1: ( ';' )
            // InternalMyDsl.g:3546:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_4_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_4_3()); 

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
    // $ANTLR end "rule__Container__Group_4__3__Impl"


    // $ANTLR start "rule__Container__Group_5__0"
    // InternalMyDsl.g:3556:1: rule__Container__Group_5__0 : rule__Container__Group_5__0__Impl rule__Container__Group_5__1 ;
    public final void rule__Container__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__Container__Group_5__0__Impl rule__Container__Group_5__1 )
            // InternalMyDsl.g:3561:2: rule__Container__Group_5__0__Impl rule__Container__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_5__1();

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
    // $ANTLR end "rule__Container__Group_5__0"


    // $ANTLR start "rule__Container__Group_5__0__Impl"
    // InternalMyDsl.g:3568:1: rule__Container__Group_5__0__Impl : ( 'IP' ) ;
    public final void rule__Container__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( 'IP' ) )
            // InternalMyDsl.g:3573:1: ( 'IP' )
            {
            // InternalMyDsl.g:3573:1: ( 'IP' )
            // InternalMyDsl.g:3574:2: 'IP'
            {
             before(grammarAccess.getContainerAccess().getIPKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getIPKeyword_5_0()); 

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
    // $ANTLR end "rule__Container__Group_5__0__Impl"


    // $ANTLR start "rule__Container__Group_5__1"
    // InternalMyDsl.g:3583:1: rule__Container__Group_5__1 : rule__Container__Group_5__1__Impl rule__Container__Group_5__2 ;
    public final void rule__Container__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__Container__Group_5__1__Impl rule__Container__Group_5__2 )
            // InternalMyDsl.g:3588:2: rule__Container__Group_5__1__Impl rule__Container__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_5__2();

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
    // $ANTLR end "rule__Container__Group_5__1"


    // $ANTLR start "rule__Container__Group_5__1__Impl"
    // InternalMyDsl.g:3595:1: rule__Container__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( '=' ) )
            // InternalMyDsl.g:3600:1: ( '=' )
            {
            // InternalMyDsl.g:3600:1: ( '=' )
            // InternalMyDsl.g:3601:2: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Container__Group_5__1__Impl"


    // $ANTLR start "rule__Container__Group_5__2"
    // InternalMyDsl.g:3610:1: rule__Container__Group_5__2 : rule__Container__Group_5__2__Impl rule__Container__Group_5__3 ;
    public final void rule__Container__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__Container__Group_5__2__Impl rule__Container__Group_5__3 )
            // InternalMyDsl.g:3615:2: rule__Container__Group_5__2__Impl rule__Container__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_5__3();

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
    // $ANTLR end "rule__Container__Group_5__2"


    // $ANTLR start "rule__Container__Group_5__2__Impl"
    // InternalMyDsl.g:3622:1: rule__Container__Group_5__2__Impl : ( ( rule__Container__NameAssignment_5_2 ) ) ;
    public final void rule__Container__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__Container__NameAssignment_5_2 ) ) )
            // InternalMyDsl.g:3627:1: ( ( rule__Container__NameAssignment_5_2 ) )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__Container__NameAssignment_5_2 ) )
            // InternalMyDsl.g:3628:2: ( rule__Container__NameAssignment_5_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_5_2()); 
            // InternalMyDsl.g:3629:2: ( rule__Container__NameAssignment_5_2 )
            // InternalMyDsl.g:3629:3: rule__Container__NameAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_5_2()); 

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
    // $ANTLR end "rule__Container__Group_5__2__Impl"


    // $ANTLR start "rule__Container__Group_5__3"
    // InternalMyDsl.g:3637:1: rule__Container__Group_5__3 : rule__Container__Group_5__3__Impl ;
    public final void rule__Container__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__Container__Group_5__3__Impl )
            // InternalMyDsl.g:3642:2: rule__Container__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_5__3__Impl();

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
    // $ANTLR end "rule__Container__Group_5__3"


    // $ANTLR start "rule__Container__Group_5__3__Impl"
    // InternalMyDsl.g:3648:1: rule__Container__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Container__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( ';' ) )
            // InternalMyDsl.g:3653:1: ( ';' )
            {
            // InternalMyDsl.g:3653:1: ( ';' )
            // InternalMyDsl.g:3654:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end "rule__Container__Group_5__3__Impl"


    // $ANTLR start "rule__Container__Group_6__0"
    // InternalMyDsl.g:3664:1: rule__Container__Group_6__0 : rule__Container__Group_6__0__Impl rule__Container__Group_6__1 ;
    public final void rule__Container__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__Container__Group_6__0__Impl rule__Container__Group_6__1 )
            // InternalMyDsl.g:3669:2: rule__Container__Group_6__0__Impl rule__Container__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_6__1();

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
    // $ANTLR end "rule__Container__Group_6__0"


    // $ANTLR start "rule__Container__Group_6__0__Impl"
    // InternalMyDsl.g:3676:1: rule__Container__Group_6__0__Impl : ( 'Port' ) ;
    public final void rule__Container__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( 'Port' ) )
            // InternalMyDsl.g:3681:1: ( 'Port' )
            {
            // InternalMyDsl.g:3681:1: ( 'Port' )
            // InternalMyDsl.g:3682:2: 'Port'
            {
             before(grammarAccess.getContainerAccess().getPortKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getPortKeyword_6_0()); 

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
    // $ANTLR end "rule__Container__Group_6__0__Impl"


    // $ANTLR start "rule__Container__Group_6__1"
    // InternalMyDsl.g:3691:1: rule__Container__Group_6__1 : rule__Container__Group_6__1__Impl rule__Container__Group_6__2 ;
    public final void rule__Container__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__Container__Group_6__1__Impl rule__Container__Group_6__2 )
            // InternalMyDsl.g:3696:2: rule__Container__Group_6__1__Impl rule__Container__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__Container__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_6__2();

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
    // $ANTLR end "rule__Container__Group_6__1"


    // $ANTLR start "rule__Container__Group_6__1__Impl"
    // InternalMyDsl.g:3703:1: rule__Container__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3707:1: ( ( '=' ) )
            // InternalMyDsl.g:3708:1: ( '=' )
            {
            // InternalMyDsl.g:3708:1: ( '=' )
            // InternalMyDsl.g:3709:2: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Container__Group_6__1__Impl"


    // $ANTLR start "rule__Container__Group_6__2"
    // InternalMyDsl.g:3718:1: rule__Container__Group_6__2 : rule__Container__Group_6__2__Impl rule__Container__Group_6__3 ;
    public final void rule__Container__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__Container__Group_6__2__Impl rule__Container__Group_6__3 )
            // InternalMyDsl.g:3723:2: rule__Container__Group_6__2__Impl rule__Container__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_6__3();

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
    // $ANTLR end "rule__Container__Group_6__2"


    // $ANTLR start "rule__Container__Group_6__2__Impl"
    // InternalMyDsl.g:3730:1: rule__Container__Group_6__2__Impl : ( ( rule__Container__PortAssignment_6_2 ) ) ;
    public final void rule__Container__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( ( rule__Container__PortAssignment_6_2 ) ) )
            // InternalMyDsl.g:3735:1: ( ( rule__Container__PortAssignment_6_2 ) )
            {
            // InternalMyDsl.g:3735:1: ( ( rule__Container__PortAssignment_6_2 ) )
            // InternalMyDsl.g:3736:2: ( rule__Container__PortAssignment_6_2 )
            {
             before(grammarAccess.getContainerAccess().getPortAssignment_6_2()); 
            // InternalMyDsl.g:3737:2: ( rule__Container__PortAssignment_6_2 )
            // InternalMyDsl.g:3737:3: rule__Container__PortAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__PortAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getPortAssignment_6_2()); 

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
    // $ANTLR end "rule__Container__Group_6__2__Impl"


    // $ANTLR start "rule__Container__Group_6__3"
    // InternalMyDsl.g:3745:1: rule__Container__Group_6__3 : rule__Container__Group_6__3__Impl ;
    public final void rule__Container__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__Container__Group_6__3__Impl )
            // InternalMyDsl.g:3750:2: rule__Container__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_6__3__Impl();

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
    // $ANTLR end "rule__Container__Group_6__3"


    // $ANTLR start "rule__Container__Group_6__3__Impl"
    // InternalMyDsl.g:3756:1: rule__Container__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Container__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( ';' ) )
            // InternalMyDsl.g:3761:1: ( ';' )
            {
            // InternalMyDsl.g:3761:1: ( ';' )
            // InternalMyDsl.g:3762:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_6_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_6_3()); 

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
    // $ANTLR end "rule__Container__Group_6__3__Impl"


    // $ANTLR start "rule__Container__Group_7__0"
    // InternalMyDsl.g:3772:1: rule__Container__Group_7__0 : rule__Container__Group_7__0__Impl rule__Container__Group_7__1 ;
    public final void rule__Container__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__Container__Group_7__0__Impl rule__Container__Group_7__1 )
            // InternalMyDsl.g:3777:2: rule__Container__Group_7__0__Impl rule__Container__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_7__1();

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
    // $ANTLR end "rule__Container__Group_7__0"


    // $ANTLR start "rule__Container__Group_7__0__Impl"
    // InternalMyDsl.g:3784:1: rule__Container__Group_7__0__Impl : ( 'Microservice' ) ;
    public final void rule__Container__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'Microservice' ) )
            // InternalMyDsl.g:3789:1: ( 'Microservice' )
            {
            // InternalMyDsl.g:3789:1: ( 'Microservice' )
            // InternalMyDsl.g:3790:2: 'Microservice'
            {
             before(grammarAccess.getContainerAccess().getMicroserviceKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getMicroserviceKeyword_7_0()); 

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
    // $ANTLR end "rule__Container__Group_7__0__Impl"


    // $ANTLR start "rule__Container__Group_7__1"
    // InternalMyDsl.g:3799:1: rule__Container__Group_7__1 : rule__Container__Group_7__1__Impl rule__Container__Group_7__2 ;
    public final void rule__Container__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__Container__Group_7__1__Impl rule__Container__Group_7__2 )
            // InternalMyDsl.g:3804:2: rule__Container__Group_7__1__Impl rule__Container__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__Container__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_7__2();

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
    // $ANTLR end "rule__Container__Group_7__1"


    // $ANTLR start "rule__Container__Group_7__1__Impl"
    // InternalMyDsl.g:3811:1: rule__Container__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Container__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( '=' ) )
            // InternalMyDsl.g:3816:1: ( '=' )
            {
            // InternalMyDsl.g:3816:1: ( '=' )
            // InternalMyDsl.g:3817:2: '='
            {
             before(grammarAccess.getContainerAccess().getEqualsSignKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Container__Group_7__1__Impl"


    // $ANTLR start "rule__Container__Group_7__2"
    // InternalMyDsl.g:3826:1: rule__Container__Group_7__2 : rule__Container__Group_7__2__Impl rule__Container__Group_7__3 ;
    public final void rule__Container__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__Container__Group_7__2__Impl rule__Container__Group_7__3 )
            // InternalMyDsl.g:3831:2: rule__Container__Group_7__2__Impl rule__Container__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Container__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_7__3();

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
    // $ANTLR end "rule__Container__Group_7__2"


    // $ANTLR start "rule__Container__Group_7__2__Impl"
    // InternalMyDsl.g:3838:1: rule__Container__Group_7__2__Impl : ( ( rule__Container__MicroserviceAssignment_7_2 ) ) ;
    public final void rule__Container__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( ( rule__Container__MicroserviceAssignment_7_2 ) ) )
            // InternalMyDsl.g:3843:1: ( ( rule__Container__MicroserviceAssignment_7_2 ) )
            {
            // InternalMyDsl.g:3843:1: ( ( rule__Container__MicroserviceAssignment_7_2 ) )
            // InternalMyDsl.g:3844:2: ( rule__Container__MicroserviceAssignment_7_2 )
            {
             before(grammarAccess.getContainerAccess().getMicroserviceAssignment_7_2()); 
            // InternalMyDsl.g:3845:2: ( rule__Container__MicroserviceAssignment_7_2 )
            // InternalMyDsl.g:3845:3: rule__Container__MicroserviceAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__MicroserviceAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getMicroserviceAssignment_7_2()); 

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
    // $ANTLR end "rule__Container__Group_7__2__Impl"


    // $ANTLR start "rule__Container__Group_7__3"
    // InternalMyDsl.g:3853:1: rule__Container__Group_7__3 : rule__Container__Group_7__3__Impl ;
    public final void rule__Container__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__Container__Group_7__3__Impl )
            // InternalMyDsl.g:3858:2: rule__Container__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_7__3__Impl();

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
    // $ANTLR end "rule__Container__Group_7__3"


    // $ANTLR start "rule__Container__Group_7__3__Impl"
    // InternalMyDsl.g:3864:1: rule__Container__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Container__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3868:1: ( ( ';' ) )
            // InternalMyDsl.g:3869:1: ( ';' )
            {
            // InternalMyDsl.g:3869:1: ( ';' )
            // InternalMyDsl.g:3870:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_7_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_7_3()); 

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
    // $ANTLR end "rule__Container__Group_7__3__Impl"


    // $ANTLR start "rule__Microservice__Group__0"
    // InternalMyDsl.g:3880:1: rule__Microservice__Group__0 : rule__Microservice__Group__0__Impl rule__Microservice__Group__1 ;
    public final void rule__Microservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__Microservice__Group__0__Impl rule__Microservice__Group__1 )
            // InternalMyDsl.g:3885:2: rule__Microservice__Group__0__Impl rule__Microservice__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Microservice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__1();

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
    // $ANTLR end "rule__Microservice__Group__0"


    // $ANTLR start "rule__Microservice__Group__0__Impl"
    // InternalMyDsl.g:3892:1: rule__Microservice__Group__0__Impl : ( 'service' ) ;
    public final void rule__Microservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( 'service' ) )
            // InternalMyDsl.g:3897:1: ( 'service' )
            {
            // InternalMyDsl.g:3897:1: ( 'service' )
            // InternalMyDsl.g:3898:2: 'service'
            {
             before(grammarAccess.getMicroserviceAccess().getServiceKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Microservice__Group__0__Impl"


    // $ANTLR start "rule__Microservice__Group__1"
    // InternalMyDsl.g:3907:1: rule__Microservice__Group__1 : rule__Microservice__Group__1__Impl rule__Microservice__Group__2 ;
    public final void rule__Microservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__Microservice__Group__1__Impl rule__Microservice__Group__2 )
            // InternalMyDsl.g:3912:2: rule__Microservice__Group__1__Impl rule__Microservice__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Microservice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__2();

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
    // $ANTLR end "rule__Microservice__Group__1"


    // $ANTLR start "rule__Microservice__Group__1__Impl"
    // InternalMyDsl.g:3919:1: rule__Microservice__Group__1__Impl : ( ( rule__Microservice__NameAssignment_1 ) ) ;
    public final void rule__Microservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3923:1: ( ( ( rule__Microservice__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3924:1: ( ( rule__Microservice__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3924:1: ( ( rule__Microservice__NameAssignment_1 ) )
            // InternalMyDsl.g:3925:2: ( rule__Microservice__NameAssignment_1 )
            {
             before(grammarAccess.getMicroserviceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3926:2: ( rule__Microservice__NameAssignment_1 )
            // InternalMyDsl.g:3926:3: rule__Microservice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Microservice__Group__1__Impl"


    // $ANTLR start "rule__Microservice__Group__2"
    // InternalMyDsl.g:3934:1: rule__Microservice__Group__2 : rule__Microservice__Group__2__Impl rule__Microservice__Group__3 ;
    public final void rule__Microservice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__Microservice__Group__2__Impl rule__Microservice__Group__3 )
            // InternalMyDsl.g:3939:2: rule__Microservice__Group__2__Impl rule__Microservice__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Microservice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__3();

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
    // $ANTLR end "rule__Microservice__Group__2"


    // $ANTLR start "rule__Microservice__Group__2__Impl"
    // InternalMyDsl.g:3946:1: rule__Microservice__Group__2__Impl : ( '{' ) ;
    public final void rule__Microservice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( '{' ) )
            // InternalMyDsl.g:3951:1: ( '{' )
            {
            // InternalMyDsl.g:3951:1: ( '{' )
            // InternalMyDsl.g:3952:2: '{'
            {
             before(grammarAccess.getMicroserviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Microservice__Group__2__Impl"


    // $ANTLR start "rule__Microservice__Group__3"
    // InternalMyDsl.g:3961:1: rule__Microservice__Group__3 : rule__Microservice__Group__3__Impl rule__Microservice__Group__4 ;
    public final void rule__Microservice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__Microservice__Group__3__Impl rule__Microservice__Group__4 )
            // InternalMyDsl.g:3966:2: rule__Microservice__Group__3__Impl rule__Microservice__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Microservice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__4();

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
    // $ANTLR end "rule__Microservice__Group__3"


    // $ANTLR start "rule__Microservice__Group__3__Impl"
    // InternalMyDsl.g:3973:1: rule__Microservice__Group__3__Impl : ( ( rule__Microservice__Group_3__0 )? ) ;
    public final void rule__Microservice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3977:1: ( ( ( rule__Microservice__Group_3__0 )? ) )
            // InternalMyDsl.g:3978:1: ( ( rule__Microservice__Group_3__0 )? )
            {
            // InternalMyDsl.g:3978:1: ( ( rule__Microservice__Group_3__0 )? )
            // InternalMyDsl.g:3979:2: ( rule__Microservice__Group_3__0 )?
            {
             before(grammarAccess.getMicroserviceAccess().getGroup_3()); 
            // InternalMyDsl.g:3980:2: ( rule__Microservice__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3980:3: rule__Microservice__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Microservice__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMicroserviceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Microservice__Group__3__Impl"


    // $ANTLR start "rule__Microservice__Group__4"
    // InternalMyDsl.g:3988:1: rule__Microservice__Group__4 : rule__Microservice__Group__4__Impl rule__Microservice__Group__5 ;
    public final void rule__Microservice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__Microservice__Group__4__Impl rule__Microservice__Group__5 )
            // InternalMyDsl.g:3993:2: rule__Microservice__Group__4__Impl rule__Microservice__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Microservice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__5();

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
    // $ANTLR end "rule__Microservice__Group__4"


    // $ANTLR start "rule__Microservice__Group__4__Impl"
    // InternalMyDsl.g:4000:1: rule__Microservice__Group__4__Impl : ( ( rule__Microservice__Group_4__0 )? ) ;
    public final void rule__Microservice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( ( rule__Microservice__Group_4__0 )? ) )
            // InternalMyDsl.g:4005:1: ( ( rule__Microservice__Group_4__0 )? )
            {
            // InternalMyDsl.g:4005:1: ( ( rule__Microservice__Group_4__0 )? )
            // InternalMyDsl.g:4006:2: ( rule__Microservice__Group_4__0 )?
            {
             before(grammarAccess.getMicroserviceAccess().getGroup_4()); 
            // InternalMyDsl.g:4007:2: ( rule__Microservice__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4007:3: rule__Microservice__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Microservice__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMicroserviceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Microservice__Group__4__Impl"


    // $ANTLR start "rule__Microservice__Group__5"
    // InternalMyDsl.g:4015:1: rule__Microservice__Group__5 : rule__Microservice__Group__5__Impl rule__Microservice__Group__6 ;
    public final void rule__Microservice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__Microservice__Group__5__Impl rule__Microservice__Group__6 )
            // InternalMyDsl.g:4020:2: rule__Microservice__Group__5__Impl rule__Microservice__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Microservice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group__6();

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
    // $ANTLR end "rule__Microservice__Group__5"


    // $ANTLR start "rule__Microservice__Group__5__Impl"
    // InternalMyDsl.g:4027:1: rule__Microservice__Group__5__Impl : ( ( rule__Microservice__Group_5__0 )? ) ;
    public final void rule__Microservice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( ( rule__Microservice__Group_5__0 )? ) )
            // InternalMyDsl.g:4032:1: ( ( rule__Microservice__Group_5__0 )? )
            {
            // InternalMyDsl.g:4032:1: ( ( rule__Microservice__Group_5__0 )? )
            // InternalMyDsl.g:4033:2: ( rule__Microservice__Group_5__0 )?
            {
             before(grammarAccess.getMicroserviceAccess().getGroup_5()); 
            // InternalMyDsl.g:4034:2: ( rule__Microservice__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4034:3: rule__Microservice__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Microservice__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMicroserviceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Microservice__Group__5__Impl"


    // $ANTLR start "rule__Microservice__Group__6"
    // InternalMyDsl.g:4042:1: rule__Microservice__Group__6 : rule__Microservice__Group__6__Impl ;
    public final void rule__Microservice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__Microservice__Group__6__Impl )
            // InternalMyDsl.g:4047:2: rule__Microservice__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__Group__6__Impl();

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
    // $ANTLR end "rule__Microservice__Group__6"


    // $ANTLR start "rule__Microservice__Group__6__Impl"
    // InternalMyDsl.g:4053:1: rule__Microservice__Group__6__Impl : ( '}' ) ;
    public final void rule__Microservice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( '}' ) )
            // InternalMyDsl.g:4058:1: ( '}' )
            {
            // InternalMyDsl.g:4058:1: ( '}' )
            // InternalMyDsl.g:4059:2: '}'
            {
             before(grammarAccess.getMicroserviceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Microservice__Group__6__Impl"


    // $ANTLR start "rule__Microservice__Group_3__0"
    // InternalMyDsl.g:4069:1: rule__Microservice__Group_3__0 : rule__Microservice__Group_3__0__Impl rule__Microservice__Group_3__1 ;
    public final void rule__Microservice__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__Microservice__Group_3__0__Impl rule__Microservice__Group_3__1 )
            // InternalMyDsl.g:4074:2: rule__Microservice__Group_3__0__Impl rule__Microservice__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Microservice__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_3__1();

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
    // $ANTLR end "rule__Microservice__Group_3__0"


    // $ANTLR start "rule__Microservice__Group_3__0__Impl"
    // InternalMyDsl.g:4081:1: rule__Microservice__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Microservice__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( 'id' ) )
            // InternalMyDsl.g:4086:1: ( 'id' )
            {
            // InternalMyDsl.g:4086:1: ( 'id' )
            // InternalMyDsl.g:4087:2: 'id'
            {
             before(grammarAccess.getMicroserviceAccess().getIdKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Microservice__Group_3__0__Impl"


    // $ANTLR start "rule__Microservice__Group_3__1"
    // InternalMyDsl.g:4096:1: rule__Microservice__Group_3__1 : rule__Microservice__Group_3__1__Impl rule__Microservice__Group_3__2 ;
    public final void rule__Microservice__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__Microservice__Group_3__1__Impl rule__Microservice__Group_3__2 )
            // InternalMyDsl.g:4101:2: rule__Microservice__Group_3__1__Impl rule__Microservice__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Microservice__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_3__2();

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
    // $ANTLR end "rule__Microservice__Group_3__1"


    // $ANTLR start "rule__Microservice__Group_3__1__Impl"
    // InternalMyDsl.g:4108:1: rule__Microservice__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Microservice__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4112:1: ( ( '=' ) )
            // InternalMyDsl.g:4113:1: ( '=' )
            {
            // InternalMyDsl.g:4113:1: ( '=' )
            // InternalMyDsl.g:4114:2: '='
            {
             before(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Microservice__Group_3__1__Impl"


    // $ANTLR start "rule__Microservice__Group_3__2"
    // InternalMyDsl.g:4123:1: rule__Microservice__Group_3__2 : rule__Microservice__Group_3__2__Impl rule__Microservice__Group_3__3 ;
    public final void rule__Microservice__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__Microservice__Group_3__2__Impl rule__Microservice__Group_3__3 )
            // InternalMyDsl.g:4128:2: rule__Microservice__Group_3__2__Impl rule__Microservice__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Microservice__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_3__3();

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
    // $ANTLR end "rule__Microservice__Group_3__2"


    // $ANTLR start "rule__Microservice__Group_3__2__Impl"
    // InternalMyDsl.g:4135:1: rule__Microservice__Group_3__2__Impl : ( ( rule__Microservice__IdAssignment_3_2 ) ) ;
    public final void rule__Microservice__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( ( rule__Microservice__IdAssignment_3_2 ) ) )
            // InternalMyDsl.g:4140:1: ( ( rule__Microservice__IdAssignment_3_2 ) )
            {
            // InternalMyDsl.g:4140:1: ( ( rule__Microservice__IdAssignment_3_2 ) )
            // InternalMyDsl.g:4141:2: ( rule__Microservice__IdAssignment_3_2 )
            {
             before(grammarAccess.getMicroserviceAccess().getIdAssignment_3_2()); 
            // InternalMyDsl.g:4142:2: ( rule__Microservice__IdAssignment_3_2 )
            // InternalMyDsl.g:4142:3: rule__Microservice__IdAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__IdAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceAccess().getIdAssignment_3_2()); 

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
    // $ANTLR end "rule__Microservice__Group_3__2__Impl"


    // $ANTLR start "rule__Microservice__Group_3__3"
    // InternalMyDsl.g:4150:1: rule__Microservice__Group_3__3 : rule__Microservice__Group_3__3__Impl ;
    public final void rule__Microservice__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__Microservice__Group_3__3__Impl )
            // InternalMyDsl.g:4155:2: rule__Microservice__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__Group_3__3__Impl();

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
    // $ANTLR end "rule__Microservice__Group_3__3"


    // $ANTLR start "rule__Microservice__Group_3__3__Impl"
    // InternalMyDsl.g:4161:1: rule__Microservice__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Microservice__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ';' ) )
            // InternalMyDsl.g:4166:1: ( ';' )
            {
            // InternalMyDsl.g:4166:1: ( ';' )
            // InternalMyDsl.g:4167:2: ';'
            {
             before(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_3_3()); 

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
    // $ANTLR end "rule__Microservice__Group_3__3__Impl"


    // $ANTLR start "rule__Microservice__Group_4__0"
    // InternalMyDsl.g:4177:1: rule__Microservice__Group_4__0 : rule__Microservice__Group_4__0__Impl rule__Microservice__Group_4__1 ;
    public final void rule__Microservice__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( rule__Microservice__Group_4__0__Impl rule__Microservice__Group_4__1 )
            // InternalMyDsl.g:4182:2: rule__Microservice__Group_4__0__Impl rule__Microservice__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Microservice__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_4__1();

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
    // $ANTLR end "rule__Microservice__Group_4__0"


    // $ANTLR start "rule__Microservice__Group_4__0__Impl"
    // InternalMyDsl.g:4189:1: rule__Microservice__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Microservice__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( 'name' ) )
            // InternalMyDsl.g:4194:1: ( 'name' )
            {
            // InternalMyDsl.g:4194:1: ( 'name' )
            // InternalMyDsl.g:4195:2: 'name'
            {
             before(grammarAccess.getMicroserviceAccess().getNameKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Microservice__Group_4__0__Impl"


    // $ANTLR start "rule__Microservice__Group_4__1"
    // InternalMyDsl.g:4204:1: rule__Microservice__Group_4__1 : rule__Microservice__Group_4__1__Impl rule__Microservice__Group_4__2 ;
    public final void rule__Microservice__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( rule__Microservice__Group_4__1__Impl rule__Microservice__Group_4__2 )
            // InternalMyDsl.g:4209:2: rule__Microservice__Group_4__1__Impl rule__Microservice__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Microservice__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_4__2();

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
    // $ANTLR end "rule__Microservice__Group_4__1"


    // $ANTLR start "rule__Microservice__Group_4__1__Impl"
    // InternalMyDsl.g:4216:1: rule__Microservice__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Microservice__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( '=' ) )
            // InternalMyDsl.g:4221:1: ( '=' )
            {
            // InternalMyDsl.g:4221:1: ( '=' )
            // InternalMyDsl.g:4222:2: '='
            {
             before(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Microservice__Group_4__1__Impl"


    // $ANTLR start "rule__Microservice__Group_4__2"
    // InternalMyDsl.g:4231:1: rule__Microservice__Group_4__2 : rule__Microservice__Group_4__2__Impl rule__Microservice__Group_4__3 ;
    public final void rule__Microservice__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( rule__Microservice__Group_4__2__Impl rule__Microservice__Group_4__3 )
            // InternalMyDsl.g:4236:2: rule__Microservice__Group_4__2__Impl rule__Microservice__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Microservice__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_4__3();

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
    // $ANTLR end "rule__Microservice__Group_4__2"


    // $ANTLR start "rule__Microservice__Group_4__2__Impl"
    // InternalMyDsl.g:4243:1: rule__Microservice__Group_4__2__Impl : ( ( rule__Microservice__NameAssignment_4_2 ) ) ;
    public final void rule__Microservice__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4247:1: ( ( ( rule__Microservice__NameAssignment_4_2 ) ) )
            // InternalMyDsl.g:4248:1: ( ( rule__Microservice__NameAssignment_4_2 ) )
            {
            // InternalMyDsl.g:4248:1: ( ( rule__Microservice__NameAssignment_4_2 ) )
            // InternalMyDsl.g:4249:2: ( rule__Microservice__NameAssignment_4_2 )
            {
             before(grammarAccess.getMicroserviceAccess().getNameAssignment_4_2()); 
            // InternalMyDsl.g:4250:2: ( rule__Microservice__NameAssignment_4_2 )
            // InternalMyDsl.g:4250:3: rule__Microservice__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceAccess().getNameAssignment_4_2()); 

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
    // $ANTLR end "rule__Microservice__Group_4__2__Impl"


    // $ANTLR start "rule__Microservice__Group_4__3"
    // InternalMyDsl.g:4258:1: rule__Microservice__Group_4__3 : rule__Microservice__Group_4__3__Impl ;
    public final void rule__Microservice__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( rule__Microservice__Group_4__3__Impl )
            // InternalMyDsl.g:4263:2: rule__Microservice__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__Group_4__3__Impl();

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
    // $ANTLR end "rule__Microservice__Group_4__3"


    // $ANTLR start "rule__Microservice__Group_4__3__Impl"
    // InternalMyDsl.g:4269:1: rule__Microservice__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Microservice__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4273:1: ( ( ';' ) )
            // InternalMyDsl.g:4274:1: ( ';' )
            {
            // InternalMyDsl.g:4274:1: ( ';' )
            // InternalMyDsl.g:4275:2: ';'
            {
             before(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_4_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_4_3()); 

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
    // $ANTLR end "rule__Microservice__Group_4__3__Impl"


    // $ANTLR start "rule__Microservice__Group_5__0"
    // InternalMyDsl.g:4285:1: rule__Microservice__Group_5__0 : rule__Microservice__Group_5__0__Impl rule__Microservice__Group_5__1 ;
    public final void rule__Microservice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( rule__Microservice__Group_5__0__Impl rule__Microservice__Group_5__1 )
            // InternalMyDsl.g:4290:2: rule__Microservice__Group_5__0__Impl rule__Microservice__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Microservice__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_5__1();

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
    // $ANTLR end "rule__Microservice__Group_5__0"


    // $ANTLR start "rule__Microservice__Group_5__0__Impl"
    // InternalMyDsl.g:4297:1: rule__Microservice__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__Microservice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( 'type' ) )
            // InternalMyDsl.g:4302:1: ( 'type' )
            {
            // InternalMyDsl.g:4302:1: ( 'type' )
            // InternalMyDsl.g:4303:2: 'type'
            {
             before(grammarAccess.getMicroserviceAccess().getTypeKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Microservice__Group_5__0__Impl"


    // $ANTLR start "rule__Microservice__Group_5__1"
    // InternalMyDsl.g:4312:1: rule__Microservice__Group_5__1 : rule__Microservice__Group_5__1__Impl rule__Microservice__Group_5__2 ;
    public final void rule__Microservice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( rule__Microservice__Group_5__1__Impl rule__Microservice__Group_5__2 )
            // InternalMyDsl.g:4317:2: rule__Microservice__Group_5__1__Impl rule__Microservice__Group_5__2
            {
            pushFollow(FOLLOW_22);
            rule__Microservice__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_5__2();

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
    // $ANTLR end "rule__Microservice__Group_5__1"


    // $ANTLR start "rule__Microservice__Group_5__1__Impl"
    // InternalMyDsl.g:4324:1: rule__Microservice__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Microservice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4328:1: ( ( '=' ) )
            // InternalMyDsl.g:4329:1: ( '=' )
            {
            // InternalMyDsl.g:4329:1: ( '=' )
            // InternalMyDsl.g:4330:2: '='
            {
             before(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Microservice__Group_5__1__Impl"


    // $ANTLR start "rule__Microservice__Group_5__2"
    // InternalMyDsl.g:4339:1: rule__Microservice__Group_5__2 : rule__Microservice__Group_5__2__Impl rule__Microservice__Group_5__3 ;
    public final void rule__Microservice__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( rule__Microservice__Group_5__2__Impl rule__Microservice__Group_5__3 )
            // InternalMyDsl.g:4344:2: rule__Microservice__Group_5__2__Impl rule__Microservice__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Microservice__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Microservice__Group_5__3();

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
    // $ANTLR end "rule__Microservice__Group_5__2"


    // $ANTLR start "rule__Microservice__Group_5__2__Impl"
    // InternalMyDsl.g:4351:1: rule__Microservice__Group_5__2__Impl : ( ( rule__Microservice__TypeAssignment_5_2 ) ) ;
    public final void rule__Microservice__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( ( rule__Microservice__TypeAssignment_5_2 ) ) )
            // InternalMyDsl.g:4356:1: ( ( rule__Microservice__TypeAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4356:1: ( ( rule__Microservice__TypeAssignment_5_2 ) )
            // InternalMyDsl.g:4357:2: ( rule__Microservice__TypeAssignment_5_2 )
            {
             before(grammarAccess.getMicroserviceAccess().getTypeAssignment_5_2()); 
            // InternalMyDsl.g:4358:2: ( rule__Microservice__TypeAssignment_5_2 )
            // InternalMyDsl.g:4358:3: rule__Microservice__TypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__TypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMicroserviceAccess().getTypeAssignment_5_2()); 

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
    // $ANTLR end "rule__Microservice__Group_5__2__Impl"


    // $ANTLR start "rule__Microservice__Group_5__3"
    // InternalMyDsl.g:4366:1: rule__Microservice__Group_5__3 : rule__Microservice__Group_5__3__Impl ;
    public final void rule__Microservice__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( rule__Microservice__Group_5__3__Impl )
            // InternalMyDsl.g:4371:2: rule__Microservice__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Microservice__Group_5__3__Impl();

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
    // $ANTLR end "rule__Microservice__Group_5__3"


    // $ANTLR start "rule__Microservice__Group_5__3__Impl"
    // InternalMyDsl.g:4377:1: rule__Microservice__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Microservice__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4381:1: ( ( ';' ) )
            // InternalMyDsl.g:4382:1: ( ';' )
            {
            // InternalMyDsl.g:4382:1: ( ';' )
            // InternalMyDsl.g:4383:2: ';'
            {
             before(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end "rule__Microservice__Group_5__3__Impl"


    // $ANTLR start "rule__EnvironmentModel__EnvironmentAssignment"
    // InternalMyDsl.g:4393:1: rule__EnvironmentModel__EnvironmentAssignment : ( ruleEnvironment ) ;
    public final void rule__EnvironmentModel__EnvironmentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( ( ruleEnvironment ) )
            // InternalMyDsl.g:4398:2: ( ruleEnvironment )
            {
            // InternalMyDsl.g:4398:2: ( ruleEnvironment )
            // InternalMyDsl.g:4399:3: ruleEnvironment
            {
             before(grammarAccess.getEnvironmentModelAccess().getEnvironmentEnvironmentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentModelAccess().getEnvironmentEnvironmentParserRuleCall_0()); 

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
    // $ANTLR end "rule__EnvironmentModel__EnvironmentAssignment"


    // $ANTLR start "rule__Environment__NameAssignment_1"
    // InternalMyDsl.g:4408:1: rule__Environment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Environment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4412:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4413:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4413:2: ( RULE_ID )
            // InternalMyDsl.g:4414:3: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Environment__NameAssignment_1"


    // $ANTLR start "rule__Environment__IdAssignment_3_2"
    // InternalMyDsl.g:4423:1: rule__Environment__IdAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Environment__IdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4427:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4428:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4428:2: ( RULE_STRING )
            // InternalMyDsl.g:4429:3: RULE_STRING
            {
             before(grammarAccess.getEnvironmentAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Environment__IdAssignment_3_2"


    // $ANTLR start "rule__Environment__NameAssignment_4_2"
    // InternalMyDsl.g:4438:1: rule__Environment__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Environment__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4443:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4443:2: ( RULE_STRING )
            // InternalMyDsl.g:4444:3: RULE_STRING
            {
             before(grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Environment__NameAssignment_4_2"


    // $ANTLR start "rule__Environment__TypeAssignment_5_2"
    // InternalMyDsl.g:4453:1: rule__Environment__TypeAssignment_5_2 : ( ruleEnvironmentType ) ;
    public final void rule__Environment__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( ( ruleEnvironmentType ) )
            // InternalMyDsl.g:4458:2: ( ruleEnvironmentType )
            {
            // InternalMyDsl.g:4458:2: ( ruleEnvironmentType )
            // InternalMyDsl.g:4459:3: ruleEnvironmentType
            {
             before(grammarAccess.getEnvironmentAccess().getTypeEnvironmentTypeEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentType();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getTypeEnvironmentTypeEnumRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Environment__TypeAssignment_5_2"


    // $ANTLR start "rule__Environment__NameAssignment_6_2"
    // InternalMyDsl.g:4468:1: rule__Environment__NameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Environment__NameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4473:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4473:2: ( RULE_STRING )
            // InternalMyDsl.g:4474:3: RULE_STRING
            {
             before(grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getNameSTRINGTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Environment__NameAssignment_6_2"


    // $ANTLR start "rule__Environment__NodesAssignment_7_3"
    // InternalMyDsl.g:4483:1: rule__Environment__NodesAssignment_7_3 : ( ruleServerNode ) ;
    public final void rule__Environment__NodesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4487:1: ( ( ruleServerNode ) )
            // InternalMyDsl.g:4488:2: ( ruleServerNode )
            {
            // InternalMyDsl.g:4488:2: ( ruleServerNode )
            // InternalMyDsl.g:4489:3: ruleServerNode
            {
             before(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleServerNode();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__Environment__NodesAssignment_7_3"


    // $ANTLR start "rule__Environment__NodesAssignment_7_4_1"
    // InternalMyDsl.g:4498:1: rule__Environment__NodesAssignment_7_4_1 : ( ruleServerNode ) ;
    public final void rule__Environment__NodesAssignment_7_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4502:1: ( ( ruleServerNode ) )
            // InternalMyDsl.g:4503:2: ( ruleServerNode )
            {
            // InternalMyDsl.g:4503:2: ( ruleServerNode )
            // InternalMyDsl.g:4504:3: ruleServerNode
            {
             before(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServerNode();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getNodesServerNodeParserRuleCall_7_4_1_0()); 

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
    // $ANTLR end "rule__Environment__NodesAssignment_7_4_1"


    // $ANTLR start "rule__ServerNode__NameAssignment_1"
    // InternalMyDsl.g:4513:1: rule__ServerNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServerNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4517:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4518:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4518:2: ( RULE_ID )
            // InternalMyDsl.g:4519:3: RULE_ID
            {
             before(grammarAccess.getServerNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServerNode__NameAssignment_1"


    // $ANTLR start "rule__ServerNode__IdAssignment_3_2"
    // InternalMyDsl.g:4528:1: rule__ServerNode__IdAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__ServerNode__IdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4532:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4533:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4533:2: ( RULE_STRING )
            // InternalMyDsl.g:4534:3: RULE_STRING
            {
             before(grammarAccess.getServerNodeAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__ServerNode__IdAssignment_3_2"


    // $ANTLR start "rule__ServerNode__NameAssignment_4_2"
    // InternalMyDsl.g:4543:1: rule__ServerNode__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ServerNode__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4548:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4548:2: ( RULE_STRING )
            // InternalMyDsl.g:4549:3: RULE_STRING
            {
             before(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ServerNode__NameAssignment_4_2"


    // $ANTLR start "rule__ServerNode__NameAssignment_5_2"
    // InternalMyDsl.g:4558:1: rule__ServerNode__NameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__ServerNode__NameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4562:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4563:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4563:2: ( RULE_STRING )
            // InternalMyDsl.g:4564:3: RULE_STRING
            {
             before(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__ServerNode__NameAssignment_5_2"


    // $ANTLR start "rule__ServerNode__NameAssignment_6_2"
    // InternalMyDsl.g:4573:1: rule__ServerNode__NameAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__ServerNode__NameAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4577:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4578:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4578:2: ( RULE_STRING )
            // InternalMyDsl.g:4579:3: RULE_STRING
            {
             before(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ServerNode__NameAssignment_6_2"


    // $ANTLR start "rule__ServerNode__NameAssignment_7_2"
    // InternalMyDsl.g:4588:1: rule__ServerNode__NameAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__ServerNode__NameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4593:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4593:2: ( RULE_STRING )
            // InternalMyDsl.g:4594:3: RULE_STRING
            {
             before(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerNodeAccess().getNameSTRINGTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ServerNode__NameAssignment_7_2"


    // $ANTLR start "rule__ServerNode__VmsAssignment_8_3"
    // InternalMyDsl.g:4603:1: rule__ServerNode__VmsAssignment_8_3 : ( ruleVirtualMachine ) ;
    public final void rule__ServerNode__VmsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( ( ruleVirtualMachine ) )
            // InternalMyDsl.g:4608:2: ( ruleVirtualMachine )
            {
            // InternalMyDsl.g:4608:2: ( ruleVirtualMachine )
            // InternalMyDsl.g:4609:3: ruleVirtualMachine
            {
             before(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVirtualMachine();

            state._fsp--;

             after(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__ServerNode__VmsAssignment_8_3"


    // $ANTLR start "rule__ServerNode__VmsAssignment_8_4_1"
    // InternalMyDsl.g:4618:1: rule__ServerNode__VmsAssignment_8_4_1 : ( ruleVirtualMachine ) ;
    public final void rule__ServerNode__VmsAssignment_8_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4622:1: ( ( ruleVirtualMachine ) )
            // InternalMyDsl.g:4623:2: ( ruleVirtualMachine )
            {
            // InternalMyDsl.g:4623:2: ( ruleVirtualMachine )
            // InternalMyDsl.g:4624:3: ruleVirtualMachine
            {
             before(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVirtualMachine();

            state._fsp--;

             after(grammarAccess.getServerNodeAccess().getVmsVirtualMachineParserRuleCall_8_4_1_0()); 

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
    // $ANTLR end "rule__ServerNode__VmsAssignment_8_4_1"


    // $ANTLR start "rule__VirtualMachine__NameAssignment_1"
    // InternalMyDsl.g:4633:1: rule__VirtualMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VirtualMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4637:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4638:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4638:2: ( RULE_ID )
            // InternalMyDsl.g:4639:3: RULE_ID
            {
             before(grammarAccess.getVirtualMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VirtualMachine__NameAssignment_1"


    // $ANTLR start "rule__VirtualMachine__IdAssignment_3_2"
    // InternalMyDsl.g:4648:1: rule__VirtualMachine__IdAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__VirtualMachine__IdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4652:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4653:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4653:2: ( RULE_STRING )
            // InternalMyDsl.g:4654:3: RULE_STRING
            {
             before(grammarAccess.getVirtualMachineAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__VirtualMachine__IdAssignment_3_2"


    // $ANTLR start "rule__VirtualMachine__NameAssignment_4_2"
    // InternalMyDsl.g:4663:1: rule__VirtualMachine__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__VirtualMachine__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4668:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4668:2: ( RULE_STRING )
            // InternalMyDsl.g:4669:3: RULE_STRING
            {
             before(grammarAccess.getVirtualMachineAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVirtualMachineAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__VirtualMachine__NameAssignment_4_2"


    // $ANTLR start "rule__VirtualMachine__TypeAssignment_5_2"
    // InternalMyDsl.g:4678:1: rule__VirtualMachine__TypeAssignment_5_2 : ( ruleVMType ) ;
    public final void rule__VirtualMachine__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4682:1: ( ( ruleVMType ) )
            // InternalMyDsl.g:4683:2: ( ruleVMType )
            {
            // InternalMyDsl.g:4683:2: ( ruleVMType )
            // InternalMyDsl.g:4684:3: ruleVMType
            {
             before(grammarAccess.getVirtualMachineAccess().getTypeVMTypeEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVMType();

            state._fsp--;

             after(grammarAccess.getVirtualMachineAccess().getTypeVMTypeEnumRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__VirtualMachine__TypeAssignment_5_2"


    // $ANTLR start "rule__VirtualMachine__DockersAssignment_6_3"
    // InternalMyDsl.g:4693:1: rule__VirtualMachine__DockersAssignment_6_3 : ( ruleContainer ) ;
    public final void rule__VirtualMachine__DockersAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4697:1: ( ( ruleContainer ) )
            // InternalMyDsl.g:4698:2: ( ruleContainer )
            {
            // InternalMyDsl.g:4698:2: ( ruleContainer )
            // InternalMyDsl.g:4699:3: ruleContainer
            {
             before(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__VirtualMachine__DockersAssignment_6_3"


    // $ANTLR start "rule__VirtualMachine__DockersAssignment_6_4_1"
    // InternalMyDsl.g:4708:1: rule__VirtualMachine__DockersAssignment_6_4_1 : ( ruleContainer ) ;
    public final void rule__VirtualMachine__DockersAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( ruleContainer ) )
            // InternalMyDsl.g:4713:2: ( ruleContainer )
            {
            // InternalMyDsl.g:4713:2: ( ruleContainer )
            // InternalMyDsl.g:4714:3: ruleContainer
            {
             before(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getVirtualMachineAccess().getDockersContainerParserRuleCall_6_4_1_0()); 

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
    // $ANTLR end "rule__VirtualMachine__DockersAssignment_6_4_1"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalMyDsl.g:4723:1: rule__Container__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4728:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4728:2: ( RULE_ID )
            // InternalMyDsl.g:4729:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_1"


    // $ANTLR start "rule__Container__IdAssignment_3_2"
    // InternalMyDsl.g:4738:1: rule__Container__IdAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Container__IdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4743:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4743:2: ( RULE_STRING )
            // InternalMyDsl.g:4744:3: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Container__IdAssignment_3_2"


    // $ANTLR start "rule__Container__NameAssignment_4_2"
    // InternalMyDsl.g:4753:1: rule__Container__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Container__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4757:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4758:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4758:2: ( RULE_STRING )
            // InternalMyDsl.g:4759:3: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_4_2"


    // $ANTLR start "rule__Container__NameAssignment_5_2"
    // InternalMyDsl.g:4768:1: rule__Container__NameAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Container__NameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4772:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4773:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4773:2: ( RULE_STRING )
            // InternalMyDsl.g:4774:3: RULE_STRING
            {
             before(grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_5_2"


    // $ANTLR start "rule__Container__PortAssignment_6_2"
    // InternalMyDsl.g:4783:1: rule__Container__PortAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Container__PortAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4787:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4788:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4788:2: ( RULE_INT )
            // InternalMyDsl.g:4789:3: RULE_INT
            {
             before(grammarAccess.getContainerAccess().getPortINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getPortINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Container__PortAssignment_6_2"


    // $ANTLR start "rule__Container__MicroserviceAssignment_7_2"
    // InternalMyDsl.g:4798:1: rule__Container__MicroserviceAssignment_7_2 : ( ruleMicroservice ) ;
    public final void rule__Container__MicroserviceAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4802:1: ( ( ruleMicroservice ) )
            // InternalMyDsl.g:4803:2: ( ruleMicroservice )
            {
            // InternalMyDsl.g:4803:2: ( ruleMicroservice )
            // InternalMyDsl.g:4804:3: ruleMicroservice
            {
             before(grammarAccess.getContainerAccess().getMicroserviceMicroserviceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMicroservice();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getMicroserviceMicroserviceParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Container__MicroserviceAssignment_7_2"


    // $ANTLR start "rule__Microservice__NameAssignment_1"
    // InternalMyDsl.g:4813:1: rule__Microservice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Microservice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4818:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4818:2: ( RULE_ID )
            // InternalMyDsl.g:4819:3: RULE_ID
            {
             before(grammarAccess.getMicroserviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Microservice__NameAssignment_1"


    // $ANTLR start "rule__Microservice__IdAssignment_3_2"
    // InternalMyDsl.g:4828:1: rule__Microservice__IdAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Microservice__IdAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4832:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4833:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4833:2: ( RULE_STRING )
            // InternalMyDsl.g:4834:3: RULE_STRING
            {
             before(grammarAccess.getMicroserviceAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Microservice__IdAssignment_3_2"


    // $ANTLR start "rule__Microservice__NameAssignment_4_2"
    // InternalMyDsl.g:4843:1: rule__Microservice__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Microservice__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4848:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4848:2: ( RULE_STRING )
            // InternalMyDsl.g:4849:3: RULE_STRING
            {
             before(grammarAccess.getMicroserviceAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMicroserviceAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Microservice__NameAssignment_4_2"


    // $ANTLR start "rule__Microservice__TypeAssignment_5_2"
    // InternalMyDsl.g:4858:1: rule__Microservice__TypeAssignment_5_2 : ( ruleMicroserviceType ) ;
    public final void rule__Microservice__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( ruleMicroserviceType ) )
            // InternalMyDsl.g:4863:2: ( ruleMicroserviceType )
            {
            // InternalMyDsl.g:4863:2: ( ruleMicroserviceType )
            // InternalMyDsl.g:4864:3: ruleMicroserviceType
            {
             before(grammarAccess.getMicroserviceAccess().getTypeMicroserviceTypeEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMicroserviceType();

            state._fsp--;

             after(grammarAccess.getMicroserviceAccess().getTypeMicroserviceTypeEnumRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Microservice__TypeAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000F3000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003C13000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008033000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000E0013000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000033000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000300000L});

}