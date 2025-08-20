package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula045RelacionamentoTemUm {

	public static void main(String[] args) {

		Aula045Carro carro = new Aula045Carro();
		Aula045Motor v12 = new Aula045Motor();
		Aula045Carro carro2 = new Aula045Carro();

		
		
		carro.modelo = "Porsche";
		carro.segundosZeroACem = 3.2;
		carro.velocidadeMaxima = 350;

		v12.tipo = "V12";
		v12.potencia = 700;

		carro.motor = v12;

		JOptionPane.showMessageDialog(null,
				"O carro " + carro.modelo + ", com velocidade máxima de " + carro.velocidadeMaxima + ", tem um motor "
						+ carro.motor.tipo + " com " + carro.motor.potencia + " cavalos de potênca.");
		
		carro2.modelo = "Lamborguini";
		carro2.segundosZeroACem = 2.2;
		carro2.velocidadeMaxima = 450;
		carro2.motor = new Aula045Motor("V10",750);
		
		JOptionPane.showMessageDialog(null,
				"O carro " + carro2.modelo + ", com velocidade máxima de " + carro2.velocidadeMaxima + ", tem um motor "
						+ carro2.motor.tipo + " com " + carro2.motor.potencia + " cavalos de potênca.");
		
		Aula045Carro carro3 = new Aula045Carro("Ferrari",420,3.9,new Aula045Motor("V8", 915));

		JOptionPane.showMessageDialog(null,
				"O carro " + carro3.modelo + ", com velocidade máxima de " + carro3.velocidadeMaxima + ", tem um motor "
						+ carro3.motor.tipo + " com " + carro3.motor.potencia + " cavalos de potênca.");

		Aula045Carro carro4 = new Aula045Carro("Masseratti",240,10.4);

		JOptionPane.showMessageDialog(null,
				"O carro " + carro4.modelo + ", com velocidade máxima de " + carro4.velocidadeMaxima + ".");
		

	}

}
