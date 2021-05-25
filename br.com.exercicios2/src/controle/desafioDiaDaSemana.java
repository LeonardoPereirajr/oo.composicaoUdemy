package controle;

import javax.swing.JOptionPane;

public class desafioDiaDaSemana {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um dia: ");
		int numero  =Integer.parseInt(valor);
		
		if (numero == 1) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Domingo");
		}else if(numero ==2) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Segunda");
		}else if(numero ==3) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Terça");
		}else if(numero ==4) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Quarta");
		}else if(numero ==5) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Quinta");
		}else if(numero ==6) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Sexta");
		}else if(numero ==7) {
			JOptionPane.showMessageDialog(null, "Dia Da Semana Sabado");
		}
	}
}
