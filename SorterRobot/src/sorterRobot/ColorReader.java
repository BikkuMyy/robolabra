package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka värin määrittämiseen valosensorilla.
 * 
 */
public class ColorReader {

	private LightSensor ls;
	private int divider;
	private int normal;
	private int threshold;

	public ColorReader(int divider, int threshold, LightSensor sensor) {
		this.ls = sensor;
		this.divider = divider;
		this.threshold = threshold;
		ls.calibrateLow();
		this.normal = 8;
	}

	/**
	 * Metodi määrittää, onko sensorin alla jotain "luettavaa".
	 * 
	 * @return boolean true/false
	 */
	public boolean readable() {
		return ls.readValue() > normal + threshold;
	}

	/**
	 * Tulostaa sensorin lukeman NXT:n näytölle-
	 */
	public void value() {
		System.out.println(ls.readValue());
	}

	/**
	 * Määrittää, onko sensorin lukema suurempi, kuin annettu raja väriryhmien
	 * välillä.
	 */
	public boolean greaterThanDivider() {
		return ls.readValue() > this.divider;
	}

	/**
	 * Asettaa normaaliksi sensorin senhetkisen arvon.
	 */
	public void setNormal() {
		System.out.println(ls.readValue());
		this.normal = ls.readValue();
	}

}
