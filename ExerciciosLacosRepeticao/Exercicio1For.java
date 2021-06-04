package ExerciciosLacosRepeticao;

import java.util.Scanner;
public class Exercicio1For {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
		
		for(int x =  1000 ; x < 2000; x++) {
			if(x % 11 == 5) {
				
				System.out.println("Numero dividio pro 11 resto 5 = " + x);
			}
		}
	}
}
