package br.com.emanuelvalenti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Aula088UtilitarioCollection {

	public static void main(String[] args) {
		/*
		 * ACEITA ELEMENTOS DUPLICADOS
		 */
		List<String> lista = new ArrayList<String>();

		lista.add("GUARANÁ");
		lista.add("UVA");
		lista.add("MANGA");
		lista.add("COCO");
		lista.add("AÇAÍ");
		lista.add("BANANA");

		System.out.println(lista);

		/*
		 * ordena os dados dentro de uma lista
		 */

		Collections.sort(lista);
		System.out.println(lista);

		/*
		 * Reverte a ordem dos dados dentro de uma lista
		 */

		Collections.reverse(lista);
		System.out.println(lista);

		/*
		 * embaralha aleatóriamente os dados dentro de uma lista
		 */

		Collections.shuffle(lista);
		System.out.println(lista);

		/*
		 * Adiciona outros elementos dentro de uma lista
		 */

		Collections.addAll(lista, "PESSEGO", "MAÇÃ", "PERA", "ABACAXI", "UVA");
		System.out.println(lista);

		/*
		 * Conta a incidência de um valor dentro da lista
		 */

		System.out.println(Collections.frequency(lista, "UVA"));

		/*
		 * comparativo de listas
		 */

		List<String> lista2 = new ArrayList<String>();

		lista2.add("LARANJA");
		lista2.add("ABACATE");
		lista2.add("MANGA");
		lista2.add("COCO");
		lista2.add("AÇAÍ");
		lista2.add("MORANGO");

		System.out.println(Collections.disjoint(lista, lista2));

		List<String> lista3 = Arrays.asList("MELANCIA", "TANGERINA");

		System.out.println(Collections.disjoint(lista, lista3));

		/*
		 * Localizar o indíce de uma elemento dentro da coleção
		 */

		Collections.sort(lista2);
		System.out.println(lista2);
		System.out.println(Collections.binarySearch(lista2, "ABACATE"));

		/*
		 * preencher toda coleção com uma palavra
		 */
		System.out.println(lista3);

		Collections.fill(lista3, "ROMÃ");

		System.out.println(lista3);

		/*
		 * Criar uma coleção que não pode ser modificada
		 */

		Collection<String> constante =
				Collections.unmodifiableCollection(lista3);

		try {
			constante.add("teste");
		} catch (Exception e) {
			System.out.println(e.toString()); 
		}

	}

}
