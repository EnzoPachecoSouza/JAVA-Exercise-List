//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe o seu salario liquido: ");
		int salarioLiquido = leia.nextInt();
		
		System.out.println("");
		
		System.out.print("Informe quantas horas trabalhou este mes: ");
		int horas = leia.nextInt();
		
		System.out.println("");
		
		double salarioPorHoraPadrao = salarioLiquido / 160;
		
		if(horas > 160){
			int quantidadeDeHorasExtras = horas - 160;
			double salarioPorHoraExtras = ((salarioPorHoraPadrao / 2) * quantidadeDeHorasExtras) + salarioPorHoraPadrao;
			double salarioMaisExtra = salarioLiquido + salarioPorHoraExtras;
			
			System.out.println("Voce trabalhou " + horas + " horas este mes!");
			System.out.println("Voce fez o total de " + quantidadeDeHorasExtras + " horas extras esse mes!");
			System.out.printf("Seu salario por hora neste mes, contando as horas extras, ficou em: %.2f %s", salarioPorHoraExtras, " reais!\n");
			System.out.printf("Seu salario esse mes devido ao horario extra, ficou em: %.2f %s", salarioMaisExtra, " reais!");
		}
		
		else if(horas == 160){
			System.out.println("Voce trabalhou no horario padrao este mes, sem horas extras!");
			System.out.printf("Seu salario por hora e de: %.2f %s", salarioPorHoraPadrao, " reais\n");
			System.out.println("Seu salario deste mes e: " + salarioLiquido + " reais, sem alteracoes devido nao ter tido hora extra!");
		}
		
		else{
			System.out.println("Voce nao trabalho o horario minimo este mes!!!");
		}
	}
}

