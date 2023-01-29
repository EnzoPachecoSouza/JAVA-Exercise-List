//Enzo Pacheco de Oliveira Souza - 2º ADS

public class DivisaoInteiraReal {
	
	public static void main (String[] args) {
		 int a = 5;
		 int b = 2;
		 
		 System.out.println( a / b );
		 System.out.println((float) a / b); //sem parente, apenas o resultado fica em float
		 System.out.println((double) a / b); //sem parentes apenas o resultado fica em double
		 System.out.println((double) (a / b)); //com o parentes toda conta fica em double, por isso ele se torna 2.0 e não 2.5
	}
}

