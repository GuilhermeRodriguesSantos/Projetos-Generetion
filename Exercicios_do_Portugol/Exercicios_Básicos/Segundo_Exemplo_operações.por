programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		real numero1, numero2, soma, subtracao, multiplicacao, divisao

		//fazendo as operações
		escreva("\nDigite o numero 1: ")
		leia(numero1)

		escreva("\nDigite o numero 2: ")
		leia(numero2)

		soma = numero1 + numero2
		escreva("\nA soma é: ", mat.arredondar(soma,2))

		subtracao = numero1 - numero2
		escreva("\nA subtração é: ", mat.arredondar(subtracao,2))

		multiplicacao = numero1 * numero2
		escreva("\nA multiplicação é: ", mat.arredondar(multiplicacao,2))

		divisao = numero1 / numero2
		escreva("\nA divisão é: ", mat.arredondar(divisao,2))
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */