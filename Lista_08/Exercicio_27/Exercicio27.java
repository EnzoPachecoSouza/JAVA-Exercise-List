//Enzo Pacheco de Oliveira Souza - 2º ADS

public class Exercicio27 
{
	public static void main (String[] args) 
	{
		//variáveis
		int a = 10;
		int b = 5;
		
		//vetores
        int[] AH = new int[(int) (Math.random() * a + 1)];
        int[] AI = new int[(int) (Math.random() * b + 1)];
        
        
        //preenchendo AH com números aleatórios
        for (int i = 0; i < AH.length; i++) 
        {
            AH[i] = (int) (Math.random() * a + 1);
        }
        
        
        //preenchendo AI com números aleatórios
        for (int i = 0; i < AI.length; i++) 
        {
            AI[i] = (int) (Math.random() * b + 1);
        }
       
        
        //exibindo AH
        System.out.print("Vetor AH: ");
        for(int n1 : AH)
        {
			System.out.printf("[%d] ", n1);
		}
        
       
        //exibindo AI
        System.out.print("\n\nVetor AI: ");
        for(int n2 : AI)
        {
			System.out.printf("[%d] ", n2);
		}
		
		
		//concatenando vetores
		int size = AH.length + AI.length;
		int aux = 0;
        int [] uniao = new int[size];
        
        for (int i = 0; i < AH.length; i++) 
        {
            uniao[aux++] = AH[i];
        }
        for (int i = 0; i < AI.length; i++) 
        {
            uniao[aux++] = AI[i];
        }
		
		
		//exibindo os valores concatenados
        System.out.print("\n\nVetores concatenados: ");
        for(int n3 : uniao)
        {
			System.out.printf("[%d] ", n3);
		}
		
		
	}
}
