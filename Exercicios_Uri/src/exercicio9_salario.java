import java.util.*;
import java.util.Scanner;
	public class exercicio9_salario {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int numeroFuncionario, horasTrabalhadas;
			double salarioHora;
			double salario;
			
			numeroFuncionario = ler.nextInt();
			horasTrabalhadas = ler.nextInt();
			salarioHora = ler.nextDouble();
			
			salario = horasTrabalhadas * salarioHora;
			
			System.out.println("NUMBER = " + numeroFuncionario);
			System.out.printf("SALARY = U$ %.2f%n", salario);
				
		}
}
