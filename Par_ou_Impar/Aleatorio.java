import java.util.Scanner;

public class Aleatorio {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero, e eu descobrirei se ele e par ou impar junto ao proximo numero ---> ");
		int numero = leia.nextInt();
		
		System.out.print("Digite um outro numero para descobrir se a soma deles e par ou impar ---> ");
		int numero2 = leia.nextInt();
		
		int soma = numero + numero2;
		
		System.out.println("A soma deles e: " + soma);
		
		if(soma % 2 == 0){
			System.out.println("Este numero e par!!!");
		}
		
		else{
			System.out.println("Este numero e impar!!!");
		}
	}
}

