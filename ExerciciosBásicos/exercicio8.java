package ExerciciosB�sicos;

import java.util.*;
public class exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem
		do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem 
		do distribuidor seja de 28% e os impostos de 45%,escrever um sistema que leia o custo de f�brica de um carro 
		e escreva o custo ao consumidor.  */
		
		double custoFabrica,  distribuidor = 73 , total;
		
		System.out.println("Digite o custo de Fabrica: ");
		custoFabrica = ler.nextDouble();
		
		total = (custoFabrica / 100) * 73 + custoFabrica;
		
		System.out.println("Total final eh: " + total);
		
		
	}
}
