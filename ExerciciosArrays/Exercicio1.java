package ExerciciosArrays;

import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
		inteiros. O programa deve executar os seguintes passos:
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
		A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
	
		
		int[] numeros = {1, 0, 5, -2, -5, 7 };
		int somaNumeros = 0;
		
		for(int a: numeros) {
			somaNumeros = numeros[0] + numeros[1] + numeros[5];
		}
		
		System.out.println("A soma das posições eh: " + somaNumeros);
		
		numeros[4] = 100;
		
		for(int i = 0 ; i < numeros.length; i++ ) {
			System.out.println("O valor da posição: " + (i + 1) + " eh: " + numeros[i]);
		}
	
	}
}
