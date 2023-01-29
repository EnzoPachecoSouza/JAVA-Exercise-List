//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int nota = 0;
		
		System.out.print("Digite sua nota: ");
		nota = leia.nextInt();
		
		if (nota > 10 || nota < 0)
		{
			System.out.println("VALOR INVALIDO!!!");
		}
		
		else if (nota >= 6)
		{
			System.out.println("APROVADO");
		}	
		
		else
		{
			System.out.println("REPROVADO");
		}
	}
}

