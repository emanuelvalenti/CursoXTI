package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula030BreakContinue {
	
	public static void main(String[] args) {
		
		while (true) {
			JOptionPane.showMessageDialog(null, "Entrou!");
			break;
		}

		String texto = "";
		
		for (int i = 0; i < 10; i++ ) {
			
			if (i == 5) {
				continue;
			} else if (i == 7) {
				break;
			}
			
			texto += i + ", ";
		}
		
		JOptionPane.showMessageDialog(null, texto);

		texto = "";

		//rotulos
		um: 
		for (int y = 0; y<10; y++) {
			
			texto += y + ", ";
			//rótulos
			dois: 
			for (int i = 0; i < 10; i++ ) {
				
				if (i == 5) {
					continue;
				} else if (i == 7) {
					break um;
				}
				
				texto += i + ", ";
			}
		}
		
		JOptionPane.showMessageDialog(null, texto);

		texto = "";
		
		boolean [][] matrix = {
				{false,true,false,false,false},
				{false,false,false,false,false}
		};
		
		externo:
		for (int a=0; a<matrix.length; a++) {

			texto += "A, ";
			
			for (int b=0; b < matrix[a].length; b++) {

				if(matrix[a][b]) {
					
					texto += "TRUE, ";
					break externo;
					// ou use o continue externo;
				}
				texto += "B, ";
			}
		}

		JOptionPane.showMessageDialog(null, texto);
		
		
		
		
		
		
		
	}

}
