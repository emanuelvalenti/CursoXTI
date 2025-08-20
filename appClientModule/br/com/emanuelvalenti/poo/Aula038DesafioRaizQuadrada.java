package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula038DesafioRaizQuadrada {
	
	public static void main(String[] args) {
		
		Integer valorDigitado = Integer.valueOf(JOptionPane.showInputDialog("Informe um número para verificar a parte inteira da raiz quadrada através do médo de PELL"));
		
		if (valorDigitado <= 0) {
			JOptionPane.showMessageDialog(null, "Informe apenas valores inteiros maiores que zero");
		} else {
			JOptionPane.showMessageDialog(null, "Da raiz quadrada de " + valorDigitado + ", a parte inteira é " + Aula038RaizQuadrada.raizQuadradaPell(valorDigitado) );
			JOptionPane.showMessageDialog(null, "Da raiz quadrada pela classe math é " + Math.sqrt(valorDigitado));
			
		}
		
		
	}

}
