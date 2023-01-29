//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorP [] = new int[10];
		int vetorQ [] = new int[15];
		int vetorR [] = new int[25];
		
		int aux = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PA---> ");
			vetorP[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < 15; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PB---> ");
			vetorQ[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < 25; i++){
			if(i < 10){
				vetorR[i] = vetorP[aux];
				System.out.println(vetorR[i]);
				
				aux++;
			}
			else{
				vetorR[i] = vetorQ[aux - 10];
				System.out.println(vetorR[i]);
				aux++;
			}
		}
	}
}

