package zimski;

public class PrviZimski {

	public static void main(String[] args) {

		int[] niz = new int[24];
		int suma = 0;

		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 100);
			System.out.println(niz[i]);
		}

		for (int i : niz) {
			suma += i;
		}

		int najveci = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > najveci) {
				najveci = niz[i];
			}
		}

		int najmanji = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < najmanji) {
				najmanji = niz[i];
			}
		}

		System.out.println("Suma unesenih brojeva je: " + suma);
		System.out.println("Najveci uneseni broj je: " + najveci);
		System.out.println("Najmanji uneseni broj je: " + najmanji);

	}
}