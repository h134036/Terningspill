package dat109.no;

/**
 * Kopp-klasse.
 * 
 * @author Eivin Sellevold.
 */
public class Kopp {

	private Integer id;
	private int sum;
	private Terning terning1;
	private Terning terning2;

	/**
	 * Oppretter en kopp med 2 terninger.
	 * 
	 * @param id
	 */
	public Kopp(Integer id) {
		this.id = id;
		terning1 = new Terning(1);
		terning2 = new Terning(2);
	}

	/**
	 * Henter id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Henter sum.
	 * 
	 * @return sum.
	 */
	public int getSum() {
		return sum;
	}

	/**
	 * Triller begge terningene og legger verdiene inn i sum.
	 */
	public void trill() {
		terning1.trill();
		terning2.trill();
		sum = terning1.getVerdi() + terning2.getVerdi();
	}

}
