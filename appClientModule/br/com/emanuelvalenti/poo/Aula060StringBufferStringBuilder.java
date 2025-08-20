package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula060StringBufferStringBuilder {


	public static void main(String[] args) {
		
		/*
		 * métodos da string buffer são sincronizados,
		 * assim utilizado por multiplas treads
		 * um classe ou método de alto fluxo
		 */
		StringBuffer sbf = new StringBuffer();
		
		/*
		 * métodos da string buffer são assincrona,
		 * assim utilizado apenas por uma tread
		 * uma classe de baixo acesso pouco fluxo
		 */
		StringBuilder sbi = new StringBuilder("Java");
		
		JOptionPane.showMessageDialog(null, sbi.length());
		JOptionPane.showMessageDialog(null, sbi.capacity());
		
		JOptionPane.showMessageDialog(null, sbi); 
		JOptionPane.showMessageDialog(null, sbi.reverse()); //reverte a ordem dos caracteres
		
		//concatena informações as informações sem criar novos objetos como a string convencional
		JOptionPane.showMessageDialog(null, sbi.append(" trabalhando ")); 
		
		//contatena outros tipos de dados
		
		char[] novaChar = {'H','o','j','e'};  
		
		JOptionPane.showMessageDialog(null, sbi.append(novaChar)); 
		
		/*
		 * o Java quando concatena string ele impliciamente efetua o processo abaixo
		 * Criando várias StringBuilders, assim a boa prática quando houver manipulação
		 * de String, já crie um objeto StringBuilder para evitar o acumulo de 
		 * alocação de memória
		 */

		//a linha abaixo
		String s = "Oi" + " como " + "vai você?";
		
		/*
		 * é exatamente isso que ele faz
		 * e quanto mais você contatena, 
		 * mais objetos strinBuilders serão criados
		 */
		
		String sb = new StringBuilder("Oi").append(" como ").append("vai você?").toString();
		sb = new StringBuilder(" Eu vou ").append("bem e").append(" você?").toString();
		
		/*
		 * remoção de conteúdo sem gerar novos objetos
		 */
		
		String url = new StringBuilder("www.emanuelvalenti.com").delete(0, 4).toString(); //inicio da deleção e quantos caracteres.
		
		JOptionPane.showMessageDialog(null, url);
		
		
		
	}
	
	
}
