package br.com.emanuelvalenti.logica;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Aula022ArrayList {

	public static void main (String[] Args) {
		
		ArrayList<String> cores = new ArrayList<>();
		
		cores.add("Branco");
		
		JOptionPane.showMessageDialog(null, cores.getFirst());

		cores.add("Vermelho");
		
		JOptionPane.showMessageDialog(null, cores.getLast());

		JOptionPane.showMessageDialog(null, cores.toString());
		
		cores.add("Azul");
		cores.add("Amarelo");
		cores.add("Preto");
		cores.add("Cinza");
		
		Random aleatorio = new Random();
		
		JOptionPane.showMessageDialog(null, cores.get(aleatorio.nextInt(cores.size())));

		JOptionPane.showMessageDialog(null, "A cor preto está na posição " + String.valueOf(cores.indexOf("Preto")));

		JOptionPane.showMessageDialog(null, "A cor roxo está no Array? " + (cores.contains("Roxo") ? "SIM" : "NÃO"));

		cores.add("Roxo");
		
		JOptionPane.showMessageDialog(null, "A cor roxo agora está no Array? " + (cores.contains("Roxo") ? "SIM" : "NÃO"));
		
		cores.remove("Roxo");
		
		JOptionPane.showMessageDialog(null, "A cor roxo ainda está no Array? " + (cores.contains("Roxo") ? "SIM" : "NÃO"));
		
		cores = null;
		aleatorio = null;
		
	}
	
}
