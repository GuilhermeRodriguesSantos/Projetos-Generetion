package ExerciciosB�sicos;

import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		
		int anos,dias,meses,diasTotal;
		
		System.out.println("Digite quantos anos voc� tem: ");
		anos = ler.nextInt();
		System.out.println("Digite quantos m�ses voc� tem: ");
		meses = ler.nextInt();
		System.out.println("Digite quantos dias voc� tem: ");
		dias = ler.nextInt();
		
		diasTotal = (anos * 365 )+ (meses * 30) + dias;
		
		System.out.println("O total de dias eh: " + diasTotal);
		
		
	}
}
