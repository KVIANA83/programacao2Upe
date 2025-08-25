package aula1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = leitor.nextDouble();

        System.out.print("Digite seu peso (em kg, ex: 70.5): ");
        double peso = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        leitor.close();
    }
    
}
