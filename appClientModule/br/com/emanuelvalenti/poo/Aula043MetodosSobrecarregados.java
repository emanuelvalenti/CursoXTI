package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula043MetodosSobrecarregados {

	public static void main(String[] Args) {
		
		Aula043Matematica matematica = new Aula043Matematica();
		
		
		JOptionPane.showMessageDialog(null, "A média dos números 50 e 70 é " + matematica.media(50, 70));

		JOptionPane.showMessageDialog(null, "A média dos números 50, 70 e 90 é " + matematica.media(50, 70, 90));
		
		JOptionPane.showMessageDialog(null, "A média dos números \"100\" e \"150\" é " + matematica.media("100", "150"));

		JOptionPane.showMessageDialog(null, "A média dos números 12,32,500,687,1212 é " + matematica.media(12,32,500,687,1212));
		
		
		
	}
	
}
