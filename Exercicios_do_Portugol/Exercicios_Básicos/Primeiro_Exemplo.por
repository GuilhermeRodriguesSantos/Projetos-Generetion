programa
{
	inclua biblioteca Matematica--> mate
	
	funcao inicio()
	{	
		inteiro idade = 18   // declarando variavel inteira
		real altura = 1.82  // declarando variavel fracionaria
		cadeia nome = "Guilherme"  // declarando variavel de palavras

		//Exibindo os dados:
		escreva("\nMeu nome é: ", nome)
		escreva("\nEu tenho: " , idade , " anos")
		escreva("\nMinha altura é: ", altura, "\n")


		//Fazendo a média
		real nota1, nota2, nota3, media

		escreva("\nDigite a Primeira nota: ")
		leia(nota1)

		escreva("\nDigite a segunda nota: ")
		leia(nota2)

		escreva("\nDigite a terceira nota: ")
		leia(nota3)

		//calculando a media
		media = (nota1 + nota2 + nota3) / 3

		
		//Apresentando e fazendo uma função para arredondar
		escreva("\nMEdia final é ", mate.arredondar(media,2))


		//fazendo a função de raizQuadrada e Potencia

		real raizQuadrada, Potencia

		raizQuadrada = mate.raiz(media, 2.0)
		Potencia = mate.potencia(media, 2.0)

		escreva("\nA raiz da media é: ", mate.arredondar(raizQuadrada, 2))
		escreva("\nA potencia da media é: ", mate.arredondar(Potencia,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 642; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */