//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor = leia.nextInt();
		
		System.out.println("");
		
		if(valor > 10){
			System.out.println("E MAIOR QUE 10!");
		}
		
		else{
			System.out.println("E MENOR QUE 10!");
		}
		
	}
}

