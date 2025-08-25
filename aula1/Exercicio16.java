package aula1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();

        if (nome.length() > 5) {
            System.out.println("Seu nome tem mais de 5 caracteres.");
        } else {
            System.out.println("Seu nome tem 5 caracteres ou menos.");
        }

        leitor.close();
    }
}
