package aula1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String animal = leitor.nextLine();
        System.out.println("Você digitou o animal: " + animal);

        leitor.close();
    }
}
