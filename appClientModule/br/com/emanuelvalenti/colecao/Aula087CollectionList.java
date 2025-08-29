package br.com.emanuelvalenti.colecao;

import java.util.ArrayList;
import java.util.List;

public class Aula087CollectionList {

	public static void main(String[] args) {
		
		
		/*
		 * Permite duplicidade de valores
		 * */
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("FUTEBOL");
		lista.add("BASQUETE");
		lista.add("TÊNIS");
		lista.add("VOLEI");
		lista.add("NATAÇÃO");
		lista.add("HOCKEY");
		lista.add("BOXE");
		lista.add("FUTEBOL");

		System.out.println(lista);
		
		
		for (int i = 0; i < lista.size(); i++) {
			
			/*
			 * manipular entrada e captura de valores, junto com uma função
			 * */
			
			lista.set(i, lista.get(i).toLowerCase());
		}
		
		System.out.println(lista);

		/*
		 * mostra localização da palavra boxe na lista
		 * */
		System.out.println(lista.indexOf("boxe"));
		
		/*
		 * retorna uma sublistagem
		 * */
		System.out.println(lista.subList(2, 4));
		

		/*
		 * remove uma sublistagem
		 * */
		lista.subList(2, 4).clear();
		
		System.out.println(lista);
		
		
		
		
		
		
		
	}

}
