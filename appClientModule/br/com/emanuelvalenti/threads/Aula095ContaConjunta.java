package br.com.emanuelvalenti.threads;

public class Aula095ContaConjunta extends Thread{

	private int saldo = 100;

	
	void setSaldo(int saldo) {
		this.saldo = saldo;
		
	}
	
	int getSaldo() {
		return this.saldo;
		
	}
	

	synchronized void sacar(int valor, String cliente) {

		int saldoOriginal = this.saldo;
		
		if(saldo>= valor) {
			System.out.println(cliente + " vai sacar.");
			
			try {
				System.out.println("Processando.");
				Thread.sleep(1000);
				this.saldo -= valor;
			} catch (Exception e) {
				return;
			}
			
			System.out.println(cliente + " sacou " + valor);
			System.out.println("Saldo Original = " + saldoOriginal + "\nSaldo atual = " + this.saldo);
			
		} else {
			System.out.println(cliente + " saldo insuficiente.");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
