package br.com.emanuelvalenti.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Aula089CollectionSet {

	public static void main(String[] args) {
		
		/*
		 * NÃo aceita duplicados
		 * */

		String[] cores = {"verde","amarelo","azul","branco","azul","amarelo","verde"};

		/*
		 * Ele não dá erro, mas ele faz um NATURAL JOIN
		 * */
		Set<String> set = new HashSet<String>(Arrays.asList(cores));
		
		System.out.println(set);
		
	}
	
}
