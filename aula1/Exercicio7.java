package aula1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Seu nome completo: " + nomeCompleto);

        leitor.close();
    }   
}
