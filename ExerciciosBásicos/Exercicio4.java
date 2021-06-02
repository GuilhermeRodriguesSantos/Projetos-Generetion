package ExerciciosBásicos;

import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A,B,C;
		double R,S,D;
		
		System.out.println("Digite o numero A: ");
		A = ler.nextInt();
		System.out.println("Digite o numero B: ");
		B = ler.nextInt();
		System.out.println("Digite o numero C: ");
		C = ler.nextInt();
		
		R = Math.pow(A + B, 2);
		S = Math.pow(B + C, 2);
		
		D = (R + S) / 2;
		
		System.out.println("O resultado final eh: " + D);
	}
}
