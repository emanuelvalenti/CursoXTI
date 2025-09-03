package br.com.emanuelvalenti.redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Aula106SocketChatServer {

	private ServerSocket server;
	private Socket cliente;
	List<PrintWriter> escritores = new ArrayList<PrintWriter>();

	Aula106SocketChatServer() {

		try {
			server = new ServerSocket(5000);

			while (true) {
				cliente = server.accept();
				new Thread(new EscutaCliente(cliente)).start();
				escritores.add(new PrintWriter(cliente.getOutputStream()));

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void encaminharParaTodos(String texto) {

		try {
			for (PrintWriter escritor : escritores) {
				escritor.println(texto);
				escritor.flush();
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
					encaminharParaTodos(texto);
					System.out.println(texto);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

	public static void main(String[] args) {

		new Aula106SocketChatServer();

	}

}
