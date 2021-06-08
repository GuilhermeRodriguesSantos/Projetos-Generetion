package ExerciciosClassesMetodos;

public class classeProduto {
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.*/
	
	private String nome;
	private String modelo;
	private String cor;
	private double preco;
	
	public classeProduto(String nome, String modelo, String cor, double preco) {
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	public void aprensetarProduto() {
		System.out.println("O nome do produto eh: " + nome);
		System.out.println("O modelo do produto eh: " + modelo);
		System.out.println("A cor do produto eh: " + cor);
		System.out.println("O preco do produto eh: " + preco);
	}
	
	public void ligar() {
		System.out.println("Produto está ligado");
	}
	
	void desligar() {
		System.out.println("O produto está desligado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
