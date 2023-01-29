//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorQA [] = new int[10];
		int vetorQB [] = new int[15];
		int vetorQC [] = new int[25];
		
		int auxA = 0;
		int auxB = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um numero ---> ");
			vetorQA[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 15; i++){
			System.out.print("Digite um numero ---> ");
			vetorQB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++){
			System.out.println(vetorQA[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 15; i++){
			System.out.println(vetorQB[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 25; i++){
			if(i < 5){
				vetorQC[i] = vetorQB[auxB];
				System.out.println(vetorQC[i]);
				
				auxB++;
			}
			else if(i >= 5 && i < 10){
				vetorQC[i] = vetorQA[auxA];
				System.out.println(vetorQC[i]);
				auxA++;
			}
			else if(i >= 10 && i < 15){
				vetorQC[i] = vetorQB[auxB];
				System.out.println(vetorQC[i]);
				auxB++;
			}
			else if(i >= 15 && i < 20){
				vetorQC[i] = vetorQA[auxA];
				System.out.println(vetorQC[i]);
				auxA++;
			}
			else if(i >= 20 && i < 25){
				vetorQC[i] = vetorQB[auxB];
				System.out.println(vetorQC[i]);
				auxB++;
			}
		}	
	}
}

