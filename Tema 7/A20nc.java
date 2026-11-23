import java.util.Scanner;

public class A20nc {
    /*
     * 15. Que rellene un array con 20 números
     * y luego busque un número concreto.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[20];

        System.out.println("Introduzca un número");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("Introduzca el número que deseé buscar");
        int num2 = input.nextInt();

        System.out.println("El número esta en la posición: " + java.util.Arrays.binarySearch(num, num2));
        input.close();
    }
}
