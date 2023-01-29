//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.Scanner;

public class Exericio25 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("***VALIDADOR DE SENHA***     A senha deve conter:\n\n---> Letras maiusculas\n---> Letras minusculas\n---> Numeros\n---> Caracteres especiais/simbolos !@#$%*()+");
		System.out.print("\n\n---> Pelo menos 10 caracteres no total\n---> Pelo menos 3 caracteres (Maiusculos ou minusculos)\n---> Pelo menos 3 numeros\n---> Pelo menos 2 simbolos\n");
		
		int contador = 0;
		
		do{
			System.out.print("\nDigite uma senha forte ---> ");
			String senha = leia.nextLine();
			
			contador = 0;
			int tamanho = 0;
			int contadorMaiuscula = 0;
			int contadorMinuscula = 0;
			int somaLetras = 0;
			int contadorNumeros = 0;
			int contadorSimbolos = 0;
			
			for(int i = 0; i < senha.length(); i++){
				char c = senha.charAt(i);
				if('a' < c && c <= 'z' ){
					contadorMinuscula++;
					tamanho++;
				}
				else if('A' < c && c <= 'Z'){
					contadorMaiuscula++;
					tamanho++;
				}
				else if('0' < c && c <= '9'){
					contadorNumeros++;
					tamanho++;
				}
				else if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*' || c == '(' || c == ')' || c == '+'){
					contadorSimbolos++;
					tamanho++;
				}
			}
			
			System.out.println("\nREGRAS");
			//tamanho
			if(tamanho >= 10){
				System.out.println("\nTamanho 10: " + tamanho + " (ok)");
				contador++;
			}
			else{
				System.out.println("Tamanho 10: " + tamanho + " (x)"); 
			}
			//letras
			if(contadorMaiuscula >= 1 && contadorMinuscula >= 1){
				somaLetras = contadorMaiuscula + contadorMinuscula;
				if(somaLetras >= 3){
					System.out.println("Letras 3: " + somaLetras + " (ok)");
					contador++;
				}
				else{
					System.out.println("Letras 3: " + somaLetras + " (x)");
				}
			}
			else{
				System.out.println("Letras 3: " + somaLetras + " (x)");
			}
			//Numeros
			if(contadorNumeros >= 3){
				System.out.println("Numeros 3: " + contadorNumeros + " (ok)");
				contador++;
			}
			else{
				System.out.println("Numeros 3: " + contadorNumeros + " (x)");
			}
			//Simbolos
			if(contadorSimbolos >= 2){
				System.out.println("Simbolos 2: " + contadorSimbolos + " (ok)");
				contador++;
			}
			else{
				System.out.println("Simbolos 2: " + contadorSimbolos + " (x)");
			}
			//Geral
			if(contador == 4){
				System.out.println("\nSenha Aprovada! Parabens!");
			}
			else{
				System.out.println("\nSenha Reprovada! Tente novamente!");
			}
		}while(contador != 4);
	}
}
