package dat109.no;

/**
 * Spiller-klasse.
 * 
 * @author Eivin Sellevold.
 */

public class Spiller {

	private String navn;
	private int verdi;

	/**
	 * Lager spiller
	 * 
	 * @param navn
	 */
	public Spiller(String navn) {
		this.navn = navn;
	}

	/**
	 * Henter navn.
	 * 
	 * @return
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * Setter navn.
	 * 
	 * @param navn
	 */
	public void setNavn(String navn) {
		this.navn = navn;
	}

	/**
	 * Henter verdi.
	 * 
	 * @return verdi.
	 */
	public int getVerdi() {
		return verdi;
	}

	/**
	 * Setter verdi.
	 * 
	 * @param verdi
	 */
	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

	/**
	 * Setter verdien lik summen i koppen.
	 * 
	 * @param kopp
	 */
	public void spill(Kopp kopp) {
		verdi = kopp.getSum();
	}

}
