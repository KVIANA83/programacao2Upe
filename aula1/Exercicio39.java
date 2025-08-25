package aula1;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        leitor.close();
    }
}
