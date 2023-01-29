//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio38 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int atual = 0;
		int contador = 0;
		int aux = 1;
		
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
					if(atual < 1){
						System.out.print(contador + ", ");
						atual++;
					}
					else{
						System.out.print(contador + "/" + aux + ", ");
						contador++;
						aux++;
						atual++;
					}
				}
			}
		} while(num != 0);
	}
}

