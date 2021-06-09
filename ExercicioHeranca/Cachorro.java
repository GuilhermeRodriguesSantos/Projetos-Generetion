package ExercicioHeranca;

public class Cachorro extends Animal{
	
	private String raca;
	
	public Cachorro(String nome, double tamanho, int idade, String raca) {
		super(nome, tamanho, idade);
		this.raca = raca;
	}
	
	public String getraca() {
		return raca;
	}
	
	public void setraca(String raca) {
		this.raca = raca;
	}
	
	public void mostrarinformacoes() {
		System.out.println("nome do Cachorro: "  + getnome());
		System.out.println("tamanho do Cachorro: "  + gettamanho());
		System.out.println("idade do Cachorro: "  + getidade());
		System.out.println("raca do Cachorro: "  + getraca());
		
	}
	
}
