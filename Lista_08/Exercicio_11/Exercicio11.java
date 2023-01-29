//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorQA [] = new int[5];
		int vetorQB [] = new int[5];
		int vetorQC [] = new int[10];
		
		int auxA = 0;
		int auxB = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero ---> ");
			vetorQA[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero ---> ");
			vetorQB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++){
			System.out.println(vetorQA[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++){
			System.out.println(vetorQB[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0){
				vetorQC[i] = vetorQA[auxA];
				System.out.println(vetorQC[i]);
				
				auxA++;
			}
			else if(i % 2 != 0){
				vetorQC[i] = vetorQB[auxB];
				System.out.println(vetorQC[i]);
				auxB++;
			}
		}	
	}
}

