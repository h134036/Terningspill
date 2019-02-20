package dat109.no;

import java.util.ArrayList;

/**
 * Terningspill-klasse.
 * 
 * @author Eivin Sellevold.
 */
public class Terningspill {

	private Integer id;
	private static Kopp kopp;
	private static ArrayList<Spiller> spillerListe;

	/**
	 * Oppretter ett terningspill med en kopp og en tom spillerliste.
	 */
	public Terningspill() {
		kopp = new Kopp(1);
		spillerListe = new ArrayList<Spiller>();
	}

	/**
	 * Legger til spiller i listen.
	 * 
	 * @param navn
	 */
	public void leggTilSpiller(String navn) {
		spillerListe.add(new Spiller(navn));
	}

	/**
	 * Skriver ut vinnerne
	 * 
	 * @param liste
	 */
	public static String vinner(ArrayList<Spiller> liste) {
		ArrayList<Spiller> vinnere = new ArrayList<>();
		Integer mest = 0;

		// finner det tallet som er høyest
		for (int j = 0; j < liste.size(); j++) {
			if (liste.get(j).getVerdi() >= mest) {
				mest = liste.get(j).getVerdi();
			}
		}
		
		// putter de som har det tallet inn i listen vinnere
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getVerdi() == mest) {
				vinnere.add(liste.get(i));
			}
		}
		
		String s = "";
		for (int o = 0; o < vinnere.size(); o++) {
			s += (vinnere.get(o).getNavn() + " vant med " + vinnere.get(o).getVerdi() + " poeng. ");
		}
		return s;
	}

	public static void main(String[] args) {
		Terningspill lagSpill = new Terningspill();
		lagSpill.leggTilSpiller("Eivin");
		lagSpill.leggTilSpiller("Cato");
		lagSpill.leggTilSpiller("Helene");

		/**
		 * Alle spillere spiller hver sin runde og får tilordnet en sum.
		 */
		for (Spiller spiller : spillerListe) {
			kopp.trill();
			spiller.spill(kopp);
		}

		/**
		 * Sjekker hvem som har vunnet, og skriver ut vinner(ne).
		 */
		System.out.println(vinner(spillerListe));
		System.out.println();
		String ss = "Helo vant med 200 poeng. " + "No vant med 200 poeng. " + "Best vant med 200 poeng. ";
		System.out.println(ss);

	}
}
