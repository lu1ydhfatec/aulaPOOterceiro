package semana02;

public class Foo01 {

	public static void main(String[] args) 
			throws InterruptedException {
		
		//passo	1		2	4
		for(int a=1; a<=10; a++) {
			System.out.println(a);//passo 3
			Thread.sleep(200);//1 segundo
		}
		for(char a='a'; a<='z'; a++) {
			System.out.println(a + "=" + (int)a);//passo 3
			Thread.sleep(1000);//1 segundo
		}
	}
}
