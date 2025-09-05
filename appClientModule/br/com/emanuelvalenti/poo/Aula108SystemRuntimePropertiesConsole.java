package br.com.emanuelvalenti.poo;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

import javax.print.attribute.standard.NumberUpSupported;

public class Aula108SystemRuntimePropertiesConsole {

	public static void main(String[] args) throws IOException {

		/**
		 * Recuperar informações do sistema operacional
		 */

		Properties propriedades = System.getProperties();

		/**
		 * verificar a versão do java
		 */
		System.out.println(propriedades.getProperty("java.version"));

		/**
		 * Definir novas propriedades
		 */

		propriedades.setProperty("xti.curso.java.version", "1.0.0");

		/**
		 * Verificar todas as propriedades
		 */

		Set<Object> pk = propriedades.keySet();

		for (Object key : pk) {

			System.out.println(key + " : " + propriedades.get(key));
		}
		
		/**
		 * recuperar objeto tipo Console
		 * apenas em console
		 */

		/*
		Console console = System.console();
		
		String user, pass;
		
		System.out.print("\nUsuário :");
		
		user = (String) console.readLine();
		
		System.out.print(" Senha: "); 
		
		pass = String.valueOf(console.readPassword());

		System.out.print("Usuário: " + user + ", Senha:" + pass); 
		*/
		
		/**
		 * Classe Runtime
		 */
		
		/**
		 * executa um programa diretamente
		 * do sistema operacional
		 */
		
		String[] comando = {"notepad"};
		Runtime.getRuntime().exec(comando);
		
	}

}
