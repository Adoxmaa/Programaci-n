import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Datos de entrada
        System.out.println("Introducir una palabra");
        String p = input.next();

        /* Lea los caracteres de una cadena
           y nos muestre el número de vocales. */
        int contador = 0;
        int i = 0;
        while (i < p.length()) {
            char c = Character.toLowerCase(p.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
            i++;
        }

        System.out.println("El número de vocales es " + contador);
        input.close();
    }
}