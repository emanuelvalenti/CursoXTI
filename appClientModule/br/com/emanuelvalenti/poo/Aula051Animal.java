package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public abstract class Aula051Animal {

	void dormir() {
		JOptionPane.showMessageDialog(null, "Dormiu");
	}
	
	final void respirar() {
		JOptionPane.showMessageDialog(null, "Respirando");
		
	}
	
	abstract void fazerbarulho();
	
}
