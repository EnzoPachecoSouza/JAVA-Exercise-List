//ENZO PACHECO ---> 2ADS

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1 numero: ");
		int num1 = leia.nextInt();
		
		System.out.print("Digite o 2 numero: ");
		int num2 = leia.nextInt();
		
		System.out.print("Digite o 3 numero: ");
		int num3 = leia.nextInt();
				
		if(num1 == num2 && num2 == num3 && num3 == num1){
			System.out.println("Os numeros digitados sao iguais!!!");
		}
		
		else{
			if(num1 > num2 && num1 > num3 && num2 > num3 || num1 > num2 && num1 > num3 && num2 == num3){
				System.out.print(num1 + " " + num2 + " " + num3);
			}
			
			if(num1 > num2 && num1 > num3 && num3 > num2){
				System.out.print(num2 + " " + num1 + " " + num3);
			}
			
			if(num2 > num1 && num2 > num3 && num1 > num3 || num2 > num1 && num2 > num3 && num1 == num3){
				System.out.print(num2 + " " + num1 + " " + num3);
			}
			
			if(num2 > num1 && num2 > num3 && num3 > num1){
				System.out.print(num2 + " " + num3 + " " + num1);
			}
			
			if(num3 > num1 && num3 > num2 && num2 > num1 || num3 > num1 && num3 > num2 && num2 == num1){
				System.out.print(num3 + " " + num2 + " " + num1);
			}
			
			if(num3 > num1 && num3 > num1 && num1 > num2){
				System.out.print(num3 + " " + num1 + " " + num2);
			}
		}	
	}
}

