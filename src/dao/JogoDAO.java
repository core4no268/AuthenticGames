package dao;

import conexao.*;
import modelo.*;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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

	public Jogo buscar(int id) {
		Jogo jogo = null;
		String sql = "SELECT nome, dev, estoque, preco, genero FROM Jogo WHERE id = ?";
		Conexao conexao = new Conexao();
		try {
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
				jogo = new Jogo(id, nome, dev, estoque, preco, genero);

			}
			ps.close();
			con.close();
			return jogo;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ID não encontrado");
			return null;
		}
	}

	public boolean atualizar(int id, String nome, String dev, int estoque, double preco, String genero) {
		String sql = "UPDATE Jogo SET nome = ?, dev = ?, estoque = ?, preco = ?, genero = ? WHERE id = ?";
		Conexao conexao = new Conexao();
		try {
			Connection con = conexao.getConexao();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, dev);
			ps.setInt(3, estoque);
			ps.setDouble(4, preco);
			ps.setString(5, genero);
			ps.setInt(6, id);
			ps.executeUpdate();
			con.close();
			return true;
		} catch (SQLException e) {
			
			return false;
		}

	}

	public ArrayList<Jogo> listarTodos()	{
		ArrayList<Jogo> lista = new ArrayList<>();
		String sql = "SELECT * FROM Jogo";
		try {
			Conexao conexao = new Conexao();
			Connection con = conexao.getConexao();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())  {
				Jogo j = new Jogo(rs.getInt("id"), rs.getString("nome"), rs.getString(""), rs.getInt("estoque"), rs.getDouble("preco"), rs.getString("genero") );	 
			}
			con.close();
		}catch (Exception e) {

		}
		return lista;
	}
	
	public boolean excluir(int id) {
		String sql = "DELETE FROM Jogo WHERE id = ?";
		Conexao conexao = new Conexao();
		try {
			Connection con = conexao.getConexao();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}
