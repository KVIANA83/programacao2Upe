package aula1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n5. Digite um número decimal: ");
        double decimal = leitor.nextDouble();
        double quadrado = Math.pow(decimal, 2);
        System.out.println("O quadrado de " + decimal + " é " + quadrado);

        leitor.close();
    }
    
}
