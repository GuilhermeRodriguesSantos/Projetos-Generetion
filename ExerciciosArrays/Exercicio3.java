package ExerciciosArrays;

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int numeros[][] = new int[3][3];
		int linha,coluna = 0,numerosMaiores;
		
		for(linha = 0 ; linha < 3 ; linha ++) {
			for(coluna = 0 ; coluna < 3 ; coluna++) {
				System.out.println("Digite o valor da linha: " + (linha) + " e coluna: " + (coluna) + ": ");
				numeros[linha][coluna] = ler.nextInt();
			}
		}
		
		for(linha = 0 ; linha < 3 ; linha ++) {
			for(coluna = 0 ; coluna < 3 ; coluna++) {
				if(numeros[linha][coluna] > 10) {
					System.out.println("Numero maior que 10: " + "linha: " + linha + " coluna " + coluna + " : "  + numeros[linha][coluna]);
				}
			}
		}
		
	}
}
