package semana03;

public class String05 {
	public static void main(String[] args) {
		String ra = "10502423006";
		String unidade = ra.substring(0, 3);
		String curso = ra.substring(3, 6);
		String ano = "20"+ra.substring(8, 9);
		String semestre = ra.substring(8, 9);
		if(semestre.equals("1")) semestre = "primeiro";
		if(semestre.equals("2")) semestre = "Segundo";
		System.out.println(ra);
		System.out.println(unidade);
		System.out.println(curso);
		System.out.println(ano);
		System.out.println(semestre);
	}

}
