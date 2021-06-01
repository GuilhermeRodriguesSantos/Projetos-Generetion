programa
{
	
	funcao inicio()
	{
		/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
		o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

		 real nota[5], maiorNota = 0.0
		 inteiro contador, numeroAluno = 0

		 para(contador = 0 ; contador < 5 ; contador ++){
		 	escreva("\nDigite a nota da atividade do " ,(contador + 1), " aluno: ")
		 	leia(nota[contador])

		 	se(maiorNota <= nota[contador]){
		 		numeroAluno = (contador + 1)
		 		maiorNota = nota[contador]
		 	}
		 	
		 }

		 limpa()

		 escreva("\nA maior nota eh do aluno: ", numeroAluno, " que tirou: ", maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nota, 9, 8, 4}-{maiorNota, 9, 17, 9}-{numeroAluno, 10, 21, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */