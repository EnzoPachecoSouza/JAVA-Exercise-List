//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = leia.nextInt();
		
		System.out.print("\nDigite o segundo numero: ");
		int n2 = leia.nextInt();
		
		int soma = 0;
		
		if(n1 < n2){
			for(int i = n1; i <= n2; i++){
			soma = soma + i;
		}
		System.out.println("\nA soma dos numeros inteiros entre " + n1 + " e " + n2 + " e: " + soma);
		}
		
		else{
			for(int i = n2; i <= n1; i++){
				soma = soma + i;
			}
			System.out.println("\nA soma dos numeros inteiros entre " + n1 + " e " + n2 + " e: " + soma);
		}
	}
}

