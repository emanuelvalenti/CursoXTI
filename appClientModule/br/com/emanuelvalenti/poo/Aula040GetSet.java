package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula040GetSet {

	
	public static void main (String[] args) {
		
		Aula040Funcionario funcionario = new Aula040Funcionario();

		funcionario.setNome("Emanuel");
		
		String nome = funcionario.getNome();
		
		
		
		JOptionPane.showMessageDialog(null, nome);
		
	}
}
