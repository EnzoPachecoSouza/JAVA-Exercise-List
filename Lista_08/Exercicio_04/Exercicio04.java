//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 0;
		
		do{
			System.out.print("Informe o tamanho do array, ele deve ser menor ou igual a 20 ---> ");
			tamanho = leia.nextInt();
		
			int vetorC [] = new int[tamanho];
		
			System.out.println();
			if(tamanho <= 20){
				for(int i = 0; i < tamanho; i++){
					System.out.print("Digite um numero ---> ");
					vetorC[i] = leia.nextInt();
				}
				System.out.println();
				System.out.println("O numero de posicoes e ---> " + tamanho);
				System.out.println();
				for(int i = 0; i < tamanho; i++){
					System.out.println("O numero da posicao " + (i + 1) + " e ---> " + vetorC[i]);
				}
			}
		}while(tamanho > 20);
	}
}

