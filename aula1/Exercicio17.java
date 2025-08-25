package aula1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = leitor.nextInt();

        System.out.println("Digite mais um número: ");
        int n2 = leitor.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (n1 < n2) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        leitor.close();
    }
}
