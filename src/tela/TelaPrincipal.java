package tela;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class TelaPrincipal extends JFrame{
	public TelaPrincipal () {
		setSize(700, 800);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("AuthenticGames");
		ImageIcon logo = new ImageIcon("logo.png");
		setIconImage(logo.getImage());

		init();
		setVisible(true);
	}
	public void init() {
		Font sansMSP = new Font("Comic Sans MS", 1, 49);
		Font sansMSB = new Font("Comic Sans MS", 1, 25);
		
		JLabel nome = new JLabel();
		nome.setText("Authentic Games");
		nome.setBounds(150, 60, 400, 100);
		nome.setFont(sansMSP);
		add(nome);
		
		JButton cad = new JButton();
		cad.setText("Cadastrar Jogo");
		cad.setBounds(150, 200, 400, 70);
		cad.setFont(sansMSB);
		cad.addActionListener(e -> {
			new TelaCadastro();
			dispose();
		});
		add(cad);
		
		JButton list = new JButton();
		list.setText("Listagem");
		list.setBounds(150, cad.getY()+100, 400, 70);
		list.setFont(sansMSB);
		list.addActionListener(e -> {
			new TelaListagem();
			dispose();
		});
		add(list);
		
		JButton edit = new JButton();
		edit.setText("Editar / Excluir");
		edit.setBounds(150, list.getY()+100, 400, 70);
		edit.setFont(sansMSB);
		edit.addActionListener(e -> {
			new TelaEdicao();
			dispose();
		});
		add(edit);
		
		
		JButton sair = new JButton();
		sair.setText("Sair");
		sair.setBounds(150, edit.getY()+100, 400, 70);
		sair.setFont(sansMSB);
		sair.addActionListener(e -> {
			dispose();
		});
		add(sair);
		
		
	}
}
