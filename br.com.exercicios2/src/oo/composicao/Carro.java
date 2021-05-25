package oo.composicao;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorIngecao < 2.6) {
			motor.fatorIngecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorIngecao > 0.5) {
			motor.fatorIngecao -= 0.4;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
