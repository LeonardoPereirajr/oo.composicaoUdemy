package classe;

public class AreaCirf {
	double raio;
	static double pi=3.14;

	AreaCirf(double raioInicial) {
		raio = raioInicial;

	}

	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
