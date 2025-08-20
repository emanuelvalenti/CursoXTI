package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula017OperadoresAtribuicao {

	
	public static void main (String[] args) {
		
		int x = 6;
		
		x += 3; //operador de atribuição de adição, mesma coisa que x = x + 3;
		
		JOptionPane.showMessageDialog(null, "x é igual a " + x);
		
		x -= 3; //operador de atribuição de subtração, mesma coisa que x = x - 3;
		
		JOptionPane.showMessageDialog(null, "x é igual a " + x);
		
		x *= 3; //operador de atribuição de multiplicação, mesma coisa que x = x * 3;
		
		JOptionPane.showMessageDialog(null, "x é igual a " + x);
				
		x /= 3; //operador de atribuição de divisão, mesma coisa que x = x / 3;
		
		JOptionPane.showMessageDialog(null, "x é igual a " + x);

		x %= 3; //operador de atribuição de módulo, mesma coisa que x = x % 3;
		
		JOptionPane.showMessageDialog(null, "x é igual a " + x);
		
		
	}
}
