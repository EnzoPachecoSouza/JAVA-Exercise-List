//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio51 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite um numero para sequencia de fibonacci ---> ");	
	int num = leia.nextInt();
	
	int a = 1;
	int b = 0;
	int aux;
	
	for(int i = 1; i <= num; i++){
		System.out.print(a + ", ");
		
		aux = a;
		a = a + b;
		b = aux;
	}
	}
}

