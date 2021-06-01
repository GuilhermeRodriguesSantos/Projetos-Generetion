programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo.*/

		inteiro numero, totalSomatorio = 0, mediaNumero, totalNumeros = 0

		escreva("\nDigite um número: ")
		leia(numero)

		enquanto(numero >= 0){
			totalSomatorio = totalSomatorio + numero
			totalNumeros = totalNumeros + 1	

			escreva("\nDigite um número: ")
			leia(numero)
			
		}
			se(totalNumeros == 0){
				escreva("\nNão é possivel fazer divisão por zero!")
			}senao{
	
			mediaNumero = totalSomatorio / totalNumeros
			limpa()

			escreva("\nA somatória dos números eh: ", totalSomatorio)
			escreva("\nA média dos números eh: ", mediaNumero)
			escreva("\nA total dos números eh: ", totalNumeros)
			}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */