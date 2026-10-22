package tela;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class TelaEdicao extends JFrame{
	public TelaEdicao () {
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
		Font sansMSP = new Font("Comic Sans MS", 1, 40);
		Font sansMSB = new Font("Comic Sans MS", 1, 20);
		int espac = 80;

		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Editar/Excluir");
		lblTitulo.setBounds(184, 15, 300, 80);
		lblTitulo.setFont(sansMSP);
		add(lblTitulo);
		
		JLabel lblId = new JLabel();
		lblId.setText("ID:");
		lblId.setBounds(50, lblTitulo.getY()+90, 400, 45);
		lblId.setFont(sansMSB);
		add(lblId);
		JTextField txtId = new JTextField();
		txtId.setBounds(lblId.getX()+160, lblId.getY(), 160, 45);
		txtId.setFont(sansMSB);
		add(txtId);
		
		JButton btnBuscar = new JButton();
		btnBuscar.setText("Buscar");
		btnBuscar.setBounds(lblId.getX()+367, lblId.getY(), 150	, 45);
		btnBuscar.setFont(sansMSB);
		btnBuscar.addActionListener(e->{

		
		});
		add(btnBuscar);
		
		JLabel lblDiv = new JLabel();
		lblDiv.setText("------------------------");
		lblDiv.setBounds(lblId.getX(), lblId.getY()+20, 6700, 80);
		lblDiv.setFont(sansMSP);
		add(lblDiv);



		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(50, lblId.getY()+120, 400, 45);
		lblNome.setFont(sansMSB);
		add(lblNome);
		JTextField txtNome = new JTextField();
		txtNome.setBounds(lblNome.getX()+160, lblNome.getY(), 430, 45);
		txtNome.setFont(sansMSB);
		add(txtNome);

		JLabel lblDev = new JLabel();
		lblDev.setText("Desenvolvedor:");
		lblDev.setBounds(50, lblNome.getY()+espac, 400, 45);
		lblDev.setFont(sansMSB);
		add(lblDev);
		JTextField txtDev = new JTextField();
		txtDev.setBounds(lblDev.getX()+160, lblDev.getY(), 430, 45);
		txtDev.setFont(sansMSB);
		add(txtDev);

		JLabel lblEstoque = new JLabel();
		lblEstoque.setText("Estoque:");
		lblEstoque.setBounds(50, lblDev.getY()+espac, 400, 45);
		lblEstoque.setFont(sansMSB);
		add(lblEstoque);
		JTextField txtEstoque = new JTextField();
		txtEstoque.setBounds(lblEstoque.getX()+160, lblEstoque.getY(), 430, 45);
		txtEstoque.setFont(sansMSB);
		add(txtEstoque);

		JLabel lblPreco = new JLabel();
		lblPreco.setText("Preço:");
		lblPreco.setBounds(50, lblEstoque.getY()+espac, 400, 45);
		lblPreco.setFont(sansMSB);
		add(lblPreco);
		JTextField txtPreco = new JTextField();
		txtPreco.setBounds(lblPreco.getX()+160, lblPreco.getY(), 430, 45);
		txtPreco.setFont(sansMSB);
		add(txtPreco);

		JLabel lblGenero = new JLabel();
		lblGenero.setText("Genêro:");
		lblGenero.setBounds(50, lblPreco.getY()+espac, 400, 45);
		lblGenero.setFont(sansMSB);
		add(lblGenero);
		JTextField txtGenero = new JTextField();
		txtGenero.setBounds(lblGenero.getX()+160, lblGenero.getY(), 430, 45);
		txtGenero.setFont(sansMSB);
		add(txtGenero);

		JButton btnAtualizar = new JButton();
		btnAtualizar.setText("Atualizar");
		btnAtualizar.setBounds(50, lblGenero.getY() + espac + 40, 160, 60);
		btnAtualizar.setFont(sansMSB);
		btnAtualizar.addActionListener(e->{

		
		});
		add(btnAtualizar);

		JButton btnExcluir = new JButton();
		btnExcluir.setText("Limpar");
		btnExcluir.setBounds(260, btnAtualizar.getY(), 160, 60);
		btnExcluir.setFont(sansMSB);
		btnExcluir.addActionListener(e->{
			txtNome.setText(null);
			txtDev.setText(null);
			txtEstoque.setText(null);
			txtGenero.setText(null);
			txtPreco.setText(null);
		});
		add(btnExcluir);

		JButton btnVoltar = new JButton();
		btnVoltar.setText("Voltar");
		btnVoltar.setBounds(470, lblGenero.getY() + espac + 40, 160, 60);
		btnVoltar.setFont(sansMSB);
		btnVoltar.addActionListener(e->{
			new TelaPrincipal();
			dispose();
		});
		add(btnVoltar);

	}
}
