package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula018OperadoresEspeciais {

	public static void main (String[] args) {
		
		int idade = 6;
		
		JOptionPane.showMessageDialog(null, idade >= 18 ? "maior de idade": "menor de idade");
		
		idade = 26;
		
		JOptionPane.showMessageDialog(null, idade >= 18 ? "maior de idade": "menor de idade");
		
		String sexo = "M", pais = "Brasil";
		
		JOptionPane.showMessageDialog(null, sexo);

		JOptionPane.showMessageDialog(null, pais);
		
		//Diametro de circulo
		
		Double raio = 10.0, diametro = 2.0 * raio;
		
		
		Double circunferencia = 2 * Math.PI * raio;
		
		JOptionPane.showMessageDialog(null, "Diametro é " + diametro.toString());
		
		JOptionPane.showMessageDialog(null, "circunferencia é " + circunferencia.toString());
		
		Double area = Math.PI * Math.pow(raio, 2.0);
		
		JOptionPane.showMessageDialog(null, "área é " + area.toString());

	}
	
}
