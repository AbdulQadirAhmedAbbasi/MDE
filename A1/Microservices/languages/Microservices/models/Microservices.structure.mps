<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:48771403-405a-41ee-a755-08578f66c616(Microservices.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1082978499127" name="jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration" flags="ng" index="Az7Fb">
        <property id="1083066089218" name="constraint" index="FLfZY" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765907488" name="conceptShortDescription" index="R4oN_" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
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
  <node concept="1TIwiD" id="2Sxx0SxVuDW">
    <property role="EcuMT" value="3324083196209785468" />
    <property role="TrG5h" value="ServerNode" />
    <property role="R4oN_" value="A meda class for hardware server node to be deployed in environment" />
    <property role="34LRSv" value="node" />
    <property role="3GE5qa" value="Components" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2Sxx0SxVuDX" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5O" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227764" />
      <property role="TrG5h" value="RAM" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5Q" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227766" />
      <property role="TrG5h" value="Processor" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5T" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227769" />
      <property role="TrG5h" value="Disk" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2SI27LbRKw2" role="1TKVEi">
      <property role="IQ2ns" value="3327606504615249922" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="VMList" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2Sxx0SxVuE2" resolve="VirtualMachine" />
    </node>
  </node>
  <node concept="1TIwiD" id="2Sxx0SxVuE2">
    <property role="EcuMT" value="3324083196209785474" />
    <property role="TrG5h" value="VirtualMachine" />
    <property role="R4oN_" value="A meta class for virtual machine for holding containers and to be deployed on server node" />
    <property role="34LRSv" value="VM" />
    <property role="3GE5qa" value="Components" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2Sxx0SxVuE3" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5M" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227762" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="2SI27LbRF51" resolve="VMType" />
    </node>
    <node concept="1TJgyj" id="2SI27LbRKw4" role="1TKVEi">
      <property role="IQ2ns" value="3327606504615249924" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="ContainterList" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2SI27LbRF3n" resolve="Container" />
    </node>
  </node>
  <node concept="1TIwiD" id="2Sxx0SxVuE5">
    <property role="EcuMT" value="3324083196209785477" />
    <property role="TrG5h" value="Microservice" />
    <property role="R4oN_" value="A meta class for microservice to be hosted inside container" />
    <property role="3GE5qa" value="Components" />
    <property role="34LRSv" value="microservice" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2Sxx0SxVuE6" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5o" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227736" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="2SI27LbRF4W" resolve="MicroserviceType" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRKw8" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615249928" />
      <property role="TrG5h" value="Health" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="2SI27LbRF3n">
    <property role="EcuMT" value="3327606504615227607" />
    <property role="TrG5h" value="Container" />
    <property role="R4oN_" value="A meta class for container which will host docker image having microservice" />
    <property role="34LRSv" value="container" />
    <property role="3GE5qa" value="Components" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2SI27LbRF3o" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5D" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227753" />
      <property role="TrG5h" value="IP" />
      <ref role="AX2Wp" node="2SI27LbRF5F" resolve="IP" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5G" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227756" />
      <property role="TrG5h" value="Port" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="2SI27LbRKw6" role="1TKVEi">
      <property role="IQ2ns" value="3327606504615249926" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Microservice" />
      <ref role="20lvS9" node="2Sxx0SxVuE5" resolve="Microservice" />
    </node>
  </node>
  <node concept="1TIwiD" id="2SI27LbRF4r">
    <property role="EcuMT" value="3327606504615227675" />
    <property role="TrG5h" value="Environment" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="env" />
    <property role="R4oN_" value="Meta class for environment hosting microservice architecture based application" />
    <property role="3GE5qa" value="Main" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2SI27LbRF4w" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF4Q" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227702" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="2SI27LbRF4y" resolve="EnvironmentType" />
    </node>
    <node concept="1TJgyi" id="2SI27LbRF5A" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615227750" />
      <property role="TrG5h" value="Location" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2SI27LbRKw0" role="1TKVEi">
      <property role="IQ2ns" value="3327606504615249920" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="NodeList" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2Sxx0SxVuDW" resolve="ServerNode" />
    </node>
    <node concept="1TJgyj" id="40voJhcYP7$" role="1TKVEi">
      <property role="IQ2ns" value="4620520544108499428" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Communications" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="40voJhcYP84" resolve="Communicates" />
    </node>
  </node>
  <node concept="25R3W" id="2SI27LbRF4y">
    <property role="3F6X1D" value="3327606504615227682" />
    <property role="TrG5h" value="EnvironmentType" />
    <property role="3GE5qa" value="Type System" />
    <ref role="1H5jkz" node="2SI27LbRF4K" resolve="Production" />
    <node concept="25R33" id="2SI27LbRF4z" role="25R1y">
      <property role="3tVfz5" value="3327606504615227683" />
      <property role="TrG5h" value="Development" />
    </node>
    <node concept="25R33" id="2SI27LbRF4$" role="25R1y">
      <property role="3tVfz5" value="3327606504615227684" />
      <property role="TrG5h" value="Test" />
    </node>
    <node concept="25R33" id="2SI27LbRF4B" role="25R1y">
      <property role="3tVfz5" value="3327606504615227687" />
      <property role="TrG5h" value="UAT" />
    </node>
    <node concept="25R33" id="2SI27LbRF4F" role="25R1y">
      <property role="3tVfz5" value="3327606504615227691" />
      <property role="TrG5h" value="Demo" />
    </node>
    <node concept="25R33" id="2SI27LbRF4K" role="25R1y">
      <property role="3tVfz5" value="3327606504615227696" />
      <property role="TrG5h" value="Production" />
    </node>
  </node>
  <node concept="25R3W" id="2SI27LbRF4W">
    <property role="3F6X1D" value="3327606504615227708" />
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="MicroserviceType" />
    <ref role="1H5jkz" node="2SI27LbRF4X" resolve="Internal" />
    <node concept="25R33" id="2SI27LbRF4X" role="25R1y">
      <property role="3tVfz5" value="3327606504615227709" />
      <property role="TrG5h" value="Internal" />
    </node>
    <node concept="25R33" id="2SI27LbRF4Y" role="25R1y">
      <property role="3tVfz5" value="3327606504615227710" />
      <property role="TrG5h" value="External" />
    </node>
  </node>
  <node concept="25R3W" id="2SI27LbRF51">
    <property role="3F6X1D" value="3327606504615227713" />
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="VMType" />
    <ref role="1H5jkz" node="2SI27LbRF52" resolve="Linux" />
    <node concept="25R33" id="2SI27LbRF52" role="25R1y">
      <property role="3tVfz5" value="3327606504615227714" />
      <property role="TrG5h" value="Linux" />
    </node>
    <node concept="25R33" id="2SI27LbRF53" role="25R1y">
      <property role="3tVfz5" value="3327606504615227715" />
      <property role="TrG5h" value="RedHat" />
    </node>
    <node concept="25R33" id="2SI27LbRF56" role="25R1y">
      <property role="3tVfz5" value="3327606504615227718" />
      <property role="TrG5h" value="Windows" />
    </node>
    <node concept="25R33" id="2SI27LbRF5a" role="25R1y">
      <property role="3tVfz5" value="3327606504615227722" />
      <property role="TrG5h" value="CentOS" />
    </node>
  </node>
  <node concept="25R3W" id="2SI27LbRF5t">
    <property role="3F6X1D" value="3327606504615227741" />
    <property role="3GE5qa" value="Type System" />
    <property role="TrG5h" value="MicroserviceCommunicationType" />
    <ref role="1H5jkz" node="2SI27LbRF5v" resolve="REST" />
    <node concept="25R33" id="2SI27LbRF5u" role="25R1y">
      <property role="3tVfz5" value="3327606504615227742" />
      <property role="TrG5h" value="RPC" />
    </node>
    <node concept="25R33" id="2SI27LbRF5v" role="25R1y">
      <property role="3tVfz5" value="3327606504615227743" />
      <property role="TrG5h" value="REST" />
    </node>
    <node concept="25R33" id="2SI27LbRF5y" role="25R1y">
      <property role="3tVfz5" value="3327606504615227746" />
      <property role="TrG5h" value="PubSub" />
    </node>
  </node>
  <node concept="Az7Fb" id="2SI27LbRF5F">
    <property role="3F6X1D" value="3327606504615227755" />
    <property role="3GE5qa" value="Custom Type" />
    <property role="TrG5h" value="IP" />
    <property role="FLfZY" value="\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b" />
  </node>
  <node concept="1TIwiD" id="2SI27LbRKwf">
    <property role="EcuMT" value="3327606504615249935" />
    <property role="TrG5h" value="CommunicationProtocol" />
    <property role="34LRSv" value="comm. protocol" />
    <property role="R4oN_" value="A meta class for communication between microservices" />
    <property role="3GE5qa" value="Other" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2SI27LbRKwn" role="1TKVEl">
      <property role="IQ2nx" value="3327606504615249943" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="2SI27LbRF5t" resolve="MicroserviceCommunicationType" />
    </node>
  </node>
  <node concept="1TIwiD" id="40voJhcYP84">
    <property role="EcuMT" value="4620520544108499460" />
    <property role="TrG5h" value="Communicates" />
    <property role="3GE5qa" value="Relations" />
    <property role="34LRSv" value="comm" />
    <ref role="1TJDcQ" node="2SI27LbRKwf" resolve="CommunicationProtocol" />
    <node concept="1TJgyj" id="40voJhcYP85" role="1TKVEi">
      <property role="IQ2ns" value="4620520544108499461" />
      <property role="20kJfa" value="microservice1" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2Sxx0SxVuE5" resolve="Microservice" />
    </node>
    <node concept="1TJgyj" id="40voJhcYP87" role="1TKVEi">
      <property role="IQ2ns" value="4620520544108499463" />
      <property role="20kJfa" value="microservice2" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2Sxx0SxVuE5" resolve="Microservice" />
    </node>
  </node>
</model>

