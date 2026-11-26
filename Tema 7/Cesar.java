import java.util.Scanner;

public class Cesar {
    /*
     * 19. El cifrado del cesar: Lea una cadena
     * y la encripte sumando 3 al código ASCII de
     * cada carácter. Mostrar por pantalla.
     * Crea un método para encriptar y otro para
     * desencripta
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cad = "";

        int men = -1;
        int i = 0;
        char t;

        System.out.println("Introduza una cadena");
        cad = input.nextLine();
        int[] sombra = new int[cad.length()];
        char[] c = new char[cad.length()];
        while (men != 0) {
            System.out.println(
                    "Que desea hacer con la cadena (Introduzca solamente el número del deseado)\n 1)Encriptar\n 2)Desencriptar");
            men = input.nextInt();

            switch (men) {
                case (1):
                    for (i = 0; i < cad.length(); i++) {
                        char h = cad.charAt(i);
                        sombra[i] = (int) h + 3;
                    }
                    System.out.println("Su encriptación es:");
                    for (i = 0; i < cad.length(); i++) {
                        System.out.print(sombra[i]);

                    }
                    System.out.println();
                    System.out.println();
                    break;

                case (2):
                    for (i = 0; i < sombra.length; i++) {
                        c[i] = (char) (sombra[i] - 3);

                    }

                    System.out.println("Su desencriptación es:");
                    for (i = 0; i < c.length; i++) {
                        System.out.print(c[i]);
                    }
                    System.out.println();
                    break;

                case (0):
                    System.out.println("Abandonar");
                    break;

                default:
                    System.out.println("Introduzca una opción valida");
            }
        }
    }
}