package br.com.emanuelvalenti.redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Aula104SocketServer {

	private static ServerSocket server;
	private static Socket cliente;
	
	
	public static void main(String[] args) throws Exception {

		server = new ServerSocket(5000);

		;
		
		while (true) {
			cliente = server.accept();
			try(PrintWriter escreve = new PrintWriter(cliente.getOutputStream())) {
				escreve.println("Aprenda java e seja contratado");
			}
		}
		

	}

}
