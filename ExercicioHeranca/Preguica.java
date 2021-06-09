package ExercicioHeranca;

public class Preguica extends Animal{
	private double peso;
	
	public Preguica(String nome, double tamanho, int idade, double peso) {
		super(nome, tamanho, idade);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mostrarinfo() {
		System.out.println("nome da preguica: "  + getnome());
		System.out.println("tamanho da preguica: "  + gettamanho());
		System.out.println("idade da preguica: "  + getidade());
		System.out.println("peso da preguica: "  + peso);
	}
}
