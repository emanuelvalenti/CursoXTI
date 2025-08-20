package br.com.emanuelvalenti.poo;


public class Aula039Funcionario {


	private String nome;
	
	String sobreNome;
	
	public String genero;
	
	public static void main(String[] args) {
		
		Aula039Funcionario funcionario = new Aula039Funcionario();
		
		funcionario.nome = "teste"; //é possivel pois está dentro da mesmas classe
		funcionario.sobreNome = "teste"; //é possivel pois está dentro da mesma classe e mesmo pacote
		funcionario.genero = "teste"; //é possivel pois está pública
		
		funcionario.escreveNome(); //é possivel pois está dentro da mesmas classe
		funcionario.escreveSobreNome(); //é possivel pois está dentro da mesma classe e mesmo pacote
		funcionario.escreveGenero(); //é possivel pois está pública
		
		
	}
	
	private void escreveNome() {
		
		this.nome = "teste"; //é possivel pois está dentro da mesmas classe
		
	}

	void escreveSobreNome() {
		
		this.sobreNome = "teste"; //é possivel pois está dentro da mesmas classe
		
	}
	
	public void escreveGenero() {
		
		this.genero = "teste";
	}
	
	
}
