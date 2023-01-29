//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorB [] = new int[15];
		
		for(int i = 0; i < 15; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " ---> ");
			vetorB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 15 - 1; i >= 0; i--){
			System.out.println("O numero da posicao " + (i + 1) + " e ---> " + vetorB[i]);
		}
	}
}

