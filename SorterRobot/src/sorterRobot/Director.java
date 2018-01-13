package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka ohjaimen hallintaan.
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

	/**
	 * Liikuttaa ohjainta oikealle tai vasemmalle direction-parametrin
	 * mukaisesti konstruktorin parametrina saamansa kulman verran.
	 * 
	 * @param direction
	 */
	public void rotate(boolean direction) {
		if (direction) {
			motor.rotateTo(startAngle + angle);
		} else {
			motor.rotateTo(startAngle - angle);
		}
	}

	/**
	 * Palauttaa ohjaimen aloituskulmaan.
	 */
	public void center() {
		motor.rotateTo(startAngle);
	}

}
