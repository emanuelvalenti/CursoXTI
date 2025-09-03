package br.com.emanuelvalenti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Aula105SocketChat extends JFrame {

	private Socket socket;
	private PrintWriter escreve;
	private JTextField texto;
	private JButton enviar;
	private String nome;

	Aula105SocketChat(String nome) {
		super("Chat : " + nome);
		this.nome = nome;

		Container container = getContentPane();
		Font fonte = new Font(Font.SERIF, Font.PLAIN, 26);
		configurarRede();

		texto = new JTextField();
		enviar = new JButton("Enviar");

		texto.setFont(fonte);
		enviar.setFont(fonte);
		enviar.addActionListener(new BotaoEnviar());

		container.setLayout(new BorderLayout());

		container.add(BorderLayout.CENTER, texto);
		container.add(BorderLayout.EAST, enviar);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 90);

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

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

		new Aula105SocketChat("Emanuel");
		new Aula105SocketChat("Natalí");

	}

}
