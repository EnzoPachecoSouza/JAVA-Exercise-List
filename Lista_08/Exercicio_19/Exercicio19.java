//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorA [] = new int[10];
		int vetorZ [] = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite um numero ---> ");
			vetorA[i] = leia.nextInt();
			
			vetorZ[i] = vetorA[i];
		}
		Arrays.sort(vetorZ);
		
		System.out.println();
		
		for(int i = 0; i < 10; i++){
			System.out.print(vetorZ[i] + ", ");
		}
	}
}

