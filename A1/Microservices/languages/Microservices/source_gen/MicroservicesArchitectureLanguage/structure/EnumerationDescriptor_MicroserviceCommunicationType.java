package MicroservicesArchitectureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_MicroserviceCommunicationType extends EnumerationDescriptorBase {

  public EnumerationDescriptor_MicroserviceCommunicationType() {
    super(0x3d827bac02154a87L, 0x8b1c1ab047e79a3bL, 0x2e2e087c4bdeb15dL, "MicroserviceCommunicationType", "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227741");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_RPC_0 = new EnumerationDescriptor.MemberDescriptor("RPC", "RPC", 0x2e2e087c4bdeb15eL, "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227742");
  private final EnumerationDescriptor.MemberDescriptor myMember_REST_0 = new EnumerationDescriptor.MemberDescriptor("REST", "REST", 0x2e2e087c4bdeb15fL, "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227743");
  private final EnumerationDescriptor.MemberDescriptor myMember_PubSub_0 = new EnumerationDescriptor.MemberDescriptor("PubSub", "PubSub", 0x2e2e087c4bdeb162L, "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227746");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3d827bac02154a87L, 0x8b1c1ab047e79a3bL, 0x2e2e087c4bdeb15dL, 0x2e2e087c4bdeb15eL, 0x2e2e087c4bdeb15fL, 0x2e2e087c4bdeb162L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_RPC_0, myMember_REST_0, myMember_PubSub_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_REST_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "RPC":
        return myMember_RPC_0;
      case "REST":
        return myMember_REST_0;
      case "PubSub":
        return myMember_PubSub_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
