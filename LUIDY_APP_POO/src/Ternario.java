package semana02;

public class Ternario {
	
	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println(a>b?a:b);
		
		if(a>b) {
			System.out.println(a);
		}
		else if (b>a) {
			System.out.println(b);
		}
	}
}
