package Microservices.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Communicates = 0;
  public static final int CommunicationProtocol = 1;
  public static final int Container = 2;
  public static final int Environment = 3;
  public static final int Microservice = 4;
  public static final int ServerNode = 5;
  public static final int VirtualMachine = 6;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x3d827bac02154a87L, 0x8b1c1ab047e79a3bL);
    builder.put(0x401f62f44cfb5204L, Communicates);
    builder.put(0x2e2e087c4bdf080fL, CommunicationProtocol);
    builder.put(0x2e2e087c4bdeb0d7L, Container);
    builder.put(0x2e2e087c4bdeb11bL, Environment);
    builder.put(0x2e21840e21edea85L, Microservice);
    builder.put(0x2e21840e21edea7cL, ServerNode);
    builder.put(0x2e21840e21edea82L, VirtualMachine);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
