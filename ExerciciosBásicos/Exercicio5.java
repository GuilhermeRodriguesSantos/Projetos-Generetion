package ExerciciosB�sicos;

import java.util.*;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final 
		deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */
		
		double nota1, nota2, nota3, peso1 = 2, peso2 = 3, peso3 = 5, total;
		
		System.out.println("Digite a nota 1: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = ler.nextDouble();
		
		
		total = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3) ;
		
		System.out.println("A m�dia final eh: " + total);
		
	}
}
