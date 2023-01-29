//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			
			if('0' <= c && c <= '9'){
				contador++;
			}
		}
		
		if(contador > 0){
			System.out.println("A frase contem caracteres numericos!!!");
		}
		
		else{
			System.out.println("A frase nao contem caracteres numericos!!!");
		}
	}
}

