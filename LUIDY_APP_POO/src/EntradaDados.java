package semana02;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Entre com o mês:");
		String mes = null;
		if(s!=null) {
			if(!s.equals("")) {
				switch(Integer.parseInt(s)){
					case 1:mes = "janeiro";
					break;
					case 2:mes = "Fevereiro";
					break;
					default: mes = "Invalido";
				}
			}
		}
		System.out.println(mes);
		
	}

}
