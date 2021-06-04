package ExerciciosLacosRepeticao;

import java.util.Scanner;
public class Exercicio2For {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
		int numero , contpar = 0 , contimpar = 0;
		for(int x = 1 ; x <= 10 ; x ++) {
			
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			if(numero % 2 == 0) {
				contpar ++;
			
			}else {
				contimpar ++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: " + contpar);
		System.out.println("Quantidade de numeros pares: " + contimpar);
	}
}
