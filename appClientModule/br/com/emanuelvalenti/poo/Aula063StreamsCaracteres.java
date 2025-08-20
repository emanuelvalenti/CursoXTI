package br.com.emanuelvalenti.poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Aula063StreamsCaracteres {

	public static void main (String[] args) throws IOException {
		
		Path path = Paths.get("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/texto.txt");
		

		/*
		 * Método anterior ao java 7
		 * */

		BufferedWriter bw = null;

	
		try {
			/*
			 * Abre o arquivo
			 * */
			bw =  Files.newBufferedWriter(path, StandardCharsets.UTF_8);
	
			
			/*
			 * escreve na memória
			 * */
			bw.write("Texto");
			bw.write("Texto");
			
			
			/*
			 * transfere da memória e grava no arquivo
			 * usado mais quando o arquivo foi muito grande
			 * Quando chegar em uma cota grava para prosseguir
			 * a popuação do arquivo
			 * */
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			/*
			 * fecha o arquivo
			 * */
			if (bw != null) {
				
				/*
				 * Trasnfere da memória para dentro do arquivo e fecha o arquivo
				 * */
				bw.close();
			}
			
		}
		
		/*
		 * Método java 7 em diante
		 * */

		/*
		 * BufferedWriter implementa da interface Closeable, em try
		 * ao encerrar automaticamente grava e fecha o arquivo
		 * */
		try (BufferedWriter bw1 = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
				
			/*
			 * escreve na memória
			 * */
			bw1.write("Texto");
			bw1.write("Texto");
			
			
			/*
			 * transfere da memória e grava no arquivo
			 * */
			bw1.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				
				JOptionPane.showMessageDialog(null, line);
				
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
