package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

//public class Aula051Poodle extends Aula051Cachorro { não pode herdaar pois cachorro está como final
public class Aula051Poodle extends Aula051Animal{

	@Override
	void fazerbarulho() {
		JOptionPane.showMessageDialog(null, "Au, Au!");
		
	}

}
