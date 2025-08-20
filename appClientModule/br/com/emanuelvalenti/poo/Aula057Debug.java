package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula057Debug {
	
	int valor;
	
	public static int raiz(int raizNumero) {
		
		int ciclo = 0, impar = 1;
		
		while (raizNumero >= impar) {
			raizNumero -= impar;
			impar += 2;
			++ciclo;
		}
		
		return ciclo;
	}
	
	public static void main(String[] args) {
		
		if(Aula057Debug.raiz(16) == 3) {
			JOptionPane.showMessageDialog(null, "Raiz quadrada de 16 é 4.");
		} else {
			JOptionPane.showMessageDialog(null, "Raiz quadrada de 16 não é 3.");
		}
		
		
	}

}
