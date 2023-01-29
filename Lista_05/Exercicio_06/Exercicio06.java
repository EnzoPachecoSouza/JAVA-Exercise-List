//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int num1 = leia.nextInt();
		
		System.out.print("Digite um outro numero que nao seja igual: ");
		int num2 = leia.nextInt();
		
		System.out.println("");
		
		if(num1 > num2){
			System.out.println("O maior numero digitado foi: " + num1);
		}
		
		else if(num1 == num2){
			System.out.println("Os numeros sao iguais, entao nao existe um numero maior que tenha sido digitado!");
		}
		
		else{
			System.out.println("O maior numero digitado foi: " + num2);
		}
	}
}

