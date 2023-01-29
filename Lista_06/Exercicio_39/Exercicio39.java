//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int atual = 1;
		int contador = 1;
		int aux = 0;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		int soma4 = 0;
		
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
					System.out.print(contador + "/" + num + ", ");
					contador++;
					num--;
					atual++;
					
					soma1 += contador;
					soma3 += num;
				}
				else{
					System.out.print(contador + "/" + num + ", ");
					contador++;
					num--;
					atual++;
					
					soma2 += contador;
					soma4 += num;
				}
			}
		} while(num != 0);
		int somaGeral = soma1 + soma2 + soma3 + soma4;
		System.out.println("\nA soma e: " + somaGeral);
	}
}

