programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real notas[5], somaNotas = 0.0, mediaNotas
		inteiro x

		para(x = 0; x < 5; x++){
			escreva("\nDigite a nota do ", (x + 1), " Aluno: ")
			leia(notas[x])

			somaNotas = somaNotas + notas[x]
		}

		para(x = 0; x<5; x++){
			escreva("\nNota do aluno [", (x+1), "]", " = "  ,notas[x])
		}

		mediaNotas = somaNotas / 5

		escreva("\nA media dos alunos eh: " , mediaNotas)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 7, 7, 5}-{somaNotas, 7, 17, 9}-{mediaNotas, 7, 34, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */