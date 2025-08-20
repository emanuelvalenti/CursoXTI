package br.com.emanuelvalenti.poo;

public class Aula052Quadrado implements Aula052AreaCalculavel {

	double lado;
	
	public Aula052Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
	}
	
	

}
