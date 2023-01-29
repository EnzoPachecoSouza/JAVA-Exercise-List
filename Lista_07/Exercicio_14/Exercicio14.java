//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine().toUpperCase();
		
		System.out.print("\nDigite um caracter ---> ");
		char caracter = leia.nextLine().toUpperCase().charAt(0);
		
		System.out.println("\n" + frase.replace(caracter, '*'));
	}
}

