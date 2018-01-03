package sorterRobot;

import lejos.nxt.*;

/**
 * Pääohjelma.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		BeltController bc = new BeltController(200, Button.ENTER, Motor.A, new TouchSensor(SensorPort.S1));
		Sorter sorter = new Sorter(bc, new ColorReader(45, 10, new LightSensor(SensorPort.S2, true)));
		sorter.run();
	}
}
