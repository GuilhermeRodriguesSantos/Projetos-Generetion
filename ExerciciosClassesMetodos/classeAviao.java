package ExerciciosClassesMetodos;

public class classeAviao {
	
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String marca;
	private String cor;
	private double velocidadeInicial;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	public classeAviao (String marca, String cor, double velocidadeInicial, double velocidadeAtual, double velocidadeMaxima) {
		this.marca = marca;
		this.cor = cor;
		this.velocidadeInicial = velocidadeInicial;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void iniciarVoou() {
		System.out.println("O avião começou a voar");
	}
	
		public double acelerar(double acelerar) {
		if(this.velocidadeAtual <= this.velocidadeMaxima) {
		this.velocidadeAtual = this.velocidadeAtual + acelerar;
		System.out.println("O avião Acelerou : " + acelerar);
		return velocidadeAtual;
		}else {
			this.velocidadeAtual = this.velocidadeMaxima;
			return velocidadeAtual;
		}
	}
		
		public void exibirInformações() {
			System.out.println("A marca eh: " + marca);
			System.out.println("A cor eh: " + cor);
			System.out.println("A velocidade inicial eh: " + velocidadeInicial);
			System.out.println("A velocidade Atual eh: " + velocidadeAtual);
			System.out.println("A velocidade maxima eh: " + velocidadeMaxima);
		}
	
		public void pousar() {
			System.out.println("O avião pousou");
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public double getVelocidadeInicial() {
			return velocidadeInicial;
		}

		public void setVelocidadeInicial(double velocidadeInicial) {
			this.velocidadeInicial = velocidadeInicial;
		}

		public double getVelocidadeAtual() {
			return velocidadeAtual;
		}

		public void setVelocidadeAtual(double velocidadeAtual) {
			this.velocidadeAtual = velocidadeAtual;
		}

		public double getVelocidadeMaxima() {
			return velocidadeMaxima;
		}

		public void setVelocidadeMaxima(double velocidadeMaxima) {
			this.velocidadeMaxima = velocidadeMaxima;
		}
		
		
		
		
	
}
