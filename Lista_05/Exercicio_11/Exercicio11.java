//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int num1 = leia.nextInt();
		
		System.out.print("\nInforme o segundo valor: ");
		int num2 = leia.nextInt();
		
		String operacaoArit = new String("+-*/");
		
		System.out.print("\nEntre com uma das operacoes aritmetricas: ");
		char escolha = leia.next().charAt(0);
		
		if(escolha == '+'){
			System.out.println("\nVoce escolheu a operacao SOMA!!!");
			
			int soma = num1 + num2;
			
			System.out.println("A soma dos valores e: " + soma);
		}
		
		else if(escolha == '-'){
			System.out.println("\nVoce escolheu a operacao SUBTRACAO!!!");
			
			int subtracao = num1 - num2;
			
			System.out.println("A soma dos valores e: " + subtracao);
		}
		
		else if(escolha == '*'){
			System.out.println("\nVoce escolheu a operacao MULTIPLICACAO!!!");
			
			int multiplicacao = num1 * num2;
			
			System.out.println("A multiplicacao dos valores e: " + multiplicacao);
		}
		
		else if(escolha == '/'){
			System.out.println("\nVoce escolheu a operacao DIVISAO!!!");
			
			int divisao = num1 / num2;
			
			System.out.println("A divisao dos valores e: " + divisao);
		}
		
		else{
			System.out.println("\nVoce nao escolheu nenhum operador aritmetrico!!! Tente novamente!");
		}
	}
}

