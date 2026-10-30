import java.util.Scanner;

public class P3R {
    public static void main(String[] args) {
        /*
         * 5.)
         * Calcula los números primos entre M y N.
         * Siendo M y N números introducidos por el usuario.
         * Un número P es primo si sus únicos divisores
         * son el propio número P y 1, es decir,
         * la suma de sus divisores son P+1.
         */
        Scanner input = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int f = 0;
        do {
            System.out.println("Introduzca un número (No introduzca números negativos o iguales/menores que 1)");
            m = input.nextInt();
            System.out.println("Introduzca un número positivo (No introduzca números negativos o iguales/menores que 1)");
            n = input.nextInt();
        } while (m <= 1 || n <= 1 || m == n);
        if (m > n) {
            f = m;
            m = n;
            n = f;
        }
        System.out.println("Los números primos entre " + m + " y " + n + " son:");
        System.out.println("===================================================");
        boolean z = true;
        boolean y = true;
        y = true;
        for (int g = m; g <= n; g++) {

            z = true;
            for (int d = 2; d < g; d++) {
                if (g % d == 0) {
                    z = false;
                }
            }

            if (z) {
                if (!y) {
                    System.out.print(" , ");
                }
                System.out.print(g);
                y = false;
            }

        }

        input.close();
    }
}