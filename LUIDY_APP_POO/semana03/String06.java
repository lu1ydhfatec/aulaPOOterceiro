package semana03;

public class String06 {

	public static void main(String[] args) {
		String s = "Aula de Programação Orientada a Objetos";
		String n = "1,2,3,4,5,6,7,8,9,0";
		
		String[] palavras = s.split(" ");
		String[] numeros = n.split(",");
		
		for(String x: palavras) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		for(String z: numeros) {
			System.out.println(z);
		}

	}

}
