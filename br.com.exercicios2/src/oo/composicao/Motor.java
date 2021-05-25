package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorIngecao = 1 ; //quantos litros de combustive
	
	int giros() {
		if(!ligado) {// se carro nao ligado retorna 0
			return 0;
		}else {
			return (int) Math.round(fatorIngecao * 3000);
		}
		
	}

}
