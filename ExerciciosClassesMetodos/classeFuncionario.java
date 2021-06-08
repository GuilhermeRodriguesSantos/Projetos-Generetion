package ExerciciosClassesMetodos;

public class classeFuncionario {
	/*
	 * 4) Crie uma classe funcionário e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto funcionário, defina as instancias
	 * deste objeto e apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private int idade;
	private String cidade;
	private String email;
	private String sexo;
	private double salario;

	public classeFuncionario(String nome, int idade, String cidade, String email, String sexo, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		this.email = email;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	public void exibirInformacoes() {
		System.out.println("O nome eh: " + nome);
		System.out.println("A idade eh: " + idade);
		System.out.println("A cidade eh: " + cidade);
		System.out.println("O email eh: " + email);
		System.out.println("O sexo eh: " + sexo);
		System.out.println("O salario eh: " + salario);
	}
	
	public void sabernvoSalario(double horas) {
		double novoSalario = this.salario * horas;
		System.out.println("Seu novo Salario eh: " + novoSalario);
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
