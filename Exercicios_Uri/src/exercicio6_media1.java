import java.util.*;
import java.util.Scanner;
public class exercicio6_media1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A,B;
		double peso1 =3.5, peso2 = 7.5;
		double MEDIA;
		
		A = ler.nextDouble();
		B = ler.nextDouble();
		
		MEDIA = (A * peso1 + B * peso2)  / 11.0;
		System.out.printf("MEDIA = %.5f%n" ,  MEDIA);
		
		
	}
}
