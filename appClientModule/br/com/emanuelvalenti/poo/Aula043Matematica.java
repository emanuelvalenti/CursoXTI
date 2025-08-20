package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula043Matematica {
	
	double media (double num1, double num2){
		
		JOptionPane.showMessageDialog(null, "Assinatura 1");
		return (num1 + num2) / 2; 
	}

	
	double media (double num1, double num2, double num3){
		
		JOptionPane.showMessageDialog(null, "Assinatura 2");
		return (num1 + num2 + num3) / 3; 
	}

	double media (String num1, String num2){
		
		JOptionPane.showMessageDialog(null, "Assinatura 3 de Strings");
		return (Double.valueOf(num1) + Double.valueOf(num2)) / 2; 
	}
	
	double media (double ... num1){
		
		JOptionPane.showMessageDialog(null, "Assinatura 4 quantidade variável");
		
		double soma = 0;
		
		for (double d : num1) {
			
			soma += d;
		}
		
		return soma / num1.length; 
	}
	
	
}
