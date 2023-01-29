//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class 	Exercicio09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorG [] = new int[5];
		int vetorH [] = new int[5];

		int contador = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " ---> ");
			vetorG[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
				vetorH[i] = vetorG[i];
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++){
			if(vetorH[i] % 2 == 0){
				System.out.println("O numeros pares que aparecem e ---> " + vetorH[i]);
			}
			else{
				contador++;
			}
		}
		
		if(contador == 5){
			System.out.println("Voce nao digitou nunhum numero par!");
			
			System.exit(0);
		}
	}
}

