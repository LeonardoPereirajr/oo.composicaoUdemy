package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";

		do {
			System.out.println("Precisa falar a palavra magica ");
			System.out.println("Voce quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("obrigado");
		entrada.close();

	}

}
