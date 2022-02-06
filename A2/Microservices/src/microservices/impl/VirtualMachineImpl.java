/**
 */
package microservices.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import microservices.Microservice;
import microservices.MicroservicesPackage;
import microservices.MicroservicesTables;
import microservices.VMType;
import microservices.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microservices.impl.VirtualMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link microservices.impl.VirtualMachineImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link microservices.impl.VirtualMachineImpl#getTotalMicroservices <em>Total Microservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends NamedImpl implements VirtualMachine {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VMType TYPE_EDEFAULT = VMType.LINUX;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VMType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<microservices.Container> containers;

	/**
	 * The default value of the '{@link #getTotalMicroservices() <em>Total Microservices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMicroservices()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MICROSERVICES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VMType newType) {
		VMType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.VIRTUAL_MACHINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<microservices.Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<microservices.Container>(microservices.Container.class, this, MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalMicroservices() {
		/**
		 * Containers->collectNested(Microservice)->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<microservices.Container> Containers = this.getContainers();
		final /*@NonInvalid*/ OrderedSetValue BOXED_Containers = idResolver.createOrderedSetOfAll(MicroservicesTables.ORD_CLSSid_Container, Containers);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MicroservicesTables.SEQ_CLSSid_Microservice);
		Iterator<Object> ITERATOR__1 = BOXED_Containers.iterator();
		/*@Thrown*/ SequenceValue collectNested;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collectNested = accumulator;
				break;
			}
			/*@NonInvalid*/ microservices.Container _1 = (microservices.Container)ITERATOR__1.next();
			/**
			 * Microservice
			 */
			final /*@NonInvalid*/ Microservice Microservice = _1.getMicroservice();
			//
			accumulator.add(Microservice);
		}
		final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(collectNested);
		final /*@Thrown*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMicroservices(int newTotalMicroservices) {
		// TODO: implement this method to set the 'Total Microservices' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNotEmpty() {
		/**
		 * Containers->notEmpty()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<microservices.Container> Containers = this.getContainers();
		final /*@NonInvalid*/ OrderedSetValue BOXED_Containers = idResolver.createOrderedSetOfAll(MicroservicesTables.ORD_CLSSid_Container, Containers);
		final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_Containers).booleanValue();
		return notEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
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
			case MicroservicesPackage.VIRTUAL_MACHINE__TYPE:
				return getType();
			case MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS:
				return getContainers();
			case MicroservicesPackage.VIRTUAL_MACHINE__TOTAL_MICROSERVICES:
				return getTotalMicroservices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroservicesPackage.VIRTUAL_MACHINE__TYPE:
				setType((VMType)newValue);
				return;
			case MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends microservices.Container>)newValue);
				return;
			case MicroservicesPackage.VIRTUAL_MACHINE__TOTAL_MICROSERVICES:
				setTotalMicroservices((Integer)newValue);
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
			case MicroservicesPackage.VIRTUAL_MACHINE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS:
				getContainers().clear();
				return;
			case MicroservicesPackage.VIRTUAL_MACHINE__TOTAL_MICROSERVICES:
				setTotalMicroservices(TOTAL_MICROSERVICES_EDEFAULT);
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
			case MicroservicesPackage.VIRTUAL_MACHINE__TYPE:
				return type != TYPE_EDEFAULT;
			case MicroservicesPackage.VIRTUAL_MACHINE__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case MicroservicesPackage.VIRTUAL_MACHINE__TOTAL_MICROSERVICES:
				return getTotalMicroservices() != TOTAL_MICROSERVICES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MicroservicesPackage.VIRTUAL_MACHINE___IS_NOT_EMPTY:
				return isNotEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
