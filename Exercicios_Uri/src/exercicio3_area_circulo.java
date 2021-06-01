import java.util.*;
import java.util.Scanner;

public class exercicio3_area_circulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double A;
		double n = 3.14159;
		double R;
		
		R = ler.nextDouble();
		
		
		A = n *  Math.pow(R, 2);
		System.out.printf("A=%.4f%n",  A);
	}
}