package conexao;

import java.sql.*;


public class Conexao {
	 private String url =
	 "jdbc:postgresql://localhost:5432/lpro_cadastro";
	 private String usuario = "postgres";
	 private String senha = "postgres";
	 public Connection getConexao()
	 throws SQLException {
	 return DriverManager.getConnection(
	 url, usuario, senha);
	 }
	 
	 
	}
