//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine().toUpperCase();
		
		System.out.print("\nDigite uma palavra ---> ");
		String palavra = leia.nextLine().toUpperCase();
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.substring(i).startsWith(palavra)){
				contador++;
			}
		}
		
		if(contador <= 0){
			System.out.println("\nA palavra " + palavra + " nao aparece nenhuma vez nesta frase");
		}
		else if(contador == 1){
			System.out.println("\nA palavra " + palavra + " aparece " + contador + " vez na frase");
		}
		else{
			System.out.println("\nA palavra " + palavra + " aparece " + contador + " vezes na frase");
		}
	}
}

