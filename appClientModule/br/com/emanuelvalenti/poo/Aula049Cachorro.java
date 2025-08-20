package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula049Cachorro extends Aula049Animal {

	public Aula049Cachorro() {
		super(30,"Carne");
	}
	
	
	void enterrarOsso() {
		
	}
	
	void fazerBarulho() {
		
		JOptionPane.showMessageDialog(null, "Au Au!");
	}
}
