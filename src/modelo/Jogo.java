package modelo;

public class Jogo {
	
	private int id;
	private String nome;
	private String desenvolvedor;
	private int estoque;
	private double preco;
	private String genero;

	public Jogo(String nome, String desenvolvedor, int estoque, double preco, String genero) {
		this.nome = nome;
		this.desenvolvedor = desenvolvedor;
		this.estoque = estoque;
		this.preco = preco;
		this.genero = genero;
	}
	
	public Jogo(int id, String nome, String desenvolvedor, int estoque, double preco, String genero) {
		this.id = id;
		this.nome = nome;
		this.desenvolvedor = desenvolvedor;
		this.estoque = estoque;
		this.preco = preco;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDev() {
		return desenvolvedor;
	}
	public void setDev(String dev) {
		this.desenvolvedor = dev;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}