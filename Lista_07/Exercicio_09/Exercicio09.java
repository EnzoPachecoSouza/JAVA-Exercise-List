//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == ' '){
				contador++;
			}
		}
		
		System.out.println("A quantidade de espacos que tem nesta frase e ---> " + contador);
	}
}

