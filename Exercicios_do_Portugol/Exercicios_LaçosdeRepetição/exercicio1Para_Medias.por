programa
{	
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
		a) média do salário da população;
		b) média do número de filhos;
		c) maior salário;
		d) percentual de pessoas com salário até R$100,00.*/

		inteiro numerodeFilhos, totaldeFilhos = 0, MediadeFilhos
		real salario, mediaSalario, salarioTotal= 0.0, maiorSalario = 0.0, pessoasSalario = 0.0,percentual

		para(inteiro i = 1; i<=20; i++){
			escreva("\nDigite o salário do Habitante ", i , ": ")
			leia(salario)
 
			escreva("\nDigite a quantidade de filhos do Habitante ", i, ": ")
			leia(numerodeFilhos)

			salarioTotal = salarioTotal + salario
			totaldeFilhos = totaldeFilhos + numerodeFilhos

			se(maiorSalario < salario){
				maiorSalario = salario
			}

			se(salario <= 100.00){
				pessoasSalario = pessoasSalario + 1
			}
			
			limpa()	
		}
			mediaSalario = salarioTotal / 20
			MediadeFilhos = totaldeFilhos / 20
			percentual = (pessoasSalario * 100) / 20

			escreva("\nA média do salário da população eh: ", math.arredondar(mediaSalario,3))
			escreva("\nA média do número de filhos da população eh: ", MediadeFilhos)
			escreva("\nO maior salário da população eh: ", math.arredondar(maiorSalario, 3))
			escreva("\nO percentual de pessoas com salário até R$100,00 eh: ", percentual)
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 972; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */