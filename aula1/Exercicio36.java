package aula1;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = leitor.nextDouble();

        System.out.print("Digite a cotação do dólar (1 US$ em R$): ");
        double cotacaoDolar = leitor.nextDouble();

        double valorEmDolares = valorReais / cotacaoDolar;

        System.out.printf("O valor em dólares é: US$ %.2f%n", valorEmDolares);

                leitor.close();
            }
        }