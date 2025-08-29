package br.com.emanuelvalenti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Aula090ColletionQueue {

	public static void main(String[] args) {

		//FIFO
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Emanuel");
		
		System.out.println(fila);
		
		fila.add("Natalí");
		
		System.out.println(fila);
		
		fila.add("Spock");
		
		System.out.println(fila);
		
		/*
		 * add = offer
		 * */
		
		fila.offer("Anakin");
		
		System.out.println(fila);
		
		/*
		 * recuperar o elemento, proxima pessoa
		 * */

		System.out.println(fila.peek());
		
		/*
		 * remove o primeiro elemento da fila
		 * */
		fila.poll();
		System.out.println(fila);
		
		
		/*
		 * Métodos da classe LinkedList
		 * */
		
		LinkedList<String> linkedList = (LinkedList<String>) fila;
		
		/*
		 * Adiciona elemento no início da fila
		 * */
		
		linkedList.addFirst("Anakin");
		System.out.println(linkedList);
		
		/*
		 * Adiciona elemento no final da fila
		 * */
		
		linkedList.addLast("Emanuel");
		System.out.println(linkedList);
		
		/*
		 * captura elemento no inicio da fila, sem remover
		 * */
		
		System.out.println(linkedList.peekFirst());
		
		/*
		 * captura elemento no final da fila, sem remover
		 * */
		
		System.out.println(linkedList.peekLast());
		
		/*
		 * remove elemento no inicio da fila, sem remover
		 * */
		linkedList.pollFirst();
		System.out.println(linkedList);
		
		/*
		 * remove elemento no final da fila, sem remover
		 * */
		linkedList.pollLast();
		System.out.println(linkedList);
		
	}

}
