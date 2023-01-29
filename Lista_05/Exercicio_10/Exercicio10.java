//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o seu salario fixo: ");
		int salario = leia.nextInt();
		
		System.out.print("Informe quantas vendas voce fez esse mes: ");
		int vendas = leia.nextInt();
		
		System.out.println("");
		
		int[] valoresDeVenda = new int[vendas];
		
		double[] comissao = new double[vendas];
		
		double soma = 0;
		double Comissao = 0;
		double salarioComComissao = 0;
		
		if(vendas > 0){
			for(int i = 0; i < vendas; i++){
			System.out.print("Informe o valor da " + (i + 1) + " venda: ");
			valoresDeVenda[i] = leia.nextInt();
			
			System.out.println("");
			
				if(valoresDeVenda[i] <= 1500){
					comissao[i] = valoresDeVenda[i] * 0.03;
					}
				
				else{
					comissao[i] = valoresDeVenda[i] * 0.05;
				}
				
				soma += comissao[i];
				salarioComComissao = salario + soma;
			}
			
			for(int i = 0; i < vendas; i++){
				System.out.printf("A comissao que voce ganhou com a venda foi de : %.2f : %s", comissao[i], " reais\n");
			}
			
			System.out.printf("\nSeu salario este mes ficou em: %.2f %s", salarioComComissao, " reais");

		}
		else{
			System.out.println("Voce nao ganhou comissao este mes!");
			System.out.println("Seu salario neste mes continuara sendo: " + salario + " reais!");
		}	
	}
}

