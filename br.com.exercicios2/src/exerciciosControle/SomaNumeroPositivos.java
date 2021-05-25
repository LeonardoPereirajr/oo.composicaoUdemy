package exerciciosControle;

import java.util.Scanner;

public class SomaNumeroPositivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma=0;
		int numero=0;
		while (numero >= 0) {
			System.out.print("Digite um numero para somar : ");
			numero = entrada.nextInt();
			if(numero >=0) {
				soma += numero;
				System.out.printf(" \nA soma dos numeros digitados foi %s \n", soma);
			}
		}
			

		entrada.close();

		

	}

}
