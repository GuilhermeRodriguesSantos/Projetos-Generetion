import java.util.*;
import java.util.Scanner;

public class exercicio7_media2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A,B,C,MEDIA;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		
		A = ler.nextDouble();
		B = ler.nextDouble();
		C = ler.nextDouble();
		
		MEDIA = (A * peso1 + B * peso2 + C * peso3) / 10.0;
		
		System.out.printf("MEDIA = %.1f%n" , MEDIA);
	}
}
