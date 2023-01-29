//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero ---> ");
		String num = leia.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i < num.length(); i++){
			if(num.length() == 8){
				if(num.charAt(i) == '0' || num.charAt(i) == '1'){
					contador++;
				}
			}
		}
		
		if(contador == 8){
			System.out.println("Este numero e binario de 8 bits!");
		}
		
		else{
			System.out.println("Este numero nao e binario de 8 bits!");
		}
	}
}

