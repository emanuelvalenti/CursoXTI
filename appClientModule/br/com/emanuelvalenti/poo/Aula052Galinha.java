package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula052Galinha extends Aula052Animal implements Aula052VolumeCalculavel{
	
	double lado;
	
	public Aula052Galinha(double lado) {
		this.lado = lado;
	}
	
	
	void fazerBarulho() {
		
		JOptionPane.showMessageDialog(null, "Có, Có!");
	}

	@Override
	public double calculaVolume() {
		
		return 6 * (this.lado * this.lado);
	}

}
