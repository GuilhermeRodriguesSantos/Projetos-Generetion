package ExerciciosClassesMetodos;

public class classePatinete {
	
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String dono;
	private String modelo;
	private String cor;

	public classePatinete(String dono, String modelo, String cor) {
		this.dono = dono;
		this.modelo = modelo;
		this.cor = cor;		
	}
	
	public void exibir() {
		System.out.println("O dono eh: " + dono);
		System.out.println("O modelo eh: " + modelo);
		System.out.println("A cor eh: " + cor);
	}
	
	public void Acelerar(double acelerar) {
		System.out.println("Acelerou: " + acelerar );
	}
	
	public String getdono() {
		return dono;
	}
	
	public void setdono(String dono) {
		this.dono = dono;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
}
