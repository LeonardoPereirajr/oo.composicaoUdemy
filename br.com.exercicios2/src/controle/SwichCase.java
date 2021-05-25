package controle;

public class SwichCase {
	

	public static void main(String[] args) {
		String faixa="branca";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sabe karate");
		case "branca":
			System.out.println("aprendendo");
		}
	}
}
