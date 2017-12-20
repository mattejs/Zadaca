package zadaca;

import javax.swing.JOptionPane;

public class KalkulatorVrijeme {

	public static void main(String[] args) {

		int sati = 3600;
		int minuta = 60;
		int sekunda = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj sekundi"));

		int h = (sekunda / sati);
		int sum = (h * sati);

		int sum1 = (sekunda - sum);
		int m = (sum1 / minuta);

		int sum2 = (sekunda - sum);
		int s = (sum2 % minuta);

		System.out.print(h);
		System.out.print("h ");

		System.out.print(m);
		System.out.print("min ");

		System.out.print(s);
		System.out.print("sec ");

	}

}