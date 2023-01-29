//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual o numero de mercadorias em estoque ---> ");
		int totalMercadoria = leia.nextInt();
		
		double soma = 0;
		
		for(int i = 1; i <= totalMercadoria; i++){
			System.out.print("Qual o preco da mercadoria numero " + i + " : ");
			double preco = leia.nextDouble();
			
			soma = soma + preco;
		}
		
		System.out.printf("\nO valor em estoque e de %.2f %s", soma, " reais");
		
		double media = soma / totalMercadoria;
		
		System.out.printf("\nA media do valor total em estoque e de %.2f %s", media, " reais");
		
		
	}
}

