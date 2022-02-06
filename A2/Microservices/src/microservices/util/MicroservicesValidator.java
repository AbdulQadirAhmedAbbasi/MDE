/**
 */
package microservices.util;

import java.util.Map;

import microservices.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see microservices.MicroservicesPackage
 * @generated
 */
public class MicroservicesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MicroservicesValidator INSTANCE = new MicroservicesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "microservices";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different Server Names' of 'Environment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENVIRONMENT__DIFFERENT_SERVER_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Port Assigned' of 'Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINER__VALID_PORT_ASSIGNED = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid IP Address' of 'Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINER__VALID_IP_ADDRESS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MicroservicesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MicroservicesPackage.NAMED:
				return validateNamed((Named)value, diagnostics, context);
			case MicroservicesPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case MicroservicesPackage.SERVER_NODE:
				return validateServerNode((ServerNode)value, diagnostics, context);
			case MicroservicesPackage.VIRTUAL_MACHINE:
				return validateVirtualMachine((VirtualMachine)value, diagnostics, context);
			case MicroservicesPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case MicroservicesPackage.MICROSERVICE:
				return validateMicroservice((Microservice)value, diagnostics, context);
			case MicroservicesPackage.ENVIRONMENT_TYPE:
				return validateEnvironmentType((EnvironmentType)value, diagnostics, context);
			case MicroservicesPackage.MICROSERVICE_TYPE:
				return validateMicroserviceType((MicroserviceType)value, diagnostics, context);
			case MicroservicesPackage.VM_TYPE:
				return validateVMType((VMType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(named, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(environment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(environment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnvironment_DifferentServerNames(environment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DifferentServerNames constraint of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment_DifferentServerNames(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return environment.DifferentServerNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerNode(ServerNode serverNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualMachine(VirtualMachine virtualMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_ValidIPAddress(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_ValidPortAssigned(container, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidIPAddress constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_ValidIPAddress(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return container.ValidIPAddress(diagnostics, context);
	}

	/**
	 * Validates the ValidPortAssigned constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_ValidPortAssigned(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return container.ValidPortAssigned(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microservice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentType(EnvironmentType environmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceType(MicroserviceType microserviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMType(VMType vmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MicroservicesValidator
