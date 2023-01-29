//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio32 
{	
	public static void main (String[] args) 
	{	
		Scanner readS = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
        String frase = readS.nextLine();
        
        String[] an = frase.split(" ");
        
        System.out.print("\n\nVetor: ");
        for(String word : an)
        {
			System.out.print( word + " " );
		}
        
        Arrays.sort(an);
        System.out.print("\n\nVetor ordenado: ");
        for(String word : an)
        {
			System.out.print( word + " " );
		}
	}
}
