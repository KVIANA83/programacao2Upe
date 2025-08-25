package aula1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n3. Digite um número inteiro: ");
        int inteiro = leitor.nextInt();
        float convertido = (float) inteiro;
        System.out.println("Convertido para decimal: " + convertido);

        leitor.close();
    }
}
