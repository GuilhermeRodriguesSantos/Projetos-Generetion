package ExercicioHeranca;

public class Animal {
	
	//Atributos da SuperClasse;
	private String nome;
	private double tamanho;
	private int idade;
	
	//Metodo construtor;
	
	public Animal(String nome,  double tamanho, int idade) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.idade = idade;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}

	public double gettamanho() {
		return tamanho;
	}
	
	public void settamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setidade(int idade) {
		this.idade = idade;
	}
	
}
