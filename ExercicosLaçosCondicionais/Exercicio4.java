package ExercicosLaçosCondicionais;

import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		int numero;
		double raiz,potencia;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
			raiz = Math.sqrt(numero);
			System.out.println("E sua raiz quadrada eh: " + raiz);
			
		}else {
			System.out.println("Numero impar");
			potencia = Math.pow(numero, 2);
			System.out.println("E sua elevação quadrada eh: " + potencia);
		}
	}

}
