package semana03;

public class Math07 {

	public static void main(String[] args) {
		String[] alunos = {"Rafael","Victor","Adriana","Luidy"};
		int qtde = alunos.length; //4
		
		int n = (int)(Math.random()*qtde);
		System.out.println(alunos[n]);

	}

}
