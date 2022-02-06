<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:682a7112-8930-4be7-9c62-b7a6e9a975be(Microservices.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="3d827bac-0215-4a87-8b1c-1ab047e79a3b" name="MicroserviceArchitectureLanguage" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="3d827bac-0215-4a87-8b1c-1ab047e79a3b" name="MicroserviceArchitectureLanguage">
      <concept id="4620520544108499460" name="MicroserviceArchitectureLanguage.structure.Communicates" flags="ng" index="cT33K">
        <reference id="4620520544108499461" name="microservice1" index="cT33L" />
        <reference id="4620520544108499463" name="microservice2" index="cT33N" />
      </concept>
      <concept id="3324083196209785468" name="MicroserviceArchitectureLanguage.structure.ServerNode" flags="ng" index="fN6TM">
        <property id="3327606504615227769" name="Disk" index="1_Wb$5" />
        <property id="3327606504615227764" name="RAM" index="1_Wb$8" />
        <property id="3327606504615227766" name="Processor" index="1_Wb$a" />
        <child id="3327606504615249922" name="VMList" index="1_Wg1Y" />
      </concept>
      <concept id="3324083196209785477" name="MicroserviceArchitectureLanguage.structure.Microservice" flags="ng" index="fN6Ub">
        <property id="3327606504615227736" name="Type" index="1_Wb$$" />
        <property id="3327606504615249928" name="Health" index="1_Wg1O" />
      </concept>
      <concept id="3324083196209785474" name="MicroserviceArchitectureLanguage.structure.VirtualMachine" flags="ng" index="fN6Uc">
        <property id="3327606504615227762" name="Type" index="1_Wb$e" />
        <child id="3327606504615249924" name="ContainterList" index="1_Wg1S" />
      </concept>
      <concept id="3327606504615227607" name="MicroserviceArchitectureLanguage.structure.Container" flags="ng" index="1_WbyF">
        <property id="3327606504615227756" name="Port" index="1_Wb$g" />
        <property id="3327606504615227753" name="IP" index="1_Wb$l" />
        <child id="3327606504615249926" name="Microservice" index="1_Wg1U" />
      </concept>
      <concept id="3327606504615227675" name="MicroserviceArchitectureLanguage.structure.Environment" flags="ng" index="1_Wb_B">
        <property id="3327606504615227750" name="Location" index="1_Wb$q" />
        <property id="3327606504615227702" name="Type" index="1_Wb_a" />
        <child id="4620520544108499428" name="Communications" index="cT3cg" />
        <child id="3327606504615249920" name="NodeList" index="1_Wg1W" />
      </concept>
      <concept id="3327606504615249935" name="MicroserviceArchitectureLanguage.structure.CommunicationProtocol" flags="ng" index="1_Wg1N">
        <property id="3327606504615249943" name="Type" index="1_Wg1F" />
      </concept>
    </language>
  </registry>
  <node concept="1_Wb_B" id="41kL1ysHbjN">
    <property role="TrG5h" value="BookingSystem.Prod" />
    <property role="1_Wb$q" value="Rome" />
    <node concept="fN6TM" id="41kL1ysHbk2" role="1_Wg1W">
      <property role="TrG5h" value="Server1" />
      <property role="1_Wb$8" value="10 GB" />
      <property role="1_Wb$a" value="2.4 GHz" />
      <property role="1_Wb$5" value="40 GB" />
      <node concept="fN6Uc" id="41kL1ysHbk4" role="1_Wg1Y">
        <property role="TrG5h" value="VM1" />
        <node concept="1_WbyF" id="41kL1ysHbk6" role="1_Wg1S">
          <property role="TrG5h" value="Container1" />
          <property role="1_Wb$l" value="192.168.1.20" />
          <property role="1_Wb$g" value="8080" />
          <node concept="fN6Ub" id="41kL1ysHbkb" role="1_Wg1U">
            <property role="TrG5h" value="UserManagementService" />
            <property role="1_Wg1O" value="true" />
          </node>
        </node>
        <node concept="1_WbyF" id="41kL1ysHbk8" role="1_Wg1S">
          <property role="TrG5h" value="Container2" />
          <property role="1_Wb$l" value="192.168.1.10" />
          <property role="1_Wb$g" value="8081" />
          <node concept="fN6Ub" id="41kL1ysHbkl" role="1_Wg1U">
            <property role="TrG5h" value="PaymentService" />
            <property role="1_Wb$$" value="2SI27LbRF4Y/External" />
            <property role="1_Wg1O" value="true" />
          </node>
        </node>
        <node concept="1_WbyF" id="41kL1ysHbkn" role="1_Wg1S">
          <property role="TrG5h" value="Container3" />
          <property role="1_Wb$l" value="192.168.1.30" />
          <property role="1_Wb$g" value="8082" />
          <node concept="fN6Ub" id="41kL1ysHbkP" role="1_Wg1U">
            <property role="TrG5h" value="AnalyticsService" />
          </node>
        </node>
      </node>
    </node>
    <node concept="cT33K" id="41kL1ysHbjO" role="cT3cg">
      <ref role="cT33L" node="41kL1ysHbkP" resolve="AnalyticsMicroservice" />
      <ref role="cT33N" node="41kL1ysHbkb" resolve="UserManagementMicroservce" />
    </node>
    <node concept="cT33K" id="41kL1ysHAlp" role="cT3cg">
      <ref role="cT33L" node="41kL1ysHbkP" resolve="AnalyticsMicroservice" />
      <ref role="cT33N" node="41kL1ysHbkl" resolve="PaymentMicroservice" />
    </node>
  </node>
  <node concept="1_Wb_B" id="41kL1ysHAlf">
    <property role="TrG5h" value="SmartBuildingManagementSystem.Test" />
    <property role="1_Wb_a" value="2SI27LbRF4$/Test" />
    <property role="1_Wb$q" value="Bahrain" />
    <node concept="cT33K" id="41kL1ysHAlC" role="cT3cg">
      <property role="1_Wg1F" value="2SI27LbRF5u/RPC" />
      <ref role="cT33L" node="41kL1ysHAls" resolve="AuthorizationService" />
      <ref role="cT33N" node="41kL1ysHAlA" resolve="IOTGateway" />
    </node>
    <node concept="fN6TM" id="41kL1ysHAlg" role="1_Wg1W">
      <property role="TrG5h" value="Server1" />
      <property role="1_Wb$8" value="6 GB" />
      <property role="1_Wb$a" value="2.4 Ghz" />
      <property role="1_Wb$5" value="10 GB" />
      <node concept="fN6Uc" id="41kL1ysHAli" role="1_Wg1Y">
        <property role="TrG5h" value="VM1" />
        <property role="1_Wb$e" value="2SI27LbRF56/Windows" />
        <node concept="1_WbyF" id="41kL1ysHAlk" role="1_Wg1S">
          <property role="TrG5h" value="Container1" />
          <property role="1_Wb$l" value="172.10.10.41" />
          <property role="1_Wb$g" value="1119" />
          <node concept="fN6Ub" id="41kL1ysHAls" role="1_Wg1U">
            <property role="TrG5h" value="AuthorizationService" />
            <property role="1_Wb$$" value="2SI27LbRF4Y/External" />
            <property role="1_Wg1O" value="true" />
          </node>
        </node>
        <node concept="1_WbyF" id="41kL1ysHAlm" role="1_Wg1S">
          <property role="TrG5h" value="Container2" />
          <property role="1_Wb$l" value="172.10.20.42" />
          <property role="1_Wb$g" value="2020" />
          <node concept="fN6Ub" id="41kL1ysHAlA" role="1_Wg1U">
            <property role="TrG5h" value="IOTGateway" />
            <property role="1_Wg1O" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

