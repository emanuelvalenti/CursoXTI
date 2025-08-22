package br.com.emanuelvalenti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Aula079GUIJTextFieldJPasswordFieldInnerClass extends JFrame implements ActionListener{

	private JButton botaoOk;
	private JButton botaoCancela;
	
	private Label login, senha;
	private JTextField campoLogin;
	private JPasswordField campoSenha;

	
	
	
	Aula079GUIJTextFieldJPasswordFieldInnerClass(){
		super("Text Field Password and InnerClass");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(3,2));

		botaoOk = new JButton("OK");
		botaoCancela = new JButton("Cancela");
		login = new Label("Login:");
		senha = new Label("Senha");
		campoLogin = new JTextField();
		campoSenha = new JPasswordField();
		
		/*
		 * O this é quando usamos a implementação ActionListener
		 * da classe Aula079GUIJTextFieldJPasswordFieldInnerClass
		 * */
		/*
		botaoOk.addActionListener(this);
		botaoCancela.addActionListener(this);
		*/
		
		/*
		 * melhor prática usar as InnerClass's
		 * BotaoOkListener
		 * BotaoCancelaListener
		 * */
		botaoOk.addActionListener(new BotaoOkListener());
		botaoCancela.addActionListener(new BotaoCancelaListener());
		
		container.add(login);
		container.add(campoLogin);
		container.add(senha);
		container.add(campoSenha);
		container.add(botaoOk);
		container.add(botaoCancela);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
	}
	
	
	/*
	 * Classe que trata o botão através
	 * de 
	 * */
	class BotaoOkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Login: " + campoLogin.getText() + ", Senha: " + new String(campoSenha.getPassword()) + ".");	
		}
		
	}
	
	class BotaoCancelaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			campoLogin.setText("");
			campoSenha.setText("");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Aula079GUIJTextFieldJPasswordFieldInnerClass();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
		 * este código funciona caso 
		 * queria que todos os eventos sejam
		 * tratados em um unico lugar,
		 * porém iss não é uma boa prática
		 * o método mais aconselhável é o de
		 * InnerClass que está rá neste mesmo
		 * programa acima
		 * 
		 * */
		
		/*
		if (e.getSource() == botaoOk) {
			System.out.println("Login: " + campoLogin.getText() + ", Senha: " + new String(campoSenha.getPassword()) + ".");	
		} else {
			campoLogin.setText("");
			campoSenha.setText("");
		}
		*/
		
		
	}

}
