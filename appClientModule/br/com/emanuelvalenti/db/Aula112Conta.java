package br.com.emanuelvalenti.db;

public class Aula112Conta {

	
	int numero;
	String cliente;
	double saldo;
	
	Aula112Conta(int numero,String cliente, double saldo){
		
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		
		
	}
	
	@Override
	public String toString() {
		return numero + "," + cliente + "," + saldo; 
		
	}
	
	
	
	
}
