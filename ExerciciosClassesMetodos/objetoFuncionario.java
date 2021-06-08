package ExerciciosClassesMetodos;

public class objetoFuncionario {
	public static void main(String[] args) {
		
		classeFuncionario fun1 = new classeFuncionario("Guilherme", 19, "São Paulo","Gui@123", "Masculino", 2000);
		classeFuncionario fun2 = new classeFuncionario("Luisa", 20, "São Paulo","Luiza@123", "Feminino", 3000);
		
		fun1.exibirInformacoes();
		fun1.sabernvoSalario(2);
		
		System.out.println();
		
		fun2.exibirInformacoes();
		fun1.sabernvoSalario(2);

	}
}
