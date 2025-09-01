package br.com.emanuelvalenti.threads;

import java.util.Random;

public class Aula096Consumidor implements Runnable{

	
	private Aula096Ponte ponte;
	
	Aula096Consumidor(Aula096Ponte ponte){
		this.ponte = ponte;
	}
	
	@Override
	public void run() {

		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(new Random().nextInt(3000));
				total+=	ponte.get();
				System.err.println("\t" + total);
			} catch (Exception e) {
				return;
			}
		}
		
	}
	
	
}
