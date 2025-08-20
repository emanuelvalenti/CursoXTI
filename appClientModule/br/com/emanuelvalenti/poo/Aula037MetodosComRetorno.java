package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula037MetodosComRetorno {

	public void Aula036MetodosComParametros() {

	}

	public static void main(String[] args) {

		Aula037Matematica matematica = new Aula037Matematica();

		JOptionPane.showMessageDialog(null, "O maior valor de 10 e 20 é? " + matematica.maior(10, 20));

		JOptionPane.showMessageDialog(null, "O a soma dos valores de 10 e 20 é? " + matematica.soma(10, 20));

		JOptionPane.showMessageDialog(null,
				"O a soma dos marios valores pares entre (2,4) e de valores impares entre (3,5) é? "
						+ matematica.soma(Double.valueOf(matematica.maior(2, 4)), Double.valueOf(matematica.maior(3, 5))));

	}

}
