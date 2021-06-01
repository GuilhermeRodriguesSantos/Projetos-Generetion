import java.util.*;
import java.util.Scanner;
	public class exeercicio15_consumo {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int X;
			double Y;
			
			X = ler.nextInt();
			Y = ler.nextDouble();
			
			double resultado = (X / Y);
			
			System.out.printf("%.3f km/l%n" , resultado);
		}
}
