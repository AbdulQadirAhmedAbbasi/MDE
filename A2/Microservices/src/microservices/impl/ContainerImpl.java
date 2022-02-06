/**
 */
package microservices.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import microservices.Microservice;
import microservices.MicroservicesPackage;

import microservices.MicroservicesTables;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microservices.impl.ContainerImpl#getIP <em>IP</em>}</li>
 *   <li>{@link microservices.impl.ContainerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link microservices.impl.ContainerImpl#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link microservices.impl.ContainerImpl#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedImpl implements microservices.Container {
	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected Microservice microservice;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.CONTAINER__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.CONTAINER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getMicroservice() {
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroservice(Microservice newMicroservice, NotificationChain msgs) {
		Microservice oldMicroservice = microservice;
		microservice = newMicroservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroservicesPackage.CONTAINER__MICROSERVICE, oldMicroservice, newMicroservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroservice(Microservice newMicroservice) {
		if (newMicroservice != microservice) {
			NotificationChain msgs = null;
			if (microservice != null)
				msgs = ((InternalEObject)microservice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroservicesPackage.CONTAINER__MICROSERVICE, null, msgs);
			if (newMicroservice != null)
				msgs = ((InternalEObject)newMicroservice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroservicesPackage.CONTAINER__MICROSERVICE, null, msgs);
			msgs = basicSetMicroservice(newMicroservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.CONTAINER__MICROSERVICE, newMicroservice, newMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURI() {
		/**
		 * 'http://' + IP + ':' + Port.toString()
		 */
		final /*@NonInvalid*/ String IP = this.getIP();
		final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(MicroservicesTables.STR_http_c_s_s, IP);
		final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, MicroservicesTables.STR__c);
		final /*@NonInvalid*/ int Port = this.getPort();
		final /*@NonInvalid*/ IntegerValue BOXED_Port = ValueUtil.integerValueOf(Port);
		final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_Port);
		final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, toString);
		return sum_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURI(String newBaseURI) {
		// TODO: implement this method to set the 'Base URI' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isMicroserviceLive() {
		/**
		 * self.Microservice.Health
		 */
		final /*@NonInvalid*/ Microservice Microservice = this.getMicroservice();
		if (Microservice == null) {
			throw new InvalidValueException("Null source for \'\'http://www.example.org/microservices\'::Microservice::Health\'");
		}
		final /*@Thrown*/ boolean Health = Microservice.isHealth();
		return Health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ValidPortAssigned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Container::ValidPortAssigned";
		try {
			/**
			 *
			 * inv ValidPortAssigned:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Port > 1024
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MicroservicesPackage.Literals.CONTAINER___VALID_PORT_ASSIGNED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MicroservicesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ int Port = this.getPort();
				final /*@NonInvalid*/ IntegerValue BOXED_Port = ValueUtil.integerValueOf(Port);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_Port, MicroservicesTables.INT_1024).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MicroservicesTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ValidIPAddress(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Container::ValidIPAddress";
		try {
			/**
			 *
			 * inv ValidIPAddress:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = IP.matches('\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b') = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MicroservicesPackage.Literals.CONTAINER___VALID_IP_ADDRESS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MicroservicesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_matches;
				try {
					final /*@NonInvalid*/ String IP = this.getIP();
					if (IP == null) {
						throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, IP, MicroservicesTables.STR__92_b_o_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_01_93_63_91_0_m_9_93_91_0_m_9_93_63_e_o_92__124_$_e_e_123_4_125_92_b).booleanValue();
					CAUGHT_matches = matches;
				}
				catch (Exception e) {
					CAUGHT_matches = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_matches, MicroservicesTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesPackage.CONTAINER__MICROSERVICE:
				return basicSetMicroservice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroservicesPackage.CONTAINER__IP:
				return getIP();
			case MicroservicesPackage.CONTAINER__PORT:
				return getPort();
			case MicroservicesPackage.CONTAINER__MICROSERVICE:
				return getMicroservice();
			case MicroservicesPackage.CONTAINER__BASE_URI:
				return getBaseURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroservicesPackage.CONTAINER__IP:
				setIP((String)newValue);
				return;
			case MicroservicesPackage.CONTAINER__PORT:
				setPort((Integer)newValue);
				return;
			case MicroservicesPackage.CONTAINER__MICROSERVICE:
				setMicroservice((Microservice)newValue);
				return;
			case MicroservicesPackage.CONTAINER__BASE_URI:
				setBaseURI((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroservicesPackage.CONTAINER__IP:
				setIP(IP_EDEFAULT);
				return;
			case MicroservicesPackage.CONTAINER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MicroservicesPackage.CONTAINER__MICROSERVICE:
				setMicroservice((Microservice)null);
				return;
			case MicroservicesPackage.CONTAINER__BASE_URI:
				setBaseURI(BASE_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroservicesPackage.CONTAINER__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case MicroservicesPackage.CONTAINER__PORT:
				return port != PORT_EDEFAULT;
			case MicroservicesPackage.CONTAINER__MICROSERVICE:
				return microservice != null;
			case MicroservicesPackage.CONTAINER__BASE_URI:
				return BASE_URI_EDEFAULT == null ? getBaseURI() != null : !BASE_URI_EDEFAULT.equals(getBaseURI());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MicroservicesPackage.CONTAINER___IS_MICROSERVICE_LIVE:
				return isMicroserviceLive();
			case MicroservicesPackage.CONTAINER___VALID_PORT_ASSIGNED__DIAGNOSTICCHAIN_MAP:
				return ValidPortAssigned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MicroservicesPackage.CONTAINER___VALID_IP_ADDRESS__DIAGNOSTICCHAIN_MAP:
				return ValidIPAddress((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (IP: ");
		result.append(ip);
		result.append(", Port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
