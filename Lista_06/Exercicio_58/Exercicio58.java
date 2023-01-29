//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio58 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		//variáveis
		int numNext, numBef, aux;
		
		System.out.print("primeiro termo: ");
		numBef = read.nextInt();
		
		//espaçamento
		System.out.println(" ");
		
		System.out.print("segundo termo: ");
		numNext = read.nextInt();
		
		System.out.println(numBef +"\n"+ 
						   numNext);
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(numBef + numNext);
			
			aux = numNext;
			numNext += numBef;
			numBef = aux;
		}
		
	}
}
