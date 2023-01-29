//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double denominador = 0;
		double soma = 0;
		
		for(int i = 15; i <= 100; i++){
			soma = soma + i;
			
			denominador++;
		}
		
		double media = soma / denominador;
		
		System.out.printf("A soma dos numeros e: %.0f %s %.0f", soma , " e o denominador sera: " , denominador);
		
		System.out.printf("\nA media entre esses numeros e: %.2f", media);
	}
}

