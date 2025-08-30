package semana04;

import javax.swing.JOptionPane;

public class Excecao03 {
	public static void main(String[] args) {
		while (true) {
			try {
				int n = // excecao unchecked
						Integer.parseInt(JOptionPane.showInputDialog("Mes?"));
				int a = n / 0;
						if (n < 1 || n > 12) {
							JOptionPane.showMessageDialog(null, "Mês invalido");
							// lançar exceção de mês invalido
						} else {
							JOptionPane.showMessageDialog(null, "Mês valido");
							break;
						}
			} 
			catch (NumberFormatException erro) {
				System.out.println("O numero do mes ANTA!" + erro);
			} 
			catch (ArithmeticException erro){
				JOptionPane.showMessageDialog(null, "Divisão por Zero OH MATEMATICO");
			}
			finally {// a execução sempre passa por aqui
				// liberar recursos
				System.out.println("Finally OK");
			}
		}
	}

}
