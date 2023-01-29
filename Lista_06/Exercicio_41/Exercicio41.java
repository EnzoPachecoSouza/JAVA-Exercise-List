//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		long fatorial = 1;
		
		while(num < 0){
				System.out.print("Digite um outro numero: ");
				num = leia.nextInt();
			}
		
		for(int i = 1; i <= num; i++){
			if(num == 0){
				System.out.println("A fatorial de " + num + " e --> 1");
			}
			
			else if(num > 0){
				fatorial *= i;
			}
		}
		System.out.println("A fatorial de " + num + " e --> " + fatorial);
	}
}

