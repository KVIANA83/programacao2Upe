import java.util.Scanner;

public class ExemploElse {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = leitor.nextInt();

        if (valor > 10) {
            System.out.println("O valor é maior que 10");
        } else {
            System.out.println("O valor é menor ou igual a 10");
        }
    }
}
