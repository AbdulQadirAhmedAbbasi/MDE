/**
 */
package microservices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Environment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see microservices.MicroservicesPackage#getEnvironmentType()
 * @model
 * @generated
 */
public enum EnvironmentType implements Enumerator {
	/**
	 * The '<em><b>Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT(0, "Development", "Development"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(1, "Test", "Test"),

	/**
	 * The '<em><b>UAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UAT_VALUE
	 * @generated
	 * @ordered
	 */
	UAT(2, "UAT", "UAT"),

	/**
	 * The '<em><b>Demo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMO_VALUE
	 * @generated
	 * @ordered
	 */
	DEMO(3, "Demo", "Demo"),

	/**
	 * The '<em><b>Production</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTION(4, "Production", "Production");

	/**
	 * The '<em><b>Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT
	 * @model name="Development"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_VALUE = 0;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 1;

	/**
	 * The '<em><b>UAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UAT_VALUE = 2;

	/**
	 * The '<em><b>Demo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMO
	 * @model name="Demo"
	 * @generated
	 * @ordered
	 */
	public static final int DEMO_VALUE = 3;

	/**
	 * The '<em><b>Production</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION
	 * @model name="Production"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Environment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnvironmentType[] VALUES_ARRAY =
		new EnvironmentType[] {
			DEVELOPMENT,
			TEST,
			UAT,
			DEMO,
			PRODUCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Environment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnvironmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Environment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnvironmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnvironmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnvironmentType get(int value) {
		switch (value) {
			case DEVELOPMENT_VALUE: return DEVELOPMENT;
			case TEST_VALUE: return TEST;
			case UAT_VALUE: return UAT;
			case DEMO_VALUE: return DEMO;
			case PRODUCTION_VALUE: return PRODUCTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnvironmentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnvironmentType
