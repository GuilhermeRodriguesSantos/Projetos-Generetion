package Exercicio_ArrayList;

import java.util.Scanner;
public class TestaProdutos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		
		Produtos prod1 = new Produtos();
				
		int op;
		
		do {
			System.out.println("\nMenuuu");
			System.out.println("-------------------------------------");
			System.out.println("\nDigite 1 para Adicionar\nDigite 2 para remover\nDigite 3 para Altenar\nDigite 4 para Mostar todos");
			op = ler.nextInt();
			
			switch(op) {
			case 1:{
				System.out.println("Nome do Produto que deseja adicionar: ");
				String nome = ler.next();
				
				prod1.AdicionarProduto(nome);
				break;
			
			}
			case 2:{
				
				System.out.println("Nome do Produto que deseja excluir: ");
				String nome = ler.next();
				prod1.DeletarProduto(nome);
				break;
			}
			case 3:{
				System.out.println("Digite o nome que deseja alterar: ");
				String nome = ler.next();
				prod1.AlterarProduto(nome);
				break;
			}
			case 4:{
				prod1.MostarInformacoes();
				break;
			}
			default:{
				System.out.println("numero invalido!!");
				break;
			}
			
		}
			
		}while(op!=0);
	}
}
