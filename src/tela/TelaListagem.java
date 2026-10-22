package tela;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class TelaListagem extends JFrame{
	public TelaListagem () {
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
		Font sansMSB = new Font("Comic Sans MS", 1, 15);
		
		
		
		JTextArea lblTitulo = new JTextArea();
		lblTitulo.setText("  ID  -  Nome  |  Desenvolverdora  |  Qntd. Estoque  |  Preço  |  Genêro");
		lblTitulo.setBounds(55, 50, 580, 570);
		lblTitulo.setFont(sansMSB);
		add(lblTitulo);
		
		
		
		
		
		
		
		
	}
}
