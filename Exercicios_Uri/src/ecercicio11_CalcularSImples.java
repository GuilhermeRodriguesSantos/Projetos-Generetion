import java.util.*;
import java.util.Scanner;
public class ecercicio11_CalcularSImples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int produto1, quantidade1, produto2, quantidade2;
		double valor1, valor2, total1, total2, valoraPagar;
		
		produto1 = ler.nextInt();
		quantidade1 = ler.nextInt();
		valor1 = ler.nextDouble();
		
		produto2 = ler.nextInt();
		quantidade2 = ler.nextInt();
		valor2 = ler.nextDouble();
		
		total1 = quantidade1 * valor1;
		total2 = quantidade2 * valor2;
		
		valoraPagar = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valoraPagar);
		
		
	}
}
