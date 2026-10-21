import java.util.Scanner;

public class Buscar14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean v1 = false;

/* Algoritmo que lea una secuencia de números 
hasta que se introduzca el número 27 y posteriormente 
muestre por pantalla si leyó o no el número 14, alguna vez.
*/
        System.out.print("Introduzca un número (27 para terminar): ");
        int num = input.nextInt();

        while (num != 27) {
            if (num == 14) {
                v1 = true;
            }
            // la nueva lectura va DENTRO del while
            System.out.print("Introduzca un número (27 para terminar): ");
            num = input.nextInt();
        }

        if (v1) {
            System.out.println("Sí se introdujo el 14.");
        } else {
            System.out.println("No se introdujo el 14.");
        }
    }
}