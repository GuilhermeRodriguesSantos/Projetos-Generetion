programa
{
	
	funcao inicio()
	{
		inteiro tabuada, contador, resultado

		escreva("\nDigite o numero da tabuada desejada: ")
		leia(tabuada)
		limpa()
		
		para(contador = 1; contador <=10; contador++){

			resultado = tabuada * contador

			escreva("\n", contador, " * ", tabuada, " = ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */