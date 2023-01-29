//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio30 
{
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		double[] notas = new double[5];
		
        for (int i = 0; i < notas.length; i++) 
        {
            double nota;
            
            do 
            {
                System.out.printf("Nota %d: ", i+1);
                nota = read.nextDouble();
                
                if (nota < 0 || nota > 10) 
                {
                    System.out.println("Digite notas entre 0 e 10!");
                }
                
            }while (nota < 0 || nota > 10);
            
            notas[i] = nota;
        }
        
        //exibindo o vetor (desordenado) de notas
        System.out.print("\n\nVetor de notas: ");
        for(double rum : notas)
        {
			System.out.printf("[%.2f] ", rum);
		}
		
		//colocando o vetor em ordem crescente
        double aux;
        
        for (int i = 0; i < notas.length; i++) 
        {
            for (int j = i + 1; j < notas.length; j++) 
            {
                if (notas[i] > notas[j]) 
                {
                    aux = notas[j];
                    notas[j] = notas[i];
                    notas[i] = aux;
                }
            }
        }
        
        //exibindo vetor ordenado
        System.out.print("\n\nVetor de notas ordenado: ");
        for(double rum : notas)
        {
			System.out.printf("[%.2f] ", rum);
		}
		
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) 
        {
            somaNotas += notas[i];
        }
        
        double media = somaNotas / notas.length;
        System.out.printf("\n\nMédia das notas: %.2f\n", media);
        
        
	}
}
