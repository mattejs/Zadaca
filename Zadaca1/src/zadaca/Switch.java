package zadaca;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		

			int mjesec = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj mjeseca"));
	        String imeMjeseca;
	        switch (mjesec) {
	            case 1:  imeMjeseca = "Sijeèanj";
	                     break;
	            case 2:  imeMjeseca = "Veljaèa";
	                     break;
	            case 3:  imeMjeseca = "Ožujak";
	                     break;
	            case 4:  imeMjeseca = "Travanj";
	                     break;
	            case 5:  imeMjeseca = "Svibanj";
	                     break;
	            case 6:  imeMjeseca = "Lipanj";
	                     break;
	            case 7:  imeMjeseca = "srpanj";
	                     break;
	            case 8:  imeMjeseca = "Kolovoz";
	                     break;
	            case 9:  imeMjeseca = "Rujan";
	                     break;
	            case 10: imeMjeseca = "Listopad";
	                     break;
	            case 11: imeMjeseca = "Studeni";
	                     break;
	            case 12: imeMjeseca = "Prosinac";
	                     break;
	            default: imeMjeseca = "Mjesec ne postoji!";
	                     break;
	        }
	        System.out.println(imeMjeseca);
	}
}
