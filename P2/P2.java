import java.util.Scanner;

public class P2 {
	
	public static void main (String[] args) {
		Scanner nome = new Scanner(System.in);
		Scanner nota = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		char resposta;
		int qtdAlunos = 0; double maior = Integer.MIN_VALUE; double menor = Integer.MAX_VALUE; double somaMedia = 0; double mediaDaSala = 0; int contadorAprovado = 0; int contadorRecuperacao = 0; int contadorReprovado = 0;
		do{
			do{
				System.out.print("Nos informe a quantidade de alunos ---> ");
				qtdAlunos = nota.nextInt();
			}while(qtdAlunos <= 0);
		
			System.out.println();
		
			String aluno [] = new String [qtdAlunos];
			double nota1 [] = new double[qtdAlunos];
			double nota2 [] = new double[qtdAlunos];
			double media [] = new double[qtdAlunos];
		
			//NOME DO ALUNO, NOTA 1 e NOTA 2
			for(int i = 0; i < qtdAlunos; i++){
				System.out.print("Informe o nome do " + (i + 1) + "  aluno ---> ");
				aluno[i] = nome.nextLine().toUpperCase();
			
				System.out.print("Informe a nota 1 do aluno " + aluno[i] + " ---> ");
				nota1[i] = nota.nextDouble();
			
				System.out.print("Informe a nota 2 do aluno " + aluno[i] + " ---> ");
				nota2[i] = nota.nextDouble();
			
				System.out.println();
			}
		
			//LISTAGEM COM NOME, NOTA 1, NOTA 2, MÉDIA E SITUAÇÃO (Aprovado ou Reprovado)
			System.out.println("Listagem: ");
			System.out.println("Aluno        Nota 1    Nota 2    Media      Situacao" );
			for(int i = 0; i < qtdAlunos; i++){
				media[i] = (nota1[i] + nota2[i]) / 2;
			
				if(media[i] >= 6){
					System.out.println(aluno[i] + "          " + nota1[i] + "       " + nota2[i] + "       " + media[i] + "       APROVADO");
					contadorAprovado++;
				}
				else if(media[i] < 6 && media[i] >= 3){
					System.out.println(aluno[i] + "          " + nota1[i] + "       " + nota2[i] + "       " + media[i] + "     RECUPERACAO");
					contadorRecuperacao++;
				}
				else{
					System.out.println(aluno[i] + "         " + nota1[i] + "        " + nota2[i] + "       " + media[i] + "       REPROVADO");
					contadorReprovado++;
				}
			}
		
			//Maior, Menor media e a Media da turma
			for(int i = 0; i < qtdAlunos; i++){//maior media
				if(media[i] > maior){
					maior = media[i];
				}
			}
		
			for(int i = 0; i < qtdAlunos; i++){//menor media
				if(media[i] < menor){
					menor = media[i];
				}
			}
		
			for(int i = 0; i < qtdAlunos; i++){//media da sala
			somaMedia += media[i];
			}
		
			mediaDaSala = somaMedia / qtdAlunos;
		
			System.out.println();
		
			System.out.println("A maior media da sala foi ---> " + maior);
			System.out.println("A menor media da sala foi ---> " + menor);
			System.out.println("A media da sala foi ---> " + mediaDaSala);
		
			System.out.println();
		
			System.out.println("Aprovado ---> " + contadorAprovado);
			System.out.println("Recuperacao ---> " + contadorRecuperacao);
			System.out.println("Reprovado ---> " + contadorReprovado);
			
			System.out.println();
			
			System.out.print("Deseja lancar notas de outra turma [S / N] ---> ");
			String choose = leia.next().toUpperCase();
			
			choose = choose.toUpperCase();
			
			resposta = choose.charAt(0);
			
			System.out.println();
		}while(resposta == 'S');
		
		System.out.print("Voce encerrou o programa!");
		System.exit(0);
	}
}
