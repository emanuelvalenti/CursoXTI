package br.com.emanuelvalenti.logica;
import java.util.Scanner;

public class Aula011Entrada {

	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome aqui: ");
		String nome = entrada.nextLine();
		System.out.println("Seu nome é " + nome);
		
		entrada.close();
		entrada = null;
		nome = null;
		

	}
}
