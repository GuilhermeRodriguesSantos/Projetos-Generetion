package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2While {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/*
		 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE) o número de pessoas calmas; o número
		 * de mulheres nervosas; o número de homens agressivos; o número de outros
		 * calmos; o número de pessoas nervosas com mais de 40 anos; o número de pessoas
		 * calmas com menos de 18 anos.
		 */

		int idade, sexo, op, x = 1, TotalnumeroPC = 0, TotalMulheres = 0, TotalHomens = 0, outros = 0;
		int pessoasN = 0, pessoasC = 0;

		while (x <= 5) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();

			System.out.println("Seu sexo");
			System.out.println("Digite 1 para Feminino: \nDigite 2 para Masculino: \nDigite 3 para Outros");
			sexo = ler.nextInt();

			if (sexo >= 1 && sexo <= 3) {

				System.out.println("Escolha umas das opções: ");
				System.out.println("Digite 1 para Calmo:\nDigite 2 para Nervosa:\nDigite 3 para Agressivos");
				op = ler.nextInt();

				if (op >= 1 && op <= 3) {

					if (op == 1) {
						TotalnumeroPC++;
					}

					if (idade > 40 && op == 2) {
						pessoasN++;
					}

					if (idade < 18 && op == 1) {
						pessoasC++;
					}

					switch (sexo) {
					case 1: {
						if (op == 2) {
							TotalMulheres++;
						}
						break;
					}

					case 2: {
						if (op == 3) {
							TotalHomens++;
						}
						break;
					}

					case 3: {
						if (op == 1) {
							outros++;
						}
						break;
					}
					}

					x++;

				} else {
					System.out.println("Numero invalido!");
				}
			} else {
				System.out.println("Numero invalido:!");
			}
		}

		System.out.println("Numero de pessoas calmas: " + TotalnumeroPC);
		System.out.println("Numero de mulheres nervosas: " + TotalMulheres);
		System.out.println("Numero de Homes Agressivos: " + TotalHomens);
		System.out.println("Numero de outros calmos: " + outros);
		System.out.println("número de pessoas nervosas com mais de 40 anos: " + pessoasN);
		System.out.println("número de pessoas calmas com menos de 18 anos: " + pessoasC);
	}
}
