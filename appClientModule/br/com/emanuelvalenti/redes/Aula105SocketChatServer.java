package br.com.emanuelvalenti.redes;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

@SuppressWarnings("unused")
public class Aula105SocketChatServer {

	private ServerSocket server;
	private Socket cliente;

	Aula105SocketChatServer() {

		try {
			server = new ServerSocket(5000);

			while (true) {
				cliente = server.accept();
				new Thread(new EscutaCliente(cliente)).start();;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private class EscutaCliente implements Runnable {

		Scanner leitor;

		public EscutaCliente(Socket socket) {

			try {
				leitor = new Scanner(socket.getInputStream());

			} catch (Exception e) {

			}

		}

		@Override
		public void run() {

			String texto;

			try {
				while ((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

	public static void main(String[] args) {

		new Aula105SocketChatServer();

	}

}
