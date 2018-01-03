package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka liukuhihnan toiminnan säätelyyn.
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
	 * Metodi vastaa liukuhihnan liikkumisesta ja pysähtymisestä jos painetaan
	 * kosketussensoria tai pysäytysnappia.
	 * 
	 * @return boolean palauttaa false, kun hihna pysäytetään kokonaan.
	 */
	public boolean runBelt() {
		m1.setSpeed(speed);
		this.running = true;
		m1.backward();
		if (stopButton.isPressed()) {
			return false;
		}
		if (ts.isPressed()) {
			pauseBelt();
		}
		return true;
	}

	/**
	 * Apumetodi, joka joko käynnistää tai pysäyttää liukuhihnan.
	 */
	public void pauseBelt() {
		if (running) {
			stop();
		} else {
			start();
		}
	}

	/**
	 * Pysäyttää liikkuvan liukuhihnan.
	 */
	public void stop() {
		if (running) {
			m1.stop();
			running = false;
		}
	}

	/**
	 * Käynnistää pysäytetyn liukuhihnan.
	 */
	public void start() {
		if (!running) {
			m1.backward();
			running = true;
		}
	}

}
