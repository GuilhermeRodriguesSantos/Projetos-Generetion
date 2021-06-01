programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 	
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00*/

		inteiro numerodeFilhos, somaFilhos = 0, mediaFilhos
		real salario, somaSalario = 0.0, mediaSalario, maiorSalario = 0.0,  numero100 = 0.0, percentual

		para(inteiro x = 1 ; x<= 4; x++){
		escreva("\nDigite o seu salario do Habitante: ", x ,": ")
		leia(salario)

		escreva("\nDigite o numero de filhos do Habitante: ", x, ": ")
		leia(numerodeFilhos)

		somaSalario = somaSalario + salario
		somaFilhos = somaFilhos + numerodeFilhos

		se(maiorSalario < salario){
			maiorSalario = salario
			}

		se(salario <= 100.00){
			numero100 = numero100 + 1
			}
		}

		mediaSalario = somaSalario / 4
		mediaFilhos = somaFilhos / 4

		percentual = (numero100 * 100) / 4
		limpa()

		escreva("\nA media do salario da população eh: ", math.arredondar(mediaSalario,2))
		escreva("\nA media de filhos da população eh: ", mediaFilhos)
		escreva("\nO maior salario da população eh: ", math.arredondar(maiorSalario,2))
		escreva("\nO percentual da população eh: ", math.arredondar(percentual,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1059; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */