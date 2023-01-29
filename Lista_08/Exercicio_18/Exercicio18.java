//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 0;
		int fatorial  = 1;
		
		do{
			System.out.print("Informe o a quantidade de termos da sequencia de fatoriais voce quer ---> ");
			tamanho = leia.nextInt();
		}while(tamanho > 15);
		
		int vetorY [] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++){
			if(i == 0){
				fatorial *= (i + 1);
				vetorY[i] = fatorial;
				
				System.out.print(vetorY[i] + ", ");
			}
			else{
				fatorial *= (i);
			
				vetorY[i] = fatorial;
			
				System.out.print(vetorY[i] + ", ");
			}
		}
		
		for(int i = 0; i <= tamanho; i++){
			//System.out.print(vetorY[i] + ", ");
		}
	}
}

