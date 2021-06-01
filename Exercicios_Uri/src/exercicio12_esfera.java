import java.util.*;
import java.util.Scanner;
public class exercicio12_esfera {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int R;
		double pi = 3.14159, volume;
		
		R = ler.nextInt();
		volume =(4/3.0) * (pi * Math.pow(R, 3));
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
	}
}
