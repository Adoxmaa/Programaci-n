import java.util.Scanner;

public class cmayus {
// 18. Que lea una cadena y diga cuantas mayúsculas hay.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cad = "";
        int cont = 0;
        System.out.println("Introduzca una cadena");
        cad = input.nextLine();

        for (int i = 0; i < cad.length(); i++) {
            int  c = cad.charAt(i);
            if (c>=65 && c<=90) {
                cont++;
            }

        }
        System.out.println();
        System.out.println("Tiene " + cont + " mayusculas");
    }
}

