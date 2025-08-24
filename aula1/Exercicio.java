package aula1;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        exercicio1(leitor);
        exercicio2(leitor);
        exercicio3(leitor);
        exercicio4(leitor);
        exercicio5(leitor);

        
        leitor.close();
    }

    public static void exercicio1(Scanner leitor) {
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + "!");
    }

    public static void exercicio2(Scanner leitor) {
        System.out.println(\"\n2Digite sua idade (em texto): ");
        String idadeTexto = leitor.nextLine();
        int idade = Integer.parseInt(idadeTexto);
        System.out.println("Sua idade em número é: " + idade);
    }

    public static void exercicio3(Scanner leitor) {
        System.out.print("\n3. Digite um número inteiro: ");
        int inteiro = leitor.nextInt();
        float convertido = (float) inteiro;
        System.out.println("Convertido para decimal: " + convertido);
    }

    public static void exercicio4(Scanner leitor) {
        System.out.print("\n4. Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }

    public static void exercicio5(Scanner leitor) {
        System.out.print("\n5. Digite um número decimal: ");
        double decimal = leitor.nextDouble();
        double quadrado = Math.pow(decimal, 2);
        System.out.println("O quadrado de " + decimal + " é " + quadrado);
    }

    // Continuar os métodos dos exercícios 6 ao 39 da mesma forma.
}
