import java.util.Scanner;

public class t10fa {
    public static void main(String[] args) {
        /*
         * 10. Que lea 10 números por teclado,
         * los almacene en un array y los
         * ordene de formaascendente.
         */

        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Introduzca un número");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = 9; j >= 0; j--) {
                if (num[j] > num[i]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            System.out.println(num[i]);
        }
        input.close();
    }
}
