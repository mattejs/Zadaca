package zadaca;

import javax.swing.JOptionPane;

public class If {
	public static void main(String[] args) {

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		
		if(broj%2==0) {
			System.out.println("Paran broj");
		}
		
		else {
			System.out.println("Neparan broj");
		}

	}
}
