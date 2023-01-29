//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio46 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int contador = 0;
		
		for(int i = 1; i <= num; i++){
			if(num % i == 0){
				contador++;
			}
		}
		
		if(contador == 2){
			System.out.println("O numero digitado e primo!!!");
		}
		
		else{
			System.out.println("O numero digitado nao e primo!!!");
		}
	}
}

