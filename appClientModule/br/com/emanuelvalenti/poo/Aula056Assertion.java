package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula056Assertion {

	
	public static void main(String[] args) {
		
		int valor = Integer.valueOf(JOptionPane.showInputDialog("Informe um numero entre 0 e 10:".trim()));

		/*
		 * Para habilitar as assertions
		 * 
		 * linha de comando
		 * execute java com -ea = irá habilitar todas as assertions
		 * execute java com -da = irá desabilitar todas as assertions
		 * execute java com -ea:br.com.emanuelvalenti... = irá habilitar todas as assertions para este respectivo pacote
		 * execute java com -ea:br.com.emanuelvalenti... -da:br.com.emanuelvalenti.logica... = 
		 * irá habilitar todas as assertions para este respectivo pacote com exceção do pacote especificado
		 * 
		 * No eclipse
		 * utilize run configurations
		 * na aba de argumentos insira os argumentos acima no campo VM Arguments, aplique e confirme
		 * 
		 */
		assert (valor >= 0 && valor <= 10) : "Numero inválido";
		
		JOptionPane.showMessageDialog(null, "O valor digitado é " + valor);
		
		
		
	}
}
