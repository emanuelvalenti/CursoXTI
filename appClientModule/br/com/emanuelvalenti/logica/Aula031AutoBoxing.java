package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula031AutoBoxing {

	public static void main(String[] args) {

		// como era feito antes da versão 5 do java a incrementação de um valor de
		// classe Wrapper

		/*
		 * Integer x = new Integer(555); //empacotado int a = x.intValue();
		 * //desempacotar a++; //incrementa x = new Integer(a); //re-empacotar
		 * System.out.println(x.intValue()); //exibir o valor do empacotamento
		 */

		// atualmente

		Integer x = 555;
		x++; // desempacotando, incrementa, re-empacota
		JOptionPane.showMessageDialog(null, x);

	}

}
