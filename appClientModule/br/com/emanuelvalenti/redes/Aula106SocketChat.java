package br.com.emanuelvalenti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Aula106SocketChat extends JFrame {

	private Socket socket;
	private PrintWriter escreve;
	private JTextField texto;
	private JScrollPane textoScrollRecebido;
	private JTextArea textoRecebido;
	private JButton enviar;
	private String nome;
	private Scanner leitor;

	Aula106SocketChat(String nome) {
		super("Chat : " + nome);
		this.nome = nome;

		Container container = getContentPane();
		Font fonte = new Font(Font.SERIF, Font.PLAIN, 26);
		configurarRede();

		textoRecebido = new JTextArea();
		texto = new JTextField();
		enviar = new JButton("Enviar");

		textoRecebido.setFont(fonte);
		textoRecebido.setEnabled(false);
		texto.setFont(fonte);
		enviar.setFont(fonte);
		enviar.addActionListener(new BotaoEnviar());

		textoScrollRecebido = new JScrollPane(textoRecebido);

		container.setLayout(new BorderLayout());
		Container grid = new JPanel();

		grid.setLayout(new GridLayout(1, 2));

		grid.add(texto);
		grid.add(enviar);
		container.add(BorderLayout.CENTER, textoScrollRecebido);
		container.add(BorderLayout.SOUTH, grid);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 400);

	}

	private class EscutaServidor implements Runnable {

		@Override
		public void run() {

			String texto;

			try {

				while ((texto = leitor.nextLine()) != null) {
					textoRecebido.append(texto + "\n");
				}
			} catch (Exception e) {
			}

		}

	}

	private class BotaoEnviar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			escreve.println(nome + " : " + texto.getText());
			escreve.flush();
			texto.setText("");
			texto.requestFocus();
		}

	}

	private void configurarRede() {

		try {
			socket = new Socket("127.0.0.1", 5000);
			escreve = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new Aula106SocketChat("Emanuel");
		new Aula106SocketChat("Natalí");

	}

}
