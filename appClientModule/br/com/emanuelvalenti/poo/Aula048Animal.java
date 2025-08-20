package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula048Animal {

	private int serial; //será apenas visivel nesta superclasse, suas heranças não terão acesso a esta propriedade
	protected int subserial; //será apenas visivel nesta superclasse e suas heranças.
	double peso;
	String comida;
	
	
	public Aula048Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	
	void dormir() {
		JOptionPane.showMessageDialog(null, "Dormiu");
	}
	
	void fazerBarulho() {
		JOptionPane.showMessageDialog(null, "Fazer barulho");
	}
	
}
