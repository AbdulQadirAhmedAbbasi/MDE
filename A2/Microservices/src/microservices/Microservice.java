/**
 */
package microservices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microservices.Microservice#isHealth <em>Health</em>}</li>
 *   <li>{@link microservices.Microservice#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see microservices.MicroservicesPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends Named {
	/**
	 * Returns the value of the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health</em>' attribute.
	 * @see #setHealth(boolean)
	 * @see microservices.MicroservicesPackage#getMicroservice_Health()
	 * @model required="true"
	 * @generated
	 */
	boolean isHealth();

	/**
	 * Sets the value of the '{@link microservices.Microservice#isHealth <em>Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health</em>' attribute.
	 * @see #isHealth()
	 * @generated
	 */
	void setHealth(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link microservices.MicroserviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see microservices.MicroserviceType
	 * @see #setType(MicroserviceType)
	 * @see microservices.MicroservicesPackage#getMicroservice_Type()
	 * @model
	 * @generated
	 */
	MicroserviceType getType();

	/**
	 * Sets the value of the '{@link microservices.Microservice#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see microservices.MicroserviceType
	 * @see #getType()
	 * @generated
	 */
	void setType(MicroserviceType value);

} // Microservice
