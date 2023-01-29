//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio25
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AF = new int[size];
        
        for (int i = 0; i < AF.length; i++) 
        {
            System.out.printf("[%d] = ", i);
            AF[i] = read.nextInt();
        }
        
        //contando os números pares
        int cont = 0;
        for (int i = 0; i < AF.length; i++) 
        {
            if (AF[i] % 2 == 0) 
            {
                cont++;
            }
        }
        
        int qtdpares = cont;
        
        //contando os números ímpares
        int cont2 = 0;
        for (int i = 0; i < AF.length; i++) 
        {
            if (AF[i] % 2 != 0) 
            {
                cont2++;
            }
        }
        int qtdimpares = cont2;
        
        //distribuindo em suas respectivas "classes"
        int [] par = new int [qtdpares]; int [] impar = new int [qtdimpares];
        int aux = 0, aux2 = 0;
        
        for(int i = 0; i < AF.length; i++)
        {
			if (AF[i] % 2 == 0) 
            {
                par[aux++] = AF[i];
            }
            else
            {
				impar[aux2++] = AF[i];
			}
		}
		
		//impar em ordem crescente
		int xa, xe;
		
        for (int i = 0; i < impar.length; i++) {
            for (int j = i + 1; j < impar.length; j++) {
                if (impar[i] > impar[j]) {
                    xa = impar[j];
                    impar[j] = impar[i];
                    impar[i] = xa;
                }
            }
        }
        
        //par em ordem decrescente
        for (int i = 0; i < par.length; i++) {
            for (int j = i + 1; j < par.length; j++) {
                if (par[i] < par[j]) {
                    xe = par[j];
                    par[j] = par[i];
                    par[i] = xe;
                }
            }
        }
        
        //concatenando os dois
        int xi = 0;
        for (int i = 0; i < impar.length; i++) 
        {
            AF[xi++] = impar[i];
        }
        for (int i = 0; i < par.length; i++) 
        {
            AF[xi++] = par[i];
        }
        
        //exibindo o vetor
		for (int num : AF) 
		{
			System.out.printf("[%d] ", num);
		}	
        
	}
}
