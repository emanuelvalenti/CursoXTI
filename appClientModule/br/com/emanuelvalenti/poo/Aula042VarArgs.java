package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula042VarArgs {

	
	public static void main(String[] args) {
		
		Aula042Matematica matematica = new Aula042Matematica();
		
		JOptionPane.showMessageDialog(null, "A soma dos valores é " + matematica.soma("10,41,20,30",10,41,20,30));
		
	}
}
