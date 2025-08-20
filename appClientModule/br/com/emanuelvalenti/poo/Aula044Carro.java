package br.com.emanuelvalenti.poo;

public class Aula044Carro {

	String modelo;
	
	int velocidadeMaxima;
	double segundosZeroACem;
	
	
	Aula044Carro() {
		
		this.modelo = "Super Esportivo";  
		this.velocidadeMaxima = 200;
		this.segundosZeroACem = 9;
		
	}
	
	Aula044Carro(String modelo) {
		
		this.modelo = modelo;
		
		
		
	}

	Aula044Carro(int velocidade) {
		
		this.velocidadeMaxima = velocidade;
		
		
		
	}
	
	
	Aula044Carro(double segundosZeroACem ) {
		
		this.segundosZeroACem = segundosZeroACem;
		
		
		
	}
	
	Aula044Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		
		
		
	}
	
	
	
}
