//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio54 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de termos: ");
		int termos = leia.nextInt();
		
		System.out.print("\nInforme o termo inicial: ");
		int termoInicial = leia.nextInt();
		
		System.out.print("\nInforme o termo final: ");
		int termoFinal = leia.nextInt();
		
		System.out.println("");
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		for(int i = 1; i <= termos; i++){
			if(i >= termoInicial && i <= termoFinal){
				System.out.print(a + " ");
			}
			
			a = b;
			b = c;
			c = a + b;
		}
	}
}

