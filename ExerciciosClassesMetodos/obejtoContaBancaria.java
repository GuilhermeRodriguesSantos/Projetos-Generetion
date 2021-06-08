package ExerciciosClassesMetodos;

public class obejtoContaBancaria {
	public static void main(String[] args) {
		
		classeContaBancaria[] contas = new classeContaBancaria[3];
		contas[0] = new classeContaBancaria("Bradesco", "José", 2000);
		contas[1] = new classeContaBancaria("Itaul", "Guilherme ", 3000);
		contas[2] = new classeContaBancaria("Itaul", "luis", 3000);
		
		
		for(classeContaBancaria a: contas) {
			a.mostarinfo();
			System.out.println();
		}
		
		
		
		for(classeContaBancaria b : contas) {
			b.depositar(500);
			b.Sacar(200);
			b.mostarinfo();
			System.out.println();
		}
		
	}
}
