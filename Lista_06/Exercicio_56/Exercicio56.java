//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio56 {
	
	public static void main (String[] args) {
		
		int div = 0;
		
		for(int i = 1; i <= 900; i++)
		{
			for(int p = 1; p <= (i/2); p++)
			{
				if(i % p == 0)
				{
					div += p;
				}
			}
			
			System.out.print((i == div)? " " + i : "");
			
			div = 0;
		}
	}
}
