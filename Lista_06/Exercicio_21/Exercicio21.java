//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de numeros que voce quer ler: ");
		int quantidade = leia.nextInt();
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		int soma = 0;
		
		for(int i = 1; i <= quantidade; i++){
			System.out.print("\nDigite o " + i + " numero: ");
			int num = leia.nextInt();
			
			soma = soma + num;
			
			if(num > maior){
				maior = num;
			}
			
			else if(num < menor){
				menor = num;
			}
		}
		
		double media = soma / quantidade;
		
		System.out.println("\nA soma dos numeros e: " + soma);
		System.out.println("O maior numero digitado foi: " + maior + ", e o menor digitado foi: " + menor);
		System.out.printf("A media dos numeros digitado e: %.2f", media); 
	}  
}

