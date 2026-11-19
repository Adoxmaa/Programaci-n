import java.util.Scanner;

public class t5v {
    /*
     * 12. Que lea 5 números por teclado, los copie
     * a otro array multiplicados por 2 y muestre
     * el segundo array.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        System.out.println("Introduzca un número");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = input.nextInt();
        }
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i] * 2;
        }
        System.out.println("Los números son:");

        for (int i = 0; i < v2.length; i++) {

            System.out.println(v2[i]);
        }
        input.close();
    }
}
