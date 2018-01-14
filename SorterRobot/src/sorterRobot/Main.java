package sorterRobot;

import lejos.nxt.*;

/**
 * Pääohjelma.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		BeltController beltCtrl = new BeltController(200, Button.ENTER, Motor.A);
		ColorReader colorReader = new ColorReader(30, 5, new LightSensor(SensorPort.S1, true));
		Director director = new Director(Motor.B, 40);
		Sorter sorter = new Sorter(beltCtrl, colorReader, director);
		sorter.start();
	}
}
