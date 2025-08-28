package br.com.emanuelvalenti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Aula078GUIJlabelImageIcon extends JFrame implements ActionListener{

	Aula078GUIJlabelImageIcon(){
		
		super("Label Icon");
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
		
		Container container = getContentPane();
		
		JLabel label = new JLabel("Label simples");
		label.setToolTipText("Meu tooltip");
		
		container.setLayout(new FlowLayout());
		
		container.add(label);
		
	
		JLabel fonteDiferente = new JLabel("Fonte Diferente");
		
		Font fonte = new Font("serif", Font.BOLD, 12);
		
		fonteDiferente.setFont(fonte);
		fonteDiferente.setForeground(Color.blue);
		
		container.add(fonteDiferente);
		
		
		/*
		 * referente a essa classe, 
		 * na estrutura recupera recurso que estão próxio, incluido estrutura de arquivos
		 * */
		ImageIcon imagem = new ImageIcon(getClass().getResource("lampada.jpg")); 
		JLabel icone = new JLabel(imagem);
		
		container.add(icone);
	
		
		
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		new Aula078GUIJlabelImageIcon();
		
	}
	
	
	
	
}
