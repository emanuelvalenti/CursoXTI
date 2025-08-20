package br.com.emanuelvalenti.poo;

public class Aula034CachorroTeste {

	public static void main(String[] args) {

		Aula034Cachorro pitbull = new Aula034Cachorro();

		pitbull.raca = "Pit Bull";
		pitbull.tamanho = 40;

		pitbull.latir();

		pitbull = null;
		
		Aula034Cachorro viraLata = new Aula034Cachorro();
		
		viraLata.raca = "Vira Lata";
		viraLata.tamanho = 30;
		
		viraLata.latir();
		
		pitbull = null;
		viraLata = null;

	}

}
