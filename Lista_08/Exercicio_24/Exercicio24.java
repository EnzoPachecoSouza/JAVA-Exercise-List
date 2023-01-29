//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio24
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AE = new int[size];
        
        for (int i = 0; i < AE.length; i++) 
        {
            int val;
            
            do 
            {
                System.out.printf("[%d] = ", i);
                val = read.nextInt();
                
                if (val % 2 == 0) 
                {
                    System.out.println("O valor deve ser ímpar.");
                }
            } while (val % 2 == 0);
            
            AE[i] = val;
        }
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("Vetor: ");
		
		//exibindo o vetor
		for (int num : AE) 
		{
			System.out.printf("[%d] ", num);
		}	
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("\nVetor ordenado: ");
        
        //ordenando de maneira crescente
        int aux;
        for (int i = 0; i < AE.length; i++) 
        {
            for (int j = i + 1; j < AE.length; j++) 
            {
                if (AE[i] > AE[j]) 
                {
                    aux = AE[j];
                    AE[j] = AE[i];
                    AE[i] = aux;
                }
            }
        }
        
        //exibindo o vetor
		for (int num : AE) 
		{
			System.out.printf("[%d] ", num);
		}	
	}
}
