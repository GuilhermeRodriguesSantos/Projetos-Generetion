package ExerciciosClassesMetodos;

public class ClasseCliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	//Definindo os Atributos da Classe
	private String nome;
	private int idade;
	private int rg;
	
	//Metodo construtor
	public ClasseCliente(String nome, int idade, int rg ) {
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
	}
	
	//outros metodos
	public void comprar() {
		System.out.println("O cliente de nome: " + nome + " idade : " + idade + " rg: " + rg + " comprou");
	}
	
	public void exibirInformações(){
		System.out.println("O nome do Cliente eh: " + nome);
		System.out.println("A idade do Cliente eh: " + idade);
		System.out.println("O rg do Cliente eh: " + rg);
	}
	
	//metodos gets e seteres
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	public int getrg() {
		return rg;
	}
	
	public void setrg(int rg) {
		this.rg = rg;
	}
}
