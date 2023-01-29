//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Quantas macas voce comprou? ---> ");
		int quantidadeDeMaca = leia.nextInt();
		
		System.out.println("");
		
		if(quantidadeDeMaca > 0){
			if(quantidadeDeMaca <= 11){
				double soma1 = quantidadeDeMaca * 1.30;
				
				System.out.printf("O valor a se pagar por esse tanto de macas e de: %.2f %s", soma1 , " reais."); 
			}
			
			else{
				double soma2 = quantidadeDeMaca * 1;
				
				System.out.printf("O valor a se pagar por esse tanto de macas e de: %.2f %s" , soma2 , " reais.");
			}
		} 
		
		else{
			System.out.println("Se voce nao escolher nenhuma maca, eu nao posso calcular o valor total da compra!!!");
		}
	}
}

 
