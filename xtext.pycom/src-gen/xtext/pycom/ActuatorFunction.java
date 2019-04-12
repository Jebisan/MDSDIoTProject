/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.ActuatorFunction#getActuatorType <em>Actuator Type</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getActuatorFunction()
 * @model
 * @generated
 */
public interface ActuatorFunction extends Function
{
  /**
   * Returns the value of the '<em><b>Actuator Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuator Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuator Type</em>' reference.
   * @see #setActuatorType(ActuatorType)
   * @see xtext.pycom.PycomPackage#getActuatorFunction_ActuatorType()
   * @model
   * @generated
   */
  ActuatorType getActuatorType();

  /**
   * Sets the value of the '{@link xtext.pycom.ActuatorFunction#getActuatorType <em>Actuator Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actuator Type</em>' reference.
   * @see #getActuatorType()
   * @generated
   */
  void setActuatorType(ActuatorType value);

} // ActuatorFunction
