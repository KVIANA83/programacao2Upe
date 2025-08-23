package aula1;

public class Operadores {
    public static void main(String[] args) {

        /*
        int a;
        int b;
        a = 10;
        b = 5;
        a = b;
        b = 7;

        System.out.println("O valor de a é: " + a);
        System.out.println("O valor de b é: " + b);
        */

        int a = 0;
        int b = 10;
        int c = a + b;
        int d = c / 5;

        System.out.println("C: "+ c);
        System.out.println("D: "+  d); 

        int e = 0;
        e++;
        System.out.println("E: "+ e);

        int f = 5 + e++;
        System.out.println("F: " + f);
    }
}
