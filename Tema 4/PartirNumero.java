import java.util.Scanner;

public class PartirNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        String numero = input.next();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion = input.nextInt();

        String parte1 = numero.substring(0, posicion - 1);
        String parte2 = numero.substring(posicion - 1);

        System.out.println("Los números partidos son el " + parte1 + " y el " + parte2);
    }
}