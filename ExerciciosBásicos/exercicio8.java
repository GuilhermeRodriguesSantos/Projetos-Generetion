package ExerciciosBásicos;

import java.util.*;
public class exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem
		do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
		do distribuidor seja de 28% e os impostos de 45%,escrever um sistema que leia o custo de fábrica de um carro 
		e escreva o custo ao consumidor.  */
		
		double custoFabrica,  distribuidor = 73 , total;
		
		System.out.println("Digite o custo de Fabrica: ");
		custoFabrica = ler.nextDouble();
		
		total = (custoFabrica / 100) * 73 + custoFabrica;
		
		System.out.println("Total final eh: " + total);
		
		
	}
}
