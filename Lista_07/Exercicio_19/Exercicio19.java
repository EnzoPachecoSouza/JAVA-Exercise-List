//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine().toUpperCase();
		
		int contador = 0;
		int tamanho = frase.length() - 1;
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == frase.charAt(tamanho)){
				contador++;
			}
			tamanho--;
		}
		
		if(contador == frase.length()){
			System.out.println("E uma palavra palindroma!");
		}
		
		else{
			System.out.println("Nao e uma palavra palindroma!");
		}
	}
}

