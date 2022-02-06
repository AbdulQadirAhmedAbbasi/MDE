/**
 */
package microservices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microservices.MicroservicesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MicroservicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microservices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/microservices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "microservices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroservicesPackage eINSTANCE = microservices.impl.MicroservicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link microservices.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.NamedImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microservices.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.EnvironmentImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__LOCATION = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TYPE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SERVER_NODES = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Different Server Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT___DIFFERENT_SERVER_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link microservices.impl.ServerNodeImpl <em>Server Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.ServerNodeImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getServerNode()
	 * @generated
	 */
	int SERVER_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE__RAM = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE__PROCESSOR = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE__DISK = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE__VIRTUAL_MACHINES = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Server Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Server Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_NODE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microservices.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.VirtualMachineImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CONTAINERS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Microservices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__TOTAL_MICROSERVICES = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE___IS_NOT_EMPTY = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link microservices.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.ContainerImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IP = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MICROSERVICE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BASE_URI = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Microservice Live</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___IS_MICROSERVICE_LIVE = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Port Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___VALID_PORT_ASSIGNED__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Valid IP Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___VALID_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link microservices.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.impl.MicroserviceImpl
	 * @see microservices.impl.MicroservicesPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__HEALTH = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__TYPE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microservices.EnvironmentType <em>Environment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.EnvironmentType
	 * @see microservices.impl.MicroservicesPackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 6;

	/**
	 * The meta object id for the '{@link microservices.MicroserviceType <em>Microservice Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.MicroserviceType
	 * @see microservices.impl.MicroservicesPackageImpl#getMicroserviceType()
	 * @generated
	 */
	int MICROSERVICE_TYPE = 7;

	/**
	 * The meta object id for the '{@link microservices.VMType <em>VM Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microservices.VMType
	 * @see microservices.impl.MicroservicesPackageImpl#getVMType()
	 * @generated
	 */
	int VM_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link microservices.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see microservices.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see microservices.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link microservices.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see microservices.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Environment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see microservices.Environment#getLocation()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Location();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Environment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see microservices.Environment#getType()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link microservices.Environment#getServerNodes <em>Server Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server Nodes</em>'.
	 * @see microservices.Environment#getServerNodes()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ServerNodes();

	/**
	 * Returns the meta object for the '{@link microservices.Environment#DifferentServerNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Different Server Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Different Server Names</em>' operation.
	 * @see microservices.Environment#DifferentServerNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEnvironment__DifferentServerNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link microservices.ServerNode <em>Server Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Node</em>'.
	 * @see microservices.ServerNode
	 * @generated
	 */
	EClass getServerNode();

	/**
	 * Returns the meta object for the attribute '{@link microservices.ServerNode#getRAM <em>RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAM</em>'.
	 * @see microservices.ServerNode#getRAM()
	 * @see #getServerNode()
	 * @generated
	 */
	EAttribute getServerNode_RAM();

	/**
	 * Returns the meta object for the attribute '{@link microservices.ServerNode#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see microservices.ServerNode#getProcessor()
	 * @see #getServerNode()
	 * @generated
	 */
	EAttribute getServerNode_Processor();

	/**
	 * Returns the meta object for the attribute '{@link microservices.ServerNode#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk</em>'.
	 * @see microservices.ServerNode#getDisk()
	 * @see #getServerNode()
	 * @generated
	 */
	EAttribute getServerNode_Disk();

	/**
	 * Returns the meta object for the containment reference list '{@link microservices.ServerNode#getVirtualMachines <em>Virtual Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Machines</em>'.
	 * @see microservices.ServerNode#getVirtualMachines()
	 * @see #getServerNode()
	 * @generated
	 */
	EReference getServerNode_VirtualMachines();

	/**
	 * Returns the meta object for class '{@link microservices.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see microservices.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link microservices.VirtualMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see microservices.VirtualMachine#getType()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link microservices.VirtualMachine#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see microservices.VirtualMachine#getContainers()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Containers();

	/**
	 * Returns the meta object for the attribute '{@link microservices.VirtualMachine#getTotalMicroservices <em>Total Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Microservices</em>'.
	 * @see microservices.VirtualMachine#getTotalMicroservices()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_TotalMicroservices();

	/**
	 * Returns the meta object for the '{@link microservices.VirtualMachine#isNotEmpty() <em>Is Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Not Empty</em>' operation.
	 * @see microservices.VirtualMachine#isNotEmpty()
	 * @generated
	 */
	EOperation getVirtualMachine__IsNotEmpty();

	/**
	 * Returns the meta object for class '{@link microservices.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see microservices.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Container#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see microservices.Container#getIP()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_IP();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Container#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see microservices.Container#getPort()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Port();

	/**
	 * Returns the meta object for the containment reference '{@link microservices.Container#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microservice</em>'.
	 * @see microservices.Container#getMicroservice()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Microservice();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Container#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see microservices.Container#getBaseURI()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_BaseURI();

	/**
	 * Returns the meta object for the '{@link microservices.Container#isMicroserviceLive() <em>Is Microservice Live</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Microservice Live</em>' operation.
	 * @see microservices.Container#isMicroserviceLive()
	 * @generated
	 */
	EOperation getContainer__IsMicroserviceLive();

	/**
	 * Returns the meta object for the '{@link microservices.Container#ValidPortAssigned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Port Assigned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Port Assigned</em>' operation.
	 * @see microservices.Container#ValidPortAssigned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContainer__ValidPortAssigned__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link microservices.Container#ValidIPAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid IP Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid IP Address</em>' operation.
	 * @see microservices.Container#ValidIPAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContainer__ValidIPAddress__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link microservices.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see microservices.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Microservice#isHealth <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health</em>'.
	 * @see microservices.Microservice#isHealth()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Health();

	/**
	 * Returns the meta object for the attribute '{@link microservices.Microservice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see microservices.Microservice#getType()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Type();

	/**
	 * Returns the meta object for enum '{@link microservices.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment Type</em>'.
	 * @see microservices.EnvironmentType
	 * @generated
	 */
	EEnum getEnvironmentType();

	/**
	 * Returns the meta object for enum '{@link microservices.MicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Microservice Type</em>'.
	 * @see microservices.MicroserviceType
	 * @generated
	 */
	EEnum getMicroserviceType();

	/**
	 * Returns the meta object for enum '{@link microservices.VMType <em>VM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VM Type</em>'.
	 * @see microservices.VMType
	 * @generated
	 */
	EEnum getVMType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicroservicesFactory getMicroservicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microservices.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.NamedImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link microservices.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.EnvironmentImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__LOCATION = eINSTANCE.getEnvironment_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__TYPE = eINSTANCE.getEnvironment_Type();

		/**
		 * The meta object literal for the '<em><b>Server Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__SERVER_NODES = eINSTANCE.getEnvironment_ServerNodes();

		/**
		 * The meta object literal for the '<em><b>Different Server Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT___DIFFERENT_SERVER_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEnvironment__DifferentServerNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link microservices.impl.ServerNodeImpl <em>Server Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.ServerNodeImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getServerNode()
		 * @generated
		 */
		EClass SERVER_NODE = eINSTANCE.getServerNode();

		/**
		 * The meta object literal for the '<em><b>RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_NODE__RAM = eINSTANCE.getServerNode_RAM();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_NODE__PROCESSOR = eINSTANCE.getServerNode_Processor();

		/**
		 * The meta object literal for the '<em><b>Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_NODE__DISK = eINSTANCE.getServerNode_Disk();

		/**
		 * The meta object literal for the '<em><b>Virtual Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_NODE__VIRTUAL_MACHINES = eINSTANCE.getServerNode_VirtualMachines();

		/**
		 * The meta object literal for the '{@link microservices.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.VirtualMachineImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__TYPE = eINSTANCE.getVirtualMachine_Type();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__CONTAINERS = eINSTANCE.getVirtualMachine_Containers();

		/**
		 * The meta object literal for the '<em><b>Total Microservices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__TOTAL_MICROSERVICES = eINSTANCE.getVirtualMachine_TotalMicroservices();

		/**
		 * The meta object literal for the '<em><b>Is Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_MACHINE___IS_NOT_EMPTY = eINSTANCE.getVirtualMachine__IsNotEmpty();

		/**
		 * The meta object literal for the '{@link microservices.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.ContainerImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IP = eINSTANCE.getContainer_IP();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PORT = eINSTANCE.getContainer_Port();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__MICROSERVICE = eINSTANCE.getContainer_Microservice();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BASE_URI = eINSTANCE.getContainer_BaseURI();

		/**
		 * The meta object literal for the '<em><b>Is Microservice Live</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___IS_MICROSERVICE_LIVE = eINSTANCE.getContainer__IsMicroserviceLive();

		/**
		 * The meta object literal for the '<em><b>Valid Port Assigned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___VALID_PORT_ASSIGNED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContainer__ValidPortAssigned__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid IP Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___VALID_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContainer__ValidIPAddress__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link microservices.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.impl.MicroserviceImpl
		 * @see microservices.impl.MicroservicesPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__HEALTH = eINSTANCE.getMicroservice_Health();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__TYPE = eINSTANCE.getMicroservice_Type();

		/**
		 * The meta object literal for the '{@link microservices.EnvironmentType <em>Environment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.EnvironmentType
		 * @see microservices.impl.MicroservicesPackageImpl#getEnvironmentType()
		 * @generated
		 */
		EEnum ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

		/**
		 * The meta object literal for the '{@link microservices.MicroserviceType <em>Microservice Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.MicroserviceType
		 * @see microservices.impl.MicroservicesPackageImpl#getMicroserviceType()
		 * @generated
		 */
		EEnum MICROSERVICE_TYPE = eINSTANCE.getMicroserviceType();

		/**
		 * The meta object literal for the '{@link microservices.VMType <em>VM Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microservices.VMType
		 * @see microservices.impl.MicroservicesPackageImpl#getVMType()
		 * @generated
		 */
		EEnum VM_TYPE = eINSTANCE.getVMType();

	}

} //MicroservicesPackage
