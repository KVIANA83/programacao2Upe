package aula1;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();

        int idadeMeses = idade * 12;
        int idadeDias = idade * 365;
        
        System.out.println("Você já viveu aproximadamente:");
        System.out.println(idadeMeses + " meses");
        System.out.println(idadeDias + " dias");

        leitor.close();
    }
}
