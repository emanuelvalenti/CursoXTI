package br.com.emanuelvalenti.logica;

import java.io.Console;

import javax.swing.JOptionPane;

public class Aula026For {
	
	public static void main (String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			
			JOptionPane.showMessageDialog(null, i);
			
			
		}

		for (int i = 0; i < 3; i++) {
			
			switch (i) {
			case 2: 
				JOptionPane.showMessageDialog(null, "O somatorio de i é " + i);
				break;
	
			}
		
			
		}
		
		String texto = "";
		
		for (int i = 0; i < 3; i++) {

			if (i < 2) {
				texto += i + ", ";	
			} else {
				texto += i;	
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, texto);
		
		texto = "";
		
		for (int i = 10; i > 0; i--) {

			if (i > 1) {
				texto += i + ", ";	
			} else {
				texto += i;	
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, texto);
		
		texto = "";


		for (int i = 0; i < 21; i++) {

			if ((i % 2) == 0) {
				texto += i + ", ";	
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, texto);
		

		int altura = 5;
		int largura = 5;
		texto = "";


		for (int y = 1; y <= altura; y++) {

			for (int x = 1; x <= largura; x++) {

				if (y == 1 || y == 5) {
					texto += "* "; 
				} else {
					if (x == 1 || x == 5) {
						texto += "* "; 
					} else {
						texto += "  "; 
					}
				}
				
			}
			
			System.out.println(texto);
			texto = "";
		}
		
		
	}

}
