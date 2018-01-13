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
	 * Metodi asettaa valosensorin normaaliarvon ja käynnistää sitten ohjelman.
	 * 
	 * @throws InterruptedException
	 */
	public void start() throws InterruptedException {
		System.out.println("Wait for calibration... ");
		beltCtrl.start();
		Thread.sleep(2000);
		reader.setNormal();
		Thread.sleep(1000);
		beltCtrl.stop();
		System.out.print("Done! You can start sorting.");
		run();
	}

	/**
	 * Koko toiminnallisuutta pyörittävä metodi, joka pysäyttää hihnan, jos
	 * havaitaan pala sensorin alla ja kääntää ohjainta sen mukaisesti.
	 */
	public void run() throws InterruptedException {
		beltCtrl.start();

		while (beltCtrl.notStopped()) {
			if (reader.isReadable()) {
				beltCtrl.stop();
				System.out.print("Palan arvo: ");
				reader.printValue();
				director.rotate(reader.isGreaterThanDivider());
				beltCtrl.start();
				Thread.sleep(1000);
			}
		}
		director.center();
	}
}