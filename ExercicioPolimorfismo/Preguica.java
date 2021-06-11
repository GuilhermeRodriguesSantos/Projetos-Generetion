package ExercicioPolimorfismo;

import java.util.Scanner;

public class Preguica extends Animal{
	Scanner ler = new Scanner(System.in);
	
	private String dormindo;
	
	public Preguica(String nome, int idade, String dormindo) {
		super(nome, idade);
		this.dormindo = dormindo;
	}
	
	@Override
	public void emitirSom (String som) {
		System.out.println("\nA pregui�a faz o seguinte som: " + som);
	}
	
	@Override
	public void correr(double velocidade) {
		System.out.println("\nN�o adinta colocar velocidade, a pregui�a n�o corre kskskkkksk!!!");
	}
	
	public void subirArvore() {
		System.out.println("Ela subiuuuuuu e t� dormindo agora!!");
	}
	
	@Override
	public void mostrarInformacoes() {
		System.out.println("\nO nome da Pregui�a eh: " + getNome());
		System.out.println("A idade da Pregui�a eh: " + getIdade());
		System.out.println("ela t� dormundo ?: " + dormindo);
	}

	public String getDormindo() {
		return dormindo;
	}

	public void setDormindo(String dormindo) {
		this.dormindo = dormindo;
	}	
}
