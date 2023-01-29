//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		char choose;
		
		do{
			for(int i = 1; i <= 2; i++){
			System.out.print("Digite uma nota: ");
			int nota = leia.nextInt();
			
			if(nota < 0 || nota > 10){
				while(nota < 0 || nota > 10){
				System.out.print("Digite uma nota: ");
				nota = leia.nextInt();
				}
			}
			
				soma = soma + nota;
			}
		
			double media = soma / 2;
		
			System.out.println("\nA soma das notas e: " + soma);
			System.out.println("A media e: " + media);
			
			System.out.print("Voce quer um novo calculo? S/N ");
			String escolha = leia.next();                                 
			escolha= escolha.toUpperCase();
			
			choose = escolha.charAt(0);
			
		}while(choose == 'S');
		
		System.out.println("");
		
		System.out.println("Sistema Ecerrado!");
		
	}
}

