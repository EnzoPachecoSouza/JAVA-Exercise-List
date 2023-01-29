//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Random;
import java.util.Scanner;

public class Exercicio26 
{
	public static void main (String[] args) 
	{
		
		String letras = "";
		
		int[] qtd = new int [26];
		//zerando todos os valores do array
		for(int a = 0; a < 26; a++)
		{
			qtd[a] = 0;
		}
		
		
		for(int i = 1; i <= 100; i++)
		{
			int r = new Random().nextInt((122 - 97) + 1) + 97;
			letras += (char) r;
		}
		
		letras = letras.toUpperCase();
		
		//reconhecendo as letras que não aparecem
		for(int j = 97; j < 123; j++)
		{
			for(int k = 0; k < letras.length(); k++)
			{
				if(letras.charAt(k) == (char)(j - 32))
				{
					qtd[j - 97]++;
				}
			}
		}
		
		
		//letras que não aparecem
		System.out.print("Letras que não aparecem: ");
		
		for(int i = 0; i < 26; i++)
		{
			if(qtd[i] == 0)
			{
				System.out.printf("%c ", (char) (i + 65));
			}
			
		}
	
		System.out.print("\n\n" + letras);
	}
}
