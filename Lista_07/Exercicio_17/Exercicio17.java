//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase1 = leia.nextLine();
		
		System.out.print("Digite uma outra frase ---> ");
		String frase2 = leia.nextLine();
		
		int contador = 0;
		
		if(frase1.length() == frase2.length()){
			for(int i = 0; i < frase1.length(); i++){
				if(frase1.charAt(i) == frase2.charAt(i)){
					contador++;
				}
				else{
					System.out.println("nao e igual");
					break;
				}
			}
			
			if(contador == frase1.length()){
			System.out.println("A frase e igual!");
			}
		}
		
		else{
			System.out.println("Esta frase nao e igual!");
		}
	}
}

