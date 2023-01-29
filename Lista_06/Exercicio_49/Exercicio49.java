//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio49 {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Quantidade de termos da sequencia: ");
		
		//variáveis
		int qtd = read.nextInt();
		boolean primo = false;
		int cont = 0;
		int [] primos = new int [qtd];
		
		
		for(int i = 2; cont < qtd; i++)
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
				primos[cont] = i;
				cont++;
			}
			
			primo = true;	
		}
		
		
		for(int k = primos.length - 1; k >= 0 ; k--)
		{
			System.out.print(" " + primos[k]);
		}
		
	}
}
