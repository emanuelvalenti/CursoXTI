package br.com.emanuelvalenti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aula091CollectionMap {

	public static void main(String[] args) {

		/*
		 * Não aceita chaves duplicados
		 * */
		Map<String, String> pais = new HashMap<String, String>();
		
		/*
		 * Adiciona registros
		 * */
		
		pais.put("BR","Brasil");
		pais.put("RU","Russia");
		pais.put("IN","Índia");
		pais.put("CN","China");
		
		System.out.println(pais);

		/*
		 * localizar uma chave
		 * */
		
		System.out.println(pais.containsKey("BR"));
		
		/*
		 * localizar um valor
		 * */
		
		System.out.println(pais.containsValue("Russia"));

		/*
		 * Recuperar um conteúdo pela chave
		 * */
		
		System.out.println(pais.get("CN"));

		/*
		 * Remover um conteúdo pela chave
		 * */
		
		pais.remove("RU");
		System.out.println(pais);
		
		/*
		 * Recuperar todas as chaves
		 * */
		
		System.out.println(pais.keySet());

		pais.put("Br","Brasil");

		System.out.println(pais);
		
		Set<String> key = pais.keySet();
		
		System.out.println(key);
		
		for (String string : key) {
			System.out.println(string + ":" + pais.get(string));
		}
		
		
	}

}
