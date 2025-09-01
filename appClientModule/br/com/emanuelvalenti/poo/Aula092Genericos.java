package br.com.emanuelvalenti.poo;

import java.io.Serializable;
import java.util.ArrayList;

public class Aula092Genericos <E> {

	private E elemento;
	
	
	public void setElemento(E elemento) {
		
		this.elemento = elemento;
	}
	
	
	public E getElemento() {
		
		return this.elemento;
	}
	
	
	/*
	 * caratere coringa
	 * Qualquer tipo filhos 
	 * incluindo o próprio
	 * tipo extendido
	 * */
	
	public double somaFilho(ArrayList<? extends Number> lista) {
		
		double total = 0;
		
		for (Number number : lista) {
			total += number.doubleValue();
		}
		
		return total;
		
	}
	
	/*
	 * Qualquer tipo de
	 * pais de number
	 * Obs. abaixo o código
	 * foi comentado pois é necessário tratar
	 * o caso
	 * */
	
	/*
	public double somaPai(ArrayList<? super Number> lista) {
		
		double total = 0;
		
		for (Serializable number : lista) {
			total += number.doubleValue();
		}
		
		return total;
		
	}
	*/
	
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * JVM vai analizar e utilizar
		 * Apenas o tipo de objeto foi passado
		 * */
		Aula092Genericos<String> g = new Aula092Genericos<String>();
		
		g.setElemento("lago");
		
		g.getElemento().toUpperCase();
	}
	
}
