//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array ---> ");
		int tamanho = leia.nextInt();
		
		int vetorE [] = new int[tamanho];
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < tamanho; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " ---> ");
			vetorE[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			if(vetorE[i] > maior){
				maior = vetorE[i];
			}
		}
		
		for(int i = 0; i < tamanho; i++){
			if(vetorE[i] < menor){
				menor = vetorE[i];
			}
		}
		
		System.out.println("O maior numero digitado foi ---> " + maior + "\nE o menor numero digitado foi ---> " + menor);
	}
}

