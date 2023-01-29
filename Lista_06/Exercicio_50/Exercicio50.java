//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio50 {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Termo inicial: ");
		int init = read.nextInt();
		
		//espaçamento
		System.out.println(" ");
		
		System.out.print("Quantidade de termos da sequencia: ");
		int qtd = read.nextInt();
		
		boolean primo = false;
		int cont = 0;
		
		for(int i = init; cont < qtd; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					primo = false;
				}
			}
			
			if(primo == true)
			{
				System.out.print(" " + i);
				cont++;
			}
			
			primo = true;	
		}
	}
}
