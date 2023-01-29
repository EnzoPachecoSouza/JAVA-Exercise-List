//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int atual = 1;
		int contador = 1;
		int aux = 2;
		
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
					if(atual < 2){
						System.out.print(contador + ", ");
						atual++;
					}
					else{
						System.out.print(contador + "/" + aux + ", ");
						aux++;
						atual++;
					}
				}
			}
		} while(num != 0);
	}
}

