//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio27 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira uma palavra: ");
		String first_word = read.nextLine();
		
		System.out.print("Insira mais uma palavra: ");
		String secound_word = read.nextLine();
		
		if(first_word.length() != secound_word.length())
		{
			System.out.print("Erro! Entradas de tamanhos diferentes.");
		}
		else
		{
			for(int i = 0; i < first_word.length();i++)
			{
				System.out.printf("%c%c", first_word.charAt(i), secound_word.charAt(i));
			}
		}
	}
}
