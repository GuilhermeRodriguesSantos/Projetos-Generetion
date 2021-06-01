programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][2] , linha, coluna,contpar = 0
		real somaNumeros = 0.0 , mediaNumeros

		para(linha = 0; linha < 3; linha ++){
			para(coluna = 0; coluna <2; coluna ++){
				escreva("\nDigite o valor da linha: ", linha, " coluna: ", coluna, ": ")
				leia(numeros[linha][coluna])

				se(numeros[linha][coluna] % 2 == 0){
					somaNumeros = somaNumeros + numeros[linha][coluna]
					contpar++
				}
			}
		}

			limpa()
		para(linha = 0; linha < 3; linha++){
			para(coluna = 0; coluna <2; coluna++){
				escreva("\nValor linha: ", linha, " coluna: ", coluna, " = " , numeros[linha][coluna])
			}
		}

		mediaNumeros = somaNumeros / contpar
		escreva("\nMedia dos numeros pares: ", mediaNumeros)
		escreva("\nNumero de pares: ", contpar)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{linha, 6, 26, 5}-{coluna, 6, 33, 6}-{contpar, 6, 40, 7}-{somaNumeros, 7, 7, 11}-{mediaNumeros, 7, 27, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */