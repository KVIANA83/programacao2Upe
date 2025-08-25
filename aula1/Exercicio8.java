package aula1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite números separados por espaço: ");
        String entrada = leitor.nextLine();

        // Divide a String por espaços
        String[] numeros = entrada.trim().split("\\s+");

        // Conta os elementos
        int quantidade = numeros.length;
        System.out.println("Você digitou " + quantidade + " números.");

        leitor.close();
    }
    
}
