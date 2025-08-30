package semana03;

public class String01 {

	public static void main(String[] args) {
		String s = "Luidy Thomas";
		System.out.println(s);
		
		//print string em maiuscula
		String maiusculas = s.toUpperCase(); //guarda na string
		System.out.println(maiusculas);
		//ou
		System.out.println(s.toUpperCase()); //não guarda

		//print string em minusculo
		String minusculas = s.toLowerCase(); //guarda o resultado na string minusculas
		System.out.println(minusculas);
		//ou
		System.out.println(s.toLowerCase()); //faz a operação e imprime sem guardar
		
		//int para contagem de caracteres
		int qtddeletras = s.length();
		System.out.println(qtddeletras);
	}

}
