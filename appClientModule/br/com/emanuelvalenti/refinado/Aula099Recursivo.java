package br.com.emanuelvalenti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula099Recursivo {

	public int somaUm(int x) {
		
		if (x == 10) {
			return x;
		} else {
			x++;
			return somaUm(x);
		}
	}
	
	public int potencia(int x, int e) {
		
		if (e == 1) {
			return x;
		}
		e--;
		return x * potencia(x,e);
	} 
	
	public void listar (Path path) {
		
		if (Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		} else if(Files.isDirectory(path)) {
			System.out.println(path.toAbsolutePath().toString().toUpperCase());
			try (DirectoryStream<Path> stream =  Files.newDirectoryStream(path)){
				for (Path path2 : stream) {
					listar(path2);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Aula099Recursivo recursivo = new Aula099Recursivo();
		
		
		System.out.println(recursivo.somaUm(0));
		
		System.out.println(recursivo.potencia(2,3));
		
		recursivo.listar(Paths.get("C:/obs"));

	}

}
