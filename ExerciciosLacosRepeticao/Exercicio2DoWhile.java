package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2DoWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		int numero, Soma = 0, cont = 0;
		float media;

		System.out.println("Digite o valor do numero: ");
		numero = ler.nextInt();

		do {
			if (numero > 0) {
				if (numero % 3 == 0) {
					Soma += numero;
					cont++;
				}
			}

			System.out.println("Digite o valor do numero: ");
			numero = ler.nextInt();

		} while (numero != 0);

		media = Soma / cont;

		System.out.printf("A m�dia dos numeros multiplos de 3 eh: %.2f%n", media);
	}
}
