package br.com.emanuelvalenti.poo;

import java.util.regex.*;

import javax.swing.JOptionPane;

public class Aula061RegularExpression {

	public static void main(String[] args) {

		/*
		 *conceito básico 
		 */
		String padrao = "Java";
		String texto = "Java";
		
		JOptionPane.showMessageDialog(null, texto.matches(padrao));
		
		//não irá encontrar pois este tratamento é case sensitive
		JOptionPane.showMessageDialog(null, "Java".matches("java"));
		
		/*
		 * MODIFICADORES
		 * (?i), Ignora maiúscula e minúscula
		 * (?x), comentários
		 * (?m), Multilinhas
		 * (?s), Dottal
		 */
		
		//ignora tratamento de case sensitive
		JOptionPane.showMessageDialog(null, "Java " + "Java".matches("(?i)java"));
		
		//avaliação de várias linhas
		JOptionPane.showMessageDialog(null, "Java " + "Java".matches("(?im)java")); //apenas incrementando
		
		/*
		 * METACARACTERES - procura por ...
		 * .  Qualquer caractere
		 * \d dígitos				[0-9]
		 * \D não é dígito			[^0-9]
		 * \s espaços				[ \t\n\x0B\f\r]
		 * \S não é espaços			[^\s]
		 * \w letra					[a-zA-Z_0-9]
		 * \W Não é letra
		 */

		//avalia qualquer caractere, uma única avaliação
		//JOptionPane.showMessageDialog(null,"@ " +  "@".matches(".")); //true
		
		//avalia qualquer número, uma única avaliação
		//JOptionPane.showMessageDialog(null, "2 " + "2".matches("\\d")); //true 

		//avalia qualquer número, uma única avaliação
		//JOptionPane.showMessageDialog(null, "a " + "a".matches("\\d")); //false

		//avalia qualquer número ou letra, uma única avaliação
		//JOptionPane.showMessageDialog(null, "a " + "a".matches("\\w")); //true
		
		//avalia qualquer número ou letra, uma única avaliação
		//JOptionPane.showMessageDialog(null, "# " + "#".matches("\\w")); //false
		
		//avalia ocorrência de espaços, uma única avaliação
		//JOptionPane.showMessageDialog(null, "espaços " + " ".matches("\\s")); //true

		//avalia ocorrência de espaços, uma única avaliação
		//JOptionPane.showMessageDialog(null, "espaços " + "a".matches("\\s")); //false
		
		//avalia qualquer caractere, para avalição de um caractere tendo 2
		//JOptionPane.showMessageDialog(null,"@i " +  "@i".matches(".")); //false
		
		//avalia qualquer caractere, para avalição de dois caracteres
		//JOptionPane.showMessageDialog(null,"@i " +  "@i".matches("..")); //true

		//avalia qualquer caractere, para avalição de três caracteres
		//JOptionPane.showMessageDialog(null,"@ie " +  "@ie".matches("...")); //true
		
		//avalia qualquer número, para avalição de dois digitos
		//JOptionPane.showMessageDialog(null, "12 " + "12".matches("\\d\\d")); //true 

		//expressão regular simples de CEP
		//JOptionPane.showMessageDialog(null, "99999-999 " + "99999-999".matches("\\d\\d\\d\\d\\d-\\d\\d\\d")); //true 
		
		/*
		 * QUANTIFICADORES
		 * X{n}		X, exatamente n vezes 
		 * X{n,} 	X, pelo menos n vezes
		 * X{n,m} 	X, pelo menosn mas não mais do que m vezes
		 * X? 		X, 0 ou 1 vez
		 * X*		X, 0 ou + vezes
		 * X+		X, 1 ou + vezes
		 */

		//avalia qualquer número, para avalição de dois digitos
		//JOptionPane.showMessageDialog(null, "21 " + "21".matches("\\d{2}")); //true 
		
		//avalia qualquer número de pelo menos 2 digitos
		//JOptionPane.showMessageDialog(null, "45678 " + "45678".matches("\\d{2,}")); //true 

		//JOptionPane.showMessageDialog(null, "678 " + "678".matches("\\d{5,}")); //false 
		
		//avalia qualquer número de pelo menos 2 digitos mas não pode passar de 6
		//JOptionPane.showMessageDialog(null, "9090 " + "9090".matches("\\d{2,6}")); //true 

		//JOptionPane.showMessageDialog(null, "1020304 " + "1020304".matches("\\d{2,6}")); //false 

		//avalia qualquer qualquer caractere 0 ou 1 vez
		//JOptionPane.showMessageDialog(null, "vazio " + "".matches(".?")); //true
		//JOptionPane.showMessageDialog(null, "22 " + "22".matches(".?")); //false

		
		//avalia qualquer qualquer caractere 0 ou mais vez
		//JOptionPane.showMessageDialog(null, "vazio " + "".matches(".*")); //true
		//JOptionPane.showMessageDialog(null, "espaço e 1 " + " 1".matches(".*")); //true
		//JOptionPane.showMessageDialog(null, "espaço e 1 e 2 " + " 12".matches(".*")); //true
		
		//avalia um quantificador de 1 ou mais vezes
		//JOptionPane.showMessageDialog(null, "vazio " + "".matches(".+")); //false 
		//JOptionPane.showMessageDialog(null, "aa " + "aa".matches(".+")); //true 
		//JOptionPane.showMessageDialog(null, "abc " + "abc".matches(".+")); //true 
		
		
		//expressão regular avançada de CEP
		//JOptionPane.showMessageDialog(null, "99999-999 " + "99999-999".matches("\\d{5,5}-\\d{3,3}")); //true 
		//JOptionPane.showMessageDialog(null, "9999-999 " + "9999-999".matches("\\d{5,5}-\\d{3,3}")); //false 
		//JOptionPane.showMessageDialog(null, "99999-99 " + "99999-99".matches("\\d{5,5}-\\d{3,3}")); //false
		
		//JOptionPane.showMessageDialog(null, "01/01/2001 " + "01/01/2001".matches("\\d{2,2}/\\d{2,2}/\\d{4,4}")); //true 
		
		/*
		 * METACARACTERES de fronteira
		 * 
		 * ^	inicia
		 * $	finaliza
		 * |	ou
		 */
		
		// ^ inicia, Pier, . qualquer caractere, * 0 ou mais vezes
		//JOptionPane.showMessageDialog(null, "Pier21 " + "Pier21".matches("^Pier.*")); //true 
		//JOptionPane.showMessageDialog(null, "Prie21 " + "Prie21".matches("^Pier.*")); //false
		
		//JOptionPane.showMessageDialog(null, "Pier21 " + "Pier21".matches(".*21$")); //true
		
		//JOptionPane.showMessageDialog(null, "tem java aqui " + "tem java aqui".matches(".*java.*")); //true 
		//JOptionPane.showMessageDialog(null, "tem C++ aqui " + "tem C++ aqui".matches(".*java.*")); //false 
		
		//JOptionPane.showMessageDialog(null, "tem C++ aqui " + "tem C++ aqui".matches("^tem.*aqui$")); //true 
		//JOptionPane.showMessageDialog(null, "não tem C++ aqui " + "não tem C++ aqui".matches("^tem.*aqui$")); //false 
		//JOptionPane.showMessageDialog(null, "tem C++ lá " + "tem C++ lá".matches("^tem.*aqui$")); //false 
		
		//JOptionPane.showMessageDialog(null, "sim " + "sim".matches("sim|não")); //true
		//JOptionPane.showMessageDialog(null, "não tem C++ aqui " + "não tem C++ aqui".matches("^tem|não.*aqui$")); //true 
		
		/*
		 * AGRUPADORES
		 * 
		 * [abc]			agrupamento - pode ter "a", pode ter "b" e pode ter "c" minúsculos, caso queira maíusculo só declarar 
		 * [a-z]			alcance - todos os caracteres entre a e z minúsculos, caso queira maíusculo só declarar
		 * [a-e][i-u]		união - de "a" até "e" mais "i" até "u", caso queira maíusculo só declarar
		 * [a-z&&[aeiou]]	interseção todos os caracteres entre a e z mais "aeiou" minúsculos, caso queira maíusculo só declarar
		 * [^abc]			exceção tudo que não seja "abc" minúsculo, caso queira maíusculo só declarar 
		 * [a-z&&[^m-p]]	subtração
		 * \x				fuga literal
		 */
		
		//JOptionPane.showMessageDialog(null, "x " + "x".matches("[a-z]")); //true 
		//JOptionPane.showMessageDialog(null, "2 " + "2".matches("[a-z]")); //false 
		//JOptionPane.showMessageDialog(null, "# " + "#".matches("[a-z]")); //false 
		//JOptionPane.showMessageDialog(null, "X " + "X".matches("[a-z]")); //false 
		//JOptionPane.showMessageDialog(null, "X " + "X".matches("[a-zA-Z]")); //true  
		
		//JOptionPane.showMessageDialog(null, "8 " + "8".matches("[0-9]")); //true 
		//JOptionPane.showMessageDialog(null, "8 " + "8".matches("[0-3]")); //false 

		//JOptionPane.showMessageDialog(null, "True ou true " + "True".matches("[tT]rue")); //true  

		//JOptionPane.showMessageDialog(null, "True, true ou Yes yes " + "Yes".matches("[tT]rue|[yY]es")); //true  
		
		//JOptionPane.showMessageDialog(null, "emanuel " + "emanuel".matches("[A-Z][a-zA-z]*")); //false   
		//JOptionPane.showMessageDialog(null, "Emanuel " + "Emanuel".matches("[A-Z][a-zA-z]*")); //true  

		//JOptionPane.showMessageDialog(null, "olho " + "olho".matches("[^aAbBcC]lho$")); //true  
		//JOptionPane.showMessageDialog(null, "alho " + "alho".matches("[^aAbBcC]lho$")); //false  

		//JOptionPane.showMessageDialog(null, "crau ou creu " + "crau".matches("cr[ae]u")); //true  
		
		//padrão simples de e-mail
		//JOptionPane.showMessageDialog(null, "rh@emanuelvalenti.com " + "rh@emanuelvalenti.com".matches("[a-z]*@emanuelvalenti.com")); //true  
		
		//padrão simples de e-mail curso
		//JOptionPane.showMessageDialog(null, "rh@xti.com " + "rh@xti.com ".matches("\\w+@\\w+\\.\\w{2,3}")); //true  
		
		
		
		/*
		 * A utilização do Pattern, é quando você precisa utilizar essa expressão inumeras vezes.
		 * pois é armazenado para repetidas validações.
		 * o Método matches não é performático, pois ele vai usar o calculo da expressão regular
		 * e exclui-lo ao final da validação.
		 */

		String doce = "Qual é o Doce mais doCe que o doce?";
		
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);		
		
