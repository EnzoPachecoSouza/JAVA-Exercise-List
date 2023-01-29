//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio33 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int atual = 1;
		
		do{
			if(num < 0){
				System.out.print("Digite um outro numero: ");
				num = leia.nextInt();
			}
			
			else if(num == 0){
				System.out.print("Voce encerrou o programa!");
				break;
			}
			
			else if(num > 0){
				if(atual <= num){
					if(atual % 2 != 0){
					System.out.print(atual + ", ");
					atual++;
					}
					else{
						atual++;
					}
				}
				else{
					break;
				}
			}
		}while(num != 0);
	}
}

