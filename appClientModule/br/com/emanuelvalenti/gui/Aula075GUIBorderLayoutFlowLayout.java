package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Aula075GUIBorderLayoutFlowLayout extends JFrame {

	Aula075GUIBorderLayoutFlowLayout(){
		
		super("Layouts");
		

		/*
		 * BorderLayout
		 * */
		/*
		Container container = getContentPane();
		BorderLayout border = new BorderLayout();
		container.setLayout(border);
		
		container.add(BorderLayout.NORTH,new Button("1"));
		container.add(BorderLayout.SOUTH,new Button("2"));
		container.add(BorderLayout.CENTER,new Button("3"));
		container.add(BorderLayout.EAST,new Button("5"));
		container.add(BorderLayout.WEST,new Button("4"));
		*/

		/*
		 * FlowLayout
		 * */
		Container container = getContentPane();
		FlowLayout flow = new FlowLayout();
		container.setLayout(flow);
		
		container.add(new Button("1"));
		container.add(new Button("2"));
		container.add(new Button("3"));
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Aula075GUIBorderLayoutFlowLayout();

	}

}
