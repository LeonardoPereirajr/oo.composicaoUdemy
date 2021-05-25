package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d1 = new Data();

		Data d2 = new Data(31, 12, 2020);

		System.out.printf(d1.DataFormatada());
		System.out.printf(d2.DataFormatada());

	}
}
