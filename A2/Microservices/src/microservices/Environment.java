/**
 */
package microservices;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microservices.Environment#getLocation <em>Location</em>}</li>
 *   <li>{@link microservices.Environment#getType <em>Type</em>}</li>
 *   <li>{@link microservices.Environment#getServerNodes <em>Server Nodes</em>}</li>
 * </ul>
 *
 * @see microservices.MicroservicesPackage#getEnvironment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DifferentServerNames'"
 * @generated
 */
public interface Environment extends Named {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see microservices.MicroservicesPackage#getEnvironment_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link microservices.Environment#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link microservices.EnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see microservices.EnvironmentType
	 * @see #setType(EnvironmentType)
	 * @see microservices.MicroservicesPackage#getEnvironment_Type()
	 * @model
	 * @generated
	 */
	EnvironmentType getType();

	/**
	 * Sets the value of the '{@link microservices.Environment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see microservices.EnvironmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Server Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link microservices.ServerNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Nodes</em>' containment reference list.
	 * @see microservices.MicroservicesPackage#getEnvironment_ServerNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerNode> getServerNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ServerNodes-&gt;isUnique(x | x.name)'"
	 * @generated
	 */
	boolean DifferentServerNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Environment
