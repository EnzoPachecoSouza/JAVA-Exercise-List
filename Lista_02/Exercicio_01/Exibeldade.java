//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exibeldade {
	
	public static void main (String[] args) {
		System.out.println("Qual sua idade?");
		
		Scanner leia = new Scanner (System.in);
		int idade = 0;
		
		System.out.println();
		System.out.print("Digite sua idade aqui: ");
		idade = leia.nextInt();
		
		System.out.println("Sua idade e: " + idade);
	}
}

