package ExerciciosLacosRepeticao;

import java.util.Scanner;
public class Exercicio1DoWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)*/
		
		int numero, somanumeros = 0;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		do {	
			if(numero > 0) {
				somanumeros += numero;
			}
			
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
		}while(numero!=0);
		
		System.out.println("A soma dos numeros eh: " + somanumeros);
	}
}
