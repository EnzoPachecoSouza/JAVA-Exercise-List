//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio63 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qtd = read.nextInt();
		
		int numNex = 1;
		int numBef = 0; 
		int aux = 0;
		int numPrimo = 1;
		boolean primo = false;
		double soma = 0.5;
		
		for(int i = 0; i < qtd; i++){
			if(i == 0)
			{
				System.out.print(numNex + "/" + 2 + " + ");
			}
			else
			{
				System.out.print(numNex + numBef);
				aux = numNex;
				numNex += numBef;
				numBef = aux;
				
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
						soma += (double) (numNex) / (double) numPrimo;
						System.out.printf("/" + numPrimo + ((i < qtd - 1) ? " + " : ""));
						break;
					}
					else
					{
						primo = true;
					}
				}
			}
		}
		System.out.print(" = " + soma);
	}
}
