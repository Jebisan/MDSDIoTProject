/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.pycom.ConditionalAction;
import xtext.pycom.Connection;
import xtext.pycom.PycomPackage;
import xtext.pycom.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.impl.ServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.pycom.impl.ServerImpl#getConn <em>Conn</em>}</li>
 *   <li>{@link xtext.pycom.impl.ServerImpl#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConn() <em>Conn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConn()
   * @generated
   * @ordered
   */
  protected Connection conn;

  /**
   * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExps()
   * @generated
   * @ordered
   */
  protected EList<ConditionalAction> exps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PycomPackage.Literals.SERVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PycomPackage.SERVER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connection getConn()
  {
    return conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConn(Connection newConn, NotificationChain msgs)
  {
    Connection oldConn = conn;
    conn = newConn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PycomPackage.SERVER__CONN, oldConn, newConn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConn(Connection newConn)
  {
    if (newConn != conn)
    {
      NotificationChain msgs = null;
      if (conn != null)
        msgs = ((InternalEObject)conn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PycomPackage.SERVER__CONN, null, msgs);
      if (newConn != null)
        msgs = ((InternalEObject)newConn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PycomPackage.SERVER__CONN, null, msgs);
      msgs = basicSetConn(newConn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PycomPackage.SERVER__CONN, newConn, newConn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConditionalAction> getExps()
  {
    if (exps == null)
    {
      exps = new EObjectContainmentEList<ConditionalAction>(ConditionalAction.class, this, PycomPackage.SERVER__EXPS);
    }
    return exps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PycomPackage.SERVER__CONN:
        return basicSetConn(null, msgs);
      case PycomPackage.SERVER__EXPS:
        return ((InternalEList<?>)getExps()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PycomPackage.SERVER__NAME:
        return getName();
      case PycomPackage.SERVER__CONN:
        return getConn();
      case PycomPackage.SERVER__EXPS:
        return getExps();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PycomPackage.SERVER__NAME:
        setName((String)newValue);
        return;
      case PycomPackage.SERVER__CONN:
        setConn((Connection)newValue);
        return;
      case PycomPackage.SERVER__EXPS:
        getExps().clear();
        getExps().addAll((Collection<? extends ConditionalAction>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PycomPackage.SERVER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PycomPackage.SERVER__CONN:
        setConn((Connection)null);
        return;
      case PycomPackage.SERVER__EXPS:
        getExps().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PycomPackage.SERVER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PycomPackage.SERVER__CONN:
        return conn != null;
      case PycomPackage.SERVER__EXPS:
        return exps != null && !exps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ServerImpl
