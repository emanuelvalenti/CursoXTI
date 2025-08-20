package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula049PolimorfismoSobrescritaDeMetodos {

	public static void barulho(Aula049Animal animal) {

		animal.fazerBarulho();

	}

	public static void barulho(String animal) { // sem Polimorfismo

		if (animal.equals("Cachorro")) {
			JOptionPane.showMessageDialog(null, "Au Au!");
		} else if (animal.equals("Galinha")) {
			JOptionPane.showMessageDialog(null, "Có, Có!");
		} else {
			JOptionPane.showMessageDialog(null, "Fazer Barulho");
		}

	}

	public static void calcule(Aula049OperacaoMatematica operacao, double x, double y) {

		JOptionPane.showMessageDialog(null, operacao.calcular(x, y));

	}

	public static void main(String[] args) {

		Aula049Animal generico = new Aula049Animal(0, null);
		Aula049Cachorro cachorro = new Aula049Cachorro();
		Aula049Galinha galinha = new Aula049Galinha();

		cachorro.fazerBarulho();
		galinha.fazerBarulho();
		generico.fazerBarulho();

		Aula049PolimorfismoSobrescritaDeMetodos.barulho(galinha);
		Aula049PolimorfismoSobrescritaDeMetodos.barulho(generico);
		Aula049PolimorfismoSobrescritaDeMetodos.barulho("Cachorro"); //sem polimorfismo

		
		Aula049PolimorfismoSobrescritaDeMetodos.calcule(new Aula049OperacaoMatematica(), 10, 20);
		Aula049PolimorfismoSobrescritaDeMetodos.calcule(new Aula049Soma(), 10, 20);
		Aula049PolimorfismoSobrescritaDeMetodos.calcule(new Aula049Multiplicacao(), 10, 20);
		
		
		

	}

}
