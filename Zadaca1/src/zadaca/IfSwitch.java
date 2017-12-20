package zadaca;

import javax.swing.JOptionPane;

public class IfSwitch {

	public static void main(String[] args) {

		int mjesec = Integer.parseInt(JOptionPane.showInputDialog("Unesite mjesec"));
		int godina = Integer.parseInt(JOptionPane.showInputDialog("Unesite godinu"));
		int brojDana = 0;

		switch (mjesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			brojDana = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			brojDana = 30;
			break;
		case 2:
			if (((godina % 4 == 0) && !(godina % 100 == 0)) || (godina % 400 == 0))
				brojDana = 29;
			else
				brojDana = 28;
			break;
		default:
			System.out.println("Mjesec ne postoji!");
			break;
		}
		System.out.println("Broj dana u mjesecu = " + brojDana);
	}

}
