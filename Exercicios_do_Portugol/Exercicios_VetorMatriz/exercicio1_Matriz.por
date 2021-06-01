programa
{
	
	funcao inicio()
	{
		/*3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

		inteiro N1[4][6] , N2[4][6] ,M1[4][6], M2[4][6], linha = 0 , coluna = 0

		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("\nDigite os valores da N1: ")
				leia(N1[linha][coluna])
			}
		}

		limpa()
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("\nDigite os valores da N2: ")
				leia(N2[linha][coluna])
			}
		}

		limpa()
		//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
			}
		}
		//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}

		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("[" , N1[linha][coluna], "]")
			}
				escreva("\n")
		}
		
				escreva("\n")
				
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("[" , N2[linha][coluna], "]")
			}
				escreva("\n")
		}

				escreva("\n")
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("[" , M1[linha][coluna], "]")
			}
				escreva("\n")
		}

				escreva("\n")
		para(linha = 0 ; linha < 4 ; linha ++){
			para(coluna = 0 ; coluna < 6 ; coluna ++){
				escreva("[" , M2[linha][coluna], "]")
			}
				escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1998; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 10, 10, 2}-{N2, 10, 21, 2}-{M1, 10, 31, 2}-{M2, 10, 41, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */