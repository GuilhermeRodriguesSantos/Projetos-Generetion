programa
{
	
	funcao inicio()
	{
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

		inteiro anos, meses, dias, totaldeDias

		escreva("\nDigite o total de anos: ")
		leia(anos)

		escreva("\nDigite o total de meses: ")
		leia(meses)

		escreva("\nDiigite o total de dias: ")
		leia(dias)

		totaldeDias = (anos * 365) + (meses * 30) + dias

		escreva("\nO total de dias vididos são = ", totaldeDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */