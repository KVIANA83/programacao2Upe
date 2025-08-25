package aula1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n2. Digite sua idade (em texto): ");
        String idadeTexto = leitor.nextLine();
        int idade = Integer.parseInt(idadeTexto);
        System.out.println("Sua idade em número é: " + idade);

        leitor.close();
    }
}
