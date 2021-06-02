package ExerciciosBásicos; 

import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	
		int diasTotal, anos, meses, dias;
		
		System.out.println("Digite a sua idade em dias: ");
		diasTotal = ler.nextInt();
		
		anos = 	diasTotal / 365;
		meses = (diasTotal % 365) / 30;
		dias = (diasTotal % 365) % 30;
		
		System.out.println("Seus anos são: " + anos);
		System.out.println("Seus mêses são: " + meses);
		System.out.println("Seus dias são: " + dias);
				
	}
}
