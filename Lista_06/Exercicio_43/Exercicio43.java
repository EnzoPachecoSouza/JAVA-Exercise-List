//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		long fatorial = 1;
		
			for(long j = 1; j <= 7; j++){
				
				System.out.print("Digite um numero: ");
				int num = leia.nextInt();
				
					for(long i = 1; i <= num; i++){
						
						fatorial = fatorial * i;
						
					}
					System.out.println("A fatorial de " + num + " e ---> " + fatorial);
					fatorial = 1;
				}
	}
}

