package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {


		double a = 2;
		double b = a;
		
		a++;
		b--;
		System.out.println(a + " " + b);
		Data d1 = new Data();
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.DataFormatada());
		System.out.println(d2.DataFormatada());

		voltarDataPadrao(d1);
		
		System.out.println(d1.DataFormatada());
		System.out.println(d2.DataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano= 1971;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
