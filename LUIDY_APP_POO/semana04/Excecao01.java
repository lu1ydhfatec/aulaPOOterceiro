package semana04;

import javax.swing.JOptionPane;

public class Excecao01 {
	public static void main(String[] args) throws InterruptedException {

		int n = // exceção unchecked
				Integer.parseInt(JOptionPane.showInputDialog("Idade"));

		try {

			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}
