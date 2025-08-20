package br.com.emanuelvalenti.poo;

class Aula041Galinha {

	public int ovos; //total de ovos do objeto
	
	public static int ovosDaGranja; //total de ovos da classe ou variável global 
	
	public Aula041Galinha botar(){
		
		this.ovos++;
		Aula041Galinha.ovosDaGranja++;
		return this;
		
	}
	
	public static double mediaOvosDaGranja(int galinhas) {
		
		
		return Aula041Galinha.ovosDaGranja / galinhas;
	}
	
	
}
