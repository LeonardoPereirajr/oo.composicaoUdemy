package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double soma=0;//soma das notas
		double nota=0;// notas
		int contador = 0;//quantidade de notas
		while (nota!=-1) {
			System.out.println("Digite a nota do aluno (-1 para sair): ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota>=0 ) {
				soma +=nota;
				contador++;
			}else if (nota !=-1) {
				System.out.println("Nota invalida.");
			}

		} 
		double resultado = soma/contador;
		System.out.printf("A media do aluno foi %.2f " , resultado);
		
		entrada.close();
	}
}
