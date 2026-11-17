import java.util.Scanner;

public class t10m {
    public static void main(String[] args) {
        /*
         * 9. Que lea 10 números por teclado,
         * los almacene en un array y muestre la media.
         */

        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int suma = 0;

        // Leer los 10 números y sumarlos
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca el número " + (i + 1) + ":");
            num[i] = input.nextInt();
            suma = suma + num[i];
        }

        // Calcular y mostrar la media
        double media = suma / 10.0;
        System.out.println("La media es: " + media);

        input.close();
    }
}
