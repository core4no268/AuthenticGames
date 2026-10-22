package dao;

import conexao.*;
import modelo.*;

import java.sql.*;

public class JogoDAO {
		 public void inserir(Jogo jogo) throws SQLException {
		 String sql = "INSERT INTO jogo (nome, dev, estoque, preco, genero) "
		 + "VALUES (?, ?, ?, ?, ?)";
		 Conexao conexao = new Conexao();
		 Connection con = conexao.getConexao();
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setString(1, jogo.getNome());
		 ps.setString(2, jogo.getDev());
		 ps.setInt(3, jogo.getEstoque());
		 ps.setDouble(4, jogo.getPreco());
		 ps.setString(5, jogo.getGenero());
		 ps.executeUpdate();
		 ps.close();
		 con.close();
		 }
}
