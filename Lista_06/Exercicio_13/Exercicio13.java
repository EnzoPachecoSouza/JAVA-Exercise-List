//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Digite um numero: ");
			int num = leia.nextInt();
			
			if(num < 40){
				soma = soma + num;
			}
		}
		
		System.out.println("\nA soma dos numeros digitados que sao inferiores a 40 e: " + soma);
	}
}

