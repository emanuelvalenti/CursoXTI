package br.com.emanuelvalenti.refinado;

import java.util.ArrayList;
import java.util.List;

public class Aula097GarbageCollector {

	static long carregaMemoriaLivre() {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i< 100000; i++) {
			list.add(i);
		}
		
		return Runtime.getRuntime().freeMemory();
		
	}
	
	
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		
		/*
		 * informa a quantidade total
		 * de memoria disponivel para
		 * a JVM executar, formato bytes
		 * 
		 * */
		System.out.println(rt.maxMemory() / (int) 1_048_576 );
		
		System.out.println((rt.maxMemory() / (int) 1_048_576) - carregaMemoriaLivre() / (int) 1_048_576);
		
		/*
		 * Métodos de limpeza
		 * */
		
		/*
		 * Nas versões antes da 18
		 * finalizava os métodos depois de
		 * serem executados (DEPRECIADO)
		 * */
		//rt.runFinalization();
		
		/*
		 * Força a execução
		 * do Garbage colletor
		 * pelo Runtime
		 * */
		rt.gc();

		System.out.println(rt.maxMemory() / (int) 1_048_576 );
		
		
	}

}
