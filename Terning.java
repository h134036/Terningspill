package dat109.no;

import java.util.Random;

/**
 * Terning-klasse.
 * 
 * @author Eivin Sellevold
 */
public class Terning {
	
	private Random rand = new Random();
	private Integer id;
	private int verdi;

	/**
	 * Lager en terning
	 */
	public Terning(int id) {
		this.verdi = 0;
		this.id = id;
	}

	/**
	 * Henter id.
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Triller terningen.
	 */
	public final void trill() {
		verdi = rand.nextInt(6) + 1;
	}

	/**
	 * Henter verdien.
	 * 
	 * @return verdien
	 */
	public final int getVerdi() {
		return verdi;
	}
}