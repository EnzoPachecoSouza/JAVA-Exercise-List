//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorAB [] = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um numero ---> ");
			vetorAB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++){
			if(vetorAB[i] % 2 != 0){
				vetorAB[i] = vetorAB[i] * 2;
				
				System.out.print(vetorAB[i] + ", ");
			}
			else{
				System.out.print(vetorAB[i] + ", ");
			}
		}
	}
}

