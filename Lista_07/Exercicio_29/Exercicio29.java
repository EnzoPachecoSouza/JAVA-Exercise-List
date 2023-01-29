//Enzo Pacheco de Oliveira Souza - 2º ADS

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Criptografar");
            System.out.println("2. Descriptografar");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Scanner scannerCriptografia = new Scanner(System.in);
                    System.out.println("Digite a frase a ser criptografada: ");
                    String fraseParaCriptografar = scannerCriptografia.nextLine();
                    String resultadoCriptografia = criptografarOuDescriptografar(fraseParaCriptografar);
                    System.out.println("O resultado criptografado é \"" + resultadoCriptografia + "\"");
                    break;
                case 2:
                    Scanner scannerDescriptografia = new Scanner(System.in);
                    System.out.println("Digite a frase a ser descriptografada: ");
                    String fraseParaDescriptografar = scannerDescriptografia.nextLine();
                    String resultadoDescriptografia = criptografarOuDescriptografar(fraseParaDescriptografar);
                    System.out.println("O resultado descriptografado é \"" + resultadoDescriptografia + "\"");
                    break;
                case 3:
                    System.out.println("O sistema será encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static String criptografarOuDescriptografar(String frase) {
        //
        Map<Character, Character> zenitPolar = new HashMap<>();
        zenitPolar.put('z', 'p');
        zenitPolar.put('e', 'o');
        zenitPolar.put('n', 'l');
        zenitPolar.put('i', 'a');
        zenitPolar.put('t', 'r');
        zenitPolar.put('p', 'z');
        zenitPolar.put('o', 'e');
        zenitPolar.put('l', 'n');
        zenitPolar.put('a', 'i');
        zenitPolar.put('r', 't');
        //
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letraAtual = frase.toLowerCase().charAt(i);
            if (zenitPolar.containsKey(letraAtual)) {
                char letraParaTrocar = zenitPolar.get(letraAtual);
                resultado.append(letraParaTrocar);
            } else {
                resultado.append(letraAtual);
            }
        }
        return resultado.toString();
    }
}
