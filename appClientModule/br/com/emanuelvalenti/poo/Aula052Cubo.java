package br.com.emanuelvalenti.poo;

public class Aula052Cubo implements Aula052VolumeCalculavel, Aula052AreaCalculavel{

	
	double lado;
	
	public Aula052Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calculaVolume() {
		return 6 * (this.lado * this.lado);
	}

}
