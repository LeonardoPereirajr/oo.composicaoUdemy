package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());// mostra FALSE pois nao ligou

		c1.ligar();
		System.out.println(c1.estaLigado());// mostra True pois ligou
		
		System.out.println("Giros atual: " + c1.motor.giros() + " RPM");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Giros atual: " + c1.motor.giros() + " RPM");
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		
		System.out.println("Giros atual: " + c1.motor.giros() + " RPM");
		
	}

}
