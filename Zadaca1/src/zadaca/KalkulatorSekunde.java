package zadaca;

import javax.swing.JOptionPane;

public class KalkulatorSekunde {

	public static void main(String[] args) {

		int brojMinuta = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj minuta"));
		int brojSati = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj sati"));

		int brojSekunda = (brojMinuta * 60) + (brojSati * 3600);

		System.out.println(brojSekunda + " Sekundi");

	}

}