import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        /*
         * 14. Que mediante un array almacene números tanto positivos como negativos y
         * los muestre ordenados.
         */
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int temp;

        // Leer los números
        System.out.println("Introduzca números positivos y negativos");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número " + (i + 1) + ":");
            num[i] = input.nextInt();
        }

        // Ordenar de menor a mayor (burbuja)
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Mostrar el array ordenado
        System.out.println("Números ordenados:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        input.close();
    }
}
