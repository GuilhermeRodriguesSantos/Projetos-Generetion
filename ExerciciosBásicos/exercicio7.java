package ExerciciosBásicos;

import java.util.*;
public class exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,e,f,x,y;
		
		System.out.println("digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("digite o valor de c: ");
		c = ler.nextInt();
		System.out.println("digite o valor de d: ");
		d = ler.nextInt();
		System.out.println("digite o valor de e: ");
		e = ler.nextInt();
		System.out.println("digite o valor de f: ");
		f = ler.nextInt();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		
		System.out.println("Valor final de X: " + x);
		System.out.println("Valor final de Y: " + y);
		
	}
}
