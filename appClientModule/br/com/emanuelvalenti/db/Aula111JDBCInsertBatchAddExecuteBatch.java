package br.com.emanuelvalenti.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Aula111JDBCInsertBatchAddExecuteBatch {

	public static void main(String[] args) throws SQLException {
	
		Properties props = new Properties();
        props.setProperty("user", "sys");
        props.setProperty("password", "mysecurepassword");
        props.setProperty("internal_logon", "SYSDBA"); // Specify SYSDBA role
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		
		/**
		 * um registro apenas
		 */
		/*
		try (	Connection con = DriverManager.getConnection(url, props);
				PreparedStatement state = con.prepareStatement("insert into pessoa values (5,'Caio','M','caio@emanuelvalenti.com')");){

			state.executeUpdate(); 
			
			System.out.println("Atualizou");

		}
		*/
		
		/**
		 * varios registros
		 */
		
		/*
		try (	Connection con = DriverManager.getConnection(url, props);
				PreparedStatement state = con.prepareStatement("insert into pessoa values (?,?,?,?)");){

			
			String[] pessoas = {"Sandra", "Beatriz","Juliana","Fatima","Veranda","Tereza","Leila"};
			int codigoUltimaPosicao = 5;
			
			for (String pessoa : pessoas) {

				
				state.setInt(1, ++codigoUltimaPosicao);
				state.setString(2, pessoa);
				state.setString(3, "F");
				state.setString(4, pessoa.toLowerCase() + "@emanuelvalenti.com");
				
				
				//cria um bloco de execuções a serem efetuadas
				
				state.addBatch();

				
			}
			
			//Executa o bloco
			state.executeBatch(); 
			
			System.out.println("Atualizou");

		*/
		
		/**
		 * Captura os registros do banco
		 */
		
		try (Connection con = DriverManager.getConnection(url, props);){

				//separasse o bloco, para que seja possível tratar
				//erros individuais e aproveitar a conexão para os
				//demais.
			
				try(PreparedStatement state = con.prepareStatement("select nome, email from pessoa");){

					try(ResultSet resultado = state.executeQuery();){
					
						while(resultado.next()) {
							
							System.out.println("Nome: " + resultado.getString(1));
							System.out.println("Email: " + resultado.getString(2));
						}
					}
					

				}catch (Exception e) {
					e.printStackTrace();
				}  
			}
		
		
		
		}
		
		
		
		
	}

