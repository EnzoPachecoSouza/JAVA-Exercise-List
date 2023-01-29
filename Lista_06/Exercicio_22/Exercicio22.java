//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 1; i <= 15; i++){
			System.out.print("Digite o preco do produto numero " + i + " : ");
			int preco = leia.nextInt();
			
			soma += preco;
			
			if(preco > maior){
				maior = preco;
			}
			
			else if(preco < menor){
				menor = preco;
			}
		}
		
		double media = soma / 15;
		
		System.out.println("\nO maior numero digitado foi: " + maior + ", e o menor numero digitado foi: " + menor);
		System.out.printf("A media dos precos digitados e: %.2f %s", media, " reais!");
	}
}

