package semana03;

import javax.swing.JOptionPane;

public class Math03 {

	public static void main(String[] args) throws InterruptedException {
		String num = JOptionPane.showInputDialog("quantos numero vc quer gerar?");
		double a = Double.parseDouble(num);
		for(double i=a;i>0;i--) {
		System.out.println((int)(Math.random()*100));//0..........1
		Thread.sleep(50);
		}

	}

}
