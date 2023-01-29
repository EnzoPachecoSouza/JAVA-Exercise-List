//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero para que seja contado de 1 ate este numero digitado: ");
		int numero = leia.nextInt();
		
		System.out.println("");
		
		for(int i = 1; i <= numero; i++){
			System.out.println(i);
		}
	}
}

