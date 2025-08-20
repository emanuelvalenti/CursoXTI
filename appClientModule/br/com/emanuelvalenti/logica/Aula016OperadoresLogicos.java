package br.com.emanuelvalenti.logica;

import javax.swing.*;

public class Aula016OperadoresLogicos {

	public static void main(String[] args) {
		
		
		
		JOptionPane.showMessageDialog(null, "A exressão 2 >= 1 && 2 <= 10 é " + String.valueOf((2 >= 1) && (2 <= 10)));

		JOptionPane.showMessageDialog(null, "A exressão 0 >= 1 && 0 <= 10 é " + String.valueOf((0 >= 1) && (0 <= 10)));

		JOptionPane.showMessageDialog(null, "A exressão 0 >= 1 || 0 <= 10 é " + String.valueOf((0 >= 1) || (0 <= 10)));

		JOptionPane.showMessageDialog(null, "A exressão 0 >= 1 || 11 <= 10 é " + String.valueOf((0 >= 1) || (11 <= 10)));

		JOptionPane.showMessageDialog(null, "A exressão (2 >= 1) é " + String.valueOf((2 >= 1)));

		JOptionPane.showMessageDialog(null, "A exressão !(2 >= 1) é " + String.valueOf(!(2 >= 1)));

	}
}
