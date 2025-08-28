package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aula082GUIJComboBox extends JFrame implements ItemListener{

	private Container container;
	private JComboBox<String> comboBox;
	private JLabel label;
	private ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("eagle.png")),
			new ImageIcon(getClass().getResource("face.png")),
			new ImageIcon(getClass().getResource("glasses.png")),
			new ImageIcon(getClass().getResource("moonlight.png"))
	};
	
	
	Aula082GUIJComboBox(){
		super("JComboBox");
		
		container = getContentPane();
		
		comboBox = new JComboBox<String>();
		label = new JLabel(imagens[0]);

		
		comboBox.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,26));
		comboBox.addItem("eagle");
		comboBox.addItem("face");
		comboBox.addItem("glasses");
		comboBox.addItem("moonlight");
		comboBox.addItemListener(this);
		
		container.add(BorderLayout.NORTH,comboBox);
		container.add(BorderLayout.CENTER,label);
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 600);

		
	}
	
	
	
	public static void main(String[] args) {

		new Aula082GUIJComboBox();

	}



	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			label.setIcon(imagens[comboBox.getSelectedIndex()]);
			
		}
		
	}

}
