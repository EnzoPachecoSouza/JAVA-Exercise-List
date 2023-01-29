//Enzo Pacheco de Oliveira Souza - 2º ADS

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 20);
		
		System.out.println("");
		
		System.out.println("O valor de a e: " +a);
		System.out.println("O valor de b e: " +b);
		
		if(a % b == 0)
		{
			System.out.println("\nE divisivel quando a for divisivel por b.");
			
			int divisao = a / b;
			
			System.out.println("O valor da divisao e: " + divisao);
		}
		
		else
		{
			System.out.println("\nNao e divisivel!");
		}
	}
}

