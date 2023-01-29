//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			
			if('A' <= c && c <= 'Z'){
				contador++;
			}
		}
		
		if(contador > 0){
			System.out.println("A frase contem caracteres MAIUSCULOS!!!");
		}
		
		else{
			System.out.println("A frase nao contem caracteres maiusculos!!!");
		}
	}
}

