package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;

public class Aula024Switch {
	
	public static void main (String[] args) {
		
		char sexo;
		
		sexo = 'f'; 
		
		switch (sexo) {
		case 'f': {
			
			JOptionPane.showMessageDialog(null, "Sexo Feminino");
			break;
		}
		case 'm': {
			
			JOptionPane.showMessageDialog(null, "Sexo Masculino");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sexo);
		}
		
		String tecnologia = "postgresql";
		
		switch (tecnologia) {
		case "java":
		case "c++":
		case "cobol":
		{
			
			JOptionPane.showMessageDialog(null, "Linguagem de programação");
			break;
		}
		case "oracle":
		case "sqlserver":
		case "postgresql":
		{
			
			JOptionPane.showMessageDialog(null, "Banco de dados");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Tencologia desconhecida");
		}
		
		
	}

}
