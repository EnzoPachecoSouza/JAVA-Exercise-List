//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int quantAlunos = leia.nextInt();
		
		int soma = 0;
		
		System.out.println("");
		
		for(int i = 1; i <= quantAlunos; i++){
			System.out.print("Informe a nota do aluno numero " + i + " : ");
			int nota = leia.nextInt();
			
			soma = soma + nota;
		}
		
		double media = soma / quantAlunos;
		
		System.out.println("");
		
		System.out.println("A quantidade de alunos era de " + quantAlunos + " alunos, e a soma das suas respectivas notas e " + soma);
		System.out.println("Diante disso, a media aritmetrica da sala e: " + media);
	}
}

