<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f86ca3b(checkpoints/MicroserviceArchitectureLanguage.structure@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="u018" ref="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)" />
    <import index="ksn4" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.smodel(MPS.Core/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="bzg8" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.impl(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
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
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg">
        <property id="8606350594693632173" name="isTransient" index="eg7rD" />
        <property id="1240249534625" name="isVolatile" index="34CwA1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
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
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
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
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242867" name="jetbrains.mps.baseLanguage.structure.LongType" flags="in" index="3cpWsb" />
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
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
      <concept id="1163670490218" name="jetbrains.mps.baseLanguage.structure.SwitchStatement" flags="nn" index="3KaCP$">
        <child id="1163670592366" name="defaultBlock" index="3Kb1Dw" />
        <child id="1163670766145" name="expression" index="3KbGdf" />
        <child id="1163670772911" name="case" index="3KbHQx" />
      </concept>
      <concept id="1163670641947" name="jetbrains.mps.baseLanguage.structure.SwitchCase" flags="ng" index="3KbdKl">
        <child id="1163670677455" name="expression" index="3Kbmr1" />
        <child id="1163670683720" name="body" index="3Kbo56" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
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
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConceptPresentationAspectImpl" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~ConceptPresentationAspectBase" resolve="ConceptPresentationAspectBase" />
    </node>
    <node concept="312cEg" id="2" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Communicates" />
      <node concept="3uibUv" id="c" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="d" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_CommunicationProtocol" />
      <node concept="3uibUv" id="e" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="f" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Container" />
      <node concept="3uibUv" id="g" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="h" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Environment" />
      <node concept="3uibUv" id="i" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="j" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_Microservice" />
      <node concept="3uibUv" id="k" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="l" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="7" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ServerNode" />
      <node concept="3uibUv" id="m" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="n" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="8" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_VirtualMachine" />
      <node concept="3uibUv" id="o" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="p" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="9" role="1B3o_S" />
    <node concept="2tJIrI" id="a" role="jymVt" />
    <node concept="3clFb_" id="b" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="q" role="1B3o_S" />
      <node concept="37vLTG" id="r" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="w" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="s" role="3clF47">
        <node concept="3cpWs8" id="x" role="3cqZAp">
          <node concept="3cpWsn" id="$" role="3cpWs9">
            <property role="TrG5h" value="structureDescriptor" />
            <node concept="3uibUv" id="_" role="1tU5fm">
              <ref role="3uigEE" node="gH" resolve="StructureAspectDescriptor" />
            </node>
            <node concept="10QFUN" id="A" role="33vP2m">
              <node concept="3uibUv" id="B" role="10QFUM">
                <ref role="3uigEE" node="gH" resolve="StructureAspectDescriptor" />
              </node>
              <node concept="2OqwBi" id="C" role="10QFUP">
                <node concept="37vLTw" id="D" role="2Oq$k0">
                  <ref role="3cqZAo" to="ze1i:~ConceptPresentationAspectBase.myLanguageRuntime" resolve="myLanguageRuntime" />
                </node>
                <node concept="liA8E" id="E" role="2OqNvi">
                  <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class)" resolve="getAspect" />
                  <node concept="3VsKOn" id="F" role="37wK5m">
                    <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="y" role="3cqZAp">
          <node concept="2OqwBi" id="G" role="3KbGdf">
            <node concept="37vLTw" id="O" role="2Oq$k0">
              <ref role="3cqZAo" node="$" resolve="structureDescriptor" />
            </node>
            <node concept="liA8E" id="P" role="2OqNvi">
              <ref role="37wK5l" node="h9" resolve="internalIndex" />
              <node concept="37vLTw" id="Q" role="37wK5m">
                <ref role="3cqZAo" node="r" resolve="c" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="H" role="3KbHQx">
            <node concept="3clFbS" id="R" role="3Kbo56">
              <node concept="3clFbJ" id="T" role="3cqZAp">
                <node concept="3clFbS" id="V" role="3clFbx">
                  <node concept="3cpWs8" id="X" role="3cqZAp">
                    <node concept="3cpWsn" id="10" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="11" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="12" role="33vP2m">
                        <node concept="1pGfFk" id="13" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="Y" role="3cqZAp">
                    <node concept="2OqwBi" id="14" role="3clFbG">
                      <node concept="37vLTw" id="15" role="2Oq$k0">
                        <ref role="3cqZAo" node="10" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="16" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:4620520544108499460" />
                        <node concept="Xl_RD" id="17" role="37wK5m">
                          <property role="Xl_RC" value="comm" />
                          <uo k="s:originTrace" v="n:4620520544108499460" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="Z" role="3cqZAp">
                    <node concept="37vLTI" id="18" role="3clFbG">
                      <node concept="2OqwBi" id="19" role="37vLTx">
                        <node concept="37vLTw" id="1b" role="2Oq$k0">
                          <ref role="3cqZAo" node="10" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1c" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1a" role="37vLTJ">
                        <ref role="3cqZAo" node="2" resolve="props_Communicates" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="W" role="3clFbw">
                  <node concept="10Nm6u" id="1d" role="3uHU7w" />
                  <node concept="37vLTw" id="1e" role="3uHU7B">
                    <ref role="3cqZAo" node="2" resolve="props_Communicates" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="U" role="3cqZAp">
                <node concept="37vLTw" id="1f" role="3cqZAk">
                  <ref role="3cqZAo" node="2" resolve="props_Communicates" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="S" role="3Kbmr1">
              <ref role="3cqZAo" node="eV" resolve="Communicates" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="I" role="3KbHQx">
            <node concept="3clFbS" id="1g" role="3Kbo56">
              <node concept="3clFbJ" id="1i" role="3cqZAp">
                <node concept="3clFbS" id="1k" role="3clFbx">
                  <node concept="3cpWs8" id="1m" role="3cqZAp">
                    <node concept="3cpWsn" id="1q" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1r" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1s" role="33vP2m">
                        <node concept="1pGfFk" id="1t" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1n" role="3cqZAp">
                    <node concept="2OqwBi" id="1u" role="3clFbG">
                      <node concept="37vLTw" id="1v" role="2Oq$k0">
                        <ref role="3cqZAo" node="1q" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1w" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="1x" role="37wK5m">
                          <property role="Xl_RC" value="A meta class for communication between microservices" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1o" role="3cqZAp">
                    <node concept="2OqwBi" id="1y" role="3clFbG">
                      <node concept="37vLTw" id="1z" role="2Oq$k0">
                        <ref role="3cqZAo" node="1q" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1$" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String)" resolve="rawPresentation" />
                        <uo k="s:originTrace" v="n:3327606504615249935" />
                        <node concept="Xl_RD" id="1_" role="37wK5m">
                          <property role="Xl_RC" value="comm. protocol" />
                          <uo k="s:originTrace" v="n:3327606504615249935" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1p" role="3cqZAp">
                    <node concept="37vLTI" id="1A" role="3clFbG">
                      <node concept="2OqwBi" id="1B" role="37vLTx">
                        <node concept="37vLTw" id="1D" role="2Oq$k0">
                          <ref role="3cqZAo" node="1q" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1E" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1C" role="37vLTJ">
                        <ref role="3cqZAo" node="3" resolve="props_CommunicationProtocol" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1l" role="3clFbw">
                  <node concept="10Nm6u" id="1F" role="3uHU7w" />
                  <node concept="37vLTw" id="1G" role="3uHU7B">
                    <ref role="3cqZAo" node="3" resolve="props_CommunicationProtocol" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1j" role="3cqZAp">
                <node concept="37vLTw" id="1H" role="3cqZAk">
                  <ref role="3cqZAo" node="3" resolve="props_CommunicationProtocol" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1h" role="3Kbmr1">
              <ref role="3cqZAo" node="eW" resolve="CommunicationProtocol" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="J" role="3KbHQx">
            <node concept="3clFbS" id="1I" role="3Kbo56">
              <node concept="3clFbJ" id="1K" role="3cqZAp">
                <node concept="3clFbS" id="1M" role="3clFbx">
                  <node concept="3cpWs8" id="1O" role="3cqZAp">
                    <node concept="3cpWsn" id="1S" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1T" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1U" role="33vP2m">
                        <node concept="1pGfFk" id="1V" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1P" role="3cqZAp">
                    <node concept="2OqwBi" id="1W" role="3clFbG">
                      <node concept="37vLTw" id="1X" role="2Oq$k0">
                        <ref role="3cqZAo" node="1S" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1Y" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="1Z" role="37wK5m">
                          <property role="Xl_RC" value="A meta class for container which will host docker image having microservice" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1Q" role="3cqZAp">
                    <node concept="2OqwBi" id="20" role="3clFbG">
                      <node concept="37vLTw" id="21" role="2Oq$k0">
                        <ref role="3cqZAo" node="1S" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="22" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:3327606504615227607" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1R" role="3cqZAp">
                    <node concept="37vLTI" id="23" role="3clFbG">
                      <node concept="2OqwBi" id="24" role="37vLTx">
                        <node concept="37vLTw" id="26" role="2Oq$k0">
                          <ref role="3cqZAo" node="1S" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="27" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="25" role="37vLTJ">
                        <ref role="3cqZAo" node="4" resolve="props_Container" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1N" role="3clFbw">
                  <node concept="10Nm6u" id="28" role="3uHU7w" />
                  <node concept="37vLTw" id="29" role="3uHU7B">
                    <ref role="3cqZAo" node="4" resolve="props_Container" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1L" role="3cqZAp">
                <node concept="37vLTw" id="2a" role="3cqZAk">
                  <ref role="3cqZAo" node="4" resolve="props_Container" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1J" role="3Kbmr1">
              <ref role="3cqZAo" node="eX" resolve="Container" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="K" role="3KbHQx">
            <node concept="3clFbS" id="2b" role="3Kbo56">
              <node concept="3clFbJ" id="2d" role="3cqZAp">
                <node concept="3clFbS" id="2f" role="3clFbx">
                  <node concept="3cpWs8" id="2h" role="3cqZAp">
                    <node concept="3cpWsn" id="2l" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2m" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2n" role="33vP2m">
                        <node concept="1pGfFk" id="2o" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2i" role="3cqZAp">
                    <node concept="2OqwBi" id="2p" role="3clFbG">
                      <node concept="37vLTw" id="2q" role="2Oq$k0">
                        <ref role="3cqZAo" node="2l" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2r" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="2s" role="37wK5m">
                          <property role="Xl_RC" value="Meta class for environment hosting microservice architecture based application" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2j" role="3cqZAp">
                    <node concept="2OqwBi" id="2t" role="3clFbG">
                      <node concept="37vLTw" id="2u" role="2Oq$k0">
                        <ref role="3cqZAo" node="2l" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2v" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:3327606504615227675" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2k" role="3cqZAp">
                    <node concept="37vLTI" id="2w" role="3clFbG">
                      <node concept="2OqwBi" id="2x" role="37vLTx">
                        <node concept="37vLTw" id="2z" role="2Oq$k0">
                          <ref role="3cqZAo" node="2l" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2$" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2y" role="37vLTJ">
                        <ref role="3cqZAo" node="5" resolve="props_Environment" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2g" role="3clFbw">
                  <node concept="10Nm6u" id="2_" role="3uHU7w" />
                  <node concept="37vLTw" id="2A" role="3uHU7B">
                    <ref role="3cqZAo" node="5" resolve="props_Environment" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2e" role="3cqZAp">
                <node concept="37vLTw" id="2B" role="3cqZAk">
                  <ref role="3cqZAo" node="5" resolve="props_Environment" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2c" role="3Kbmr1">
              <ref role="3cqZAo" node="eY" resolve="Environment" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="L" role="3KbHQx">
            <node concept="3clFbS" id="2C" role="3Kbo56">
              <node concept="3clFbJ" id="2E" role="3cqZAp">
                <node concept="3clFbS" id="2G" role="3clFbx">
                  <node concept="3cpWs8" id="2I" role="3cqZAp">
                    <node concept="3cpWsn" id="2M" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2N" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2O" role="33vP2m">
                        <node concept="1pGfFk" id="2P" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2J" role="3cqZAp">
                    <node concept="2OqwBi" id="2Q" role="3clFbG">
                      <node concept="37vLTw" id="2R" role="2Oq$k0">
                        <ref role="3cqZAo" node="2M" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2S" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="2T" role="37wK5m">
                          <property role="Xl_RC" value="A meta class for microservice to be hosted inside container" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2K" role="3cqZAp">
                    <node concept="2OqwBi" id="2U" role="3clFbG">
                      <node concept="37vLTw" id="2V" role="2Oq$k0">
                        <ref role="3cqZAo" node="2M" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2W" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:3324083196209785477" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2L" role="3cqZAp">
                    <node concept="37vLTI" id="2X" role="3clFbG">
                      <node concept="2OqwBi" id="2Y" role="37vLTx">
                        <node concept="37vLTw" id="30" role="2Oq$k0">
                          <ref role="3cqZAo" node="2M" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="31" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2Z" role="37vLTJ">
                        <ref role="3cqZAo" node="6" resolve="props_Microservice" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2H" role="3clFbw">
                  <node concept="10Nm6u" id="32" role="3uHU7w" />
                  <node concept="37vLTw" id="33" role="3uHU7B">
                    <ref role="3cqZAo" node="6" resolve="props_Microservice" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2F" role="3cqZAp">
                <node concept="37vLTw" id="34" role="3cqZAk">
                  <ref role="3cqZAo" node="6" resolve="props_Microservice" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2D" role="3Kbmr1">
              <ref role="3cqZAo" node="eZ" resolve="Microservice" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="M" role="3KbHQx">
            <node concept="3clFbS" id="35" role="3Kbo56">
              <node concept="3clFbJ" id="37" role="3cqZAp">
                <node concept="3clFbS" id="39" role="3clFbx">
                  <node concept="3cpWs8" id="3b" role="3cqZAp">
                    <node concept="3cpWsn" id="3f" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3g" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3h" role="33vP2m">
                        <node concept="1pGfFk" id="3i" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3c" role="3cqZAp">
                    <node concept="2OqwBi" id="3j" role="3clFbG">
                      <node concept="37vLTw" id="3k" role="2Oq$k0">
                        <ref role="3cqZAo" node="3f" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3l" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="3m" role="37wK5m">
                          <property role="Xl_RC" value="A meda class for hardware server node to be deployed in environment" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3d" role="3cqZAp">
                    <node concept="2OqwBi" id="3n" role="3clFbG">
                      <node concept="37vLTw" id="3o" role="2Oq$k0">
                        <ref role="3cqZAo" node="3f" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3p" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:3324083196209785468" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3e" role="3cqZAp">
                    <node concept="37vLTI" id="3q" role="3clFbG">
                      <node concept="2OqwBi" id="3r" role="37vLTx">
                        <node concept="37vLTw" id="3t" role="2Oq$k0">
                          <ref role="3cqZAo" node="3f" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3u" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3s" role="37vLTJ">
                        <ref role="3cqZAo" node="7" resolve="props_ServerNode" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3a" role="3clFbw">
                  <node concept="10Nm6u" id="3v" role="3uHU7w" />
                  <node concept="37vLTw" id="3w" role="3uHU7B">
                    <ref role="3cqZAo" node="7" resolve="props_ServerNode" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="38" role="3cqZAp">
                <node concept="37vLTw" id="3x" role="3cqZAk">
                  <ref role="3cqZAo" node="7" resolve="props_ServerNode" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="36" role="3Kbmr1">
              <ref role="3cqZAo" node="f0" resolve="ServerNode" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="N" role="3KbHQx">
            <node concept="3clFbS" id="3y" role="3Kbo56">
              <node concept="3clFbJ" id="3$" role="3cqZAp">
                <node concept="3clFbS" id="3A" role="3clFbx">
                  <node concept="3cpWs8" id="3C" role="3cqZAp">
                    <node concept="3cpWsn" id="3G" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3H" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3I" role="33vP2m">
                        <node concept="1pGfFk" id="3J" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3D" role="3cqZAp">
                    <node concept="2OqwBi" id="3K" role="3clFbG">
                      <node concept="37vLTw" id="3L" role="2Oq$k0">
                        <ref role="3cqZAo" node="3G" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3M" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.shortDesc(java.lang.String)" resolve="shortDesc" />
                        <node concept="Xl_RD" id="3N" role="37wK5m">
                          <property role="Xl_RC" value="A meta class for virtual machine for holding containers and to be deployed on server node" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3E" role="3cqZAp">
                    <node concept="2OqwBi" id="3O" role="3clFbG">
                      <node concept="37vLTw" id="3P" role="2Oq$k0">
                        <ref role="3cqZAo" node="3G" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3Q" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName()" resolve="presentationByName" />
                        <uo k="s:originTrace" v="n:3324083196209785474" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3F" role="3cqZAp">
                    <node concept="37vLTI" id="3R" role="3clFbG">
                      <node concept="2OqwBi" id="3S" role="37vLTx">
                        <node concept="37vLTw" id="3U" role="2Oq$k0">
                          <ref role="3cqZAo" node="3G" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3V" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create()" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3T" role="37vLTJ">
                        <ref role="3cqZAo" node="8" resolve="props_VirtualMachine" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3B" role="3clFbw">
                  <node concept="10Nm6u" id="3W" role="3uHU7w" />
                  <node concept="37vLTw" id="3X" role="3uHU7B">
                    <ref role="3cqZAo" node="8" resolve="props_VirtualMachine" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3_" role="3cqZAp">
                <node concept="37vLTw" id="3Y" role="3cqZAk">
                  <ref role="3cqZAo" node="8" resolve="props_VirtualMachine" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3z" role="3Kbmr1">
              <ref role="3cqZAo" node="f1" resolve="VirtualMachine" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="z" role="3cqZAp">
          <node concept="10Nm6u" id="3Z" role="3cqZAk" />
        </node>
      </node>
      <node concept="3uibUv" id="t" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="2AHcQZ" id="u" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="v" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="40">
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="EnumerationDescriptor_EnvironmentType" />
    <uo k="s:originTrace" v="n:3327606504615227682" />
    <node concept="2tJIrI" id="41" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3clFbW" id="42" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3cqZAl" id="4m" role="3clF45">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3Tm1VV" id="4n" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3clFbS" id="4o" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="XkiVB" id="4p" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="1adDum" id="4q" role="37wK5m">
            <property role="1adDun" value="0x3d827bac02154a87L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4r" role="37wK5m">
            <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4s" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb122L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4t" role="37wK5m">
            <property role="Xl_RC" value="EnvironmentType" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4u" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227682" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="43" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="312cEg" id="44" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Development_0" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="4v" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="4w" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2ShNRf" id="4x" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="4y" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="Xl_RD" id="4z" role="37wK5m">
            <property role="Xl_RC" value="Development" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4$" role="37wK5m">
            <property role="Xl_RC" value="Development" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4_" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb123L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4A" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227683" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="45" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Test_0" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="4B" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="4C" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2ShNRf" id="4D" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="4E" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="Xl_RD" id="4F" role="37wK5m">
            <property role="Xl_RC" value="Test" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4G" role="37wK5m">
            <property role="Xl_RC" value="Test" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4H" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb124L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4I" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227684" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="46" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_UAT_0" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="4J" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="4K" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2ShNRf" id="4L" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="4M" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="Xl_RD" id="4N" role="37wK5m">
            <property role="Xl_RC" value="UAT" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4O" role="37wK5m">
            <property role="Xl_RC" value="UAT" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4P" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb127L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4Q" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227687" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="47" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Demo_0" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="4R" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="4S" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2ShNRf" id="4T" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="4U" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="Xl_RD" id="4V" role="37wK5m">
            <property role="Xl_RC" value="Demo" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4W" role="37wK5m">
            <property role="Xl_RC" value="Demo" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="4X" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb12bL" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="4Y" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227691" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="48" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Production_0" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="4Z" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="50" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2ShNRf" id="51" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="52" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="Xl_RD" id="53" role="37wK5m">
            <property role="Xl_RC" value="Production" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="54" role="37wK5m">
            <property role="Xl_RC" value="Production" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="1adDum" id="55" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb130L" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="Xl_RD" id="56" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227696" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="49" role="1B3o_S">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3uibUv" id="4a" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="2tJIrI" id="4b" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="312cEg" id="4c" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="57" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="58" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2YIFZM" id="59" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1adDum" id="5a" role="37wK5m">
          <property role="1adDun" value="0x3d827bac02154a87L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5b" role="37wK5m">
          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5c" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb122L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5d" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb123L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5e" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb124L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5f" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb127L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5g" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb12bL" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="1adDum" id="5h" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb130L" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="4d" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm6S6" id="5i" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="5j" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3uibUv" id="5l" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
      </node>
      <node concept="2ShNRf" id="5k" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="1pGfFk" id="5m" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="37vLTw" id="5n" role="37wK5m">
            <ref role="3cqZAo" node="4c" resolve="myIndex" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="37vLTw" id="5o" role="37wK5m">
            <ref role="3cqZAo" node="44" resolve="myMember_Development_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="37vLTw" id="5p" role="37wK5m">
            <ref role="3cqZAo" node="45" resolve="myMember_Test_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="37vLTw" id="5q" role="37wK5m">
            <ref role="3cqZAo" node="46" resolve="myMember_UAT_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="37vLTw" id="5r" role="37wK5m">
            <ref role="3cqZAo" node="47" resolve="myMember_Demo_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="37vLTw" id="5s" role="37wK5m">
            <ref role="3cqZAo" node="48" resolve="myMember_Production_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4e" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3clFb_" id="4f" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm1VV" id="5t" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2AHcQZ" id="5u" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="5v" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3clFbS" id="5w" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3clFbF" id="5y" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="37vLTw" id="5z" role="3clFbG">
            <ref role="3cqZAo" node="48" resolve="myMember_Production_0" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5x" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
    </node>
    <node concept="2tJIrI" id="4g" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3clFb_" id="4h" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm1VV" id="5$" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2AHcQZ" id="5_" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="5A" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3uibUv" id="5D" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
      </node>
      <node concept="3clFbS" id="5B" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3cpWs6" id="5E" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="37vLTw" id="5F" role="3cqZAk">
            <ref role="3cqZAo" node="4d" resolve="myMembers" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5C" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
    </node>
    <node concept="2tJIrI" id="4i" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3clFb_" id="4j" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm1VV" id="5G" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2AHcQZ" id="5H" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="5I" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="37vLTG" id="5J" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3uibUv" id="5M" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
        <node concept="2AHcQZ" id="5N" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
      </node>
      <node concept="3clFbS" id="5K" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3clFbJ" id="5O" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="3clFbS" id="5R" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="3cpWs6" id="5T" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="10Nm6u" id="5U" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227682" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="5S" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="10Nm6u" id="5V" role="3uHU7w">
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="37vLTw" id="5W" role="3uHU7B">
              <ref role="3cqZAo" node="5J" resolve="memberName" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="5P" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="37vLTw" id="5X" role="3KbGdf">
            <ref role="3cqZAo" node="5J" resolve="memberName" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
          <node concept="3KbdKl" id="5Y" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="Xl_RD" id="63" role="3Kbmr1">
              <property role="Xl_RC" value="Development" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="3clFbS" id="64" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="3cpWs6" id="65" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="66" role="3cqZAk">
                  <ref role="3cqZAo" node="44" resolve="myMember_Development_0" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="5Z" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="Xl_RD" id="67" role="3Kbmr1">
              <property role="Xl_RC" value="Test" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="3clFbS" id="68" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="3cpWs6" id="69" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="6a" role="3cqZAk">
                  <ref role="3cqZAo" node="45" resolve="myMember_Test_0" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="60" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="Xl_RD" id="6b" role="3Kbmr1">
              <property role="Xl_RC" value="UAT" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="3clFbS" id="6c" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="3cpWs6" id="6d" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="6e" role="3cqZAk">
                  <ref role="3cqZAo" node="46" resolve="myMember_UAT_0" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="61" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="Xl_RD" id="6f" role="3Kbmr1">
              <property role="Xl_RC" value="Demo" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="3clFbS" id="6g" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="3cpWs6" id="6h" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="6i" role="3cqZAk">
                  <ref role="3cqZAo" node="47" resolve="myMember_Demo_0" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="62" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="Xl_RD" id="6j" role="3Kbmr1">
              <property role="Xl_RC" value="Production" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="3clFbS" id="6k" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="3cpWs6" id="6l" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="6m" role="3cqZAk">
                  <ref role="3cqZAo" node="48" resolve="myMember_Production_0" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5Q" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="10Nm6u" id="6n" role="3cqZAk">
            <uo k="s:originTrace" v="n:3327606504615227682" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5L" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
    </node>
    <node concept="2tJIrI" id="4k" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227682" />
    </node>
    <node concept="3clFb_" id="4l" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227682" />
      <node concept="3Tm1VV" id="6o" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="2AHcQZ" id="6p" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="3uibUv" id="6q" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
      <node concept="37vLTG" id="6r" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3cpWsb" id="6u" role="1tU5fm">
          <uo k="s:originTrace" v="n:3327606504615227682" />
        </node>
      </node>
      <node concept="3clFbS" id="6s" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227682" />
        <node concept="3cpWs8" id="6v" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="3cpWsn" id="6y" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="10Oyi0" id="6z" role="1tU5fm">
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="2OqwBi" id="6$" role="33vP2m">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="37vLTw" id="6_" role="2Oq$k0">
                <ref role="3cqZAo" node="4c" resolve="myIndex" />
                <uo k="s:originTrace" v="n:3327606504615227682" />
              </node>
              <node concept="liA8E" id="6A" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227682" />
                <node concept="37vLTw" id="6B" role="37wK5m">
                  <ref role="3cqZAo" node="6r" resolve="idValue" />
                  <uo k="s:originTrace" v="n:3327606504615227682" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="6w" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="3clFbS" id="6C" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="3cpWs6" id="6E" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="10Nm6u" id="6F" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227682" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="6D" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="3cmrfG" id="6G" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="37vLTw" id="6H" role="3uHU7B">
              <ref role="3cqZAo" node="6y" resolve="index" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6x" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227682" />
          <node concept="2OqwBi" id="6I" role="3clFbG">
            <uo k="s:originTrace" v="n:3327606504615227682" />
            <node concept="37vLTw" id="6J" role="2Oq$k0">
              <ref role="3cqZAo" node="4d" resolve="myMembers" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
            </node>
            <node concept="liA8E" id="6K" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:3327606504615227682" />
              <node concept="37vLTw" id="6L" role="37wK5m">
                <ref role="3cqZAo" node="6y" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227682" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6t" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227682" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="6M">
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="EnumerationDescriptor_MicroserviceCommunicationType" />
    <uo k="s:originTrace" v="n:3327606504615227741" />
    <node concept="2tJIrI" id="6N" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3clFbW" id="6O" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3cqZAl" id="76" role="3clF45">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3Tm1VV" id="77" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3clFbS" id="78" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="XkiVB" id="79" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="1adDum" id="7a" role="37wK5m">
            <property role="1adDun" value="0x3d827bac02154a87L" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="1adDum" id="7b" role="37wK5m">
            <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="1adDum" id="7c" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb15dL" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7d" role="37wK5m">
            <property role="Xl_RC" value="MicroserviceCommunicationType" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7e" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227741" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6P" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="312cEg" id="6Q" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_RPC_0" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm6S6" id="7f" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7g" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2ShNRf" id="7h" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="1pGfFk" id="7i" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="Xl_RD" id="7j" role="37wK5m">
            <property role="Xl_RC" value="RPC" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7k" role="37wK5m">
            <property role="Xl_RC" value="RPC" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="1adDum" id="7l" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb15eL" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7m" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227742" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6R" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_REST_0" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm6S6" id="7n" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7o" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2ShNRf" id="7p" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="1pGfFk" id="7q" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="Xl_RD" id="7r" role="37wK5m">
            <property role="Xl_RC" value="REST" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7s" role="37wK5m">
            <property role="Xl_RC" value="REST" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="1adDum" id="7t" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb15fL" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7u" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227743" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6S" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_PubSub_0" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm6S6" id="7v" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7w" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2ShNRf" id="7x" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="1pGfFk" id="7y" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="Xl_RD" id="7z" role="37wK5m">
            <property role="Xl_RC" value="PubSub" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7$" role="37wK5m">
            <property role="Xl_RC" value="PubSub" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="1adDum" id="7_" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb162L" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="Xl_RD" id="7A" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227746" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="6T" role="1B3o_S">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3uibUv" id="6U" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="2tJIrI" id="6V" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="312cEg" id="6W" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm6S6" id="7B" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7C" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2YIFZM" id="7D" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="1adDum" id="7E" role="37wK5m">
          <property role="1adDun" value="0x3d827bac02154a87L" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="1adDum" id="7F" role="37wK5m">
          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="1adDum" id="7G" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb15dL" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="1adDum" id="7H" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb15eL" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="1adDum" id="7I" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb15fL" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="1adDum" id="7J" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb162L" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="6X" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm6S6" id="7K" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7L" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3uibUv" id="7N" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
      </node>
      <node concept="2ShNRf" id="7M" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="1pGfFk" id="7O" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="37vLTw" id="7P" role="37wK5m">
            <ref role="3cqZAo" node="6W" resolve="myIndex" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="37vLTw" id="7Q" role="37wK5m">
            <ref role="3cqZAo" node="6Q" resolve="myMember_RPC_0" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="37vLTw" id="7R" role="37wK5m">
            <ref role="3cqZAo" node="6R" resolve="myMember_REST_0" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="37vLTw" id="7S" role="37wK5m">
            <ref role="3cqZAo" node="6S" resolve="myMember_PubSub_0" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="6Y" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3clFb_" id="6Z" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm1VV" id="7T" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2AHcQZ" id="7U" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="7V" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3clFbS" id="7W" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3clFbF" id="7Y" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="37vLTw" id="7Z" role="3clFbG">
            <ref role="3cqZAo" node="6R" resolve="myMember_REST_0" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7X" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
    </node>
    <node concept="2tJIrI" id="70" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3clFb_" id="71" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm1VV" id="80" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2AHcQZ" id="81" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="82" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3uibUv" id="85" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
      </node>
      <node concept="3clFbS" id="83" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3cpWs6" id="86" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="37vLTw" id="87" role="3cqZAk">
            <ref role="3cqZAo" node="6X" resolve="myMembers" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="84" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
    </node>
    <node concept="2tJIrI" id="72" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3clFb_" id="73" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm1VV" id="88" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2AHcQZ" id="89" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="8a" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="37vLTG" id="8b" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3uibUv" id="8e" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
        <node concept="2AHcQZ" id="8f" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
      </node>
      <node concept="3clFbS" id="8c" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3clFbJ" id="8g" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="3clFbS" id="8j" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="3cpWs6" id="8l" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="10Nm6u" id="8m" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227741" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="8k" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="10Nm6u" id="8n" role="3uHU7w">
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="37vLTw" id="8o" role="3uHU7B">
              <ref role="3cqZAo" node="8b" resolve="memberName" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="8h" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="37vLTw" id="8p" role="3KbGdf">
            <ref role="3cqZAo" node="8b" resolve="memberName" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
          <node concept="3KbdKl" id="8q" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="Xl_RD" id="8t" role="3Kbmr1">
              <property role="Xl_RC" value="RPC" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="3clFbS" id="8u" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="3cpWs6" id="8v" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227741" />
                <node concept="37vLTw" id="8w" role="3cqZAk">
                  <ref role="3cqZAo" node="6Q" resolve="myMember_RPC_0" />
                  <uo k="s:originTrace" v="n:3327606504615227741" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="8r" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="Xl_RD" id="8x" role="3Kbmr1">
              <property role="Xl_RC" value="REST" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="3clFbS" id="8y" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="3cpWs6" id="8z" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227741" />
                <node concept="37vLTw" id="8$" role="3cqZAk">
                  <ref role="3cqZAo" node="6R" resolve="myMember_REST_0" />
                  <uo k="s:originTrace" v="n:3327606504615227741" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="8s" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="Xl_RD" id="8_" role="3Kbmr1">
              <property role="Xl_RC" value="PubSub" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="3clFbS" id="8A" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="3cpWs6" id="8B" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227741" />
                <node concept="37vLTw" id="8C" role="3cqZAk">
                  <ref role="3cqZAo" node="6S" resolve="myMember_PubSub_0" />
                  <uo k="s:originTrace" v="n:3327606504615227741" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="8i" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="10Nm6u" id="8D" role="3cqZAk">
            <uo k="s:originTrace" v="n:3327606504615227741" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="8d" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
    </node>
    <node concept="2tJIrI" id="74" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227741" />
    </node>
    <node concept="3clFb_" id="75" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227741" />
      <node concept="3Tm1VV" id="8E" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="2AHcQZ" id="8F" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="3uibUv" id="8G" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
      <node concept="37vLTG" id="8H" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3cpWsb" id="8K" role="1tU5fm">
          <uo k="s:originTrace" v="n:3327606504615227741" />
        </node>
      </node>
      <node concept="3clFbS" id="8I" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227741" />
        <node concept="3cpWs8" id="8L" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="3cpWsn" id="8O" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="10Oyi0" id="8P" role="1tU5fm">
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="2OqwBi" id="8Q" role="33vP2m">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="37vLTw" id="8R" role="2Oq$k0">
                <ref role="3cqZAo" node="6W" resolve="myIndex" />
                <uo k="s:originTrace" v="n:3327606504615227741" />
              </node>
              <node concept="liA8E" id="8S" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227741" />
                <node concept="37vLTw" id="8T" role="37wK5m">
                  <ref role="3cqZAo" node="8H" resolve="idValue" />
                  <uo k="s:originTrace" v="n:3327606504615227741" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="8M" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="3clFbS" id="8U" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="3cpWs6" id="8W" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="10Nm6u" id="8X" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227741" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="8V" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="3cmrfG" id="8Y" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="37vLTw" id="8Z" role="3uHU7B">
              <ref role="3cqZAo" node="8O" resolve="index" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8N" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227741" />
          <node concept="2OqwBi" id="90" role="3clFbG">
            <uo k="s:originTrace" v="n:3327606504615227741" />
            <node concept="37vLTw" id="91" role="2Oq$k0">
              <ref role="3cqZAo" node="6X" resolve="myMembers" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
            </node>
            <node concept="liA8E" id="92" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:3327606504615227741" />
              <node concept="37vLTw" id="93" role="37wK5m">
                <ref role="3cqZAo" node="8O" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227741" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="8J" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227741" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="94">
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="EnumerationDescriptor_MicroserviceType" />
    <uo k="s:originTrace" v="n:3327606504615227708" />
    <node concept="2tJIrI" id="95" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3clFbW" id="96" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3cqZAl" id="9n" role="3clF45">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3Tm1VV" id="9o" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3clFbS" id="9p" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="XkiVB" id="9q" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="1adDum" id="9r" role="37wK5m">
            <property role="1adDun" value="0x3d827bac02154a87L" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="1adDum" id="9s" role="37wK5m">
            <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="1adDum" id="9t" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb13cL" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9u" role="37wK5m">
            <property role="Xl_RC" value="MicroserviceType" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9v" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227708" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="97" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="312cEg" id="98" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Internal_0" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm6S6" id="9w" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="9x" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2ShNRf" id="9y" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="1pGfFk" id="9z" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="Xl_RD" id="9$" role="37wK5m">
            <property role="Xl_RC" value="Internal" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9_" role="37wK5m">
            <property role="Xl_RC" value="Internal" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="1adDum" id="9A" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb13dL" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9B" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227709" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="99" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_External_0" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm6S6" id="9C" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="9D" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2ShNRf" id="9E" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="1pGfFk" id="9F" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="Xl_RD" id="9G" role="37wK5m">
            <property role="Xl_RC" value="External" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9H" role="37wK5m">
            <property role="Xl_RC" value="External" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="1adDum" id="9I" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb13eL" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="Xl_RD" id="9J" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227710" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="9a" role="1B3o_S">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3uibUv" id="9b" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="2tJIrI" id="9c" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="312cEg" id="9d" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm6S6" id="9K" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="9L" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2YIFZM" id="9M" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="1adDum" id="9N" role="37wK5m">
          <property role="1adDun" value="0x3d827bac02154a87L" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
        <node concept="1adDum" id="9O" role="37wK5m">
          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
        <node concept="1adDum" id="9P" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb13cL" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
        <node concept="1adDum" id="9Q" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb13dL" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
        <node concept="1adDum" id="9R" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb13eL" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="9e" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm6S6" id="9S" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="9T" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3uibUv" id="9V" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
      </node>
      <node concept="2ShNRf" id="9U" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="1pGfFk" id="9W" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="37vLTw" id="9X" role="37wK5m">
            <ref role="3cqZAo" node="9d" resolve="myIndex" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="37vLTw" id="9Y" role="37wK5m">
            <ref role="3cqZAo" node="98" resolve="myMember_Internal_0" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="37vLTw" id="9Z" role="37wK5m">
            <ref role="3cqZAo" node="99" resolve="myMember_External_0" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="9f" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3clFb_" id="9g" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm1VV" id="a0" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2AHcQZ" id="a1" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="a2" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3clFbS" id="a3" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3clFbF" id="a5" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="37vLTw" id="a6" role="3clFbG">
            <ref role="3cqZAo" node="98" resolve="myMember_Internal_0" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="a4" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
    </node>
    <node concept="2tJIrI" id="9h" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3clFb_" id="9i" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm1VV" id="a7" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2AHcQZ" id="a8" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="a9" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3uibUv" id="ac" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
      </node>
      <node concept="3clFbS" id="aa" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3cpWs6" id="ad" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="37vLTw" id="ae" role="3cqZAk">
            <ref role="3cqZAo" node="9e" resolve="myMembers" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ab" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
    </node>
    <node concept="2tJIrI" id="9j" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3clFb_" id="9k" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm1VV" id="af" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2AHcQZ" id="ag" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="ah" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="37vLTG" id="ai" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3uibUv" id="al" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
        <node concept="2AHcQZ" id="am" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
      </node>
      <node concept="3clFbS" id="aj" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3clFbJ" id="an" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="3clFbS" id="aq" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="3cpWs6" id="as" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="10Nm6u" id="at" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227708" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="ar" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="10Nm6u" id="au" role="3uHU7w">
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="37vLTw" id="av" role="3uHU7B">
              <ref role="3cqZAo" node="ai" resolve="memberName" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="ao" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="37vLTw" id="aw" role="3KbGdf">
            <ref role="3cqZAo" node="ai" resolve="memberName" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
          <node concept="3KbdKl" id="ax" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="Xl_RD" id="az" role="3Kbmr1">
              <property role="Xl_RC" value="Internal" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="3clFbS" id="a$" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="3cpWs6" id="a_" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227708" />
                <node concept="37vLTw" id="aA" role="3cqZAk">
                  <ref role="3cqZAo" node="98" resolve="myMember_Internal_0" />
                  <uo k="s:originTrace" v="n:3327606504615227708" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="ay" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="Xl_RD" id="aB" role="3Kbmr1">
              <property role="Xl_RC" value="External" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="3clFbS" id="aC" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="3cpWs6" id="aD" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227708" />
                <node concept="37vLTw" id="aE" role="3cqZAk">
                  <ref role="3cqZAo" node="99" resolve="myMember_External_0" />
                  <uo k="s:originTrace" v="n:3327606504615227708" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="ap" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="10Nm6u" id="aF" role="3cqZAk">
            <uo k="s:originTrace" v="n:3327606504615227708" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ak" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
    </node>
    <node concept="2tJIrI" id="9l" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227708" />
    </node>
    <node concept="3clFb_" id="9m" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227708" />
      <node concept="3Tm1VV" id="aG" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="2AHcQZ" id="aH" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="3uibUv" id="aI" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
      <node concept="37vLTG" id="aJ" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3cpWsb" id="aM" role="1tU5fm">
          <uo k="s:originTrace" v="n:3327606504615227708" />
        </node>
      </node>
      <node concept="3clFbS" id="aK" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227708" />
        <node concept="3cpWs8" id="aN" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="3cpWsn" id="aQ" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="10Oyi0" id="aR" role="1tU5fm">
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="2OqwBi" id="aS" role="33vP2m">
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="37vLTw" id="aT" role="2Oq$k0">
                <ref role="3cqZAo" node="9d" resolve="myIndex" />
                <uo k="s:originTrace" v="n:3327606504615227708" />
              </node>
              <node concept="liA8E" id="aU" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227708" />
                <node concept="37vLTw" id="aV" role="37wK5m">
                  <ref role="3cqZAo" node="aJ" resolve="idValue" />
                  <uo k="s:originTrace" v="n:3327606504615227708" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="aO" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="3clFbS" id="aW" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="3cpWs6" id="aY" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="10Nm6u" id="aZ" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227708" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="aX" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="3cmrfG" id="b0" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="37vLTw" id="b1" role="3uHU7B">
              <ref role="3cqZAo" node="aQ" resolve="index" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aP" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227708" />
          <node concept="2OqwBi" id="b2" role="3clFbG">
            <uo k="s:originTrace" v="n:3327606504615227708" />
            <node concept="37vLTw" id="b3" role="2Oq$k0">
              <ref role="3cqZAo" node="9e" resolve="myMembers" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
            </node>
            <node concept="liA8E" id="b4" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:3327606504615227708" />
              <node concept="37vLTw" id="b5" role="37wK5m">
                <ref role="3cqZAo" node="aQ" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227708" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="aL" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227708" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="b6">
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="EnumerationDescriptor_VMType" />
    <uo k="s:originTrace" v="n:3327606504615227713" />
    <node concept="2tJIrI" id="b7" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3clFbW" id="b8" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3cqZAl" id="br" role="3clF45">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3Tm1VV" id="bs" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3clFbS" id="bt" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="XkiVB" id="bu" role="3cqZAp">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String)" resolve="EnumerationDescriptorBase" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="1adDum" id="bv" role="37wK5m">
            <property role="1adDun" value="0x3d827bac02154a87L" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="bw" role="37wK5m">
            <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="bx" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb141L" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="by" role="37wK5m">
            <property role="Xl_RC" value="VMType" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bz" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227713" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="b9" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="312cEg" id="ba" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Linux_0" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="b$" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="b_" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2ShNRf" id="bA" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1pGfFk" id="bB" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="Xl_RD" id="bC" role="37wK5m">
            <property role="Xl_RC" value="Linux" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bD" role="37wK5m">
            <property role="Xl_RC" value="Linux" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="bE" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb142L" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bF" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227714" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bb" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_RedHat_0" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="bG" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="bH" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2ShNRf" id="bI" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1pGfFk" id="bJ" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="Xl_RD" id="bK" role="37wK5m">
            <property role="Xl_RC" value="RedHat" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bL" role="37wK5m">
            <property role="Xl_RC" value="RedHat" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="bM" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb143L" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bN" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227715" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bc" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_Windows_0" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="bO" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="bP" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2ShNRf" id="bQ" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1pGfFk" id="bR" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="Xl_RD" id="bS" role="37wK5m">
            <property role="Xl_RC" value="Windows" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bT" role="37wK5m">
            <property role="Xl_RC" value="Windows" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="bU" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb146L" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="bV" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227718" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bd" role="jymVt">
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myMember_CentOS_0" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="bW" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="bX" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2ShNRf" id="bY" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1pGfFk" id="bZ" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptor$MemberDescriptor.&lt;init&gt;(java.lang.String,java.lang.String,long,java.lang.String,java.lang.String,java.lang.String)" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="Xl_RD" id="c0" role="37wK5m">
            <property role="Xl_RC" value="CentOS" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="c1" role="37wK5m">
            <property role="Xl_RC" value="CentOS" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="1adDum" id="c2" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb14aL" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="Xl_RD" id="c3" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227722" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="be" role="1B3o_S">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3uibUv" id="bf" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~EnumerationDescriptorBase" resolve="EnumerationDescriptorBase" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="2tJIrI" id="bg" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="312cEg" id="bh" role="jymVt">
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="c4" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="c5" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2YIFZM" id="c6" role="33vP2m">
        <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.build(long,long,long,long...):jetbrains.mps.lang.smodel.EnumerationLiteralsIndex" resolve="build" />
        <ref role="1Pybhc" to="ksn4:~EnumerationLiteralsIndex" resolve="EnumerationLiteralsIndex" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1adDum" id="c7" role="37wK5m">
          <property role="1adDun" value="0x3d827bac02154a87L" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="c8" role="37wK5m">
          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="c9" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb141L" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="ca" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb142L" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="cb" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb143L" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="cc" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb146L" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="1adDum" id="cd" role="37wK5m">
          <property role="1adDun" value="0x2e2e087c4bdeb14aL" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="bi" role="jymVt">
      <property role="TrG5h" value="myMembers" />
      <property role="3TUv4t" value="true" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm6S6" id="ce" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="cf" role="1tU5fm">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3uibUv" id="ch" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
      </node>
      <node concept="2ShNRf" id="cg" role="33vP2m">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="1pGfFk" id="ci" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~EnumerationDescriptorBase$MembersList.&lt;init&gt;(jetbrains.mps.smodel.runtime.EnumerationDescriptorBase,jetbrains.mps.lang.smodel.EnumerationLiteralsIndex,jetbrains.mps.smodel.runtime.EnumerationDescriptor$MemberDescriptor...)" resolve="EnumerationDescriptorBase.MembersList" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="37vLTw" id="cj" role="37wK5m">
            <ref role="3cqZAo" node="bh" resolve="myIndex" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="37vLTw" id="ck" role="37wK5m">
            <ref role="3cqZAo" node="ba" resolve="myMember_Linux_0" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="37vLTw" id="cl" role="37wK5m">
            <ref role="3cqZAo" node="bb" resolve="myMember_RedHat_0" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="37vLTw" id="cm" role="37wK5m">
            <ref role="3cqZAo" node="bc" resolve="myMember_Windows_0" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="37vLTw" id="cn" role="37wK5m">
            <ref role="3cqZAo" node="bd" resolve="myMember_CentOS_0" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="bj" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3clFb_" id="bk" role="jymVt">
      <property role="TrG5h" value="getDefault" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm1VV" id="co" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2AHcQZ" id="cp" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="cq" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3clFbS" id="cr" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3clFbF" id="ct" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="37vLTw" id="cu" role="3clFbG">
            <ref role="3cqZAo" node="ba" resolve="myMember_Linux_0" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cs" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
    </node>
    <node concept="2tJIrI" id="bl" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3clFb_" id="bm" role="jymVt">
      <property role="TrG5h" value="getMembers" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm1VV" id="cv" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2AHcQZ" id="cw" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="cx" role="3clF45">
        <ref role="3uigEE" to="33ny:~List" resolve="List" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3uibUv" id="c$" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
      </node>
      <node concept="3clFbS" id="cy" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3cpWs6" id="c_" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="37vLTw" id="cA" role="3cqZAk">
            <ref role="3cqZAo" node="bi" resolve="myMembers" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cz" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
    </node>
    <node concept="2tJIrI" id="bn" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3clFb_" id="bo" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm1VV" id="cB" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2AHcQZ" id="cC" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="cD" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="37vLTG" id="cE" role="3clF46">
        <property role="TrG5h" value="memberName" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3uibUv" id="cH" role="1tU5fm">
          <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
        <node concept="2AHcQZ" id="cI" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
      </node>
      <node concept="3clFbS" id="cF" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3clFbJ" id="cJ" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="3clFbS" id="cM" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="3cpWs6" id="cO" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="10Nm6u" id="cP" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227713" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="cN" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="10Nm6u" id="cQ" role="3uHU7w">
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="37vLTw" id="cR" role="3uHU7B">
              <ref role="3cqZAo" node="cE" resolve="memberName" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="cK" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="37vLTw" id="cS" role="3KbGdf">
            <ref role="3cqZAo" node="cE" resolve="memberName" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
          <node concept="3KbdKl" id="cT" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="Xl_RD" id="cX" role="3Kbmr1">
              <property role="Xl_RC" value="Linux" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="3clFbS" id="cY" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="3cpWs6" id="cZ" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227713" />
                <node concept="37vLTw" id="d0" role="3cqZAk">
                  <ref role="3cqZAo" node="ba" resolve="myMember_Linux_0" />
                  <uo k="s:originTrace" v="n:3327606504615227713" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="cU" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="Xl_RD" id="d1" role="3Kbmr1">
              <property role="Xl_RC" value="RedHat" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="3clFbS" id="d2" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="3cpWs6" id="d3" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227713" />
                <node concept="37vLTw" id="d4" role="3cqZAk">
                  <ref role="3cqZAo" node="bb" resolve="myMember_RedHat_0" />
                  <uo k="s:originTrace" v="n:3327606504615227713" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="cV" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="Xl_RD" id="d5" role="3Kbmr1">
              <property role="Xl_RC" value="Windows" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="3clFbS" id="d6" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="3cpWs6" id="d7" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227713" />
                <node concept="37vLTw" id="d8" role="3cqZAk">
                  <ref role="3cqZAo" node="bc" resolve="myMember_Windows_0" />
                  <uo k="s:originTrace" v="n:3327606504615227713" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="cW" role="3KbHQx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="Xl_RD" id="d9" role="3Kbmr1">
              <property role="Xl_RC" value="CentOS" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="3clFbS" id="da" role="3Kbo56">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="3cpWs6" id="db" role="3cqZAp">
                <uo k="s:originTrace" v="n:3327606504615227713" />
                <node concept="37vLTw" id="dc" role="3cqZAk">
                  <ref role="3cqZAo" node="bd" resolve="myMember_CentOS_0" />
                  <uo k="s:originTrace" v="n:3327606504615227713" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="cL" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="10Nm6u" id="dd" role="3cqZAk">
            <uo k="s:originTrace" v="n:3327606504615227713" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cG" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
    </node>
    <node concept="2tJIrI" id="bp" role="jymVt">
      <uo k="s:originTrace" v="n:3327606504615227713" />
    </node>
    <node concept="3clFb_" id="bq" role="jymVt">
      <property role="TrG5h" value="getMember" />
      <uo k="s:originTrace" v="n:3327606504615227713" />
      <node concept="3Tm1VV" id="de" role="1B3o_S">
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="2AHcQZ" id="df" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="3uibUv" id="dg" role="3clF45">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor$MemberDescriptor" resolve="EnumerationDescriptor.MemberDescriptor" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
      <node concept="37vLTG" id="dh" role="3clF46">
        <property role="TrG5h" value="idValue" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3cpWsb" id="dk" role="1tU5fm">
          <uo k="s:originTrace" v="n:3327606504615227713" />
        </node>
      </node>
      <node concept="3clFbS" id="di" role="3clF47">
        <uo k="s:originTrace" v="n:3327606504615227713" />
        <node concept="3cpWs8" id="dl" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="3cpWsn" id="do" role="3cpWs9">
            <property role="TrG5h" value="index" />
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="10Oyi0" id="dp" role="1tU5fm">
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="2OqwBi" id="dq" role="33vP2m">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="37vLTw" id="dr" role="2Oq$k0">
                <ref role="3cqZAo" node="bh" resolve="myIndex" />
                <uo k="s:originTrace" v="n:3327606504615227713" />
              </node>
              <node concept="liA8E" id="ds" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~EnumerationLiteralsIndex.index(long):int" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227713" />
                <node concept="37vLTw" id="dt" role="37wK5m">
                  <ref role="3cqZAo" node="dh" resolve="idValue" />
                  <uo k="s:originTrace" v="n:3327606504615227713" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="dm" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="3clFbS" id="du" role="3clFbx">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="3cpWs6" id="dw" role="3cqZAp">
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="10Nm6u" id="dx" role="3cqZAk">
                <uo k="s:originTrace" v="n:3327606504615227713" />
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="dv" role="3clFbw">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="3cmrfG" id="dy" role="3uHU7w">
              <property role="3cmrfH" value="-1" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="37vLTw" id="dz" role="3uHU7B">
              <ref role="3cqZAo" node="do" resolve="index" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dn" role="3cqZAp">
          <uo k="s:originTrace" v="n:3327606504615227713" />
          <node concept="2OqwBi" id="d$" role="3clFbG">
            <uo k="s:originTrace" v="n:3327606504615227713" />
            <node concept="37vLTw" id="d_" role="2Oq$k0">
              <ref role="3cqZAo" node="bi" resolve="myMembers" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
            </node>
            <node concept="liA8E" id="dA" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.get(int):java.lang.Object" resolve="get" />
              <uo k="s:originTrace" v="n:3327606504615227713" />
              <node concept="37vLTw" id="dB" role="37wK5m">
                <ref role="3cqZAo" node="do" resolve="index" />
                <uo k="s:originTrace" v="n:3327606504615227713" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="dj" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3327606504615227713" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="dC">
    <node concept="39e2AJ" id="dD" role="39e2AI">
      <property role="39e3Y2" value="EnumerationDescriptorCons" />
      <node concept="39e2AG" id="dH" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4y" resolve="EnvironmentType" />
        <node concept="385nmt" id="dL" role="385vvn">
          <property role="385vuF" value="EnvironmentType" />
          <node concept="3u3nmq" id="dN" role="385v07">
            <property role="3u3nmv" value="3327606504615227682" />
          </node>
        </node>
        <node concept="39e2AT" id="dM" role="39e2AY">
          <ref role="39e2AS" node="42" resolve="EnumerationDescriptor_EnvironmentType" />
        </node>
      </node>
      <node concept="39e2AG" id="dI" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF5t" resolve="MicroserviceCommunicationType" />
        <node concept="385nmt" id="dO" role="385vvn">
          <property role="385vuF" value="MicroserviceCommunicationType" />
          <node concept="3u3nmq" id="dQ" role="385v07">
            <property role="3u3nmv" value="3327606504615227741" />
          </node>
        </node>
        <node concept="39e2AT" id="dP" role="39e2AY">
          <ref role="39e2AS" node="6O" resolve="EnumerationDescriptor_MicroserviceCommunicationType" />
        </node>
      </node>
      <node concept="39e2AG" id="dJ" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4W" resolve="MicroserviceType" />
        <node concept="385nmt" id="dR" role="385vvn">
          <property role="385vuF" value="MicroserviceType" />
          <node concept="3u3nmq" id="dT" role="385v07">
            <property role="3u3nmv" value="3327606504615227708" />
          </node>
        </node>
        <node concept="39e2AT" id="dS" role="39e2AY">
          <ref role="39e2AS" node="96" resolve="EnumerationDescriptor_MicroserviceType" />
        </node>
      </node>
      <node concept="39e2AG" id="dK" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF51" resolve="VMType" />
        <node concept="385nmt" id="dU" role="385vvn">
          <property role="385vuF" value="VMType" />
          <node concept="3u3nmq" id="dW" role="385v07">
            <property role="3u3nmv" value="3327606504615227713" />
          </node>
        </node>
        <node concept="39e2AT" id="dV" role="39e2AY">
          <ref role="39e2AS" node="b8" resolve="EnumerationDescriptor_VMType" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="dE" role="39e2AI">
      <property role="39e3Y2" value="EnumerationMember" />
      <node concept="39e2AG" id="dX" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF5a" resolve="CentOS" />
        <node concept="385nmt" id="eb" role="385vvn">
          <property role="385vuF" value="CentOS" />
          <node concept="3u3nmq" id="ed" role="385v07">
            <property role="3u3nmv" value="3327606504615227722" />
          </node>
        </node>
        <node concept="39e2AT" id="ec" role="39e2AY">
          <ref role="39e2AS" node="bd" resolve="myMember_CentOS_0" />
        </node>
      </node>
      <node concept="39e2AG" id="dY" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4F" resolve="Demo" />
        <node concept="385nmt" id="ee" role="385vvn">
          <property role="385vuF" value="Demo" />
          <node concept="3u3nmq" id="eg" role="385v07">
            <property role="3u3nmv" value="3327606504615227691" />
          </node>
        </node>
        <node concept="39e2AT" id="ef" role="39e2AY">
          <ref role="39e2AS" node="47" resolve="myMember_Demo_0" />
        </node>
      </node>
      <node concept="39e2AG" id="dZ" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4z" resolve="Development" />
        <node concept="385nmt" id="eh" role="385vvn">
          <property role="385vuF" value="Development" />
          <node concept="3u3nmq" id="ej" role="385v07">
            <property role="3u3nmv" value="3327606504615227683" />
          </node>
        </node>
        <node concept="39e2AT" id="ei" role="39e2AY">
          <ref role="39e2AS" node="44" resolve="myMember_Development_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e0" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4Y" resolve="External" />
        <node concept="385nmt" id="ek" role="385vvn">
          <property role="385vuF" value="External" />
          <node concept="3u3nmq" id="em" role="385v07">
            <property role="3u3nmv" value="3327606504615227710" />
          </node>
        </node>
        <node concept="39e2AT" id="el" role="39e2AY">
          <ref role="39e2AS" node="99" resolve="myMember_External_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e1" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4X" resolve="Internal" />
        <node concept="385nmt" id="en" role="385vvn">
          <property role="385vuF" value="Internal" />
          <node concept="3u3nmq" id="ep" role="385v07">
            <property role="3u3nmv" value="3327606504615227709" />
          </node>
        </node>
        <node concept="39e2AT" id="eo" role="39e2AY">
          <ref role="39e2AS" node="98" resolve="myMember_Internal_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e2" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF52" resolve="Linux" />
        <node concept="385nmt" id="eq" role="385vvn">
          <property role="385vuF" value="Linux" />
          <node concept="3u3nmq" id="es" role="385v07">
            <property role="3u3nmv" value="3327606504615227714" />
          </node>
        </node>
        <node concept="39e2AT" id="er" role="39e2AY">
          <ref role="39e2AS" node="ba" resolve="myMember_Linux_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e3" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4K" resolve="Production" />
        <node concept="385nmt" id="et" role="385vvn">
          <property role="385vuF" value="Production" />
          <node concept="3u3nmq" id="ev" role="385v07">
            <property role="3u3nmv" value="3327606504615227696" />
          </node>
        </node>
        <node concept="39e2AT" id="eu" role="39e2AY">
          <ref role="39e2AS" node="48" resolve="myMember_Production_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e4" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF5y" resolve="PubSub" />
        <node concept="385nmt" id="ew" role="385vvn">
          <property role="385vuF" value="PubSub" />
          <node concept="3u3nmq" id="ey" role="385v07">
            <property role="3u3nmv" value="3327606504615227746" />
          </node>
        </node>
        <node concept="39e2AT" id="ex" role="39e2AY">
          <ref role="39e2AS" node="6S" resolve="myMember_PubSub_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e5" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF5v" resolve="REST" />
        <node concept="385nmt" id="ez" role="385vvn">
          <property role="385vuF" value="REST" />
          <node concept="3u3nmq" id="e_" role="385v07">
            <property role="3u3nmv" value="3327606504615227743" />
          </node>
        </node>
        <node concept="39e2AT" id="e$" role="39e2AY">
          <ref role="39e2AS" node="6R" resolve="myMember_REST_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e6" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF5u" resolve="RPC" />
        <node concept="385nmt" id="eA" role="385vvn">
          <property role="385vuF" value="RPC" />
          <node concept="3u3nmq" id="eC" role="385v07">
            <property role="3u3nmv" value="3327606504615227742" />
          </node>
        </node>
        <node concept="39e2AT" id="eB" role="39e2AY">
          <ref role="39e2AS" node="6Q" resolve="myMember_RPC_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e7" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF53" resolve="RedHat" />
        <node concept="385nmt" id="eD" role="385vvn">
          <property role="385vuF" value="RedHat" />
          <node concept="3u3nmq" id="eF" role="385v07">
            <property role="3u3nmv" value="3327606504615227715" />
          </node>
        </node>
        <node concept="39e2AT" id="eE" role="39e2AY">
          <ref role="39e2AS" node="bb" resolve="myMember_RedHat_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e8" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4$" resolve="Test" />
        <node concept="385nmt" id="eG" role="385vvn">
          <property role="385vuF" value="Test" />
          <node concept="3u3nmq" id="eI" role="385v07">
            <property role="3u3nmv" value="3327606504615227684" />
          </node>
        </node>
        <node concept="39e2AT" id="eH" role="39e2AY">
          <ref role="39e2AS" node="45" resolve="myMember_Test_0" />
        </node>
      </node>
      <node concept="39e2AG" id="e9" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF4B" resolve="UAT" />
        <node concept="385nmt" id="eJ" role="385vvn">
          <property role="385vuF" value="UAT" />
          <node concept="3u3nmq" id="eL" role="385v07">
            <property role="3u3nmv" value="3327606504615227687" />
          </node>
        </node>
        <node concept="39e2AT" id="eK" role="39e2AY">
          <ref role="39e2AS" node="46" resolve="myMember_UAT_0" />
        </node>
      </node>
      <node concept="39e2AG" id="ea" role="39e3Y0">
        <ref role="39e2AK" to="u018:2SI27LbRF56" resolve="Windows" />
        <node concept="385nmt" id="eM" role="385vvn">
          <property role="385vuF" value="Windows" />
          <node concept="3u3nmq" id="eO" role="385v07">
            <property role="3u3nmv" value="3327606504615227718" />
          </node>
        </node>
        <node concept="39e2AT" id="eN" role="39e2AY">
          <ref role="39e2AS" node="bc" resolve="myMember_Windows_0" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="dF" role="39e2AI">
      <property role="39e3Y2" value="ConceptPresentationAspectClass" />
      <node concept="39e2AG" id="eP" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="eQ" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConceptPresentationAspectImpl" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="dG" role="39e2AI">
      <property role="39e3Y2" value="StructureAspectDescriptorCons" />
      <node concept="39e2AG" id="eR" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="eS" role="39e2AY">
          <ref role="39e2AS" node="gY" resolve="StructureAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="eT">
    <property role="TrG5h" value="LanguageConceptSwitch" />
    <property role="1EXbeo" value="true" />
    <node concept="312cEg" id="eU" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="f9" role="1B3o_S" />
      <node concept="3uibUv" id="fa" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~LanguageConceptIndex" resolve="LanguageConceptIndex" />
      </node>
    </node>
    <node concept="Wx3nA" id="eV" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Communicates" />
      <node concept="3Tm1VV" id="fb" role="1B3o_S" />
      <node concept="10Oyi0" id="fc" role="1tU5fm" />
      <node concept="3cmrfG" id="fd" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="Wx3nA" id="eW" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="CommunicationProtocol" />
      <node concept="3Tm1VV" id="fe" role="1B3o_S" />
      <node concept="10Oyi0" id="ff" role="1tU5fm" />
      <node concept="3cmrfG" id="fg" role="33vP2m">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
    <node concept="Wx3nA" id="eX" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Container" />
      <node concept="3Tm1VV" id="fh" role="1B3o_S" />
      <node concept="10Oyi0" id="fi" role="1tU5fm" />
      <node concept="3cmrfG" id="fj" role="33vP2m">
        <property role="3cmrfH" value="2" />
      </node>
    </node>
    <node concept="Wx3nA" id="eY" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Environment" />
      <node concept="3Tm1VV" id="fk" role="1B3o_S" />
      <node concept="10Oyi0" id="fl" role="1tU5fm" />
      <node concept="3cmrfG" id="fm" role="33vP2m">
        <property role="3cmrfH" value="3" />
      </node>
    </node>
    <node concept="Wx3nA" id="eZ" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Microservice" />
      <node concept="3Tm1VV" id="fn" role="1B3o_S" />
      <node concept="10Oyi0" id="fo" role="1tU5fm" />
      <node concept="3cmrfG" id="fp" role="33vP2m">
        <property role="3cmrfH" value="4" />
      </node>
    </node>
    <node concept="Wx3nA" id="f0" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ServerNode" />
      <node concept="3Tm1VV" id="fq" role="1B3o_S" />
      <node concept="10Oyi0" id="fr" role="1tU5fm" />
      <node concept="3cmrfG" id="fs" role="33vP2m">
        <property role="3cmrfH" value="5" />
      </node>
    </node>
    <node concept="Wx3nA" id="f1" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="VirtualMachine" />
      <node concept="3Tm1VV" id="ft" role="1B3o_S" />
      <node concept="10Oyi0" id="fu" role="1tU5fm" />
      <node concept="3cmrfG" id="fv" role="33vP2m">
        <property role="3cmrfH" value="6" />
      </node>
    </node>
    <node concept="2tJIrI" id="f2" role="jymVt" />
    <node concept="3clFbW" id="f3" role="jymVt">
      <node concept="3cqZAl" id="fw" role="3clF45" />
      <node concept="3Tm1VV" id="fx" role="1B3o_S" />
      <node concept="3clFbS" id="fy" role="3clF47">
        <node concept="3cpWs8" id="fz" role="3cqZAp">
          <node concept="3cpWsn" id="fG" role="3cpWs9">
            <property role="TrG5h" value="builder" />
            <node concept="3uibUv" id="fH" role="1tU5fm">
              <ref role="3uigEE" to="ksn4:~LanguageConceptIndexBuilder" resolve="LanguageConceptIndexBuilder" />
            </node>
            <node concept="2ShNRf" id="fI" role="33vP2m">
              <node concept="1pGfFk" id="fJ" role="2ShVmc">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.&lt;init&gt;(long,long)" resolve="LanguageConceptIndexBuilder" />
                <node concept="1adDum" id="fK" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="fL" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="f$" role="3cqZAp">
          <node concept="2OqwBi" id="fM" role="3clFbG">
            <node concept="37vLTw" id="fN" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="fO" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="fP" role="37wK5m">
                <property role="1adDun" value="0x401f62f44cfb5204L" />
              </node>
              <node concept="37vLTw" id="fQ" role="37wK5m">
                <ref role="3cqZAo" node="eV" resolve="Communicates" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="f_" role="3cqZAp">
          <node concept="2OqwBi" id="fR" role="3clFbG">
            <node concept="37vLTw" id="fS" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="fT" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="fU" role="37wK5m">
                <property role="1adDun" value="0x2e2e087c4bdf080fL" />
              </node>
              <node concept="37vLTw" id="fV" role="37wK5m">
                <ref role="3cqZAo" node="eW" resolve="CommunicationProtocol" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fA" role="3cqZAp">
          <node concept="2OqwBi" id="fW" role="3clFbG">
            <node concept="37vLTw" id="fX" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="fY" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="fZ" role="37wK5m">
                <property role="1adDun" value="0x2e2e087c4bdeb0d7L" />
              </node>
              <node concept="37vLTw" id="g0" role="37wK5m">
                <ref role="3cqZAo" node="eX" resolve="Container" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fB" role="3cqZAp">
          <node concept="2OqwBi" id="g1" role="3clFbG">
            <node concept="37vLTw" id="g2" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="g3" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="g4" role="37wK5m">
                <property role="1adDun" value="0x2e2e087c4bdeb11bL" />
              </node>
              <node concept="37vLTw" id="g5" role="37wK5m">
                <ref role="3cqZAo" node="eY" resolve="Environment" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fC" role="3cqZAp">
          <node concept="2OqwBi" id="g6" role="3clFbG">
            <node concept="37vLTw" id="g7" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="g8" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="g9" role="37wK5m">
                <property role="1adDun" value="0x2e21840e21edea85L" />
              </node>
              <node concept="37vLTw" id="ga" role="37wK5m">
                <ref role="3cqZAo" node="eZ" resolve="Microservice" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fD" role="3cqZAp">
          <node concept="2OqwBi" id="gb" role="3clFbG">
            <node concept="37vLTw" id="gc" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="gd" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="ge" role="37wK5m">
                <property role="1adDun" value="0x2e21840e21edea7cL" />
              </node>
              <node concept="37vLTw" id="gf" role="37wK5m">
                <ref role="3cqZAo" node="f0" resolve="ServerNode" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fE" role="3cqZAp">
          <node concept="2OqwBi" id="gg" role="3clFbG">
            <node concept="37vLTw" id="gh" role="2Oq$k0">
              <ref role="3cqZAo" node="fG" resolve="builder" />
            </node>
            <node concept="liA8E" id="gi" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int)" resolve="put" />
              <node concept="1adDum" id="gj" role="37wK5m">
                <property role="1adDun" value="0x2e21840e21edea82L" />
              </node>
              <node concept="37vLTw" id="gk" role="37wK5m">
                <ref role="3cqZAo" node="f1" resolve="VirtualMachine" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fF" role="3cqZAp">
          <node concept="37vLTI" id="gl" role="3clFbG">
            <node concept="2OqwBi" id="gm" role="37vLTx">
              <node concept="37vLTw" id="go" role="2Oq$k0">
                <ref role="3cqZAo" node="fG" resolve="builder" />
              </node>
              <node concept="liA8E" id="gp" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.seal()" resolve="seal" />
              </node>
            </node>
            <node concept="37vLTw" id="gn" role="37vLTJ">
              <ref role="3cqZAo" node="eU" resolve="myIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="f4" role="jymVt" />
    <node concept="3clFb_" id="f5" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="gq" role="3clF45" />
      <node concept="3clFbS" id="gr" role="3clF47">
        <node concept="3cpWs6" id="gt" role="3cqZAp">
          <node concept="2OqwBi" id="gu" role="3cqZAk">
            <node concept="37vLTw" id="gv" role="2Oq$k0">
              <ref role="3cqZAo" node="eU" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="gw" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndex.index(jetbrains.mps.smodel.adapter.ids.SConceptId)" resolve="index" />
              <node concept="37vLTw" id="gx" role="37wK5m">
                <ref role="3cqZAo" node="gs" resolve="cid" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="gs" role="3clF46">
        <property role="TrG5h" value="cid" />
        <node concept="3uibUv" id="gy" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="f6" role="jymVt" />
    <node concept="3clFb_" id="f7" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="gz" role="3clF45" />
      <node concept="3Tm1VV" id="g$" role="1B3o_S" />
      <node concept="3clFbS" id="g_" role="3clF47">
        <node concept="3cpWs6" id="gB" role="3cqZAp">
          <node concept="2OqwBi" id="gC" role="3cqZAk">
            <node concept="37vLTw" id="gD" role="2Oq$k0">
              <ref role="3cqZAo" node="eU" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="gE" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~ConceptIndex.index(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="index" />
              <node concept="37vLTw" id="gF" role="37wK5m">
                <ref role="3cqZAo" node="gA" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="gA" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="gG" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="f8" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="gH">
    <property role="TrG5h" value="StructureAspectDescriptor" />
    <node concept="3uibUv" id="gI" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseStructureAspectDescriptor" resolve="BaseStructureAspectDescriptor" />
    </node>
    <node concept="312cEg" id="gJ" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCommunicates" />
      <node concept="3uibUv" id="hi" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hj" role="33vP2m">
        <ref role="37wK5l" node="hb" resolve="createDescriptorForCommunicates" />
      </node>
    </node>
    <node concept="312cEg" id="gK" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCommunicationProtocol" />
      <node concept="3uibUv" id="hk" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hl" role="33vP2m">
        <ref role="37wK5l" node="hc" resolve="createDescriptorForCommunicationProtocol" />
      </node>
    </node>
    <node concept="312cEg" id="gL" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptContainer" />
      <node concept="3uibUv" id="hm" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hn" role="33vP2m">
        <ref role="37wK5l" node="hd" resolve="createDescriptorForContainer" />
      </node>
    </node>
    <node concept="312cEg" id="gM" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptEnvironment" />
      <node concept="3uibUv" id="ho" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hp" role="33vP2m">
        <ref role="37wK5l" node="he" resolve="createDescriptorForEnvironment" />
      </node>
    </node>
    <node concept="312cEg" id="gN" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptMicroservice" />
      <node concept="3uibUv" id="hq" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hr" role="33vP2m">
        <ref role="37wK5l" node="hf" resolve="createDescriptorForMicroservice" />
      </node>
    </node>
    <node concept="312cEg" id="gO" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptServerNode" />
      <node concept="3uibUv" id="hs" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="ht" role="33vP2m">
        <ref role="37wK5l" node="hg" resolve="createDescriptorForServerNode" />
      </node>
    </node>
    <node concept="312cEg" id="gP" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptVirtualMachine" />
      <node concept="3uibUv" id="hu" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="hv" role="33vP2m">
        <ref role="37wK5l" node="hh" resolve="createDescriptorForVirtualMachine" />
      </node>
    </node>
    <node concept="312cEg" id="gQ" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationEnvironmentType" />
      <node concept="3uibUv" id="hw" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="hx" role="33vP2m">
        <node concept="1pGfFk" id="hy" role="2ShVmc">
          <ref role="37wK5l" node="42" resolve="EnumerationDescriptor_EnvironmentType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="gR" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationMicroserviceCommunicationType" />
      <node concept="3uibUv" id="hz" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="h$" role="33vP2m">
        <node concept="1pGfFk" id="h_" role="2ShVmc">
          <ref role="37wK5l" node="6O" resolve="EnumerationDescriptor_MicroserviceCommunicationType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="gS" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationMicroserviceType" />
      <node concept="3uibUv" id="hA" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="hB" role="33vP2m">
        <node concept="1pGfFk" id="hC" role="2ShVmc">
          <ref role="37wK5l" node="96" resolve="EnumerationDescriptor_MicroserviceType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="gT" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myEnumerationVMType" />
      <node concept="3uibUv" id="hD" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~EnumerationDescriptor" resolve="EnumerationDescriptor" />
      </node>
      <node concept="2ShNRf" id="hE" role="33vP2m">
        <node concept="1pGfFk" id="hF" role="2ShVmc">
          <ref role="37wK5l" node="b8" resolve="EnumerationDescriptor_VMType" />
        </node>
      </node>
    </node>
    <node concept="312cEg" id="gU" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myCSDatatypeIP" />
      <node concept="3uibUv" id="hG" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConstrainedStringDatatypeDescriptor" resolve="ConstrainedStringDatatypeDescriptor" />
      </node>
      <node concept="2ShNRf" id="hH" role="33vP2m">
        <node concept="1pGfFk" id="hI" role="2ShVmc">
          <ref role="37wK5l" to="ze1i:~ConstrainedStringDatatypeDescriptorImpl.&lt;init&gt;(long,long,long,java.lang.String,java.lang.String,java.lang.String)" resolve="ConstrainedStringDatatypeDescriptorImpl" />
          <node concept="1adDum" id="hJ" role="37wK5m">
            <property role="1adDun" value="0x3d827bac02154a87L" />
          </node>
          <node concept="1adDum" id="hK" role="37wK5m">
            <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
          </node>
          <node concept="1adDum" id="hL" role="37wK5m">
            <property role="1adDun" value="0x2e2e087c4bdeb16bL" />
          </node>
          <node concept="Xl_RD" id="hM" role="37wK5m">
            <property role="Xl_RC" value="IP" />
          </node>
          <node concept="Xl_RD" id="hN" role="37wK5m">
            <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227755" />
          </node>
          <node concept="Xl_RD" id="hO" role="37wK5m">
            <property role="Xl_RC" value="\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEg" id="gV" role="jymVt">
      <property role="TrG5h" value="myIndexSwitch" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="hP" role="1B3o_S" />
      <node concept="3uibUv" id="hQ" role="1tU5fm">
        <ref role="3uigEE" node="eT" resolve="LanguageConceptSwitch" />
      </node>
    </node>
    <node concept="3Tm1VV" id="gW" role="1B3o_S" />
    <node concept="2tJIrI" id="gX" role="jymVt" />
    <node concept="3clFbW" id="gY" role="jymVt">
      <node concept="3cqZAl" id="hR" role="3clF45" />
      <node concept="3Tm1VV" id="hS" role="1B3o_S" />
      <node concept="3clFbS" id="hT" role="3clF47">
        <node concept="3clFbF" id="hU" role="3cqZAp">
          <node concept="37vLTI" id="hV" role="3clFbG">
            <node concept="2ShNRf" id="hW" role="37vLTx">
              <node concept="1pGfFk" id="hY" role="2ShVmc">
                <ref role="37wK5l" node="f3" resolve="LanguageConceptSwitch" />
              </node>
            </node>
            <node concept="37vLTw" id="hX" role="37vLTJ">
              <ref role="3cqZAo" node="gV" resolve="myIndexSwitch" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="gZ" role="jymVt" />
    <node concept="2tJIrI" id="h0" role="jymVt" />
    <node concept="3clFb_" id="h1" role="jymVt">
      <property role="TrG5h" value="reportDependencies" />
      <node concept="3Tm1VV" id="hZ" role="1B3o_S" />
      <node concept="3cqZAl" id="i0" role="3clF45" />
      <node concept="37vLTG" id="i1" role="3clF46">
        <property role="TrG5h" value="deps" />
        <node concept="3uibUv" id="i4" role="1tU5fm">
          <ref role="3uigEE" to="ze1i:~StructureAspectDescriptor$Dependencies" resolve="StructureAspectDescriptor.Dependencies" />
        </node>
      </node>
      <node concept="3clFbS" id="i2" role="3clF47">
        <node concept="3clFbF" id="i5" role="3cqZAp">
          <node concept="2OqwBi" id="i6" role="3clFbG">
            <node concept="37vLTw" id="i7" role="2Oq$k0">
              <ref role="3cqZAo" node="i1" resolve="deps" />
            </node>
            <node concept="liA8E" id="i8" role="2OqNvi">
              <ref role="37wK5l" to="ze1i:~StructureAspectDescriptor$Dependencies.extendedLanguage(long,long,java.lang.String)" resolve="extendedLanguage" />
              <node concept="1adDum" id="i9" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="ia" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="Xl_RD" id="ib" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.lang.core" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="i3" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="h2" role="jymVt" />
    <node concept="3clFb_" id="h3" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="od$2w" value="false" />
      <property role="TrG5h" value="getDescriptors" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="ic" role="3clF47">
        <node concept="3cpWs6" id="ig" role="3cqZAp">
          <node concept="2YIFZM" id="ih" role="3cqZAk">
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
            <node concept="37vLTw" id="ii" role="37wK5m">
              <ref role="3cqZAo" node="gJ" resolve="myConceptCommunicates" />
            </node>
            <node concept="37vLTw" id="ij" role="37wK5m">
              <ref role="3cqZAo" node="gK" resolve="myConceptCommunicationProtocol" />
            </node>
            <node concept="37vLTw" id="ik" role="37wK5m">
              <ref role="3cqZAo" node="gL" resolve="myConceptContainer" />
            </node>
            <node concept="37vLTw" id="il" role="37wK5m">
              <ref role="3cqZAo" node="gM" resolve="myConceptEnvironment" />
            </node>
            <node concept="37vLTw" id="im" role="37wK5m">
              <ref role="3cqZAo" node="gN" resolve="myConceptMicroservice" />
            </node>
            <node concept="37vLTw" id="in" role="37wK5m">
              <ref role="3cqZAo" node="gO" resolve="myConceptServerNode" />
            </node>
            <node concept="37vLTw" id="io" role="37wK5m">
              <ref role="3cqZAo" node="gP" resolve="myConceptVirtualMachine" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="id" role="1B3o_S" />
      <node concept="3uibUv" id="ie" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="ip" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
        </node>
      </node>
      <node concept="2AHcQZ" id="if" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="h4" role="jymVt" />
    <node concept="3clFb_" id="h5" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="iq" role="1B3o_S" />
      <node concept="37vLTG" id="ir" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="iw" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
      <node concept="3clFbS" id="is" role="3clF47">
        <node concept="3KaCP$" id="ix" role="3cqZAp">
          <node concept="3KbdKl" id="iy" role="3KbHQx">
            <node concept="3clFbS" id="iF" role="3Kbo56">
              <node concept="3cpWs6" id="iH" role="3cqZAp">
                <node concept="37vLTw" id="iI" role="3cqZAk">
                  <ref role="3cqZAo" node="gJ" resolve="myConceptCommunicates" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="iG" role="3Kbmr1">
              <ref role="3cqZAo" node="eV" resolve="Communicates" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="iz" role="3KbHQx">
            <node concept="3clFbS" id="iJ" role="3Kbo56">
              <node concept="3cpWs6" id="iL" role="3cqZAp">
                <node concept="37vLTw" id="iM" role="3cqZAk">
                  <ref role="3cqZAo" node="gK" resolve="myConceptCommunicationProtocol" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="iK" role="3Kbmr1">
              <ref role="3cqZAo" node="eW" resolve="CommunicationProtocol" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="i$" role="3KbHQx">
            <node concept="3clFbS" id="iN" role="3Kbo56">
              <node concept="3cpWs6" id="iP" role="3cqZAp">
                <node concept="37vLTw" id="iQ" role="3cqZAk">
                  <ref role="3cqZAo" node="gL" resolve="myConceptContainer" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="iO" role="3Kbmr1">
              <ref role="3cqZAo" node="eX" resolve="Container" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="i_" role="3KbHQx">
            <node concept="3clFbS" id="iR" role="3Kbo56">
              <node concept="3cpWs6" id="iT" role="3cqZAp">
                <node concept="37vLTw" id="iU" role="3cqZAk">
                  <ref role="3cqZAo" node="gM" resolve="myConceptEnvironment" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="iS" role="3Kbmr1">
              <ref role="3cqZAo" node="eY" resolve="Environment" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="iA" role="3KbHQx">
            <node concept="3clFbS" id="iV" role="3Kbo56">
              <node concept="3cpWs6" id="iX" role="3cqZAp">
                <node concept="37vLTw" id="iY" role="3cqZAk">
                  <ref role="3cqZAo" node="gN" resolve="myConceptMicroservice" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="iW" role="3Kbmr1">
              <ref role="3cqZAo" node="eZ" resolve="Microservice" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="iB" role="3KbHQx">
            <node concept="3clFbS" id="iZ" role="3Kbo56">
              <node concept="3cpWs6" id="j1" role="3cqZAp">
                <node concept="37vLTw" id="j2" role="3cqZAk">
                  <ref role="3cqZAo" node="gO" resolve="myConceptServerNode" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="j0" role="3Kbmr1">
              <ref role="3cqZAo" node="f0" resolve="ServerNode" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="3KbdKl" id="iC" role="3KbHQx">
            <node concept="3clFbS" id="j3" role="3Kbo56">
              <node concept="3cpWs6" id="j5" role="3cqZAp">
                <node concept="37vLTw" id="j6" role="3cqZAk">
                  <ref role="3cqZAo" node="gP" resolve="myConceptVirtualMachine" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="j4" role="3Kbmr1">
              <ref role="3cqZAo" node="f1" resolve="VirtualMachine" />
              <ref role="1PxDUh" node="eT" resolve="LanguageConceptSwitch" />
            </node>
          </node>
          <node concept="2OqwBi" id="iD" role="3KbGdf">
            <node concept="37vLTw" id="j7" role="2Oq$k0">
              <ref role="3cqZAo" node="gV" resolve="myIndexSwitch" />
            </node>
            <node concept="liA8E" id="j8" role="2OqNvi">
              <ref role="37wK5l" node="f5" resolve="index" />
              <node concept="37vLTw" id="j9" role="37wK5m">
                <ref role="3cqZAo" node="ir" resolve="id" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="iE" role="3Kb1Dw">
            <node concept="3cpWs6" id="ja" role="3cqZAp">
              <node concept="10Nm6u" id="jb" role="3cqZAk" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="it" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="2AHcQZ" id="iu" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="iv" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
    <node concept="2tJIrI" id="h6" role="jymVt" />
    <node concept="3clFb_" id="h7" role="jymVt">
      <property role="TrG5h" value="getDataTypeDescriptors" />
      <node concept="3Tm1VV" id="jc" role="1B3o_S" />
      <node concept="3uibUv" id="jd" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="jg" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~DataTypeDescriptor" resolve="DataTypeDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="je" role="3clF47">
        <node concept="3cpWs6" id="jh" role="3cqZAp">
          <node concept="2YIFZM" id="ji" role="3cqZAk">
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...)" resolve="asList" />
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <node concept="37vLTw" id="jj" role="37wK5m">
              <ref role="3cqZAo" node="gQ" resolve="myEnumerationEnvironmentType" />
            </node>
            <node concept="37vLTw" id="jk" role="37wK5m">
              <ref role="3cqZAo" node="gR" resolve="myEnumerationMicroserviceCommunicationType" />
            </node>
            <node concept="37vLTw" id="jl" role="37wK5m">
              <ref role="3cqZAo" node="gS" resolve="myEnumerationMicroserviceType" />
            </node>
            <node concept="37vLTw" id="jm" role="37wK5m">
              <ref role="3cqZAo" node="gT" resolve="myEnumerationVMType" />
            </node>
            <node concept="37vLTw" id="jn" role="37wK5m">
              <ref role="3cqZAo" node="gU" resolve="myCSDatatypeIP" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="jf" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="h8" role="jymVt" />
    <node concept="3clFb_" id="h9" role="jymVt">
      <property role="TrG5h" value="internalIndex" />
      <node concept="10Oyi0" id="jo" role="3clF45" />
      <node concept="3clFbS" id="jp" role="3clF47">
        <node concept="3cpWs6" id="jr" role="3cqZAp">
          <node concept="2OqwBi" id="js" role="3cqZAk">
            <node concept="37vLTw" id="jt" role="2Oq$k0">
              <ref role="3cqZAo" node="gV" resolve="myIndexSwitch" />
            </node>
            <node concept="liA8E" id="ju" role="2OqNvi">
              <ref role="37wK5l" node="f7" resolve="index" />
              <node concept="37vLTw" id="jv" role="37wK5m">
                <ref role="3cqZAo" node="jq" resolve="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="jq" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="jw" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ha" role="jymVt" />
    <node concept="2YIFZL" id="hb" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCommunicates" />
      <node concept="3clFbS" id="jx" role="3clF47">
        <node concept="3cpWs8" id="j$" role="3cqZAp">
          <node concept="3cpWsn" id="jH" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="jI" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="jJ" role="33vP2m">
              <node concept="1pGfFk" id="jK" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="jL" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="jM" role="37wK5m">
                  <property role="Xl_RC" value="Communicates" />
                </node>
                <node concept="1adDum" id="jN" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="jO" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="jP" role="37wK5m">
                  <property role="1adDun" value="0x401f62f44cfb5204L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="j_" role="3cqZAp">
          <node concept="2OqwBi" id="jQ" role="3clFbG">
            <node concept="37vLTw" id="jR" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="jS" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="jT" role="37wK5m" />
              <node concept="3clFbT" id="jU" role="37wK5m" />
              <node concept="3clFbT" id="jV" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jA" role="3cqZAp">
          <node concept="2OqwBi" id="jW" role="3clFbG">
            <node concept="37vLTw" id="jX" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="jY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(java.lang.String,long,long,long)" resolve="super_" />
              <node concept="Xl_RD" id="jZ" role="37wK5m">
                <property role="Xl_RC" value="MicroserviceArchitectureLanguage.structure.CommunicationProtocol" />
              </node>
              <node concept="1adDum" id="k0" role="37wK5m">
                <property role="1adDun" value="0x3d827bac02154a87L" />
              </node>
              <node concept="1adDum" id="k1" role="37wK5m">
                <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
              </node>
              <node concept="1adDum" id="k2" role="37wK5m">
                <property role="1adDun" value="0x2e2e087c4bdf080fL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jB" role="3cqZAp">
          <node concept="2OqwBi" id="k3" role="3clFbG">
            <node concept="37vLTw" id="k4" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="k5" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="k6" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/4620520544108499460" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jC" role="3cqZAp">
          <node concept="2OqwBi" id="k7" role="3clFbG">
            <node concept="37vLTw" id="k8" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="k9" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="ka" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jD" role="3cqZAp">
          <node concept="2OqwBi" id="kb" role="3clFbG">
            <node concept="2OqwBi" id="kc" role="2Oq$k0">
              <node concept="2OqwBi" id="ke" role="2Oq$k0">
                <node concept="2OqwBi" id="kg" role="2Oq$k0">
                  <node concept="2OqwBi" id="ki" role="2Oq$k0">
                    <node concept="37vLTw" id="kk" role="2Oq$k0">
                      <ref role="3cqZAo" node="jH" resolve="b" />
                    </node>
                    <node concept="liA8E" id="kl" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.associate(java.lang.String,long)" resolve="associate" />
                      <node concept="Xl_RD" id="km" role="37wK5m">
                        <property role="Xl_RC" value="microservice1" />
                      </node>
                      <node concept="1adDum" id="kn" role="37wK5m">
                        <property role="1adDun" value="0x401f62f44cfb5205L" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="kj" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.target(long,long,long)" resolve="target" />
                    <node concept="1adDum" id="ko" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                    </node>
                    <node concept="1adDum" id="kp" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                    </node>
                    <node concept="1adDum" id="kq" role="37wK5m">
                      <property role="1adDun" value="0x2e21840e21edea85L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="kh" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.optional(boolean)" resolve="optional" />
                  <node concept="3clFbT" id="kr" role="37wK5m" />
                </node>
              </node>
              <node concept="liA8E" id="kf" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="ks" role="37wK5m">
                  <property role="Xl_RC" value="4620520544108499461" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="kd" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jE" role="3cqZAp">
          <node concept="2OqwBi" id="kt" role="3clFbG">
            <node concept="2OqwBi" id="ku" role="2Oq$k0">
              <node concept="2OqwBi" id="kw" role="2Oq$k0">
                <node concept="2OqwBi" id="ky" role="2Oq$k0">
                  <node concept="2OqwBi" id="k$" role="2Oq$k0">
                    <node concept="37vLTw" id="kA" role="2Oq$k0">
                      <ref role="3cqZAo" node="jH" resolve="b" />
                    </node>
                    <node concept="liA8E" id="kB" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.associate(java.lang.String,long)" resolve="associate" />
                      <node concept="Xl_RD" id="kC" role="37wK5m">
                        <property role="Xl_RC" value="microservice2" />
                      </node>
                      <node concept="1adDum" id="kD" role="37wK5m">
                        <property role="1adDun" value="0x401f62f44cfb5207L" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="k_" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.target(long,long,long)" resolve="target" />
                    <node concept="1adDum" id="kE" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                    </node>
                    <node concept="1adDum" id="kF" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                    </node>
                    <node concept="1adDum" id="kG" role="37wK5m">
                      <property role="1adDun" value="0x2e21840e21edea85L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="kz" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.optional(boolean)" resolve="optional" />
                  <node concept="3clFbT" id="kH" role="37wK5m" />
                </node>
              </node>
              <node concept="liA8E" id="kx" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="kI" role="37wK5m">
                  <property role="Xl_RC" value="4620520544108499463" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="kv" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="jF" role="3cqZAp">
          <node concept="2OqwBi" id="kJ" role="3clFbG">
            <node concept="37vLTw" id="kK" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="kL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="kM" role="37wK5m">
                <property role="Xl_RC" value="comm" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="jG" role="3cqZAp">
          <node concept="2OqwBi" id="kN" role="3cqZAk">
            <node concept="37vLTw" id="kO" role="2Oq$k0">
              <ref role="3cqZAo" node="jH" resolve="b" />
            </node>
            <node concept="liA8E" id="kP" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="jy" role="1B3o_S" />
      <node concept="3uibUv" id="jz" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="hc" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCommunicationProtocol" />
      <node concept="3clFbS" id="kQ" role="3clF47">
        <node concept="3cpWs8" id="kT" role="3cqZAp">
          <node concept="3cpWsn" id="l0" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="l1" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="l2" role="33vP2m">
              <node concept="1pGfFk" id="l3" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="l4" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="l5" role="37wK5m">
                  <property role="Xl_RC" value="CommunicationProtocol" />
                </node>
                <node concept="1adDum" id="l6" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="l7" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="l8" role="37wK5m">
                  <property role="1adDun" value="0x2e2e087c4bdf080fL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kU" role="3cqZAp">
          <node concept="2OqwBi" id="l9" role="3clFbG">
            <node concept="37vLTw" id="la" role="2Oq$k0">
              <ref role="3cqZAo" node="l0" resolve="b" />
            </node>
            <node concept="liA8E" id="lb" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="lc" role="37wK5m" />
              <node concept="3clFbT" id="ld" role="37wK5m" />
              <node concept="3clFbT" id="le" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kV" role="3cqZAp">
          <node concept="2OqwBi" id="lf" role="3clFbG">
            <node concept="37vLTw" id="lg" role="2Oq$k0">
              <ref role="3cqZAo" node="l0" resolve="b" />
            </node>
            <node concept="liA8E" id="lh" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="li" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615249935" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kW" role="3cqZAp">
          <node concept="2OqwBi" id="lj" role="3clFbG">
            <node concept="37vLTw" id="lk" role="2Oq$k0">
              <ref role="3cqZAo" node="l0" resolve="b" />
            </node>
            <node concept="liA8E" id="ll" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="lm" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kX" role="3cqZAp">
          <node concept="2OqwBi" id="ln" role="3clFbG">
            <node concept="2OqwBi" id="lo" role="2Oq$k0">
              <node concept="2OqwBi" id="lq" role="2Oq$k0">
                <node concept="2OqwBi" id="ls" role="2Oq$k0">
                  <node concept="37vLTw" id="lu" role="2Oq$k0">
                    <ref role="3cqZAo" node="l0" resolve="b" />
                  </node>
                  <node concept="liA8E" id="lv" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="lw" role="37wK5m">
                      <property role="Xl_RC" value="Type" />
                    </node>
                    <node concept="1adDum" id="lx" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdf0817L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="lt" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="ly" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:3327606504615227741" />
                    <node concept="1adDum" id="lz" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                      <uo k="s:originTrace" v="n:3327606504615227741" />
                    </node>
                    <node concept="1adDum" id="l$" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                      <uo k="s:originTrace" v="n:3327606504615227741" />
                    </node>
                    <node concept="1adDum" id="l_" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb15dL" />
                      <uo k="s:originTrace" v="n:3327606504615227741" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="lr" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="lA" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249943" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="lp" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="kY" role="3cqZAp">
          <node concept="2OqwBi" id="lB" role="3clFbG">
            <node concept="37vLTw" id="lC" role="2Oq$k0">
              <ref role="3cqZAo" node="l0" resolve="b" />
            </node>
            <node concept="liA8E" id="lD" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="lE" role="37wK5m">
                <property role="Xl_RC" value="comm. protocol" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="kZ" role="3cqZAp">
          <node concept="2OqwBi" id="lF" role="3cqZAk">
            <node concept="37vLTw" id="lG" role="2Oq$k0">
              <ref role="3cqZAo" node="l0" resolve="b" />
            </node>
            <node concept="liA8E" id="lH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="kR" role="1B3o_S" />
      <node concept="3uibUv" id="kS" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="hd" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForContainer" />
      <node concept="3clFbS" id="lI" role="3clF47">
        <node concept="3cpWs8" id="lL" role="3cqZAp">
          <node concept="3cpWsn" id="lV" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="lW" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="lX" role="33vP2m">
              <node concept="1pGfFk" id="lY" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="lZ" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="m0" role="37wK5m">
                  <property role="Xl_RC" value="Container" />
                </node>
                <node concept="1adDum" id="m1" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="m2" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="m3" role="37wK5m">
                  <property role="1adDun" value="0x2e2e087c4bdeb0d7L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lM" role="3cqZAp">
          <node concept="2OqwBi" id="m4" role="3clFbG">
            <node concept="37vLTw" id="m5" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="m6" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="m7" role="37wK5m" />
              <node concept="3clFbT" id="m8" role="37wK5m" />
              <node concept="3clFbT" id="m9" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lN" role="3cqZAp">
          <node concept="2OqwBi" id="ma" role="3clFbG">
            <node concept="37vLTw" id="mb" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="mc" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="md" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="me" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="mf" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lO" role="3cqZAp">
          <node concept="2OqwBi" id="mg" role="3clFbG">
            <node concept="37vLTw" id="mh" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="mi" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="mj" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227607" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lP" role="3cqZAp">
          <node concept="2OqwBi" id="mk" role="3clFbG">
            <node concept="37vLTw" id="ml" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="mm" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="mn" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lQ" role="3cqZAp">
          <node concept="2OqwBi" id="mo" role="3clFbG">
            <node concept="2OqwBi" id="mp" role="2Oq$k0">
              <node concept="2OqwBi" id="mr" role="2Oq$k0">
                <node concept="2OqwBi" id="mt" role="2Oq$k0">
                  <node concept="37vLTw" id="mv" role="2Oq$k0">
                    <ref role="3cqZAo" node="lV" resolve="b" />
                  </node>
                  <node concept="liA8E" id="mw" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="mx" role="37wK5m">
                      <property role="Xl_RC" value="IP" />
                    </node>
                    <node concept="1adDum" id="my" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb169L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="mu" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="mz" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:3327606504615227755" />
                    <node concept="1adDum" id="m$" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                      <uo k="s:originTrace" v="n:3327606504615227755" />
                    </node>
                    <node concept="1adDum" id="m_" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                      <uo k="s:originTrace" v="n:3327606504615227755" />
                    </node>
                    <node concept="1adDum" id="mA" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb16bL" />
                      <uo k="s:originTrace" v="n:3327606504615227755" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="ms" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="mB" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227753" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="mq" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lR" role="3cqZAp">
          <node concept="2OqwBi" id="mC" role="3clFbG">
            <node concept="2OqwBi" id="mD" role="2Oq$k0">
              <node concept="2OqwBi" id="mF" role="2Oq$k0">
                <node concept="2OqwBi" id="mH" role="2Oq$k0">
                  <node concept="37vLTw" id="mJ" role="2Oq$k0">
                    <ref role="3cqZAo" node="lV" resolve="b" />
                  </node>
                  <node concept="liA8E" id="mK" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="mL" role="37wK5m">
                      <property role="Xl_RC" value="Port" />
                    </node>
                    <node concept="1adDum" id="mM" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb16cL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="mI" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="mN" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.INTEGER" resolve="INTEGER" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="mG" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="mO" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227756" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="mE" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lS" role="3cqZAp">
          <node concept="2OqwBi" id="mP" role="3clFbG">
            <node concept="2OqwBi" id="mQ" role="2Oq$k0">
              <node concept="2OqwBi" id="mS" role="2Oq$k0">
                <node concept="2OqwBi" id="mU" role="2Oq$k0">
                  <node concept="2OqwBi" id="mW" role="2Oq$k0">
                    <node concept="2OqwBi" id="mY" role="2Oq$k0">
                      <node concept="2OqwBi" id="n0" role="2Oq$k0">
                        <node concept="37vLTw" id="n2" role="2Oq$k0">
                          <ref role="3cqZAo" node="lV" resolve="b" />
                        </node>
                        <node concept="liA8E" id="n3" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="n4" role="37wK5m">
                            <property role="Xl_RC" value="Microservice" />
                          </node>
                          <node concept="1adDum" id="n5" role="37wK5m">
                            <property role="1adDun" value="0x2e2e087c4bdf0806L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="n1" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="n6" role="37wK5m">
                          <property role="1adDun" value="0x3d827bac02154a87L" />
                        </node>
                        <node concept="1adDum" id="n7" role="37wK5m">
                          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                        </node>
                        <node concept="1adDum" id="n8" role="37wK5m">
                          <property role="1adDun" value="0x2e21840e21edea85L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="mZ" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="n9" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="mX" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="na" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="mV" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="nb" role="37wK5m" />
                </node>
              </node>
              <node concept="liA8E" id="mT" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="nc" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249926" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="mR" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="lT" role="3cqZAp">
          <node concept="2OqwBi" id="nd" role="3clFbG">
            <node concept="37vLTw" id="ne" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="nf" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="ng" role="37wK5m">
                <property role="Xl_RC" value="container" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="lU" role="3cqZAp">
          <node concept="2OqwBi" id="nh" role="3cqZAk">
            <node concept="37vLTw" id="ni" role="2Oq$k0">
              <ref role="3cqZAo" node="lV" resolve="b" />
            </node>
            <node concept="liA8E" id="nj" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="lJ" role="1B3o_S" />
      <node concept="3uibUv" id="lK" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="he" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForEnvironment" />
      <node concept="3clFbS" id="nk" role="3clF47">
        <node concept="3cpWs8" id="nn" role="3cqZAp">
          <node concept="3cpWsn" id="ny" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="nz" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="n$" role="33vP2m">
              <node concept="1pGfFk" id="n_" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="nA" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="nB" role="37wK5m">
                  <property role="Xl_RC" value="Environment" />
                </node>
                <node concept="1adDum" id="nC" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="nD" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="nE" role="37wK5m">
                  <property role="1adDun" value="0x2e2e087c4bdeb11bL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="no" role="3cqZAp">
          <node concept="2OqwBi" id="nF" role="3clFbG">
            <node concept="37vLTw" id="nG" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="nH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="nI" role="37wK5m" />
              <node concept="3clFbT" id="nJ" role="37wK5m" />
              <node concept="3clFbT" id="nK" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="np" role="3cqZAp">
          <node concept="2OqwBi" id="nL" role="3clFbG">
            <node concept="37vLTw" id="nM" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="nN" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="nO" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="nP" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="nQ" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nq" role="3cqZAp">
          <node concept="2OqwBi" id="nR" role="3clFbG">
            <node concept="37vLTw" id="nS" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="nT" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="nU" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3327606504615227675" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nr" role="3cqZAp">
          <node concept="2OqwBi" id="nV" role="3clFbG">
            <node concept="37vLTw" id="nW" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="nX" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="nY" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ns" role="3cqZAp">
          <node concept="2OqwBi" id="nZ" role="3clFbG">
            <node concept="2OqwBi" id="o0" role="2Oq$k0">
              <node concept="2OqwBi" id="o2" role="2Oq$k0">
                <node concept="2OqwBi" id="o4" role="2Oq$k0">
                  <node concept="37vLTw" id="o6" role="2Oq$k0">
                    <ref role="3cqZAo" node="ny" resolve="b" />
                  </node>
                  <node concept="liA8E" id="o7" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="o8" role="37wK5m">
                      <property role="Xl_RC" value="Type" />
                    </node>
                    <node concept="1adDum" id="o9" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb136L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="o5" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="oa" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:3327606504615227682" />
                    <node concept="1adDum" id="ob" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                      <uo k="s:originTrace" v="n:3327606504615227682" />
                    </node>
                    <node concept="1adDum" id="oc" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                      <uo k="s:originTrace" v="n:3327606504615227682" />
                    </node>
                    <node concept="1adDum" id="od" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb122L" />
                      <uo k="s:originTrace" v="n:3327606504615227682" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="o3" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="oe" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227702" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="o1" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nt" role="3cqZAp">
          <node concept="2OqwBi" id="of" role="3clFbG">
            <node concept="2OqwBi" id="og" role="2Oq$k0">
              <node concept="2OqwBi" id="oi" role="2Oq$k0">
                <node concept="2OqwBi" id="ok" role="2Oq$k0">
                  <node concept="37vLTw" id="om" role="2Oq$k0">
                    <ref role="3cqZAo" node="ny" resolve="b" />
                  </node>
                  <node concept="liA8E" id="on" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="oo" role="37wK5m">
                      <property role="Xl_RC" value="Location" />
                    </node>
                    <node concept="1adDum" id="op" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb166L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="ol" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="oq" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="oj" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="or" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227750" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="oh" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nu" role="3cqZAp">
          <node concept="2OqwBi" id="os" role="3clFbG">
            <node concept="2OqwBi" id="ot" role="2Oq$k0">
              <node concept="2OqwBi" id="ov" role="2Oq$k0">
                <node concept="2OqwBi" id="ox" role="2Oq$k0">
                  <node concept="2OqwBi" id="oz" role="2Oq$k0">
                    <node concept="2OqwBi" id="o_" role="2Oq$k0">
                      <node concept="2OqwBi" id="oB" role="2Oq$k0">
                        <node concept="37vLTw" id="oD" role="2Oq$k0">
                          <ref role="3cqZAo" node="ny" resolve="b" />
                        </node>
                        <node concept="liA8E" id="oE" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="oF" role="37wK5m">
                            <property role="Xl_RC" value="NodeList" />
                          </node>
                          <node concept="1adDum" id="oG" role="37wK5m">
                            <property role="1adDun" value="0x2e2e087c4bdf0800L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="oC" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="oH" role="37wK5m">
                          <property role="1adDun" value="0x3d827bac02154a87L" />
                        </node>
                        <node concept="1adDum" id="oI" role="37wK5m">
                          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                        </node>
                        <node concept="1adDum" id="oJ" role="37wK5m">
                          <property role="1adDun" value="0x2e21840e21edea7cL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="oA" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="oK" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="o$" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="oL" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="oy" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="oM" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="ow" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="oN" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249920" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="ou" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nv" role="3cqZAp">
          <node concept="2OqwBi" id="oO" role="3clFbG">
            <node concept="2OqwBi" id="oP" role="2Oq$k0">
              <node concept="2OqwBi" id="oR" role="2Oq$k0">
                <node concept="2OqwBi" id="oT" role="2Oq$k0">
                  <node concept="2OqwBi" id="oV" role="2Oq$k0">
                    <node concept="2OqwBi" id="oX" role="2Oq$k0">
                      <node concept="2OqwBi" id="oZ" role="2Oq$k0">
                        <node concept="37vLTw" id="p1" role="2Oq$k0">
                          <ref role="3cqZAo" node="ny" resolve="b" />
                        </node>
                        <node concept="liA8E" id="p2" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="p3" role="37wK5m">
                            <property role="Xl_RC" value="Communications" />
                          </node>
                          <node concept="1adDum" id="p4" role="37wK5m">
                            <property role="1adDun" value="0x401f62f44cfb51e4L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="p0" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="p5" role="37wK5m">
                          <property role="1adDun" value="0x3d827bac02154a87L" />
                        </node>
                        <node concept="1adDum" id="p6" role="37wK5m">
                          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                        </node>
                        <node concept="1adDum" id="p7" role="37wK5m">
                          <property role="1adDun" value="0x401f62f44cfb5204L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="oY" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="p8" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="oW" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="p9" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="oU" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="pa" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="oS" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="pb" role="37wK5m">
                  <property role="Xl_RC" value="4620520544108499428" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="oQ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="nw" role="3cqZAp">
          <node concept="2OqwBi" id="pc" role="3clFbG">
            <node concept="37vLTw" id="pd" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="pe" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="pf" role="37wK5m">
                <property role="Xl_RC" value="env" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="nx" role="3cqZAp">
          <node concept="2OqwBi" id="pg" role="3cqZAk">
            <node concept="37vLTw" id="ph" role="2Oq$k0">
              <ref role="3cqZAo" node="ny" resolve="b" />
            </node>
            <node concept="liA8E" id="pi" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="nl" role="1B3o_S" />
      <node concept="3uibUv" id="nm" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="hf" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForMicroservice" />
      <node concept="3clFbS" id="pj" role="3clF47">
        <node concept="3cpWs8" id="pm" role="3cqZAp">
          <node concept="3cpWsn" id="pv" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="pw" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="px" role="33vP2m">
              <node concept="1pGfFk" id="py" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="pz" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="p$" role="37wK5m">
                  <property role="Xl_RC" value="Microservice" />
                </node>
                <node concept="1adDum" id="p_" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="pA" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="pB" role="37wK5m">
                  <property role="1adDun" value="0x2e21840e21edea85L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pn" role="3cqZAp">
          <node concept="2OqwBi" id="pC" role="3clFbG">
            <node concept="37vLTw" id="pD" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="pE" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="pF" role="37wK5m" />
              <node concept="3clFbT" id="pG" role="37wK5m" />
              <node concept="3clFbT" id="pH" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="po" role="3cqZAp">
          <node concept="2OqwBi" id="pI" role="3clFbG">
            <node concept="37vLTw" id="pJ" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="pK" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="pL" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="pM" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="pN" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pp" role="3cqZAp">
          <node concept="2OqwBi" id="pO" role="3clFbG">
            <node concept="37vLTw" id="pP" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="pQ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="pR" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3324083196209785477" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pq" role="3cqZAp">
          <node concept="2OqwBi" id="pS" role="3clFbG">
            <node concept="37vLTw" id="pT" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="pU" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="pV" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pr" role="3cqZAp">
          <node concept="2OqwBi" id="pW" role="3clFbG">
            <node concept="2OqwBi" id="pX" role="2Oq$k0">
              <node concept="2OqwBi" id="pZ" role="2Oq$k0">
                <node concept="2OqwBi" id="q1" role="2Oq$k0">
                  <node concept="37vLTw" id="q3" role="2Oq$k0">
                    <ref role="3cqZAo" node="pv" resolve="b" />
                  </node>
                  <node concept="liA8E" id="q4" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="q5" role="37wK5m">
                      <property role="Xl_RC" value="Type" />
                    </node>
                    <node concept="1adDum" id="q6" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb158L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="q2" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="q7" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:3327606504615227708" />
                    <node concept="1adDum" id="q8" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                      <uo k="s:originTrace" v="n:3327606504615227708" />
                    </node>
                    <node concept="1adDum" id="q9" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                      <uo k="s:originTrace" v="n:3327606504615227708" />
                    </node>
                    <node concept="1adDum" id="qa" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb13cL" />
                      <uo k="s:originTrace" v="n:3327606504615227708" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="q0" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="qb" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227736" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="pY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ps" role="3cqZAp">
          <node concept="2OqwBi" id="qc" role="3clFbG">
            <node concept="2OqwBi" id="qd" role="2Oq$k0">
              <node concept="2OqwBi" id="qf" role="2Oq$k0">
                <node concept="2OqwBi" id="qh" role="2Oq$k0">
                  <node concept="37vLTw" id="qj" role="2Oq$k0">
                    <ref role="3cqZAo" node="pv" resolve="b" />
                  </node>
                  <node concept="liA8E" id="qk" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="ql" role="37wK5m">
                      <property role="Xl_RC" value="Health" />
                    </node>
                    <node concept="1adDum" id="qm" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdf0808L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="qi" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="qn" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.BOOLEAN" resolve="BOOLEAN" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="qg" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="qo" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249928" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="qe" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="pt" role="3cqZAp">
          <node concept="2OqwBi" id="qp" role="3clFbG">
            <node concept="37vLTw" id="qq" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="qr" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="qs" role="37wK5m">
                <property role="Xl_RC" value="microservice" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="pu" role="3cqZAp">
          <node concept="2OqwBi" id="qt" role="3cqZAk">
            <node concept="37vLTw" id="qu" role="2Oq$k0">
              <ref role="3cqZAo" node="pv" resolve="b" />
            </node>
            <node concept="liA8E" id="qv" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="pk" role="1B3o_S" />
      <node concept="3uibUv" id="pl" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="hg" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForServerNode" />
      <node concept="3clFbS" id="qw" role="3clF47">
        <node concept="3cpWs8" id="qz" role="3cqZAp">
          <node concept="3cpWsn" id="qI" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="qJ" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="qK" role="33vP2m">
              <node concept="1pGfFk" id="qL" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="qM" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="qN" role="37wK5m">
                  <property role="Xl_RC" value="ServerNode" />
                </node>
                <node concept="1adDum" id="qO" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="qP" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="qQ" role="37wK5m">
                  <property role="1adDun" value="0x2e21840e21edea7cL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="q$" role="3cqZAp">
          <node concept="2OqwBi" id="qR" role="3clFbG">
            <node concept="37vLTw" id="qS" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="qT" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="qU" role="37wK5m" />
              <node concept="3clFbT" id="qV" role="37wK5m" />
              <node concept="3clFbT" id="qW" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="q_" role="3cqZAp">
          <node concept="2OqwBi" id="qX" role="3clFbG">
            <node concept="37vLTw" id="qY" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="qZ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="r0" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="r1" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="r2" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qA" role="3cqZAp">
          <node concept="2OqwBi" id="r3" role="3clFbG">
            <node concept="37vLTw" id="r4" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="r5" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="r6" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3324083196209785468" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qB" role="3cqZAp">
          <node concept="2OqwBi" id="r7" role="3clFbG">
            <node concept="37vLTw" id="r8" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="r9" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="ra" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qC" role="3cqZAp">
          <node concept="2OqwBi" id="rb" role="3clFbG">
            <node concept="2OqwBi" id="rc" role="2Oq$k0">
              <node concept="2OqwBi" id="re" role="2Oq$k0">
                <node concept="2OqwBi" id="rg" role="2Oq$k0">
                  <node concept="37vLTw" id="ri" role="2Oq$k0">
                    <ref role="3cqZAo" node="qI" resolve="b" />
                  </node>
                  <node concept="liA8E" id="rj" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="rk" role="37wK5m">
                      <property role="Xl_RC" value="RAM" />
                    </node>
                    <node concept="1adDum" id="rl" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb174L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="rh" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="rm" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="rf" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="rn" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227764" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="rd" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qD" role="3cqZAp">
          <node concept="2OqwBi" id="ro" role="3clFbG">
            <node concept="2OqwBi" id="rp" role="2Oq$k0">
              <node concept="2OqwBi" id="rr" role="2Oq$k0">
                <node concept="2OqwBi" id="rt" role="2Oq$k0">
                  <node concept="37vLTw" id="rv" role="2Oq$k0">
                    <ref role="3cqZAo" node="qI" resolve="b" />
                  </node>
                  <node concept="liA8E" id="rw" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="rx" role="37wK5m">
                      <property role="Xl_RC" value="Processor" />
                    </node>
                    <node concept="1adDum" id="ry" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb176L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="ru" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="rz" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="rs" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="r$" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227766" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="rq" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qE" role="3cqZAp">
          <node concept="2OqwBi" id="r_" role="3clFbG">
            <node concept="2OqwBi" id="rA" role="2Oq$k0">
              <node concept="2OqwBi" id="rC" role="2Oq$k0">
                <node concept="2OqwBi" id="rE" role="2Oq$k0">
                  <node concept="37vLTw" id="rG" role="2Oq$k0">
                    <ref role="3cqZAo" node="qI" resolve="b" />
                  </node>
                  <node concept="liA8E" id="rH" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="rI" role="37wK5m">
                      <property role="Xl_RC" value="Disk" />
                    </node>
                    <node concept="1adDum" id="rJ" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb179L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="rF" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="Rm8GO" id="rK" role="37wK5m">
                    <ref role="Rm8GQ" to="e8bb:~PrimitiveTypeId.STRING" resolve="STRING" />
                    <ref role="1Px2BO" to="e8bb:~PrimitiveTypeId" resolve="PrimitiveTypeId" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="rD" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="rL" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227769" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="rB" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qF" role="3cqZAp">
          <node concept="2OqwBi" id="rM" role="3clFbG">
            <node concept="2OqwBi" id="rN" role="2Oq$k0">
              <node concept="2OqwBi" id="rP" role="2Oq$k0">
                <node concept="2OqwBi" id="rR" role="2Oq$k0">
                  <node concept="2OqwBi" id="rT" role="2Oq$k0">
                    <node concept="2OqwBi" id="rV" role="2Oq$k0">
                      <node concept="2OqwBi" id="rX" role="2Oq$k0">
                        <node concept="37vLTw" id="rZ" role="2Oq$k0">
                          <ref role="3cqZAo" node="qI" resolve="b" />
                        </node>
                        <node concept="liA8E" id="s0" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="s1" role="37wK5m">
                            <property role="Xl_RC" value="VMList" />
                          </node>
                          <node concept="1adDum" id="s2" role="37wK5m">
                            <property role="1adDun" value="0x2e2e087c4bdf0802L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="rY" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="s3" role="37wK5m">
                          <property role="1adDun" value="0x3d827bac02154a87L" />
                        </node>
                        <node concept="1adDum" id="s4" role="37wK5m">
                          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                        </node>
                        <node concept="1adDum" id="s5" role="37wK5m">
                          <property role="1adDun" value="0x2e21840e21edea82L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="rW" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="s6" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="rU" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="s7" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="rS" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="s8" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="rQ" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="s9" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249922" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="rO" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="qG" role="3cqZAp">
          <node concept="2OqwBi" id="sa" role="3clFbG">
            <node concept="37vLTw" id="sb" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="sc" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="sd" role="37wK5m">
                <property role="Xl_RC" value="node" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="qH" role="3cqZAp">
          <node concept="2OqwBi" id="se" role="3cqZAk">
            <node concept="37vLTw" id="sf" role="2Oq$k0">
              <ref role="3cqZAo" node="qI" resolve="b" />
            </node>
            <node concept="liA8E" id="sg" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="qx" role="1B3o_S" />
      <node concept="3uibUv" id="qy" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="hh" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForVirtualMachine" />
      <node concept="3clFbS" id="sh" role="3clF47">
        <node concept="3cpWs8" id="sk" role="3cqZAp">
          <node concept="3cpWsn" id="st" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="su" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="sv" role="33vP2m">
              <node concept="1pGfFk" id="sw" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="sx" role="37wK5m">
                  <property role="Xl_RC" value="MicroserviceArchitectureLanguage" />
                </node>
                <node concept="Xl_RD" id="sy" role="37wK5m">
                  <property role="Xl_RC" value="VirtualMachine" />
                </node>
                <node concept="1adDum" id="sz" role="37wK5m">
                  <property role="1adDun" value="0x3d827bac02154a87L" />
                </node>
                <node concept="1adDum" id="s$" role="37wK5m">
                  <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                </node>
                <node concept="1adDum" id="s_" role="37wK5m">
                  <property role="1adDun" value="0x2e21840e21edea82L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sl" role="3cqZAp">
          <node concept="2OqwBi" id="sA" role="3clFbG">
            <node concept="37vLTw" id="sB" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="sC" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean)" resolve="class_" />
              <node concept="3clFbT" id="sD" role="37wK5m" />
              <node concept="3clFbT" id="sE" role="37wK5m" />
              <node concept="3clFbT" id="sF" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sm" role="3cqZAp">
          <node concept="2OqwBi" id="sG" role="3clFbG">
            <node concept="37vLTw" id="sH" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="sI" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long)" resolve="parent" />
              <node concept="1adDum" id="sJ" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="sK" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="sL" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sn" role="3cqZAp">
          <node concept="2OqwBi" id="sM" role="3clFbG">
            <node concept="37vLTw" id="sN" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="sO" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String)" resolve="origin" />
              <node concept="Xl_RD" id="sP" role="37wK5m">
                <property role="Xl_RC" value="r:48771403-405a-41ee-a755-08578f66c616(MicroserviceArchitectureLanguage.structure)/3324083196209785474" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="so" role="3cqZAp">
          <node concept="2OqwBi" id="sQ" role="3clFbG">
            <node concept="37vLTw" id="sR" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="sS" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.version(int)" resolve="version" />
              <node concept="3cmrfG" id="sT" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sp" role="3cqZAp">
          <node concept="2OqwBi" id="sU" role="3clFbG">
            <node concept="2OqwBi" id="sV" role="2Oq$k0">
              <node concept="2OqwBi" id="sX" role="2Oq$k0">
                <node concept="2OqwBi" id="sZ" role="2Oq$k0">
                  <node concept="37vLTw" id="t1" role="2Oq$k0">
                    <ref role="3cqZAo" node="st" resolve="b" />
                  </node>
                  <node concept="liA8E" id="t2" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.property(java.lang.String,long)" resolve="property" />
                    <node concept="Xl_RD" id="t3" role="37wK5m">
                      <property role="Xl_RC" value="Type" />
                    </node>
                    <node concept="1adDum" id="t4" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb172L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="t0" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.type(jetbrains.mps.smodel.adapter.ids.STypeId)" resolve="type" />
                  <node concept="2YIFZM" id="t5" role="37wK5m">
                    <ref role="37wK5l" to="e8bb:~MetaIdFactory.dataTypeId(long,long,long)" resolve="dataTypeId" />
                    <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                    <uo k="s:originTrace" v="n:3327606504615227713" />
                    <node concept="1adDum" id="t6" role="37wK5m">
                      <property role="1adDun" value="0x3d827bac02154a87L" />
                      <uo k="s:originTrace" v="n:3327606504615227713" />
                    </node>
                    <node concept="1adDum" id="t7" role="37wK5m">
                      <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                      <uo k="s:originTrace" v="n:3327606504615227713" />
                    </node>
                    <node concept="1adDum" id="t8" role="37wK5m">
                      <property role="1adDun" value="0x2e2e087c4bdeb141L" />
                      <uo k="s:originTrace" v="n:3327606504615227713" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="sY" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="t9" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615227762" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="sW" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$PropertyBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sq" role="3cqZAp">
          <node concept="2OqwBi" id="ta" role="3clFbG">
            <node concept="2OqwBi" id="tb" role="2Oq$k0">
              <node concept="2OqwBi" id="td" role="2Oq$k0">
                <node concept="2OqwBi" id="tf" role="2Oq$k0">
                  <node concept="2OqwBi" id="th" role="2Oq$k0">
                    <node concept="2OqwBi" id="tj" role="2Oq$k0">
                      <node concept="2OqwBi" id="tl" role="2Oq$k0">
                        <node concept="37vLTw" id="tn" role="2Oq$k0">
                          <ref role="3cqZAo" node="st" resolve="b" />
                        </node>
                        <node concept="liA8E" id="to" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long)" resolve="aggregate" />
                          <node concept="Xl_RD" id="tp" role="37wK5m">
                            <property role="Xl_RC" value="ContainterList" />
                          </node>
                          <node concept="1adDum" id="tq" role="37wK5m">
                            <property role="1adDun" value="0x2e2e087c4bdf0804L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="tm" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long)" resolve="target" />
                        <node concept="1adDum" id="tr" role="37wK5m">
                          <property role="1adDun" value="0x3d827bac02154a87L" />
                        </node>
                        <node concept="1adDum" id="ts" role="37wK5m">
                          <property role="1adDun" value="0x8b1c1ab047e79a3bL" />
                        </node>
                        <node concept="1adDum" id="tt" role="37wK5m">
                          <property role="1adDun" value="0x2e2e087c4bdeb0d7L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="tk" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean)" resolve="optional" />
                      <node concept="3clFbT" id="tu" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="ti" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean)" resolve="ordered" />
                    <node concept="3clFbT" id="tv" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="tg" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean)" resolve="multiple" />
                  <node concept="3clFbT" id="tw" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="te" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String)" resolve="origin" />
                <node concept="Xl_RD" id="tx" role="37wK5m">
                  <property role="Xl_RC" value="3327606504615249924" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="tc" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done()" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="sr" role="3cqZAp">
          <node concept="2OqwBi" id="ty" role="3clFbG">
            <node concept="37vLTw" id="tz" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="t$" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String)" resolve="alias" />
              <node concept="Xl_RD" id="t_" role="37wK5m">
                <property role="Xl_RC" value="VM" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="ss" role="3cqZAp">
          <node concept="2OqwBi" id="tA" role="3cqZAk">
            <node concept="37vLTw" id="tB" role="2Oq$k0">
              <ref role="3cqZAo" node="st" resolve="b" />
            </node>
            <node concept="liA8E" id="tC" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create()" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="si" role="1B3o_S" />
      <node concept="3uibUv" id="sj" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
  </node>
</model>

