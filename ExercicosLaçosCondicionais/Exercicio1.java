package ExercicosLa�osCondicionais;

import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o numero 1: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o numero 2: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o numero 3: ");
		numero3 = ler.nextInt();
	
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O numero 1 � o maior");
		}else if(numero2 > numero3) {
			System.out.println("O numero 2 � o maior");
		}else {
			System.out.println("O numero 3 � o maior");
		}
	
	}
}
