package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula044Construtores {

	
	public static void main(String[] args) {
		
		Aula044Carro carro1 = new Aula044Carro();
		Aula044Carro carro2 = new Aula044Carro(15.0);
		Aula044Carro carro3 = new Aula044Carro(180);
		Aula044Carro carro4 = new Aula044Carro("Mazzerato");
		Aula044Carro carro5 = new Aula044Carro("Porche",340, 5.5);
		
		JOptionPane.showMessageDialog(null, "Especificação carro 1, Modelo " + carro1.modelo + ", Velocidade máxima " + carro1.velocidadeMaxima + " e Zero a Cem em " + carro1.segundosZeroACem + " .");
		JOptionPane.showMessageDialog(null, "Especificação carro 2, Modelo " + carro2.modelo + ", Velocidade máxima " + carro2.velocidadeMaxima + " e Zero a Cem em " + carro2.segundosZeroACem + " .");
		JOptionPane.showMessageDialog(null, "Especificação carro 3, Modelo " + carro3.modelo + ", Velocidade máxima " + carro3.velocidadeMaxima + " e Zero a Cem em " + carro3.segundosZeroACem + " .");
		JOptionPane.showMessageDialog(null, "Especificação carro 4, Modelo " + carro4.modelo + ", Velocidade máxima " + carro4.velocidadeMaxima + " e Zero a Cem em " + carro4.segundosZeroACem + " .");
		JOptionPane.showMessageDialog(null, "Especificação carro 5, Modelo " + carro5.modelo + ", Velocidade máxima " + carro5.velocidadeMaxima + " e Zero a Cem em " + carro5.segundosZeroACem + " .");
		
	}
}
