package ExerciciosClassesMetodos;

public class objetoCliente {
	public static void main(String[] args) {
		
		ClasseCliente  cliente1 = new ClasseCliente("Luis" , 33, 572616272);
		
		cliente1.exibirInformações();
		cliente1.comprar();
		
		System.out.println();
		System.out.println("Mudando o nome e a idade do cliente:");
		cliente1.setnome("Guilherme");
		cliente1.setidade(19);
		
		cliente1.comprar();
		cliente1.exibirInformações();
	}

}
