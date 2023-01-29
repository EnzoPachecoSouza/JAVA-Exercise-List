//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array ---> ");
		int tamanho = leia.nextInt();
		
		int vetorX [] = new int[tamanho];	
		
		int contador = 0;
		
		for(int i = 0; i < tamanho; i++){
			System.out.print("Digite um numero ---> ");
			vetorX[i] = leia.nextInt();
		}
		
		for(int i = 0; i < tamanho; i++){
			
			contador = 0;
			
			for(int j = 1; j <= vetorX[i]; j++){
				if(vetorX[i] % j == 0){
					contador++;
				}
			}
			
			if(contador == 2){
				System.out.print(vetorX[i] + ", ");
			}
		}
	}
}

