package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula055ExceptionHierarquia {

	public static void testeSenha() throws Aula055SenhaInvalidaException {
		
		if (!JOptionPane.showInputDialog("Digite sua senha").equals("admin")) {
			throw new Aula055SenhaInvalidaException("Senha Invalida");
		} else {
			JOptionPane.showMessageDialog(null, "Logado no sistema");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			testeSenha();	
		} catch (Aula055SenhaInvalidaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			JOptionPane.showMessageDialog(null, e.getStackTrace());
			
		}
		
	}
}
