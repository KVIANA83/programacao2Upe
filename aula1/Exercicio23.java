package aula1;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = leitor.nextLine();

        // Dividindo a string usando "/"
        String[] partes = data.split("/");

        // Convertendo para inteiros
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        leitor.close(); 
    }
    
}
