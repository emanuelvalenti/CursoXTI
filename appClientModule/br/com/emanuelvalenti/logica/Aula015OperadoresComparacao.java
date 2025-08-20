package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula015OperadoresComparacao {

	public static void main(String[] args) {
		
		int x = 6;
		
		
		JOptionPane.showMessageDialog(null, "O valor de x é igual a 6 " + String.valueOf(x == 6 ? "SIM" : "NÃO"));
		
		JOptionPane.showMessageDialog(null, "O valor de x é igual a 7 " + String.valueOf(x == 7 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor de x é diferente de 6 " + String.valueOf(x != 6 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor de x é diferente de 7 " + String.valueOf(x != 7 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor 5 é maior do que 7 " + String.valueOf(5 > 7 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor 10 é maior do que 7 " + String.valueOf(10 > 7 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor 5 é menor do que 7 " + String.valueOf(5 < 7 ? "SIM" : "NÃO"));

		JOptionPane.showMessageDialog(null, "O valor 10 é menor do que 7 " + String.valueOf(10 < 7 ? "SIM" : "NÃO"));
		
		JOptionPane.showMessageDialog(null, "O valor 5 é maior ou igual a 7 " + String.valueOf(5 >= 7 ? "SIM" : "NÃO"));
		
		JOptionPane.showMessageDialog(null, "O valor 7 é maior ou igual a 7 " + String.valueOf(7 >= 7 ? "SIM" : "NÃO"));
		
		JOptionPane.showMessageDialog(null, "O valor 5 é menor ou igual a 7 " + String.valueOf(5 <= 7 ? "SIM" : "NÃO"));
		
		JOptionPane.showMessageDialog(null, "O valor 7 é menor ou igual a 7 " + String.valueOf(7 <= 7 ? "SIM" : "NÃO"));
		
		String w = "sim";
		
		JOptionPane.showMessageDialog(null, "O w é uma instance de String " + String.valueOf(w instanceof String ? "SIM" : "NÃO"));
		
		
		
	}
}
