package ExerciciosBásicos;

import java.util.*;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x1,x2,y1,y2;
		double total,p1,p2;
		
		System.out.println("Digite o x1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o x2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o y2: ");
		y2 = ler.nextInt();
		
		
		p1 = Math.pow(x2 - x1 , 2);
		p2 = Math.pow(y2 - y1, 2);
		
		total = Math.sqrt(p1 + p2);
		
		System.out.printf("O resultado final eh:%.2f " , total);
	}
}
