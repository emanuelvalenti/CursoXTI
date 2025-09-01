package br.com.emanuelvalenti.threads;

public class Aula094ThreadsRunnable implements Runnable{

	
	private String palavra;
	private long tempo;

	public Aula094ThreadsRunnable(String palavra, long tempo) {
		
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		
		
		for (int i = 0; i < 100; i++) {

			try {
				System.out.println(this.palavra);
				Thread.sleep(this.tempo);
			} catch (Exception e) {
				
				return;
			}
			

		}
	}
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Se não fosse uma Thread
		 * a palavra a linhas 2 e 3
		 * só iriam ser executadas
		 * depois que a 1 terminasse
		 * mas neste caso 1 executa
		 * passa para 2, a dois
		 * executa e passa para a 3
		 * enquanto a 1 e a 2
		 * cpntinuam executando seus
		 * códigos e o programa
		 * encerra no mento que todas as 
		 * Threads finalizam.
		 * 
		 * */

		Runnable pong = new Aula093PingPong("Pong", 2000);
		Runnable ping =	new Aula093PingPong("Ping", 1500);
		
		
		
		//1
		new Thread(ping,"ping").start();
		
		//2
		new Thread(pong,"pong").start();
		
		//3	
		System.out.println("Ver Thread PING PONG");
		
	}
}
