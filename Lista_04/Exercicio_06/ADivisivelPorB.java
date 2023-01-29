//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor de a que seja de 0 ate 1000: ");
		int a = leia.nextInt();
		
		System.out.print("Digite o valor de b que seja de 0 a 20: ");
		int b = leia.nextInt();
		
		if(a > 1000 || a < 0 || b > 20 || b < 0)
		{
			System.out.println("VALOR INVALIDO!");
		}	
		
		else if (a >= b)
		{
			System.out.println("O valor de a e maior do que b!");
			
			if(a % b == 0)
			{
				System.out.println("E DIVISIVEL!");
			}
			
			else
			{
				System.out.println("NAO E DIVISIVEL}!");
			}
		}
		
		else 
		{
			System.out.println("O valor de b e maior de a!");
			System.out.println("NAO E DIVISIVEL!");
		}
	}
}

