//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int numero = leia.nextInt();
		
		System.out.println("");
		
		if(numero >= 0){
			System.out.println("O numero digitado e posivito!");
		}
		
		else{
			System.out.println("O numero digitado e negativo!");
		}
	}
}

