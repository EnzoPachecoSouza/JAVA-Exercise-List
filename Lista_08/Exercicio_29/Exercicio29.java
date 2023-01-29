//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio29 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int a = 10;
		
		int [] AJ = new int[a];
		
		//preenchendo AJ com números aleatórios
        for (int i = 0; i < AJ.length; i++) 
        {
            AJ[i] = (int) (Math.random() * 9 + 1);
        }
        
        int rest = a / 2;
        int life = a / 2;
        
        boolean shoot = false;
        
        while (!shoot && rest >= 0) 
        {
            System.out.printf("\n\nTente acertar um número do vetor [%d/%d]: ", rest, life);
            int chance = read.nextInt();
            
            for (int i = 0; i < AJ.length; i++) 
            {
                if (chance == AJ[i]) 
                {
                    System.out.println("Você acertou!");
                    
                    //exibindo vetor
                    System.out.print("\nVetor: ");
                    for(int num : AJ)
                    {
						System.out.printf("[%d] ", num);
					}
					
                    shoot = true;
                    break;
                }
            }
            rest--;
        }  
	}
}
