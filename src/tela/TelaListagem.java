package tela;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import dao.*;
import modelo.Jogo;




public class TelaListagem extends JFrame{


	Font sansMSB = new Font("Comic Sans MS", 1, 15);
	Font sansMSP = new Font("Comic Sans MS", 1, 40);
	JogoDAO dao = new JogoDAO();
	ArrayList<Jogo> jogos = null;
	int height = 50;
	int y = 170;
	JPanel painelLista = new JPanel(null);

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
		
		
		JLabel lblPagina = new JLabel();
		lblPagina.setText("1");
		lblPagina.setBounds(320, 660, 50, 50);
		lblPagina.setBackground(Color.white);
		lblPagina.setOpaque(true);
		lblPagina.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		lblPagina.setFont(sansMSB);
		lblPagina.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblPagina);
		
		jogos = dao.listarTodos(Integer.parseInt(lblPagina.getText()));
		
		listar(jogos);
		
		
		JLabel lblIdP = new JLabel();
		lblIdP.setBounds(30, 120, 40, height);
		lblIdP.setBackground(Color.white);
		lblIdP.setOpaque(true);
		lblIdP.setText("ID");
		lblIdP.setFont(sansMSB);
		lblIdP.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblIdP);
		
		JLabel lblNomeP = new JLabel();
		lblNomeP.setBounds(lblIdP.getX()+lblIdP.getWidth(), 120, 200, height);
		lblNomeP.setBackground(Color.white);
		lblNomeP.setOpaque(true);
		lblNomeP.setText("Nome");
		lblNomeP.setFont(sansMSB);
		lblNomeP.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblNomeP);
		
		JLabel lblDevP = new JLabel();
		lblDevP.setBounds(lblNomeP.getX()+lblNomeP.getWidth(), 120, 150, height);
		lblDevP.setBackground(Color.white);
		lblDevP.setOpaque(true);
		lblDevP.setText("Desenvolvedora");
		lblDevP.setFont(sansMSB);
		lblDevP.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblDevP);
		
		JLabel lblEstoqueP = new JLabel();
		lblEstoqueP.setBounds(lblDevP.getX()+lblDevP.getWidth(), 120, 70, height);
		lblEstoqueP.setBackground(Color.white);
		lblEstoqueP.setOpaque(true);
		lblEstoqueP.setText("Estoque");
		lblEstoqueP.setFont(sansMSB);
		lblEstoqueP.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstoqueP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblEstoqueP);
		
		JLabel lblPrecoP = new JLabel();
		lblPrecoP.setBounds(lblEstoqueP.getX()+lblEstoqueP.getWidth(), 120, 70, height);
		lblPrecoP.setBackground(Color.white);
		lblPrecoP.setOpaque(true);
		lblPrecoP.setText("Preço");
		lblPrecoP.setFont(sansMSB);
		lblPrecoP.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecoP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblPrecoP);
		
		JLabel lblGeneroP = new JLabel();
		lblGeneroP.setBounds(lblPrecoP.getX()+lblPrecoP.getWidth(), 120, 100, height);
		lblGeneroP.setBackground(Color.white);
		lblGeneroP.setOpaque(true);
		lblGeneroP.setText("Gênero");
		lblGeneroP.setFont(sansMSB);
		lblGeneroP.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneroP.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
		add(lblGeneroP);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Lista de Jogos");
		lblTitulo.setBounds(200, 40, 300, 60);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(sansMSP);
		add(lblTitulo);
		
		
		
		JButton btnVoltar = new JButton();
		btnVoltar.setText("Voltar");
		btnVoltar.setBounds(30, 660 , 150, 50);
		btnVoltar.setFont(sansMSB);
		btnVoltar.addActionListener(e->{
			new TelaPrincipal();
			dispose();
		});
		add(btnVoltar);
		
		JButton btnAnterior = new JButton();
		btnAnterior.setText("<");
		btnAnterior.setBounds(260, 660, 50, 50);
		btnAnterior.setFont(sansMSB);
		btnAnterior.addActionListener(e->{
			if (Integer.parseInt(lblPagina.getText()) > 1){
			lblPagina.setText(Integer.parseInt(lblPagina.getText())-1+"");
			jogos.clear();
			jogos.addAll(dao.listarTodos(Integer.parseInt(lblPagina.getText())));
			painelLista.removeAll();
			listar(jogos);
			painelLista.revalidate();
			painelLista.repaint();
			}
		});
		add(btnAnterior);
		
		JButton btnProximo = new JButton();
		btnProximo.setText(">");
		btnProximo.setBounds(380, 660, 50, 50);
		btnProximo.setFont(sansMSB);
		btnProximo.addActionListener(e->{
			lblPagina.setText(Integer.parseInt(lblPagina.getText())+1+"");
			jogos.clear();
			jogos.addAll(dao.listarTodos(Integer.parseInt(lblPagina.getText())));
			painelLista.removeAll();
			listar(jogos);
			painelLista.revalidate();
			painelLista.repaint();
			
		});
		add(btnProximo);
		painelLista.setBounds(30, 170, 630, height*9);
		painelLista.setBackground(Color.decode("#DAF0FF"));
		add(painelLista);
	}
	
	public void listar(ArrayList<Jogo> jogos) {
		y=0;
		for (Jogo j : jogos) {
			JLabel lblId = new JLabel();
			lblId = new JLabel();
			lblId.setBounds(0, y, 40, height);
			lblId.setBackground(Color.white);
			lblId.setOpaque(true);
			lblId.setText(j.getId()+"");
			lblId.setFont(sansMSB);
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblId);
			
			JLabel lblNome = new JLabel();
			lblNome = new JLabel();
			lblNome.setBounds(40, y, 200, height);
			lblNome.setBackground(Color.white);
			lblNome.setOpaque(true);
			lblNome.setText(j.getNome());
			lblNome.setFont(sansMSB);
			lblNome.setHorizontalAlignment(SwingConstants.CENTER);
			lblNome.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblNome);
			

			JLabel lblDev = new JLabel();
			lblDev = new JLabel();
			lblDev.setBounds(240, y, 150, height);
			lblDev.setBackground(Color.white);
			lblDev.setOpaque(true);
			lblDev.setText(j.getDev());
			lblDev.setFont(sansMSB);
			lblDev.setHorizontalAlignment(SwingConstants.CENTER);
			lblDev.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblDev);
			

			JLabel lblEstoque = new JLabel();
			lblEstoque = new JLabel();
			lblEstoque.setBounds(390, y, 70, height);
			lblEstoque.setBackground(Color.white);
			lblEstoque.setOpaque(true);
			lblEstoque.setText(j.getEstoque()+"");
			lblEstoque.setFont(sansMSB);
			lblEstoque.setHorizontalAlignment(SwingConstants.CENTER);
			lblEstoque.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblEstoque);
			

			JLabel lblPreco = new JLabel();
			lblPreco = new JLabel();
			lblPreco.setBounds(460, y, 70, height);
			lblPreco.setBackground(Color.white);
			lblPreco.setOpaque(true);
			lblPreco.setText(j.getPreco()+"");
			lblPreco.setFont(sansMSB);
			lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
			lblPreco.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblPreco);
			

			JLabel lblGenero = new JLabel();
			lblGenero = new JLabel();
			lblGenero.setBounds(530, y, 100, height);
			lblGenero.setBackground(Color.white);
			lblGenero.setOpaque(true);
			lblGenero.setText(j.getGenero()+"");
			lblGenero.setFont(sansMSB);
			lblGenero.setHorizontalAlignment(SwingConstants.CENTER);
			lblGenero.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 1));
			painelLista.add(lblGenero);
			
			y+=50;
		}
		y = 170;
	}

}
