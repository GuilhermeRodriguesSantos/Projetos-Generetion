package ExercicioPolimorfismo;

import java.util.Scanner;

public class Testandoo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro("Bill",7,20.5,"pitbull","sim");
		Cavalo cavalo = new Cavalo("josé", 19,"sim", 44.7);
		Preguica preguica = new Preguica("Guilherme", 17, "Claro");
		Animal animal = null;
		
		System.out.println("Escolha o Animal\nDigite 1 para Cachorro:\nDigite 2 para Cavalo:\nDigite 3 para Preguiça");
		int op = ler.nextInt();
		
		switch(op) {
		case 1:{
			animal = cachorro;
			System.out.println("\nQue som seu cachorro faz? ");
			String som = ler.next();
			System.out.println("\nEm qual velocidade seu cachorro está correndo? ");
			int corre = ler.nextInt();
			animal.mostrarInformacoes();
			animal.emitirSom(som);
			animal.correr(corre);
			break;
		}
		
		case 2:{
			animal = cavalo;
			System.out.println("\nQue som seu cavalo faz? ");
			String som = ler.next();
			System.out.println("\nEm qual velocidade seu cavalo está correndo? ");
			int corre = ler.nextInt();
			animal.mostrarInformacoes();
			animal.emitirSom(som);
			animal.correr(corre);	
			break;
		}
		case 3:{
			animal = preguica;
			System.out.println("\nQue som sua preguiça faz? ");
			String som = ler.next();
			System.out.println("\nEm qual velocidade sua preguiça está correndo? ");
			int corre = ler.nextInt();
			animal.mostrarInformacoes();
			animal.emitirSom(som);
			animal.correr(corre);
			break;
		}
		default:{
			System.out.println("numero invalido");
			break;
		}
	}
		
	}
}
