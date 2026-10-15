import java.util.Scanner;

public class InsertarDigito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        String numero = input.next();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = input.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        char digito = input.next().charAt(0);

        String resultado = numero.substring(0, posicion - 1)
                         + digito
                         + numero.substring(posicion - 1);

        long numeroResultante = Long.parseLong(resultado);
        System.out.println("El número resultante es " + numeroResultante);
    }
}