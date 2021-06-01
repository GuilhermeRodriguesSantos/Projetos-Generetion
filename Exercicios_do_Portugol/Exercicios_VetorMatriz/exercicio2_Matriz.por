programa
{
	
	funcao inicio()
	{
		/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/

		real valores[3][3], somaValores = 0.0, somaDiagonal = 0.0
		inteiro linha, coluna

		para(linha = 0 ; linha < 3 ; linha ++){
			para(coluna = 0 ; coluna < 3 ; coluna ++){
				
				escreva("\nDigite o valor da linha: ", linha, " Coluna: ", coluna, ": " )
				leia(valores[linha][coluna])

				somaValores = somaValores + valores[linha][coluna]

				se(linha == coluna){
					somaDiagonal = somaDiagonal + valores[linha][coluna]
				}
			}
		}
		limpa()	
		escreva("\nA soma dos valores é: ", somaValores)
		escreva("\nA soma dos valores da primeira diagonal eh: ", somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 9, 7, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */