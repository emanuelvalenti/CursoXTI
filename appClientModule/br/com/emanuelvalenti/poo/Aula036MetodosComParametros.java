package br.com.emanuelvalenti.poo;

import javax.swing.JOptionPane;

public class Aula036MetodosComParametros {

	public String cliente;
	public Double saldo;

	public Aula036MetodosComParametros() {
		// TODO Auto-generated constructor stub
	}

	public Aula036MetodosComParametros(String cliente) {
		this.cliente = cliente;
	}
	
	
	public void exibeSaldo() {

		JOptionPane.showMessageDialog(null, "Cliente " + cliente + ": Seu saldo é R$ " + saldo + ".");
	}

	public void saca(Double valor) {

		if (valor.isNaN() || valor == 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor para efetuar o saque!");
		} else if (valor > this.saldo) {
			JOptionPane.showMessageDialog(null, "Valor informado excede o saldo da conta!");
			this.exibeSaldo();
		} else {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, "Valor sacado com sucesso!");
			this.exibeSaldo();
		}

	}

	public void deposita(Double valor) {
		if (valor.isNaN() || valor == 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor para efetuar o depósito!");
		} else {
			this.saldo += valor;
			JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!");
			this.exibeSaldo();
		}

	}

	public void transferePara(Aula036MetodosComParametros destino, Double valor) {

		if (destino.cliente.isBlank()) {
			JOptionPane.showMessageDialog(null, "Informe um destinatário para transferência!");
		} else if (valor.isNaN() || valor == 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor para transferência!");
		} else if (valor > this.saldo) {
			JOptionPane.showMessageDialog(null, "O valor informado para transferência excede o saldo em conta!");
		} else {
			destino.deposita(valor);
			this.saca(valor);
			JOptionPane.showMessageDialog(null, "Valor transferido com sucesso!");
			this.exibeSaldo();
			
		}

	}
}
