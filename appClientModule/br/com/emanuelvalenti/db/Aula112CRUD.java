package br.com.emanuelvalenti.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Aula112CRUD {

	
	private static Connection conexao() throws SQLException {
		
		Properties props = new Properties();
	    props.setProperty("user", "sys");
	    props.setProperty("password", "mysecurepassword");
	    props.setProperty("internal_logon", "SYSDBA"); // Specify SYSDBA role
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		return DriverManager.getConnection(url, props);
		
	}
	
	public static void criar(Connection con, Aula112Conta conta) throws SQLException {
		
		String sql = "insert into conta values (?,?,?)";
		
		try (PreparedStatement state = con.prepareStatement(sql);){
			
			state.setInt(1, conta.numero);
			state.setString(2, conta.cliente);
			state.setDouble(3, conta.saldo);
			
			state.executeUpdate();
			
			System.out.println("Criado");
			
		}
		
	}
	
	public static List<Aula112Conta> ler(Connection con) throws SQLException{
		
		
		ArrayList<Aula112Conta> conta = new ArrayList<Aula112Conta>();

		String sql = "select numeroConta,nomeCliente,saldo from conta";
		
		try (PreparedStatement state = con.prepareStatement(sql);
				ResultSet resultados = state.executeQuery()){
			
			while (resultados.next()) {

				conta.add(new Aula112Conta(resultados.getInt(1),resultados.getString(2),resultados.getDouble(3)));
				
				
			}
			
		}
		
		
		
		return (List<Aula112Conta>) conta;
	}
	

	public static void alterar(Connection con, Aula112Conta conta) throws SQLException {
		
		String sql = "update conta set nomeCliente=?, saldo=? where numeroConta=?";
		
		try (PreparedStatement state = con.prepareStatement(sql);){
			
			state.setString(1, conta.cliente);
			state.setDouble(2, conta.saldo);
			state.setInt(3, conta.numero);
			
	
			
			state.executeUpdate();
			
			System.out.println("Alterado");
			
		}
		
	}
	
	public static void excluir(Connection con, Aula112Conta conta) throws SQLException {
		
		String sql = "delete from conta where numeroConta=?";
		
		try (PreparedStatement state = con.prepareStatement(sql);){
			
			state.setInt(1, conta.numero);
			
			state.executeUpdate();
			
			System.out.println("Excluído");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws SQLException {

		Connection con = conexao();
		
		ArrayList<Aula112Conta> contas = new ArrayList<Aula112Conta>();
		
		contas.add(new Aula112Conta(1, "Emanuel", 12000));
		contas.add(new Aula112Conta(2, "Natalí", 10000));
		contas.add(new Aula112Conta(3, "Spock", 30000));
		contas.add(new Aula112Conta(4, "Anakin", 15000));
		
		for (Aula112Conta conta : contas) {
			
			criar(con, conta);
			
		}
		
		for (Aula112Conta conta : ler(con)) {
			
			System.out.println("Número da conta: " + conta.numero + ", Nome do cliente: " + conta.cliente + ", Saldo da conta: R$ " + conta.saldo + ",00.");
			
			
		}

		
		alterar(con, new Aula112Conta(1, "emanuel", 15000));

		for (Aula112Conta conta : ler(con)) {
			
			System.out.println("Número da conta: " + conta.numero + ", Nome do cliente: " + conta.cliente + ", Saldo da conta: R$ " + conta.saldo + ",00.");
			
			
		}
		
		
		excluir(con, new Aula112Conta(1, "Emanuel", 15000));
		
		for (Aula112Conta conta : ler(con)) {
			
			System.out.println("Número da conta: " + conta.numero + ", Nome do cliente: " + conta.cliente + ", Saldo da conta: R$ " + conta.saldo + ",00.");
			
			
		}
		
		
		con.close();
		
	}

}
