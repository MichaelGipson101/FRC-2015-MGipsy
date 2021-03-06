package org.team708.robot.subsystems;


import org.team708.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


public class HockeyStick extends Subsystem {

	//Hockey stick solenoid
	private final DoubleSolenoid hockeySolenoid;
		//Extended Solenoid
		public final DoubleSolenoid.Value DEPLOYED = DoubleSolenoid.Value.kForward;
		//Retracted Solenoid
		public final DoubleSolenoid.Value RETRACTED = DoubleSolenoid.Value.kReverse;
		public HockeyStick() {
		//Create the solenoid for the hockey stick piston
		hockeySolenoid = new DoubleSolenoid(RobotMap.hockeySolenoidA, RobotMap.hockeySolenoidB);
		
	}
	public void initDefaultCommand() {
		
	}
	//extends the hockey solenoid
	public void deployHockey(){
		hockeySolenoid.set(DEPLOYED);
	}
	
	//retracts the hockey solenoid
	public void retractHockey(){
		hockeySolenoid.set(RETRACTED);
	}
	
	public DoubleSolenoid.Value getSolenoidValue() {
		return hockeySolenoid.get();
	}
	
}
