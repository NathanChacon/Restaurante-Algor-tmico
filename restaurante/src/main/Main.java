package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import atendente.Atendente;
import cliente.Cliente;
import produtos.Produto;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i;
		Atendente atendente = new Atendente("Suellen");
		LinkedList<Cliente> clientes = new LinkedList();
		HashMap<Number,Produto> cardapio = new HashMap();
		cardapio.put(1, new Produto("Feijão",10.00f));
		cardapio.put(2, new Produto("Arroz",11.00f));
		cardapio.put(3, new Produto("Batata",12.00f));
		cardapio.put(4, new Produto("Farofa",13.00f));
		cardapio.put(5, new Produto("Macarrão",14.00f));
		cardapio.put(6, new Produto("Bife",15.00f));
		
		for(i = 1; i <= 10; i++) {
			clientes.add(new Cliente("cliente",cardapio,atendente));
		}
		
		for (Iterator<Cliente> j = clientes.iterator(); j.hasNext();) {
			Cliente cliente = j.next();
	        cliente.fazerPedido(1);
	        cliente.visualizarProdutosConsumidos();
	        cliente.pagarConta();
		}
		
	}

}
