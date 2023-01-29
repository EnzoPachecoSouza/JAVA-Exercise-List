//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 1; i <= 5; i++){
			System.out.print("Digite um numero: ");
			int num = leia.nextInt();
			
			if(num > maior){
				maior = num;
			}
			
			else if(num < menor){
				menor = num;
			}
		}
		
		System.out.println("\nO maior numero digitado foi ---> " + maior + "\nE o menor numero digitado foi ---> " + menor);
	}
}

