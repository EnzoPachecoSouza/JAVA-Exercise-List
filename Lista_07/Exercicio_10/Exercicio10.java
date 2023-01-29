//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contador = 0;
		for(int i = 65; i <= 90; i++){
			
			for(int j = 0; j < frase.length(); j++){
				if(frase.charAt(j) == (char)i){
					contador++;
				}
			}
		}
		
		System.out.println("A quantidade de letras maiusculas que tem nesta frase e ---> " + contador);
	}
}

