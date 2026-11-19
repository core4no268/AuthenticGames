package conexao;

import java.sql.*;


public class Conexao {
	 private String url =
	 "jdbc:postgresql://localhost:5432/AuthenticGames";
	 private String usuario = "postgres";
	 private String senha = "1234";
	 public Connection getConexao() throws SQLException {
	 return DriverManager.getConnection(
	 url, usuario, senha);
	 }
	 
	 
	}
