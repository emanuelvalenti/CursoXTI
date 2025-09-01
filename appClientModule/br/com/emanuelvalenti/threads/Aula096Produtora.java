package br.com.emanuelvalenti.threads;

import java.util.Random;

public class Aula096Produtora implements Runnable {

	private Aula096Ponte ponte;
	
	Aula096Produtora(Aula096Ponte ponte){
		this.ponte = ponte;
	}
	
	@Override
	public void run() {

		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(new Random().nextInt(3000));
				total+=i;
				ponte.set(i);
				System.out.println("\t" + total);
			} catch (Exception e) {
				return;
			}
		}
		
	}

}
