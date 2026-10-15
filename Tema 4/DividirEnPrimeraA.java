import java.util.Scanner;

public class DividirEnPrimeraA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca una palabra: ");
        String palabra = input.next();

        int k = palabra.toLowerCase().indexOf('a');

        if (k == -1) {
            System.out.println("La palabra no contiene ninguna A.");
        } else {
            String antes = palabra.substring(0, k);
            String desdeA = palabra.substring(k);
            System.out.println("Antes de la A: " + antes);
            System.out.println("Desde la A: " + desdeA);
        }
    }
}