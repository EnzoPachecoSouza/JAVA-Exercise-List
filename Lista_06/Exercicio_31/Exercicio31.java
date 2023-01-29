//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int	termo = leia.nextInt();
		
		int atual = 1;
		
		do{
			if(termo < 0){
				System.out.print("Digite a quantidade de termos: ");
				termo = leia.nextInt();
			}
			
			else if(termo == 0){
				System.out.println("\nVoce encerrou o programa!");
				break;
			}
			
			else if(termo > 0){
				if(atual <= termo){
					System.out.print(atual + ", ");
					
					atual++;
				}
				
				else{
					break;
				}
			}
		}while(termo != 0);
		
		
	}
}

