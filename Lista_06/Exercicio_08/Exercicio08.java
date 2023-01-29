//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadePositivo = 0;
		int quantidadeNegativo = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.print("Digite um numero: ");
			int num = leia.nextInt();
			
			if(num >= 0){
				quantidadePositivo++;
			}
			
			else{
				quantidadeNegativo++;
			}
		}
		
		System.out.println("\nA quantidade de numeros positivos digitado foi: " + quantidadePositivo);
		
		System.out.println("\nA quantidade de numeros negativos digitado foi: " + quantidadeNegativo);
	}
}

