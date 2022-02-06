/**
 */
package microservices;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microservices.Container#getIP <em>IP</em>}</li>
 *   <li>{@link microservices.Container#getPort <em>Port</em>}</li>
 *   <li>{@link microservices.Container#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microservices.Container#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @see microservices.MicroservicesPackage#getContainer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidIPAddress'"
 * @generated
 */
public interface Container extends Named {
	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see microservices.MicroservicesPackage#getContainer_IP()
	 * @model
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link microservices.Container#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see microservices.MicroservicesPackage#getContainer_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link microservices.Container#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' containment reference.
	 * @see #setMicroservice(Microservice)
	 * @see microservices.MicroservicesPackage#getContainer_Microservice()
	 * @model containment="true"
	 * @generated
	 */
	Microservice getMicroservice();

	/**
	 * Sets the value of the '{@link microservices.Container#getMicroservice <em>Microservice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' containment reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(Microservice value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see microservices.MicroservicesPackage#getContainer_BaseURI()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link microservices.Container#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Microservice.Health'"
	 * @generated
	 */
	Boolean isMicroserviceLive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Port &gt; 1024'"
	 * @generated
	 */
	boolean ValidPortAssigned(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='IP.matches(\'\\\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\\\.|$)){4}\\\\b\') = true'"
	 * @generated
	 */
	boolean ValidIPAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Container
