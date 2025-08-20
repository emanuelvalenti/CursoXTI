package br.com.emanuelvalenti.poo;

import java.io.FilePermission;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import javax.swing.JOptionPane;



class Aula065IOCreateDeleteCopyMove {

	static private Path path = Paths.get("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/conta.txt");
	
	
	static Path getPath() {
		return path;
	}
	
	
	
	public static void main(String[] args) throws IOException{
	
		/*
		 * Existe o arquivo?
		 * */
		JOptionPane.showMessageDialog(null, Files.exists(Aula065IOCreateDeleteCopyMove.getPath())); //true
		
		/*
		 * É um diretório?
		 * */
		JOptionPane.showMessageDialog(null, Files.isDirectory(Aula065IOCreateDeleteCopyMove.getPath())); //false
		

		/*
		 * É um arquivo regular, texto imagem etc
		 * */
		JOptionPane.showMessageDialog(null, Files.isRegularFile(Aula065IOCreateDeleteCopyMove.getPath())); //true
		
		/*
		 * É um arquivo que pode ser lido?
		 * */
		JOptionPane.showMessageDialog(null, Files.isReadable(Aula065IOCreateDeleteCopyMove.getPath())); //true
		
		/*
		 * É um arquivo que pode ser executado?
		 * */
		JOptionPane.showMessageDialog(null, Files.isExecutable(Aula065IOCreateDeleteCopyMove.getPath())); //true
		

		/*
		 * tamanho de um arquivo, esse comando deve ser tratado por IOException
		 * */
		JOptionPane.showMessageDialog(null, Files.size(Aula065IOCreateDeleteCopyMove.getPath())); 
		
		/*
		 * última vez que o arquivo foi executado
		 * */
		JOptionPane.showMessageDialog(null, Files.getLastModifiedTime(Aula065IOCreateDeleteCopyMove.getPath())); 
		
		/*
		 * o dono do arquivo
		 * */
		JOptionPane.showMessageDialog(null, Files.getOwner(Aula065IOCreateDeleteCopyMove.getPath())); 

		/*
		 * tipo do arquivo
		 * */
		JOptionPane.showMessageDialog(null, Files.probeContentType(Aula065IOCreateDeleteCopyMove.getPath())); 

		
		/*
		 * exclusão de arquivos
		 * 
		 * Files.delete(path); //deleta o arquivo tem outros tratamento de erro não apenas o IOException
		 * Files.deleteIfExists(path); //deleta o arquivo se ele existir.
		 * 
		 * */
		
		/*
		 * Criando um arquivo
		 * 
		 * */

		Files.createFile(Paths.get(path.getParent().toString() + "/novoArquivo.txt"));
		
		/*
		 * Escrever um arquivo pequeno
		 * 
		 * */
		
		Files.write(Paths.get(path.getParent().toString() + "/novoArquivo.txt"), "novo conteúdo".getBytes(),StandardOpenOption.TRUNCATE_EXISTING);
		
		/*
		 * Copia um arquivo
		 * Caso exista ele substitui
		 * */
		
		Files.copy(Paths.get(path.getParent().toString() + "/novoArquivo.txt"), Paths.get(path.getParent().toString() + "/novoCopiaArquivo.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		
		/*
		 * Move um arquivo
		 * */
		Files.move(Paths.get(path.getParent().toString() + "/novoArquivo.txt"), Paths.get(path.getParent().toString() + "/maisNovoArquivo.txt"),StandardCopyOption.REPLACE_EXISTING);

		
		/*
		 * Cria um diretório
		 * */
		
		Files.createDirectory(Paths.get(path.getParent().toString() + "/teste"));
		
	}
 
}
