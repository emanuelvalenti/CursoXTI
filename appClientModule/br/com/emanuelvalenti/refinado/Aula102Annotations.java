package br.com.emanuelvalenti.refinado;

import java.io.Serializable;

@Aula102Cabecalho(
		criador = "emanuel", 
		dataCriacao = "03/09/2025", 
		instituição = "Curso Emanuel", 
		projeto = "curso", 
		revisao = 2)

@Aula102ErrosCorrigidos(
		erros = {
				"0001",
				"0002"
				}
		)


/**
 * Suprime o erro para o
 * compilador JAVA
 */
@SuppressWarnings("serial")

public class Aula102Annotations implements Serializable{

	/**
	 * Suprime o erro para o
	 * compilador JAVA
	 */
	@SuppressWarnings("unused")
	
	private String naoUtilizada;
	
	
	
	/**
	 * marca o método depreciado
	 * não utilizar no futuro
	 */
	@Deprecated
	public void anotar() {
		
	}
	
	/**
	 * demostra que o método foi
	 * sobreescrito da classe
	 * Pai 
	 */
	@Override
	
	public String toString() {
		return "teste";
	}
	
	
}
