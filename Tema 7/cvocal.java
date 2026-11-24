import java.util.Scanner;

public class cvocal {
    // 17. Que lea una cadena y diga cuantas vocales hay.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cad = "";
        int cont = 0;
        System.out.println("Introduzca una cadena");
        cad = input.nextLine();

        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }

        }
        System.out.println();
        System.out.println("Tiene " + cont + " vocales");
    }
}
