package br.com.emanuelvalenti.refinado;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.emanuelvalenti.logica.Aula012Janela;

public class Aula098ClassesAninhadasAnonimas extends JFrame{

	private JButton botao = new JButton("Clique Aqui");
	private JButton botaoAnonimo = new JButton("Clique Aqui Anonimo");
	
	class AcaoBotao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println("Classe aninhada");
			
		}
		
	}
	
	/*
	 * Classe Aninhada
	 * */
	Aula098ClassesAninhadasAnonimas(){
		
		super("Aninhadas e Anônimas");
		
		Container container = getContentPane(); 

		
		botao.addActionListener(new AcaoBotao());

		/*
		 * Classe anônima
		 * */
		botaoAnonimo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe anônima");
			}
		});

		
		container.add(BorderLayout.NORTH,botao);
		container.add(BorderLayout.SOUTH,botaoAnonimo);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Aula098ClassesAninhadasAnonimas janela = new Aula098ClassesAninhadasAnonimas();
		
		/*
		 * Criando uma nova instancia da classe aninhada
		 * é obrigado a instanciar um objeto da linha acima
		 * pois servira de referencia para o instanciamento
		 * do objeto abaixo
		 * */
		
		Aula098ClassesAninhadasAnonimas.AcaoBotao bota2 = janela.new AcaoBotao(); 
		
	}
	
	
}
