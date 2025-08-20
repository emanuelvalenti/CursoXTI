package br.com.emanuelvalenti.logica;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Aula021ArrayMultidimensional {

	public static void main (String[] args) {

		String[] uma = {"Ricardo", "Emanuel", "Sandra"};
		String[][] duas = {
				{"Ricardo", "M", "DF"},
				{"Emanuel", "M", "RS"},
				{"Sandra", "F", "SP"}
		};
		
		JOptionPane.showMessageDialog(null, uma[0]);
		JOptionPane.showMessageDialog(null, duas[1]);
		JOptionPane.showMessageDialog(null, duas[1][2]);
		
		JOptionPane.showMessageDialog(null, duas.length);
		JOptionPane.showMessageDialog(null, duas[0].length);

		duas[0][0] = "Valenti";
		duas[0][2] = "RS";
		
		JOptionPane.showMessageDialog(null, duas[0]);
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","valete","dama","rei"};
		
		String[] naipes = {"Copa","Espada","Ouro","Paus"};
		
		Random aleatorioNaipe = new Random(); 
		Random aleatorioFace = new Random(); 
		
		JOptionPane.showMessageDialog(null, "Carta " + String.valueOf(naipes[aleatorioNaipe.nextInt(0, (naipes.length - 1))]) + ", " +  String.valueOf(faces[aleatorioFace.nextInt(0, (faces.length - 1))]));
		
		
		
		
		duas = null;
		uma = null;
		faces = null;
		naipes = null;
		aleatorioFace = null;
		aleatorioNaipe = null;
		
	}
}
