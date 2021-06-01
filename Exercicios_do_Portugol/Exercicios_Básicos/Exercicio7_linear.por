programa
{
	inclua biblioteca Matematica--> math
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y

		escreva("\nInforme o valor de A: ")
		leia(a)
		
		escreva("\nInforme o valor de B: ")
		leia(b)
		
		escreva("\nInforme o valor de C: ")
		leia(c)
		
		escreva("\nInforme o valor de D: ")
		leia(d)
		
		escreva("\nInforme o valor de E: ")
		leia(ee)
		
		escreva("\nInforme o valor de F: ")
		leia(f)

		x = (c*ee - b*f) / (a*ee -b*d)
		y = (a*f - c*d) / (a*ee -b*d)

		escreva("\nO valor de X é: ", math.arredondar(x,2))
		escreva("\nO valor de Y é: ", math.arredondar(y,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */