package ExerciciosClassesMetodos;

public class classPaciente {
	
	/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String nome;
	private int idade;
	private String sintoma;
	
	public classPaciente(String nome, int idade, String sintoma) {
		this.nome = nome;
		this.idade = idade;
		this.sintoma = sintoma;
	}
	
	public void mostrarinformacoes() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sintoma);
	}
	
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

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
}
