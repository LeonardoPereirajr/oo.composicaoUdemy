package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
			
		
		System.out.println(fila.peek());//le o primeiro e retorna falso se estiver vazia
		System.out.println(fila.element());
//		fila.clear();
		System.out.println(fila.peek());
		System.out.println(fila.poll());
		System.out.println(fila.contains("Gui"));

	}

}
