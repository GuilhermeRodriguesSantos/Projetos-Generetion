package Exercicio_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Produtos implements InformacoesProdutos{
	Scanner ler = new Scanner(System.in);
	
	ArrayList<String> nomesProdutos = new ArrayList<String>();
	
	private String nome;
	
	public Produtos() {
		this.nome = getNome();
	}
	
	@Override
	public void AdicionarProduto(String nome) {
	
		nomesProdutos.add(nome);
		
	}
	
	@Override
	public void DeletarProduto(String nome) {
	
		if(nomesProdutos.contains(nome)) {
			nomesProdutos.remove(nome);
		}else {
			System.out.println("impossivel deletar pois o produto não existe");
		
		}
	}
	
	@Override
	public void AlterarProduto(String nome) {
		System.out.println("Digite o nome do produto que ficará no lugar: ");
		String nome2 = ler.next();
		if(nomesProdutos.contains(nome)) {
			nomesProdutos.remove(nome);
			nomesProdutos.add(nome2);
			
			System.out.println(nomesProdutos);
		}
	}
	
	
	@Override
	public void MostarInformacoes() {
		Collections.sort(nomesProdutos);
		System.out.println(nomesProdutos);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
}
