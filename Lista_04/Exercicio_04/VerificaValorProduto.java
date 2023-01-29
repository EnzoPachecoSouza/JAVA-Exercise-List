//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do preco do produto 1: ");
		int precoProduto1 = leia.nextInt();
		
		System.out.print("");
		
		System.out.print("Digite o valor do preco do produto 2: ");
		int precoProduto2 = leia.nextInt();
		
		if(precoProduto1 > 1000 || precoProduto1 < 1)
		{
			System.out.println("VALOR INVALIDO!!!");
		}
		
		else if(precoProduto2 > 1000 || precoProduto2 < 1)
		{
			System.out.println("VALOR INVALIDO!!!");
		
		}
		
		else
		{
			if(precoProduto1 < precoProduto2)
			{
				System.out.println("O produto 1 e mais barato!");
			}
		
			else if(precoProduto2 < precoProduto1)
			{
				System.out.println("O produto 2 e mais barato!");
			}
		
			else
			{
				System.out.println("Os precos dos dois produtos sao iguas!");
			}
		}
		

	}
}

