public class primos100a {
    /*
     * 5. Escribe un programa que rellene un array con los números primos comprendidos
     * entre 1 y 100 y los muestre en pantalla en orden ascendente. Crea un método que
     * indique si un número entero es primo o no lo es
     */

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] primos = new int[25];
        int pos = 0;   

        for (int n = 1; n <= 100; n++) {
            if (esPrimo(n)) {
                primos[pos] = n;
                pos++;
            }
        }

        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
    }
}