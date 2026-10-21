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
		
		
	}
}
