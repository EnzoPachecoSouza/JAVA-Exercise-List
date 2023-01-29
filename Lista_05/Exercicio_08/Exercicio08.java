//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o horario que comecou o jogo: ");
		byte inicio = leia.nextByte();
		
		System.out.println("");
		
		System.out.print("Informe o horario que terminou o jogo: ");
		byte termino = leia.nextByte();
		
		if(inicio < termino){
			int subtracao = termino - inicio;
			
			if(subtracao > 1){
				
				System.out.println("O jogo durou " + subtracao + " horas!");
			}
			
			else{
				System.out.println("O jogo durou " + subtracao + " hora!");
			}
		}
		
		else{
			
			int subtracao2 = (24 - inicio) + termino;
			
			if(subtracao2 > 1){
				System.out.println("O jogo durou " + subtracao2 + " horas!");
			}
			
			else{
				System.out.println("O jogo durou " + subtracao2 + " hora!");
			}
		}
	}
}

