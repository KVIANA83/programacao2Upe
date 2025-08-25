package aula1;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = leitor.nextDouble();

        int numeroInteiro = (int) numeroDecimal;  // Conversão explícita (cast)

        System.out.println("O número inteiro é: " + numeroInteiro);
        leitor.close();
    }
    
}
