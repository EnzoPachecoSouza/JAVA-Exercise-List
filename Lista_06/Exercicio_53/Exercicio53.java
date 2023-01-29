//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio53 {
	
	public static void main (String[] args) {
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		for(int i = 1; i <= 50; i++){
			if(a >= 0 && a <= 250){
				System.out.print(a + " ");
			}
			
			a = b;
			b = c;
			c = a + b;
		}
	}
}

