package semana02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiMes extends JFrame {

	private JButton btMostrar, btSexo;
	private JTextField tfMes, tfResultados;

	// Criar a Tela
	public GuiMes() {
			setTitle("Teste do Mês");
			setBounds(100,100,500,500);
			setResizable(true);
			btSexo = new JButton("Sexo");
			btMostrar = new JButton("Mostrar");
			tfMes = new JTextField();
			tfResultados = new JTextField();
			setLayout(null);
			btMostrar.setBounds(80,100,100,25);
			btSexo.setBounds(80,100,100,25);
			tfMes.setBounds(80,50,100,25);
			tfResultados.setBounds(80,150,100,25);
			add(btMostrar);
			add(tfMes);
			add(tfResultados);
			add(btSexo);
			
			btMostrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = tfMes.getText();
					int mes = Integer.parseInt(s);
					String[] meses = {
						    "Janeiro", "Fevereiro", "Março", "Abril",
						    "Maio", "Junho", "Julho", "Agosto",
						    "Setembro", "Outubro", "Novembro", "Dezembro"
						};
					if(mes>=1&&mes<=12) {
						tfResultados.setText(meses[mes-1]);
					}
					else {JOptionPane.showMessageDialog(btMostrar, "Numero Invalido");
						
					}
				}
			});
			btSexo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});

	public static void main(String[] args) {
		GuiMes janela = new GuiMes();
		janela.setVisible(true);
	}
}