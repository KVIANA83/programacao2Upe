import java.util.Scanner;

public class ExemploElseIf {
     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = leitor.nextInt();

        if (valor > 10) {
            System.out.println("O valor é maior que 10");
        } else if (valor > 5) {
            System.out.println("O valor é maior que 5 e menor ou igual a 10");
        } else if (valor > 0) {
            System.out.println("O valor é maior que 0 e menor ou igual a 5");
        } else {
            System.out.println("Digite um valor válido!");
        }
    }
    
}
