package modelo;

public class Jogo {
	
	 private String nome;
	 private String dev;
	 private int estoque;
	 private double preco;
	 private String genero;
	 
	 public Jogo(String nome, String dev, int estoque, double preco, String genero) {
	 this.setNome(nome);
	 this.setDev(dev);
	 this.setEstoque(estoque);
	 this.setPreco(preco);
	 this.setGenero(genero);
	 }
	 
	 public String getNome() {
		return nome;
	 }
	 public void setNome(String nome) {
		this.nome = nome;
	 }
	 
	 
	 
	 public String getDev() {
		return dev;
	 }
	 public void setDev(String dev) {
		this.dev = dev;
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
	 
	 
	 
	}