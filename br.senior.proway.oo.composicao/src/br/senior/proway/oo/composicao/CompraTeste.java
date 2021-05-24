package br.senior.proway.oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.Cliente = "Joao Pedro";
		
		c1.adicionarItem(new Item("Caneta", 20, 7.45));
		c1.adicionarItem(new Item("Borracha", 21, 6.45));
		c1.adicionarItem(new Item("Caderno", 3, 18.45));
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		double total = c1.itens.get(1).compra.itens.get(1).compra.obterValorTotal();
		System.out.println(total);
	}
}
