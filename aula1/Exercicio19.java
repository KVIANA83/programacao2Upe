package aula1;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       System.out.print("Digite o nome da sua cidade: ");
        String cidade = leitor.nextLine();

        // Verifica se começa com 'S' ou 's'
        if (!cidade.isEmpty() && Character.toUpperCase(cidade.charAt(0)) == 'S') {
            System.out.println("A cidade começa com a letra 'S'.");
            
        } else {
            System.out.println("A cidade não começa com a letra 'S'.");
        }

        leitor.close();
    }
}
