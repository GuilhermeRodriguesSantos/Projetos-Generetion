package ExerciciosClassesMetodos;

public class objetoAviao {
	public static void main(String[] args) {
		
		classeAviao aviao = new classeAviao("ford", "Branco", 0, 0, 100);
		
		aviao.exibirInforma��es();
		System.out.println();
		
		aviao.iniciarVoou();
		aviao.acelerar(70);
		
		System.out.println();
		System.out.println("Mudando a marca e cor do avi�o: ");
		aviao.setMarca("gol");
		aviao.setCor("azull");
		aviao.exibirInforma��es();
		
		System.out.println();
		aviao.pousar();
	}
}
