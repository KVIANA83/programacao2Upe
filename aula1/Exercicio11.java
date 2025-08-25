package aula1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = leitor.nextLine();

        int tamanho = texto.length();

        System.out.println("O tamanho da string digitada é: " + tamanho + " caracteres.");

        leitor.close();
    }
    
}
