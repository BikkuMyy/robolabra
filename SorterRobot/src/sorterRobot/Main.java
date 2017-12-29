package sorterRobot;

import lejos.nxt.*;

/**
 * Pääohjelma.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		TouchSensor sensor = new TouchSensor(SensorPort.S1);
		BeltController bc = new BeltController(1000, Button.ENTER, Motor.A, sensor);
		bc.runBelt();
	}
}
