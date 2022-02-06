/**
 */
package microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microservices.VirtualMachine#getType <em>Type</em>}</li>
 *   <li>{@link microservices.VirtualMachine#getContainers <em>Containers</em>}</li>
 *   <li>{@link microservices.VirtualMachine#getTotalMicroservices <em>Total Microservices</em>}</li>
 * </ul>
 *
 * @see microservices.MicroservicesPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link microservices.VMType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see microservices.VMType
	 * @see #setType(VMType)
	 * @see microservices.MicroservicesPackage#getVirtualMachine_Type()
	 * @model
	 * @generated
	 */
	VMType getType();

	/**
	 * Sets the value of the '{@link microservices.VirtualMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see microservices.VMType
	 * @see #getType()
	 * @generated
	 */
	void setType(VMType value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link microservices.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see microservices.MicroservicesPackage#getVirtualMachine_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Total Microservices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Microservices</em>' attribute.
	 * @see #setTotalMicroservices(int)
	 * @see microservices.MicroservicesPackage#getVirtualMachine_TotalMicroservices()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalMicroservices();

	/**
	 * Sets the value of the '{@link microservices.VirtualMachine#getTotalMicroservices <em>Total Microservices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Microservices</em>' attribute.
	 * @see #getTotalMicroservices()
	 * @generated
	 */
	void setTotalMicroservices(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Containers -&gt; notEmpty()'"
	 * @generated
	 */
	Boolean isNotEmpty();

} // VirtualMachine
