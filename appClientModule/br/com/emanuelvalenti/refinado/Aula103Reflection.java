package br.com.emanuelvalenti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Aula103Reflection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {

		
		/**
		 * Informa o nome da classe uma String
		 * E Instancia um objeto com referência a
		 * essa String
		 */
		
		String nome = "br.com.emanuelvalenti.poo.Aula036MetodosComParametros";
		Class classe = Class.forName(nome);
		
		/**
		 * Mostra o nome da classe 
		 */
		System.out.println(classe.getSimpleName());
		
		
		/**
		 * retona um array de campos
		 * públicos da classe
		 * pode ser usado um for para mostrar
		 * cada campo individualmente
		 */
		
		for (Field campo : classe.getFields()) {
			System.out.println(campo);
			System.out.println(campo.getName());
		}

		/**
		 * retona um array de métodos
		 * da classe pode ser usado um
		 * for para mostrar
		 * cada campo individualmente
		 */
		
		for (Method metodos : classe.getDeclaredMethods()) {
			System.out.println(metodos.getName());
			
		}
		
		/**
		 * retona um array de construtores
		 * da classe pode ser usado um
		 * for para mostrar
		 * cada campo individualmente
		 */
		
		for (Constructor contrutores : classe.getConstructors()) {
			System.out.println(contrutores.getName());
		}
		
		
		/**
		 * Construir uma classe
		 */

		Object objeto = classe.getDeclaredConstructor(String.class).newInstance("Emanuel");

		Field campoSaldo = classe.getField("saldo");

		
		/**
		 * carrega um valor
		 * para a váriavel
		 * saldo 
		 */
		
		Double valor = 100.0;
		
		campoSaldo.set(objeto, valor);
		
		/**
		 * recuperar um método
		 * da classe
		 */
		
		Method metodoDeposita = classe.getMethod("deposita", Double.class);

		/**
		 * Invoca o método
		 * passando o objeto instanciado
		 */
		
		valor = 120.0;
		
		metodoDeposita.invoke(objeto, valor);

		/**
		 * Pode usar
		 * outros métodos
		 */
		
		Method metodoSaca = classe.getMethod("saca", Double.class);

		valor = 20.0;

		metodoSaca.invoke(objeto, valor);
		
		Method metodoSaldo = classe.getMethod("exibeSaldo");
		metodoSaldo.invoke(objeto);
		
		
		
		
	}
}
