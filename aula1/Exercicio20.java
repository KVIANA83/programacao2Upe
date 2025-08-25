package aula1;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

         System.out.print("Digite o primeiro número decimal: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double num2 = leitor.nextDouble();

        // Calcula o resto da divisão
        double resto = num1 % num2;

        System.out.println("O resto da divisão é: " + resto);

        leitor.close();
    }
}
