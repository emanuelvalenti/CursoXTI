package br.com.emanuelvalenti.poo;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Aula053ExceptionTryCatchFinally {

	public static void main(String[] args) {

		boolean varLoop = true;

		do {

			try {

				int valor = Integer.valueOf(JOptionPane.showInputDialog("informe um valor:"));
				int divisor = Integer.valueOf(JOptionPane.showInputDialog("informe um divisor:"));

				JOptionPane.showMessageDialog(null, "Resultado " + String.valueOf(valor / divisor));

				varLoop = false;

			} catch (InputMismatchException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (ArithmeticException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				if (e1.getMessage().equals("Cannot parse null string")) {
					varLoop = false;
				}
			} finally {

				/*
				 * usado para limpar variaveis, fechar conexões streams de dados etc
				 */
				JOptionPane.showMessageDialog(null, "No bloco finally, os códigos sempre serão executados!");
			}

		} while (varLoop);

	}
}
