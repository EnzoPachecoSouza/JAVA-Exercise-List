//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio23 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AD = new int[size];
        
        for (int i = 0; i < AD.length; i++) 
        {
            int val;
            
            do 
            {
                System.out.printf("[%d] = ", i);
                val = read.nextInt();
                
                if (val % 2 != 0) 
                {
                    System.out.println("O valor deve ser par.");
                }
            } while (val % 2 != 0);
            
            AD[i] = val;
        }
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("Vetor: ");
		
		//exibindo o vetor
		for (int num : AD) 
		{
			System.out.printf("[%d] ", num);
		}	
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("\nVetor ordenado: ");
        
        //ordenando de maneira crescente
        int aux;
        for (int i = 0; i < AD.length; i++) 
        {
            for (int j = i + 1; j < AD.length; j++) 
            {
                if (AD[i] > AD[j]) 
                {
                    aux = AD[j];
                    AD[j] = AD[i];
                    AD[i] = aux;
                }
            }
        }
        
        //exibindo o vetor
		for (int num : AD) 
		{
			System.out.printf("[%d] ", num);
		}	
	}
}
