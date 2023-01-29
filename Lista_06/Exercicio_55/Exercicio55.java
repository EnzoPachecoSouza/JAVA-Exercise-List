//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio55 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		//variáveis
		int div = 0;
		
		System.out.print("Número inteiro: ");
		int num = read.nextInt();
		
		//espaçamento
		System.out.println(" ");
		
		for(int i = 1; i <= (num / 2); i++)
		{
			if(num % i == 0)
			{
				div += i;
			}
		}
		
		if(num == div)
		{
			System.out.println("O número digitado é perfeito.");
		}
		else
		{
			System.out.println("O número digitado não é perfeito.");
		}
		
	}
}
