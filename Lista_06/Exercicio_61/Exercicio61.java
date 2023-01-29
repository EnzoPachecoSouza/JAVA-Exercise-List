//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio61 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qtd = read.nextInt();
		
		double soma = 0;
		
		for(int i = 0;i < qtd * 2; i += 2)
		{
			System.out.printf("%d/%d ", i + 2, i + 1);
			
			if(i < 2 * (qtd - 1))
			{
				System.out.printf("+ ", i + 2, i + 1);
			}
			soma += (double) (i + 2) / (double) (i + 1);
		}
		System.out.print(" = " + soma);
	}
}
