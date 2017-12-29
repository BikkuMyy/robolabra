package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka liukuhihnan toiminnan saatelyyn.
 */

public class BeltController {

	private int speed;
	private Button stopButton;
	private NXTRegulatedMotor m1;
	private TouchSensor ts;
	private boolean running;

	public BeltController(int speed, Button stop, NXTRegulatedMotor motor,
			TouchSensor sensor) {
		this.speed = speed;
		this.stopButton = stop;
		this.m1 = motor;
		this.ts = sensor;
		this.running = false;
	}

	/**
	 * Metodi vastaa liukuhihnan liikkumisesta ja pysähtymisestä.
	 */
	public void runBelt() {
		m1.setSpeed(speed);
		this.running = true;

		while (true) {
			m1.backward();
			if (stopButton.isPressed()) {
				break;
			}
			if (ts.isPressed()) {
				pauseBelt();
			}
		}
	}

	/**
	 * Apumetodi, joka joko käynnistää tai pysäyttää liukuhihnan.
	 */
	public void pauseBelt() {
		if (running) {
			m1.stop();
			running = false;
		} else {
			m1.backward();
			running = true;
		}

	}

}
