//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		int contadorAlfabetico = 0;
		int contadorNumerico = 0;
		int contadorEspaco = 0;
		

		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
				contadorAlfabetico++;
			}
			
			else if(('0' <= c && c <= '9')){
				contadorNumerico++;
			}
			
			else{
				contadorEspaco++;
			}
		}
		
		System.out.println("A quantidade de caracter alfabetico e ---> " + contadorAlfabetico);
		System.out.println("A quantidade de caracter numerico e ---> " + contadorNumerico);
		System.out.println("A quantidade de caracter de espaco e ---> " + contadorEspaco);
	}
}

