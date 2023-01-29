//Enzo Pacheco de Oliveira Souza - 2º ADS

public class TesteDeVariaveis {
	
	public static void main (String[] args) {
		System.out.println("Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo.");
		System.out.println(" a. \"Bom dia\" \n b. 3 \n c. 235.13 \n d. true \n e. -135 \n f. 256.23F \n g. 'A' \n h. 6463275245745L \n");
		
		String frase = "Bom dia";
		System.out.println("String ---> " + frase);
		
		byte n1 = 3;
		System.out.println("byte ---> " + n1);
		
		float n2 = 235.13f;
		System.out.println("float ---> " + n2);
		
		boolean verdade = true;
		System.out.println("boolean ---> " + verdade);
		
		short n3 = -135;
		System.out.println("short ---> " + n3);
		
		float n4 = 256.23F;
		System.out.println("float ---> " + n4);
		
		char vogal = 'A';
		System.out.println("char ---> " + vogal);
		
		long n5 = 6463275245745L;
		System.out.println("long ---> " + n5);
	}
}

