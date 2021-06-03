package ExercicosLaçosCondicionais;

import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o numero 1: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o numero 2: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o numero 3: ");
		numero3 = ler.nextInt();
		
		System.out.println("\n");
		
		if((numero1 > numero2 && numero1 > numero3) && (numero2 > numero3)) {
			System.out.println(numero3 + "\n" + numero2 + "\n" + numero1);
			
		}else if((numero1 > numero2 && numero1 > numero3) && (numero3 > numero2)) {
			System.out.println(numero2 + "\n" + numero3 + "\n" + numero1);
			
		}else if(numero2 > numero3 && numero3 > numero1) {
			System.out.println(numero1 + "\n" + numero3 + "\n" + numero2);
			
		}else if(numero2 > numero3 && numero1 > numero3) {
			System.out.println(numero3 + "\n" + numero1 + "\n" + numero2);
			
		}else if(numero2 > numero1){
			System.out.println(numero1 + "\n" + numero2 + "\n" + numero3);
			
		}else {
			System.out.println(numero2 + "\n" + numero1 + "\n" + numero3);
		}
	}
}
