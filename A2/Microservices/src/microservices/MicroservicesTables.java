/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Microservices/model/microservices.ecore
 * using:
 *   /Microservices/model/microservices.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package microservices;

import java.lang.String;
// import microservices.MicroservicesPackage;
// import microservices.MicroservicesTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MicroservicesTables provides the dispatch tables for the microservices for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MicroservicesTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MicroservicesPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_microservices = IdManager.getNsURIPackageId("http://www.example.org/microservices", null, MicroservicesPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Container = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getClassId("Container", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Environment = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getClassId("Environment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Microservice = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getClassId("Microservice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServerNode = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getClassId("ServerNode", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VirtualMachine = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getClassId("VirtualMachine", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = MicroservicesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EnvironmentType = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getEnumerationId("EnvironmentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MicroserviceType = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getEnumerationId("MicroserviceType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VMType = MicroservicesTables.PACKid_http_c_s_s_www_example_org_s_microservices.getEnumerationId("VMType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1024 = ValueUtil.integerValueOf("1024");
	public static final /*@NonInvalid*/ String STR__92_b_o_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_01_93_63_91_0_m_9_93_91_0_m_9_93_63_e_o_92__124_$_e_e_123_4_125_92_b = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b";
	public static final /*@NonInvalid*/ String STR__c = ":";
	public static final /*@NonInvalid*/ String STR_http_c_s_s = "http://";
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Container = TypeId.ORDERED_SET.getSpecializedId(MicroservicesTables.CLSSid_Container);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ServerNode = TypeId.ORDERED_SET.getSpecializedId(MicroservicesTables.CLSSid_ServerNode);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VirtualMachine = TypeId.ORDERED_SET.getSpecializedId(MicroservicesTables.CLSSid_VirtualMachine);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Microservice = TypeId.SEQUENCE.getSpecializedId(MicroservicesTables.CLSSid_Microservice);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MicroservicesTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Container = new EcoreExecutorType(MicroservicesPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final EcoreExecutorType _Environment = new EcoreExecutorType(MicroservicesPackage.Literals.ENVIRONMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EnvironmentType = new EcoreExecutorEnumeration(MicroservicesPackage.Literals.ENVIRONMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Microservice = new EcoreExecutorType(MicroservicesPackage.Literals.MICROSERVICE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MicroserviceType = new EcoreExecutorEnumeration(MicroservicesPackage.Literals.MICROSERVICE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Named = new EcoreExecutorType(MicroservicesPackage.Literals.NAMED, PACKAGE, 0);
		public static final EcoreExecutorType _ServerNode = new EcoreExecutorType(MicroservicesPackage.Literals.SERVER_NODE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _VMType = new EcoreExecutorEnumeration(MicroservicesPackage.Literals.VM_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _VirtualMachine = new EcoreExecutorType(MicroservicesPackage.Literals.VIRTUAL_MACHINE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Container,
			_Environment,
			_EnvironmentType,
			_Microservice,
			_MicroserviceType,
			_Named,
			_ServerNode,
			_VMType,
			_VirtualMachine
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, MicroservicesTables.Types._Container);
		private static final ExecutorFragment _Container__Named = new ExecutorFragment(Types._Container, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Environment__Environment = new ExecutorFragment(Types._Environment, MicroservicesTables.Types._Environment);
		private static final ExecutorFragment _Environment__Named = new ExecutorFragment(Types._Environment, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _Environment__OclAny = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Environment__OclElement = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnvironmentType__EnvironmentType = new ExecutorFragment(Types._EnvironmentType, MicroservicesTables.Types._EnvironmentType);
		private static final ExecutorFragment _EnvironmentType__OclAny = new ExecutorFragment(Types._EnvironmentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnvironmentType__OclElement = new ExecutorFragment(Types._EnvironmentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EnvironmentType__OclEnumeration = new ExecutorFragment(Types._EnvironmentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EnvironmentType__OclType = new ExecutorFragment(Types._EnvironmentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Microservice__Microservice = new ExecutorFragment(Types._Microservice, MicroservicesTables.Types._Microservice);
		private static final ExecutorFragment _Microservice__Named = new ExecutorFragment(Types._Microservice, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _Microservice__OclAny = new ExecutorFragment(Types._Microservice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Microservice__OclElement = new ExecutorFragment(Types._Microservice, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MicroserviceType__MicroserviceType = new ExecutorFragment(Types._MicroserviceType, MicroservicesTables.Types._MicroserviceType);
		private static final ExecutorFragment _MicroserviceType__OclAny = new ExecutorFragment(Types._MicroserviceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MicroserviceType__OclElement = new ExecutorFragment(Types._MicroserviceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MicroserviceType__OclEnumeration = new ExecutorFragment(Types._MicroserviceType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MicroserviceType__OclType = new ExecutorFragment(Types._MicroserviceType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Named__Named = new ExecutorFragment(Types._Named, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _Named__OclAny = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Named__OclElement = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ServerNode__Named = new ExecutorFragment(Types._ServerNode, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _ServerNode__OclAny = new ExecutorFragment(Types._ServerNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServerNode__OclElement = new ExecutorFragment(Types._ServerNode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServerNode__ServerNode = new ExecutorFragment(Types._ServerNode, MicroservicesTables.Types._ServerNode);

		private static final ExecutorFragment _VMType__OclAny = new ExecutorFragment(Types._VMType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VMType__OclElement = new ExecutorFragment(Types._VMType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VMType__OclEnumeration = new ExecutorFragment(Types._VMType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VMType__OclType = new ExecutorFragment(Types._VMType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VMType__VMType = new ExecutorFragment(Types._VMType, MicroservicesTables.Types._VMType);

		private static final ExecutorFragment _VirtualMachine__Named = new ExecutorFragment(Types._VirtualMachine, MicroservicesTables.Types._Named);
		private static final ExecutorFragment _VirtualMachine__OclAny = new ExecutorFragment(Types._VirtualMachine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VirtualMachine__OclElement = new ExecutorFragment(Types._VirtualMachine, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VirtualMachine__VirtualMachine = new ExecutorFragment(Types._VirtualMachine, MicroservicesTables.Types._VirtualMachine);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Container__isMicroserviceLive = new ExecutorOperation("isMicroserviceLive", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Container,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _VirtualMachine__isNotEmpty = new ExecutorOperation("isNotEmpty", TypeUtil.EMPTY_PARAMETER_TYPES, Types._VirtualMachine,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Container__BaseURI = new EcoreExecutorProperty(MicroservicesPackage.Literals.CONTAINER__BASE_URI, Types._Container, 0);
		public static final ExecutorProperty _Container__IP = new EcoreExecutorProperty(MicroservicesPackage.Literals.CONTAINER__IP, Types._Container, 1);
		public static final ExecutorProperty _Container__Microservice = new EcoreExecutorProperty(MicroservicesPackage.Literals.CONTAINER__MICROSERVICE, Types._Container, 2);
		public static final ExecutorProperty _Container__Port = new EcoreExecutorProperty(MicroservicesPackage.Literals.CONTAINER__PORT, Types._Container, 3);
		public static final ExecutorProperty _Container__VirtualMachine__Containers = new ExecutorPropertyWithImplementation("VirtualMachine", Types._Container, 4, new EcoreLibraryOppositeProperty(MicroservicesPackage.Literals.VIRTUAL_MACHINE__CONTAINERS));

		public static final ExecutorProperty _Environment__Location = new EcoreExecutorProperty(MicroservicesPackage.Literals.ENVIRONMENT__LOCATION, Types._Environment, 0);
		public static final ExecutorProperty _Environment__ServerNodes = new EcoreExecutorProperty(MicroservicesPackage.Literals.ENVIRONMENT__SERVER_NODES, Types._Environment, 1);
		public static final ExecutorProperty _Environment__Type = new EcoreExecutorProperty(MicroservicesPackage.Literals.ENVIRONMENT__TYPE, Types._Environment, 2);

		public static final ExecutorProperty _Microservice__Health = new EcoreExecutorProperty(MicroservicesPackage.Literals.MICROSERVICE__HEALTH, Types._Microservice, 0);
		public static final ExecutorProperty _Microservice__Type = new EcoreExecutorProperty(MicroservicesPackage.Literals.MICROSERVICE__TYPE, Types._Microservice, 1);
		public static final ExecutorProperty _Microservice__Container__Microservice = new ExecutorPropertyWithImplementation("Container", Types._Microservice, 2, new EcoreLibraryOppositeProperty(MicroservicesPackage.Literals.CONTAINER__MICROSERVICE));

		public static final ExecutorProperty _Named__name = new EcoreExecutorProperty(MicroservicesPackage.Literals.NAMED__NAME, Types._Named, 0);

		public static final ExecutorProperty _ServerNode__Disk = new EcoreExecutorProperty(MicroservicesPackage.Literals.SERVER_NODE__DISK, Types._ServerNode, 0);
		public static final ExecutorProperty _ServerNode__Processor = new EcoreExecutorProperty(MicroservicesPackage.Literals.SERVER_NODE__PROCESSOR, Types._ServerNode, 1);
		public static final ExecutorProperty _ServerNode__RAM = new EcoreExecutorProperty(MicroservicesPackage.Literals.SERVER_NODE__RAM, Types._ServerNode, 2);
		public static final ExecutorProperty _ServerNode__VirtualMachines = new EcoreExecutorProperty(MicroservicesPackage.Literals.SERVER_NODE__VIRTUAL_MACHINES, Types._ServerNode, 3);
		public static final ExecutorProperty _ServerNode__Environment__ServerNodes = new ExecutorPropertyWithImplementation("Environment", Types._ServerNode, 4, new EcoreLibraryOppositeProperty(MicroservicesPackage.Literals.ENVIRONMENT__SERVER_NODES));

		public static final ExecutorProperty _VirtualMachine__Containers = new EcoreExecutorProperty(MicroservicesPackage.Literals.VIRTUAL_MACHINE__CONTAINERS, Types._VirtualMachine, 0);
		public static final ExecutorProperty _VirtualMachine__TotalMicroservices = new EcoreExecutorProperty(MicroservicesPackage.Literals.VIRTUAL_MACHINE__TOTAL_MICROSERVICES, Types._VirtualMachine, 1);
		public static final ExecutorProperty _VirtualMachine__Type = new EcoreExecutorProperty(MicroservicesPackage.Literals.VIRTUAL_MACHINE__TYPE, Types._VirtualMachine, 2);
		public static final ExecutorProperty _VirtualMachine__ServerNode__VirtualMachines = new ExecutorPropertyWithImplementation("ServerNode", Types._VirtualMachine, 3, new EcoreLibraryOppositeProperty(MicroservicesPackage.Literals.SERVER_NODE__VIRTUAL_MACHINES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Container =
			{
				Fragments._Container__OclAny /* 0 */,
				Fragments._Container__OclElement /* 1 */,
				Fragments._Container__Named /* 2 */,
				Fragments._Container__Container /* 3 */
			};
		private static final int /*@NonNull*/ [] __Container = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Environment =
			{
				Fragments._Environment__OclAny /* 0 */,
				Fragments._Environment__OclElement /* 1 */,
				Fragments._Environment__Named /* 2 */,
				Fragments._Environment__Environment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Environment = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnvironmentType =
			{
				Fragments._EnvironmentType__OclAny /* 0 */,
				Fragments._EnvironmentType__OclElement /* 1 */,
				Fragments._EnvironmentType__OclType /* 2 */,
				Fragments._EnvironmentType__OclEnumeration /* 3 */,
				Fragments._EnvironmentType__EnvironmentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnvironmentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Microservice =
			{
				Fragments._Microservice__OclAny /* 0 */,
				Fragments._Microservice__OclElement /* 1 */,
				Fragments._Microservice__Named /* 2 */,
				Fragments._Microservice__Microservice /* 3 */
			};
		private static final int /*@NonNull*/ [] __Microservice = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MicroserviceType =
			{
				Fragments._MicroserviceType__OclAny /* 0 */,
				Fragments._MicroserviceType__OclElement /* 1 */,
				Fragments._MicroserviceType__OclType /* 2 */,
				Fragments._MicroserviceType__OclEnumeration /* 3 */,
				Fragments._MicroserviceType__MicroserviceType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MicroserviceType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Named =
			{
				Fragments._Named__OclAny /* 0 */,
				Fragments._Named__OclElement /* 1 */,
				Fragments._Named__Named /* 2 */
			};
		private static final int /*@NonNull*/ [] __Named = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServerNode =
			{
				Fragments._ServerNode__OclAny /* 0 */,
				Fragments._ServerNode__OclElement /* 1 */,
				Fragments._ServerNode__Named /* 2 */,
				Fragments._ServerNode__ServerNode /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServerNode = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VMType =
			{
				Fragments._VMType__OclAny /* 0 */,
				Fragments._VMType__OclElement /* 1 */,
				Fragments._VMType__OclType /* 2 */,
				Fragments._VMType__OclEnumeration /* 3 */,
				Fragments._VMType__VMType /* 4 */
			};
		private static final int /*@NonNull*/ [] __VMType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VirtualMachine =
			{
				Fragments._VirtualMachine__OclAny /* 0 */,
				Fragments._VirtualMachine__OclElement /* 1 */,
				Fragments._VirtualMachine__Named /* 2 */,
				Fragments._VirtualMachine__VirtualMachine /* 3 */
			};
		private static final int /*@NonNull*/ [] __VirtualMachine = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Container.initFragments(_Container, __Container);
			Types._Environment.initFragments(_Environment, __Environment);
			Types._EnvironmentType.initFragments(_EnvironmentType, __EnvironmentType);
			Types._Microservice.initFragments(_Microservice, __Microservice);
			Types._MicroserviceType.initFragments(_MicroserviceType, __MicroserviceType);
			Types._Named.initFragments(_Named, __Named);
			Types._ServerNode.initFragments(_ServerNode, __ServerNode);
			Types._VMType.initFragments(_VMType, __VMType);
			Types._VirtualMachine.initFragments(_VirtualMachine, __VirtualMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Container__Container = {
			MicroservicesTables.Operations._Container__isMicroserviceLive /* isMicroserviceLive() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Environment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentType__EnvironmentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Microservice__Microservice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Microservice__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Microservice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Microservice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MicroserviceType__MicroserviceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MicroserviceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MicroserviceType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MicroserviceType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MicroserviceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Named__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServerNode__ServerNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServerNode__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServerNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServerNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VMType__VMType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VMType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VMType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VMType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VMType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VirtualMachine__VirtualMachine = {
			MicroservicesTables.Operations._VirtualMachine__isNotEmpty /* isNotEmpty() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualMachine__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualMachine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualMachine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__Named.initOperations(_Container__Named);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);

			Fragments._Environment__Environment.initOperations(_Environment__Environment);
			Fragments._Environment__Named.initOperations(_Environment__Named);
			Fragments._Environment__OclAny.initOperations(_Environment__OclAny);
			Fragments._Environment__OclElement.initOperations(_Environment__OclElement);

			Fragments._EnvironmentType__EnvironmentType.initOperations(_EnvironmentType__EnvironmentType);
			Fragments._EnvironmentType__OclAny.initOperations(_EnvironmentType__OclAny);
			Fragments._EnvironmentType__OclElement.initOperations(_EnvironmentType__OclElement);
			Fragments._EnvironmentType__OclEnumeration.initOperations(_EnvironmentType__OclEnumeration);
			Fragments._EnvironmentType__OclType.initOperations(_EnvironmentType__OclType);

			Fragments._Microservice__Microservice.initOperations(_Microservice__Microservice);
			Fragments._Microservice__Named.initOperations(_Microservice__Named);
			Fragments._Microservice__OclAny.initOperations(_Microservice__OclAny);
			Fragments._Microservice__OclElement.initOperations(_Microservice__OclElement);

			Fragments._MicroserviceType__MicroserviceType.initOperations(_MicroserviceType__MicroserviceType);
			Fragments._MicroserviceType__OclAny.initOperations(_MicroserviceType__OclAny);
			Fragments._MicroserviceType__OclElement.initOperations(_MicroserviceType__OclElement);
			Fragments._MicroserviceType__OclEnumeration.initOperations(_MicroserviceType__OclEnumeration);
			Fragments._MicroserviceType__OclType.initOperations(_MicroserviceType__OclType);

			Fragments._Named__Named.initOperations(_Named__Named);
			Fragments._Named__OclAny.initOperations(_Named__OclAny);
			Fragments._Named__OclElement.initOperations(_Named__OclElement);

			Fragments._ServerNode__Named.initOperations(_ServerNode__Named);
			Fragments._ServerNode__OclAny.initOperations(_ServerNode__OclAny);
			Fragments._ServerNode__OclElement.initOperations(_ServerNode__OclElement);
			Fragments._ServerNode__ServerNode.initOperations(_ServerNode__ServerNode);

			Fragments._VMType__OclAny.initOperations(_VMType__OclAny);
			Fragments._VMType__OclElement.initOperations(_VMType__OclElement);
			Fragments._VMType__OclEnumeration.initOperations(_VMType__OclEnumeration);
			Fragments._VMType__OclType.initOperations(_VMType__OclType);
			Fragments._VMType__VMType.initOperations(_VMType__VMType);

			Fragments._VirtualMachine__Named.initOperations(_VirtualMachine__Named);
			Fragments._VirtualMachine__OclAny.initOperations(_VirtualMachine__OclAny);
			Fragments._VirtualMachine__OclElement.initOperations(_VirtualMachine__OclElement);
			Fragments._VirtualMachine__VirtualMachine.initOperations(_VirtualMachine__VirtualMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Container = {
			MicroservicesTables.Properties._Container__BaseURI,
			MicroservicesTables.Properties._Container__IP,
			MicroservicesTables.Properties._Container__Microservice,
			MicroservicesTables.Properties._Container__Port,
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Environment = {
			MicroservicesTables.Properties._Environment__Location,
			MicroservicesTables.Properties._Environment__ServerNodes,
			MicroservicesTables.Properties._Environment__Type,
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnvironmentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Microservice = {
			MicroservicesTables.Properties._Microservice__Health,
			MicroservicesTables.Properties._Microservice__Type,
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MicroserviceType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Named = {
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServerNode = {
			MicroservicesTables.Properties._ServerNode__Disk,
			MicroservicesTables.Properties._ServerNode__Processor,
			MicroservicesTables.Properties._ServerNode__RAM,
			MicroservicesTables.Properties._ServerNode__VirtualMachines,
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VMType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VirtualMachine = {
			MicroservicesTables.Properties._VirtualMachine__Containers,
			MicroservicesTables.Properties._VirtualMachine__TotalMicroservices,
			MicroservicesTables.Properties._VirtualMachine__Type,
			MicroservicesTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Container__Container.initProperties(_Container);
			Fragments._Environment__Environment.initProperties(_Environment);
			Fragments._EnvironmentType__EnvironmentType.initProperties(_EnvironmentType);
			Fragments._Microservice__Microservice.initProperties(_Microservice);
			Fragments._MicroserviceType__MicroserviceType.initProperties(_MicroserviceType);
			Fragments._Named__Named.initProperties(_Named);
			Fragments._ServerNode__ServerNode.initProperties(_ServerNode);
			Fragments._VMType__VMType.initProperties(_VMType);
			Fragments._VirtualMachine__VirtualMachine.initProperties(_VirtualMachine);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _EnvironmentType__Development = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.ENVIRONMENT_TYPE.getEEnumLiteral("Development"), Types._EnvironmentType, 0);
		public static final EcoreExecutorEnumerationLiteral _EnvironmentType__Test = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.ENVIRONMENT_TYPE.getEEnumLiteral("Test"), Types._EnvironmentType, 1);
		public static final EcoreExecutorEnumerationLiteral _EnvironmentType__UAT = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.ENVIRONMENT_TYPE.getEEnumLiteral("UAT"), Types._EnvironmentType, 2);
		public static final EcoreExecutorEnumerationLiteral _EnvironmentType__Demo = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.ENVIRONMENT_TYPE.getEEnumLiteral("Demo"), Types._EnvironmentType, 3);
		public static final EcoreExecutorEnumerationLiteral _EnvironmentType__Production = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.ENVIRONMENT_TYPE.getEEnumLiteral("Production"), Types._EnvironmentType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EnvironmentType = {
			_EnvironmentType__Development,
			_EnvironmentType__Test,
			_EnvironmentType__UAT,
			_EnvironmentType__Demo,
			_EnvironmentType__Production
		};

		public static final EcoreExecutorEnumerationLiteral _MicroserviceType__Internal = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.MICROSERVICE_TYPE.getEEnumLiteral("Internal"), Types._MicroserviceType, 0);
		public static final EcoreExecutorEnumerationLiteral _MicroserviceType__External = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.MICROSERVICE_TYPE.getEEnumLiteral("External"), Types._MicroserviceType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MicroserviceType = {
			_MicroserviceType__Internal,
			_MicroserviceType__External
		};

		public static final EcoreExecutorEnumerationLiteral _VMType__Linux = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.VM_TYPE.getEEnumLiteral("Linux"), Types._VMType, 0);
		public static final EcoreExecutorEnumerationLiteral _VMType__RedHat = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.VM_TYPE.getEEnumLiteral("RedHat"), Types._VMType, 1);
		public static final EcoreExecutorEnumerationLiteral _VMType__Windows = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.VM_TYPE.getEEnumLiteral("Windows"), Types._VMType, 2);
		public static final EcoreExecutorEnumerationLiteral _VMType__CentOS = new EcoreExecutorEnumerationLiteral(MicroservicesPackage.Literals.VM_TYPE.getEEnumLiteral("CentOS"), Types._VMType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VMType = {
			_VMType__Linux,
			_VMType__RedHat,
			_VMType__Windows,
			_VMType__CentOS
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._EnvironmentType.initLiterals(_EnvironmentType);
			Types._MicroserviceType.initLiterals(_MicroserviceType);
			Types._VMType.initLiterals(_VMType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MicroservicesTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MicroservicesTables();
	}

	private MicroservicesTables() {
		super(MicroservicesPackage.eNS_URI);
	}
}
