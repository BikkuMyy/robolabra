package sorterRobot;

import lejos.nxt.*;

/**
 * Pääohjelma.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		BeltController bc = new BeltController(200, Button.ENTER, Motor.A, new TouchSensor(SensorPort.S1));
		ColorReader cr = new ColorReader(20, 5, new LightSensor(SensorPort.S2, true));
		Director dir = new Director(Motor.B, 40);
		Sorter sorter = new Sorter(bc, cr, dir);
		sorter.run();
	}
}
