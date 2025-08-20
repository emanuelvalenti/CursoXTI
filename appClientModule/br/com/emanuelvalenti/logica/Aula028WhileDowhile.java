package br.com.emanuelvalenti.logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula028WhileDowhile {

	public static void main (String[] args) {
		
		int i = 0; 
		
		while (i < 2) {
			
			JOptionPane.showMessageDialog(null, i + " é menor do que 2!");
	
			i++;
		}

		i = 3; 
		
		while (i < 2) {
			
			JOptionPane.showMessageDialog(null, i + " é menor do que 2!");
	
			i++;
		}
		
		
		do {
			
			JOptionPane.showMessageDialog(null, i + " é menor do que 2?");
			
		} while (i < 2);
		
		
		String produtos = "";
		
		ArrayList<String> listaProdutos = new ArrayList<String>();
		
		while (!"fim".equals(produtos = JOptionPane.showInputDialog("Informe um nome de produtos ou \"fim\" para encerrar."))) {
			
			if (!produtos.equals("fim") && !produtos.equals("FIM") && !produtos.isEmpty()){
				
				listaProdutos.add(produtos);
				
			}
			
		}
		
		if (!listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Os produtos digitados foram: " + listaProdutos.toString());	
		}
		
	}
	
}
