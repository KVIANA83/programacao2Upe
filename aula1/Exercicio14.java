package aula1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu estado civil (solteiro, casado, divorciado, viúvo): ");
        String estadoCivil = leitor.nextLine();

        if (estadoCivil.equalsIgnoreCase("solteiro")) {
            System.out.println("Você é solteiro(a).");

        } else if (estadoCivil.equalsIgnoreCase("casado")) {
            System.out.println("Você é casado(a).");

        } else if (estadoCivil.equalsIgnoreCase("divorciado")) {
            System.out.println("Você é divorciado(a).");

        } else if (estadoCivil.equalsIgnoreCase("viúvo")) {
            System.out.println("Você é viúvo(a).");
            
        } else {
            System.out.println("Estado civil não reconhecido.");
        }

        leitor.close();
    }
}
