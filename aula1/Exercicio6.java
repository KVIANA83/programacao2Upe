package aula1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = leitor.nextInt();
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos.");

        leitor.close();
    }
}
