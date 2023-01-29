//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero, e farei a tabuada dele: ");
		int num = leia.nextInt();
		
		System.out.println("");
		
		if(num >= 1 && num <= 10){
			for(int i = 1; i <= 10; i++){
				
				int mult = num * i;
				
				System.out.println(num + " x " + i + " = " + mult);
			}
		}
		
		else{
			System.out.println("Voce nao digiou um numero entre 1 e 10, tente mais uma vez!");
			System.out.println("Digite um numero entre 1 e 10, e farei a tabuada dele: ");
			int num1 = leia.nextInt();
			
			for(int i = 1; i <= 10; i++){
				
				int mult1 = num1 * i;
				
				System.out.println("\n" + num1 + " x " + i + " = " + mult1);
			}
		}
	}
}

