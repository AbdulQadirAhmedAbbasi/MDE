/**
 */
package microservices.impl;

import java.util.Collection;

import microservices.MicroservicesPackage;
import microservices.ServerNode;
import microservices.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microservices.impl.ServerNodeImpl#getRAM <em>RAM</em>}</li>
 *   <li>{@link microservices.impl.ServerNodeImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link microservices.impl.ServerNodeImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link microservices.impl.ServerNodeImpl#getVirtualMachines <em>Virtual Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerNodeImpl extends NamedImpl implements ServerNode {
	/**
	 * The default value of the '{@link #getRAM() <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAM()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRAM() <em>RAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAM()
	 * @generated
	 * @ordered
	 */
	protected String ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected String processor = PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected String disk = DISK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVirtualMachines() <em>Virtual Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> virtualMachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.SERVER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRAM() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRAM(String newRAM) {
		String oldRAM = ram;
		ram = newRAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.SERVER_NODE__RAM, oldRAM, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(String newProcessor) {
		String oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.SERVER_NODE__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(String newDisk) {
		String oldDisk = disk;
		disk = newDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.SERVER_NODE__DISK, oldDisk, disk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachine> getVirtualMachines() {
		if (virtualMachines == null) {
			virtualMachines = new EObjectContainmentEList<VirtualMachine>(VirtualMachine.class, this, MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES);
		}
		return virtualMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES:
				return ((InternalEList<?>)getVirtualMachines()).basicRemove(otherEnd, msgs);
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
			case MicroservicesPackage.SERVER_NODE__RAM:
				return getRAM();
			case MicroservicesPackage.SERVER_NODE__PROCESSOR:
				return getProcessor();
			case MicroservicesPackage.SERVER_NODE__DISK:
				return getDisk();
			case MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES:
				return getVirtualMachines();
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
			case MicroservicesPackage.SERVER_NODE__RAM:
				setRAM((String)newValue);
				return;
			case MicroservicesPackage.SERVER_NODE__PROCESSOR:
				setProcessor((String)newValue);
				return;
			case MicroservicesPackage.SERVER_NODE__DISK:
				setDisk((String)newValue);
				return;
			case MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES:
				getVirtualMachines().clear();
				getVirtualMachines().addAll((Collection<? extends VirtualMachine>)newValue);
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
			case MicroservicesPackage.SERVER_NODE__RAM:
				setRAM(RAM_EDEFAULT);
				return;
			case MicroservicesPackage.SERVER_NODE__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
			case MicroservicesPackage.SERVER_NODE__DISK:
				setDisk(DISK_EDEFAULT);
				return;
			case MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES:
				getVirtualMachines().clear();
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
			case MicroservicesPackage.SERVER_NODE__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case MicroservicesPackage.SERVER_NODE__PROCESSOR:
				return PROCESSOR_EDEFAULT == null ? processor != null : !PROCESSOR_EDEFAULT.equals(processor);
			case MicroservicesPackage.SERVER_NODE__DISK:
				return DISK_EDEFAULT == null ? disk != null : !DISK_EDEFAULT.equals(disk);
			case MicroservicesPackage.SERVER_NODE__VIRTUAL_MACHINES:
				return virtualMachines != null && !virtualMachines.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (RAM: ");
		result.append(ram);
		result.append(", Processor: ");
		result.append(processor);
		result.append(", Disk: ");
		result.append(disk);
		result.append(')');
		return result.toString();
	}

} //ServerNodeImpl
