//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o ano atual: ");
		short anoAtual = leia.nextShort();
		
		System.out.print("Informe o seu ano de nascimento: ");
		short anoNascimento = leia.nextShort();
		
		int calculo = anoAtual - anoNascimento;
		
		System.out.println("");
		
		if(calculo >= 16){
			System.out.println("PODE VOTAR!!!");
		}
		
		else{
			System.out.println("NAO PODERA VOTAR!!!");
		}
	}
}

