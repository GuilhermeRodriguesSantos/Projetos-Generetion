package ExerciciosArrays;

import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*2- Faça um programa que receba 6 números inteiros e mostre:
		• Os números pares digitados;
		• A soma dos números pares digitados;
		• Os números ímpares digitados;
		• A quantidade de números ímpares digitados.*/
		
		int[] numeros = new int[6];
		int somaPar = 0, somaImpar = 0 , quantImpar = 0;
		
		for(int i = 0 ; i< numeros.length; i++) {
			System.out.println("Digite o valor da posição: " + (i + 1) + ": ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i] % 2 == 0) {
				somaPar += numeros[i];
			}else {
				quantImpar++;
			}
		}
		
		for(int i = 0 ; i < numeros.length ; i ++) {
			if(numeros[i] % 2 == 0) {
				System.out.println("Numero par: " + numeros[i]);
			}
		}
		
		System.out.println();
		for(int i = 0 ; i < numeros.length ; i ++) {
			if(numeros[i] % 2 == 1) {
				System.out.println("Numero impar: " + numeros[i]);
			}
		}
		
		System.out.println();
		
		System.out.println("A soma dos numeros pares eh: " + somaPar);
		System.out.println("A Quantidade dos numeros impares eh: " + quantImpar);
	}
}
