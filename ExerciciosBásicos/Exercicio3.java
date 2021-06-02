package ExerciciosBásicos;

import java.util.*;;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
		int duracao, horas,minutos,segundos;
		
		System.out.println("Digite a duração do evento em segundos: ");
		duracao = ler.nextInt();
		
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		
		
		System.out.println("Duração em horas: " + horas);
		System.out.println("Duração em minutos: " + minutos);
		System.out.println("Duração em segundos: " + segundos);
	
	}
}
