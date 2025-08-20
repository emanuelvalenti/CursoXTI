package br.com.emanuelvalenti.poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Aula067SerializacaoTransient {

	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Emanuel");
		nomes.add("Natalí");
		nomes.add("Spock");
		nomes.add("Anakin");
		
		FileOutputStream fos = new FileOutputStream("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/objeto.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(nomes);
		
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/objeto.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<String> nomesInput = (ArrayList<String>) ois.readObject();
		
		for (String nome : nomesInput) {
			System.out.println(nome);
		}
		
		ois.close();
		
		
	}
}
