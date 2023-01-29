//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;
import java.util.Random;

public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = leia.nextInt();
		
		int vetorA [] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++){
			vetorA[i] = new Random().nextInt(1, 100);
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			System.out.println((i + 1) + " posicao ---> " + vetorA[i]);
		}
	}
}

