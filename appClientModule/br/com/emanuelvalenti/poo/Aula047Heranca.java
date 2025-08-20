package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula047Heranca {

	
	public static void main (String[] args) {
		
		Aula047Cachorro cachorro = new Aula047Cachorro();
		Aula047Galinha galinha = new Aula047Galinha();
		
		cachorro.comida = "Carne";
		cachorro.dormir();
		
		galinha.dormir();
		
	}
}
