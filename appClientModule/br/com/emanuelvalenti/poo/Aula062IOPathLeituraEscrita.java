package br.com.emanuelvalenti.poo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Aula062IOPathLeituraEscrita {
	
	public static void main(String[] args) throws IOException{
		
		
		Path path = Paths.get("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/texto.txt");
		
		//retorna o caminho absoluto do arquivo
		JOptionPane.showMessageDialog(null, path.toAbsolutePath());
		
		//retorna o diretório pai de onde o arquivo está
		JOptionPane.showMessageDialog(null, path.getParent());
		
		//raiz do sistema
		JOptionPane.showMessageDialog(null, path.getRoot());
		
		//nome do arquivo
		JOptionPane.showMessageDialog(null, path.getFileName());
		
		/*
		 * criar o diretório
		 * 
		 * */
		if (Files.notExists(path.getParent())) 
		{
			Files.createDirectory(path.getParent());
		}
		
		//cria um arquivo vazio
		//Files.createFile(path.toAbsolutePath());
		
		
		
		/*
		 * Escrever e ler arquivos
		 * */
			
		
		Files.write(path, "Meu texto".getBytes()); //cria limpa e escreve o texto;
		
		JOptionPane.showMessageDialog(null, new String(Files.readAllBytes(path)));
		
	}

}
