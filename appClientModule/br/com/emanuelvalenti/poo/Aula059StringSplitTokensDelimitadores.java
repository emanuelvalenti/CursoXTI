package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula059StringSplitTokensDelimitadores {

	public static void main(String[] args) {
		
		
		String s = "XHTML; CSS; JavaScript; JQuery; Java";
		
		
		
		for (String tokens : s.split(";")) {
			
			JOptionPane.showMessageDialog(null, "Uma das palavras separadadas do texto " + tokens);
		}
		
		String[] tokensCurso = s.split(";"); // pode ser qualquer caractere
		
		JOptionPane.showMessageDialog(null, "Quantos palavras tem dentro da string depois de separada " + tokensCurso.length);
		
	}
}
