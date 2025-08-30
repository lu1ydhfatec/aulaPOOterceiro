package semana03;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("quantos meses de trabalho");
		double x= Double.parseDouble(num);
		int sar = 1;
		for(double i=0;i<=x;i++) {
			sar=sar+(sar*2);
		}
		System.out.println("Voce recebera no total: R$"+ sar);
		double sar02 = x*10000;
		System.out.println("Ou no caso de 10k por mes: R$" + sar02);
	}

}
