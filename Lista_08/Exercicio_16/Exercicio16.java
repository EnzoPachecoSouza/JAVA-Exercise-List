//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array ---> ");
		int tamanho = leia.nextInt();
		
		int vetorV [] = new int[tamanho];
		
		int a = 1;
		int b = 0;
		int aux = 0;
		
		for(int i = 0; i < tamanho; i++){
			vetorV[i] = aux;
			
			aux = a;
			a = a + b;
			b = aux;
		}
		
		for(int i = 0; i < tamanho; i++){
			System.out.print(vetorV[i] + ", ");
		}
	}
}

