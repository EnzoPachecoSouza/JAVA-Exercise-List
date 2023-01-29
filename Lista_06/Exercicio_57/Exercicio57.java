//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio57 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		
		//variáveis
		int div = 0, cont = 0;
		
		System.out.print("Quantidade de termos: ");
		int qtd = read.nextInt();
		
		for(int i = 1; cont < qtd; i++)
		{
			for(int p = 1; p <= (i/2); p++)
			{
				if(i % p == 0)
				{
					div += p;
				}
			}
			
			if(i == div)
			{
				System.out.print(i + " ");
				cont++;
			}
			
			div = 0;
		}
	}
}
