package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Aula076GUIGridLayoutComposicao extends JFrame{
	
	Aula076GUIGridLayoutComposicao(){
		super("Grid Layout");

		Container containerPrincipal = getContentPane();
		containerPrincipal.setLayout(new BorderLayout());
		
		Container containerDireita = new JPanel();
		
		containerDireita.setLayout(new GridLayout(4,1));
		
		containerDireita.add(new JButton("OK"));
		containerDireita.add(new JButton("CANCEL"));
		containerDireita.add(new JButton("SETUP"));
		containerDireita.add(new JButton("HELP"));

		
		containerPrincipal.add(BorderLayout.CENTER,new JButton("CENTRO"));
		containerPrincipal.add(BorderLayout.EAST,containerDireita);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		new Aula076GUIGridLayoutComposicao();
	}

}
