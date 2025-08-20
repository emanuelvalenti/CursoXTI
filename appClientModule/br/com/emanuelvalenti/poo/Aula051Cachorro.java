package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public final class Aula051Cachorro extends Aula051Animal { //com o final nenhuma outra classe poderá herdar dessa

	@Override
	void fazerbarulho() {
		JOptionPane.showMessageDialog(null, "Au, Au!");
		
	}
	
	/*
	 * não pode ser sobre-escrito, na classe animal esse método está como final
	void respirar() {
		
	}
	*/

}
