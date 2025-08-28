package br.com.emanuelvalenti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Aula083GUIJTextAreaJFileChooser extends JFrame {

	private JTextArea areaTexto;
	private JButton botao;
	private JScrollPane areaTextoScroll;
	
	class SelecionarArquivo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser escolhedor = new JFileChooser();
			escolhedor.showOpenDialog(areaTexto);
			File file = escolhedor.getSelectedFile();
			
			try {
				Path path = Paths.get(file.getAbsolutePath());
				
				areaTexto.setText(new String(Files.readAllBytes(path)));
				
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "não foi possivel carregar o arquivo!");
			}
		}
		
	}
	
	
	public Aula083GUIJTextAreaJFileChooser() {
		super("JTextArea e JFileChooser");
		
		
		areaTexto = new JTextArea();
		botao = new JButton("Abrir Arquivo");
		
		botao.addActionListener(new SelecionarArquivo());
		botao.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 12));
		
		
		areaTexto.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 26));
		
		areaTextoScroll = new JScrollPane(areaTexto);
				
		Container container = getContentPane();
		
		container.add(BorderLayout.CENTER,areaTextoScroll);
		container.add(BorderLayout.NORTH,botao);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Aula083GUIJTextAreaJFileChooser();

	}

}
