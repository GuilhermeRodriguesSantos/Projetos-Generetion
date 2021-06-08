package ExerciciosClassesMetodos;

public class classeContaBancaria {

	/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.*/
	
	private String nomeBanco;
	private String nomeUsuario;
	private double saldo;
	
	public classeContaBancaria(String nomeB, String nomeU, double s) {
		nomeBanco = nomeB;
		nomeUsuario = nomeU;
		saldo = s;
	}
	
	public double Sacar(double dinheiro) {
		saldo = saldo - dinheiro;
		return saldo;
	}
	
	public double depositar(double dinheiro) {
		saldo = saldo + dinheiro;
		return saldo;
	}
	
	public void mostarinfo() {
		System.out.println(nomeBanco);
		System.out.println(nomeUsuario);
		System.out.println(saldo);
	}
	
	

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
