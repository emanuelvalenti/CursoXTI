package br.com.emanuelvalenti.poo;

public class Aula038RaizQuadrada {

	/**
	 * 
	 * @param valor
	 * @return o valor de raiz quadrada digitado pelo usuário no calculo de PELL
	 */
	static double raizQuadradaPell(int valor) {
		
		int ciclo= 0, impar = 0;

		loop:
		while (valor > impar) {
			
			impar++;
			
			if(((impar % 2) == 0)) {
				
				continue loop;
			} else {
				
				ciclo++;
				valor -= impar;
			}
			
		}
		
		return Double.valueOf(ciclo);
		
	}
}
