//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio27 {
	
	public static void main (String[] args) {
		for(int i = 1; i <= 10; i++){
			System.out.print(i + ", ");
			for(int j = 0; j <= 10 - i; j++){
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}
}

