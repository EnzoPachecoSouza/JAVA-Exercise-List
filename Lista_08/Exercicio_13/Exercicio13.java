//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanhoP = 0;
		
		do{
			System.out.print("Digite o tamanho do array do vetorP ---> ");
			tamanhoP = leia.nextInt();
		}while(tamanhoP > 10);
		

		int tamanhoQ = 0;
			
		do{
			System.out.print("Digite o tamanho do array do vetorQ ---> ");
			tamanhoQ = leia.nextInt(); 
		}while(tamanhoQ > 15);
		
		System.out.println();
		
		int totalDeVetores = tamanhoP + tamanhoQ;
		
		int vetorP [] = new int[tamanhoP];
		int vetorQ [] = new int[tamanhoQ];
		int vetorR [] = new int[totalDeVetores];
		
		int aux = 0;
		
		for(int i = 0; i < tamanhoP; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PA---> ");
			vetorP[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanhoQ; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " no vetor PB---> ");
			vetorQ[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < totalDeVetores; i++){
			if(i < tamanhoP){
				vetorR[i] = vetorP[aux];
				System.out.println(vetorR[i]);
				
				aux++;
			}
			else{
				vetorR[i] = vetorQ[aux - tamanhoP];
				System.out.println(vetorR[i]);
				aux++;
			}
		}
	}
}

