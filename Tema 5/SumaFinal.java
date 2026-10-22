import java.util.Scanner;

public class SumaFinal {
    public static void main(String[] args) {
        /*
        6. Escribe un programa que sume números
        enteros introducidos por el usuario hasta que
        escriba 0. Muestra la suma final.
        */
        Scanner input = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduzca el número que desee sumar (Escriba 0 cuando desee terminar)");
        int n = input.nextInt();

        while (n != 0) {
            suma += n;
            System.out.println("Introduzca el número que desee sumar (Escriba 0 cuando desee terminar)");
            n = input.nextInt();
        }

        System.out.println("La suma final es " + suma);
        input.close();
    }
}