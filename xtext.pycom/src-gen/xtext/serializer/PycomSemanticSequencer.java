/*
 * generated by Xtext 2.16.0
 */
package xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import xtext.pycom.Actuator;
import xtext.pycom.ActuatorFunction;
import xtext.pycom.ActuatorType;
import xtext.pycom.Board;
import xtext.pycom.ComparisonExp;
import xtext.pycom.Connection;
import xtext.pycom.Function;
import xtext.pycom.Pin;
import xtext.pycom.PycomPackage;
import xtext.pycom.Sensor;
import xtext.pycom.SensorFunction;
import xtext.pycom.SensorType;
import xtext.pycom.Server;
import xtext.services.PycomGrammarAccess;

@SuppressWarnings("all")
public class PycomSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PycomGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PycomPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PycomPackage.ACTUATOR:
				sequence_Actuator(context, (Actuator) semanticObject); 
				return; 
			case PycomPackage.ACTUATOR_FUNCTION:
				sequence_ActuatorFunction(context, (ActuatorFunction) semanticObject); 
				return; 
			case PycomPackage.ACTUATOR_TYPE:
				sequence_ActuatorType(context, (ActuatorType) semanticObject); 
				return; 
			case PycomPackage.BOARD:
				sequence_Board(context, (Board) semanticObject); 
				return; 
			case PycomPackage.BOOLEAN:
				if (rule == grammarAccess.getLogicExpRule()
						|| rule == grammarAccess.getBooleanRule()) {
					sequence_Boolean(context, (xtext.pycom.Boolean) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConditionRule()) {
					sequence_Boolean_Condition(context, (xtext.pycom.Boolean) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConditionalActionRule()
						|| rule == grammarAccess.getExpMemberRule()) {
					sequence_Boolean_Condition_ConditionalAction(context, (xtext.pycom.Boolean) semanticObject); 
					return; 
				}
				else break;
			case PycomPackage.COMPARISON_EXP:
				if (rule == grammarAccess.getLogicExpRule()
						|| rule == grammarAccess.getComparisonExpRule()) {
					sequence_ComparisonExp(context, (ComparisonExp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConditionRule()) {
					sequence_ComparisonExp_Condition(context, (ComparisonExp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConditionalActionRule()
						|| rule == grammarAccess.getExpMemberRule()) {
					sequence_ComparisonExp_Condition_ConditionalAction(context, (ComparisonExp) semanticObject); 
					return; 
				}
				else break;
			case PycomPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case PycomPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case PycomPackage.PIN:
				sequence_Pin(context, (Pin) semanticObject); 
				return; 
			case PycomPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case PycomPackage.SENSOR_FUNCTION:
				sequence_SensorFunction(context, (SensorFunction) semanticObject); 
				return; 
			case PycomPackage.SENSOR_TYPE:
				sequence_SensorType(context, (SensorType) semanticObject); 
				return; 
			case PycomPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			case PycomPackage.SYSTEM:
				sequence_System(context, (xtext.pycom.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ExpMember returns ActuatorFunction
	 *     Expression returns ActuatorFunction
	 *     Function returns ActuatorFunction
	 *     ActuatorFunction returns ActuatorFunction
	 *
	 * Constraint:
	 *     ((board=[Board|ID] actuatorType=[ActuatorType|ID]) | actuatorType=[ActuatorType|ID])
	 */
	protected void sequence_ActuatorFunction(ISerializationContext context, ActuatorFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActuatorType returns ActuatorType
	 *
	 * Constraint:
	 *     (type=ActuatorName name=ID pins+=Pin?)
	 */
	protected void sequence_ActuatorType(ISerializationContext context, ActuatorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BoardMember returns Actuator
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     (actuatorTypes+=ActuatorType actuatorTypes+=ActuatorType*)
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Board returns Board
	 *
	 * Constraint:
	 *     (name=ID boardMembers+=BoardMember*)
	 */
	protected void sequence_Board(ISerializationContext context, Board semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicExp returns Boolean
	 *     Boolean returns Boolean
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Boolean(ISerializationContext context, xtext.pycom.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Boolean
	 *
	 * Constraint:
	 *     ((value='true' | value='false') (condition=Condition | condition=Condition)?)
	 */
	protected void sequence_Boolean_Condition(ISerializationContext context, xtext.pycom.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalAction returns Boolean
	 *     ExpMember returns Boolean
	 *
	 * Constraint:
	 *     ((value='true' | value='false') (condition=Condition | condition=Condition)? (ExpMembers+=ExpMember+ | ExpMembers+=ExpMember+)?)
	 */
	protected void sequence_Boolean_Condition_ConditionalAction(ISerializationContext context, xtext.pycom.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicExp returns ComparisonExp
	 *     ComparisonExp returns ComparisonExp
	 *
	 * Constraint:
	 *     (left=Expression op=Operator rigth=Expression)
	 */
	protected void sequence_ComparisonExp(ISerializationContext context, ComparisonExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.COMPARISON_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.COMPARISON_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.COMPARISON_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.COMPARISON_EXP__OP));
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.COMPARISON_EXP__RIGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.COMPARISON_EXP__RIGTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonExpAccess().getLeftExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonExpAccess().getOpOperatorParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getComparisonExpAccess().getRigthExpressionParserRuleCall_2_0(), semanticObject.getRigth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns ComparisonExp
	 *
	 * Constraint:
	 *     (left=Expression op=Operator rigth=Expression (condition=Condition | condition=Condition)?)
	 */
	protected void sequence_ComparisonExp_Condition(ISerializationContext context, ComparisonExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalAction returns ComparisonExp
	 *     ExpMember returns ComparisonExp
	 *
	 * Constraint:
	 *     (left=Expression op=Operator rigth=Expression (condition=Condition | condition=Condition)? (ExpMembers+=ExpMember+ | ExpMembers+=ExpMember+)?)
	 */
	protected void sequence_ComparisonExp_Condition_ConditionalAction(ISerializationContext context, ComparisonExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connection returns Connection
	 *
	 * Constraint:
	 *     ((ipAdr=Ipaddress | website=STRING) portnumber=Port)
	 */
	protected void sequence_Connection(ISerializationContext context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpMember returns Function
	 *     Expression returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     board=[Board|ID]
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.FUNCTION__BOARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.FUNCTION__BOARD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getBoardBoardIDTerminalRuleCall_2_0_0_1(), semanticObject.eGet(PycomPackage.Literals.FUNCTION__BOARD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pin returns Pin
	 *
	 * Constraint:
	 *     (power=INT input=INT)
	 */
	protected void sequence_Pin(ISerializationContext context, Pin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.PIN__POWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.PIN__POWER));
			if (transientValues.isValueTransient(semanticObject, PycomPackage.Literals.PIN__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PycomPackage.Literals.PIN__INPUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPinAccess().getPowerINTTerminalRuleCall_0_0(), semanticObject.getPower());
		feeder.accept(grammarAccess.getPinAccess().getInputINTTerminalRuleCall_2_0(), semanticObject.getInput());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpMember returns SensorFunction
	 *     Expression returns SensorFunction
	 *     Function returns SensorFunction
	 *     SensorFunction returns SensorFunction
	 *
	 * Constraint:
	 *     ((board=[Board|ID] sensorType=[SensorType|ID]) | sensorType=[SensorType|ID])
	 */
	protected void sequence_SensorFunction(ISerializationContext context, SensorFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SensorType returns SensorType
	 *
	 * Constraint:
	 *     (type=SensorName name=ID pins+=Pin?)
	 */
	protected void sequence_SensorType(ISerializationContext context, SensorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BoardMember returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (sensorTypes+=SensorType sensorTypes+=SensorType*)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Server returns Server
	 *
	 * Constraint:
	 *     (name=ID conn=Connection exps+=ConditionalAction*)
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     ((boards+=Board+ servers+=Server+) | servers+=Server+)?
	 */
	protected void sequence_System(ISerializationContext context, xtext.pycom.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
