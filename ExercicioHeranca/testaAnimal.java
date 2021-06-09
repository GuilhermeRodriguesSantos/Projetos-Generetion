package ExercicioHeranca;

public class testaAnimal {
	public static void main(String[] args) {
		
		Cachorro bug = new Cachorro("bug", 15.5, 18,"boudogue");
		Cavalo feno = new Cavalo("Feno", 40.7, 6, "Masculino");
		Preguica cat = new Preguica("cat", 20.4,6, 77.4);
		
		bug.mostrarinformacoes();
		System.out.println();
		feno.mostarinformacoes();
		System.out.println();
		cat.mostrarinfo();
	}
}