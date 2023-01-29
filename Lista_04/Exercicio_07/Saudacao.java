//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite 1 caso voce queira escolher a hora, ou, digite 2 caso voce queira um numero aleatorio: ");
		int escolha = leia.nextInt();
		
		System.out.println("");
		
		if(escolha == 1)
		{
			System.out.print("Digite a hora: ");
			int horaManual = leia.nextInt();
			
			System.out.println("");
			
			if(horaManual > 23 || horaManual < 0)
			{
				System.out.println("Horario invalido");
			}
			
			else
			{
				System.out.println("A hora e: " + horaManual);
				
				if(horaManual >= 0 && horaManual <= 6)
				{
					System.out.println("Zzzzz");
				}
				
				else if(horaManual >= 7 && horaManual <= 11)
				{
					System.out.println("Boa Dia!");
				}
				
				else if(horaManual >= 12 && horaManual <= 17)
				{
					System.out.println("Boa Tarde!");
				}
				
				else if(horaManual >= 18 && horaManual<= 23)
				{
					System.out.println("Boa Noite");
				}
			}
		}

		else if(escolha == 2)
		{
			int aleatorio = (int) (Math.random() * 25);
			System.out.println("A hora aleatoria e: " + aleatorio);
			
				if(aleatorio >= 0 && aleatorio <= 6)
				{
					System.out.println("Zzzzz");
				}
				
				else if(aleatorio >= 7 && aleatorio <= 11)
				{
					System.out.println("Boa Dia!");
				}
				
				else if(aleatorio >= 12 && aleatorio <= 17)
				{
					System.out.println("Boa Tarde!");
				}
				
				else if(aleatorio >= 18 && aleatorio <= 23)
				{
					System.out.println("Boa Noite");
				}
			
		}
		
		
	}
}

