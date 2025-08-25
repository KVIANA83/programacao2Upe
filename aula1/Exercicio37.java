package aula1;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double numero = leitor.nextDouble();

        long numeroRedondo = Math.round(numero);

        System.out.println("Número arredondado: " + numeroRedondo);
        leitor.close();
    }
}