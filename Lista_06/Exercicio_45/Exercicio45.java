//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio45 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de termos: ");
		int termo = leia.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= termo; i++){
			System.out.print("Digite um numero: ");
			int num = leia.nextInt();
			
			for(int j = num; j >= 1; j--){
				fatorial *= j;
				System.out.println("A fatorial de " + num + " e: "+ fatorial);
			}
		}
	}
}

