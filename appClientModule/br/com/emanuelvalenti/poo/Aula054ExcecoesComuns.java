package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula054ExcecoesComuns {

	//NullPointerException: 
	//static int[] arrayNull;

	//ArrayIndexOutOfBoundsException: 
	//static int[] arrayNull = {0};

	public static void main(String[] args) {
		
		//NullPointerException: 
		//JOptionPane.showMessageDialog(null, arrayNull.length);

		//ArrayIndexOutOfBoundsException: 
		//JOptionPane.showMessageDialog(null, arrayNull[1]);
		
		//ClassCastException: Galinha não é do tipo Cachorro
		//Aula054Animal a = new Aula054Galinha();
		//Aula054Cachorro c = (Aula054Cachorro) a; //(Aula054Cachorro) é um cast ou conversão
		
		//NumberFormatException:
		//int i = Integer.valueOf("x");
		
	}
	
}
