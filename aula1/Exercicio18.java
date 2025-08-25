package aula1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        System.out.print("Digite a base do retângulo: ");
        double base = leitor.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = leitor.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
        leitor.close();
    }
}
