/**
 */
package microservices.tests;

import junit.textui.TestRunner;

import microservices.MicroservicesFactory;
import microservices.ServerNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerNodeTest extends NamedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerNodeTest.class);
	}

	/**
	 * Constructs a new Server Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerNode getFixture() {
		return (ServerNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroservicesFactory.eINSTANCE.createServerNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ServerNodeTest
