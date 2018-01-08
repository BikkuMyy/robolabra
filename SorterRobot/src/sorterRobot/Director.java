package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka ohjaimen hallintaan
 *
 */
public class Director {

	NXTRegulatedMotor motor;
	int startAngle;
	int angle;
	
	public Director(NXTRegulatedMotor motor, int angle) {
		this.motor = motor;
		motor.resetTachoCount();
		this.startAngle = 0;
		this.angle = angle;
	}
	
	public void rotate(boolean direction){
		if (direction){
			motor.rotateTo(startAngle + angle);
		} else {
			motor.rotateTo(startAngle - angle);
		}
	}
	
	public void center(){
		motor.rotateTo(startAngle);
	}
	
	
	
	
}
