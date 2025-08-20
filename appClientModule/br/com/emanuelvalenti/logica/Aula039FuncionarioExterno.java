package br.com.emanuelvalenti.logica;

import br.com.emanuelvalenti.poo.Aula039Funcionario;

public class Aula039FuncionarioExterno {

	public static void main(String[] args) {
	
		Aula039Funcionario funcionario = new Aula039Funcionario();
		
		//funcionario.nome = "Emanuel"; //não é possivel pois não está dentro da mesmas classe
		//funcionario.sobreNome = "teste"; //não é possivel pois está dentro de outro pacote
		funcionario.genero = "teste"; //é possivel pois está pública

		//funcionario.escreveNome(); //não é possivel pois não está dentro da mesmas classe
		//funcionario.escreveSobreNome(); //não é possivel pois não está dentro do mesmo pacote
		funcionario.escreveGenero(); //é possivel pois está pública

	}
	
}
