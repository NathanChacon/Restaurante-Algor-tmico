package cliente;

import java.util.HashMap;
import java.util.LinkedList;

import atendente.Atendente;

import java.util.Iterator;

import produtos.Produto;

public class Cliente {
	private String nome;
	private LinkedList<Produto> produtosConsumidos = new LinkedList();
	private HashMap<Number,Produto> cardapio;
	private Atendente atendente;
	
	public Cliente(String nome, HashMap<Number,Produto> cardapio, Atendente atendente) {
		this.nome = nome;
		this.cardapio = cardapio;
		this.atendente = atendente;
	}
	
	public void listarCardapio() {
		for(Number key: this.cardapio.keySet()) {
		    System.out.println("Numero refeição: " + key);
		    System.out.println("Nome: " + this.cardapio.get(key).nome);
		    System.out.println("Preço: " + this.cardapio.get(key).preco);
		    System.out.println("-----------------------------------------------");
		}
	}
	
	public void fazerPedido(int numeroRefeicao) {
		Produto produto  = this.cardapio.get(numeroRefeicao);
		this.produtosConsumidos.add(produto);
		System.out.print("Pedido feito com sucesso\n");
	}
	
	public void visualizarProdutosConsumidos() {
		for (Iterator<Produto> i = this.produtosConsumidos.iterator(); i.hasNext();) {
			Produto produto = i.next();
	        System.out.print("Nome: " + produto.nome + "\n");
	        System.out.print("Preço: " + produto.preco + "\n");
		}
	}
	
	public void pagarConta() {
		this.atendente.efetuarPagamento(this.produtosConsumidos);
	}
                                                      
}                                                     
