//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma sequencia aleatoria de 0's e 1's ---> ");
		String sequencia = leia.nextLine();
		
		int contador = 0;
		int maiorSequencia = 0;
		
		for(int i = 0; i < sequencia.length(); i++){
			if(sequencia.charAt(i) == '1'){
				contador++;
			}
			else{
				contador = 0;
			}
			
			if(contador > maiorSequencia){
			maiorSequencia = contador;
			}
		}
		
		System.out.println("\nA maior sequencia de 1 foi ---> " + maiorSequencia);
	}
}

