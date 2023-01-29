//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		frase = frase.trim();
		
		String [] nome = frase.split(" ");
		
		int contadorEspaco = 0;
		
		/*for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == ' '){
				contadorEspaco++;
			}
		}
		
		Outra forma de se fazer
		*/
		
		System.out.println("A quantidade de palavras e " + nome.length);
	}
}

