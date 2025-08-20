package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula042Matematica {

	/**
	 * 
	 * @param numeros os ... cria uma lista de números que pode variar conforme o método é invocado
	 * @return
	 */
	double soma(String valoresNumeros, double ... numeros) { //pode haver mais parametos, mas os parametros variaveis devem sempre ser os últimos a serem informados
		
		double somaNumeros = 0;
		
		for (double i : numeros) {
			
			 somaNumeros += i;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os valores informados são " + valoresNumeros);
		
		return somaNumeros;
		
	}
}
