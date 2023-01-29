//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine().toUpperCase();
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == ' '){
				System.out.println();
			}
			
			else{
				System.out.print(frase.charAt(i));
			}
		}
	}
}

