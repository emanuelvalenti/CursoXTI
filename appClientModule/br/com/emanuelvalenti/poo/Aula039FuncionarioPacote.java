package br.com.emanuelvalenti.poo;

public class Aula039FuncionarioPacote {

	public static void main(String[] args) {

		Aula039Funcionario funcionario = new Aula039Funcionario();
		
		//funcionario.nome = "Emanuel"; //não é possivel pois não está dentro da mesmas classe
		funcionario.sobreNome = "teste"; //é possivel pois está dentro do mesmo pacote
		funcionario.genero = "teste"; //é possivel pois está pública

		//funcionario.escreveNome(); //não é possivel pois não está dentro da mesmas classe
		funcionario.escreveSobreNome(); //é possivel pois está dentro do mesmo pacote
		funcionario.escreveGenero();; //é possivel pois está pública

		
	}

}
