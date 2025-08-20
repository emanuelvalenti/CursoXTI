package br.com.emanuelvalenti.logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula027Foreach {
	
	public static void main(String[] args) {
		
		int[] pares = {2,4,6,8,10,12,14,16,18,20};
		
		for (int i = 0; i < pares.length ; i++) {
			
			JOptionPane.showMessageDialog(null, pares[i]);
			
		}
		
		//foreach
		
		for( int par : pares) {

			JOptionPane.showMessageDialog(null, par);
			
		}
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++ ) {
			
			lista.add(i);
			
		}
		
		for(Integer list : lista) {
			
			JOptionPane.showMessageDialog(null, list);
		}
		
		
		
	}

}
