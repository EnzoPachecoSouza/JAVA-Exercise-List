//Enzo Pacheco de Oliveira Souza - 2º ADS

public class ExibeNumeroAleatorio {
	
	public static void main (String[] args) {
		double numeroAleatorio = Math.random() * 100;
		System.out.println("O numero aleatorio em double e: " + numeroAleatorio);
		
		int NumeroAleatorio = (int) numeroAleatorio;
		System.out.print("O numero aleatorio em int e: " + NumeroAleatorio);
	}
}

