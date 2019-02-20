package dat109.no;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;


/**
 * @author Eivin Sellevold og Cato Robstad
 */
public class Terningspilltester {

	private Terning terning = new Terning(1);
	private Kopp kopp = new Kopp(1);

	/**
	 * Tester man får en verdi mellom 1-6 når man triller
	 */
	@Test
	public void test1() {

		ArrayList<Integer> liste = new ArrayList<Integer>();
		boolean funnet = true;

		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);
		liste.add(6);

		for (int i = 0; i < 100; i++) {
			terning.trill();
			if (!liste.contains(terning.getVerdi())) {
				funnet = false;
			}
		}
		assertTrue(funnet);
	}

	/**
	 * Tester man får en sum mellom 2-12 når man triller kopp
	 */
	@Test
	public void test2() {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		boolean funnet = true;
	
		for(int i = 2; i < 13; i++) {
			liste.add(i);
		}
		for (int j = 0; j < 100; j++) {
			kopp.trill();
			if (!liste.contains(kopp.getSum())) {
				funnet = false;
			}
		}
		assertTrue(funnet);
	}
	
	/**
	 * Sjekker at riktige vinnere blir skrivet ut
	 */
	@Test
	public void test3() {
		
		ArrayList<Spiller> list = new ArrayList<Spiller>();
		
		Spiller spiller1 = new Spiller("Helo");
		Spiller spiller2 = new Spiller("No");
		Spiller spiller3 = new Spiller("Best");
		
		spiller1.setVerdi(300);
		spiller2.setVerdi(100);
		spiller3.setVerdi(-50);
		
		list.add(spiller1);
		list.add(spiller2);
		list.add(spiller3);
		
		String s = "Helo vant med 300 poeng. ";

		assertTrue(s.equals(Terningspill.vinner(list)));
	}
	
	/**
	 * Sjekker at det skriver ut riktig når det er flere vinnere
	 */
	@Test
	public void test4() {
		
		ArrayList<Spiller> list1 = new ArrayList<Spiller>();
		
		Spiller spiller11 = new Spiller("Helo");
		Spiller spiller22 = new Spiller("No");
		Spiller spiller33 = new Spiller("Best");
		
		spiller11.setVerdi(200);
		spiller22.setVerdi(200);
		spiller33.setVerdi(100);
		
		list1.add(spiller11);
		list1.add(spiller22);
		list1.add(spiller33);
		
		String ss = "Helo vant med 200 poeng. No vant med 200 poeng. ";
		
		assertTrue(ss.equals(Terningspill.vinner(list1)));
	}

}

