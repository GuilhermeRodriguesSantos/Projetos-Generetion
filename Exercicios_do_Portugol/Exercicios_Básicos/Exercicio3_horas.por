programa
{
	
	funcao inicio()
	{
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
		e mostre-o expresso em horas, minutos e segundos.*/ 

		inteiro duracao, horas, minutos, segundos

		escreva("\nInforme a duração total do evento: ")
		leia(duracao)

		horas = duracao /3600
		minutos = (duracao % 3600) / 60
		segundos = (duracao % 3600) % 60

		escreva("\nO total de horas foram: ", horas)
		escreva("\nO total de minutos foram: ", minutos)
		escreva("\nO total de segundos foram: ", segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */