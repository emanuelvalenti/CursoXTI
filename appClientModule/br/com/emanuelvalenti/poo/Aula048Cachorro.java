package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula048Cachorro extends Aula048Animal{

	double peso;
	
	public Aula048Cachorro() {
		super(30,"Carne");
		
		this.peso = super.peso; //meramente ilustrativo, this é da classe super é da superclasse
		JOptionPane.showMessageDialog(null, super.subserial);
	}
}
