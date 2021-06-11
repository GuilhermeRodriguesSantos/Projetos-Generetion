package ExercicioPolimorfismo;

import java.util.Scanner;

public class Cachorro extends Animal{
	Scanner ler = new Scanner(System.in);
	
	private double tamanho;
	private String raca;
	private String vacinado;
	
	//Metodo construtores
	public Cachorro(String nome, int idade, double tamanho, String raca, String vacinado) {
		super(nome, idade);
		this.tamanho = tamanho;
		this.raca = raca;
		this.vacinado = vacinado;
	}
	
	//Metodos da classe Abstrata
		@Override
		public void emitirSom(String som) {
			System.out.println("\nO cachorro faz o segunte sim: " + som);
		}
		
		@Override
		public void correr(double velocidade) {
			if(velocidade <= 0 ) {
				int op;
				System.out.println("\nDeseja acelarar ?\nDigite 1 para sim\nDigite 2 para não");
				op = ler.nextInt();
				
				if(op == 1) {
					System.out.println("\nQuanto deseja acelerar ?: ");
					int numero = ler.nextInt();
					
					velocidade = velocidade + numero;
					
					System.out.println("\nSua velocidade eh: " + velocidade);
				}else if(op == 2){
					System.out.println("\nCachorro ficou parado hahahah");
				}else {
					System.out.println("numero ivalido");
				}
			}else {
				System.out.println("\nO cachorro está correndo na velocidada de: " + velocidade);
			}
		}
		
		@Override
		public void mostrarInformacoes() {
			System.out.println("\nO nome do cachorro eh: " + getNome());
			System.out.println("A idade do cachorro eh: " + getIdade());
			System.out.println("O tamanho do cachorro eh: " + tamanho);
			System.out.println("A raça do cachorro eh: "+ raca);
			System.out.println("O cachorro eh vacinado ? " + vacinado);
		}

		public double getTamanho() {
			return tamanho;
		}

		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getVacinado() {
			return vacinado;
		}

		public void setVacinado(String vacinado) {
			this.vacinado = vacinado;
		}
}
