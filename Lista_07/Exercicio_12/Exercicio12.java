//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contadorVogal = 0;
		

		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
					contadorVogal++;
			}
			
			else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
				contadorVogal++;
			}
		}
		
		System.out.println("A quantidade de caracter alfabetico e ---> " + contadorVogal);
	}
}

