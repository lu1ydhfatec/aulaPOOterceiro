package semana01;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==2) {
			float n1 = Float.parseFloat(args[0]);
			float n2 = Float.parseFloat(args[1]);
			float soma = n1+n2;
			System.out.println("Soma: "+soma);
			JOptionPane.showMessageDialog(null,  "A soma é: "+soma+"\nA Subtração: "+(n1-n2)+"\nA Multiplicação: "+(n1*n2)+"\nDivisão: "+(n1/n2));
		}
		else {
			System.out.println("Forneça dois elementos!");
		}

	}

}
