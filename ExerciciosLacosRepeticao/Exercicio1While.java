package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio1While {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */

		int idade, contidade1 = 0, contidade2 = 0;

		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				contidade1++;

			} else if (idade > 50) {
				contidade2++;
			}

			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
		}

		System.out.println("Numero de pessoas com menos de 21 anos: " + contidade1);
		System.out.println("Numero de pessoas com mais de 50 anos: " + contidade2);
	}
}
