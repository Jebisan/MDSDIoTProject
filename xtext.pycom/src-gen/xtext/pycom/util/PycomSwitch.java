/**
 * generated by Xtext 2.17.0
 */
package xtext.pycom.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xtext.pycom.Actuator;
import xtext.pycom.ActuatorFunction;
import xtext.pycom.ActuatorType;
import xtext.pycom.Board;
import xtext.pycom.BoardMember;
import xtext.pycom.ComparisonExp;
import xtext.pycom.Condition;
import xtext.pycom.ConditionalAction;
import xtext.pycom.Connection;
import xtext.pycom.ExpMember;
import xtext.pycom.Expression;
import xtext.pycom.Function;
import xtext.pycom.LogicExp;
import xtext.pycom.Pin;
import xtext.pycom.PycomPackage;
import xtext.pycom.Sensor;
import xtext.pycom.SensorFunction;
import xtext.pycom.SensorType;
import xtext.pycom.Server;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xtext.pycom.PycomPackage
 * @generated
 */
public class PycomSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PycomPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PycomSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PycomPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PycomPackage.SYSTEM:
      {
        xtext.pycom.System system = (xtext.pycom.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.SERVER:
      {
        Server server = (Server)theEObject;
        T result = caseServer(server);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.CONNECTION:
      {
        Connection connection = (Connection)theEObject;
        T result = caseConnection(connection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.BOARD:
      {
        Board board = (Board)theEObject;
        T result = caseBoard(board);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.BOARD_MEMBER:
      {
        BoardMember boardMember = (BoardMember)theEObject;
        T result = caseBoardMember(boardMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.CONDITIONAL_ACTION:
      {
        ConditionalAction conditionalAction = (ConditionalAction)theEObject;
        T result = caseConditionalAction(conditionalAction);
        if (result == null) result = caseExpMember(conditionalAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.EXP_MEMBER:
      {
        ExpMember expMember = (ExpMember)theEObject;
        T result = caseExpMember(expMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.SENSOR:
      {
        Sensor sensor = (Sensor)theEObject;
        T result = caseSensor(sensor);
        if (result == null) result = caseBoardMember(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.ACTUATOR:
      {
        Actuator actuator = (Actuator)theEObject;
        T result = caseActuator(actuator);
        if (result == null) result = caseBoardMember(actuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.ACTUATOR_TYPE:
      {
        ActuatorType actuatorType = (ActuatorType)theEObject;
        T result = caseActuatorType(actuatorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.SENSOR_TYPE:
      {
        SensorType sensorType = (SensorType)theEObject;
        T result = caseSensorType(sensorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.PIN:
      {
        Pin pin = (Pin)theEObject;
        T result = casePin(pin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseConditionalAction(condition);
        if (result == null) result = caseExpMember(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.LOGIC_EXP:
      {
        LogicExp logicExp = (LogicExp)theEObject;
        T result = caseLogicExp(logicExp);
        if (result == null) result = caseCondition(logicExp);
        if (result == null) result = caseConditionalAction(logicExp);
        if (result == null) result = caseExpMember(logicExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.BOOLEAN:
      {
        xtext.pycom.Boolean boolean_ = (xtext.pycom.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseLogicExp(boolean_);
        if (result == null) result = caseCondition(boolean_);
        if (result == null) result = caseConditionalAction(boolean_);
        if (result == null) result = caseExpMember(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.COMPARISON_EXP:
      {
        ComparisonExp comparisonExp = (ComparisonExp)theEObject;
        T result = caseComparisonExp(comparisonExp);
        if (result == null) result = caseLogicExp(comparisonExp);
        if (result == null) result = caseCondition(comparisonExp);
        if (result == null) result = caseConditionalAction(comparisonExp);
        if (result == null) result = caseExpMember(comparisonExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseExpMember(function);
        if (result == null) result = caseExpression(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.ACTUATOR_FUNCTION:
      {
        ActuatorFunction actuatorFunction = (ActuatorFunction)theEObject;
        T result = caseActuatorFunction(actuatorFunction);
        if (result == null) result = caseFunction(actuatorFunction);
        if (result == null) result = caseExpMember(actuatorFunction);
        if (result == null) result = caseExpression(actuatorFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PycomPackage.SENSOR_FUNCTION:
      {
        SensorFunction sensorFunction = (SensorFunction)theEObject;
        T result = caseSensorFunction(sensorFunction);
        if (result == null) result = caseFunction(sensorFunction);
        if (result == null) result = caseExpMember(sensorFunction);
        if (result == null) result = caseExpression(sensorFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(xtext.pycom.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServer(Server object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnection(Connection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Board</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoard(Board object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Board Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Board Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoardMember(BoardMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAction(ConditionalAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpMember(ExpMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensor(Sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActuator(Actuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActuatorType(ActuatorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorType(SensorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePin(Pin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicExp(LogicExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(xtext.pycom.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExp(ComparisonExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActuatorFunction(ActuatorFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorFunction(SensorFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PycomSwitch
