//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanhoQA = 0;
		
		do{
			System.out.print("Digite o tamanho do array do vetorP ---> ");
			tamanhoQA = leia.nextInt();
		}while(tamanhoQA > 10);
		

		int tamanhoQB = 0;
			
		do{
			System.out.print("Digite o tamanho do array do vetorQ ---> ");
			tamanhoQB = leia.nextInt(); 
		}while(tamanhoQB > 15);
		
		System.out.println();
		
		int totalDeVetores = tamanhoQA + tamanhoQB;
		
		int vetorQA [] = new int[tamanhoQA];
		int vetorQB [] = new int[tamanhoQB];
		int vetorQC [] = new int[totalDeVetores];
		
		int auxA = 0;
		int auxB = 0;
		
		for(int i = 0; i < tamanhoQA; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + " ---> ");
			vetorQA[i] = leia.nextInt();
		}
		
		for(int i = 0; i < tamanhoQB; i++){
			System.out.print("Digite um numero para a posicao " + (i + 1) + "---> ");
			vetorQB[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanhoQA; i++){
			System.out.println(vetorQA[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < tamanhoQB; i++){
			System.out.println(vetorQB[i]);
		}
		
		System.out.println();
		
		if(tamanhoQA > tamanhoQB){
			for(int i = 0; i < totalDeVetores; i++){
				if(i % 2 == 0){
					vetorQC[i] = vetorQA[auxA];
					System.out.println(vetorQC[i]);
				
					auxA++;
				}
				else if(i % 2 != 0){
					vetorQC[i] = vetorQB[auxB];
					System.out.println(vetorQC[i]);
					auxB++;
				}
			}
		}
		else{
			for(int i = 0; i < totalDeVetores; i++){
				if(i % 2 == 0){
					vetorQC[i] = vetorQB[auxB];
					System.out.println(vetorQC[i]);
				
					auxB++;
				}
				else if(i % 2 != 0){
					vetorQC[i] = vetorQA[auxA];
					System.out.println(vetorQC[i]);
					auxA++;
				}
			}
		}
			
	}
}
