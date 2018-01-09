package zimski;

import javax.swing.JOptionPane;

public class TreciZimski {

	public static void main(String[] args) {

		long a = Long.parseLong(JOptionPane.showInputDialog("Unesite prvi broj"));
		long b = Long.parseLong(JOptionPane.showInputDialog("Unesite drugi broj"));
		long i = 0;
		long num = 0;

		String primBrojevi = "";

		for (i = a; i <= b; i++) {
			long brojac = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					brojac = brojac + 1;
				}
			}
			if (brojac == 2) {
				primBrojevi = primBrojevi + i + " ";
			}
		}
		System.out.println("Prim brojevi izmeðu " + a + " i " + b + " su: ");
		System.out.println(primBrojevi);
	}
}