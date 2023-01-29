//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio65 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qtd = read.nextInt();
		int numPrimo = 1;
		int fat = 1;
		boolean primo = false;
		double soma = 0.5;
		
		for(int i = 0; i < qtd; i++){
			if(i == 0)
			{
				System.out.print("-1/2 + ");
			}
			else
			{
				fat *= i;
				System.out.print(fat);
				
				for(int j = numPrimo + 1; true; j++)
				{
					for(int k = 2; k < j; k++)
					{
						if(j % k == 0)
						{
							primo = false;
						}
					}
					if(primo == true)
					{
						numPrimo = j;
						System.out.print("/" + numPrimo);
						
						if(i < qtd - 1)
						{
							if(i % 2 == 1)
							{
								System.out.print(" - ");
								soma += (double) fat / (double) numPrimo;
							}
							else
							{
								System.out.print(" + ");
								soma -= (double) fat / (double) numPrimo;
							}
						}
						break;
					}
					else{
						primo = true;
					}
				}
			}
		}
		System.out.print(" = " + soma);
	}
}
