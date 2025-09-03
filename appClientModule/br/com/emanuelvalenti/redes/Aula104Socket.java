package br.com.emanuelvalenti.redes;

import java.net.Socket;
import java.util.Scanner;

public class Aula104Socket {

	@SuppressWarnings("unused")
	private static Socket socket;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		socket = new Socket("127.0.0.1", 5000);
		
		Scanner scanner = new Scanner(socket.getInputStream());
		
		System.out.println(scanner.nextLine());
	}
	
}
