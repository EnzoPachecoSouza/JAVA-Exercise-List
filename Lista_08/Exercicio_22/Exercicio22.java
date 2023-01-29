//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tamanho = 0;
		
		do{
			System.out.print("Informe o tamanho do vetor ---> ");
			tamanho = leia.nextInt();
		}while(tamanho > 20);
		
		int vetorAC [] = new int[tamanho];
		
		System.out.println();
		
		for(int i = 0; i < tamanho; i++){
			vetorAC[i] = new Random().nextInt(1, 100);
		}
		
		Arrays.sort(vetorAC);//Deixar em ordem Crescente
		
		for(int i = 0; i < tamanho; i++){
			System.out.println("O numero da posicao " + (i + 1) + " e ---> " + vetorAC[i]);
		}
		
		System.out.println();
		
		System.out.print("Infome o inicio da posicao que voce deseja ---> ");
		int inicio = leia.nextInt();
		
		System.out.print("Infome o final da posicao que voce deseja ---> ");
		int termino = leia.nextInt();
		
		System.out.println();
		
		for(int i = inicio - 1; i < termino; i++){
			System.out.println("Voce escolheu o termo da posicao " + (i + 1) + " ---> " + vetorAC[i]);
		}
	}
}

