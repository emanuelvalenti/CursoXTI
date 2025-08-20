package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula052PolimorfismoInterfaces {

	public static void main(String[] args) {
		
		Aula052Quadrado objetoQuadrado = new Aula052Quadrado(2);
		// A interface Aula052AreaCalculavel é um tipo de dado, sendo assim é possivel atribuir um objeto sendo do mesmo tipo.
		Aula052AreaCalculavel tipoAreaCaculave = objetoQuadrado; 

		Aula052Cubo objetoCubo = new Aula052Cubo(3);
		// A interface Aula052AreaCalculavel é um tipo de dado, sendo assim é possivel atribuir um objeto sendo do mesmo tipo.
		Aula052VolumeCalculavel tipoCalculeVolume = objetoCubo;
		
		JOptionPane.showMessageDialog(null, "Área de um quadrado de lado 2 é " + String.valueOf(objetoQuadrado.calculaArea()));
		JOptionPane.showMessageDialog(null, "Área de um quadrado de lado 2 é " + String.valueOf(tipoAreaCaculave.calculaArea()));
		JOptionPane.showMessageDialog(null, "Área de um cubo de lado 3 é " + String.valueOf(objetoCubo.calculaArea()));
		JOptionPane.showMessageDialog(null, "Volume de um cubo de lado 3 é " + String.valueOf(objetoCubo.calculaVolume()));
		JOptionPane.showMessageDialog(null, "Volume de um cubo de lado 3 é " + String.valueOf(tipoCalculeVolume.calculaVolume()));
		
		Aula052Galinha galinha = new Aula052Galinha(6);

		galinha.fazerBarulho();
		
		JOptionPane.showMessageDialog(null, "O volume da galinha é: " + galinha.calculaVolume());
		
		
	}
}
