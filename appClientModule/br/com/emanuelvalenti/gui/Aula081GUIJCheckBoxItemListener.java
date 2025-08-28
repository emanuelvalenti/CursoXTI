package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Aula081GUIJCheckBoxItemListener extends JFrame {

	private Container container;
	private JCheckBox bold;
	private JCheckBox italic;
	private JTextField texto;

	Aula081GUIJCheckBoxItemListener() {

		super("JCheckBox e ItemListener");

		container = getContentPane();

		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		texto = new JTextField();

		bold.addItemListener(new checkBoxBold());
		italic.addItemListener(new checkBoxItalic());

		texto.setText("Veja a Fonte mudar!!!");
		texto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
		;
		texto.setSize(100, 100);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
		add(texto);
		add(bold);
		add(italic);

	}

	class checkBoxBold implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			stateCheckBoxes();

		}

	}

	class checkBoxItalic implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			stateCheckBoxes();
		}

	}

	private void stateCheckBoxes() {

		if (bold.isSelected() && italic.isSelected()) {
			texto.setFont(new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 26));
		} else if (italic.isSelected()) {
			texto.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 26));
		} else if (bold.isSelected()) {
			texto.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 26));
		} else if (!bold.isSelected() && !italic.isSelected()) {
			texto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
		}

	}

	public static void main(String[] args) {

		new Aula081GUIJCheckBoxItemListener();

	}

}
