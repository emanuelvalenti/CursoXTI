package br.com.emanuelvalenti.logica;
import javax.swing.JOptionPane;

public class Aula012Janela {

	public static void main (String[] args) {
		
		String nome  = JOptionPane.showInputDialog("Informe seu nome");
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		
	}
	
}
