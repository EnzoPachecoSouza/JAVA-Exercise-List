//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		int valorDoProduto = leia.nextInt();
		
		System.out.print("Informe o codigo de origem: ");
		int codigoDeOrigem = leia.nextInt();
		
		if(codigoDeOrigem == 1){
			System.out.println("O preco original do produto e: " + valorDoProduto + " reais");
			
			double freteNorte = (valorDoProduto * 0.10);
			double precoComFreteNorte = valorDoProduto + freteNorte;
			
			System.out.println("O valor do frete para o Norte sera de: " + freteNorte + " reais");  
			System.out.println("O preco a se pagar pelo produto agora sera de: " + precoComFreteNorte + " reais");
		}
		
		else if(codigoDeOrigem == 2 || codigoDeOrigem == 5 || codigoDeOrigem == 9){
			System.out.println("O preco original do produto e: " + valorDoProduto + " reais");
			
			double freteSul = (valorDoProduto * 0.03);
			double precoComFreteSul = valorDoProduto + freteSul;
			
			System.out.println("O valor do frete para o Sul sera de: " + freteSul + " reais");  
			System.out.println("O preco a se pagar pelo produto agora sera de: " + precoComFreteSul + " reais");
		}
		
		else if(codigoDeOrigem == 3 || codigoDeOrigem >= 10 && codigoDeOrigem <= 15){
			System.out.println("O preco original do produto e: " + valorDoProduto + " reais");
			
			double freteLeste = (valorDoProduto * 0.012);
			double precoComFreteLeste = valorDoProduto + freteLeste;
			
			System.out.println("O valor do frete para o Leste sera de: " + freteLeste + " reais");  
			System.out.println("O preco a se pagar pelo produto agora sera de: " + precoComFreteLeste + " reais");
		}
		
		else if(codigoDeOrigem == 7 || codigoDeOrigem == 20){
			System.out.println("O preco original do produto e: " + valorDoProduto + " reais");
			
			double freteOeste = (valorDoProduto * 0.073);
			double precoComFreteOeste = valorDoProduto + freteOeste;
			
			System.out.println("O valor do frete para o Oeste sera de: " + freteOeste + " reais");  
			System.out.println("O preco a se pagar pelo produto agora sera de: " + precoComFreteOeste + " reais");
		}
		
		else{
			System.out.println("O preco original do produto e: " + valorDoProduto + " reais");
			
			double freteImportado = (valorDoProduto * 0.222);
			double precoComFreteImportado = valorDoProduto + freteImportado;
			
			System.out.println("O valor do frete para o Importado sera de: " + freteImportado + " reais");  
			System.out.println("O preco a se pagar pelo produto agora sera de: " + precoComFreteImportado + " reais");
		}
	}
}

