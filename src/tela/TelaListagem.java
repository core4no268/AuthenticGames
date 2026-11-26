package tela;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import dao.*;
import modelo.Jogo;




public class TelaListagem extends JFrame{
	private JTextArea telinha = new JTextArea();
	private JScrollPane rolagem = new JScrollPane(telinha);
	
	
	private void listar() {
		JogoDAO dao = new JogoDAO();
		 ArrayList<Jogo> lista = dao.listarTodos();
		 telinha.setText("");
		 for (Jogo j : lista) {
		 telinha.append(j.getId() + " - " + j.getNome() + " - " + j.getDev() + " - " + j.getEstoque() + " - " + j.getPreco() + " - " + j.getGenero() + "\n");
		 }
		 if (lista.isEmpty()) {
		 telinha.setText("Nenhum jogo cadastrado.");
		 }
}
	
	public TelaListagem () {
		setSize(700, 800);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("AuthenticGames");
		getContentPane().setBackground(Color.decode("#DAF0FF"));
		ImageIcon logo = new ImageIcon("logo.png");
		setIconImage(logo.getImage());

		init();
		setVisible(true);
		
	}
	
	public void init() {
		 
		Font sansMSB = new Font("Comic Sans MS", 1, 20);
		Font sansMSBb = new Font("Comic Sans MS", 1, 18);
		rolagem.setBounds(20, 100, 650, 600);
		telinha.setFont(sansMSBb);
		
		JButton atualizar = new JButton();
		atualizar.setBounds(30, 30, 200, 50);
		atualizar.setFont(sansMSB);
		atualizar.setText("Atualizar lista");
		listar();
		atualizar.addActionListener(e -> {
			
			listar();
		});
		add(atualizar);
		add(rolagem);
		
		JButton btnVoltar = new JButton();
		btnVoltar.setText("Voltar");
		btnVoltar.setBounds(500, 30, 150, 50);
		btnVoltar.setFont(sansMSB);
		btnVoltar.addActionListener(e->{
			new TelaPrincipal();
			dispose();
		});
		add(btnVoltar);
		
		
		
		
	}
	
}
