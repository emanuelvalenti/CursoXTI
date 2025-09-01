package br.com.emanuelvalenti.threads;


public class Aula096Sincronizada implements Aula096Ponte{

	private int valor = -1;
	private boolean ocupada;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		
		while (this.ocupada) {
			System.out.println("Ponte cheia. Produtor aguarde");
			wait();
		}
		System.out.print("Produziu " + valor);
		this.valor = valor;
		this.ocupada = true;

		this.notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		
		while (!this.ocupada) {
			System.out.println("Ponte vazia. Consumidora aguarde");
			wait();
		}
		
		System.err.print("Consumiu " + valor);
		this.ocupada = false;
		this.notifyAll();
		
		return this.valor;
	}

	
	
}
