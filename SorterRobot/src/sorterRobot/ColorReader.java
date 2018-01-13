package sorterRobot;

import lejos.nxt.*;

/**
 * Luokka värin määrittämiseen valosensorilla.
 * 
 */
public class ColorReader {

	private LightSensor lightSensor;
	private int divider;
	private int normal;
	private int threshold;

	public ColorReader(int divider, int threshold, LightSensor sensor) {
		this.lightSensor = sensor;
		this.divider = divider;
		this.threshold = threshold;
		lightSensor.calibrateHigh();
	}

	/**
	 * Metodi määrittää, onko sensorin alla jotain "luettavaa".
	 * 
	 * @return boolean true/false
	 */
	public boolean isReadable() {
		return lightSensor.readValue() > normal + threshold;
	}

	/**
	 * Tulostaa sensorin lukeman NXT:n näytölle-
	 */
	public void printValue() {
		System.out.println(lightSensor.readValue());
	}

	/**
	 * Määrittää, onko sensorin lukema suurempi, kuin annettu raja väriryhmien
	 * välillä.
	 */
	public boolean isGreaterThanDivider() {
		return lightSensor.readValue() > this.divider;
	}

	/**
	 * Asettaa normaaliksi sensorin senhetkisen arvon.
	 */
	public void setNormal() {
		System.out.println(lightSensor.readValue());
		this.normal = lightSensor.readValue();
	}
	
	public void calibrateReader(BeltController beltCtrl) throws InterruptedException{
		beltCtrl.start();
		Thread.sleep(500);
		setNormal();
		beltCtrl.stop();
	}

}
