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

	public Jogo buscar(int id) throws SQLException {
		Jogo jogo = null;
		String sql = "SELECT nome, dev, estoque, preco, genero FROM Jogo WHERE id = ?";
		Conexao conexao = new Conexao();
		Connection con = conexao.getConexao();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String nome = rs.getString("nome");
			String dev = rs.getString("dev");
			int estoque = rs.getInt("estoque");
			double preco = rs.getDouble("preco");
			String genero = rs.getString("genero");
			jogo = new Jogo(nome, dev, estoque, preco, genero);

		}
		ps.close();
		con.close();
		return jogo;
	}

	public boolean atualizar(int id, String nome, String dev, int estoque, double preco, String genero) throws SQLException {
		String sql = "UPDATE Jogo SET nome = ?, dev = ?, estoque = ?, preco = ?, genero = ? WHERE id = ?";
		Conexao conexao = new Conexao();
		Connection con = conexao.getConexao();
		PreparedStatement ps = con.prepareStatement(sql);
		try {
			ps.setString(1, nome);
			ps.setString(2, dev);
			ps.setInt(3, estoque);
			ps.setDouble(4, preco);
			ps.setString(5, genero);
			ps.setInt(6, id);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}



	}
}
