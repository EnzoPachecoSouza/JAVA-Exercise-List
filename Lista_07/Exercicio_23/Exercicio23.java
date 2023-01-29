//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu nome ---> ");
		String nome = leia.nextLine().toUpperCase();
		
		String[] sobrenome = nome.split(" "); //split é usado para separar os termos
		
		System.out.println("Seu sobrenome e ---> " + sobrenome[sobrenome.length - 1]);  //length quando se usa ARRAY nao precisa do "()"
	}
}

