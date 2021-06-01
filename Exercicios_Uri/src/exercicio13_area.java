import java.util.*;
import java.util.Scanner;
	public class exercicio13_area {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double A,B,C;
			
			A = ler.nextDouble();
			B = ler.nextDouble();
			C = ler.nextDouble();
			
			double triangulo = (A * C) / 2;
			double circulo = 3.14159 * Math.pow(C, 2);
			double trapezio = ((A + B) * C) / 2;
			double quadrado = Math.pow(B, 2);
			double retangulo = A * B;
			
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			System.out.printf("TRAPEZIO: %.3f%n", trapezio);
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			System.out.printf("RETANGULO: %.3f%n", retangulo);
			
			
		}
}
