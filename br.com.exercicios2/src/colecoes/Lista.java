package colecoes;

import java.util.ArrayList;

public class Lista {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //imprime o nome do item 3

		lista.remove(1);
		lista.remove(new Usuario("Lia"));
		System.out.println(lista.contains("Bia"));
		
		for (Usuario u : lista) {
			System.out.println(u);
		}
	}

}
