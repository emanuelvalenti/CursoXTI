package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula050PolimorfismoAbstratas {

	public static void fazerBarulho(Aula050Animal animal) {
		animal.fazerBarulho();
	}
	
	
	public static void main(String[] args) {
		
		//Aula050Animal animal = new Aula050Animal(); não é possível estanciar uma classe animal quando a mesma é abstrata, porém é possivel caso implemente os métodos abstratos neste código
		
		
		Aula050PolimorfismoAbstratas.fazerBarulho(new Aula050Cachorro());
		Aula050PolimorfismoAbstratas.fazerBarulho(new Aula050Galinha());
		
		
	}
}
