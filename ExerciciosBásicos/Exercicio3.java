package ExerciciosB�sicos;

import java.util.*;;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
		int duracao, horas,minutos,segundos;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		duracao = ler.nextInt();
		
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		
		
		System.out.println("Dura��o em horas: " + horas);
		System.out.println("Dura��o em minutos: " + minutos);
		System.out.println("Dura��o em segundos: " + segundos);
	
	}
}
