package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;


public class Aula048HerancaConstrutor {

	public static void main(String[] args) {
		
		Aula048Cachorro cachorro = new Aula048Cachorro();
		Aula048Galinha galinha = new Aula048Galinha();
		
		cachorro.comida = "Carne";
		cachorro.dormir();
		
		galinha.dormir();
		
		
		
		
		JOptionPane.showMessageDialog(null, "cachorro é uma instancia de Aula048Cachorro? " + String.valueOf(cachorro instanceof Aula048Cachorro));
		
		JOptionPane.showMessageDialog(null, "cachorro é uma instancia de Aula048Animal? " + String.valueOf(cachorro instanceof Aula048Animal));

		JOptionPane.showMessageDialog(null, cachorro.toString());

		
	}
	
}
