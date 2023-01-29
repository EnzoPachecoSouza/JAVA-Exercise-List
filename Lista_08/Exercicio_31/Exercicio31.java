//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio31 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		Scanner readS = new Scanner(System.in);

		int n = 0;
        
        do 
        {
            System.out.print("Digite o tamanho do vetor: ");
            n = read.nextInt();
            
            if (n < 1 || n > 10) 
            {
                System.out.println("Digite um valor no intervalo [1, 10]!");
            }
        } while (n < 1 || n > 10);
        
        
        String[] am = new String[n];
        
        for (int i = 0; i < am.length; i++) 
        {
            System.out.printf("[%d] = ", i);
            am[i] = readS.nextLine();
        }
        
        System.out.print("Vetor: ");
        for(String item : am)
        {
			System.out.print(item + " ");
		}
        Arrays.sort(am);
        
        
        System.out.print("Vetor ordenado: ");
        for(String item : am)
        {
			System.out.print(item + " ");
		}
	}
}
