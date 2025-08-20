package br.com.emanuelvalenti.poo;

import java.io.Serializable;

class Aula064Conta implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cliente;
	private Double saldo;
	
	/*
	 * Transient é uma propriedade que não será armazenada,
	 * caso apartir dessa classe seja criado um arquivo
	 * FileObjectStream, conforme foi usado na classe
	 * Aula068SerializacaoContas
	 * */
	transient private String Senha; 

	Aula064Conta() {
		// TODO Auto-generated constructor stub
	}

	Aula064Conta(String cliente, Double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	String getCliente() {
		
		return cliente;
	}
	
	
	String exibeSaldo() {

		return "Cliente " + cliente + ": Seu saldo é R$ " + saldo + ".\n";
	}

	String saca(Double valor) {

		String retorno = null;
		if (valor.isNaN() || valor == 0) {
			retorno = "Informe um valor para efetuar o saque!\n";
		} else if (valor > this.saldo) {
			retorno = "Valor informado excede o saldo da conta!\n" + this.exibeSaldo();
		} else {
			this.saldo -= valor;
			retorno =  "Valor sacado com sucesso!\n" + this.exibeSaldo();
		}
		
		return retorno;

	}

	String deposita(Double valor) {
		
		String retorno = null;
		if (valor.isNaN() || valor == 0) {
			retorno =  "Informe um valor para efetuar o depósito!\n";
		} else {
			this.saldo += valor;
			retorno =  "Valor depositado com sucesso!\n" + this.exibeSaldo();
		}
		
		return retorno;

	}	
	
	
}
