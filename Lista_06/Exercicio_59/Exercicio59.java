//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio59 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		//variáveis
		int numNext, numBef, aux, qtd;
		
		System.out.print("primeiro termo: ");
		numBef = read.nextInt();
		
		//espaçamento
		System.out.println(" ");
		
		System.out.print("segundo termo: ");
		numNext = read.nextInt();
		
		//espaçamento
		System.out.println(" ");
		
		System.out.print("quantidade de termos: ");
		qtd = read.nextInt();
		
		System.out.println(numBef +"\n"+ numNext);
		
		for(int i = 1; i <= qtd; i++)
		{
			
			if(i == 0)
			{
				System.out.print(numBef);
			}
			else if(i == 1)
			{
				System.out.print(" " + numNext);
			}
			else
			{			
				System.out.println(numBef + numNext);
			
				aux = numNext;
				numNext += numBef;
				numBef = aux;}
			}
		}
		
	}
