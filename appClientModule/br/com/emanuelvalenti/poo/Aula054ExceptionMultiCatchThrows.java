package br.com.emanuelvalenti.poo;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Aula054ExceptionMultiCatchThrows {

	public static void dividir() throws InputMismatchException, ArithmeticException, NumberFormatException {

		int valor = Integer.valueOf(JOptionPane.showInputDialog("Informe um valor:"));
		int divisor = Integer.valueOf(JOptionPane.showInputDialog("Informe um divisor:"));

		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (valor / divisor));

	}

	public static void main(String[] args) {

		// Exemplo de multi catch

		boolean loop = true;

		do {
			try {

				int valor = Integer.valueOf(JOptionPane.showInputDialog("Informe um valor:"));
				int divisor = Integer.valueOf(JOptionPane.showInputDialog("Informe um divisor:"));

				JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (valor / divisor));

				loop = false;

			} catch (InputMismatchException | ArithmeticException | NumberFormatException e) {

				if (e.getMessage().contains("null")) {
					loop = false;
				} else {
					JOptionPane.showMessageDialog(null, "Número inválido");
					// JOptionPane.showMessageDialog(null, e.printStackTrace()); //apenas em console
					JOptionPane.showMessageDialog(null, e.getStackTrace());
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}

		} while (loop);

		// Exemplo de throws

		loop = true;

		do {
			try {

				dividir();

				loop = false;

			} catch (InputMismatchException | ArithmeticException | NumberFormatException e) {

				if (e.getMessage().contains("null")) {
					loop = false;
				} else {
					JOptionPane.showMessageDialog(null, "Número inválido");
					// JOptionPane.showMessageDialog(null, e.printStackTrace()); //apenas em console
					JOptionPane.showMessageDialog(null, e.getStackTrace());
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}

		} while (loop);

	}
}
