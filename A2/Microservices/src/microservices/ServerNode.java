/**
 */
package microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microservices.ServerNode#getRAM <em>RAM</em>}</li>
 *   <li>{@link microservices.ServerNode#getProcessor <em>Processor</em>}</li>
 *   <li>{@link microservices.ServerNode#getDisk <em>Disk</em>}</li>
 *   <li>{@link microservices.ServerNode#getVirtualMachines <em>Virtual Machines</em>}</li>
 * </ul>
 *
 * @see microservices.MicroservicesPackage#getServerNode()
 * @model
 * @generated
 */
public interface ServerNode extends Named {
	/**
	 * Returns the value of the '<em><b>RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAM</em>' attribute.
	 * @see #setRAM(String)
	 * @see microservices.MicroservicesPackage#getServerNode_RAM()
	 * @model
	 * @generated
	 */
	String getRAM();

	/**
	 * Sets the value of the '{@link microservices.ServerNode#getRAM <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAM</em>' attribute.
	 * @see #getRAM()
	 * @generated
	 */
	void setRAM(String value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see #setProcessor(String)
	 * @see microservices.MicroservicesPackage#getServerNode_Processor()
	 * @model
	 * @generated
	 */
	String getProcessor();

	/**
	 * Sets the value of the '{@link microservices.ServerNode#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' attribute.
	 * @see #setDisk(String)
	 * @see microservices.MicroservicesPackage#getServerNode_Disk()
	 * @model
	 * @generated
	 */
	String getDisk();

	/**
	 * Sets the value of the '{@link microservices.ServerNode#getDisk <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' attribute.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Machines</b></em>' containment reference list.
	 * The list contents are of type {@link microservices.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Machines</em>' containment reference list.
	 * @see microservices.MicroservicesPackage#getServerNode_VirtualMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualMachines();

} // ServerNode
