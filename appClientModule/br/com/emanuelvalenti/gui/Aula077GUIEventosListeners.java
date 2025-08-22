package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aula077GUIEventosListeners extends JFrame implements ActionListener{
	
	Aula077GUIEventosListeners(){
		
		super("Eventos Listener");
		
		
		Container container = getContentPane();
		
		container.setLayout(new BorderLayout());
		
		JButton botao = new JButton("ok");
		
		botao.addActionListener(this);
		
		container.add(BorderLayout.CENTER, botao );
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("clicou");
		
	}
	
	
	public static void main(String[] args) {
		
		new Aula077GUIEventosListeners();
		
	}


}
