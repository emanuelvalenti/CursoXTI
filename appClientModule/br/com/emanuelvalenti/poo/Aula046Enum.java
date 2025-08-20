package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula046Enum {
	
	static void andar(Aula046EnumMedida medida, int total) {
		
		JOptionPane.showMessageDialog(null, "Hoje andei " + total + " " + medida.titulo + ".");
		
	}
	
	public static void main(String[] args) {
		
		
		
		JOptionPane.showMessageDialog(null, Aula046EnumPecasXadrez.BISPO);

		JOptionPane.showMessageDialog(null, Aula046EnumMedida.M + " equivale á " + Aula046EnumMedida.M.titulo);

		
		for ( Aula046EnumPecasXadrez pecas : Aula046EnumPecasXadrez.values()) {
			
			JOptionPane.showMessageDialog(null, "Peça de Xadrez: " + pecas);
		}
		
		
		Aula046Enum.andar(Aula046EnumMedida.M, 50);
		
		
	}

}
