package br.com.emanuelvalenti.threads;


public class Aula095ThreadsSynchronized implements Runnable{

	
	Aula095ContaConjunta conta = new Aula095ContaConjunta();
	
	
	@Override
	public void run() {

		for(int i = 0; i < 5; i++) {
		
			conta.sacar(20, Thread.currentThread().getName());
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		}
	}
	
	
	
	public static void main(String[] args) {

		Aula095ThreadsSynchronized irAsCompras = new Aula095ThreadsSynchronized();
		
		new Thread(irAsCompras,"Pai").start(); 
		new Thread(irAsCompras,"Mãe").start(); 
		new Thread(irAsCompras,"Filha").start(); 
		new Thread(irAsCompras,"Babá").start(); 
		
		
	}

	
	
}
