package semana04;

import javax.swing.JOptionPane;

public class Excecao02 {
	public static void main(String[] args) {
		try {
			int n = // excecao unchecked
					Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			System.out.println("parabens zé, voce sabe sua idade");
		} catch (NumberFormatException erro) {
			System.out.println("Voce errou!" + erro);
		}
		finally {//a execução sempre passa por aqui
			//liberar recursos
			System.out.println("Finally OK");
		}
	}

}
