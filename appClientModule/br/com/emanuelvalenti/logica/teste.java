package br.com.emanuelvalenti.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class teste {
	
	public static void main(String[] args) {
		
		
		System.out.println(1 + 2 + "3" + 4 + 5); 
		
		teste r = new teste();
		r.raizPell(17689).raizPell(49);
		
		
		
/*		
		int a = 50; int b = a++ + ++a; System.out.println(b);
		
		
		
		
		int lista[] = {2,5,3,4,8,-76,42,46};
		int alvo = -74;

		teste.somaDeArray(lista, alvo);
		
*/		
		
				
	}

	public static void somaDeArray(int[] lista, int alvo) {

		int posicao1, posicao2;
		ArrayList<Integer> listaArray;
		
		posicao1 = 0;
		posicao2 = 0;
		
		listaArray = Arrays.stream(lista).boxed().collect(Collectors.toCollection(ArrayList::new));
		
		for (int i = 0; i < listaArray.size(); i++) {
			
			int indice = listaArray.indexOf(alvo - listaArray.get(i));
			if (indice != -1 ) {
				
				posicao1 = i;
				posicao2 = indice;
				
				
				break;
			}
		}
		
		
		System.out.println("Indice 1: " + posicao1 + ", Indice 2: " + posicao2);
		
	}

	
	public teste raizPell(int valor) {
		
		int valorRaiz = 0;
		int valorRerefencia = valor;
		
		for (int i = 1; (valor - i) >= 0; i+=2 ) {
			
			valor-=i;
			valorRaiz++;
			
		}
		
		System.out.println("Para o valor " + valorRerefencia + ", é raiz quadrada de " + valorRaiz + ".");
		
		return this;
		
	}
	
}

