//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorPA [] = new int[5];
		int vetorPB [] = new int[5];
		int vetorPC [] = new int[10];
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PA---> ");
			vetorPA[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PB---> ");
			vetorPB[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 10; i++){
			if(i < 5){
				System.out.println(vetorPA[i]);
			}
			else{
				System.out.println(vetorPB[i - 5]);
			}
		}
	}
}

