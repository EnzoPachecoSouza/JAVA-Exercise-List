//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double somaSalario = 0;
		int somaQuantidadeFilhos = 0;
		double maiorSalario = Integer.MIN_VALUE;
		double quantidadeMenorQue150 = 0;
		int quantidadeDePesquisados = 0;
		int salario = 0;
		
		do{		
			System.out.print("\nQual o seu salario: ");
			salario = leia.nextInt();
			
			if(salario < 0){
				break;
			}
			
			else if(salario > maiorSalario){
				maiorSalario = salario;
			}
			
			else if(salario < 150){
				quantidadeMenorQue150++;
			}
			
			somaSalario += salario;
			
			System.out.print("Quantos filhos voce tem: ");
			int filhos = leia.nextInt();
			
			somaQuantidadeFilhos += filhos;
			
			quantidadeDePesquisados++;
			
		}while(salario >= 0);
		
		System.out.println("\nA quantidade de pesquisados foi de: " + quantidadeDePesquisados + " pessoas!");
		System.out.printf("\nA soma dos salarios e de: %.2f %s", somaSalario, " reais");
		
		double mediaSalario = somaSalario / quantidadeDePesquisados;
		System.out.printf("\nA media dos salarios e de: %.2f %s", mediaSalario, " reais!");
		
		int mediaFilhos = somaQuantidadeFilhos / quantidadeDePesquisados;
		System.out.println("\nA media de numero de filhos e de: " + mediaFilhos);
		
		System.out.printf("O maior salario digitado foi: %.2f", maiorSalario);
		
		double percentualAbaixoDe150Reais = (quantidadeMenorQue150 * 100) / quantidadeDePesquisados;
		System.out.printf("\nO percentual de pessoas com renda abaixo de 150,00 reais e de: %.2f %s", percentualAbaixoDe150Reais, "%");
	}
}

