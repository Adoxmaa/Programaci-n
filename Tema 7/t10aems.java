import java.util.Scanner;

public class t10aems {
    /*
     * 7. Que lea 10 números por teclado,
     * los almacene en un array y muestre la suma, resta,
     * multiplicación y división de todos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];

        // Leer los 10 números
        for (int j = 0; j < num.length; j++) {
            System.out.println("Introduzca el número " + (j + 1) + ":");
            num[j] = input.nextInt();
        }

        // Los cuatro resultados empiezan con el primer número
        // (la multiplicación y la división también)
        int suma = num[0];
        int resta = num[0];
        long multiplicacion = num[0];
        double division = num[0];

        // Recorrer desde el segundo número (hueco 1)
        for (int j = 1; j < num.length; j++) {
            suma = suma + num[j];
            resta = resta - num[j];
            multiplicacion = multiplicacion * num[j];
            if (num[j] != 0) {
                division = division / num[j];
            }
        }

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);

        input.close();
    }
}
