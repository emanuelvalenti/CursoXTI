package br.com.emanuelvalenti.refinado;

public class Aula101DocumentacaoJavadocMarcas {

/**
 * <p>
 * Um exemplo de como usar
 * Documentação para o javadoc
 * </p>
 * 
 * @author emanuel.valenti
 * @version 1.3
 * @since 1.0
 * 
 * @see Aula097GarbageCollector
 * @see Aula098ClassesAninhadasAnonimas
 * 
 * 
 * 
 */
	
	
	private String teste;
	
	
	/**
	 * <p>
	 * 	despeja dados para 
	 *  variável privada
	 * </p>
	 * @param teste
	 * @throws sem erros
	 * 
	 */
	
	public void setTeste(String teste) {
		
		this.teste = teste;
	}

	/**
	 * <p>
	 * 	carrega dados da 
	 *  variável privada
	 * </p>
	 * @param teste
	 * @throws sem erros
	 * 
	 */
	
	public String getTeste() {
		
		return this.teste;
	}
	
	
	
}
