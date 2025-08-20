package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

class Aula041MetodosEstaticos {

	public static void main(String[] args) {
		
		
		Aula041Galinha galinha1 = new Aula041Galinha();

		galinha1.botar().botar().botar();
		
		JOptionPane.showMessageDialog(null, "A galinha1 colocou " + galinha1.ovos + " ovos.");

		Aula041Galinha galinha2 = new Aula041Galinha();
		
		galinha2.botar().botar();
		
		JOptionPane.showMessageDialog(null, "A galinha2 colocou " + galinha2.ovos + " ovos.");
		
		JOptionPane.showMessageDialog(null, "total da granja foram de " + Aula041Galinha.ovosDaGranja + " ovos.");
		
		JOptionPane.showMessageDialog(null, "A media de ovos da granja é " + Aula041Galinha.mediaOvosDaGranja(2) + " .");
		
		
	}
	
}
