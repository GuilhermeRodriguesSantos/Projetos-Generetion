package ExerciciosClassesMetodos;

public class objetoPaciente {
	public static void main(String[] args) {
	
		classPaciente[] paci = new classPaciente[3];
		paci[0] = new classPaciente("Guilherme", 19, "To�e");
		paci[1] = new classPaciente("Maria", 20, "Febre");
		paci[2] = new classPaciente("Jo�o", 10, "Febre");
		
		
		for(classPaciente a: paci) {
			a.mostrarinformacoes();
			System.out.println();
		}
		
	}
}
