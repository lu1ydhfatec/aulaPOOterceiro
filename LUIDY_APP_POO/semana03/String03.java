package semana03;

public class String03 {

	public static void main(String[] args) throws InterruptedException {
		String aula = "Programação Orientada a Objeto";
		String sexo = "AAAAAAAAAAAA eu quero TRANSAAAAAAAAAAR POOOORRRRRAAAAAAAAAAAAAAAA";
		
		int tamanho = aula.length();
		int tamanho0 = sexo.length();
		
		int controle = 0;
		while (controle < tamanho) {
			System.out.print(aula.charAt(controle));
			controle++;
			Thread.sleep(50);
		}
		System.out.println("");
		for(int i=0;i<tamanho0;i++) {
			System.out.print(sexo.charAt(i));
			Thread.sleep(50);
		}

	}

}
