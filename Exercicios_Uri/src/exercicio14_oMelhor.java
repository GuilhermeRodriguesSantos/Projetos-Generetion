import java.util.*;
import java.util.Scanner;

	public class exercicio14_oMelhor {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int numero1, numero2, numero3;
			numero1 = ler.nextInt();
			numero2 = ler.nextInt();
			numero3 = ler.nextInt();
			
				if(numero1 > numero2 && numero1 > numero3) {
					System.out.println(numero1 + " eh o maior");
				}else if(numero2 > numero3 ) {
					System.out.println(numero2 + " eh o maior");
				}else {
					System.out.println(numero3 + " eh o maior");
				}
		}
}
