//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio52 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite um numero para sequencia de fibonacci ---> ");	
		int num = leia.nextInt();
	
		int a = 1;
		int b = 0;
		int aux;
	
		for(int i = 1; i <= num; i++){
			if(num == a){
				System.out.println("Este numero esta na sequencia de fibonacci!!!");
			}
			
			else{
				System.out.println("Este numero nao pertence a sequencia de fibonacci!!!");
			}
			aux = a;
			a = a + b;
			b = aux;
		}	
	}
}

