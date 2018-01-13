package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka liukuhihnan toiminnan säätelyyn.
 */

public class BeltController {

	private Button stopButton;
	private NXTRegulatedMotor motor;

	public BeltController(int speed, Button stop, NXTRegulatedMotor motor) {
		this.stopButton = stop;
		this.motor = motor;
		this.motor.setSpeed(speed);
	}

	/**
	 * Metodi ilmoittaa, jos liukuhihna pysäytetään.
	 * 
	 * @return boolean palauttaa false, kun hihna pysäytetään, muuten true.
	 */
	public boolean notStopped() {
		if (stopButton.isPressed()) {
			return false;
		}
		return true;
	}

	/**
	 * Pysäyttää liukuhihnan.
	 */
	public void stop() {
		motor.stop();
	}

	/**
	 * Käynnistää liukuhihnan.
	 */
	public void start() {
		motor.backward();
	}
}
