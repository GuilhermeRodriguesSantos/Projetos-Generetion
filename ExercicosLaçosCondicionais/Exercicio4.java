package ExercicosLa�osCondicionais;

import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/
		
		int numero;
		double raiz,potencia;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
			raiz = Math.sqrt(numero);
			System.out.println("E sua raiz quadrada eh: " + raiz);
			
		}else {
			System.out.println("Numero impar");
			potencia = Math.pow(numero, 2);
			System.out.println("E sua eleva��o quadrada eh: " + potencia);
		}
	}

}
