package ExerciciosClassesMetodos;

public class objetoProduto {
	public static void main(String[] args) {
		
		classeProduto produto1 = new classeProduto("Iphone", "apple", "branco", 2000);
		classeProduto produto2 = new classeProduto("Samsung A30", "samsung", "preto", 3000);
		
		produto1.aprensetarProduto();
		produto1.desligar();
		
		System.out.println();
		produto2.aprensetarProduto();
		produto2.ligar();
		
		
	}
}
