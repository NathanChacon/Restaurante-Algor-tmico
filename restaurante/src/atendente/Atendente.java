package atendente;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import produtos.Produto;

public class Atendente {
	public String nome;
	public LinkedList<String> chocolates = new LinkedList(Arrays.asList("chocolate1","chocolate2","chocolate3","chocolate4","chocolate5"));
	
	public Atendente(String nome) {
		this.nome = nome;
	}
	
	public void efetuarPagamento(LinkedList<Produto> produtosCliente) {
		float precoTotal = 0f;
		for (Iterator<Produto> i = produtosCliente.iterator(); i.hasNext();) {
			Produto produto = i.next();
	        precoTotal += produto.preco;
		}
		
		System.out.print("------PAGANDO A CONTA------" + "\n");
		System.out.print("Preço pago: " + precoTotal + "\n");
		this.pegarChocolate();
		System.out.print("--------------------------------------" + "\n");
	}
	
	private void pegarChocolate() {
		if(this.chocolates.isEmpty() == false) {
			System.out.print("Você recebeu o chocalate " + this.chocolates.removeLast() + " de brinde!!" + "\n");	
		}
		else {
			System.out.print("Infelizmente os chocolates acabaram :(" + "\n");	
		}
	}

}
