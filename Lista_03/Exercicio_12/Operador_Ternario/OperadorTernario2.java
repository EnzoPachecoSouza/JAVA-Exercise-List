//Enzo Pacheco de Oliveira Souza - 2º ADS

public class OperadorTernario2 {
	
	public static void main (String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a < b ? /*Se*/ "a < b" : /*Se Não*/ "a >= b" );
	}
}

