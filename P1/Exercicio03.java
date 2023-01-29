import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		
		int aux = 1;
		int contador = 0;
		
		do{
			if(num < 0){
				System.out.print("ERRO!!!\nDigite um outro numero: ");
				num = leia.nextInt();
			}
			
			else if(num == 0){
				System.exit(0);
			}
			
			else if(num > 0){
				if(aux <= num){
					boolean primo = true;
					
					for(int i = 1; i <= num; i++){
					int numeroAleatorio = new Random().nextInt(1, 30 );
							
							contador = 0;
							
						for(int j = 1; j <= numeroAleatorio; j++){
							if(numeroAleatorio % j == 0){
								contador++;
								
									primo = false;	
															
							}
							
							else{
								primo = true;
							}
						}
						
					if(contador == 2){
						System.out.println(numeroAleatorio + " este numero e primo!");
						
					}
					
					else{
						System.out.println(numeroAleatorio + " este numero nao e primo!");
					}
											
					aux++;
					}
				}
				
				break;
			}
		}while(num != 0);
	}
}

