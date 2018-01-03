package sorterRobot;

/**
 * Luokka lajittelurobotin toiminnan hallintaan.
 */
public class Sorter {

	private BeltController beltCtrl;
	private ColorReader reader;

	public Sorter(BeltController ctrl, ColorReader reader) {
		this.beltCtrl = ctrl;
		this.reader = reader;
	}

	/**
	 * Koko toiminnallisuutta pyörittävä metodi, tällä hetkellä pysäyttää
	 * hihnan, jos havaitaan pala sensorin alla.
	 */
	public void run() throws InterruptedException {
		reader.setNormal();

		while (beltCtrl.runBelt()) {

			if (reader.readable()) {
				beltCtrl.stop();
				reader.value();
				Thread.sleep(500);
				beltCtrl.start();
				Thread.sleep(500);
			}
			// turn guider to correct way before starting belt again
		}
	}
}
