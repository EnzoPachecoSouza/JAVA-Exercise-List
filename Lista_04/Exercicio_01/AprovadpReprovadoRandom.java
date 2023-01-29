//Enzo Pacheco de Oliveira Souza - 2º ADS

public class AprovadpReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int)(Math.random() * 10);
		
		
		
		System.out.println("A sua nota e " + nota + " e voce esta: " + (nota >= 6 ? "APROVADO" : "REPROVADO"));
	}
}

