package br.com.emanuelvalenti.poo;

class Aula040Funcionario {
	
	private String nome;
	
	private Boolean ativo;
	
	String getNome(){
		
		return this.nome;
	}
	
	void setNome(String nome) {
		
		
		this.nome = nome;
		
	}
	
	Boolean isAtivo() {
		
		return this.ativo;
	}
	
	void setAtivo(Boolean ativo) {
		
		this.ativo = ativo;
		
	}

}
