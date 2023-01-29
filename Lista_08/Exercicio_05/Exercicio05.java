//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array ---> ");
		int tamanho = leia.nextInt();
		
		int vetorA [] = new int[tamanho];
		int vetorB [] = new int[tamanho];
		int vetorC [] = new int[tamanho];
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no VetorA ---> ");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no VetorB ---> ");
			vetorB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		for(int i = 0; i < tamanho; i++){
			System.out.println("A soma de " + vetorA[i] + " + " + vetorB[i] + " e ---> " + vetorC[i]);
		}
	}
}

