//Enzo Pacheco de Oliveira Souza - 2º ADS

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		int precoProduto1 = (int) (Math.random() * 1000);
		int precoProduto2 = (int) (Math.random() * 1000);
		
		System.out.println("O preco do produto 1 e: " + precoProduto1);
		System.out.println("O preco do produto 2 e: " + precoProduto2);
		
		if(precoProduto1 < precoProduto2)
		{
			System.out.println("O produto 1 e mais barato");
		}
		
		else if(precoProduto1 > precoProduto2)
		{
			System.out.println("O produto 2 e mais barato");
		}
		
		else 
		{
			System.out.println("O preco dos dois sao iguais");
		}
	}
}

