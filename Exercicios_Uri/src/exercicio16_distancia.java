import java.util.*;
import java.util.Scanner;

	public class exercicio16_distancia {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double x1,x2,y1,y2;
			
			x1 = ler.nextDouble();
			y1 = ler.nextDouble();
			x2 = ler.nextDouble();
			y2 = ler.nextDouble();
			
			double p1 = Math.pow(x2 - x1, 2);
			double p2 = Math.pow(y2 - y1, 2);
			
			double total = p1 + p2;
			double resultado = Math.sqrt(total);
			
			System.out.printf("%.4f%n", resultado);
		}
}
