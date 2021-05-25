package controle;

import java.util.Scanner;

public class whileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Digite alguma coisa : ");
			valor = entrada.nextLine();
			System.out.println("Voce digitou "+ valor);
		}
			System.out.println("Saindo...");
		entrada.close();
	}
}
