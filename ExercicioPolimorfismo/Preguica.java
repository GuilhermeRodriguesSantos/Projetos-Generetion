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
		System.out.println("\nA preguiça faz o seguinte som: " + som);
	}
	
	@Override
	public void correr(double velocidade) {
		System.out.println("\nNão adinta colocar velocidade, a preguiça não corre kskskkkksk!!!");
	}
	
	public void subirArvore() {
		System.out.println("Ela subiuuuuuu e tá dormindo agora!!");
	}
	
	@Override
	public void mostrarInformacoes() {
		System.out.println("\nO nome da Preguiça eh: " + getNome());
		System.out.println("A idade da Preguiça eh: " + getIdade());
		System.out.println("ela tá dormundo ?: " + dormindo);
	}

	public String getDormindo() {
		return dormindo;
	}

	public void setDormindo(String dormindo) {
		this.dormindo = dormindo;
	}	
}
