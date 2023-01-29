//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero que seja maior que zero para contar de 1 ate ele: ");
		int numero = leia.nextInt();
		
		while(numero <= 0){
			System.out.print("Digite um numero que seja maior que zero para contar de 1 ate ele: ");
			numero = leia.nextInt();
		}
		
		System.out.println("");
		
		for(int i = 1; i <= numero; i++){
			System.out.println(i);
		}
		

		
		
		
	}
}

