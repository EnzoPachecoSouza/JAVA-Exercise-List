//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio28 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("insira seu nome completo: ");
		String quote = read.nextLine();
		
		String [] palavras = quote.split(" ");
		String ultimo = palavras[palavras.length - 1];
		
		//espaçamento
		System.out.println("");
		
		
		System.out.println(ultimo);
		
		
	}
}
