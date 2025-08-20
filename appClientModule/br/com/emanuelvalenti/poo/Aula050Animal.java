package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

abstract class Aula050Animal {

	double peso;
	String comida;
	
	void dormir() {
		JOptionPane.showMessageDialog(null, "Dormindo");
	}
	
	abstract void fazerBarulho();
	
}
