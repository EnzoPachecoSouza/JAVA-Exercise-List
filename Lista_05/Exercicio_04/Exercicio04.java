//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor da primeira nota: ");
		double nota1 = leia.nextDouble();
		
		System.out.print("Digite o valor da segunda nota: ");
		double nota2 = leia.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("");
		
		if(media >= 6){
			System.out.println("APROVADO!!!");
			System.out.printf("Sua media aritmetrica e: %.1f", media);
		}
		
		else{
			System.out.println("REPROVADO!!!");
			System.out.printf("Sua media aritmetrica e: %.1f", media);
		}
	}
}

