import java.util.Scanner;

public class A20nc {
    /*
     * 15. Que rellene un array con 20 números
     * y luego busque un número concreto.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[20];

        // Leer los 20 números
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca el número " + (i + 1) + ":");
            num[i] = input.nextInt();
        }

        // Pedir el número a buscar
        System.out.println("Introduzca el número que desea buscar:");
        int buscado = input.nextInt();

        // Búsqueda secuencial
        int posicion = -1;   // -1 significa "no encontrado"
        for (int i = 0; i < num.length; i++) {
            if (num[i] == buscado) {
                posicion = i;
                break;       // para en la primera coincidencia
            }
        }

        // Mostrar el resultado
        if (posicion == -1) {
            System.out.println("El número " + buscado + " no está en el array.");
        } else {
            System.out.println("El número " + buscado + " está en la posición: " + posicion);
        }

        input.close();
    }
}
