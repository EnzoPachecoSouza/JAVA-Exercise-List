//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		int quantidadeTotal = 0;
		char choose;
		
		do{
			System.out.print("Informe o valor da mercadoria: ");
			double valor = leia.nextDouble();
			
			soma = soma + valor;
			
			quantidadeTotal++;
			
			System.out.print("\nMAIS MERCADORIAS (S/N?) ");
			String escolha = leia.next();
			escolha = escolha.toUpperCase();
			
			choose = escolha.charAt(0);
			
			System.out.println("");
		}while(choose == 'S');
		
		System.out.println("");
		
		System.out.println("A soma das mercadorias e: " + soma);
		
		double media = soma / quantidadeTotal;
		
		System.out.printf("A media dos valores das mercadorias e %.2f %s", media, " reais");
		
	}
}

