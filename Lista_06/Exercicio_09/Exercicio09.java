//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeEntreDezVinte = 0;
		int quantidadeAlemDisso = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.print("Digite um numero: ");
			int num = leia.nextInt();
			
			if(num >= 10 && num <= 20){
				quantidadeEntreDezVinte++;
			}
			
			else{
				quantidadeAlemDisso++;
			}
		}
		
		System.out.println("");
		
		System.out.println("A quantidade de numeros digitados entre 10 e 20, incluindo 10 e 20, sao: " + quantidadeEntreDezVinte);
		System.out.println("A quantidade de numero digitado alem de entre 10 e 20, sao: " + quantidadeAlemDisso);
	}
}

