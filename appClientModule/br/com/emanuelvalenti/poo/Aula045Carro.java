package br.com.emanuelvalenti.poo;

public class Aula045Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Aula045Motor motor;

	Aula045Carro() {
	}
	

	Aula045Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		
		this(modelo,velocidadeMaxima,segundosZeroACem,null);
		
		
	}
	
	
	
	Aula045Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Aula045Motor motor) {
		
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		
		
		
	}
	
	
	
}
