package ExercicioPolimorfismo;

import java.util.Scanner;

public class Cavalo extends Animal{
	Scanner ler = new Scanner(System.in);
	
	private String selvagem;
	private double peso;
	
	public Cavalo(String nome, int idade, String selvagem, double peso ) {
		super(nome, idade);
		this.selvagem = selvagem;
		this.peso = peso;
	}
	
	@Override
	public void emitirSom(String som) {
		System.out.println("O som que o cavalo faz eh: " + som);
	}
	
	@Override
	public void correr(double velocidade) {
		if(velocidade <= 0) {
			System.out.println("\nDeseja acelerar ?\nDigite 1 para sim e 2 para não: ");
			int op = ler.nextInt();
			
			if(op == 1) {
				System.out.println("\nO quanto você deseja acelerar ?");
				int acelerar = ler.nextInt();
				
				velocidade = velocidade + acelerar;
				System.out.println("\nAgora você está correndo com: " + velocidade + "Km");
			}else if(op == 2) {
				System.out.println("O cavalo vai ficar parado hihihi");
			}else {
				System.out.println("numero invalido");
			}
		}else {
			System.out.println("\nO cavalo está correndo com uma velocidade de: " + velocidade + " por hora");
		}
	}
	
	@Override
	public void mostrarInformacoes() {
		System.out.println("\nO nome do Cavalo eh: " + getNome());
		System.out.println("\nA idade do Cavalo eh: " + getIdade());
		System.out.println("\nO Cavalo é selvagem ? " + selvagem);
		System.out.println("\nO peso do cavalo eh: " + peso);
	}

	public String getSelvagem() {
		return selvagem;
	}

	public void setSelvagem(String selvagem) {
		this.selvagem = selvagem;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
