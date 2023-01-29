//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase ---> ");
		String frase = leia.nextLine();
		
		System.out.print("Digite a letra que voce quer ---> ");
		String letra = leia.nextLine();
		
		int contador = 0;	
		
		for(int i = 0; i < frase.length(); i++){
			if(("" + frase.charAt (i)).equalsIgnoreCase(letra)){
			contador++;
			}
		}
		
		System.out.print("A quantidade de letras " + letra + "que aparece na frase e ---> " + contador + " vezes!");
	}
}
