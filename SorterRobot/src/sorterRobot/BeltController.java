package sorterRobot;

import lejos.nxt.*;


public class BeltController {

	private int speed;
	private Button stopButton;
	private NXTRegulatedMotor m1;
	private TouchSensor ts;
	
	public BeltController(int speed, Button stop, NXTRegulatedMotor motor, TouchSensor sensor) {
		this.speed = speed;
		this.stopButton = stop;
		this.m1 = motor;
		this.ts = sensor;
	}
	
	public void runBelt(){
		m1.setSpeed(speed);
		boolean running = true;
		
		while(true){
			if(stopButton.isPressed()){
				break;
			}
			
			m1.backward();
			
			if (ts.isPressed()){
				if (running){
					m1.stop();
					running = false;
				} else {
					m1.backward();
					running = true;
				}
			}
		}
	}
}
