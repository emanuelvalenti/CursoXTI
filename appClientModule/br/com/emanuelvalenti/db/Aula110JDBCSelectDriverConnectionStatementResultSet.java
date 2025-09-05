package br.com.emanuelvalenti.db;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class Aula110JDBCSelectDriverConnectionStatementResultSet implements Closeable{

	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private Connection con;
	private String user = "sys";
	private String pass = "mysecurepassword";
	private PreparedStatement state;
	private String sqlCommand;

	void setSqlCommand(String sqlCommand) {

		this.sqlCommand = sqlCommand;
	}

	@SuppressWarnings("finally")
	private Connection connectar() {

		try {

			Properties props = new Properties();
	        props.setProperty("user", this.user);
	        props.setProperty("password", this.pass);
	        props.setProperty("internal_logon", "SYSDBA"); // Specify SYSDBA role
			
			
			this.con = DriverManager.getConnection(url, props);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return this.con;
		}

	}

	private void desConnectar() {

		try {
			this.con.close();
			this.state.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("finally")
	ResultSet executaComando() {

		ResultSet resultado = null;

		try {
			connectar();
			this.state = this.con.prepareStatement(this.sqlCommand);
			resultado = this.state.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return resultado;

		}

	}

	public static void main(String[] args) {

		
		
		try (Aula110JDBCSelectDriverConnectionStatementResultSet jdbc = new Aula110JDBCSelectDriverConnectionStatementResultSet();) {

			jdbc.setSqlCommand("select * from pessoa");
			ResultSet resultado = jdbc.executaComando();
			
			while (resultado.next()) {
				System.out.println("Código: " + resultado.getString("codigo"));
				System.out.println("Nome: " + resultado.getString("nome"));
				System.out.println("Sexo: " + resultado.getString("sexo"));
				System.out.println("Email: " + resultado.getString("email"));
				
			}
			
			resultado.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws IOException {
		desConnectar();
		
	}
}
