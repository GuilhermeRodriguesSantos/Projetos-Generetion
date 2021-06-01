programa
{
	inclua biblioteca Matematica--> math
	
	funcao inicio()
	{
		/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente.*/

		inteiro codigo, numeroHorasT,horasAcima
		real salario, ganhoH = 10.0, salarioE = 20.00, totalSalatioE = 0.0

		escreva("\nDigite o seu código: ")
		leia(codigo)

		escreva("\nDigite o Numero de horas trabalhada: ")
		leia(numeroHorasT)

		se(numeroHorasT <= 50){
			salario = numeroHorasT * ganhoH
			escreva("\nSeu salario é de: ", math.arredondar(salario,2), " Reais")
		}
		senao se (numeroHorasT >=50){
			horasAcima = numeroHorasT - 50
			totalSalatioE = horasAcima * salarioE

			numeroHorasT = 50	
			salario =  numeroHorasT * ganhoH

			 escreva("\nSeu salário total é de: ", math.arredondar(salario,2))
			 escreva("\nSeu salário Execedente é de: ", math.arredondar(totalSalatioE,2))	 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1231; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */