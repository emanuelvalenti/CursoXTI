package br.com.emanuelvalenti.threads;

public class Aula096ThreadsWaitNotifyAll {

	
	
	
	
	public static void main(String[] args) {

		/*
		Aula096Ponte ponteNS = new Aula096NaoSincronizada();
		
		new Thread(new Aula096Produtora(ponteNS)).start();
		new Thread(new Aula096Consumidor(ponteNS)).start();
		*/
		
		Aula096Ponte ponteS = new Aula096Sincronizada();
		
		new Thread(new Aula096Produtora(ponteS)).start();
		new Thread(new Aula096Consumidor(ponteS)).start();

	}

}
