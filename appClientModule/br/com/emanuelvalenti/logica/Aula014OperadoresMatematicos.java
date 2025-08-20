package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula014OperadoresMatematicos {



	public static void main (String[] args) {

		
		int x ,y ;
		
		JOptionPane.showInternalMessageDialog(null, "módulo de 10 / 5 é " + String.valueOf(10 % 5));
		
		JOptionPane.showInternalMessageDialog(null, "11 é  par? " + String.valueOf((11 % 2 == 0) ? "SIM" : "NÃO") );
		
		
		x = 5;
		
		y = --x;
		
		JOptionPane.showInternalMessageDialog(null, "valor de x " + x + " e " + "Valor de y " + y);
		
		y = x--;
		
		JOptionPane.showInternalMessageDialog(null, "valor de x " + x + " e " + "Valor de y " + y);

		x = 10;
		
		y = ++x;
		
		JOptionPane.showInternalMessageDialog(null, "valor de x " + x + " e " + "Valor de y " + y);
		
		y = ++x;
		
		JOptionPane.showInternalMessageDialog(null, "valor de x " + x + " e " + "Valor de y " + y);
		
		
	}
}
