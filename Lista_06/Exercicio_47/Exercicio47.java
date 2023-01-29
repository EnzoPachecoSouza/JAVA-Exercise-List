//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio47 {
	
	public static void main (String[] args) {
		
		int contador = 0;

		for(int i = 0; i < 100; i++){
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					contador++;
				}
			}
			if(contador == 2){
				System.out.println(i);
			}
			contador = 0;
		}
		
	}
}

