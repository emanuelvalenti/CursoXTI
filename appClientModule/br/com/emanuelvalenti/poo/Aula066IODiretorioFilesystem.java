package br.com.emanuelvalenti.poo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Aula066IODiretorioFilesystem {

	static private Path path = Paths.get("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files");
	
	
	public static void main(String[] args) throws IOException{
		

		/*
		 * Acessa o filesystem padrão e recupera os diretórios
		 * */
		
		
		
		Iterable<Path> caminhos =  FileSystems.getDefault().getRootDirectories();
		
		for (Path path : caminhos) {
			
			JOptionPane.showMessageDialog(null, path.toString());
		}
		
		/*
		 * Listar o conteúdo de um diretório
		 * */
		

		DirectoryStream<Path> conteudos = Files.newDirectoryStream(path);
		
		for (Path diretorio : conteudos) {
			
			JOptionPane.showMessageDialog(null, diretorio.getFileName().toString());
		}
		
		/*
		 * Partições
		 * */
		
		Iterable<FileStore> particoes =  FileSystems.getDefault().getFileStores();
		
		for (FileStore particao : particoes) {
			
			JOptionPane.showMessageDialog(null, particao.toString());
			JOptionPane.showMessageDialog(null, particao.getTotalSpace());
			JOptionPane.showMessageDialog(null, particao.getUnallocatedSpace() / 1024);
		} 
		
		
		
		

	}

}
