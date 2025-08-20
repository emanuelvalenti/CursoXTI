package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula023IfElse {

	public static void main (String[] args) {
		
	
		Integer idade = 43;
		
		if (idade < 11) {
			JOptionPane.showMessageDialog(null, "É uma criança!!!");
			
		} else if (idade < 21) {
			JOptionPane.showMessageDialog(null, "É um adolescente!!!");
		
		} else {
			JOptionPane.showMessageDialog(null, "É um adulto!!!");
			
		}
		
		if ((idade % 2) == 0) {
			JOptionPane.showMessageDialog(null, "A idade " + String.valueOf(idade) + " é par!!!");
		
		} else {
			JOptionPane.showMessageDialog(null, "A idade " + String.valueOf(idade) + " é impar!!!");
		}
		
	}
	
}
