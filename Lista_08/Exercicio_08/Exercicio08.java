//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorF [] = new int[5];
		
		int contador = 0;
		int somaImpar = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " ---> ");
			vetorF[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			if(vetorF[i] % 2 != 0){
				somaImpar += vetorF[i];
			}
			else{
				contador++;
			}
		}
		
		System.out.println();
		
		if(contador == 5){
			System.out.println("Nenhum numero impar foi digitado!");
		}
		else{
			System.out.println("A soma dos numeros impares e ---> " + somaImpar);
		}
	}
}

