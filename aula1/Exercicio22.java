package aula1;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numeroStr = leitor.nextLine();

        int numero = Integer.parseInt(numeroStr);  // Converte para int
        int resultado = numero + 10;               // Soma 10

        String resultadoStr = Integer.toString(resultado);  // Converte para string

        System.out.println("Resultado: " + resultadoStr);

        leitor.close();
    }
}
