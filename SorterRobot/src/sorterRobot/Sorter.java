package sorterRobot;

/**
 * Luokka lajittelurobotin toiminnan hallintaan.
 */
public class Sorter {

	private BeltController beltCtrl;
	private ColorReader reader;
	private Director director;

	public Sorter(BeltController ctrl, ColorReader reader, Director director) {
		this.beltCtrl = ctrl;
		this.reader = reader;
		this.director = director;
	}

	/**
	 * Koko toiminnallisuutta pyörittävä metodi, tällä hetkellä pysäyttää
	 * hihnan, jos havaitaan pala sensorin alla.
	 */
	public void run() throws InterruptedException {
		//reader.setNormal();

		while (beltCtrl.runBelt()) {

			if (reader.readable()) {
				beltCtrl.stop();
				reader.value();
				director.rotate(reader.greaterThanDivider());
				beltCtrl.start();
				Thread.sleep(750);
			}
		}
		director.center();
	}
}
