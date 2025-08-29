package br.com.emanuelvalenti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Aula086Collection {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();

		collection.add("A");
		collection.add("E");
		collection.add("I");

		// convert a estrutura em uma String
		System.out.println(collection.toString());

		// verifica se a coleção está vazia
		System.out.println(collection.isEmpty());

		// verifica se a coleção contém "A"
		System.out.println(collection.contains("A"));

		// remover o elemento a "A"
		collection.remove("A");
		System.out.println(collection.toString());

		/*
		 * GRUPOS
		 */

		Collection<String> collection2 = Arrays.asList("O", "U");

		// Acrescenta uma coleção a outra
		collection.addAll(collection2);
		System.out.println(collection2.toString());
		System.out.println(collection.toString());

		// verifica se existe um conjunto de elementos dentro de outro conjunto
		System.out.println(collection.containsAll(collection2));

		// Remove uma coleção de outra
		collection.removeAll(collection2);
		System.out.println(collection.toString());

		/* Percorrer os elementos */

		for (String string : collection) {
			System.out.println(string);
		}

		/* Transformar uma coleção em array */
		String[] arrayStrings = collection.toArray(new String[collection.size()]);
		System.out.println(Arrays.toString(arrayStrings));

		/* limpa a coleção */
		collection.clear();
		System.out.println(collection);
		
		
		
	}

}
