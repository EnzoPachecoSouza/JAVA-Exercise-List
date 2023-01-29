//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio03 {
	
	public static void main (String[] args) {
		String valor = "";
		
		for(int i = 65; i <= 90; i++){
			valor += (char)i + " ";
		}
		System.out.print(valor.toLowerCase());
	}
}

