package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula058StringOperacoes {

	
	public static void main(String[] args) {
		
		String s1 = "Write Once"; //literal
		String s2 = s1 + " Concat"; //concatenação
		String s3 = new String("Java Virtual Machine"); //método contstrutor
		
		char[] c1 = {'J','A','V','A'};
		String s4 = new String(c1); //método contstrutor com array
		
		//OPERAÇÕES
		//tamanho da String
		JOptionPane.showMessageDialog(null, s3.length()); 
		
		//retorna o caractere referente ao indice informado, cuidado para não informar um valor fora dos limites
		JOptionPane.showMessageDialog(null, s3.charAt(0));
		
		//retorna a própria representação da String
		JOptionPane.showMessageDialog(null, "Texto".toString());

		//LOCALIZAÇÃO
		// retornar o primeiro indice do caractere informado
		JOptionPane.showMessageDialog(null, s3.indexOf('J'));
		
		// retornar o primeiro indice da String informada
		JOptionPane.showMessageDialog(null, s3.indexOf("Virtual"));

		// retornar o ultimo indice do caractere informado
		JOptionPane.showMessageDialog(null, s3.lastIndexOf('a'));

		// retornar o ultimo indice da String informada
		JOptionPane.showMessageDialog(null, s3.lastIndexOf("Mac"));

		// retornar se a String está vazia
		JOptionPane.showMessageDialog(null, s3.isEmpty());
		
		//COMPARAÇÃO
		
		//Compara se uma String é igual a outra com case sensitive
		String comparacao = "curso";
		JOptionPane.showMessageDialog(null, s3.equals(comparacao));
		/*
		 * OBSERVAÇÃO
		 * O método .equals() ela é para comparar VALORES de OBJETOS.
		 * A função de comparação ("curso" == comparação) serve para comparar se os OBJETOS são IGUAIS.
		 */
		
		//Compara se uma String é igual a outra sem case sensitive
		JOptionPane.showMessageDialog(null, "CURSO".equalsIgnoreCase("curso"));
		
		//Compara se uma String inicia com determinado caractere
		JOptionPane.showMessageDialog(null, "CURSO".startsWith("C"));
		
		//Compara se uma String inicia com determinada String
		JOptionPane.showMessageDialog(null, "CURSO".startsWith("URSO"));
		
		//Compara se uma String inicia com determinado caractere
		JOptionPane.showMessageDialog(null, "CURSO".endsWith("C"));
		
		//Compara se uma String inicia com determinada String
		JOptionPane.showMessageDialog(null, "CURSO".endsWith("URSO"));
		
		/*
		 * Compara se entre duas strings uma
		 * é anterior a outra alfabeticamente
		 * primera string é menor retorna número negativo  
		 * segunda string é menor retorna número positivo 
		 * primeira e segunda são iguais retorna 0 
		 */
		
		JOptionPane.showMessageDialog(null,"Compareto " +  "amor".compareTo("bola"));
		JOptionPane.showMessageDialog(null,"Compareto " + "curso".compareTo("bola"));
		JOptionPane.showMessageDialog(null,"Compareto " + "curso".compareTo("curso"));
		JOptionPane.showMessageDialog(null,"Compareto " + "curso".compareTo("evasivo"));
		JOptionPane.showMessageDialog(null,"Compareto " + "curso".compareTo("cadeira"));
		JOptionPane.showMessageDialog(null,"Compareto " + "123".compareTo("234"));
		
		//compara se uma string existe a partir de uma região dentro de uma string com case sensitive
		//(a partir da posição inicial da procura, string de comparação, posição inicial da string de comparação, tamanho que deve efetuado a pesquisa)
		JOptionPane.showMessageDialog(null,"Existe \"mundo\" na frase\"Olá mundo, voltei!\"?" + "Olá mundo, voltei!".regionMatches(4, "mundo", 0, 5));
		
		//compara se uma string existe a partir de uma região dentro de uma string sem case sensitive
		//(flag de case sensitive, a partir da posição inicial da procura, string de comparação, posição inicial da string de comparação, tamanho que deve efetuado a pesquisa)
		JOptionPane.showMessageDialog(null,"Existe \"MUNDO\" na frase\"Olá mundo, voltei!\"?" + "Olá mundo, voltei!".regionMatches(true,4, "MUNDO", 0, 5));
		
		//EXTRAÇÃO
		
		//Extrai a substring de uma string apartir do indice informado
		JOptionPane.showMessageDialog(null, "\"O Brasil é lindo\" qual é a substring na posição 11? " + "O Brasil é lindo".substring(11));
		
		//Extrai a substring de uma string apartir do indice informado e quantos indices ele deve percorrer
		JOptionPane.showMessageDialog(null, "\"O Brasil é lindo\" qual é a substring na posição 2 mais 8 posições? " + "O Brasil é lindo".substring(2, 8));
		
		
		//MODIFICAÇÃO
		//concateção através de método
		JOptionPane.showMessageDialog(null, "Emanuel ".concat("Valenti"));
		
		//trocar carateres dentro da String
		JOptionPane.showMessageDialog(null, "Emanuel " + "Emanuel".replace('e', 'i'));

		//trocar string dentro da String
 		JOptionPane.showMessageDialog(null, "Emanuel " + "Emanuel".replace("Emanu", "Mano"));
		
		//trocar todos carateres dentro da String
		JOptionPane.showMessageDialog(null, "A E I O U " + "A E I O U".replace(' ', '-'));

		//trocar todas string dentro da String
 		JOptionPane.showMessageDialog(null, "A - E - I - O - U " + "A - E - I - O - U".replace(" - ", "# "));

		//Converte as letras minúsculas em maiúsculas
 		JOptionPane.showMessageDialog(null, "aeiou " + "aeiou".toUpperCase());
 		
		//Converte as letras maiúsculas em minúsculas
 		JOptionPane.showMessageDialog(null, "AEIOU " + "AEIOU".toLowerCase());
 		
		//limpa espaços antes e depois da string
 		JOptionPane.showMessageDialog(null, "  aeiou   ".trim());
 		
 		
 		
 		
		/*
		
		
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		JOptionPane.showMessageDialog(null, );
		*/
		
	}
}
