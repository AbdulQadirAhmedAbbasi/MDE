<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:87d3d1dc-7880-4e60-9a65-2207c5c0bd65(Microservices.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="u018" ref="r:48771403-405a-41ee-a755-08578f66c616(Microservices.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1214406454886" name="jetbrains.mps.lang.editor.structure.TextBackgroundColorStyleClassItem" flags="ln" index="30gYXW" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="2Sxx0SxVuEy">
    <property role="3GE5qa" value="Components" />
    <ref role="1XX52x" to="u018:2Sxx0SxVuDW" resolve="ServerNode" />
    <node concept="3EZMnI" id="2Sxx0SxVuEG" role="2wV5jI">
      <node concept="3F0ifn" id="2Sxx0SxVuEQ" role="3EZMnx">
        <property role="3F0ifm" value="node" />
      </node>
      <node concept="3F0A7n" id="2SI27LbVveV" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2SI27LbVveW" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVveX" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="2SI27LbVvf2" role="3EZMnx">
        <property role="3F0ifm" value="RAM =" />
      </node>
      <node concept="3F0ifn" id="2SI27LbVvf3" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvf4" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0A7n" id="2SI27LbVvf5" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5O" resolve="RAM" />
        <node concept="VechU" id="2SI27LbVvf6" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVvf7" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvf8" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVvhX" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="2SI27LbVviI" role="3EZMnx">
        <property role="3F0ifm" value="Processor =" />
      </node>
      <node concept="3F0ifn" id="2SI27LbVvjg" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvjh" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0A7n" id="2SI27LbVvji" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5Q" resolve="Processor" />
        <node concept="VechU" id="2SI27LbVvjj" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVvjk" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvjl" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVvk2" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="2SI27LbVvlM" role="3EZMnx">
        <property role="3F0ifm" value="Disk =" />
      </node>
      <node concept="3F0ifn" id="2SI27LbVvkM" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvkN" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0A7n" id="2SI27LbVvkO" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5T" resolve="Disk" />
        <node concept="VechU" id="2SI27LbVvkP" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVvkQ" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbVvkR" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVUH$" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="3F0ifn" id="2SI27LbVA1u" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="ljvvj" id="2SI27LbVA1v" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27LbZnw1" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc2oLS" role="3F10Kt">
          <property role="1413C4" value="bracket3" />
        </node>
      </node>
      <node concept="3EZMnI" id="2SI27LbVA1w" role="3EZMnx">
        <node concept="VPM3Z" id="2SI27LbVA1z" role="3F10Kt" />
        <node concept="3F0ifn" id="2SI27LbVA1$" role="3EZMnx">
          <property role="3F0ifm" value="install" />
          <node concept="VechU" id="2SI27LbVA1_" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbVA1A" role="3EZMnx">
          <property role="3F0ifm" value="VMs()" />
        </node>
        <node concept="3F0ifn" id="2SI27LbZMdk" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="2SI27LbZMdX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="3mYdg7" id="2SI27Lc2_y4" role="3F10Kt">
            <property role="1413C4" value="bracket4" />
          </node>
        </node>
        <node concept="3EZMnI" id="2SI27LbVA1C" role="3EZMnx">
          <node concept="VPM3Z" id="2SI27LbVA1D" role="3F10Kt" />
          <node concept="3F2HdR" id="2SI27LbVA1E" role="3EZMnx">
            <ref role="1NtTu8" to="u018:2SI27LbRKw2" resolve="VMList" />
            <node concept="l2Vlx" id="2SI27LbVA1F" role="2czzBx" />
            <node concept="pj6Ft" id="2SI27LbVA1G" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
          <node concept="l2Vlx" id="2SI27LbVA1H" role="2iSdaV" />
          <node concept="lj46D" id="2SI27LbVA1I" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbVA1L" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="3mYdg7" id="2SI27Lc2_y7" role="3F10Kt">
            <property role="1413C4" value="bracket4" />
          </node>
        </node>
        <node concept="l2Vlx" id="2SI27LbVA1M" role="2iSdaV" />
        <node concept="lj46D" id="2SI27LbVA1N" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="2SI27LbVA1O" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbVA1P" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="ljvvj" id="2SI27LbVA1Q" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27LbZnw8" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc2oM1" role="3F10Kt">
          <property role="1413C4" value="bracket3" />
        </node>
      </node>
      <node concept="l2Vlx" id="2Sxx0SxVuEJ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2Sxx0SxVuGx">
    <property role="3GE5qa" value="Components" />
    <ref role="1XX52x" to="u018:2Sxx0SxVuE5" resolve="Microservice" />
    <node concept="3EZMnI" id="2Sxx0SxVuGz" role="2wV5jI">
      <node concept="3F0ifn" id="2Sxx0SxVuGH" role="3EZMnx">
        <property role="3F0ifm" value="microservice" />
      </node>
      <node concept="3F0A7n" id="2Sxx0SxVuGN" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2SI27Lc0lTF" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc0uOW" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="2SI27Lc0uOX" role="3EZMnx">
        <property role="3F0ifm" value="type =" />
      </node>
      <node concept="3F0A7n" id="2SI27Lc0uOY" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5o" resolve="Type" />
        <node concept="VechU" id="2SI27Lc0uOZ" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc7phv" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="2SI27Lc7phw" role="3EZMnx">
        <property role="3F0ifm" value="health =" />
      </node>
      <node concept="3F0A7n" id="2SI27Lc7phz" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRKw8" resolve="Health" />
        <node concept="VechU" id="2SI27Lc7ph$" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc0uP0" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="l2Vlx" id="2Sxx0SxVuGA" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2Sxx0SxVuHh">
    <property role="3GE5qa" value="Components" />
    <ref role="1XX52x" to="u018:2Sxx0SxVuE2" resolve="VirtualMachine" />
    <node concept="3EZMnI" id="2Sxx0SxVuHj" role="2wV5jI">
      <node concept="3F0ifn" id="2Sxx0SxVuHt" role="3EZMnx">
        <property role="3F0ifm" value="vm" />
      </node>
      <node concept="3F0A7n" id="2Sxx0SxVuHz" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2SI27LbWFte" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbWMnP" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="2SI27LbWMnQ" role="3EZMnx">
        <property role="3F0ifm" value="type =" />
      </node>
      <node concept="3F0A7n" id="2SI27LbWMnR" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5M" resolve="Type" />
        <node concept="VechU" id="2SI27LbWMnS" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbWMo9" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="3F0ifn" id="2SI27LbWTSc" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="ljvvj" id="2SI27LbWTSd" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27LbZV8p" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc2Mix" role="3F10Kt">
          <property role="1413C4" value="bracket5" />
        </node>
      </node>
      <node concept="3EZMnI" id="2SI27LbWTSe" role="3EZMnx">
        <node concept="VPM3Z" id="2SI27LbWTSh" role="3F10Kt" />
        <node concept="3F0ifn" id="2SI27LbWTSi" role="3EZMnx">
          <property role="3F0ifm" value="host" />
          <node concept="VechU" id="2SI27LbWTSj" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbWTSk" role="3EZMnx">
          <property role="3F0ifm" value="Containers" />
        </node>
        <node concept="3F0ifn" id="2SI27Lc2Z3Z" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="3mYdg7" id="2SI27Lc2MiK" role="3F10Kt">
            <property role="1413C4" value="bracket6" />
          </node>
          <node concept="ljvvj" id="2SI27Lc3bQh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3EZMnI" id="2SI27LbWTSm" role="3EZMnx">
          <node concept="VPM3Z" id="2SI27LbWTSp" role="3F10Kt" />
          <node concept="3F2HdR" id="2SI27LbWTSq" role="3EZMnx">
            <ref role="1NtTu8" to="u018:2SI27LbRKw4" resolve="ContainterList" />
            <node concept="l2Vlx" id="2SI27LbWTSr" role="2czzBx" />
            <node concept="pj6Ft" id="2SI27LbWTSs" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
          <node concept="l2Vlx" id="2SI27LbWTSt" role="2iSdaV" />
          <node concept="lj46D" id="2SI27LbWTSu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbWTSx" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="3mYdg7" id="2SI27Lc2MiP" role="3F10Kt">
            <property role="1413C4" value="bracket6" />
          </node>
        </node>
        <node concept="l2Vlx" id="2SI27LbWTSy" role="2iSdaV" />
        <node concept="lj46D" id="2SI27LbWTSz" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="2SI27LbWTS$" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbWTS_" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="ljvvj" id="2SI27LbWTSA" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27LbZV8$" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc2MiD" role="3F10Kt">
          <property role="1413C4" value="bracket5" />
        </node>
      </node>
      <node concept="l2Vlx" id="2Sxx0SxVuHm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2SI27LbRF42">
    <property role="3GE5qa" value="Components" />
    <ref role="1XX52x" to="u018:2SI27LbRF3n" resolve="Container" />
    <node concept="3EZMnI" id="2SI27LbRF44" role="2wV5jI">
      <node concept="3F0ifn" id="2SI27LbRF4e" role="3EZMnx">
        <property role="3F0ifm" value="docker" />
      </node>
      <node concept="3F0A7n" id="2SI27LbRF4k" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2SI27LbX9kE" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbXh2Q" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="2SI27LbXh2R" role="3EZMnx">
        <property role="3F0ifm" value="IP =" />
      </node>
      <node concept="3F0A7n" id="2SI27LbXh2S" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5D" resolve="IP" />
        <node concept="VechU" id="2SI27LbXh2T" role="3F10Kt">
          <property role="Vb096" value="fLwANPt/cyan" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbXh2U" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="2SI27LbXh2V" role="3EZMnx">
        <property role="3F0ifm" value="port =" />
      </node>
      <node concept="3F0A7n" id="2SI27LbXh2Y" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5G" resolve="Port" />
        <node concept="VechU" id="2SI27LbXh2Z" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbXh32" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="3F0ifn" id="2SI27Lc0434" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="ljvvj" id="2SI27Lc043Q" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27Lc0cYj" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc3oBL" role="3F10Kt">
          <property role="1413C4" value="bracket7" />
        </node>
      </node>
      <node concept="3EZMnI" id="2SI27LbXqup" role="3EZMnx">
        <node concept="3F1sOY" id="2SI27LbXqv9" role="3EZMnx">
          <ref role="1NtTu8" to="u018:2SI27LbRKw6" resolve="Microservice" />
        </node>
        <node concept="VPM3Z" id="2SI27LbXqus" role="3F10Kt" />
        <node concept="l2Vlx" id="2SI27LbXquw" role="2iSdaV" />
        <node concept="lj46D" id="2SI27LbXqux" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbXquy" role="3EZMnx">
        <node concept="ljvvj" id="2SI27LbXquz" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbXqu$" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="30gYXW" id="2SI27Lc0cYn" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc3oBS" role="3F10Kt">
          <property role="1413C4" value="bracket7" />
        </node>
      </node>
      <node concept="l2Vlx" id="2SI27LbRF47" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2SI27LbRKxk">
    <property role="3GE5qa" value="Main" />
    <ref role="1XX52x" to="u018:2SI27LbRF4r" resolve="Environment" />
    <node concept="3EZMnI" id="2SI27LbRKxm" role="2wV5jI">
      <node concept="3F0ifn" id="2SI27LbTfEp" role="3EZMnx">
        <property role="3F0ifm" value="set" />
        <node concept="VechU" id="2SI27LbTfEN" role="3F10Kt">
          <property role="Vb096" value="g1_qRwE/darkGreen" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbRKx$" role="3EZMnx">
        <property role="3F0ifm" value="environment" />
      </node>
      <node concept="3F0A7n" id="2SI27LbRKxE" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2SI27LbSRlo" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbRKxM" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0ifn" id="2SI27LbSs42" role="3EZMnx">
        <property role="3F0ifm" value="type =" />
      </node>
      <node concept="3F0A7n" id="2SI27LbSs4e" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF4Q" resolve="Type" />
        <node concept="VechU" id="2SI27LbSRlr" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbSs4s" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="3F0ifn" id="2SI27LbSs4G" role="3EZMnx">
        <property role="3F0ifm" value="location =" />
      </node>
      <node concept="3F0ifn" id="2SI27LbTyks" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbTylK" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0A7n" id="2SI27LbSs58" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRF5A" resolve="Location" />
        <node concept="VechU" id="2SI27LbSRlt" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbTylg" role="3EZMnx">
        <property role="3F0ifm" value="'" />
        <node concept="VechU" id="2SI27LbTylH" role="3F10Kt">
          <property role="Vb096" value="g1_eI4o/darkBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbTUfO" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="3F0ifn" id="2SI27LbYF1Q" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="ljvvj" id="2SI27LbYF2U" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27Lc0Cmi" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc1Mz2" role="3F10Kt">
          <property role="1413C4" value="bracket0" />
        </node>
      </node>
      <node concept="3EZMnI" id="2SI27LbTB2W" role="3EZMnx">
        <node concept="VPM3Z" id="2SI27LbTB2Y" role="3F10Kt" />
        <node concept="3F0ifn" id="2SI27LbU_hJ" role="3EZMnx">
          <property role="3F0ifm" value="allocate" />
          <node concept="VechU" id="2SI27LbU_hT" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbUSyk" role="3EZMnx">
          <property role="3F0ifm" value="serverNodes()" />
        </node>
        <node concept="3F0ifn" id="2SI27LbW8xY" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="2SI27LbW8yH" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="3mYdg7" id="2SI27Lc2c1Y" role="3F10Kt">
            <property role="1413C4" value="bracket1" />
          </node>
        </node>
        <node concept="3EZMnI" id="2SI27LbVbQ8" role="3EZMnx">
          <node concept="VPM3Z" id="2SI27LbVbQa" role="3F10Kt" />
          <node concept="3F2HdR" id="2SI27LbVbQK" role="3EZMnx">
            <ref role="1NtTu8" to="u018:2SI27LbRKw0" resolve="NodeList" />
            <node concept="l2Vlx" id="2SI27LbVbQM" role="2czzBx" />
            <node concept="pj6Ft" id="2SI27LbVbRf" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
          <node concept="l2Vlx" id="2SI27LbVbQd" role="2iSdaV" />
          <node concept="lj46D" id="2SI27LbVqoC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2SI27LbV2ba" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="3mYdg7" id="2SI27Lc2c22" role="3F10Kt">
            <property role="1413C4" value="bracket1" />
          </node>
        </node>
        <node concept="l2Vlx" id="2SI27LbTB31" role="2iSdaV" />
        <node concept="lj46D" id="2SI27LbTFQs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="2SI27LbUdko" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27LbT1GI" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="ljvvj" id="2SI27LbU8z8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="30gYXW" id="2SI27Lc0Cmp" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
        <node concept="3mYdg7" id="2SI27Lc1Ziu" role="3F10Kt">
          <property role="1413C4" value="bracket0" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc3_ZF" role="3EZMnx">
        <property role="3F0ifm" value="set" />
        <node concept="VechU" id="2SI27Lc3N0z" role="3F10Kt">
          <property role="Vb096" value="g1_qRwE/darkGreen" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc4dfC" role="3EZMnx">
        <property role="3F0ifm" value="communications" />
      </node>
      <node concept="3F0ifn" id="2SI27Lc4Bwu" role="3EZMnx">
        <property role="3F0ifm" value="()" />
      </node>
      <node concept="3F0ifn" id="2SI27Lc4Bya" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2SI27Lc5rmH" role="3F10Kt">
          <property role="1413C4" value="bracket8" />
        </node>
        <node concept="ljvvj" id="41kL1ysGyQo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="41kL1ysGKlm" role="3EZMnx">
        <node concept="VPM3Z" id="41kL1ysGKln" role="3F10Kt" />
        <node concept="3F2HdR" id="41kL1ysGKlo" role="3EZMnx">
          <ref role="1NtTu8" to="u018:40voJhcYP7$" resolve="Communications" />
          <node concept="l2Vlx" id="41kL1ysGKlp" role="2czzBx" />
          <node concept="pj6Ft" id="41kL1ysGKlq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="l2Vlx" id="41kL1ysGKlr" role="2iSdaV" />
        <node concept="lj46D" id="41kL1ysGKls" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="2SI27Lc4B$l" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2SI27Lc5rmL" role="3F10Kt">
          <property role="1413C4" value="bracket8" />
        </node>
      </node>
      <node concept="l2Vlx" id="2SI27LbRKxp" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="40voJhcYPk$">
    <property role="3GE5qa" value="Relations" />
    <ref role="1XX52x" to="u018:40voJhcYP84" resolve="Communicates" />
    <node concept="3EZMnI" id="40voJhcYPkE" role="2wV5jI">
      <node concept="3F0ifn" id="40voJhcYPkL" role="3EZMnx">
        <property role="3F0ifm" value="communicates" />
      </node>
      <node concept="3F0A7n" id="40voJhcYPkV" role="3EZMnx">
        <ref role="1NtTu8" to="u018:2SI27LbRKwn" resolve="Type" />
        <node concept="VechU" id="41kL1ysHbkX" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="40voJhcYPlt" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="1iCGBv" id="40voJhcYPl8" role="3EZMnx">
        <ref role="1NtTu8" to="u018:40voJhcYP85" resolve="microservice1" />
        <node concept="1sVBvm" id="40voJhcYPla" role="1sWHZn">
          <node concept="3F0A7n" id="40voJhcYPlj" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="VechU" id="41kL1ysHbkZ" role="3F10Kt">
              <property role="Vb096" value="fLwANPp/orange" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="40voJhcYPlH" role="3EZMnx">
        <property role="3F0ifm" value="," />
      </node>
      <node concept="1iCGBv" id="40voJhcYPm9" role="3EZMnx">
        <ref role="1NtTu8" to="u018:40voJhcYP87" resolve="microservice2" />
        <node concept="1sVBvm" id="40voJhcYPmb" role="1sWHZn">
          <node concept="3F0A7n" id="40voJhcYPmp" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="VechU" id="41kL1ysHbl1" role="3F10Kt">
              <property role="Vb096" value="fLwANPp/orange" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="40voJhcYPnk" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="l2Vlx" id="40voJhcYPkH" role="2iSdaV" />
    </node>
  </node>
</model>

