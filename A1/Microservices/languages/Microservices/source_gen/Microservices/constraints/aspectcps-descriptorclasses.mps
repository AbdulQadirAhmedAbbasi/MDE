<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:fc27699(checkpoints/Microservices.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="8w0e" ref="r:468ba8cf-600f-433a-bdb1-b531836f79ca(Microservices.constraints)" />
    <import index="dush" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.persistence(MPS.OpenAPI/)" />
    <import index="j809" ref="9abaaae2-decf-4e97-bf80-9109e8b759cc/java:jetbrains.mps.core.aspects.feedback.messages(jetbrains.mps.lang.messages.api/)" />
    <import index="79pl" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.base(MPS.Core/)" />
    <import index="j80a" ref="0a98f3e2-decf-4e97-bf80-9109eccc59bb/java:jetbrains.mps.core.aspects.feedback.messages(jetbrains.mps.lang.feedback.problem.rules/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="o99v" ref="8e98f4e2-decf-4e97-bf80-9109e8b759ee/java:jetbrains.mps.core.aspects.constraints.rules(jetbrains.mps.lang.constraints.rules.runtime/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="u018" ref="r:48771403-405a-41ee-a755-08578f66c616(Microservices.structure)" />
    <import index="1ctc" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util.stream(JDK/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="pdwk" ref="8e98f4e2-decf-4e97-bf80-9109e8b759ee/java:jetbrains.mps.core.aspects.constraints.rules.kinds(jetbrains.mps.lang.constraints.rules.runtime/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="9jwd" ref="9e9ef4e2-decf-4e97-bf80-9109e8b759bb/java:jetbrains.mps.core.aspects.feedback.api(jetbrains.mps.lang.feedback.api/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1083260308424" name="jetbrains.mps.baseLanguage.structure.EnumConstantReference" flags="nn" index="Rm8GO">
        <reference id="1083260308426" name="enumConstantDeclaration" index="Rm8GQ" />
        <reference id="1144432896254" name="enumClass" index="1Px2BO" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA">
        <property id="6468716278899126575" name="isVolatile" index="2dlcS1" />
        <property id="6468716278899125786" name="isTransient" index="2dld4O" />
      </concept>
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
        <child id="4972241301747169160" name="typeArgument" index="3PaCim" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1171903607971" name="jetbrains.mps.baseLanguage.structure.WildCardType" flags="in" index="3qTvmN" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
        <child id="1201186121363" name="typeParameter" index="2Ghqu4" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="5808518347809715508" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_InputNode" flags="nn" index="385nmt">
        <property id="5808518347809748738" name="presentation" index="385vuF" />
        <child id="5808518347809747118" name="node" index="385v07" />
      </concept>
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
        <reference id="3864140621129713371" name="inputOrigin" index="39e2AK" />
        <child id="5808518347809748862" name="inputNode" index="385vvn" />
        <child id="3864140621129713365" name="outputNode" index="39e2AY" />
      </concept>
      <concept id="3864140621129713348" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry" flags="nn" index="39e2AJ">
        <property id="3864140621129715945" name="label" index="39e3Y2" />
        <child id="3864140621129715947" name="entries" index="39e3Y0" />
      </concept>
      <concept id="3864140621129713362" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef" flags="nn" index="39e2AT">
        <reference id="3864140621129713363" name="node" index="39e2AS" />
      </concept>
      <concept id="3637169702552512264" name="jetbrains.mps.lang.generator.structure.ElementaryNodeId" flags="ng" index="3u3nmq">
        <property id="3637169702552512269" name="nodeId" index="3u3nmv" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="4222318806802425298" name="jetbrains.mps.lang.core.structure.SuppressErrorsAnnotation" flags="ng" index="15s5l7">
        <property id="8575328350543493365" name="message" index="huDt6" />
        <property id="2423417345669755629" name="filter" index="1eyWvh" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="2" role="1B3o_S" />
    <node concept="3clFbW" id="3" role="jymVt">
      <node concept="3cqZAl" id="6" role="3clF45" />
      <node concept="3Tm1VV" id="7" role="1B3o_S" />
      <node concept="3clFbS" id="8" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="4" role="jymVt" />
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="a" role="1B3o_S" />
      <node concept="3uibUv" id="b" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="c" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="e" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="d" role="3clF47">
        <node concept="1_3QMa" id="f" role="3cqZAp">
          <node concept="37vLTw" id="h" role="1_3QMn">
            <ref role="3cqZAo" node="c" resolve="concept" />
          </node>
          <node concept="3clFbS" id="i" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="g" role="3cqZAp">
          <node concept="2ShNRf" id="j" role="3cqZAk">
            <node concept="1pGfFk" id="k" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="l" role="37wK5m">
                <ref role="3cqZAo" node="c" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="m">
    <property role="1EXbeo" value="true" />
    <property role="TrG5h" value="Container_ConstraintRules" />
    <property role="3GE5qa" value="Components" />
    <uo k="s:originTrace" v="n:4635545526457716231" />
    <node concept="Wx3nA" id="n" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="CONCEPT" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3Tm6S6" id="_" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="35c_gC" id="A" role="33vP2m">
        <ref role="35c_gD" to="u018:2SI27LbRF3n" resolve="Container" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3uibUv" id="B" role="1tU5fm">
        <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
    </node>
    <node concept="2tJIrI" id="o" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="Wx3nA" id="p" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="check_id4635545526457716238" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3uibUv" id="C" role="1tU5fm">
        <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3uibUv" id="F" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
        </node>
      </node>
      <node concept="3Tm1VV" id="D" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="2ShNRf" id="E" role="33vP2m">
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="1pGfFk" id="G" role="2ShVmc">
          <ref role="37wK5l" node="12" resolve="Container_ConstraintRules.Rule_RestrictedPortNumber " />
          <uo k="s:originTrace" v="n:4635545526457716231" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="q" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="Wx3nA" id="r" role="jymVt">
      <property role="TrG5h" value="RULES" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3uibUv" id="H" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3uibUv" id="K" role="11_B2D">
          <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="3qTvmN" id="L" role="11_B2D">
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="I" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="2YIFZM" id="J" role="33vP2m">
        <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
        <ref role="37wK5l" to="33ny:~Collections.unmodifiableList(java.util.List)" resolve="unmodifiableList" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="2YIFZM" id="M" role="37wK5m">
          <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
          <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="3uibUv" id="N" role="3PaCim">
            <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
            <node concept="3qTvmN" id="P" role="11_B2D">
              <uo k="s:originTrace" v="n:4635545526457716231" />
            </node>
          </node>
          <node concept="37vLTw" id="O" role="37wK5m">
            <ref role="3cqZAo" node="p" resolve="check_id4635545526457716238" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="s" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="3clFb_" id="t" role="jymVt">
      <property role="TrG5h" value="getDeclaredRules" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3Tm1VV" id="Q" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="2AHcQZ" id="R" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3uibUv" id="S" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3uibUv" id="V" role="11_B2D">
          <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="3qTvmN" id="W" role="11_B2D">
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="T" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3cpWs6" id="X" role="3cqZAp">
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="37vLTw" id="Y" role="3cqZAk">
            <ref role="3cqZAo" node="r" resolve="RULES" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="U" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
    </node>
    <node concept="2tJIrI" id="u" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="312cEu" id="v" role="jymVt">
      <property role="1EXbeo" value="true" />
      <property role="TrG5h" value="Rule_RestrictedPortNumber " />
      <uo k="s:originTrace" v="n:4635545526457716238" />
      <node concept="Wx3nA" id="Z" role="jymVt">
        <property role="TrG5h" value="SOURCE_NODE_REF" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="19" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
        <node concept="3Tm6S6" id="1a" role="1B3o_S" />
        <node concept="2OqwBi" id="1b" role="33vP2m">
          <node concept="2YIFZM" id="1c" role="2Oq$k0">
            <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
            <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance()" resolve="getInstance" />
          </node>
          <node concept="liA8E" id="1d" role="2OqNvi">
            <ref role="37wK5l" to="dush:~PersistenceFacade.createNodeReference(java.lang.String)" resolve="createNodeReference" />
            <node concept="Xl_RD" id="1e" role="37wK5m">
              <property role="Xl_RC" value="r:468ba8cf-600f-433a-bdb1-b531836f79ca(Microservices.constraints)/4635545526457716238" />
            </node>
          </node>
        </node>
      </node>
      <node concept="Wx3nA" id="10" role="jymVt">
        <property role="3TUv4t" value="true" />
        <property role="TrG5h" value="ID_RestrictedPortNumber " />
        <node concept="3uibUv" id="1f" role="1tU5fm">
          <ref role="3uigEE" to="o99v:~RuleId" resolve="RuleId" />
        </node>
        <node concept="3Tm1VV" id="1g" role="1B3o_S" />
        <node concept="2ShNRf" id="1h" role="33vP2m">
          <node concept="1pGfFk" id="1i" role="2ShVmc">
            <ref role="37wK5l" to="o99v:~RuleId.&lt;init&gt;(long,java.lang.Object)" resolve="RuleId" />
            <node concept="1adDum" id="1j" role="37wK5m">
              <property role="1adDun" value="4635545526457716238L" />
            </node>
            <node concept="37vLTw" id="1k" role="37wK5m">
              <ref role="3cqZAo" node="Z" resolve="SOURCE_NODE_REF" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2tJIrI" id="11" role="jymVt" />
      <node concept="3clFbW" id="12" role="jymVt">
        <node concept="3cqZAl" id="1l" role="3clF45" />
        <node concept="3Tm1VV" id="1m" role="1B3o_S" />
        <node concept="3clFbS" id="1n" role="3clF47">
          <node concept="XkiVB" id="1o" role="3cqZAp">
            <ref role="37wK5l" to="o99v:~BaseRule.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept,jetbrains.mps.core.aspects.constraints.rules.RuleKind,jetbrains.mps.core.aspects.constraints.rules.RuleId,org.jetbrains.mps.openapi.model.SNodeReference)" resolve="BaseRule" />
            <node concept="37vLTw" id="1p" role="37wK5m">
              <ref role="3cqZAo" node="n" resolve="CONCEPT" />
            </node>
            <node concept="Rm8GO" id="1q" role="37wK5m">
              <ref role="1Px2BO" to="pdwk:~PredefinedRuleKinds" resolve="PredefinedRuleKinds" />
              <ref role="Rm8GQ" to="pdwk:~PredefinedRuleKinds.CAN_BE_CHILD" resolve="CAN_BE_CHILD" />
            </node>
            <node concept="37vLTw" id="1r" role="37wK5m">
              <ref role="3cqZAo" node="10" resolve="ID_RestrictedPortNumber " />
            </node>
            <node concept="37vLTw" id="1s" role="37wK5m">
              <ref role="3cqZAo" node="Z" resolve="SOURCE_NODE_REF" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2tJIrI" id="13" role="jymVt" />
      <node concept="3Tm1VV" id="14" role="1B3o_S" />
      <node concept="3clFb_" id="15" role="jymVt">
        <property role="TrG5h" value="check" />
        <node concept="37vLTG" id="1t" role="3clF46">
          <property role="TrG5h" value="context" />
          <node concept="2AHcQZ" id="1y" role="2AJF6D">
            <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
          </node>
          <node concept="3uibUv" id="1z" role="1tU5fm">
            <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          </node>
        </node>
        <node concept="3Tm1VV" id="1u" role="1B3o_S" />
        <node concept="10P_77" id="1v" role="3clF45" />
        <node concept="3clFbS" id="1w" role="3clF47">
          <node concept="3cpWs6" id="1$" role="3cqZAp">
            <node concept="3eOSWO" id="1_" role="3cqZAk">
              <uo k="s:originTrace" v="n:4635545526457724875" />
              <node concept="3cmrfG" id="1A" role="3uHU7w">
                <property role="3cmrfH" value="1024" />
                <uo k="s:originTrace" v="n:4635545526457725632" />
              </node>
              <node concept="2OqwBi" id="1B" role="3uHU7B">
                <uo k="s:originTrace" v="n:4635545526457718337" />
                <node concept="2OqwBi" id="1C" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4635545526457717677" />
                  <node concept="37vLTw" id="1E" role="2Oq$k0">
                    <ref role="3cqZAo" node="1t" resolve="context" />
                  </node>
                  <node concept="liA8E" id="1F" role="2OqNvi">
                    <ref role="37wK5l" to="pdwk:~ContainmentContext.getChildNode()" resolve="getChildNode" />
                  </node>
                </node>
                <node concept="3TrcHB" id="1D" role="2OqNvi">
                  <ref role="3TsBF5" to="u018:2SI27LbRF5G" resolve="Port" />
                  <uo k="s:originTrace" v="n:4635545526457721146" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="1x" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="2tJIrI" id="16" role="jymVt" />
      <node concept="3clFb_" id="17" role="jymVt">
        <property role="TrG5h" value="appliesTo" />
        <node concept="37vLTG" id="1G" role="3clF46">
          <property role="TrG5h" value="context" />
          <node concept="2AHcQZ" id="1L" role="2AJF6D">
            <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
          </node>
          <node concept="3uibUv" id="1M" role="1tU5fm">
            <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          </node>
        </node>
        <node concept="3Tm1VV" id="1H" role="1B3o_S" />
        <node concept="10P_77" id="1I" role="3clF45" />
        <node concept="3clFbS" id="1J" role="3clF47">
          <node concept="3cpWs6" id="1N" role="3cqZAp">
            <node concept="3clFbT" id="1O" role="3cqZAk">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="1K" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3uibUv" id="18" role="1zkMxy">
        <ref role="3uigEE" to="o99v:~BaseRule" resolve="BaseRule" />
        <node concept="3uibUv" id="1P" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="w" role="jymVt" />
    <node concept="3clFbW" id="x" role="jymVt">
      <property role="TrG5h" value="BaseConstraintsDescriptor2" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3cqZAl" id="1Q" role="3clF45">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3clFbS" id="1R" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="XkiVB" id="1S" role="3cqZAp">
          <ref role="37wK5l" to="o99v:~BaseRulesConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseRulesConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="37vLTw" id="1T" role="37wK5m">
            <ref role="3cqZAo" node="n" resolve="CONCEPT" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="y" role="1B3o_S">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="3uibUv" id="z" role="1zkMxy">
      <ref role="3uigEE" to="o99v:~BaseRulesConstraintsDescriptor" resolve="BaseRulesConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="15s5l7" id="$" role="lGtFl">
      <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: The classifier 'Generated_ConstraintsDescriptor2' must be declared abstract or implement abstract method 'getDeclaredRules' in 'RulesConstraintsDescriptor'&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/7861981782410371482]&quot;;" />
      <property role="huDt6" value="Error: The classifier 'Generated_ConstraintsDescriptor2' must be declared abstract or implement abstract method 'getDeclaredRules' in 'RulesConstraintsDescriptor'" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
  </node>
  <node concept="312cEu" id="1U">
    <property role="3GE5qa" value="Components" />
    <property role="1EXbeo" value="true" />
    <property role="TrG5h" value="Container_ConstraintsFeedback" />
    <uo k="s:originTrace" v="n:4635545526457716231" />
    <node concept="Wx3nA" id="1V" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="CONCEPT" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3Tm6S6" id="26" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="35c_gC" id="27" role="33vP2m">
        <ref role="35c_gD" to="u018:2SI27LbRF3n" resolve="Container" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3uibUv" id="28" role="1tU5fm">
        <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
    </node>
    <node concept="2tJIrI" id="1W" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="Wx3nA" id="1X" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="MSGPROVIDER_WhenConstraintRuleFails_ruyzqm_a" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3Tm6S6" id="29" role="1B3o_S" />
      <node concept="2ShNRf" id="2a" role="33vP2m">
        <node concept="YeOm9" id="2c" role="2ShVmc">
          <node concept="1Y3b0j" id="2d" role="YeSDq">
            <property role="2bfB8j" value="true" />
            <ref role="1Y3XeK" to="j809:~BaseMessageProvider" resolve="BaseMessageProvider" />
            <ref role="37wK5l" to="j809:~BaseMessageProvider.&lt;init&gt;(jetbrains.mps.core.aspects.feedback.problem.ProblemId)" resolve="BaseMessageProvider" />
            <node concept="2ShNRf" id="2e" role="37wK5m">
              <uo k="s:originTrace" v="n:4635545526457716231" />
              <node concept="1pGfFk" id="2i" role="2ShVmc">
                <ref role="37wK5l" to="j80a:~FailingRuleProblemId.&lt;init&gt;(jetbrains.mps.core.aspects.constraints.rules.RuleId)" resolve="FailingRuleProblemId" />
                <uo k="s:originTrace" v="n:4635545526457716231" />
                <node concept="10M0yZ" id="2j" role="37wK5m">
                  <ref role="3cqZAo" node="10" resolve="ID_RestrictedPortNumber " />
                  <ref role="1PxDUh" node="v" resolve="Container_ConstraintRules.Rule_RestrictedPortNumber " />
                  <uo k="s:originTrace" v="n:4635545526457716231" />
                </node>
              </node>
            </node>
            <node concept="3Tm1VV" id="2f" role="1B3o_S" />
            <node concept="3clFb_" id="2g" role="jymVt">
              <property role="TrG5h" value="yieldMessage" />
              <node concept="3Tm1VV" id="2k" role="1B3o_S" />
              <node concept="2AHcQZ" id="2l" role="2AJF6D">
                <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
              </node>
              <node concept="3uibUv" id="2m" role="3clF45">
                <ref role="3uigEE" to="j809:~MessageProvider$Msg" resolve="MessageProvider.Msg" />
              </node>
              <node concept="37vLTG" id="2n" role="3clF46">
                <property role="TrG5h" value="context" />
                <node concept="3uibUv" id="2q" role="1tU5fm">
                  <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
                  <uo k="s:originTrace" v="n:4635545526457716231" />
                </node>
              </node>
              <node concept="3clFbS" id="2o" role="3clF47">
                <node concept="3cpWs6" id="2r" role="3cqZAp">
                  <node concept="2ShNRf" id="2s" role="3cqZAk">
                    <node concept="1pGfFk" id="2t" role="2ShVmc">
                      <ref role="37wK5l" to="j809:~MessageProvider$StringMsg.&lt;init&gt;(java.lang.String)" resolve="MessageProvider.StringMsg" />
                      <node concept="Xl_RD" id="2u" role="37wK5m">
                        <property role="Xl_RC" value="Error: Usage of restricted port is not allowed." />
                        <uo k="s:originTrace" v="n:4635545526457726266" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2AHcQZ" id="2p" role="2AJF6D">
                <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
              </node>
            </node>
            <node concept="3uibUv" id="2h" role="2Ghqu4">
              <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
              <uo k="s:originTrace" v="n:4635545526457716231" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2b" role="1tU5fm">
        <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
        <node concept="3uibUv" id="2v" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="1Y" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="3Tm1VV" id="1Z" role="1B3o_S">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="Wx3nA" id="20" role="jymVt">
      <property role="TrG5h" value="PROVIDERS" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3uibUv" id="2w" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3uibUv" id="2z" role="11_B2D">
          <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
        </node>
      </node>
      <node concept="3Tm6S6" id="2x" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="2YIFZM" id="2y" role="33vP2m">
        <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
        <ref role="37wK5l" to="33ny:~Collections.unmodifiableList(java.util.List)" resolve="unmodifiableList" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="2YIFZM" id="2$" role="37wK5m">
          <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
          <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="3uibUv" id="2_" role="3PaCim">
            <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
          <node concept="37vLTw" id="2A" role="37wK5m">
            <ref role="3cqZAo" node="1X" resolve="MSGPROVIDER_WhenConstraintRuleFails_ruyzqm_a" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="21" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="3clFbW" id="22" role="jymVt">
      <property role="TrG5h" value="BaseMessageDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3cqZAl" id="2B" role="3clF45">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3Tm1VV" id="2C" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3clFbS" id="2D" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="XkiVB" id="2E" role="3cqZAp">
          <ref role="37wK5l" to="9jwd:~BaseFeedbackDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseFeedbackDescriptor" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="37vLTw" id="2F" role="37wK5m">
            <ref role="3cqZAo" node="1V" resolve="CONCEPT" />
            <uo k="s:originTrace" v="n:4635545526457716231" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="23" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
    <node concept="3clFb_" id="24" role="jymVt">
      <property role="TrG5h" value="getDeclaredProviders" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
      <node concept="3uibUv" id="2G" role="3clF45">
        <ref role="3uigEE" to="1ctc:~Stream" resolve="Stream" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3uibUv" id="2L" role="11_B2D">
          <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
          <uo k="s:originTrace" v="n:4635545526457716231" />
        </node>
      </node>
      <node concept="3Tm1VV" id="2H" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="3clFbS" id="2I" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457716231" />
        <node concept="3cpWs6" id="2M" role="3cqZAp">
          <uo k="s:originTrace" v="n:4635545526457716231" />
          <node concept="2OqwBi" id="2N" role="3cqZAk">
            <uo k="s:originTrace" v="n:4635545526457716231" />
            <node concept="37vLTw" id="2O" role="2Oq$k0">
              <ref role="3cqZAo" node="20" resolve="PROVIDERS" />
              <uo k="s:originTrace" v="n:4635545526457716231" />
            </node>
            <node concept="liA8E" id="2P" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Collection.stream()" resolve="stream" />
              <uo k="s:originTrace" v="n:4635545526457716231" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2J" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
      <node concept="2AHcQZ" id="2K" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4635545526457716231" />
      </node>
    </node>
    <node concept="3uibUv" id="25" role="1zkMxy">
      <ref role="3uigEE" to="9jwd:~BaseFeedbackDescriptor" resolve="BaseFeedbackDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457716231" />
    </node>
  </node>
  <node concept="312cEu" id="2Q">
    <property role="3GE5qa" value="" />
    <property role="1EXbeo" value="true" />
    <property role="TrG5h" value="GeneratedFeedbackAspectConstraints" />
    <node concept="3Tm1VV" id="2R" role="1B3o_S" />
    <node concept="3uibUv" id="2S" role="EKbjA">
      <ref role="3uigEE" to="9jwd:~FeedbackAspect" resolve="FeedbackAspect" />
    </node>
    <node concept="3clFb_" id="2T" role="jymVt">
      <property role="TrG5h" value="getPerConceptDescriptors" />
      <node concept="3Tm1VV" id="2U" role="1B3o_S" />
      <node concept="3uibUv" id="2V" role="3clF45">
        <ref role="3uigEE" to="1ctc:~Stream" resolve="Stream" />
        <node concept="3uibUv" id="2Z" role="11_B2D">
          <ref role="3uigEE" to="9jwd:~FeedbackPerConceptDescriptor" resolve="FeedbackPerConceptDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="2W" role="3clF47">
        <node concept="3cpWs6" id="30" role="3cqZAp">
          <node concept="2YIFZM" id="31" role="3cqZAk">
            <ref role="1Pybhc" to="1ctc:~Stream" resolve="Stream" />
            <ref role="37wK5l" to="1ctc:~Stream.of(java.lang.Object)" resolve="of" />
            <node concept="2ShNRf" id="32" role="37wK5m">
              <node concept="1pGfFk" id="34" role="2ShVmc">
                <ref role="37wK5l" node="6f" resolve="Microservice_ConstraintsFeedback" />
              </node>
            </node>
            <node concept="2ShNRf" id="33" role="37wK5m">
              <node concept="1pGfFk" id="35" role="2ShVmc">
                <ref role="37wK5l" node="22" resolve="Container_ConstraintsFeedback" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2X" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
      <node concept="2AHcQZ" id="2Y" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="36">
    <property role="TrG5h" value="GeneratedRulesConstraintsAspect" />
    <property role="1EXbeo" value="true" />
    <node concept="3Tm1VV" id="37" role="1B3o_S" />
    <node concept="3uibUv" id="38" role="EKbjA">
      <ref role="3uigEE" to="o99v:~RulesConstraintsAspect" resolve="RulesConstraintsAspect" />
    </node>
    <node concept="3clFb_" id="39" role="jymVt">
      <property role="TrG5h" value="getDescriptor" />
      <node concept="3Tm1VV" id="3a" role="1B3o_S" />
      <node concept="37vLTG" id="3b" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="3g" role="1tU5fm" />
        <node concept="2AHcQZ" id="3h" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="3uibUv" id="3c" role="3clF45">
        <ref role="3uigEE" to="o99v:~RulesConstraintsDescriptor" resolve="RulesConstraintsDescriptor" />
      </node>
      <node concept="3clFbS" id="3d" role="3clF47">
        <node concept="1_3QMa" id="3i" role="3cqZAp">
          <node concept="37vLTw" id="3k" role="1_3QMn">
            <ref role="3cqZAo" node="3b" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="3l" role="1_3QMm">
            <node concept="3clFbS" id="3o" role="1pnPq1">
              <node concept="3cpWs6" id="3q" role="3cqZAp">
                <node concept="2ShNRf" id="3r" role="3cqZAk">
                  <node concept="HV5vD" id="3s" role="2ShVmc">
                    <ref role="HV5vE" node="4z" resolve="Microservice_ConstraintRules" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="3p" role="1pnPq6">
              <ref role="3gnhBz" to="u018:2Sxx0SxVuE5" resolve="Microservice" />
            </node>
          </node>
          <node concept="1pnPoh" id="3m" role="1_3QMm">
            <node concept="3clFbS" id="3t" role="1pnPq1">
              <node concept="3cpWs6" id="3v" role="3cqZAp">
                <node concept="2ShNRf" id="3w" role="3cqZAk">
                  <node concept="HV5vD" id="3x" role="2ShVmc">
                    <ref role="HV5vE" node="m" resolve="Container_ConstraintRules" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="3u" role="1pnPq6">
              <ref role="3gnhBz" to="u018:2SI27LbRF3n" resolve="Container" />
            </node>
          </node>
          <node concept="3clFbS" id="3n" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="3j" role="3cqZAp">
          <node concept="10Nm6u" id="3y" role="3cqZAk" />
        </node>
      </node>
      <node concept="2AHcQZ" id="3e" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
      <node concept="2AHcQZ" id="3f" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="3z">
    <node concept="39e2AJ" id="3$" role="39e2AI">
      <property role="39e3Y2" value="constraints2RootClass" />
      <node concept="39e2AG" id="3H" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsS7" resolve="Container_ConstraintRules" />
        <node concept="385nmt" id="3J" role="385vvn">
          <property role="385vuF" value="Container_ConstraintRules" />
          <node concept="3u3nmq" id="3L" role="385v07">
            <property role="3u3nmv" value="4635545526457716231" />
          </node>
        </node>
        <node concept="39e2AT" id="3K" role="39e2AY">
          <ref role="39e2AS" node="m" resolve="Container_ConstraintRules" />
        </node>
      </node>
      <node concept="39e2AG" id="3I" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEbzR" resolve="Microservice_ConstraintRules" />
        <node concept="385nmt" id="3M" role="385vvn">
          <property role="385vuF" value="Microservice_ConstraintRules" />
          <node concept="3u3nmq" id="3O" role="385v07">
            <property role="3u3nmv" value="4635545526457645303" />
          </node>
        </node>
        <node concept="39e2AT" id="3N" role="39e2AY">
          <ref role="39e2AS" node="4z" resolve="Microservice_ConstraintRules" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3_" role="39e2AI">
      <property role="39e3Y2" value="feedbackMember" />
      <node concept="39e2AG" id="3P" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEb$1" />
        <node concept="385nmt" id="3R" role="385vvn">
          <property role="385vuF" value="show message" />
          <node concept="3u3nmq" id="3T" role="385v07">
            <property role="3u3nmv" value="4635545526457645303" />
          </node>
        </node>
        <node concept="39e2AT" id="3S" role="39e2AY">
          <ref role="39e2AS" node="6a" resolve="MSGPROVIDER_WhenConstraintRuleFails_lv5hxi_a" />
        </node>
      </node>
      <node concept="39e2AG" id="3Q" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsSc" />
        <node concept="385nmt" id="3U" role="385vvn">
          <property role="385vuF" value="show message" />
          <node concept="3u3nmq" id="3W" role="385v07">
            <property role="3u3nmv" value="4635545526457716231" />
          </node>
        </node>
        <node concept="39e2AT" id="3V" role="39e2AY">
          <ref role="39e2AS" node="1X" resolve="MSGPROVIDER_WhenConstraintRuleFails_ruyzqm_a" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3A" role="39e2AI">
      <property role="39e3Y2" value="ruleClass" />
      <node concept="39e2AG" id="3X" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEb$2" resolve="MicroserviceHealth " />
        <node concept="385nmt" id="3Z" role="385vvn">
          <property role="385vuF" value="MicroserviceHealth " />
          <node concept="3u3nmq" id="41" role="385v07">
            <property role="3u3nmv" value="4635545526457645314" />
          </node>
        </node>
        <node concept="39e2AT" id="40" role="39e2AY">
          <ref role="39e2AS" node="4G" resolve="Microservice_ConstraintRules.Rule_MicroserviceHealth " />
        </node>
      </node>
      <node concept="39e2AG" id="3Y" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsSe" resolve="RestrictedPortNumber " />
        <node concept="385nmt" id="42" role="385vvn">
          <property role="385vuF" value="RestrictedPortNumber " />
          <node concept="3u3nmq" id="44" role="385v07">
            <property role="3u3nmv" value="4635545526457716238" />
          </node>
        </node>
        <node concept="39e2AT" id="43" role="39e2AY">
          <ref role="39e2AS" node="v" resolve="Container_ConstraintRules.Rule_RestrictedPortNumber " />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3B" role="39e2AI">
      <property role="39e3Y2" value="ruleConstructor" />
      <node concept="39e2AG" id="45" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEb$2" resolve="MicroserviceHealth " />
        <node concept="385nmt" id="47" role="385vvn">
          <property role="385vuF" value="MicroserviceHealth " />
          <node concept="3u3nmq" id="49" role="385v07">
            <property role="3u3nmv" value="4635545526457645314" />
          </node>
        </node>
        <node concept="39e2AT" id="48" role="39e2AY">
          <ref role="39e2AS" node="5f" resolve="Microservice_ConstraintRules.Rule_MicroserviceHealth " />
        </node>
      </node>
      <node concept="39e2AG" id="46" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsSe" resolve="RestrictedPortNumber " />
        <node concept="385nmt" id="4a" role="385vvn">
          <property role="385vuF" value="RestrictedPortNumber " />
          <node concept="3u3nmq" id="4c" role="385v07">
            <property role="3u3nmv" value="4635545526457716238" />
          </node>
        </node>
        <node concept="39e2AT" id="4b" role="39e2AY">
          <ref role="39e2AS" node="12" resolve="Container_ConstraintRules.Rule_RestrictedPortNumber " />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3C" role="39e2AI">
      <property role="39e3Y2" value="ruleField" />
      <node concept="39e2AG" id="4d" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEb$2" resolve="MicroserviceHealth " />
        <node concept="385nmt" id="4f" role="385vvn">
          <property role="385vuF" value="MicroserviceHealth " />
          <node concept="3u3nmq" id="4h" role="385v07">
            <property role="3u3nmv" value="4635545526457645314" />
          </node>
        </node>
        <node concept="39e2AT" id="4g" role="39e2AY">
          <ref role="39e2AS" node="4A" resolve="check_id4635545526457645314" />
        </node>
      </node>
      <node concept="39e2AG" id="4e" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsSe" resolve="RestrictedPortNumber " />
        <node concept="385nmt" id="4i" role="385vvn">
          <property role="385vuF" value="RestrictedPortNumber " />
          <node concept="3u3nmq" id="4k" role="385v07">
            <property role="3u3nmv" value="4635545526457716238" />
          </node>
        </node>
        <node concept="39e2AT" id="4j" role="39e2AY">
          <ref role="39e2AS" node="p" resolve="check_id4635545526457716238" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3D" role="39e2AI">
      <property role="39e3Y2" value="ruleID" />
      <node concept="39e2AG" id="4l" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEb$2" resolve="MicroserviceHealth " />
        <node concept="385nmt" id="4n" role="385vvn">
          <property role="385vuF" value="MicroserviceHealth " />
          <node concept="3u3nmq" id="4p" role="385v07">
            <property role="3u3nmv" value="4635545526457645314" />
          </node>
        </node>
        <node concept="39e2AT" id="4o" role="39e2AY">
          <ref role="39e2AS" node="5d" resolve="ID_MicroserviceHealth " />
        </node>
      </node>
      <node concept="39e2AG" id="4m" role="39e3Y0">
        <ref role="39e2AK" to="8w0e:41kL1ysEsSe" resolve="RestrictedPortNumber " />
        <node concept="385nmt" id="4q" role="385vvn">
          <property role="385vuF" value="RestrictedPortNumber " />
          <node concept="3u3nmq" id="4s" role="385v07">
            <property role="3u3nmv" value="4635545526457716238" />
          </node>
        </node>
        <node concept="39e2AT" id="4r" role="39e2AY">
          <ref role="39e2AS" node="10" resolve="ID_RestrictedPortNumber " />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3E" role="39e2AI">
      <property role="39e3Y2" value="aspectDescriptorClass" />
      <node concept="39e2AG" id="4t" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="4u" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConstraintsAspectDescriptor" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3F" role="39e2AI">
      <property role="39e3Y2" value="feedbackAspectClass" />
      <node concept="39e2AG" id="4v" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="4w" role="39e2AY">
          <ref role="39e2AS" node="2Q" resolve="GeneratedFeedbackAspectConstraints" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3G" role="39e2AI">
      <property role="39e3Y2" value="constraints2DescriptorClass" />
      <node concept="39e2AG" id="4x" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="4y" role="39e2AY">
          <ref role="39e2AS" node="36" resolve="GeneratedRulesConstraintsAspect" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="4z">
    <property role="1EXbeo" value="true" />
    <property role="TrG5h" value="Microservice_ConstraintRules" />
    <property role="3GE5qa" value="Components" />
    <uo k="s:originTrace" v="n:4635545526457645303" />
    <node concept="Wx3nA" id="4$" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="CONCEPT" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3Tm6S6" id="4M" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="35c_gC" id="4N" role="33vP2m">
        <ref role="35c_gD" to="u018:2Sxx0SxVuE5" resolve="Microservice" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3uibUv" id="4O" role="1tU5fm">
        <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
    </node>
    <node concept="2tJIrI" id="4_" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="Wx3nA" id="4A" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="check_id4635545526457645314" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3uibUv" id="4P" role="1tU5fm">
        <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3uibUv" id="4S" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
        </node>
      </node>
      <node concept="3Tm1VV" id="4Q" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="2ShNRf" id="4R" role="33vP2m">
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="1pGfFk" id="4T" role="2ShVmc">
          <ref role="37wK5l" node="5f" resolve="Microservice_ConstraintRules.Rule_MicroserviceHealth " />
          <uo k="s:originTrace" v="n:4635545526457645303" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4B" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="Wx3nA" id="4C" role="jymVt">
      <property role="TrG5h" value="RULES" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3uibUv" id="4U" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3uibUv" id="4X" role="11_B2D">
          <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="3qTvmN" id="4Y" role="11_B2D">
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="4V" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="2YIFZM" id="4W" role="33vP2m">
        <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
        <ref role="37wK5l" to="33ny:~Collections.unmodifiableList(java.util.List)" resolve="unmodifiableList" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="2YIFZM" id="4Z" role="37wK5m">
          <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
          <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="3uibUv" id="50" role="3PaCim">
            <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
            <node concept="3qTvmN" id="52" role="11_B2D">
              <uo k="s:originTrace" v="n:4635545526457645303" />
            </node>
          </node>
          <node concept="37vLTw" id="51" role="37wK5m">
            <ref role="3cqZAo" node="4A" resolve="check_id4635545526457645314" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4D" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="3clFb_" id="4E" role="jymVt">
      <property role="TrG5h" value="getDeclaredRules" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3Tm1VV" id="53" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="2AHcQZ" id="54" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3uibUv" id="55" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3uibUv" id="58" role="11_B2D">
          <ref role="3uigEE" to="o99v:~Rule" resolve="Rule" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="3qTvmN" id="59" role="11_B2D">
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
      <node concept="3clFbS" id="56" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3cpWs6" id="5a" role="3cqZAp">
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="37vLTw" id="5b" role="3cqZAk">
            <ref role="3cqZAo" node="4C" resolve="RULES" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="57" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
    </node>
    <node concept="2tJIrI" id="4F" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="312cEu" id="4G" role="jymVt">
      <property role="1EXbeo" value="true" />
      <property role="TrG5h" value="Rule_MicroserviceHealth " />
      <uo k="s:originTrace" v="n:4635545526457645314" />
      <node concept="Wx3nA" id="5c" role="jymVt">
        <property role="TrG5h" value="SOURCE_NODE_REF" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="5m" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
        </node>
        <node concept="3Tm6S6" id="5n" role="1B3o_S" />
        <node concept="2OqwBi" id="5o" role="33vP2m">
          <node concept="2YIFZM" id="5p" role="2Oq$k0">
            <ref role="1Pybhc" to="dush:~PersistenceFacade" resolve="PersistenceFacade" />
            <ref role="37wK5l" to="dush:~PersistenceFacade.getInstance()" resolve="getInstance" />
          </node>
          <node concept="liA8E" id="5q" role="2OqNvi">
            <ref role="37wK5l" to="dush:~PersistenceFacade.createNodeReference(java.lang.String)" resolve="createNodeReference" />
            <node concept="Xl_RD" id="5r" role="37wK5m">
              <property role="Xl_RC" value="r:468ba8cf-600f-433a-bdb1-b531836f79ca(Microservices.constraints)/4635545526457645314" />
            </node>
          </node>
        </node>
      </node>
      <node concept="Wx3nA" id="5d" role="jymVt">
        <property role="3TUv4t" value="true" />
        <property role="TrG5h" value="ID_MicroserviceHealth " />
        <node concept="3uibUv" id="5s" role="1tU5fm">
          <ref role="3uigEE" to="o99v:~RuleId" resolve="RuleId" />
        </node>
        <node concept="3Tm1VV" id="5t" role="1B3o_S" />
        <node concept="2ShNRf" id="5u" role="33vP2m">
          <node concept="1pGfFk" id="5v" role="2ShVmc">
            <ref role="37wK5l" to="o99v:~RuleId.&lt;init&gt;(long,java.lang.Object)" resolve="RuleId" />
            <node concept="1adDum" id="5w" role="37wK5m">
              <property role="1adDun" value="4635545526457645314L" />
            </node>
            <node concept="37vLTw" id="5x" role="37wK5m">
              <ref role="3cqZAo" node="5c" resolve="SOURCE_NODE_REF" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2tJIrI" id="5e" role="jymVt" />
      <node concept="3clFbW" id="5f" role="jymVt">
        <node concept="3cqZAl" id="5y" role="3clF45" />
        <node concept="3Tm1VV" id="5z" role="1B3o_S" />
        <node concept="3clFbS" id="5$" role="3clF47">
          <node concept="XkiVB" id="5_" role="3cqZAp">
            <ref role="37wK5l" to="o99v:~BaseRule.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept,jetbrains.mps.core.aspects.constraints.rules.RuleKind,jetbrains.mps.core.aspects.constraints.rules.RuleId,org.jetbrains.mps.openapi.model.SNodeReference)" resolve="BaseRule" />
            <node concept="37vLTw" id="5A" role="37wK5m">
              <ref role="3cqZAo" node="4$" resolve="CONCEPT" />
            </node>
            <node concept="Rm8GO" id="5B" role="37wK5m">
              <ref role="1Px2BO" to="pdwk:~PredefinedRuleKinds" resolve="PredefinedRuleKinds" />
              <ref role="Rm8GQ" to="pdwk:~PredefinedRuleKinds.CAN_BE_CHILD" resolve="CAN_BE_CHILD" />
            </node>
            <node concept="37vLTw" id="5C" role="37wK5m">
              <ref role="3cqZAo" node="5d" resolve="ID_MicroserviceHealth " />
            </node>
            <node concept="37vLTw" id="5D" role="37wK5m">
              <ref role="3cqZAo" node="5c" resolve="SOURCE_NODE_REF" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2tJIrI" id="5g" role="jymVt" />
      <node concept="3Tm1VV" id="5h" role="1B3o_S" />
      <node concept="3clFb_" id="5i" role="jymVt">
        <property role="TrG5h" value="check" />
        <node concept="37vLTG" id="5E" role="3clF46">
          <property role="TrG5h" value="context" />
          <node concept="2AHcQZ" id="5J" role="2AJF6D">
            <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
          </node>
          <node concept="3uibUv" id="5K" role="1tU5fm">
            <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          </node>
        </node>
        <node concept="3Tm1VV" id="5F" role="1B3o_S" />
        <node concept="10P_77" id="5G" role="3clF45" />
        <node concept="3clFbS" id="5H" role="3clF47">
          <node concept="3cpWs6" id="5L" role="3cqZAp">
            <node concept="17R0WA" id="5M" role="3cqZAk">
              <uo k="s:originTrace" v="n:4635545526457672936" />
              <node concept="3clFbT" id="5N" role="3uHU7w">
                <property role="3clFbU" value="true" />
                <uo k="s:originTrace" v="n:4635545526457673126" />
              </node>
              <node concept="2OqwBi" id="5O" role="3uHU7B">
                <uo k="s:originTrace" v="n:4635545526457661347" />
                <node concept="2OqwBi" id="5P" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:4635545526457657797" />
                  <node concept="37vLTw" id="5R" role="2Oq$k0">
                    <ref role="3cqZAo" node="5E" resolve="context" />
                  </node>
                  <node concept="liA8E" id="5S" role="2OqNvi">
                    <ref role="37wK5l" to="pdwk:~ContainmentContext.getChildNode()" resolve="getChildNode" />
                  </node>
                </node>
                <node concept="3TrcHB" id="5Q" role="2OqNvi">
                  <ref role="3TsBF5" to="u018:2SI27LbRKw8" resolve="Health" />
                  <uo k="s:originTrace" v="n:4635545526457664079" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="5I" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="2tJIrI" id="5j" role="jymVt" />
      <node concept="3clFb_" id="5k" role="jymVt">
        <property role="TrG5h" value="appliesTo" />
        <node concept="37vLTG" id="5T" role="3clF46">
          <property role="TrG5h" value="context" />
          <node concept="2AHcQZ" id="5Y" role="2AJF6D">
            <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
          </node>
          <node concept="3uibUv" id="5Z" role="1tU5fm">
            <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          </node>
        </node>
        <node concept="3Tm1VV" id="5U" role="1B3o_S" />
        <node concept="10P_77" id="5V" role="3clF45" />
        <node concept="3clFbS" id="5W" role="3clF47">
          <node concept="3cpWs6" id="60" role="3cqZAp">
            <node concept="3clFbT" id="61" role="3cqZAk">
              <property role="3clFbU" value="true" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="5X" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        </node>
      </node>
      <node concept="3uibUv" id="5l" role="1zkMxy">
        <ref role="3uigEE" to="o99v:~BaseRule" resolve="BaseRule" />
        <node concept="3uibUv" id="62" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4H" role="jymVt" />
    <node concept="3clFbW" id="4I" role="jymVt">
      <property role="TrG5h" value="BaseConstraintsDescriptor2" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3cqZAl" id="63" role="3clF45">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3clFbS" id="64" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="XkiVB" id="65" role="3cqZAp">
          <ref role="37wK5l" to="o99v:~BaseRulesConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseRulesConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="37vLTw" id="66" role="37wK5m">
            <ref role="3cqZAo" node="4$" resolve="CONCEPT" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="4J" role="1B3o_S">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="3uibUv" id="4K" role="1zkMxy">
      <ref role="3uigEE" to="o99v:~BaseRulesConstraintsDescriptor" resolve="BaseRulesConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="15s5l7" id="4L" role="lGtFl">
      <property role="1eyWvh" value="FLAVOUR_ISSUE_KIND=&quot;typesystem (typesystem)&quot;;FLAVOUR_MESSAGE=&quot;Error: The classifier 'Generated_ConstraintsDescriptor2' must be declared abstract or implement abstract method 'getDeclaredRules' in 'RulesConstraintsDescriptor'&quot;;FLAVOUR_RULE_ID=&quot;[r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)/7861981782410371482]&quot;;" />
      <property role="huDt6" value="Error: The classifier 'Generated_ConstraintsDescriptor2' must be declared abstract or implement abstract method 'getDeclaredRules' in 'RulesConstraintsDescriptor'" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
  </node>
  <node concept="312cEu" id="67">
    <property role="3GE5qa" value="Components" />
    <property role="1EXbeo" value="true" />
    <property role="TrG5h" value="Microservice_ConstraintsFeedback" />
    <uo k="s:originTrace" v="n:4635545526457645303" />
    <node concept="Wx3nA" id="68" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="TrG5h" value="CONCEPT" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3Tm6S6" id="6j" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="35c_gC" id="6k" role="33vP2m">
        <ref role="35c_gD" to="u018:2Sxx0SxVuE5" resolve="Microservice" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3uibUv" id="6l" role="1tU5fm">
        <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
    </node>
    <node concept="2tJIrI" id="69" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="Wx3nA" id="6a" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="MSGPROVIDER_WhenConstraintRuleFails_lv5hxi_a" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3Tm6S6" id="6m" role="1B3o_S" />
      <node concept="2ShNRf" id="6n" role="33vP2m">
        <node concept="YeOm9" id="6p" role="2ShVmc">
          <node concept="1Y3b0j" id="6q" role="YeSDq">
            <property role="2bfB8j" value="true" />
            <ref role="1Y3XeK" to="j809:~BaseMessageProvider" resolve="BaseMessageProvider" />
            <ref role="37wK5l" to="j809:~BaseMessageProvider.&lt;init&gt;(jetbrains.mps.core.aspects.feedback.problem.ProblemId)" resolve="BaseMessageProvider" />
            <node concept="2ShNRf" id="6r" role="37wK5m">
              <uo k="s:originTrace" v="n:4635545526457645303" />
              <node concept="1pGfFk" id="6v" role="2ShVmc">
                <ref role="37wK5l" to="j80a:~FailingRuleProblemId.&lt;init&gt;(jetbrains.mps.core.aspects.constraints.rules.RuleId)" resolve="FailingRuleProblemId" />
                <uo k="s:originTrace" v="n:4635545526457645303" />
                <node concept="10M0yZ" id="6w" role="37wK5m">
                  <ref role="3cqZAo" node="5d" resolve="ID_MicroserviceHealth " />
                  <ref role="1PxDUh" node="4G" resolve="Microservice_ConstraintRules.Rule_MicroserviceHealth " />
                  <uo k="s:originTrace" v="n:4635545526457645303" />
                </node>
              </node>
            </node>
            <node concept="3Tm1VV" id="6s" role="1B3o_S" />
            <node concept="3clFb_" id="6t" role="jymVt">
              <property role="TrG5h" value="yieldMessage" />
              <node concept="3Tm1VV" id="6x" role="1B3o_S" />
              <node concept="2AHcQZ" id="6y" role="2AJF6D">
                <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
              </node>
              <node concept="3uibUv" id="6z" role="3clF45">
                <ref role="3uigEE" to="j809:~MessageProvider$Msg" resolve="MessageProvider.Msg" />
              </node>
              <node concept="37vLTG" id="6$" role="3clF46">
                <property role="TrG5h" value="context" />
                <node concept="3uibUv" id="6B" role="1tU5fm">
                  <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
                  <uo k="s:originTrace" v="n:4635545526457645303" />
                </node>
              </node>
              <node concept="3clFbS" id="6_" role="3clF47">
                <node concept="3cpWs6" id="6C" role="3cqZAp">
                  <node concept="2ShNRf" id="6D" role="3cqZAk">
                    <node concept="1pGfFk" id="6E" role="2ShVmc">
                      <ref role="37wK5l" to="j809:~MessageProvider$StringMsg.&lt;init&gt;(java.lang.String)" resolve="MessageProvider.StringMsg" />
                      <node concept="Xl_RD" id="6F" role="37wK5m">
                        <property role="Xl_RC" value="Error: Communication cannot be done because microservice is down." />
                        <uo k="s:originTrace" v="n:4635545526457673255" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2AHcQZ" id="6A" role="2AJF6D">
                <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
              </node>
            </node>
            <node concept="3uibUv" id="6u" role="2Ghqu4">
              <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
              <uo k="s:originTrace" v="n:4635545526457645303" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="6o" role="1tU5fm">
        <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
        <node concept="3uibUv" id="6G" role="11_B2D">
          <ref role="3uigEE" to="pdwk:~ContainmentContext" resolve="ContainmentContext" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6b" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="3Tm1VV" id="6c" role="1B3o_S">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="Wx3nA" id="6d" role="jymVt">
      <property role="TrG5h" value="PROVIDERS" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3uibUv" id="6H" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3uibUv" id="6K" role="11_B2D">
          <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
        </node>
      </node>
      <node concept="3Tm6S6" id="6I" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="2YIFZM" id="6J" role="33vP2m">
        <ref role="1Pybhc" to="33ny:~Collections" resolve="Collections" />
        <ref role="37wK5l" to="33ny:~Collections.unmodifiableList(java.util.List)" resolve="unmodifiableList" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="2YIFZM" id="6L" role="37wK5m">
          <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
          <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="3uibUv" id="6M" role="3PaCim">
            <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
          <node concept="37vLTw" id="6N" role="37wK5m">
            <ref role="3cqZAo" node="6a" resolve="MSGPROVIDER_WhenConstraintRuleFails_lv5hxi_a" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6e" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="3clFbW" id="6f" role="jymVt">
      <property role="TrG5h" value="BaseMessageDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3cqZAl" id="6O" role="3clF45">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3Tm1VV" id="6P" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3clFbS" id="6Q" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="XkiVB" id="6R" role="3cqZAp">
          <ref role="37wK5l" to="9jwd:~BaseFeedbackDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseFeedbackDescriptor" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="37vLTw" id="6S" role="37wK5m">
            <ref role="3cqZAo" node="68" resolve="CONCEPT" />
            <uo k="s:originTrace" v="n:4635545526457645303" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6g" role="jymVt">
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
    <node concept="3clFb_" id="6h" role="jymVt">
      <property role="TrG5h" value="getDeclaredProviders" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
      <node concept="3uibUv" id="6T" role="3clF45">
        <ref role="3uigEE" to="1ctc:~Stream" resolve="Stream" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3uibUv" id="6Y" role="11_B2D">
          <ref role="3uigEE" to="9jwd:~FeedbackProvider" resolve="FeedbackProvider" />
          <uo k="s:originTrace" v="n:4635545526457645303" />
        </node>
      </node>
      <node concept="3Tm1VV" id="6U" role="1B3o_S">
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="3clFbS" id="6V" role="3clF47">
        <uo k="s:originTrace" v="n:4635545526457645303" />
        <node concept="3cpWs6" id="6Z" role="3cqZAp">
          <uo k="s:originTrace" v="n:4635545526457645303" />
          <node concept="2OqwBi" id="70" role="3cqZAk">
            <uo k="s:originTrace" v="n:4635545526457645303" />
            <node concept="37vLTw" id="71" role="2Oq$k0">
              <ref role="3cqZAo" node="6d" resolve="PROVIDERS" />
              <uo k="s:originTrace" v="n:4635545526457645303" />
            </node>
            <node concept="liA8E" id="72" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Collection.stream()" resolve="stream" />
              <uo k="s:originTrace" v="n:4635545526457645303" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6W" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
      <node concept="2AHcQZ" id="6X" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4635545526457645303" />
      </node>
    </node>
    <node concept="3uibUv" id="6i" role="1zkMxy">
      <ref role="3uigEE" to="9jwd:~BaseFeedbackDescriptor" resolve="BaseFeedbackDescriptor" />
      <uo k="s:originTrace" v="n:4635545526457645303" />
    </node>
  </node>
</model>

