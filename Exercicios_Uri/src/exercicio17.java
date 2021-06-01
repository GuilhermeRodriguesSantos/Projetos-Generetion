import java.util.*;
import java.util.Scanner;
public class exercicio17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int carroX = 60, carroY = 90, distancia, numero = 2, total;
		distancia = ler.nextInt();
		
		total =  (distancia * numero);
		
		System.out.println(total + " minutos");
	}
}
