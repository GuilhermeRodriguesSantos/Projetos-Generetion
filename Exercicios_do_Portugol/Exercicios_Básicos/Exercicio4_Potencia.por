programa
{
	inclua biblioteca Matematica--> math
	
	funcao inicio()
	{
		inteiro A, B, C, D, R, S

		escreva("\nInforme o numero A: ")
		leia(A)

		escreva("\nInforme o numero B: ")
		leia(B)

		escreva("\nInforme o numero C: ")
		leia(C)

		R = math.potencia(A + B, 2)
		S = math.potencia(B + C, 2)

		D = (R + S) / 2

		escreva("\nO resultado é = ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */