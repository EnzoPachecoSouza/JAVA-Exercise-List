import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 0 caso voce nao queira nenhuma fruta!");
		System.out.println("Digite 1 caso voce queira o Abacate!");
		System.out.println("Digite 2 caso voce queira o Abacaxi!");
		System.out.println("Digite 3 caso voce queira a Banana!");
		System.out.println("Digite 4 caso voce queira o Melao!");
		System.out.println("Digite 5 caso voce queira a Melancia!");
		System.out.println("Digite 6 caso voce queira a Maca!");
		System.out.println("Digite 7 caso voce queira a Uva!");
		System.out.println("Digite 8 caso voce queira a Pera!");
		System.out.println("Digite 2 caso voce queira a Laranja!");
		System.out.println("Digite 2 caso voce queira o Limao");
		
		System.out.println("");
		
		System.out.print("Escolha uma fruta: ");
		int fruta = leia.nextInt();
		
		System.out.println("");
		
		switch(fruta){
			
			case 0:
				System.out.println("Voce nao quer nenhuma fruta!!!");
				break;
				
			case 1:
				System.out.println("Voce escolheu o Abacate!!!");
				break;
				
			case 2:
				System.out.println("Voce escolheu o Abacaxi!!!");
				break;
				
			case 3:
				System.out.println("Voce escolheu a Banana!!!");
				break;
				
			case 4:
				System.out.println("Voce escolheu o Melao!!!");
				break;
				
			case 5:
				System.out.println("Voce escolheu a Melancia!!!");
				break;
				
			case 6:
				System.out.println("Voce escolheu a Maca!!!");
				break;
				
			case 7:
				System.out.println("Voce escolheu a Uva!!!");
				break;
				
			case 8:
				System.out.println("Voce escolheu a Pera!!!");
				break;
				
			case 9:
				System.out.println("Voce escolheu a Laranja!!!");
				break;
				
			case 10:
				System.out.println("Voce escolheu o Limao!!!");
				break;
				
			default:
				System.out.println("Codigo Invalido!!!");
				break;
				
			}
	}
}