		while(matcher.find()) {
			JOptionPane.showMessageDialog(null, matcher.group());   
		}
		
		/*
		 * SUBSTITUIÇÕES
		 */
		
		JOptionPane.showMessageDialog(null, doce.replaceAll("(?i)doce", "DOCINHO"));
		
		String rato = "O rato roeu a roupa do rei de roma";
		
		JOptionPane.showMessageDialog(null, rato.replaceAll("(?i)r[aeiou]", "XX"));

		JOptionPane.showMessageDialog(null, "Tabular este texto".replaceAll("\\s", "\t"));
		
		String url = "www.emanuelvalenti.com.br/clientes-2011.html";
		// vai para http://www.xti.com.br/2011/clientes.jsp
		
		//padrão da expressão regular para testar se fecha com o conteúdo da URL 
		String re = "www.emanuelvalenti.com.br/\\w{2,}-\\d{4}.html";
		
		JOptionPane.showMessageDialog(null, url.matches(re));
		
		//padrão da expressão regular com declaração de variaveis entre () para a conversão, sequencia será 1 2 3
		re = "(www.emanuelvalenti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		//informar as variaveis em expressão regula usa o $ mais o numero da sequencia de variveis
		JOptionPane.showMessageDialog(null, url.replaceAll(re,"http://$1/$3/$2.jsp"));
	}
}
