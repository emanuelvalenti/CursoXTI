package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula029Fibonacci {

	public static void main (String[] args) {
		
		Integer primeiro = 0, segundo = 1;
		
		String sequencia = ""; 
		
		while(segundo < 60) {
			
			if (primeiro == 0) {
				sequencia += primeiro.toString() + ", " + segundo.toString() + ", ";
			} else {
				sequencia += segundo.toString() + ", ";
				
			}
					
			segundo = primeiro + segundo;
			primeiro = segundo - primeiro;
			
		}
		
		sequencia = "Sequencia de Fibonacci: " + sequencia;
		
		JOptionPane.showMessageDialog(null, sequencia);
		
	}
}
