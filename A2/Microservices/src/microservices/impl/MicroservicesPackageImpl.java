/**
 */
package microservices.impl;

import microservices.Environment;
import microservices.EnvironmentType;
import microservices.Microservice;
import microservices.MicroserviceType;
import microservices.MicroservicesFactory;
import microservices.MicroservicesPackage;
import microservices.Named;
import microservices.ServerNode;
import microservices.VMType;
import microservices.VirtualMachine;

import microservices.util.MicroservicesValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroservicesPackageImpl extends EPackageImpl implements MicroservicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum environmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum microserviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see microservices.MicroservicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicroservicesPackageImpl() {
		super(eNS_URI, MicroservicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MicroservicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicroservicesPackage init() {
		if (isInited) return (MicroservicesPackage)EPackage.Registry.INSTANCE.getEPackage(MicroservicesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMicroservicesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MicroservicesPackageImpl theMicroservicesPackage = registeredMicroservicesPackage instanceof MicroservicesPackageImpl ? (MicroservicesPackageImpl)registeredMicroservicesPackage : new MicroservicesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMicroservicesPackage.createPackageContents();

		// Initialize created meta-data
		theMicroservicesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMicroservicesPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MicroservicesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMicroservicesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicroservicesPackage.eNS_URI, theMicroservicesPackage);
		return theMicroservicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Location() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Type() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_ServerNodes() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironment__DifferentServerNames__DiagnosticChain_Map() {
		return environmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerNode() {
		return serverNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerNode_RAM() {
		return (EAttribute)serverNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerNode_Processor() {
		return (EAttribute)serverNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerNode_Disk() {
		return (EAttribute)serverNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerNode_VirtualMachines() {
		return (EReference)serverNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Type() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachine_Containers() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_TotalMicroservices() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualMachine__IsNotEmpty() {
		return virtualMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_IP() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Port() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Microservice() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_BaseURI() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__IsMicroserviceLive() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__ValidPortAssigned__DiagnosticChain_Map() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__ValidIPAddress__DiagnosticChain_Map() {
		return containerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Health() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Type() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnvironmentType() {
		return environmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMicroserviceType() {
		return microserviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVMType() {
		return vmTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesFactory getMicroservicesFactory() {
		return (MicroservicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__LOCATION);
		createEAttribute(environmentEClass, ENVIRONMENT__TYPE);
		createEReference(environmentEClass, ENVIRONMENT__SERVER_NODES);
		createEOperation(environmentEClass, ENVIRONMENT___DIFFERENT_SERVER_NAMES__DIAGNOSTICCHAIN_MAP);

		serverNodeEClass = createEClass(SERVER_NODE);
		createEAttribute(serverNodeEClass, SERVER_NODE__RAM);
		createEAttribute(serverNodeEClass, SERVER_NODE__PROCESSOR);
		createEAttribute(serverNodeEClass, SERVER_NODE__DISK);
		createEReference(serverNodeEClass, SERVER_NODE__VIRTUAL_MACHINES);

		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__TYPE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__CONTAINERS);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__TOTAL_MICROSERVICES);
		createEOperation(virtualMachineEClass, VIRTUAL_MACHINE___IS_NOT_EMPTY);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__IP);
		createEAttribute(containerEClass, CONTAINER__PORT);
		createEReference(containerEClass, CONTAINER__MICROSERVICE);
		createEAttribute(containerEClass, CONTAINER__BASE_URI);
		createEOperation(containerEClass, CONTAINER___IS_MICROSERVICE_LIVE);
		createEOperation(containerEClass, CONTAINER___VALID_PORT_ASSIGNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(containerEClass, CONTAINER___VALID_IP_ADDRESS__DIAGNOSTICCHAIN_MAP);

		microserviceEClass = createEClass(MICROSERVICE);
		createEAttribute(microserviceEClass, MICROSERVICE__HEALTH);
		createEAttribute(microserviceEClass, MICROSERVICE__TYPE);

		// Create enums
		environmentTypeEEnum = createEEnum(ENVIRONMENT_TYPE);
		microserviceTypeEEnum = createEEnum(MICROSERVICE_TYPE);
		vmTypeEEnum = createEEnum(VM_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		environmentEClass.getESuperTypes().add(this.getNamed());
		serverNodeEClass.getESuperTypes().add(this.getNamed());
		virtualMachineEClass.getESuperTypes().add(this.getNamed());
		containerEClass.getESuperTypes().add(this.getNamed());
		microserviceEClass.getESuperTypes().add(this.getNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Location(), ecorePackage.getEString(), "Location", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Type(), this.getEnvironmentType(), "Type", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_ServerNodes(), this.getServerNode(), null, "ServerNodes", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEnvironment__DifferentServerNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DifferentServerNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serverNodeEClass, ServerNode.class, "ServerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerNode_RAM(), ecorePackage.getEString(), "RAM", null, 0, 1, ServerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerNode_Processor(), ecorePackage.getEString(), "Processor", null, 0, 1, ServerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerNode_Disk(), ecorePackage.getEString(), "Disk", null, 0, 1, ServerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerNode_VirtualMachines(), this.getVirtualMachine(), null, "VirtualMachines", null, 0, -1, ServerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachine_Type(), this.getVMType(), "Type", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Containers(), this.getContainer(), null, "Containers", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_TotalMicroservices(), ecorePackage.getEInt(), "TotalMicroservices", null, 1, 1, VirtualMachine.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getVirtualMachine__IsNotEmpty(), ecorePackage.getEBooleanObject(), "isNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerEClass, microservices.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_IP(), ecorePackage.getEString(), "IP", null, 0, 1, microservices.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Port(), ecorePackage.getEInt(), "Port", null, 1, 1, microservices.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Microservice(), this.getMicroservice(), null, "Microservice", null, 0, 1, microservices.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_BaseURI(), ecorePackage.getEString(), "BaseURI", null, 0, 1, microservices.Container.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__IsMicroserviceLive(), ecorePackage.getEBooleanObject(), "isMicroserviceLive", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainer__ValidPortAssigned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidPortAssigned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainer__ValidIPAddress__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidIPAddress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroservice_Health(), ecorePackage.getEBoolean(), "Health", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Type(), this.getMicroserviceType(), "Type", null, 0, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(environmentTypeEEnum, EnvironmentType.class, "EnvironmentType");
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.DEVELOPMENT);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.TEST);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.UAT);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.DEMO);
		addEEnumLiteral(environmentTypeEEnum, EnvironmentType.PRODUCTION);

		initEEnum(microserviceTypeEEnum, MicroserviceType.class, "MicroserviceType");
		addEEnumLiteral(microserviceTypeEEnum, MicroserviceType.INTERNAL);
		addEEnumLiteral(microserviceTypeEEnum, MicroserviceType.EXTERNAL);

		initEEnum(vmTypeEEnum, VMType.class, "VMType");
		addEEnumLiteral(vmTypeEEnum, VMType.LINUX);
		addEEnumLiteral(vmTypeEEnum, VMType.RED_HAT);
		addEEnumLiteral(vmTypeEEnum, VMType.WINDOWS);
		addEEnumLiteral(vmTypeEEnum, VMType.CENT_OS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (environmentEClass,
		   source,
		   new String[] {
			   "constraints", "DifferentServerNames"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "constraints", "ValidIPAddress"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getEnvironment__DifferentServerNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "ServerNodes->isUnique(x | x.name)"
		   });
		addAnnotation
		  (getVirtualMachine__IsNotEmpty(),
		   source,
		   new String[] {
			   "body", "Containers -> notEmpty()"
		   });
		addAnnotation
		  (getContainer__IsMicroserviceLive(),
		   source,
		   new String[] {
			   "body", "self.Microservice.Health"
		   });
		addAnnotation
		  (getContainer__ValidPortAssigned__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Port > 1024"
		   });
		addAnnotation
		  (getContainer__ValidIPAddress__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "IP.matches(\'\\\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\\\.|$)){4}\\\\b\') = true"
		   });
	}

} //MicroservicesPackageImpl
