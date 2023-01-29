//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int atual = 1;
		int soma = 0;
		int numSoma = 0;
		
		do{
			if(num < 0){
				System.out.print("Digite um outro numero: ");
				num = leia.nextInt();
			}
			
			else if(num == 0){
				System.out.print("Voce encerrou o programa!!!");
				System.exit(0);
			}
			
			else if(num > 0){
				if(atual <= num){
					soma = soma + numSoma;
					
					System.out.print(soma + ",");
					
					numSoma++;
					atual++;
				}
			}
		}while(num != 0);
	}
}

