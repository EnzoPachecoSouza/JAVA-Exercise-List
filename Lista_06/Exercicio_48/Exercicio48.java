//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio48 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o valor do termo ---> ");
		int termo = leia.nextInt();
		
		int contador = 0;

		for(int i = 0; i < termo; i++){
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					contador++;
				}
			}
			if(contador == 2){
				System.out.println(i);
			}
			contador = 0;
		}
	}
}

