import java.util.Scanner;

public class cadrever {
    /*
     * 16. Que lea una cadena
     * y la muestre al revés.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca una palabra");
        String nom = input.nextLine();

        // Recorrer desde la última posición hasta la 0
        System.out.print("Al revés: ");
        for (int i = nom.length() - 1; i >= 0; i--) {
            System.out.print(nom.charAt(i));
        }
        System.out.println();

        input.close();
    }
}
}
