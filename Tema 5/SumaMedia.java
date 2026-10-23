import java.util.Scanner;

public class SumaMedia {
    public static void main(String[] args) {
/*
    Programa que lea números reales positivos, mientras 
    no se introduzca un cero y muestre la suma y la media 
    aritmética de los números introducidos.
*/
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int contador=0;
        int media=0;
        System.out.println("Introduzca el número que desee sumar (Escriba 0 cuando desee terminar)");
        int n = input.nextInt();

        while (n != 0) {
            suma += n;
            System.out.println("Introduzca el número que desee sumar (Escriba 0 cuando desee terminar)");
            n = input.nextInt();
            contador++;
            media= suma/contador;
        }

        System.out.println("La suma final es " + suma + " y la media es " + media);
        input.close();
    }
}