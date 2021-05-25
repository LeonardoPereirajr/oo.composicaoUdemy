package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Carlo");
		listaAprovados.add("Ana");

		for (String cadidato : listaAprovados) {
			System.out.println(cadidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		listaAprovados.add("Pedro");

		for (int n : nums) {
			System.out.println(n);
		}
	}

}
