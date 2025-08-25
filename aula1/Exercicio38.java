package aula1;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n1 = leitor.nextDouble();

        System.out.println("Digite outro número: ");
        double n2 = leitor.nextDouble();

        System.out.println("Digite mais um número:");
        double n3 = leitor.nextDouble();

        double resultado = (n1 + n2) * n3;
        System.out.println("O resultado é: " + resultado);

        leitor.close();

    }
}
