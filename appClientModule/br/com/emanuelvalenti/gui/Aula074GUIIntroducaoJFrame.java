package br.com.emanuelvalenti.gui;


import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

/*
 * como seria a declaração
 * não extendendo da JFrame
 * 
public class Aula074GUIIntroducaoJFrame {

	public Aula074GUIIntroducaoJFrame() {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Clique");
		
		frame.getContentPane().add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Aula074GUIIntroducaoJFrame();
		
	}
	
	
}
 * */

/*
 * Método extendendo da JFrame
 * */

public class Aula074GUIIntroducaoJFrame extends JFrame{

	public Aula074GUIIntroducaoJFrame() {
		
		super("Minha Janela");

		JButton button = new JButton("Clique Aqui");
		
		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Aula074GUIIntroducaoJFrame();
		
	}
	
	
}
