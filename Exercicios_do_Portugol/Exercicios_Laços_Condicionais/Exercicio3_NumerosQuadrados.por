programa
{
	inclua biblioteca Matematica--> math
	funcao inicio()
	{
		/*3) Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

		real numero1, numero2, numero3, numero4, resu1, resu2, resu3, resu4

		escreva("\nDigite o numero 1: ")
		leia(numero1)

		escreva("\nDigite o numero 2: ")
		leia(numero2)

		escreva("\nDigite o numero 3: ")
		leia(numero3)

         	escreva("\nDigite o numero 4: ")
		leia(numero4)

		resu1 = math.potencia(numero1, 2.0)
		resu2 = math.potencia(numero2, 2.0)
		resu3 = math.potencia(numero3, 2.0)
		resu4 = math.potencia(numero4, 2.0)

		se(resu3 >= 1000){
			escreva("\nQuadrado do numero 3: ", math.arredondar(resu3, 2))
		}
		senao{
			escreva("\nQuadrado do numero 1: ", math.arredondar(resu1, 2))
			escreva("\nQuadrado do numero 2: ", math.arredondar(resu2, 2))
			escreva("\nQuadrado do numero 3: ", math.arredondar(resu3, 2))
			escreva("\nQuadrado do numero 4: ", math.arredondar(resu4, 2))
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */