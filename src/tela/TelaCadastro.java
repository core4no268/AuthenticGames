package tela;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class TelaCadastro extends JFrame{
	public TelaCadastro () {
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
		lblTitulo.setText("Cadastrar Jogo");
		lblTitulo.setBounds(184, 40, 299, 80);
		lblTitulo.setFont(sansMSP);
		add(lblTitulo);




		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(50, lblTitulo.getY()+130, 400, 45);
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

		JButton btnCad = new JButton();
		btnCad.setText("Cadastrar");
		btnCad.setBounds(50, lblGenero.getY() + espac + 40, 160, 60);
		btnCad.setFont(sansMSB);
		btnCad.addActionListener(e->{

			try {

				if(txtNome.getText() == null) {
					if(txtDev.getText() == null) {
						if(txtEstoque.getText() == null) {
							if(txtPreco.getText() == null) {
								if(txtGenero.getText() == null) {

								}
							}
						}
					}
				} else {

				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Digite valores condizentes com os campos"
						+ "Nome: Texto"
						+ "Desenvolvedor: Texto"
						+ "Estoque: Numero Inteiro"
						+ "Preço: Numero Real"
						+ "Genero: Texto");
			}
		});
		add(btnCad);

		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(260, btnCad.getY(), 160, 60);
		btnLimpar.setFont(sansMSB);
		btnLimpar.addActionListener(e->{
			txtNome.setText(null);
			txtDev.setText(null);
			txtEstoque.setText(null);
			txtGenero.setText(null);
			txtPreco.setText(null);
		});
		add(btnLimpar);

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
