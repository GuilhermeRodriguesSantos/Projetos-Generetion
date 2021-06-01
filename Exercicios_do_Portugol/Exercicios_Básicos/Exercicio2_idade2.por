programa
{
	
	funcao inicio()
	{
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

		 inteiro totaldedias, anos, meses, dias

		 escreva("\nDigite os dias vididos: ")
		 leia(totaldedias)

		 anos = totaldedias / 365
		 meses = (totaldedias % 365) / 30
		 dias = (totaldedias % 365) % 30

		 escreva("\nTotal de anos = ", anos)
		 escreva("\nTotal de meses = ", meses)
		 escreva("\nTotal de dias = ", dias)

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 469; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */