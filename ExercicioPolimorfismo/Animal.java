package ExercicioPolimorfismo;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	abstract public void emitirSom(String som);
	abstract public void correr(double velocidade);
	abstract public void mostrarInformacoes();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
