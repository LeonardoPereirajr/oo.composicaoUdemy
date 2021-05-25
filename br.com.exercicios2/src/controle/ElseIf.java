package controle;

import javax.swing.JOptionPane;

public class ElseIf {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um numero: ");
		int numero  =Integer.parseInt(valor);
		
		if (numero % 2 ==0) {
			JOptionPane.showMessageDialog(null, "Par");
		}else {
			JOptionPane.showMessageDialog(null, "Impar");
		}
	}
}
