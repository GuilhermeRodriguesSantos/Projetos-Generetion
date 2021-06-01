programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
		apresente no final o total do somatório, a média e o total de valores lidos. 
		O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/

		inteiro numero, somanumeros = 0, mediaNumeros, totalNumeros = 0

		escreva("\nDigite um numero: ")
		leia(numero)

		enquanto(numero >= 0){
			somanumeros = somanumeros + numero
			totalNumeros = totalNumeros + 1
			
			escreva("\nDigite um numero: ")
			leia(numero)
		}
		
		mediaNumeros = somanumeros / totalNumeros
		limpa()
		
		escreva("\nSoma dos numeros eh: ", somanumeros)
		escreva("\nMedia dos numeros eh: ", mediaNumeros)
		escreva("\nTotal dos numeros eh: ", totalNumeros)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */