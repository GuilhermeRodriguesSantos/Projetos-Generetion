programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com
		os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
		contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/


		inteiro lancamento[10], x, contMaior = 0 , maiorLancamento = 0
		real  mediaLancamento, somaLancamento = 0.0

		para(x = 0 ; x < 10; x ++){
			escreva("\nDigite o valor da ", (x + 1), " jogada: ")
			leia(lancamento[x])
			

			somaLancamento = somaLancamento + lancamento[x]

			se(maiorLancamento < lancamento[x]){
				maiorLancamento = lancamento[x]	

			
			}	
				
		}

		para (x = 0 ; x < 10; x++){
			se(maiorLancamento == lancamento[x]){
				contMaior++
			}
		}

			limpa()
			
			mediaLancamento = somaLancamento / 10

			escreva("\nA media dos lancamentos eh: ", math.arredondar(mediaLancamento, 3))
			escreva("\nA maior pontuação se repitiu: ", contMaior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */