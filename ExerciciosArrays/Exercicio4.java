package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/*
		 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
		 * ao usuário um menu de opções: (1) somar as duas matrizes (2) subtrair a
		 * primeira matriz da segunda (3) adicionar uma constante as duas matrizes (4)
		 * imprimir as matrizes Nas duas primeiras opções uma terceira matriz 2 x 2 deve
		 * ser criada. Na terceira opção o valor da constante deve ser lido e o
		 * resultado da adição da constante deve ser armazenado na própria matriz.
		 */

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		int op, op2;

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.println("Digite o valor da linha: " + linha + " e coluna: " + coluna + " : ");
				matriz1[linha][coluna] = ler.nextFloat();
			}
		}

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.println("Digite o valor da linha: " + linha + " e coluna: " + coluna + " : ");
				matriz2[linha][coluna] = ler.nextFloat();
			}
		}

		do {
			System.out.println();
			System.out.println("Menu de Opções:");
			System.out.println(
					"Digite 1 para Somar as duas Matrizes:\nDigite 2 para Subtrair a Primeira matriz da Segunda:\n"
							+ "Digite 3 oara Adicionar uma constante as duas Matrizes:\nDigite 4 para Imprimir as Matrizes:");
			op = ler.nextInt();

			switch (op) {
			case 1: {
				float[][] matriz3 = new float[2][2];

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
					}
				}

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz3[linha][coluna]);
					}
				}
				break;
			}

			case 2: {
				float[][] matriz3 = new float[2][2];

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz3[linha][coluna] = matriz2[linha][coluna] - matriz1[linha][coluna];
					}
				}

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz3[linha][coluna]);
					}
				}
				break;
			}
			case 3: {
				float numeroNovo;
				System.out.println("Digite o valor da contante: ");
				numeroNovo = ler.nextFloat();

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz1[linha][coluna] = matriz1[linha][coluna] + numeroNovo;
					}
				}

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz2[linha][coluna] = matriz2[linha][coluna] + numeroNovo;
					}
				}

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz1[linha][coluna]);
					}
				}

				System.out.println();

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz2[linha][coluna]);
					}
				}
				break;
			}

			case 4: {
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz1[linha][coluna]);
					}
				}

				System.out.println();

				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.println(matriz2[linha][coluna]);
					}
				}
				break;
			}

			default: {
				System.out.println("Numero invalido!!");
				break;
			}
			}
			
			System.out.println();
			System.out.println("Digite 1 para voltar e 2 pra sair: ");
			op2 = ler.nextInt();
			
			

		} while (op2 == 1);
	}
}
