programa
{
	inclua biblioteca Matematica--> math
	
	funcao inicio()
	{
		/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
		de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
		regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
		excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
		verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
		da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
		ZERO.*/

		real PesoTomate = 0.0, ExcessoPeso = 0.0, multa = 0.0, valorMulta = 4.0, pesoMaximo = 50.0

		escreva("\nDigite o peso do Tomate: ")
		leia(PesoTomate)

		se (PesoTomate > pesoMaximo){
			ExcessoPeso = PesoTomate - pesoMaximo
			multa = ExcessoPeso * valorMulta

			escreva("\nVocê tem o Excesso de: ", math.arredondar(ExcessoPeso, 2), " do valor maximo")
			escreva("\nSua multa é de: ", math.arredondar(multa, 2))		
		}
		senao se(PesoTomate <= pesoMaximo){
			escreva("\nPeso dentro dos limites\n")
			escreva(ExcessoPeso, "\n")
			escreva(multa)	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1075; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */