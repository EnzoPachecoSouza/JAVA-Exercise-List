//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio08{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contador = 0;
		
		for(int i = 65; i <= 90; i++){
			
			contador = 0;
			
			for(int j = 0; j < frase.length(); j++){
				if((char)i == frase.toUpperCase().charAt(j) || (char)i == frase.toLowerCase().charAt(j)){
					contador++;
				}
			}
			if(contador > 0){
				System.out.print((char)i + " ---> ");
				System.out.println(contador);
			}
		}
	}
}
