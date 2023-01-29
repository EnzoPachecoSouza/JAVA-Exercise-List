//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio60 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		boolean estaNaSequenciaDeRicci = false;
		int aux = 0;
		
		System.out.print("primeiro termo da sequencia de Ricci: ");
		int numBef = read.nextInt();
		
		System.out.print("segundo termo da sequencia de Ricci: ");
		int numNext = read.nextInt();
		
		System.out.print("numero a se procurar nesta sequencia: ");
		int numSearch = read.nextInt();
		
		if(numSearch == numBef || numSearch == numNext)
		{
			estaNaSequenciaDeRicci = true;
		}
		else
		{
			for(int i = 0; i < numSearch; i++)
			{
				System.out.printf(" " + (numNext + numBef));
				aux = numNext;
				numNext += numBef;
				numBef = aux;
				
				if(numNext == numSearch)
				{
					estaNaSequenciaDeRicci = true;
				}
			}
			
			//espaçamento
			System.out.println("");
			
			if(estaNaSequenciaDeRicci == true)
			{
				System.out.println("O número " + numSearch + " está na sequência.");
			}
			else
			{
				System.out.println("O número " + numSearch + " não está na sequência.");
			}
			
		}
	}
}
