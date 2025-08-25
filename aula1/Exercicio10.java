package aula1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();
        System.out.println("Seu nome invertido: " + sobrenome + ", " + nome);

        leitor.close();
    }
}
