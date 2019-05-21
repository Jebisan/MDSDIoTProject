/**
 * generated by Xtext 2.17.0
 */
package xtext.pycom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.Actuator#getActuatorTypes <em>Actuator Types</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends BoardMember
{
  /**
   * Returns the value of the '<em><b>Actuator Types</b></em>' containment reference list.
   * The list contents are of type {@link xtext.pycom.ModuleType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator Types</em>' containment reference list.
   * @see xtext.pycom.PycomPackage#getActuator_ActuatorTypes()
   * @model containment="true"
   * @generated
   */
  EList<ModuleType> getActuatorTypes();

} // Actuator
