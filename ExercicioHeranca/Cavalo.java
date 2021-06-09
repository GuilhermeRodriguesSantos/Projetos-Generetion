package ExercicioHeranca;

public class Cavalo extends Animal{
	private String genero;
	
	public Cavalo(String nome, double tamanho, int idade, String genero) {
		super(nome, tamanho, idade);
		this.genero = genero;
	}
	
	public String getgenero() {
		return genero;
	}
	
	public void setgenero(String genero) {
		this.genero = genero;
	}
	
	public void mostarinformacoes() {
		System.out.println("nome do cavalo: " + getnome());
		System.out.println("tamanho do cavalo: " + gettamanho());
		System.out.println("idade do cavalo: " + getidade());
		System.out.println("genero do cavalo: " + getgenero());
	}
}
