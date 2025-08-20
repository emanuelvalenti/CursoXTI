package br.com.emanuelvalenti.logica;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula020Array {
	
	public static void main(String[] args) {

		//Array simples
		String[] paises = {"Brasil","Rússia","Índia", "China"};
		
		JOptionPane.showMessageDialog(null, "O país no array posição [1] é " + paises[1]);
		
		JOptionPane.showMessageDialog(null, Arrays.toString(paises));

		//pesquisa dentro do array
		
		JOptionPane.showMessageDialog(null, "O país Rússia encontrasse na posição " + String.valueOf(Arrays.binarySearch(paises, "Rússia")));
		
		Arrays.sort(paises,0,paises.length);
		
		JOptionPane.showMessageDialog(null, "Sort de arrays " + Arrays.toString(paises));
		
		Double[] valores = {12.35,3456.3456};
		
		JOptionPane.showMessageDialog(null, "Valor posição 0 do array de double " + String.valueOf(valores[0].doubleValue()));
		
		
		
		Integer[] impares = new Integer[5];
		
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		JOptionPane.showMessageDialog(null, "O array impares tem " + String.valueOf(impares.length) + " registros!");
		
		
		ArrayList<String> nome = new ArrayList<String>();
		
		nome.add("Emanuel");
		nome.add("Silva");
		nome.add("Valenti");
		
		JOptionPane.showMessageDialog(null, "O nome no array posição [0] é " + nome.get(0));
		JOptionPane.showMessageDialog(null, "O nome no array posição [2] é " + nome.get(2));
		
		nome = null;
	}

}
