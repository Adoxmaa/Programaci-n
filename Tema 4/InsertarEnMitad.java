import java.util.Scanner;

public class InsertarEnMitad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca una cadena de caracteres: ");
        String cadena = input.nextLine();

        int mitad = cadena.length() / 2;

        String resultado = cadena.substring(0, mitad) + "<>" + cadena.substring(mitad);

        System.out.println("Resultado: " + resultado);
    }
}