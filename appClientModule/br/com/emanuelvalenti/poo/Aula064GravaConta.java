package br.com.emanuelvalenti.poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula064GravaConta {

	
	static ArrayList<Aula064Conta> criarContas() {
		
		ArrayList<Aula064Conta> contas = new ArrayList<Aula064Conta>();
		
		contas.add(new Aula064Conta("Emanuel",12000.00)); 
		contas.add(new Aula064Conta("Natalí",10000.00)); 
		contas.add(new Aula064Conta("Spock",15000.00)); 
		contas.add(new Aula064Conta("Anakin",13000.00));

		return contas;
		
	}
	
	static void exibeConteudoArquivo(Path path) throws IOException {
		
		BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			
			String linha;
			while((linha = br.readLine()) != null) {
				JOptionPane.showMessageDialog(null, linha);
			}
			
			br.close();
			
	}
	
	static Path armazenarContas(ArrayList<Aula064Conta> contas) throws IOException {

		Path path = Paths.get("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/conta.txt");
		
		BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
		
		for (Aula064Conta aula064Conta : contas) {
			
			switch (aula064Conta.getCliente()){
				case "Emanuel": {
					bw.write(aula064Conta.exibeSaldo());
					bw.write(aula064Conta.saca(1500.00));
					break;
				}
				case "Spock": {
					bw.write(aula064Conta.exibeSaldo());
					bw.write(aula064Conta.deposita(1500.00));
					break;
				}
				case "Anakin": {
					bw.write(aula064Conta.exibeSaldo());
					bw.write(aula064Conta.deposita(500.00));
					break;
				}
				case "Natalí": {
					bw.write(aula064Conta.exibeSaldo());
					bw.write(aula064Conta.saca(500.00));
					break;
				}
			}
		}
		
		bw.close();
		
		return path;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		try {
			Aula064GravaConta.exibeConteudoArquivo(Aula064GravaConta.armazenarContas(Aula064GravaConta.criarContas()));
		} catch (IOException e ) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
