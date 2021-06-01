import java.util.*;
import java.util.Scanner;
public class exercicio10_salarioBonus {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		double salarioFixo, totalVendaMes, total, porcentagem;
		
		nome = ler.next();
		salarioFixo = ler.nextDouble();
		totalVendaMes = ler.nextDouble();
		
		porcentagem = (totalVendaMes / 100) * 15;
		total = salarioFixo + porcentagem;
		
		System.out.printf("TOTAL = R$ %.2f%n" , total);
			
		
	}

}
